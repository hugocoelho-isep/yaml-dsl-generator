package pt.isep.yamldslgen.xtext.ide.contentassist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

/**
 * Keyword filter shared by the Eclipse UI ({@code MyDslProposalProvider}) and the
 * LSP/{@code .ide} ({@code MyDslIdeContentProposalProvider}) content-assist paths.
 *
 * <p><b>The two signals it combines.</b> At a nested caret the unordered-group
 * grammar lets the current block end, so Xtext offers the union of the current
 * block's keys and the enclosing block's keys. To keep only the keys of the block
 * the caret is actually editing the filter combines:
 *
 * <ul>
 *   <li><b>The caret's target block (by column).</b> From the semantic element of
 *       the last real token before the caret, walk up to the deepest ancestor whose
 *       block column does not exceed the caret indentation. Its {@link EClass} is
 *       the block the caret is editing (e.g. caret at column&nbsp;0 &rarr;
 *       {@code GithubActions}; under a populated {@code push:} at column&nbsp;4
 *       &rarr; {@code Push}).</li>
 *   <li><b>The keyword's declaring class (from the grammar).</b> A
 *       {@code keyword -> declaring EClass(es)} map built once from the grammar
 *       (every keyword contained in a {@link ParserRule} is associated with that
 *       rule's returned {@link EClass}). E.g. {@code jobs -> GithubActions},
 *       {@code tags -> Push, Pull_request, ...}.</li>
 * </ul>
 *
 * <p>The keyword is kept iff its declaring class can contain the target block (the
 * target class is that declaring class or a subtype). This deliberately does
 * <em>not</em> use {@code getCurrentModel()}: Xtext reports it inconsistently
 * across parse branches (e.g. it labels a top-level {@code jobs} proposal with the
 * inner {@code OnObject} as current model), so comparing against it wrongly drops
 * valid keys. The keyword's declaring class is stable; the caret column picks the
 * target block; together they are robust.
 *
 * <p>Punctuation/structural keywords ({@code ':'}, {@code '-'}, {@code '['}, &hellip;)
 * are never filtered; an unknown keyword or missing context fails open. The map is
 * derived from the grammar, so the filter needs no hard-coded keyword lists.
 *
 * <p><b>Residual bound.</b> On a completely blank, dedented line Xtext anchors the
 * proposal context at the last complete node (still inside the inner, open block),
 * so it only offers that block's keys, which the filter correctly drops --- the
 * popup is empty until the first character is typed, after which the block closes
 * and the right keys appear, narrowed. This is a property of Xtext's content-assist
 * context factory, not of the filter or the lexer. An empty block (e.g. {@code push:}
 * with no body) likewise exposes no node, so the caret resolves to the nearest
 * existing block.
 */
public class KeywordContextFilter {

	/** keyword text -> EClass(es) whose grammar rule declares it as a key. */
	private volatile Map<String, Set<EClass>> keywordToClasses;

	/**
	 * Decides whether a keyword proposal should be kept at the caret.
	 *
	 * @param keyword          the proposed grammar keyword
	 * @param currentModel     {@code context.getCurrentModel()} (anchor fallback only; may be {@code null})
	 * @param lastCompleteNode {@code context.getLastCompleteNode()} (may be {@code null})
	 * @param rootNode         {@code context.getRootNode()} (may be {@code null})
	 * @param offset           {@code context.getOffset()} (the caret offset)
	 * @return {@code true} to keep the proposal, {@code false} to suppress it
	 */
	public boolean keep(Keyword keyword, EObject currentModel, INode lastCompleteNode,
			INode rootNode, int offset) {
		if (keyword == null || !isWordKeyword(keyword.getValue()) || rootNode == null) {
			return true; // never filter punctuation / no document -> fail open
		}
		Set<EClass> declaring = ensureMap(keyword).get(keyword.getValue());
		if (declaring == null || declaring.isEmpty()) {
			return true; // not a derivable key -> fail open
		}

		String text = rootNode.getText();
		int cursorIndent = lineIndentAt(text, offset);

		// Anchor on the last real token before the caret (the deepest existing
		// content); fall back to the current model only if there is no node.
		EObject anchor = (lastCompleteNode != null)
				? NodeModelUtils.findActualSemanticObjectFor(lastCompleteNode)
				: null;
		if (anchor == null) {
			anchor = currentModel;
		}
		if (anchor == null) {
			return true; // no context -> fail open
		}

		// Target block: the deepest existing block enclosing the caret column.
		EObject targetContainer = containerForColumn(anchor, text, cursorIndent);
		if (targetContainer == null) {
			return true;
		}
		EClass targetClass = targetContainer.eClass();
		for (EClass declared : declaring) {
			if (declared.isSuperTypeOf(targetClass)) {
				return true;
			}
		}
		return false;
	}

	// --- Target block selection by caret column ------------------------------

	/**
	 * Walks up from {@code start} and returns the deepest ancestor whose block
	 * column is {@code <= cursorIndent}. Columns are non-increasing going up, so the
	 * first match in the upward walk is the deepest one.
	 */
	private EObject containerForColumn(EObject start, String text, int cursorIndent) {
		EObject fallback = null;
		for (EObject e = start; e != null; e = e.eContainer()) {
			int col = blockColumn(e, text);
			if (col < 0) {
				continue;
			}
			fallback = e;
			if (col <= cursorIndent) {
				return e;
			}
		}
		return fallback;
	}

	/**
	 * The 0-based column at which {@code e}'s block content begins, i.e. the
	 * indentation of its first non-hidden leaf (for a YAML block, the synthetic
	 * {@code BEG_BLOCK} / first child key). Returns {@code -1} when {@code e} has
	 * no node.
	 */
	private int blockColumn(EObject e, String text) {
		INode node = NodeModelUtils.getNode(e);
		if (node == null) {
			return -1;
		}
		int off = -1;
		for (ILeafNode leaf : node.getLeafNodes()) {
			if (!leaf.isHidden()) {
				off = leaf.getOffset();
				break;
			}
		}
		if (off < 0) {
			off = node.getOffset();
		}
		return off - lineStart(text, off);
	}

	// --- Text helpers --------------------------------------------------------

	/** Number of leading spaces/tabs on the caret's line, up to the offset. */
	private int lineIndentAt(String text, int offset) {
		if (text == null) {
			return 0;
		}
		int clamped = Math.min(Math.max(offset, 0), text.length());
		int start = lineStart(text, clamped);
		int n = 0;
		for (int i = start; i < clamped; i++) {
			char c = text.charAt(i);
			if (c == ' ' || c == '\t') {
				n++;
			} else {
				break;
			}
		}
		return n;
	}

	/** Offset of the start of the line containing {@code offset}. */
	private int lineStart(String text, int offset) {
		if (text == null || offset <= 0) {
			return 0;
		}
		int probe = Math.min(offset, text.length()) - 1;
		int nl = text.lastIndexOf('\n', probe);
		int cr = text.lastIndexOf('\r', probe);
		return Math.max(nl, cr) + 1;
	}

	private static boolean isWordKeyword(String kw) {
		if (kw == null || kw.isEmpty()) {
			return false;
		}
		char c = kw.charAt(0);
		return Character.isLetter(c) || c == '_';
	}

	// --- Lazy keyword -> EClass map (built from the grammar) ------------------

	private Map<String, Set<EClass>> ensureMap(Keyword anyKeyword) {
		Map<String, Set<EClass>> map = keywordToClasses;
		if (map != null) {
			return map;
		}
		synchronized (this) {
			if (keywordToClasses == null) {
				keywordToClasses = buildMap(GrammarUtil.getGrammar(anyKeyword));
			}
			return keywordToClasses;
		}
	}

	private Map<String, Set<EClass>> buildMap(Grammar grammar) {
		Map<String, Set<EClass>> map = new HashMap<>();
		if (grammar == null) {
			return map;
		}
		for (AbstractRule rule : grammar.getRules()) {
			if (!(rule instanceof ParserRule) || rule.getType() == null) {
				continue;
			}
			EClassifier classifier = rule.getType().getClassifier();
			if (!(classifier instanceof EClass)) {
				continue;
			}
			EClass eclass = (EClass) classifier;
			List<Keyword> keywords = GrammarUtil.containedKeywords(rule);
			for (Keyword kw : keywords) {
				String value = kw.getValue();
				if (isWordKeyword(value)) {
					map.computeIfAbsent(value, k -> new HashSet<>()).add(eclass);
				}
			}
		}
		return map;
	}
}

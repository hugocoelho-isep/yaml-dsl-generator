package pt.isep.yamldslgen.xtext.ui.highlighting;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.util.CancelIndicator;

/**
 * Overrides the default keyword highlighting for grammar keywords that
 * appear in free-form YAML key positions (the {@code KeyName} rule).
 *
 * <p>Xtext always tokenizes literals like {@code 'name'} or {@code 'run'}
 * as keyword tokens, giving them bold/colour styling even when they are
 * used as arbitrary YAML keys (e.g. inside a {@code with:} block).
 * This calculator detects those cases and replaces the keyword style with
 * the plain default text style so the editor renders them like any other
 * identifier.</p>
 */
public class MyDslSemanticHighlightingCalculator
        implements ISemanticHighlightingCalculator {

    @Override
    public void provideHighlightingFor(XtextResource resource,
            IHighlightedPositionAcceptor acceptor,
            CancelIndicator cancelIndicator) {

        if (resource == null || resource.getParseResult() == null) {
            return;
        }

        for (ILeafNode node : resource.getParseResult()
                .getRootNode().getLeafNodes()) {

            if (cancelIndicator.isCanceled()) {
                return;
            }

            EObject grammarElement = node.getGrammarElement();
            if (grammarElement instanceof Keyword
                    && isInsideKeyNameRule((Keyword) grammarElement)) {

                // Override keyword style → plain default text
                acceptor.addPosition(
                        node.getOffset(),
                        node.getLength(),
                        DefaultHighlightingConfiguration.DEFAULT_ID);
            }
        }
    }

    /**
     * Returns {@code true} when the keyword grammar element is directly
     * contained inside the {@code KeyName} parser rule, i.e. it is being
     * used as a YAML key in a free-form position rather than as a
     * structural keyword.
     */
    private boolean isInsideKeyNameRule(Keyword keyword) {
        EObject current = keyword.eContainer();
        while (current != null) {
            if (current instanceof AbstractRule) {
                return "KeyName".equals(((AbstractRule) current).getName());
            }
            current = current.eContainer();
        }
        return false;
    }
}	
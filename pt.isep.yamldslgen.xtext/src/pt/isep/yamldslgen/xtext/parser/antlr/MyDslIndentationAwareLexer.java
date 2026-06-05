package pt.isep.yamldslgen.xtext.parser.antlr;

  import java.util.ArrayDeque;
  import java.util.Arrays;
  import java.util.Deque;
  import java.util.HashSet;
  import java.util.Set;

  import org.antlr.runtime.CharStream;
  import org.antlr.runtime.CommonToken;
  import org.antlr.runtime.RecognizerSharedState;
  import org.antlr.runtime.Token;

  import pt.isep.yamldslgen.xtext.parser.antlr.internal.InternalMyDslLexer;

  /**
   * Indentation-aware lexer for the YAML-like DSL.
   *
   * The generated {@link InternalMyDslLexer} knows how to tokenize keywords,
   * strings, identifiers, etc., but it treats whitespace as irrelevant. In a
   * YAML-style language the amount of leading whitespace is the block structure,
   * so this subclass intercepts the token stream and injects synthetic
   * {@code BEG_BLOCK} / {@code END_BLOCK} tokens based on indentation changes.
   *
   * The grammar declares these terminals:
   *
   * <pre>
   *   terminal BEG_BLOCK: 'synthetic:BEGIN';
   *   terminal END_BLOCK: 'synthetic:END';
   * </pre>
   *
   * and uses them wherever a block would normally be delimited by braces.
   *
   * <p>On top of the indentation handling this lexer performs four YAML fix-ups
   * that the grammar alone cannot express cleanly (the grammar can't see the
   * hidden newlines, so it can't bound a multi-token value to a single line):
   *
   * <ol>
   *   <li><b>Block scalar headers</b> ('|', '>', and the chomping/keep variants
   *       '|-', '|+', '>-', '>+') arm block-scalar mode.</li>
   *   <li><b>Keyword-as-value demotion</b>: a grammar keyword token that is NOT
   *       immediately followed by ':' is a YAML value, not a key, so it is
   *       re-tagged as {@code YAML_SCALAR} (e.g. keyword array elements). This
   *       keeps the ~75 keywords out of the parser's value rules.</li>
   *   <li><b>Inline value capture</b>: the inline value after a {@code key:} is
   *       captured as a single {@code YAML_SCALAR} (plain-scalar-to-end-of-line),
   *       so values like {@code name: Build ${{ env.X }} now} or
   *       {@code run: echo "x" >> $GITHUB_ENV} parse as one value. Block scalars,
   *       arrays, quoted strings, nested blocks and boolean/int fields are left
   *       to the normal tokenizer.</li>
   *   <li><b>Keyword-as-object-id demotion</b>: inside a named collection
   *       ('jobs:', 'services:', 'secrets:') the direct children are object
   *       <em>names</em>, not fields. A child key that happens to be a grammar
   *       keyword (e.g. a job literally named {@code release}) is re-tagged as
   *       {@code YAML_SCALAR}. This keeps the object-id alphabet disjoint from
   *       the field keywords, so Job/Service/Secret can use {@code id=EString}
   *       and the content-assist parser does not blow up trying to tell a
   *       keyword id from a keyword field.</li>
   * </ol>
   *
   * <p><b>Block scalar mode</b> ('|' / '>' after a YAML key): while inside a
   * block scalar body, nested indentation changes (from if/elif/else/fi etc.)
   * are suppressed so that BlockString in the grammar always sees exactly one
   * BEG_BLOCK / END_BLOCK pair, regardless of how many nesting levels the shell
   * script contains.
   */
  public class MyDslIndentationAwareLexer extends InternalMyDslLexer {

      /** Physical indent levels currently open. Always contains at least 0. */
      private final Deque<Integer> indentStack = new ArrayDeque<>();

      /** Tokens queued for emission (synthetic BEG/END, or EOF). */
      private final Deque<Token> pending = new ArrayDeque<>();

      /** True when the next real token is the first on its line. */
      private boolean atLineStart = true;

      /** True for the very first real token of the current line. */
      private boolean firstContentOfLine = true;

      /** Indent of the next line, extracted from the most recent WS token text. */
      private int pendingIndent = -1;

      /** Guards the EOF-flush so we do it exactly once. */
      private boolean eofProcessed = false;

      // --- Block scalar mode ---------------------------------------------------
      // Phase 1: awaitingBlockScalar=true  -> the next indent increase opens the block.
      // Phase 2: insideBlockScalar=true    -> suppress nested BEG/END injections
      //          until indent drops below blockScalarBaseIndent.

      private boolean awaitingBlockScalar = false;
      private boolean insideBlockScalar   = false;
      private int     blockScalarBaseIndent = -1;

      // --- Inline value capture ------------------------------------------------
      /** Armed right after a structural ':' (key-value separator). */
      private boolean captureValueExpected = false;

      /** Text of the previous real (non-WS) token; used to find the key before ':'. */
      private String prevRealText = null;

      /** Column of the previous real token; used to find the key column before ':'. */
      private int prevRealColumn = 0;

      /** Column of the key that armed the current capture (for fold detection). */
      private int captureKeyColumn = 0;

      /** Flow-array nesting depth ('[' / ']'); capture is disabled inside arrays. */
      private int arrayDepth = 0;

      // --- Named-collection context (object ids vs fields) ---------------------
      /** Armed when a NAMED_COLLECTION_KEYS key's ':' is seen; the next opened
       *  block is the body of a named collection (its children are object ids). */
      private boolean nextBlockIsNamedCollection = false;

      /** Indent levels whose direct keys are object ids (job/service/secret names). */
      private final Set<Integer> namedCollectionLevels = new HashSet<>();

      /** Keys whose value is boolean/int (need the typed token, not a scalar). */
      private static final Set<String> NON_SCALAR_VALUE_FIELDS = new HashSet<>(Arrays.asList(
          "required", "cancel-in-progress", "continue-on-error",
          "fail-fast", "timeout-minutes", "max-parallel"
      ));

      /** Container keys whose direct children are object ids, not fields. A keyword
       *  appearing as one of these ids is demoted to YAML_SCALAR. Add a new DSL's
       *  collection keys (e.g. Docker Compose 'services', Ansible 'tasks') here. */
      private static final Set<String> NAMED_COLLECTION_KEYS = new HashSet<>(Arrays.asList(
          "jobs", "services", "secrets"
      ));

      // --- Reserved keywords (must mirror the grammar) ------------------------
      // A token whose text is one of these is a grammar keyword. In value
      // position (not followed by ':') it is re-tagged as YAML_SCALAR.
      private static final Set<String> RESERVED_KEYWORDS = new HashSet<>(Arrays.asList(
          "name", "on", "concurrency", "defaults", "jobs", "permissions", "env",
          "branch_protection_rule", "push", "pull_request", "pull_request_target",
          "schedule", "workflow_dispatch", "workflow_call", "release", "merge_group",
          "issues", "branches", "tags", "types", "cron", "inputs", "description",
          "default", "required", "type", "secrets", "group", "cancel-in-progress",
          "url", "contents", "security-events", "actions", "pages", "id-token",
          "pull-requests", "packages", "models", "checks", "runs-on", "needs", "if",
          "uses", "environment", "strategy", "container", "services", "outputs",
          "steps", "with", "image", "ports", "id", "run", "working-directory",
          "shell", "continue-on-error", "timeout-minutes", "fail-fast", "max-parallel",
          "matrix", "include", "exclude", "os", "build-type", "c-compiler",
          "cpp-compiler", "otp", "elixir", "node-version", "cache", "python-version",
          "configuration", "digests", "r-version", "ruby-version"
      ));

      // -------------------------------------------------------------------------

      public MyDslIndentationAwareLexer() {
          super();
          indentStack.push(0);
      }

      public MyDslIndentationAwareLexer(CharStream input) {
          super(input);
          indentStack.push(0);
      }

      public MyDslIndentationAwareLexer(CharStream input, RecognizerSharedState state) {
          super(input, state);
          indentStack.push(0);
      }

      /**
       * Called by ANTLR when the lexer is reused for another document. Clearing
       * our fields here avoids carrying over indent state between parses.
       */
      @Override
      public void reset() {
          super.reset();
          indentStack.clear();
          indentStack.push(0);
          pending.clear();
          atLineStart = true;
          firstContentOfLine = true;
          pendingIndent = -1;
          eofProcessed = false;
          awaitingBlockScalar = false;
          insideBlockScalar   = false;
          blockScalarBaseIndent = -1;
          captureValueExpected = false;
          prevRealText = null;
          prevRealColumn = 0;
          captureKeyColumn = 0;
          arrayDepth = 0;
          nextBlockIsNamedCollection = false;
          namedCollectionLevels.clear();
      }

      @Override
      public Token nextToken() {
          // (1) Drain any queued synthetic tokens first.
          if (!pending.isEmpty()) {
              return pending.pollFirst();
          }

          // (1b) After a structural ':' , capture the inline value (rest of the
          //      line) as a single YAML_SCALAR. Returns null for block scalars,
          //      arrays, quoted strings, comments and nested blocks, in which
          //      case we fall through to the normal logic.
          if (captureValueExpected) {
              captureValueExpected = false;
              if (!insideBlockScalar) {
                  Token captured = tryCaptureValue();
                  if (captured != null) {
                      firstContentOfLine = false;
                      prevRealText = captured.getText();
                      prevRealColumn = captured.getCharPositionInLine();
                      return captured;
                  }
              }
          }

          // (2) At line start, apply the indent measurement we stashed from the
          //     last line-break WS. On the very first call, fall back to peeking
          //     the stream (nothing has been consumed yet, so it's safe).
          //     Comment-only lines have no structural role in YAML, so they are
          //     ignored for indentation — otherwise a deep-indented trailing
          //     comment would open a spurious block.
          if (atLineStart) {
              atLineStart = false;
              if (atCommentLine()) {
                  pendingIndent = -1;
              } else {
                  int indent = pendingIndent >= 0 ? pendingIndent : peekLeadingSpaces();
                  pendingIndent = -1;
                  if (indent >= 0) {
                      handleIndentChange(indent);
                  }
              }
              if (!pending.isEmpty()) {
                  return pending.pollFirst();
              }
          }

          // (3) Delegate to the generated lexer.
          Token t = super.nextToken();
          if (t == null) {
              return null;
          }

          // (4) EOF: flush all still-open blocks, then let EOF through.
          if (t.getType() == Token.EOF && !eofProcessed) {
              eofProcessed = true;
              // If EOF arrives while inside a block scalar, close it cleanly.
              if (insideBlockScalar) {
                  insideBlockScalar = false;
                  blockScalarBaseIndent = -1;
                  indentStack.pop();
                  pending.addLast(makeSynthetic(RULE_END_BLOCK, "<END_BLOCK>"));
              }
              while (indentStack.size() > 1) {
                  Integer popped = indentStack.pop();
                  namedCollectionLevels.remove(popped);
                  pending.addLast(makeSynthetic(RULE_END_BLOCK, "<END_BLOCK>"));
              }
              pending.addLast(t);
              return pending.pollFirst();
          }

          // (5) WS / multi-line comment with newline = line break. Stash the
          //     next line's indent (read from the token text, not the stream).
          if (isLineBreakToken(t)) {
              atLineStart = true;
              firstContentOfLine = true;
              pendingIndent = indentFromWsText(t.getText());
              return t;
          }

          // (6) Real content token.
          boolean wasFirstOfLine = firstContentOfLine;
          firstContentOfLine = false;

          // (6a) Keyword in value position (NOT followed by ':') is a YAML value,
          //      not a key -> re-tag as YAML_SCALAR. Mostly catches keyword array
          //      elements (e.g. 'types: [opened, closed]'); most inline values
          //      are handled earlier by the capture in (1b).
          if (!insideBlockScalar
                  && t instanceof CommonToken
                  && RESERVED_KEYWORDS.contains(t.getText())
                  && !nextSignificantIsColon()) {
              ((CommonToken) t).setType(RULE_YAML_SCALAR);
          }

          // (6a'') Keyword used as an OBJECT ID inside a named collection
          //        ('jobs:'/'services:'/'secrets:') -> it is a name, not a field,
          //        so re-tag as YAML_SCALAR. This keeps the id alphabet disjoint
          //        from the field keywords (Job/Service/Secret use id=EString),
          //        which is what prevents the content-assist ambiguity explosion.
          //        Condition: first token of its line, at a named-collection
          //        indent level, a grammar keyword, and followed by ':'.
          if (!insideBlockScalar
                  && wasFirstOfLine
                  && t instanceof CommonToken
                  && RESERVED_KEYWORDS.contains(t.getText())
                  && namedCollectionLevels.contains(indentStack.peek())
                  && nextSignificantIsColon()) {
              ((CommonToken) t).setType(RULE_YAML_SCALAR);
          }

          // (6a') Inside a block scalar body everything is raw shell. BlockString's
          //       content list accepts YAML_SCALAR but not SQ_STRING, keywords or
          //       true/false, so re-tag those as YAML_SCALAR (e.g. single-quoted
          //       paths like 'pushd ./x', or a shell word that happens to be a
          //       grammar keyword).
          if (insideBlockScalar && t instanceof CommonToken) {
              String bt = t.getText();
              if (t.getType() == RULE_SQ_STRING
                      || RESERVED_KEYWORDS.contains(bt)
                      || "true".equals(bt) || "false".equals(bt)) {
                  ((CommonToken) t).setType(RULE_YAML_SCALAR);
              }
          }

          // (6b) Track the previous real token, flow-array depth, and arm value
          //      capture when a structural ':' follows a non-boolean/int key.
          //      Also arm the named-collection context when the key is one of
          //      jobs/services/secrets.
          int tt = t.getType();
          if (tt != RULE_WS && tt != RULE_ML_COMMENT) {
              String txt = t.getText();
              if ("[".equals(txt)) {
                  arrayDepth++;
              } else if ("]".equals(txt)) {
                  if (arrayDepth > 0) {
                      arrayDepth--;
                  }
              } else if (":".equals(txt)
                      && !insideBlockScalar
                      && arrayDepth == 0
                      && prevRealText != null) {
                  if (!NON_SCALAR_VALUE_FIELDS.contains(prevRealText)) {
                      captureValueExpected = true;
                      captureKeyColumn = prevRealColumn;
                  }
                  if (NAMED_COLLECTION_KEYS.contains(prevRealText)) {
                      nextBlockIsNamedCollection = true;
                  }
              }
              prevRealText = txt;
              prevRealColumn = t.getCharPositionInLine();
          }

          // (7) Detect YAML block scalar indicators ('|', '>', '|-', '|+', '>-', '>+').
          //     Only arm the flag when outside an existing block scalar so that
          //     pipes/redirects inside shell scripts are ignored.
          if (!insideBlockScalar) {
              if (isBlockScalarHeader(t.getText())) {
                  awaitingBlockScalar = true;
              }
          }

          // (8) Dash at start of a line: opens a virtual block for the item's
          //     content (grammar expects `'-' BEG_BLOCK ...`). The content starts
          //     after the dash AND any spaces following it ('- name' vs
          //     '-   name'), so measure the real column instead of assuming a
          //     single space.
          //     Skip inside a block scalar body (e.g. '-D...' flags in 'run: >').
          if (wasFirstOfLine && !insideBlockScalar && "-".equals(t.getText())) {
              int spaces = 0;
              while (true) {
                  int la = input.LA(1 + spaces);
                  if (la == ' ' || la == '\t') {
                      spaces++;
                  } else {
                      break;
                  }
              }
              int virtualIndent = t.getCharPositionInLine() + 1 + spaces;
              indentStack.push(virtualIndent);
              pending.addLast(makeSynthetic(RULE_BEG_BLOCK, "<BEG_BLOCK>"));
          }

          return t;
      }

      // --- Inline value capture ------------------------------------------------

      /**
       * Captures the inline value after a structural ':' as a single YAML_SCALAR
       * (YAML plain-scalar: from the first non-space char to end of line, or to a
       * ' #' comment). Returns {@code null} -- letting normal tokenization take
       * over -- when the value is NOT a plain inline scalar:
       *
       * <ul>
       *   <li>'|' / '>'  -> block scalar</li>
       *   <li>'['        -> flow array</li>
       *   <li>'"' / '\'' -> quoted string (kept as STRING / SQ_STRING)</li>
       *   <li>'#'        -> comment-only (no value)</li>
       *   <li>newline/EOF-> empty value or a nested block on the next line</li>
       * </ul>
       *
       * Reads directly from the input stream; it stops at the newline (or the
       * comment), which is where {@link #nextToken()} resumes.
       */
      private Token tryCaptureValue() {
          // Skip the spaces/tabs between ':' and the value.
          int c = input.LA(1);
          while (c == ' ' || c == '\t') {
              input.consume();
              c = input.LA(1);
          }

          // A comment right after ':'. Two cases:
          //   - block-valued key with a trailing note (e.g. 'with: # optional'):
          //     a more-indented block follows on the next line, so return null
          //     and let the BEG_BLOCK open the block normally.
          //   - genuinely empty scalar value (e.g. 'cloud-account-id: # empty'):
          //     no deeper block follows, so emit a zero-length scalar to keep the
          //     key's value=EString from being left value-less.
          if (c == '#') {
              if (blockFollowsAfterComment()) {
                  return null;
              }
              return makeSynthetic(RULE_YAML_SCALAR, "");
          }

          // Block scalar with an explicit indentation indicator ('|2-', '>3',
          // '|-2', ...). Because of the digit it tokenizes as a single
          // YAML_SCALAR instead of a '|'/'>' keyword, so the grammar's
          // BlockString rule can't open it. Capture the whole block body here as
          // one YAML_SCALAR (a valid EString). Plain headers ('|', '>', '|-',
          // ...) are left to the keyword + indentation path.
          if ((c == '|' || c == '>') && blockHeaderHasDigit()) {
              return captureExplicitIndentBlock();
          }

          if (c == CharStream.EOF || c == '|' || c == '>'
                  || c == '[' || c == '"' || c == '\'') {
              return null;
          }

          // Inline value is empty (':' immediately followed by a newline). The value
          // may be a bare multi-line PLAIN SCALAR whose lines sit on the next, more
          // indented rows (no '|' or '>'), e.g. a 'run:' script or a SonarCloud
          // 'args:' list:
          //   run:                 args:
          //     cargo clippy         -Dsonar.projectKey=
          //     --all-features       -Dsonar.organization=
          // Distinguish that from a nested mapping/sequence by inspecting the first
          // real child line (see plainScalarBlockFollows). This works for arbitrary
          // keys (action inputs, etc.), not just a fixed set. If it is a plain
          // scalar, advance past the blank/comment-only lines up to it and fall
          // through to the capture + continuation-fold below; otherwise return null
          // so the BEG_BLOCK opens the block as before.
          if (c == '\n' || c == '\r') {
              if (!plainScalarBlockFollows()) {
                  return null;
              }
              // Advance to the first real content character, skipping line breaks,
              // indentation, and comment-only lines.
              while (true) {
                  int la = input.LA(1);
                  if (la == '\n' || la == '\r' || la == ' ' || la == '\t') {
                      input.consume();
                  } else if (la == '#') {
                      while (input.LA(1) != CharStream.EOF
                              && input.LA(1) != '\n' && input.LA(1) != '\r') {
                          input.consume();
                      }
                  } else {
                      break;
                  }
              }
          }

          int startIndex = input.index();
          int startLine  = input.getLine();
          int startCol   = input.getCharPositionInLine();

          StringBuilder sb = new StringBuilder();
          appendLine(sb);

          // Fold YAML plain-scalar continuation lines: a following line indented
          // MORE than the key continues the same scalar (joined with a space),
          // e.g. a multi-line 'run: npx eslint .  --config ...  --ext ...'.
          while (true) {
              int off = 1;
              int d = input.LA(off);
              if (d != '\n' && d != '\r') {
                  break;
              }
              if (d == '\r') {
                  off++;
                  if (input.LA(off) == '\n') {
                      off++;
                  }
              } else {
                  off++;
              }
              int ind = 0;
              int e = input.LA(off);
              while (e == ' ' || e == '\t') {
                  ind++;
                  off++;
                  e = input.LA(off);
              }
              if (ind > captureKeyColumn
                      && e != CharStream.EOF && e != '\n' && e != '\r' && e != '#') {
                  // Continuation line: consume the newline + indent, then fold it in.
                  for (int k = 1; k < off; k++) {
                      input.consume();
                  }
                  sb.append(' ');
                  appendLine(sb);
              } else {
                  break;
              }
          }

          // Trim trailing whitespace from the captured value.
          int end = sb.length();
          while (end > 0 && (sb.charAt(end - 1) == ' ' || sb.charAt(end - 1) == '\t')) {
              end--;
          }
          sb.setLength(end);
          if (end == 0) {
              return null;
          }

          CommonToken tok = new CommonToken(RULE_YAML_SCALAR, sb.toString());
          tok.setChannel(Token.DEFAULT_CHANNEL);
          tok.setStartIndex(startIndex);
          tok.setStopIndex(input.index() - 1);
          tok.setLine(startLine);
          tok.setCharPositionInLine(startCol);
          return tok;
      }

      /**
       * Appends the rest of the current line to {@code sb}, stopping at the
       * newline, EOF, or a ' #' YAML comment.
       */
      private void appendLine(StringBuilder sb) {
          int lastChar = -1;
          int c;
          while ((c = input.LA(1)) != CharStream.EOF && c != '\n' && c != '\r') {
              if (c == '#' && (lastChar == ' ' || lastChar == '\t')) {
                  break;
              }
              sb.append((char) c);
              input.consume();
              lastChar = c;
          }
      }

      /**
       * Peeks (without consuming) whether the trailing comment after a ':' is
       * followed by a more-indented block — i.e. the key is block-valued
       * (e.g. 'with: # note' with KeyValuePairs on the next lines). Blank lines
       * and comment-only lines are skipped. Returns false when the next real
       * content line is at the key's indent or shallower (an empty scalar value).
       */
      private boolean blockFollowsAfterComment() {
          int off = 1;
          // Skip the rest of the current comment line.
          int c = input.LA(off);
          while (c != CharStream.EOF && c != '\n' && c != '\r') {
              off++;
              c = input.LA(off);
          }
          // Skip blank and comment-only lines; measure the first real line's indent.
          while (true) {
              while (input.LA(off) == '\n' || input.LA(off) == '\r') {
                  off++;
              }
              int ind = 0;
              c = input.LA(off);
              while (c == ' ' || c == '\t') {
                  ind++;
                  off++;
                  c = input.LA(off);
              }
              if (c == CharStream.EOF) {
                  return false;
              }
              if (c == '\n' || c == '\r') {
                  continue; // blank line
              }
              if (c == '#') {
                  // Comment-only line: skip to its end and keep looking.
                  while (c != CharStream.EOF && c != '\n' && c != '\r') {
                      off++;
                      c = input.LA(off);
                  }
                  continue;
              }
              return ind > captureKeyColumn;
          }
      }

      /**
       * Peeks (without consuming) whether the value below a ':' (when the colon is
       * immediately followed by a newline) is a bare multi-line PLAIN SCALAR rather
       * than a nested mapping or sequence. Blank and comment-only lines are skipped.
       * Returns true only when the first real child line is indented deeper than the
       * key AND is neither a sequence item ('- ') nor a mapping entry ('key:') — i.e.
       * it is plain text such as a 'run:' script line or a '-Dsonar...' argument.
       * This is structure-driven, so it works for arbitrary keys (e.g. action inputs
       * inside 'with:'), not just a fixed list.
       */
      private boolean plainScalarBlockFollows() {
          int off = 1;
          while (true) {
              while (input.LA(off) == '\n' || input.LA(off) == '\r') {
                  off++;
              }
              int ind = 0;
              int c = input.LA(off);
              while (c == ' ' || c == '\t') {
                  ind++;
                  off++;
                  c = input.LA(off);
              }
              if (c == CharStream.EOF) {
                  return false;
              }
              if (c == '\n' || c == '\r') {
                  continue; // blank line
              }
              if (c == '#') {
                  // Comment-only line: skip to its end and keep looking.
                  while (c != CharStream.EOF && c != '\n' && c != '\r') {
                      off++;
                      c = input.LA(off);
                  }
                  continue;
              }
              // First real child line.
              if (ind <= captureKeyColumn) {
                  return false; // sibling/dedent -> not this key's value
              }
              if (c == '-') {
                  // Sequence item '- ...' (dash followed by whitespace/EOL) -> block.
                  // A dash glued to text (e.g. '-Dsonar') is a plain scalar, not a seq.
                  int n = input.LA(off + 1);
                  if (n == ' ' || n == '\t' || n == '\n' || n == '\r' || n == CharStream.EOF) {
                      return false;
                  }
              }
              // Mapping detection: a 'key:' (':' followed by space/EOL) before any
              // trailing ' #' comment means this is a nested mapping, not a scalar.
              int p = off;
              int prev = -1;
              int ch = input.LA(p);
              while (ch != CharStream.EOF && ch != '\n' && ch != '\r') {
                  if (ch == '#' && (prev == ' ' || prev == '\t')) {
                      break;
                  }
                  if (ch == ':') {
                      int nx = input.LA(p + 1);
                      if (nx == ' ' || nx == '\t' || nx == '\n' || nx == '\r'
                              || nx == CharStream.EOF) {
                          return false;
                      }
                  }
                  prev = ch;
                  p++;
                  ch = input.LA(p);
              }
              return true; // indented, not a sequence, no key-colon -> plain scalar
          }
      }

      /**
       * Peeks (without consuming) whether the '|'/'>' at LA(1) is a block-scalar
       * header carrying an explicit indentation digit (e.g. '|2-', '>3', '|-2').
       * The header must be terminated by whitespace, a comment, a newline or EOF.
       */
      private boolean blockHeaderHasDigit() {
          int off = 2; // first char after the '|' / '>'
          int ch = input.LA(off);
          boolean digit = false;
          while ((ch >= '1' && ch <= '9') || ch == '+' || ch == '-') {
              if (ch >= '1' && ch <= '9') {
                  digit = true;
              }
              off++;
              ch = input.LA(off);
          }
          return digit && (ch == ' ' || ch == '\t' || ch == '\n' || ch == '\r'
                  || ch == CharStream.EOF || ch == '#');
      }

      /**
       * Reads a block scalar with an explicit indentation indicator and returns
       * its body as a single YAML_SCALAR. The first non-blank body line sets the
       * content indentation; lines indented at least that much (plus blank lines)
       * belong to the block, joined by newlines with the common indent stripped.
       * If the block ends on a dedented sibling line, the indentation machinery
       * is re-primed so the proper END_BLOCK(s) are emitted before it.
       */
      private Token captureExplicitIndentBlock() {
          int startLine = input.getLine();
          int startCol  = input.getCharPositionInLine();

          // Consume the header: '|'/'>' then the digit / chomping indicators.
          input.consume();
          int ch = input.LA(1);
          while ((ch >= '1' && ch <= '9') || ch == '+' || ch == '-') {
              input.consume();
              ch = input.LA(1);
          }
          // Discard the rest of the header line (only spaces or a comment allowed).
          while ((ch = input.LA(1)) != CharStream.EOF && ch != '\n' && ch != '\r') {
              input.consume();
          }
          consumeNewline();

          StringBuilder body = new StringBuilder();
          int contentIndent = -1;
          boolean stoppedAtDedent = false;
          int dedentIndent = 0;

          while (true) {
              // Peek the next line's indentation without consuming it.
              int off = 1;
              int ind = 0;
              int la = input.LA(off);
              while (la == ' ' || la == '\t') {
                  ind++;
                  off++;
                  la = input.LA(off);
              }
              boolean blank = (la == '\n' || la == '\r' || la == CharStream.EOF);

              if (blank) {
                  if (la == CharStream.EOF) {
                      break;
                  }
                  for (int k = 1; k < off; k++) {
                      input.consume();
                  }
                  consumeNewline();
                  if (contentIndent != -1) {
                      body.append('\n');
                  }
                  continue;
              }

              if (contentIndent == -1) {
                  contentIndent = ind;
              }
              if (ind < contentIndent) {
                  stoppedAtDedent = true;
                  dedentIndent = ind;
                  break; // leave the line for normal indentation handling
              }

              // Body line: drop the common indent, keep any extra as text.
              for (int k = 1; k < off; k++) {
                  input.consume();
              }
              for (int s = 0; s < ind - contentIndent; s++) {
                  body.append(' ');
              }
              int cc;
              while ((cc = input.LA(1)) != CharStream.EOF && cc != '\n' && cc != '\r') {
                  body.append((char) cc);
                  input.consume();
              }
              if (input.LA(1) == CharStream.EOF) {
                  break;
              }
              consumeNewline();
              body.append('\n');
          }

          // Approximate chomping: strip trailing newlines.
          int end = body.length();
          while (end > 0 && body.charAt(end - 1) == '\n') {
              end--;
          }
          body.setLength(end);

          if (stoppedAtDedent) {
              pendingIndent = dedentIndent;
              atLineStart = true;
          }

          CommonToken tok = new CommonToken(RULE_YAML_SCALAR, body.toString());
          tok.setChannel(Token.DEFAULT_CHANNEL);
          tok.setLine(startLine);
          tok.setCharPositionInLine(startCol);
          return tok;
      }

      /** Consumes one line break ('\n', '\r' or '\r\n'). */
      private void consumeNewline() {
          int c = input.LA(1);
          if (c == '\r') {
              input.consume();
              if (input.LA(1) == '\n') {
                  input.consume();
              }
          } else if (c == '\n') {
              input.consume();
          }
      }

      /**
       * Peeks (without consuming) past spaces/tabs to see whether the next
       * significant character is ':'. Used to tell a YAML key (keyword ':')
       * from a keyword used as a value.
       */
      private boolean nextSignificantIsColon() {
          int i = 1;
          int c = input.LA(i);
          while (c == ' ' || c == '\t') {
              i++;
              c = input.LA(i);
          }
          return c == ':';
      }

      /**
       * True when the line about to be read is a comment-only line (its first
       * non-space character is '#'). Such lines are ignored for indentation.
       */
      private boolean atCommentLine() {
          int i = 1;
          int c = input.LA(i);
          while (c == ' ' || c == '\t') {
              i++;
              c = input.LA(i);
          }
          return c == '#';
      }

      // --- Indentation ---------------------------------------------------------

      private void handleIndentChange(int newIndent) {

          // Inside an open block scalar: suppress all nested BEG/END injections.
          // Only exit when indent drops back below the block body's own level.
          if (insideBlockScalar) {
              if (newIndent < blockScalarBaseIndent) {
                  // Script body ended -- emit the block scalar's END_BLOCK.
                  insideBlockScalar = false;
                  blockScalarBaseIndent = -1;
                  indentStack.pop(); // remove the level pushed when entering
                  pending.addLast(makeSynthetic(RULE_END_BLOCK, "<END_BLOCK>"));
                  // Process any remaining dedent normally (e.g. the step's own END_BLOCK).
                  while (indentStack.size() > 1 && newIndent < indentStack.peek()) {
                      Integer popped = indentStack.pop();
                      namedCollectionLevels.remove(popped);
                      pending.addLast(makeSynthetic(RULE_END_BLOCK, "<END_BLOCK>"));
                  }
              }
              // All other indent changes within the block scalar are suppressed.
              return;
          }

          // Awaiting entry into a block scalar (seen '|'/'>' on the previous line).
          if (awaitingBlockScalar) {
              awaitingBlockScalar = false;
              if (newIndent > indentStack.peek()) {
                  // Indent increased after '|'/'>' -> open the block scalar.
                  insideBlockScalar = true;
                  blockScalarBaseIndent = newIndent;
                  indentStack.push(newIndent);
                  pending.addLast(makeSynthetic(RULE_BEG_BLOCK, "<BEG_BLOCK>"));
                  return;
              }
              // '|'/'>' was not a block scalar indicator; fall through to normal processing.
          }

          // Normal indentation processing. Consume the named-collection flag here
          // (exactly once per call) so it cannot leak into an unrelated block.
          boolean openNamedCollection = nextBlockIsNamedCollection;
          nextBlockIsNamedCollection = false;

          int current = indentStack.peek();
          if (newIndent > current) {
              indentStack.push(newIndent);
              pending.addLast(makeSynthetic(RULE_BEG_BLOCK, "<BEG_BLOCK>"));
              if (openNamedCollection) {
                  namedCollectionLevels.add(newIndent);
              }
          } else if (newIndent < current) {
              while (indentStack.size() > 1 && newIndent < indentStack.peek()) {
                  Integer popped = indentStack.pop();
                  namedCollectionLevels.remove(popped);
                  pending.addLast(makeSynthetic(RULE_END_BLOCK, "<END_BLOCK>"));
              }
          }
      }

      /**
       * Reads the indent of the next content line from the WS token text.
       * Returns the number of space/tab characters after the last newline.
       */
      private int indentFromWsText(String text) {
          if (text == null) {
              return 0;
          }
          int lastNewline = Math.max(text.lastIndexOf('\n'), text.lastIndexOf('\r'));
          if (lastNewline < 0) {
              return 0;
          }
          int count = 0;
          for (int i = lastNewline + 1; i < text.length(); i++) {
              char c = text.charAt(i);
              if (c == ' ' || c == '\t') {
                  count++;
              } else {
                  break;
              }
          }
          return count;
      }

      /**
       * Used only for the very first call (before any token is consumed).
       * After that, indent comes from the WS token text.
       */
      private int peekLeadingSpaces() {
          int offset = 1;
          while (true) {
              int count = 0;
              int c = input.LA(offset);
              while (c == ' ' || c == '\t') {
                  count++;
                  offset++;
                  c = input.LA(offset);
              }
              if (c == CharStream.EOF) {
                  return -1;
              }
              if (c == '\n' || c == '\r') {
                  while (input.LA(offset) == '\n' || input.LA(offset) == '\r') {
                      offset++;
                  }
                  continue;
              }
              return count;
          }
      }

      // --- Helpers -------------------------------------------------------------

      /**
       * True for a YAML block scalar header: '|', '>', and the chomping/keep
       * variants '|-', '|+', '>-', '>+'. Matches the keywords declared in the
       * BlockString rule, so the lexer never arms for something the grammar
       * cannot open.
       */
      private static boolean isBlockScalarHeader(String txt) {
          return "|".equals(txt)  || ">".equals(txt)
              || "|-".equals(txt) || "|+".equals(txt)
              || ">-".equals(txt) || ">+".equals(txt);
      }

      private boolean isLineBreakToken(Token t) {
          int type = t.getType();
          if (type != RULE_WS && type != RULE_ML_COMMENT) {
              return false;
          }
          String text = t.getText();
          return text != null && (text.indexOf('\n') >= 0 || text.indexOf('\r') >= 0);
      }

      /**
       * Builds a zero-length synthetic token anchored at the current input
       * position. The {@code startIndex}/{@code stopIndex} pair is what the
       * Xtext node model uses to map tokens back to source offsets -- without it
       * folding, outline and other UI features throw IndexOutOfBoundsException.
       */
      private Token makeSynthetic(int type, String text) {
          CommonToken tok = new CommonToken(type, text);
          tok.setChannel(Token.DEFAULT_CHANNEL);

          int idx = input.index();
          tok.setStartIndex(idx);
          tok.setStopIndex(idx - 1); // stop < start => zero-length

          tok.setLine(input.getLine());
          tok.setCharPositionInLine(input.getCharPositionInLine());
          return tok;
      }
  }
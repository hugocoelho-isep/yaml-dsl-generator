  package pt.isep.yamldslgen.xtext.parser.antlr;

  import java.util.ArrayDeque;
  import java.util.Deque;

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
      // Phase 1: awaitingBlockScalar=true  → the next indent increase opens the block.
      // Phase 2: insideBlockScalar=true    → suppress nested BEG/END injections
      //          until indent drops below blockScalarBaseIndent.

      private boolean awaitingBlockScalar = false;
      private boolean insideBlockScalar   = false;
      private int     blockScalarBaseIndent = -1;

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
      }

      @Override
      public Token nextToken() {
          // (1) Drain any queued synthetic tokens first.
          if (!pending.isEmpty()) {
              return pending.pollFirst();
          }

          // (2) At line start, apply the indent measurement we stashed from the
          //     last line-break WS. On the very first call, fall back to peeking
          //     the stream (nothing has been consumed yet, so it's safe).
          if (atLineStart) {
              atLineStart = false;
              int indent = pendingIndent >= 0 ? pendingIndent : peekLeadingSpaces();
              pendingIndent = -1;
              if (indent >= 0) {
                  handleIndentChange(indent);
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
                  indentStack.pop();
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

          // (7) Detect YAML block scalar indicators ('|' or '>').
          //     Only arm the flag when outside an existing block scalar so that
          //     pipes/redirects inside shell scripts are ignored.
          if (!insideBlockScalar) {
              String txt = t.getText();
              if ("|".equals(txt) || ">".equals(txt)) {
                  awaitingBlockScalar = true;
              }
          }

          // (8) Dash at start of a line: opens a virtual block for the item's
          //     content (grammar expects `'-' BEG_BLOCK ...`).
          //     Skip inside a block scalar body (e.g. '-D...' flags in 'run: >').
          if (wasFirstOfLine && !insideBlockScalar && "-".equals(t.getText())) {
              int virtualIndent = t.getCharPositionInLine() + 2;
              indentStack.push(virtualIndent);
              pending.addLast(makeSynthetic(RULE_BEG_BLOCK, "<BEG_BLOCK>"));
          }

          return t;
      }

      // --- Indentation ---------------------------------------------------------

      private void handleIndentChange(int newIndent) {

          // Inside an open block scalar: suppress all nested BEG/END injections.
          // Only exit when indent drops back below the block body's own level.
          if (insideBlockScalar) {
              if (newIndent < blockScalarBaseIndent) {
                  // Script body ended — emit the block scalar's END_BLOCK.
                  insideBlockScalar = false;
                  blockScalarBaseIndent = -1;
                  indentStack.pop(); // remove the level pushed when entering
                  pending.addLast(makeSynthetic(RULE_END_BLOCK, "<END_BLOCK>"));
                  // Process any remaining dedent normally (e.g. the step's own END_BLOCK).
                  while (indentStack.size() > 1 && newIndent < indentStack.peek()) {
                      indentStack.pop();
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
                  // Indent increased after '|'/'>' → open the block scalar.
                  insideBlockScalar = true;
                  blockScalarBaseIndent = newIndent;
                  indentStack.push(newIndent);
                  pending.addLast(makeSynthetic(RULE_BEG_BLOCK, "<BEG_BLOCK>"));
                  return;
              }
              // '|'/'>' was not a block scalar indicator; fall through to normal processing.
          }

          // Normal indentation processing.
          int current = indentStack.peek();
          if (newIndent > current) {
              indentStack.push(newIndent);
              pending.addLast(makeSynthetic(RULE_BEG_BLOCK, "<BEG_BLOCK>"));
          } else if (newIndent < current) {
              while (indentStack.size() > 1 && newIndent < indentStack.peek()) {
                  indentStack.pop();
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
       * Xtext node model uses to map tokens back to source offsets — without it
       * folding, outline and other UI features throw IndexOutOfBoundsException.
       */
      private Token makeSynthetic(int type, String text) {
          CommonToken tok = new CommonToken(type, text);
          tok.setChannel(Token.DEFAULT_CHANNEL);

          int idx = input.index();
          tok.setStartIndex(idx);
          tok.setStopIndex(idx - 1); // stop < start ⇒ zero-length

          tok.setLine(input.getLine());
          tok.setCharPositionInLine(input.getCharPositionInLine());
          return tok;
      }
  }
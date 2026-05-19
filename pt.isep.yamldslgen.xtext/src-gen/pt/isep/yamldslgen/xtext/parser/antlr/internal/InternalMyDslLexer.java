package pt.isep.yamldslgen.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
    public static final int T__50=50;
    public static final int RULE_BEG_BLOCK=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_END_BLOCK=5;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_GH_EXPRESSION=7;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_YAML_SCALAR=8;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( 'name' )
            // InternalMyDsl.g:11:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( ':' )
            // InternalMyDsl.g:12:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'on' )
            // InternalMyDsl.g:13:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'concurrency' )
            // InternalMyDsl.g:14:9: 'concurrency'
            {
            match("concurrency"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( 'jobs' )
            // InternalMyDsl.g:15:9: 'jobs'
            {
            match("jobs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'permissions' )
            // InternalMyDsl.g:16:9: 'permissions'
            {
            match("permissions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( 'env' )
            // InternalMyDsl.g:17:9: 'env'
            {
            match("env"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:18:7: ( 'true' )
            // InternalMyDsl.g:18:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:19:7: ( 'false' )
            // InternalMyDsl.g:19:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:20:7: ( '>' )
            // InternalMyDsl.g:20:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:21:7: ( '|' )
            // InternalMyDsl.g:21:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:22:7: ( '-' )
            // InternalMyDsl.g:22:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:23:7: ( '[' )
            // InternalMyDsl.g:23:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:24:7: ( ']' )
            // InternalMyDsl.g:24:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:25:7: ( ';' )
            // InternalMyDsl.g:25:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:26:7: ( ',' )
            // InternalMyDsl.g:26:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:27:7: ( '{' )
            // InternalMyDsl.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:28:7: ( '}' )
            // InternalMyDsl.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:29:7: ( 'push' )
            // InternalMyDsl.g:29:9: 'push'
            {
            match("push"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:30:7: ( 'pull_request' )
            // InternalMyDsl.g:30:9: 'pull_request'
            {
            match("pull_request"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:31:7: ( 'branches' )
            // InternalMyDsl.g:31:9: 'branches'
            {
            match("branches"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:32:7: ( 'tags' )
            // InternalMyDsl.g:32:9: 'tags'
            {
            match("tags"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:33:7: ( 'runs-on' )
            // InternalMyDsl.g:33:9: 'runs-on'
            {
            match("runs-on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:34:7: ( 'needs' )
            // InternalMyDsl.g:34:9: 'needs'
            {
            match("needs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:35:7: ( 'steps' )
            // InternalMyDsl.g:35:9: 'steps'
            {
            match("steps"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:36:7: ( 'uses' )
            // InternalMyDsl.g:36:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:37:7: ( 'run' )
            // InternalMyDsl.g:37:9: 'run'
            {
            match("run"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:38:7: ( 'with' )
            // InternalMyDsl.g:38:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:39:7: ( 'schedule' )
            // InternalMyDsl.g:39:9: 'schedule'
            {
            match("schedule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:40:7: ( 'workflow_dispatch' )
            // InternalMyDsl.g:40:9: 'workflow_dispatch'
            {
            match("workflow_dispatch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:41:7: ( 'cron' )
            // InternalMyDsl.g:41:9: 'cron'
            {
            match("cron"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:42:7: ( 'group' )
            // InternalMyDsl.g:42:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:43:7: ( 'cancel-in-progress' )
            // InternalMyDsl.g:43:9: 'cancel-in-progress'
            {
            match("cancel-in-progress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:44:7: ( 'url' )
            // InternalMyDsl.g:44:9: 'url'
            {
            match("url"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:45:7: ( 'environment' )
            // InternalMyDsl.g:45:9: 'environment'
            {
            match("environment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:46:7: ( 'id' )
            // InternalMyDsl.g:46:9: 'id'
            {
            match("id"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:47:7: ( 'if' )
            // InternalMyDsl.g:47:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:48:7: ( 'working-directory' )
            // InternalMyDsl.g:48:9: 'working-directory'
            {
            match("working-directory"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_BEG_BLOCK"
    public final void mRULE_BEG_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_BEG_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2668:16: ( 'synthetic:BEGIN' )
            // InternalMyDsl.g:2668:18: 'synthetic:BEGIN'
            {
            match("synthetic:BEGIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BEG_BLOCK"

    // $ANTLR start "RULE_END_BLOCK"
    public final void mRULE_END_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_END_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2670:16: ( 'synthetic:END' )
            // InternalMyDsl.g:2670:18: 'synthetic:END'
            {
            match("synthetic:END"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_BLOCK"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2672:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:2672:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalMyDsl.g:2672:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:2672:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:2672:39: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:2672:40: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:2672:40: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalMyDsl.g:2672:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_GH_EXPRESSION"
    public final void mRULE_GH_EXPRESSION() throws RecognitionException {
        try {
            int _type = RULE_GH_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2674:20: ( ( '${{' ( options {greedy=false; } : . )* '}}' | '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* ) )
            // InternalMyDsl.g:2674:22: ( '${{' ( options {greedy=false; } : . )* '}}' | '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
            {
            // InternalMyDsl.g:2674:22: ( '${{' ( options {greedy=false; } : . )* '}}' | '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='$') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='{') ) {
                    alt6=1;
                }
                else if ( ((LA6_1>='A' && LA6_1<='Z')||LA6_1=='_'||(LA6_1>='a' && LA6_1<='z')) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:2674:23: '${{' ( options {greedy=false; } : . )* '}}'
                    {
                    match("${{"); 

                    // InternalMyDsl.g:2674:29: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='}') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='}') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_1>='\u0000' && LA4_1<='|')||(LA4_1>='~' && LA4_1<='\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='|')||(LA4_0>='~' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:2674:57: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match("}}"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2674:66: '$' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
                    {
                    match('$'); 
                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMyDsl.g:2674:94: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='-'||(LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:
                    	    {
                    	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GH_EXPRESSION"

    // $ANTLR start "RULE_YAML_SCALAR"
    public final void mRULE_YAML_SCALAR() throws RecognitionException {
        try {
            int _type = RULE_YAML_SCALAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2676:18: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | '/' | '@' | '*' | '$' | '=' | '+' | '<' | '>' | '|' | '&' | '~' | '!' | '?' | '\\\\' | '(' | ')' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' | '/' | '@' | '*' | '$' | '=' | '+' | '<' | '>' | '|' | '&' | '~' | '!' | '?' | '\\\\' | '(' | ')' | ' ' )* )
            // InternalMyDsl.g:2676:20: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | '/' | '@' | '*' | '$' | '=' | '+' | '<' | '>' | '|' | '&' | '~' | '!' | '?' | '\\\\' | '(' | ')' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' | '/' | '@' | '*' | '$' | '=' | '+' | '<' | '>' | '|' | '&' | '~' | '!' | '?' | '\\\\' | '(' | ')' | ' ' )*
            {
            if ( input.LA(1)=='!'||input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1)>='(' && input.LA(1)<='+')||(input.LA(1)>='.' && input.LA(1)<='9')||(input.LA(1)>='<' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2676:122: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-' | '.' | '/' | '@' | '*' | '$' | '=' | '+' | '<' | '>' | '|' | '&' | '~' | '!' | '?' | '\\\\' | '(' | ')' | ' ' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=' ' && LA7_0<='!')||LA7_0=='$'||LA7_0=='&'||(LA7_0>='(' && LA7_0<='+')||(LA7_0>='-' && LA7_0<='9')||(LA7_0>='<' && LA7_0<='Z')||LA7_0=='\\'||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')||LA7_0=='|'||LA7_0=='~') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>=' ' && input.LA(1)<='!')||input.LA(1)=='$'||input.LA(1)=='&'||(input.LA(1)>='(' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='9')||(input.LA(1)>='<' && input.LA(1)<='Z')||input.LA(1)=='\\'||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||input.LA(1)=='~' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_YAML_SCALAR"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2678:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:2678:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:2678:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:2678:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:2678:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2680:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:2680:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:2680:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2680:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2682:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:2682:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:2682:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:2682:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:2682:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:2682:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2682:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2682:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:2682:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:2682:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:2682:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2684:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:2684:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:2684:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2684:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2686:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:2686:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:2686:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:2688:16: ( . )
            // InternalMyDsl.g:2688:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_BEG_BLOCK | RULE_END_BLOCK | RULE_SL_COMMENT | RULE_GH_EXPRESSION | RULE_YAML_SCALAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=49;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // InternalMyDsl.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalMyDsl.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalMyDsl.g:1:124: T__34
                {
                mT__34(); 

                }
                break;
            case 21 :
                // InternalMyDsl.g:1:130: T__35
                {
                mT__35(); 

                }
                break;
            case 22 :
                // InternalMyDsl.g:1:136: T__36
                {
                mT__36(); 

                }
                break;
            case 23 :
                // InternalMyDsl.g:1:142: T__37
                {
                mT__37(); 

                }
                break;
            case 24 :
                // InternalMyDsl.g:1:148: T__38
                {
                mT__38(); 

                }
                break;
            case 25 :
                // InternalMyDsl.g:1:154: T__39
                {
                mT__39(); 

                }
                break;
            case 26 :
                // InternalMyDsl.g:1:160: T__40
                {
                mT__40(); 

                }
                break;
            case 27 :
                // InternalMyDsl.g:1:166: T__41
                {
                mT__41(); 

                }
                break;
            case 28 :
                // InternalMyDsl.g:1:172: T__42
                {
                mT__42(); 

                }
                break;
            case 29 :
                // InternalMyDsl.g:1:178: T__43
                {
                mT__43(); 

                }
                break;
            case 30 :
                // InternalMyDsl.g:1:184: T__44
                {
                mT__44(); 

                }
                break;
            case 31 :
                // InternalMyDsl.g:1:190: T__45
                {
                mT__45(); 

                }
                break;
            case 32 :
                // InternalMyDsl.g:1:196: T__46
                {
                mT__46(); 

                }
                break;
            case 33 :
                // InternalMyDsl.g:1:202: T__47
                {
                mT__47(); 

                }
                break;
            case 34 :
                // InternalMyDsl.g:1:208: T__48
                {
                mT__48(); 

                }
                break;
            case 35 :
                // InternalMyDsl.g:1:214: T__49
                {
                mT__49(); 

                }
                break;
            case 36 :
                // InternalMyDsl.g:1:220: T__50
                {
                mT__50(); 

                }
                break;
            case 37 :
                // InternalMyDsl.g:1:226: T__51
                {
                mT__51(); 

                }
                break;
            case 38 :
                // InternalMyDsl.g:1:232: T__52
                {
                mT__52(); 

                }
                break;
            case 39 :
                // InternalMyDsl.g:1:238: RULE_BEG_BLOCK
                {
                mRULE_BEG_BLOCK(); 

                }
                break;
            case 40 :
                // InternalMyDsl.g:1:253: RULE_END_BLOCK
                {
                mRULE_END_BLOCK(); 

                }
                break;
            case 41 :
                // InternalMyDsl.g:1:268: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 42 :
                // InternalMyDsl.g:1:284: RULE_GH_EXPRESSION
                {
                mRULE_GH_EXPRESSION(); 

                }
                break;
            case 43 :
                // InternalMyDsl.g:1:303: RULE_YAML_SCALAR
                {
                mRULE_YAML_SCALAR(); 

                }
                break;
            case 44 :
                // InternalMyDsl.g:1:320: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 45 :
                // InternalMyDsl.g:1:328: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 46 :
                // InternalMyDsl.g:1:337: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 47 :
                // InternalMyDsl.g:1:349: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalMyDsl.g:1:365: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // InternalMyDsl.g:1:373: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\47\1\uffff\7\47\1\65\1\66\7\uffff\7\47\1\uffff\2\47\1\44\2\47\2\44\3\uffff\2\47\1\uffff\1\47\1\uffff\1\124\12\47\11\uffff\12\47\1\152\1\153\2\uffff\1\113\1\uffff\2\47\2\uffff\2\47\1\uffff\7\47\1\172\4\47\1\u0080\4\47\1\u0085\3\47\2\uffff\1\113\2\47\1\uffff\1\u008a\2\47\1\u008d\1\47\1\u008f\1\47\1\u0091\2\47\1\uffff\1\u0094\1\u0095\3\47\1\uffff\3\47\1\u009c\1\uffff\1\u009d\3\47\1\uffff\1\u00a1\1\47\1\uffff\1\47\1\uffff\1\47\1\uffff\2\47\2\uffff\1\u00a7\2\47\1\u00aa\2\47\2\uffff\2\47\1\u00af\1\uffff\5\47\1\uffff\2\47\1\uffff\4\47\1\uffff\6\47\1\u00c1\11\47\1\u00cb\1\uffff\1\u00cc\10\47\2\uffff\10\47\1\uffff\2\47\1\u00e1\1\47\1\u00e3\1\47\1\u00e5\2\uffff\2\47\1\uffff\1\47\1\uffff\1\u00e9\1\uffff\3\47\1\uffff\14\47\1\u00f9\1\u00fa\1\u00fb\3\uffff";
    static final String DFA16_eofS =
        "\u00fc\uffff";
    static final String DFA16_minS =
        "\1\0\1\60\1\uffff\7\60\2\40\7\uffff\7\60\1\uffff\1\101\1\60\1\101\1\60\1\52\2\0\3\uffff\2\60\1\uffff\1\60\1\uffff\1\40\12\60\11\uffff\12\60\2\40\2\uffff\1\40\1\uffff\1\60\1\0\2\uffff\2\60\1\uffff\7\60\1\40\4\60\1\40\4\60\1\40\3\60\2\uffff\1\40\2\0\1\uffff\1\40\2\60\1\40\1\60\1\40\1\60\1\40\2\60\1\uffff\2\40\2\60\1\55\1\uffff\3\60\1\40\1\uffff\1\40\2\60\1\0\1\uffff\1\40\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\2\60\2\uffff\1\40\1\60\1\157\1\40\2\60\2\uffff\2\60\1\40\1\uffff\1\60\1\55\3\60\1\uffff\1\60\1\156\1\uffff\4\60\1\uffff\1\60\1\151\4\60\1\40\3\60\1\55\1\60\1\156\3\60\1\40\1\uffff\1\40\2\60\1\144\1\60\1\55\3\60\2\uffff\2\60\1\151\1\60\1\160\3\60\1\102\1\60\1\162\1\40\1\162\1\40\1\60\1\40\2\uffff\1\60\1\145\1\uffff\1\157\1\uffff\1\40\1\uffff\1\60\1\143\1\147\1\uffff\1\60\1\164\1\162\1\60\1\157\1\145\1\60\1\162\1\163\1\60\1\171\1\163\3\40\3\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\172\1\uffff\7\172\2\176\7\uffff\7\172\1\uffff\1\173\2\172\1\71\1\52\2\uffff\3\uffff\2\172\1\uffff\1\172\1\uffff\1\176\12\172\11\uffff\12\172\2\176\2\uffff\1\176\1\uffff\1\71\1\uffff\2\uffff\2\172\1\uffff\7\172\1\176\4\172\1\176\4\172\1\176\3\172\2\uffff\1\176\2\uffff\1\uffff\1\176\2\172\1\176\1\172\1\176\1\172\1\176\2\172\1\uffff\2\176\3\172\1\uffff\3\172\1\176\1\uffff\1\176\2\172\1\uffff\1\uffff\1\176\1\172\1\uffff\1\172\1\uffff\1\172\1\uffff\2\172\2\uffff\1\176\1\172\1\157\1\176\2\172\2\uffff\2\172\1\176\1\uffff\5\172\1\uffff\1\172\1\156\1\uffff\4\172\1\uffff\1\172\1\151\4\172\1\176\5\172\1\156\3\172\1\176\1\uffff\1\176\2\172\1\144\1\172\1\55\3\172\2\uffff\2\172\1\151\1\172\1\160\3\172\1\105\1\172\1\162\1\176\1\162\1\176\1\172\1\176\2\uffff\1\172\1\145\1\uffff\1\157\1\uffff\1\176\1\uffff\1\172\1\143\1\147\1\uffff\1\172\1\164\1\162\1\172\1\157\1\145\1\172\1\162\1\163\1\172\1\171\1\163\3\176\3\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\2\11\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\7\uffff\1\51\7\uffff\1\53\1\60\1\61\2\uffff\1\53\1\uffff\1\2\13\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\14\uffff\1\51\1\52\1\uffff\1\54\2\uffff\1\56\1\60\2\uffff\1\3\25\uffff\1\44\1\45\3\uffff\1\57\12\uffff\1\7\5\uffff\1\33\4\uffff\1\42\4\uffff\1\1\2\uffff\1\37\1\uffff\1\5\1\uffff\1\23\2\uffff\1\10\1\26\6\uffff\1\32\1\34\3\uffff\1\30\5\uffff\1\11\2\uffff\1\31\4\uffff\1\40\21\uffff\1\27\11\uffff\1\25\1\35\20\uffff\1\47\1\50\2\uffff\1\4\1\uffff\1\6\1\uffff\1\43\3\uffff\1\24\17\uffff\1\36\1\46\1\41";
    static final String DFA16_specialS =
        "\1\2\37\uffff\1\5\1\1\55\uffff\1\6\35\uffff\1\4\1\3\32\uffff\1\0\162\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\44\2\43\2\44\1\43\22\44\1\43\1\42\1\40\1\32\1\33\1\44\1\42\1\41\4\42\1\20\1\14\1\42\1\37\12\36\1\2\1\17\2\42\1\12\2\42\32\34\1\15\1\42\1\16\1\35\1\34\1\44\1\34\1\23\1\4\1\34\1\7\1\11\1\30\1\34\1\31\1\5\3\34\1\1\1\3\1\6\1\34\1\24\1\25\1\10\1\26\1\34\1\27\3\34\1\21\1\13\1\22\1\42\uff81\44",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\45\3\50\1\46\25\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\52\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\55\15\50\1\53\2\50\1\54\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\56\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\57\17\50\1\60\5\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\61\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\63\20\50\1\62\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\64\31\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\15\47\2\uffff\37\47\1\uffff\1\47\2\uffff\1\47\1\uffff\32\47\1\uffff\1\47\1\uffff\1\47",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\15\47\2\uffff\37\47\1\uffff\1\47\2\uffff\1\47\1\uffff\32\47\1\uffff\1\47\1\uffff\1\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\76\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\77\5\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\101\20\50\1\100\4\50\1\102\1\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\104\1\103\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\105\5\50\1\106\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\107\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\110\1\50\1\111\24\50",
            "",
            "\32\114\4\uffff\1\114\1\uffff\32\114\1\113",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\32\115\4\uffff\1\115\1\uffff\32\115",
            "\12\116",
            "\1\117",
            "\0\120",
            "\0\120",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\14\50\1\122\15\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\123\25\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\125\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\126\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\127\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\50\1\130\30\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\131\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\133\6\50\1\132\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\25\50\1\134\4\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\135\5\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\6\50\1\136\23\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\137\16\50",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\140\31\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\141\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\142\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\143\22\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\144\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\145\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\146\16\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\147\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\150\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\151\13\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\1\154\2\47\12\154\2\uffff\5\47\32\154\1\uffff\1\47\2\uffff\1\154\1\uffff\32\154\1\uffff\1\47\1\uffff\1\47",
            "",
            "\12\116",
            "\40\157\2\156\2\157\1\156\1\157\1\156\1\157\2\156\1\155\1\156\1\157\15\156\2\157\37\156\1\157\1\156\2\157\1\156\1\157\32\156\1\157\1\156\1\157\1\156\uff81\157",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\160\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\161\26\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\162\27\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\163\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\164\27\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\165\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\14\50\1\166\15\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\167\22\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\170\16\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\10\50\1\171\21\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\173\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\174\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\175\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\176\14\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\22\50\1\177\7\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\17\50\1\u0081\12\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u0082\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u0083\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u0084\7\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\u0086\22\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\12\50\1\u0087\17\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\u0088\5\50",
            "",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\1\154\2\47\12\154\2\uffff\5\47\32\154\1\uffff\1\47\2\uffff\1\154\1\uffff\32\154\1\uffff\1\47\1\uffff\1\47",
            "\40\157\2\156\2\157\1\156\1\157\1\156\1\157\2\156\1\155\1\156\1\157\2\156\1\u0089\12\156\2\157\37\156\1\157\1\156\2\157\1\156\1\157\32\156\1\157\1\156\1\157\1\156\uff81\157",
            "\40\157\2\156\2\157\1\156\1\157\1\156\1\157\2\156\1\155\1\156\1\157\15\156\2\157\37\156\1\157\1\156\2\157\1\156\1\157\32\156\1\157\1\156\1\157\1\156\uff81\157",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u008b\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\u008c\5\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u008e\25\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u0090\21\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\u0092\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\u0093\10\50",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u0096\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\u0097\27\50",
            "\1\u0098\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u0099\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\u009a\26\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\u009b\22\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\5\50\1\u009e\2\50\1\u009f\21\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\17\50\1\u00a0\12\50",
            "\40\157\2\156\2\157\1\156\1\157\1\156\1\157\2\156\1\155\1\156\1\157\15\156\2\157\37\156\1\157\1\156\2\157\1\156\1\157\32\156\1\157\1\156\1\157\1\156\uff81\157",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\u00a2\10\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u00a3\16\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00a4\7\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\u00a5\10\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\u00a6\13\50",
            "",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\u00a8\22\50",
            "\1\u00a9",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\u00ab\5\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00ac\25\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u00ad\16\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00ae\14\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\21\50\1\u00b0\10\50",
            "\1\u00b1\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00b2\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00b3\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00b4\14\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00b5\25\50",
            "\1\u00b6",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u00b7\16\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00b8\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\u00b9\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\6\50\1\u00ba\23\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00bb\25\50",
            "\1\u00bc",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u00bd\21\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\20\50\1\u00be\11\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\14\50\1\u00bf\15\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00c0\7\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\15\47\2\uffff\37\47\1\uffff\1\47\2\uffff\1\47\1\uffff\32\47\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00c2\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u00c3\21\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\26\50\1\u00c4\3\50",
            "\1\u00c5\2\uffff\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00c6\14\50",
            "\1\u00c7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\16\50\1\u00c8\13\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\u00c9\5\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00ca\25\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\u00cd\27\50",
            "\12\50\7\uffff\32\50\4\uffff\1\u00ce\1\uffff\32\50",
            "\1\u00cf",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\u00d0\27\50",
            "\1\u00d1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00d2\14\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\4\50\1\u00d3\25\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\15\50\1\u00d4\14\50",
            "",
            "",
            "\12\50\1\u00d5\6\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\3\50\1\u00d6\26\50",
            "\1\u00d7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\30\50\1\u00d8\1\50",
            "\1\u00d9",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00da\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00db\7\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00dc\6\50",
            "\1\u00dd\2\uffff\1\u00de",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\10\50\1\u00df\21\50",
            "\1\u00e0",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\1\u00e2",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00e4\6\50",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\22\50\1\u00e6\7\50",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\17\50\1\u00ea\12\50",
            "\1\u00eb",
            "\1\u00ec",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\1\u00ed\31\50",
            "\1\u00ee",
            "\1\u00ef",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\u00f0\6\50",
            "\1\u00f1",
            "\1\u00f2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\2\50\1\u00f3\27\50",
            "\1\u00f4",
            "\1\u00f5",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\7\50\1\u00f6\22\50",
            "\1\u00f7",
            "\1\u00f8",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\3\47\12\50\2\uffff\5\47\32\50\1\uffff\1\47\2\uffff\1\50\1\uffff\32\50\1\uffff\1\47\1\uffff\1\47",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\15\47\2\uffff\37\47\1\uffff\1\47\2\uffff\1\47\1\uffff\32\47\1\uffff\1\47\1\uffff\1\47",
            "\2\47\2\uffff\1\47\1\uffff\1\47\1\uffff\4\47\1\uffff\15\47\2\uffff\37\47\1\uffff\1\47\2\uffff\1\47\1\uffff\32\47\1\uffff\1\47\1\uffff\1\47",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_BEG_BLOCK | RULE_END_BLOCK | RULE_SL_COMMENT | RULE_GH_EXPRESSION | RULE_YAML_SCALAR | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_137 = input.LA(1);

                        s = -1;
                        if ( (LA16_137=='*') ) {s = 109;}

                        else if ( ((LA16_137>=' ' && LA16_137<='!')||LA16_137=='$'||LA16_137=='&'||(LA16_137>='(' && LA16_137<=')')||LA16_137=='+'||(LA16_137>='-' && LA16_137<='9')||(LA16_137>='<' && LA16_137<='Z')||LA16_137=='\\'||LA16_137=='_'||(LA16_137>='a' && LA16_137<='z')||LA16_137=='|'||LA16_137=='~') ) {s = 110;}

                        else if ( ((LA16_137>='\u0000' && LA16_137<='\u001F')||(LA16_137>='\"' && LA16_137<='#')||LA16_137=='%'||LA16_137=='\''||LA16_137==','||(LA16_137>=':' && LA16_137<=';')||LA16_137=='['||(LA16_137>=']' && LA16_137<='^')||LA16_137=='`'||LA16_137=='{'||LA16_137=='}'||(LA16_137>='\u007F' && LA16_137<='\uFFFF')) ) {s = 111;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_33 = input.LA(1);

                        s = -1;
                        if ( ((LA16_33>='\u0000' && LA16_33<='\uFFFF')) ) {s = 80;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='n') ) {s = 1;}

                        else if ( (LA16_0==':') ) {s = 2;}

                        else if ( (LA16_0=='o') ) {s = 3;}

                        else if ( (LA16_0=='c') ) {s = 4;}

                        else if ( (LA16_0=='j') ) {s = 5;}

                        else if ( (LA16_0=='p') ) {s = 6;}

                        else if ( (LA16_0=='e') ) {s = 7;}

                        else if ( (LA16_0=='t') ) {s = 8;}

                        else if ( (LA16_0=='f') ) {s = 9;}

                        else if ( (LA16_0=='>') ) {s = 10;}

                        else if ( (LA16_0=='|') ) {s = 11;}

                        else if ( (LA16_0=='-') ) {s = 12;}

                        else if ( (LA16_0=='[') ) {s = 13;}

                        else if ( (LA16_0==']') ) {s = 14;}

                        else if ( (LA16_0==';') ) {s = 15;}

                        else if ( (LA16_0==',') ) {s = 16;}

                        else if ( (LA16_0=='{') ) {s = 17;}

                        else if ( (LA16_0=='}') ) {s = 18;}

                        else if ( (LA16_0=='b') ) {s = 19;}

                        else if ( (LA16_0=='r') ) {s = 20;}

                        else if ( (LA16_0=='s') ) {s = 21;}

                        else if ( (LA16_0=='u') ) {s = 22;}

                        else if ( (LA16_0=='w') ) {s = 23;}

                        else if ( (LA16_0=='g') ) {s = 24;}

                        else if ( (LA16_0=='i') ) {s = 25;}

                        else if ( (LA16_0=='#') ) {s = 26;}

                        else if ( (LA16_0=='$') ) {s = 27;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||LA16_0=='a'||LA16_0=='d'||LA16_0=='h'||(LA16_0>='k' && LA16_0<='m')||LA16_0=='q'||LA16_0=='v'||(LA16_0>='x' && LA16_0<='z')) ) {s = 28;}

                        else if ( (LA16_0=='^') ) {s = 29;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 30;}

                        else if ( (LA16_0=='/') ) {s = 31;}

                        else if ( (LA16_0=='\"') ) {s = 32;}

                        else if ( (LA16_0=='\'') ) {s = 33;}

                        else if ( (LA16_0=='!'||LA16_0=='&'||(LA16_0>='(' && LA16_0<='+')||LA16_0=='.'||(LA16_0>='<' && LA16_0<='=')||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='~') ) {s = 34;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 35;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||LA16_0=='%'||LA16_0=='`'||(LA16_0>='\u007F' && LA16_0<='\uFFFF')) ) {s = 36;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA16_110 = input.LA(1);

                        s = -1;
                        if ( (LA16_110=='*') ) {s = 109;}

                        else if ( ((LA16_110>=' ' && LA16_110<='!')||LA16_110=='$'||LA16_110=='&'||(LA16_110>='(' && LA16_110<=')')||LA16_110=='+'||(LA16_110>='-' && LA16_110<='9')||(LA16_110>='<' && LA16_110<='Z')||LA16_110=='\\'||LA16_110=='_'||(LA16_110>='a' && LA16_110<='z')||LA16_110=='|'||LA16_110=='~') ) {s = 110;}

                        else if ( ((LA16_110>='\u0000' && LA16_110<='\u001F')||(LA16_110>='\"' && LA16_110<='#')||LA16_110=='%'||LA16_110=='\''||LA16_110==','||(LA16_110>=':' && LA16_110<=';')||LA16_110=='['||(LA16_110>=']' && LA16_110<='^')||LA16_110=='`'||LA16_110=='{'||LA16_110=='}'||(LA16_110>='\u007F' && LA16_110<='\uFFFF')) ) {s = 111;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA16_109 = input.LA(1);

                        s = -1;
                        if ( (LA16_109=='/') ) {s = 137;}

                        else if ( (LA16_109=='*') ) {s = 109;}

                        else if ( ((LA16_109>=' ' && LA16_109<='!')||LA16_109=='$'||LA16_109=='&'||(LA16_109>='(' && LA16_109<=')')||LA16_109=='+'||(LA16_109>='-' && LA16_109<='.')||(LA16_109>='0' && LA16_109<='9')||(LA16_109>='<' && LA16_109<='Z')||LA16_109=='\\'||LA16_109=='_'||(LA16_109>='a' && LA16_109<='z')||LA16_109=='|'||LA16_109=='~') ) {s = 110;}

                        else if ( ((LA16_109>='\u0000' && LA16_109<='\u001F')||(LA16_109>='\"' && LA16_109<='#')||LA16_109=='%'||LA16_109=='\''||LA16_109==','||(LA16_109>=':' && LA16_109<=';')||LA16_109=='['||(LA16_109>=']' && LA16_109<='^')||LA16_109=='`'||LA16_109=='{'||LA16_109=='}'||(LA16_109>='\u007F' && LA16_109<='\uFFFF')) ) {s = 111;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA16_32 = input.LA(1);

                        s = -1;
                        if ( ((LA16_32>='\u0000' && LA16_32<='\uFFFF')) ) {s = 80;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA16_79 = input.LA(1);

                        s = -1;
                        if ( (LA16_79=='*') ) {s = 109;}

                        else if ( ((LA16_79>=' ' && LA16_79<='!')||LA16_79=='$'||LA16_79=='&'||(LA16_79>='(' && LA16_79<=')')||LA16_79=='+'||(LA16_79>='-' && LA16_79<='9')||(LA16_79>='<' && LA16_79<='Z')||LA16_79=='\\'||LA16_79=='_'||(LA16_79>='a' && LA16_79<='z')||LA16_79=='|'||LA16_79=='~') ) {s = 110;}

                        else if ( ((LA16_79>='\u0000' && LA16_79<='\u001F')||(LA16_79>='\"' && LA16_79<='#')||LA16_79=='%'||LA16_79=='\''||LA16_79==','||(LA16_79>=':' && LA16_79<=';')||LA16_79=='['||(LA16_79>=']' && LA16_79<='^')||LA16_79=='`'||LA16_79=='{'||LA16_79=='}'||(LA16_79>='\u007F' && LA16_79<='\uFFFF')) ) {s = 111;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
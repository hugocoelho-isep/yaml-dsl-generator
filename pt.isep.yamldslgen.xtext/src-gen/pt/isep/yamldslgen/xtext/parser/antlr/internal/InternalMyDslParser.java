package pt.isep.yamldslgen.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.yamldslgen.xtext.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_GH_EXPRESSION", "RULE_YAML_SCALAR", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'name'", "':'", "'on'", "'concurrency'", "'defaults'", "'jobs'", "'permissions'", "'env'", "'true'", "'false'", "'>'", "'|'", "'-'", "'['", "']'", "';'", "','", "'{'", "'}'", "'push'", "'pull_request'", "'branches'", "'tags'", "'runs-on'", "'needs'", "'steps'", "'uses'", "'run'", "'with'", "'shell'", "'contents'", "'security-events'", "'actions'", "'pages'", "'id-token'", "'types'", "'pull-requests'", "'if'", "'continue-on-error'", "'issues'", "'strategy'", "'fail-fast'", "'matrix'", "'os'", "'build-type'", "'c-compiler'", "'cpp-compiler'", "'otp'", "'elixir'", "'include'", "'exclude'", "'workflow_call'", "'pull_request_target'", "'secrets'", "'required'", "'packages'", "'container'", "'image'", "'outputs'", "'release'", "'python-version'", "'configuration'", "'digests'", "'schedule'", "'workflow_dispatch'", "'cron'", "'group'", "'cancel-in-progress'", "'url'", "'environment'", "'id'", "'working-directory'"
    };
    public static final int T__50=50;
    public static final int RULE_BEG_BLOCK=4;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_END_BLOCK=5;
    public static final int RULE_ID=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int RULE_GH_EXPRESSION=7;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int RULE_YAML_SCALAR=8;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "GithubActions";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGithubActions"
    // InternalMyDsl.g:64:1: entryRuleGithubActions returns [EObject current=null] : iv_ruleGithubActions= ruleGithubActions EOF ;
    public final EObject entryRuleGithubActions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGithubActions = null;


        try {
            // InternalMyDsl.g:64:54: (iv_ruleGithubActions= ruleGithubActions EOF )
            // InternalMyDsl.g:65:2: iv_ruleGithubActions= ruleGithubActions EOF
            {
             newCompositeNode(grammarAccess.getGithubActionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGithubActions=ruleGithubActions();

            state._fsp--;

             current =iv_ruleGithubActions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGithubActions"


    // $ANTLR start "ruleGithubActions"
    // InternalMyDsl.g:71:1: ruleGithubActions returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGithubActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_BEG_BLOCK_15=null;
        Token this_END_BLOCK_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token this_BEG_BLOCK_23=null;
        Token this_END_BLOCK_25=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_on_6_0 = null;

        EObject lv_concurrency_9_0 = null;

        EObject lv_defaults_12_0 = null;

        EObject lv_jobs_16_0 = null;

        EObject lv_permissions_20_0 = null;

        EObject lv_env_24_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=8;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3) ) {
                    alt7=4;
                }
                else if ( LA7_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4) ) {
                    alt7=5;
                }
                else if ( LA7_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5) ) {
                    alt7=6;
                }
                else if ( LA7_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 6) ) {
                    alt7=7;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:86:4: {...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyDsl.g:86:107: ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:87:5: ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyDsl.g:90:8: ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:90:9: {...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:90:18: (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) )
            	    // InternalMyDsl.g:90:19: otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGithubActionsAccess().getNameKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,16,FOLLOW_4); 

            	    								newLeafNode(otherlv_2, grammarAccess.getGithubActionsAccess().getColonKeyword_0_1());
            	    							
            	    // InternalMyDsl.g:98:8: ( (lv_name_3_0= ruleEString ) )
            	    // InternalMyDsl.g:99:9: (lv_name_3_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:99:9: (lv_name_3_0= ruleEString )
            	    // InternalMyDsl.g:100:10: lv_name_3_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getNameEStringParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_name_3_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"name",
            	    											lv_name_3_0,
            	    											"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:123:3: ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:123:3: ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) )
            	    // InternalMyDsl.g:124:4: {...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyDsl.g:124:107: ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) )
            	    // InternalMyDsl.g:125:5: ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyDsl.g:128:8: ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) )
            	    // InternalMyDsl.g:128:9: {...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:128:18: (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) )
            	    // InternalMyDsl.g:128:19: otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_3); 

            	    								newLeafNode(otherlv_4, grammarAccess.getGithubActionsAccess().getOnKeyword_1_0());
            	    							
            	    otherlv_5=(Token)match(input,16,FOLLOW_6); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGithubActionsAccess().getColonKeyword_1_1());
            	    							
            	    // InternalMyDsl.g:136:8: ( (lv_on_6_0= ruleOn ) )
            	    // InternalMyDsl.g:137:9: (lv_on_6_0= ruleOn )
            	    {
            	    // InternalMyDsl.g:137:9: (lv_on_6_0= ruleOn )
            	    // InternalMyDsl.g:138:10: lv_on_6_0= ruleOn
            	    {

            	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getOnOnParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_on_6_0=ruleOn();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"on",
            	    											lv_on_6_0,
            	    											"pt.isep.yamldslgen.xtext.MyDsl.On");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) )
            	    // InternalMyDsl.g:162:4: {...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:162:107: ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) )
            	    // InternalMyDsl.g:163:5: ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:166:8: ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) )
            	    // InternalMyDsl.g:166:9: {...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:166:18: (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) )
            	    // InternalMyDsl.g:166:19: otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FOLLOW_3); 

            	    								newLeafNode(otherlv_7, grammarAccess.getGithubActionsAccess().getConcurrencyKeyword_2_0());
            	    							
            	    otherlv_8=(Token)match(input,16,FOLLOW_7); 

            	    								newLeafNode(otherlv_8, grammarAccess.getGithubActionsAccess().getColonKeyword_2_1());
            	    							
            	    // InternalMyDsl.g:174:8: ( (lv_concurrency_9_0= ruleConcurrency ) )
            	    // InternalMyDsl.g:175:9: (lv_concurrency_9_0= ruleConcurrency )
            	    {
            	    // InternalMyDsl.g:175:9: (lv_concurrency_9_0= ruleConcurrency )
            	    // InternalMyDsl.g:176:10: lv_concurrency_9_0= ruleConcurrency
            	    {

            	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getConcurrencyConcurrencyParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_concurrency_9_0=ruleConcurrency();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"concurrency",
            	    											lv_concurrency_9_0,
            	    											"pt.isep.yamldslgen.xtext.MyDsl.Concurrency");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:199:3: ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:199:3: ({...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) ) )
            	    // InternalMyDsl.g:200:4: {...}? => ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalMyDsl.g:200:107: ( ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) ) )
            	    // InternalMyDsl.g:201:5: ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalMyDsl.g:204:8: ({...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) ) )
            	    // InternalMyDsl.g:204:9: {...}? => (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:204:18: (otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) ) )
            	    // InternalMyDsl.g:204:19: otherlv_10= 'defaults' otherlv_11= ':' ( (lv_defaults_12_0= ruleDefaults ) )
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_10, grammarAccess.getGithubActionsAccess().getDefaultsKeyword_3_0());
            	    							
            	    otherlv_11=(Token)match(input,16,FOLLOW_8); 

            	    								newLeafNode(otherlv_11, grammarAccess.getGithubActionsAccess().getColonKeyword_3_1());
            	    							
            	    // InternalMyDsl.g:212:8: ( (lv_defaults_12_0= ruleDefaults ) )
            	    // InternalMyDsl.g:213:9: (lv_defaults_12_0= ruleDefaults )
            	    {
            	    // InternalMyDsl.g:213:9: (lv_defaults_12_0= ruleDefaults )
            	    // InternalMyDsl.g:214:10: lv_defaults_12_0= ruleDefaults
            	    {

            	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getDefaultsDefaultsParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_defaults_12_0=ruleDefaults();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"defaults",
            	    											lv_defaults_12_0,
            	    											"pt.isep.yamldslgen.xtext.MyDsl.Defaults");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:237:3: ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:237:3: ({...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:238:4: {...}? => ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalMyDsl.g:238:107: ( ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:239:5: ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalMyDsl.g:242:8: ({...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:242:9: {...}? => (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:242:18: (otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:242:19: otherlv_13= 'jobs' otherlv_14= ':' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_jobs_16_0= ruleJob ) )+ (this_END_BLOCK_17= RULE_END_BLOCK )?
            	    {
            	    otherlv_13=(Token)match(input,20,FOLLOW_3); 

            	    								newLeafNode(otherlv_13, grammarAccess.getGithubActionsAccess().getJobsKeyword_4_0());
            	    							
            	    otherlv_14=(Token)match(input,16,FOLLOW_9); 

            	    								newLeafNode(otherlv_14, grammarAccess.getGithubActionsAccess().getColonKeyword_4_1());
            	    							
            	    // InternalMyDsl.g:250:8: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_BEG_BLOCK) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMyDsl.g:251:9: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_9); 

            	            									newLeafNode(this_BEG_BLOCK_15, grammarAccess.getGithubActionsAccess().getBEG_BLOCKTerminalRuleCall_4_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:256:8: ( (lv_jobs_16_0= ruleJob ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)||(LA2_0>=23 && LA2_0<=26)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:257:9: (lv_jobs_16_0= ruleJob )
            	    	    {
            	    	    // InternalMyDsl.g:257:9: (lv_jobs_16_0= ruleJob )
            	    	    // InternalMyDsl.g:258:10: lv_jobs_16_0= ruleJob
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getJobsJobParserRuleCall_4_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_10);
            	    	    lv_jobs_16_0=ruleJob();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"jobs",
            	    	    											lv_jobs_16_0,
            	    	    											"pt.isep.yamldslgen.xtext.MyDsl.Job");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    // InternalMyDsl.g:275:8: (this_END_BLOCK_17= RULE_END_BLOCK )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_END_BLOCK) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMyDsl.g:276:9: this_END_BLOCK_17= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	            									newLeafNode(this_END_BLOCK_17, grammarAccess.getGithubActionsAccess().getEND_BLOCKTerminalRuleCall_4_4());
            	            								

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:287:3: ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:287:3: ({...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:288:4: {...}? => ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalMyDsl.g:288:107: ( ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:289:5: ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalMyDsl.g:292:8: ({...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:292:9: {...}? => (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:292:18: (otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:292:19: otherlv_18= 'permissions' otherlv_19= ':' ( (lv_permissions_20_0= rulePermissions ) )
            	    {
            	    otherlv_18=(Token)match(input,21,FOLLOW_3); 

            	    								newLeafNode(otherlv_18, grammarAccess.getGithubActionsAccess().getPermissionsKeyword_5_0());
            	    							
            	    otherlv_19=(Token)match(input,16,FOLLOW_11); 

            	    								newLeafNode(otherlv_19, grammarAccess.getGithubActionsAccess().getColonKeyword_5_1());
            	    							
            	    // InternalMyDsl.g:300:8: ( (lv_permissions_20_0= rulePermissions ) )
            	    // InternalMyDsl.g:301:9: (lv_permissions_20_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:301:9: (lv_permissions_20_0= rulePermissions )
            	    // InternalMyDsl.g:302:10: lv_permissions_20_0= rulePermissions
            	    {

            	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getPermissionsPermissionsParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_permissions_20_0=rulePermissions();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"permissions",
            	    											lv_permissions_20_0,
            	    											"pt.isep.yamldslgen.xtext.MyDsl.Permissions");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:325:3: ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:325:3: ({...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:326:4: {...}? => ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalMyDsl.g:326:107: ( ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:327:5: ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalMyDsl.g:330:8: ({...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:330:9: {...}? => (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:330:18: (otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:330:19: otherlv_21= 'env' otherlv_22= ':' ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? )
            	    {
            	    otherlv_21=(Token)match(input,22,FOLLOW_3); 

            	    								newLeafNode(otherlv_21, grammarAccess.getGithubActionsAccess().getEnvKeyword_6_0());
            	    							
            	    otherlv_22=(Token)match(input,16,FOLLOW_12); 

            	    								newLeafNode(otherlv_22, grammarAccess.getGithubActionsAccess().getColonKeyword_6_1());
            	    							
            	    // InternalMyDsl.g:338:8: ( (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:339:9: (this_BEG_BLOCK_23= RULE_BEG_BLOCK )? ( (lv_env_24_0= ruleKeyValuePair ) )+ (this_END_BLOCK_25= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:339:9: (this_BEG_BLOCK_23= RULE_BEG_BLOCK )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_BEG_BLOCK) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDsl.g:340:10: this_BEG_BLOCK_23= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_23=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            										newLeafNode(this_BEG_BLOCK_23, grammarAccess.getGithubActionsAccess().getBEG_BLOCKTerminalRuleCall_6_2_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:345:9: ( (lv_env_24_0= ruleKeyValuePair ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        alt5 = dfa5.predict(input);
            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:346:10: (lv_env_24_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:346:10: (lv_env_24_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:347:11: lv_env_24_0= ruleKeyValuePair
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getGithubActionsAccess().getEnvKeyValuePairParserRuleCall_6_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_env_24_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"env",
            	    	    												lv_env_24_0,
            	    	    												"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	    // InternalMyDsl.g:364:9: (this_END_BLOCK_25= RULE_END_BLOCK )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_END_BLOCK) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMyDsl.g:365:10: this_END_BLOCK_25= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_25=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	            										newLeafNode(this_END_BLOCK_25, grammarAccess.getGithubActionsAccess().getEND_BLOCKTerminalRuleCall_6_2_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGithubActionsAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canLeave(grammarAccess.getGithubActionsAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGithubActions"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:388:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:388:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:389:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:395:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_GH_EXPRESSION_1=null;
        AntlrDatatypeRuleToken this_BlockString_2 = null;

        AntlrDatatypeRuleToken this_ScalarSequence_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:401:2: ( (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence ) )
            // InternalMyDsl.g:402:2: (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence )
            {
            // InternalMyDsl.g:402:2: (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_GH_EXPRESSION:
                {
                alt8=2;
                }
                break;
            case 25:
            case 26:
                {
                alt8=3;
                }
                break;
            case RULE_YAML_SCALAR:
            case RULE_ID:
            case RULE_INT:
            case 23:
            case 24:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:403:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:411:3: this_GH_EXPRESSION_1= RULE_GH_EXPRESSION
                    {
                    this_GH_EXPRESSION_1=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_GH_EXPRESSION_1);
                    		

                    			newLeafNode(this_GH_EXPRESSION_1, grammarAccess.getEStringAccess().getGH_EXPRESSIONTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:419:3: this_BlockString_2= ruleBlockString
                    {

                    			newCompositeNode(grammarAccess.getEStringAccess().getBlockStringParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlockString_2=ruleBlockString();

                    state._fsp--;


                    			current.merge(this_BlockString_2);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:430:3: this_ScalarSequence_3= ruleScalarSequence
                    {

                    			newCompositeNode(grammarAccess.getEStringAccess().getScalarSequenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ScalarSequence_3=ruleScalarSequence();

                    state._fsp--;


                    			current.merge(this_ScalarSequence_3);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleScalarSequence"
    // InternalMyDsl.g:444:1: entryRuleScalarSequence returns [String current=null] : iv_ruleScalarSequence= ruleScalarSequence EOF ;
    public final String entryRuleScalarSequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarSequence = null;


        try {
            // InternalMyDsl.g:444:54: (iv_ruleScalarSequence= ruleScalarSequence EOF )
            // InternalMyDsl.g:445:2: iv_ruleScalarSequence= ruleScalarSequence EOF
            {
             newCompositeNode(grammarAccess.getScalarSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScalarSequence=ruleScalarSequence();

            state._fsp--;

             current =iv_ruleScalarSequence.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScalarSequence"


    // $ANTLR start "ruleScalarSequence"
    // InternalMyDsl.g:451:1: ruleScalarSequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* ) ;
    public final AntlrDatatypeRuleToken ruleScalarSequence() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_YAML_SCALAR_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;
        Token kw=null;
        Token this_YAML_SCALAR_6=null;
        Token this_ID_7=null;
        Token this_INT_8=null;


        	enterRule();

        try {
            // InternalMyDsl.g:457:2: ( ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* ) )
            // InternalMyDsl.g:458:2: ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* )
            {
            // InternalMyDsl.g:458:2: ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* )
            // InternalMyDsl.g:459:3: (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )*
            {
            // InternalMyDsl.g:459:3: (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_YAML_SCALAR:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:460:4: this_YAML_SCALAR_0= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_0=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_14); 

                    				current.merge(this_YAML_SCALAR_0);
                    			

                    				newLeafNode(this_YAML_SCALAR_0, grammarAccess.getScalarSequenceAccess().getYAML_SCALARTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:468:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_14); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getScalarSequenceAccess().getIDTerminalRuleCall_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:476:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_14); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getScalarSequenceAccess().getINTTerminalRuleCall_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:484:4: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getTrueKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:490:4: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getFalseKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:496:3: (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    switch ( input.LA(2) ) {
                    case RULE_YAML_SCALAR:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt11=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt11=1;
                        }
                        break;
                    case 23:
                        {
                        alt11=1;
                        }
                        break;
                    case 24:
                        {
                        alt11=1;
                        }
                        break;

                    }

                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:497:4: kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' )
            	    {
            	    kw=(Token)match(input,16,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getColonKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:502:4: (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' )
            	    int alt10=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_YAML_SCALAR:
            	        {
            	        alt10=1;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt10=2;
            	        }
            	        break;
            	    case RULE_INT:
            	        {
            	        alt10=3;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt10=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt10) {
            	        case 1 :
            	            // InternalMyDsl.g:503:5: this_YAML_SCALAR_6= RULE_YAML_SCALAR
            	            {
            	            this_YAML_SCALAR_6=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_14); 

            	            					current.merge(this_YAML_SCALAR_6);
            	            				

            	            					newLeafNode(this_YAML_SCALAR_6, grammarAccess.getScalarSequenceAccess().getYAML_SCALARTerminalRuleCall_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:511:5: this_ID_7= RULE_ID
            	            {
            	            this_ID_7=(Token)match(input,RULE_ID,FOLLOW_14); 

            	            					current.merge(this_ID_7);
            	            				

            	            					newLeafNode(this_ID_7, grammarAccess.getScalarSequenceAccess().getIDTerminalRuleCall_1_1_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:519:5: this_INT_8= RULE_INT
            	            {
            	            this_INT_8=(Token)match(input,RULE_INT,FOLLOW_14); 

            	            					current.merge(this_INT_8);
            	            				

            	            					newLeafNode(this_INT_8, grammarAccess.getScalarSequenceAccess().getINTTerminalRuleCall_1_1_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:527:5: kw= 'true'
            	            {
            	            kw=(Token)match(input,23,FOLLOW_14); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getTrueKeyword_1_1_3());
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalMyDsl.g:533:5: kw= 'false'
            	            {
            	            kw=(Token)match(input,24,FOLLOW_14); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getFalseKeyword_1_1_4());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScalarSequence"


    // $ANTLR start "entryRuleBlockString"
    // InternalMyDsl.g:544:1: entryRuleBlockString returns [String current=null] : iv_ruleBlockString= ruleBlockString EOF ;
    public final String entryRuleBlockString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockString = null;


        try {
            // InternalMyDsl.g:544:51: (iv_ruleBlockString= ruleBlockString EOF )
            // InternalMyDsl.g:545:2: iv_ruleBlockString= ruleBlockString EOF
            {
             newCompositeNode(grammarAccess.getBlockStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlockString=ruleBlockString();

            state._fsp--;

             current =iv_ruleBlockString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockString"


    // $ANTLR start "ruleBlockString"
    // InternalMyDsl.g:551:1: ruleBlockString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
    public final AntlrDatatypeRuleToken ruleBlockString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BEG_BLOCK_2=null;
        Token this_YAML_SCALAR_3=null;
        Token this_GH_EXPRESSION_4=null;
        Token this_ID_5=null;
        Token this_INT_6=null;
        Token this_STRING_7=null;
        Token this_ANY_OTHER_16=null;
        Token this_END_BLOCK_17=null;


        	enterRule();

        try {
            // InternalMyDsl.g:557:2: ( ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:558:2: ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:558:2: ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalMyDsl.g:559:3: (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:559:3: (kw= '>' | kw= '|' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:560:4: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:566:4: kw= '|'
                    {
                    kw=(Token)match(input,26,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLineKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:572:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BEG_BLOCK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:573:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_17); 

                    				current.merge(this_BEG_BLOCK_2);
                    			

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getBlockStringAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:581:3: (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )*
            loop14:
            do {
                int alt14=15;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:582:4: this_YAML_SCALAR_3= RULE_YAML_SCALAR
            	    {
            	    this_YAML_SCALAR_3=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_17); 

            	    				current.merge(this_YAML_SCALAR_3);
            	    			

            	    				newLeafNode(this_YAML_SCALAR_3, grammarAccess.getBlockStringAccess().getYAML_SCALARTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:590:4: this_GH_EXPRESSION_4= RULE_GH_EXPRESSION
            	    {
            	    this_GH_EXPRESSION_4=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_17); 

            	    				current.merge(this_GH_EXPRESSION_4);
            	    			

            	    				newLeafNode(this_GH_EXPRESSION_4, grammarAccess.getBlockStringAccess().getGH_EXPRESSIONTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:598:4: this_ID_5= RULE_ID
            	    {
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_17); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getBlockStringAccess().getIDTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:606:4: this_INT_6= RULE_INT
            	    {
            	    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_17); 

            	    				current.merge(this_INT_6);
            	    			

            	    				newLeafNode(this_INT_6, grammarAccess.getBlockStringAccess().getINTTerminalRuleCall_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:614:4: this_STRING_7= RULE_STRING
            	    {
            	    this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    				current.merge(this_STRING_7);
            	    			

            	    				newLeafNode(this_STRING_7, grammarAccess.getBlockStringAccess().getSTRINGTerminalRuleCall_2_4());
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:622:4: kw= '-'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getHyphenMinusKeyword_2_5());
            	    			

            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:628:4: kw= '['
            	    {
            	    kw=(Token)match(input,28,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftSquareBracketKeyword_2_6());
            	    			

            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:634:4: kw= ']'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightSquareBracketKeyword_2_7());
            	    			

            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:640:4: kw= ';'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getSemicolonKeyword_2_8());
            	    			

            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:646:4: kw= ':'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getColonKeyword_2_9());
            	    			

            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:652:4: kw= ','
            	    {
            	    kw=(Token)match(input,31,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getCommaKeyword_2_10());
            	    			

            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:658:4: kw= '{'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftCurlyBracketKeyword_2_11());
            	    			

            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:664:4: kw= '}'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_17); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightCurlyBracketKeyword_2_12());
            	    			

            	    }
            	    break;
            	case 14 :
            	    // InternalMyDsl.g:670:4: this_ANY_OTHER_16= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_16=(Token)match(input,RULE_ANY_OTHER,FOLLOW_17); 

            	    				current.merge(this_ANY_OTHER_16);
            	    			

            	    				newLeafNode(this_ANY_OTHER_16, grammarAccess.getBlockStringAccess().getANY_OTHERTerminalRuleCall_2_13());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:678:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_END_BLOCK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:679:4: this_END_BLOCK_17= RULE_END_BLOCK
                    {
                    this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				current.merge(this_END_BLOCK_17);
                    			

                    				newLeafNode(this_END_BLOCK_17, grammarAccess.getBlockStringAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockString"


    // $ANTLR start "entryRuleKeyName"
    // InternalMyDsl.g:691:1: entryRuleKeyName returns [String current=null] : iv_ruleKeyName= ruleKeyName EOF ;
    public final String entryRuleKeyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyName = null;


        try {
            // InternalMyDsl.g:691:47: (iv_ruleKeyName= ruleKeyName EOF )
            // InternalMyDsl.g:692:2: iv_ruleKeyName= ruleKeyName EOF
            {
             newCompositeNode(grammarAccess.getKeyNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyName=ruleKeyName();

            state._fsp--;

             current =iv_ruleKeyName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyName"


    // $ANTLR start "ruleKeyName"
    // InternalMyDsl.g:698:1: ruleKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' ) ;
    public final AntlrDatatypeRuleToken ruleKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_YAML_SCALAR_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:704:2: ( (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' ) )
            // InternalMyDsl.g:705:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' )
            {
            // InternalMyDsl.g:705:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' )
            int alt16=53;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_YAML_SCALAR:
                {
                alt16=2;
                }
                break;
            case RULE_INT:
                {
                alt16=3;
                }
                break;
            case 15:
                {
                alt16=4;
                }
                break;
            case 17:
                {
                alt16=5;
                }
                break;
            case 20:
                {
                alt16=6;
                }
                break;
            case 21:
                {
                alt16=7;
                }
                break;
            case 22:
                {
                alt16=8;
                }
                break;
            case 34:
                {
                alt16=9;
                }
                break;
            case 35:
                {
                alt16=10;
                }
                break;
            case 36:
                {
                alt16=11;
                }
                break;
            case 37:
                {
                alt16=12;
                }
                break;
            case 38:
                {
                alt16=13;
                }
                break;
            case 39:
                {
                alt16=14;
                }
                break;
            case 40:
                {
                alt16=15;
                }
                break;
            case 41:
                {
                alt16=16;
                }
                break;
            case 42:
                {
                alt16=17;
                }
                break;
            case 43:
                {
                alt16=18;
                }
                break;
            case 44:
                {
                alt16=19;
                }
                break;
            case 45:
                {
                alt16=20;
                }
                break;
            case 46:
                {
                alt16=21;
                }
                break;
            case 47:
                {
                alt16=22;
                }
                break;
            case 48:
                {
                alt16=23;
                }
                break;
            case 49:
                {
                alt16=24;
                }
                break;
            case 50:
                {
                alt16=25;
                }
                break;
            case 51:
                {
                alt16=26;
                }
                break;
            case 52:
                {
                alt16=27;
                }
                break;
            case 53:
                {
                alt16=28;
                }
                break;
            case 54:
                {
                alt16=29;
                }
                break;
            case 55:
                {
                alt16=30;
                }
                break;
            case 56:
                {
                alt16=31;
                }
                break;
            case 57:
                {
                alt16=32;
                }
                break;
            case 58:
                {
                alt16=33;
                }
                break;
            case 59:
                {
                alt16=34;
                }
                break;
            case 60:
                {
                alt16=35;
                }
                break;
            case 61:
                {
                alt16=36;
                }
                break;
            case 62:
                {
                alt16=37;
                }
                break;
            case 63:
                {
                alt16=38;
                }
                break;
            case 64:
                {
                alt16=39;
                }
                break;
            case 65:
                {
                alt16=40;
                }
                break;
            case 66:
                {
                alt16=41;
                }
                break;
            case 67:
                {
                alt16=42;
                }
                break;
            case 68:
                {
                alt16=43;
                }
                break;
            case 69:
                {
                alt16=44;
                }
                break;
            case 70:
                {
                alt16=45;
                }
                break;
            case 71:
                {
                alt16=46;
                }
                break;
            case 72:
                {
                alt16=47;
                }
                break;
            case 19:
                {
                alt16=48;
                }
                break;
            case 73:
                {
                alt16=49;
                }
                break;
            case 74:
                {
                alt16=50;
                }
                break;
            case 75:
                {
                alt16=51;
                }
                break;
            case 76:
                {
                alt16=52;
                }
                break;
            case 77:
                {
                alt16=53;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:706:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getKeyNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:714:3: this_YAML_SCALAR_1= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_1=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_2); 

                    			current.merge(this_YAML_SCALAR_1);
                    		

                    			newLeafNode(this_YAML_SCALAR_1, grammarAccess.getKeyNameAccess().getYAML_SCALARTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:722:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getKeyNameAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:730:3: kw= 'name'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getNameKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:736:3: kw= 'on'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOnKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:742:3: kw= 'jobs'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getJobsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:748:3: kw= 'permissions'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPermissionsKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:754:3: kw= 'env'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getEnvKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:760:3: kw= 'push'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPushKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:766:3: kw= 'pull_request'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPull_requestKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:772:3: kw= 'branches'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getBranchesKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:778:3: kw= 'tags'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getTagsKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:784:3: kw= 'runs-on'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRunsOnKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:790:3: kw= 'needs'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getNeedsKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:796:3: kw= 'steps'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getStepsKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:802:3: kw= 'uses'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getUsesKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:808:3: kw= 'run'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRunKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:814:3: kw= 'with'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getWithKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalMyDsl.g:820:3: kw= 'shell'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getShellKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalMyDsl.g:826:3: kw= 'contents'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getContentsKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalMyDsl.g:832:3: kw= 'security-events'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getSecurityEventsKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalMyDsl.g:838:3: kw= 'actions'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getActionsKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalMyDsl.g:844:3: kw= 'pages'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPagesKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalMyDsl.g:850:3: kw= 'id-token'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIdTokenKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalMyDsl.g:856:3: kw= 'types'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getTypesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalMyDsl.g:862:3: kw= 'pull-requests'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPullRequestsKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalMyDsl.g:868:3: kw= 'if'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalMyDsl.g:874:3: kw= 'continue-on-error'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getContinueOnErrorKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalMyDsl.g:880:3: kw= 'issues'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIssuesKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalMyDsl.g:886:3: kw= 'strategy'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getStrategyKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalMyDsl.g:892:3: kw= 'fail-fast'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getFailFastKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalMyDsl.g:898:3: kw= 'matrix'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getMatrixKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalMyDsl.g:904:3: kw= 'os'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOsKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalMyDsl.g:910:3: kw= 'build-type'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getBuildTypeKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalMyDsl.g:916:3: kw= 'c-compiler'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getCCompilerKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalMyDsl.g:922:3: kw= 'cpp-compiler'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getCppCompilerKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalMyDsl.g:928:3: kw= 'otp'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOtpKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalMyDsl.g:934:3: kw= 'elixir'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getElixirKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalMyDsl.g:940:3: kw= 'include'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIncludeKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalMyDsl.g:946:3: kw= 'exclude'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getExcludeKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalMyDsl.g:952:3: kw= 'workflow_call'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getWorkflow_callKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalMyDsl.g:958:3: kw= 'pull_request_target'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPull_request_targetKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalMyDsl.g:964:3: kw= 'secrets'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getSecretsKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalMyDsl.g:970:3: kw= 'required'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRequiredKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalMyDsl.g:976:3: kw= 'packages'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPackagesKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalMyDsl.g:982:3: kw= 'container'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getContainerKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalMyDsl.g:988:3: kw= 'image'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getImageKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalMyDsl.g:994:3: kw= 'defaults'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getDefaultsKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalMyDsl.g:1000:3: kw= 'outputs'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOutputsKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalMyDsl.g:1006:3: kw= 'release'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getReleaseKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalMyDsl.g:1012:3: kw= 'python-version'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPythonVersionKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalMyDsl.g:1018:3: kw= 'configuration'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getConfigurationKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalMyDsl.g:1024:3: kw= 'digests'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getDigestsKeyword_52());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyName"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalMyDsl.g:1033:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalMyDsl.g:1033:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalMyDsl.g:1034:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;

             current =iv_ruleKeyValuePair; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalMyDsl.g:1040:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1046:2: ( ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1047:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1047:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1048:3: ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1048:3: ( (lv_key_0_0= ruleKeyName ) )
            // InternalMyDsl.g:1049:4: (lv_key_0_0= ruleKeyName )
            {
            // InternalMyDsl.g:1049:4: (lv_key_0_0= ruleKeyName )
            // InternalMyDsl.g:1050:5: lv_key_0_0= ruleKeyName
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getKeyKeyNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_key_0_0=ruleKeyName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_0_0,
            						"pt.isep.yamldslgen.xtext.MyDsl.KeyName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1071:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMyDsl.g:1072:4: (lv_value_2_0= ruleEString )
            {
            // InternalMyDsl.g:1072:4: (lv_value_2_0= ruleEString )
            // InternalMyDsl.g:1073:5: lv_value_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKeyValuePairAccess().getValueEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKeyValuePairRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"pt.isep.yamldslgen.xtext.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "entryRuleOn"
    // InternalMyDsl.g:1094:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
    public final EObject entryRuleOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOn = null;


        try {
            // InternalMyDsl.g:1094:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:1095:2: iv_ruleOn= ruleOn EOF
            {
             newCompositeNode(grammarAccess.getOnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOn=ruleOn();

            state._fsp--;

             current =iv_ruleOn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOn"


    // $ANTLR start "ruleOn"
    // InternalMyDsl.g:1101:1: ruleOn returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_26= RULE_END_BLOCK )? ) ;
    public final EObject ruleOn() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token this_BEG_BLOCK_14=null;
        Token this_END_BLOCK_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token this_END_BLOCK_26=null;
        EObject lv_push_5_0 = null;

        EObject lv_pullRequest_8_0 = null;

        EObject lv_pullRequestTarget_11_0 = null;

        EObject lv_schedule_15_0 = null;

        AntlrDatatypeRuleToken lv_workflowDispatch_19_0 = null;

        EObject lv_workflowCall_22_0 = null;

        EObject lv_release_25_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1107:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_26= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1108:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_26= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1108:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_26= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1109:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_26= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1109:3: ()
            // InternalMyDsl.g:1110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnAccess().getOnAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1116:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BEG_BLOCK) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1117:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_18); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1122:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1123:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1123:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1124:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1127:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1128:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1128:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) )*
            loop22:
            do {
                int alt22=8;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
                    alt22=4;
                }
                else if ( LA22_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4) ) {
                    alt22=5;
                }
                else if ( LA22_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5) ) {
                    alt22=6;
                }
                else if ( LA22_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6) ) {
                    alt22=7;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1129:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1129:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:1130:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1130:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:1131:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1134:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:1134:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1134:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:1134:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOnAccess().getPushKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOnAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1142:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:1143:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:1143:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:1144:11: lv_push_5_0= rulePush
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPushPushParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_push_5_0=rulePush();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOnRule());
            	    											}
            	    											set(
            	    												current,
            	    												"push",
            	    												lv_push_5_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Push");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1167:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1167:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:1168:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1168:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:1169:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1172:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:1172:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1172:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:1172:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getOnAccess().getPull_requestKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOnAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1180:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:1181:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:1181:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:1182:11: lv_pullRequest_8_0= rulePull_request
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPullRequestPull_requestParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_pullRequest_8_0=rulePull_request();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOnRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pullRequest",
            	    												lv_pullRequest_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Pull_request");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1205:4: ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1205:4: ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:1206:5: {...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1206:99: ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:1207:6: ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1210:9: ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:1210:10: {...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1210:19: (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:1210:20: otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) )
            	    {
            	    otherlv_9=(Token)match(input,67,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getOnAccess().getPull_request_targetKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_10, grammarAccess.getOnAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:1218:9: ( (lv_pullRequestTarget_11_0= rulePull_request ) )
            	    // InternalMyDsl.g:1219:10: (lv_pullRequestTarget_11_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:1219:10: (lv_pullRequestTarget_11_0= rulePull_request )
            	    // InternalMyDsl.g:1220:11: lv_pullRequestTarget_11_0= rulePull_request
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPullRequestTargetPull_requestParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_pullRequestTarget_11_0=rulePull_request();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOnRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pullRequestTarget",
            	    												lv_pullRequestTarget_11_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Pull_request");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:1243:4: ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1243:4: ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:1244:5: {...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1244:99: ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:1245:6: ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1248:9: ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:1248:10: {...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1248:19: (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:1248:20: otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? )
            	    {
            	    otherlv_12=(Token)match(input,78,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOnAccess().getScheduleKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_20); 

            	    									newLeafNode(otherlv_13, grammarAccess.getOnAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:1256:9: ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:1257:10: (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:1257:10: (this_BEG_BLOCK_14= RULE_BEG_BLOCK )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_BEG_BLOCK) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMyDsl.g:1258:11: this_BEG_BLOCK_14= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_14=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_20); 

            	            											newLeafNode(this_BEG_BLOCK_14, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1263:10: ( (lv_schedule_15_0= ruleSchedule ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==27) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1264:11: (lv_schedule_15_0= ruleSchedule )
            	    	    {
            	    	    // InternalMyDsl.g:1264:11: (lv_schedule_15_0= ruleSchedule )
            	    	    // InternalMyDsl.g:1265:12: lv_schedule_15_0= ruleSchedule
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getOnAccess().getScheduleScheduleParserRuleCall_2_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_21);
            	    	    lv_schedule_15_0=ruleSchedule();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getOnRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"schedule",
            	    	    													lv_schedule_15_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.Schedule");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    // InternalMyDsl.g:1282:10: (this_END_BLOCK_16= RULE_END_BLOCK )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==RULE_END_BLOCK) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMyDsl.g:1283:11: this_END_BLOCK_16= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_16=(Token)match(input,RULE_END_BLOCK,FOLLOW_18); 

            	            											newLeafNode(this_END_BLOCK_16, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_2_3_2_2());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:1295:4: ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:1295:4: ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) )
            	    // InternalMyDsl.g:1296:5: {...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:1296:99: ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) )
            	    // InternalMyDsl.g:1297:6: ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:1300:9: ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) )
            	    // InternalMyDsl.g:1300:10: {...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1300:19: (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? )
            	    // InternalMyDsl.g:1300:20: otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )?
            	    {
            	    otherlv_17=(Token)match(input,79,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getOnAccess().getWorkflow_dispatchKeyword_2_4_0());
            	    								
            	    otherlv_18=(Token)match(input,16,FOLLOW_22); 

            	    									newLeafNode(otherlv_18, grammarAccess.getOnAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:1308:9: ( (lv_workflowDispatch_19_0= ruleEString ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=23 && LA21_0<=26)) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMyDsl.g:1309:10: (lv_workflowDispatch_19_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1309:10: (lv_workflowDispatch_19_0= ruleEString )
            	            // InternalMyDsl.g:1310:11: lv_workflowDispatch_19_0= ruleEString
            	            {

            	            											newCompositeNode(grammarAccess.getOnAccess().getWorkflowDispatchEStringParserRuleCall_2_4_2_0());
            	            										
            	            pushFollow(FOLLOW_18);
            	            lv_workflowDispatch_19_0=ruleEString();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getOnRule());
            	            											}
            	            											set(
            	            												current,
            	            												"workflowDispatch",
            	            												lv_workflowDispatch_19_0,
            	            												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            											afterParserOrEnumRuleCall();
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:1333:4: ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1333:4: ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) )
            	    // InternalMyDsl.g:1334:5: {...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:1334:99: ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) )
            	    // InternalMyDsl.g:1335:6: ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:1338:9: ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) )
            	    // InternalMyDsl.g:1338:10: {...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1338:19: (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) )
            	    // InternalMyDsl.g:1338:20: otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) )
            	    {
            	    otherlv_20=(Token)match(input,66,FOLLOW_3); 

            	    									newLeafNode(otherlv_20, grammarAccess.getOnAccess().getWorkflow_callKeyword_2_5_0());
            	    								
            	    otherlv_21=(Token)match(input,16,FOLLOW_23); 

            	    									newLeafNode(otherlv_21, grammarAccess.getOnAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:1346:9: ( (lv_workflowCall_22_0= ruleWorkflow_call ) )
            	    // InternalMyDsl.g:1347:10: (lv_workflowCall_22_0= ruleWorkflow_call )
            	    {
            	    // InternalMyDsl.g:1347:10: (lv_workflowCall_22_0= ruleWorkflow_call )
            	    // InternalMyDsl.g:1348:11: lv_workflowCall_22_0= ruleWorkflow_call
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getWorkflowCallWorkflow_callParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_workflowCall_22_0=ruleWorkflow_call();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOnRule());
            	    											}
            	    											set(
            	    												current,
            	    												"workflowCall",
            	    												lv_workflowCall_22_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Workflow_call");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:1371:4: ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1371:4: ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) )
            	    // InternalMyDsl.g:1372:5: {...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:1372:99: ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) )
            	    // InternalMyDsl.g:1373:6: ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:1376:9: ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) )
            	    // InternalMyDsl.g:1376:10: {...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1376:19: (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) )
            	    // InternalMyDsl.g:1376:20: otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) )
            	    {
            	    otherlv_23=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getOnAccess().getReleaseKeyword_2_6_0());
            	    								
            	    otherlv_24=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_24, grammarAccess.getOnAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:1384:9: ( (lv_release_25_0= ruleRelease ) )
            	    // InternalMyDsl.g:1385:10: (lv_release_25_0= ruleRelease )
            	    {
            	    // InternalMyDsl.g:1385:10: (lv_release_25_0= ruleRelease )
            	    // InternalMyDsl.g:1386:11: lv_release_25_0= ruleRelease
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getReleaseReleaseParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_release_25_0=ruleRelease();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOnRule());
            	    											}
            	    											set(
            	    												current,
            	    												"release",
            	    												lv_release_25_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Release");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOnAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1416:3: (this_END_BLOCK_26= RULE_END_BLOCK )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_END_BLOCK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1417:4: this_END_BLOCK_26= RULE_END_BLOCK
                    {
                    this_END_BLOCK_26=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_26, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOn"


    // $ANTLR start "entryRulePush"
    // InternalMyDsl.g:1426:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalMyDsl.g:1426:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:1427:2: iv_rulePush= rulePush EOF
            {
             newCompositeNode(grammarAccess.getPushRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePush=rulePush();

            state._fsp--;

             current =iv_rulePush; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePush"


    // $ANTLR start "rulePush"
    // InternalMyDsl.g:1433:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
    public final EObject rulePush() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEG_BLOCK_5=null;
        Token otherlv_6=null;
        Token this_BEG_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token this_END_BLOCK_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_BEG_BLOCK_18=null;
        Token otherlv_19=null;
        Token this_BEG_BLOCK_20=null;
        Token this_END_BLOCK_22=null;
        Token this_END_BLOCK_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token this_END_BLOCK_29=null;
        AntlrDatatypeRuleToken lv_branches_8_0 = null;

        AntlrDatatypeRuleToken lv_branches_12_0 = null;

        AntlrDatatypeRuleToken lv_branches_14_0 = null;

        AntlrDatatypeRuleToken lv_tags_21_0 = null;

        AntlrDatatypeRuleToken lv_tags_25_0 = null;

        AntlrDatatypeRuleToken lv_tags_27_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1439:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1440:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1440:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1441:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1441:3: ()
            // InternalMyDsl.g:1442:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1452:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1453:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1453:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1454:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1457:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1458:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1458:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:1459:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1459:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1460:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1460:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1461:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1464:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1464:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1464:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1464:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPushAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPushAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1472:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_BEG_BLOCK) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==28) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalMyDsl.g:1473:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1473:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1474:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1478:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt24=0;
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==27) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1479:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1487:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1488:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1488:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1489:14: lv_branches_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
            	            	    lv_branches_8_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPushRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"branches",
            	            	    															lv_branches_8_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	    												newLeafNode(this_END_BLOCK_9, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_1_3());
            	            	    											

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt24 >= 1 ) break loop24;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(24, input);
            	                        throw eee;
            	                }
            	                cnt24++;
            	            } while (true);

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1517:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1517:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1518:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1522:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1523:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1523:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1524:13: lv_branches_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_branches_12_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getPushRule());
            	            													}
            	            													add(
            	            														current,
            	            														"branches",
            	            														lv_branches_12_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:1541:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==31) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1542:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPushAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1546:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1547:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1547:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1548:14: lv_branches_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_branches_14_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPushRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"branches",
            	            	    															lv_branches_14_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop25;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,29,FOLLOW_25); 

            	            											newLeafNode(otherlv_15, grammarAccess.getPushAccess().getRightSquareBracketKeyword_2_0_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPushAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1578:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1578:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1579:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1579:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1580:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1583:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1583:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1583:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1583:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,37,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPushAccess().getTagsKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPushAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1591:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_BEG_BLOCK) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==28) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalMyDsl.g:1592:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1592:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1593:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1597:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
            	            int cnt27=0;
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==27) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1598:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1606:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1607:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1607:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1608:14: lv_tags_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
            	            	    lv_tags_21_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPushRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"tags",
            	            	    															lv_tags_21_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	    												newLeafNode(this_END_BLOCK_22, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_1_3());
            	            	    											

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt27 >= 1 ) break loop27;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(27, input);
            	                        throw eee;
            	                }
            	                cnt27++;
            	            } while (true);

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1636:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1636:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1637:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1641:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1642:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1642:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:1643:13: lv_tags_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_tags_25_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getPushRule());
            	            													}
            	            													add(
            	            														current,
            	            														"tags",
            	            														lv_tags_25_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:1660:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==31) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1661:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPushAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1665:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1666:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1666:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1667:14: lv_tags_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_tags_27_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPushRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"tags",
            	            	    															lv_tags_27_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop28;
            	                }
            	            } while (true);

            	            otherlv_28=(Token)match(input,29,FOLLOW_25); 

            	            											newLeafNode(otherlv_28, grammarAccess.getPushAccess().getRightSquareBracketKeyword_2_1_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPushAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				

            }

            this_END_BLOCK_29=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_29, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePush"


    // $ANTLR start "entryRulePull_request"
    // InternalMyDsl.g:1712:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
    public final EObject entryRulePull_request() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_request = null;


        try {
            // InternalMyDsl.g:1712:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1713:2: iv_rulePull_request= rulePull_request EOF
            {
             newCompositeNode(grammarAccess.getPull_requestRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePull_request=rulePull_request();

            state._fsp--;

             current =iv_rulePull_request; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePull_request"


    // $ANTLR start "rulePull_request"
    // InternalMyDsl.g:1719:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
    public final EObject rulePull_request() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEG_BLOCK_5=null;
        Token otherlv_6=null;
        Token this_BEG_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token this_END_BLOCK_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_BEG_BLOCK_18=null;
        Token otherlv_19=null;
        Token this_BEG_BLOCK_20=null;
        Token this_END_BLOCK_22=null;
        Token this_END_BLOCK_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token this_END_BLOCK_29=null;
        AntlrDatatypeRuleToken lv_branches_8_0 = null;

        AntlrDatatypeRuleToken lv_branches_12_0 = null;

        AntlrDatatypeRuleToken lv_branches_14_0 = null;

        AntlrDatatypeRuleToken lv_types_21_0 = null;

        AntlrDatatypeRuleToken lv_types_25_0 = null;

        AntlrDatatypeRuleToken lv_types_27_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1725:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1726:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1726:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1727:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1727:3: ()
            // InternalMyDsl.g:1728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPull_requestAccess().getPull_requestAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_31); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1738:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1739:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1739:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1740:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPull_requestAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1743:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1744:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1744:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:1745:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1745:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1746:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1746:109: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1747:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1750:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1750:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1750:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1750:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPull_requestAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPull_requestAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1758:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_BEG_BLOCK) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==28) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalMyDsl.g:1759:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1759:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1760:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1764:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt31=0;
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==27) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1765:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1773:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1774:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1774:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1775:14: lv_branches_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
            	            	    lv_branches_8_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPull_requestRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"branches",
            	            	    															lv_branches_8_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	    												newLeafNode(this_END_BLOCK_9, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_1_3());
            	            	    											

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt31 >= 1 ) break loop31;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(31, input);
            	                        throw eee;
            	                }
            	                cnt31++;
            	            } while (true);

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_32); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1803:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1803:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1804:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1808:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1809:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1809:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1810:13: lv_branches_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_branches_12_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getPull_requestRule());
            	            													}
            	            													add(
            	            														current,
            	            														"branches",
            	            														lv_branches_12_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:1827:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==31) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1828:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPull_requestAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1832:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1833:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1833:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1834:14: lv_branches_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_branches_14_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPull_requestRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"branches",
            	            	    															lv_branches_14_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop32;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,29,FOLLOW_32); 

            	            											newLeafNode(otherlv_15, grammarAccess.getPull_requestAccess().getRightSquareBracketKeyword_2_0_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPull_requestAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1864:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1864:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1865:5: {...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1865:109: ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1866:6: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1869:9: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1869:10: {...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1869:19: (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1869:20: otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPull_requestAccess().getTypesKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPull_requestAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1877:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==RULE_BEG_BLOCK) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==28) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalMyDsl.g:1878:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1878:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1879:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1883:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
            	            int cnt34=0;
            	            loop34:
            	            do {
            	                int alt34=2;
            	                int LA34_0 = input.LA(1);

            	                if ( (LA34_0==27) ) {
            	                    alt34=1;
            	                }


            	                switch (alt34) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1884:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1892:12: ( (lv_types_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1893:13: (lv_types_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1893:13: (lv_types_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1894:14: lv_types_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
            	            	    lv_types_21_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPull_requestRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"types",
            	            	    															lv_types_21_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	    												newLeafNode(this_END_BLOCK_22, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_1_3());
            	            	    											

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt34 >= 1 ) break loop34;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(34, input);
            	                        throw eee;
            	                }
            	                cnt34++;
            	            } while (true);

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_32); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1922:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1922:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1923:11: otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1927:11: ( (lv_types_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1928:12: (lv_types_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1928:12: (lv_types_25_0= ruleEString )
            	            // InternalMyDsl.g:1929:13: lv_types_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_types_25_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getPull_requestRule());
            	            													}
            	            													add(
            	            														current,
            	            														"types",
            	            														lv_types_25_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:1946:11: (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )*
            	            loop35:
            	            do {
            	                int alt35=2;
            	                int LA35_0 = input.LA(1);

            	                if ( (LA35_0==31) ) {
            	                    alt35=1;
            	                }


            	                switch (alt35) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1947:12: otherlv_26= ',' ( (lv_types_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPull_requestAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1951:12: ( (lv_types_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1952:13: (lv_types_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1952:13: (lv_types_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1953:14: lv_types_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_types_27_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getPull_requestRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"types",
            	            	    															lv_types_27_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop35;
            	                }
            	            } while (true);

            	            otherlv_28=(Token)match(input,29,FOLLOW_32); 

            	            											newLeafNode(otherlv_28, grammarAccess.getPull_requestAccess().getRightSquareBracketKeyword_2_1_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPull_requestAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getPull_requestAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canLeave(grammarAccess.getPull_requestAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPull_requestAccess().getUnorderedGroup_2());
            				

            }

            this_END_BLOCK_29=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_29, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePull_request"


    // $ANTLR start "entryRuleSchedule"
    // InternalMyDsl.g:1999:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMyDsl.g:1999:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMyDsl.g:2000:2: iv_ruleSchedule= ruleSchedule EOF
            {
             newCompositeNode(grammarAccess.getScheduleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchedule=ruleSchedule();

            state._fsp--;

             current =iv_ruleSchedule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSchedule"


    // $ANTLR start "ruleSchedule"
    // InternalMyDsl.g:2006:1: ruleSchedule returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleSchedule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_cron_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2012:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2013:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2013:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2014:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:2018:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_BEG_BLOCK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2019:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_34); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getScheduleAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getCronKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:2032:3: ( (lv_cron_4_0= ruleEString ) )
            // InternalMyDsl.g:2033:4: (lv_cron_4_0= ruleEString )
            {
            // InternalMyDsl.g:2033:4: (lv_cron_4_0= ruleEString )
            // InternalMyDsl.g:2034:5: lv_cron_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getCronEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_35);
            lv_cron_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScheduleRule());
            					}
            					set(
            						current,
            						"cron",
            						lv_cron_4_0,
            						"pt.isep.yamldslgen.xtext.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:2051:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_END_BLOCK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2052:4: this_END_BLOCK_5= RULE_END_BLOCK
                    {
                    this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_5, grammarAccess.getScheduleAccess().getEND_BLOCKTerminalRuleCall_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSchedule"


    // $ANTLR start "entryRuleWorkflow_call"
    // InternalMyDsl.g:2061:1: entryRuleWorkflow_call returns [EObject current=null] : iv_ruleWorkflow_call= ruleWorkflow_call EOF ;
    public final EObject entryRuleWorkflow_call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow_call = null;


        try {
            // InternalMyDsl.g:2061:54: (iv_ruleWorkflow_call= ruleWorkflow_call EOF )
            // InternalMyDsl.g:2062:2: iv_ruleWorkflow_call= ruleWorkflow_call EOF
            {
             newCompositeNode(grammarAccess.getWorkflow_callRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkflow_call=ruleWorkflow_call();

            state._fsp--;

             current =iv_ruleWorkflow_call; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkflow_call"


    // $ANTLR start "ruleWorkflow_call"
    // InternalMyDsl.g:2068:1: ruleWorkflow_call returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? ) ;
    public final EObject ruleWorkflow_call() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEG_BLOCK_4=null;
        Token this_END_BLOCK_6=null;
        Token this_END_BLOCK_7=null;
        EObject lv_secrets_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2074:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2075:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2075:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2076:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2076:3: ()
            // InternalMyDsl.g:2077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkflow_callAccess().getWorkflow_callAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2083:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_BEG_BLOCK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2084:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_36); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getWorkflow_callAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2089:3: (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==68) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2090:4: otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )?
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkflow_callAccess().getSecretsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkflow_callAccess().getColonKeyword_2_1());
                    			
                    // InternalMyDsl.g:2098:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_BEG_BLOCK) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:2099:5: this_BEG_BLOCK_4= RULE_BEG_BLOCK
                            {
                            this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_9); 

                            					newLeafNode(this_BEG_BLOCK_4, grammarAccess.getWorkflow_callAccess().getBEG_BLOCKTerminalRuleCall_2_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:2104:4: ( (lv_secrets_5_0= ruleSecret ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_INT)||(LA42_0>=23 && LA42_0<=26)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMyDsl.g:2105:5: (lv_secrets_5_0= ruleSecret )
                    	    {
                    	    // InternalMyDsl.g:2105:5: (lv_secrets_5_0= ruleSecret )
                    	    // InternalMyDsl.g:2106:6: lv_secrets_5_0= ruleSecret
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkflow_callAccess().getSecretsSecretParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_37);
                    	    lv_secrets_5_0=ruleSecret();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getWorkflow_callRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"secrets",
                    	    							lv_secrets_5_0,
                    	    							"pt.isep.yamldslgen.xtext.MyDsl.Secret");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    // InternalMyDsl.g:2123:4: (this_END_BLOCK_6= RULE_END_BLOCK )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_END_BLOCK) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyDsl.g:2124:5: this_END_BLOCK_6= RULE_END_BLOCK
                            {
                            this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_35); 

                            					newLeafNode(this_END_BLOCK_6, grammarAccess.getWorkflow_callAccess().getEND_BLOCKTerminalRuleCall_2_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2130:3: (this_END_BLOCK_7= RULE_END_BLOCK )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_END_BLOCK) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2131:4: this_END_BLOCK_7= RULE_END_BLOCK
                    {
                    this_END_BLOCK_7=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_7, grammarAccess.getWorkflow_callAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkflow_call"


    // $ANTLR start "entryRuleSecret"
    // InternalMyDsl.g:2140:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalMyDsl.g:2140:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalMyDsl.g:2141:2: iv_ruleSecret= ruleSecret EOF
            {
             newCompositeNode(grammarAccess.getSecretRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSecret=ruleSecret();

            state._fsp--;

             current =iv_ruleSecret; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSecret"


    // $ANTLR start "ruleSecret"
    // InternalMyDsl.g:2147:1: ruleSecret returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? ) ;
    public final EObject ruleSecret() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_END_BLOCK_6=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_required_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2153:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2154:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2154:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2155:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2155:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2156:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2156:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2157:5: lv_id_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSecretAccess().getIdEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSecretRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"pt.isep.yamldslgen.xtext.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getSecretAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2178:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BEG_BLOCK) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2179:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_39); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getSecretAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2184:3: (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==69) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2185:4: otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSecretAccess().getRequiredKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getColonKeyword_3_1());
                    			
                    // InternalMyDsl.g:2193:4: ( (lv_required_5_0= ruleEBoolean ) )
                    // InternalMyDsl.g:2194:5: (lv_required_5_0= ruleEBoolean )
                    {
                    // InternalMyDsl.g:2194:5: (lv_required_5_0= ruleEBoolean )
                    // InternalMyDsl.g:2195:6: lv_required_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSecretAccess().getRequiredEBooleanParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_required_5_0=ruleEBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecretRule());
                    						}
                    						set(
                    							current,
                    							"required",
                    							lv_required_5_0,
                    							"pt.isep.yamldslgen.xtext.MyDsl.EBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2213:3: (this_END_BLOCK_6= RULE_END_BLOCK )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_END_BLOCK) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2214:4: this_END_BLOCK_6= RULE_END_BLOCK
                    {
                    this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_6, grammarAccess.getSecretAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSecret"


    // $ANTLR start "entryRuleConcurrency"
    // InternalMyDsl.g:2223:1: entryRuleConcurrency returns [EObject current=null] : iv_ruleConcurrency= ruleConcurrency EOF ;
    public final EObject entryRuleConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrency = null;


        try {
            // InternalMyDsl.g:2223:52: (iv_ruleConcurrency= ruleConcurrency EOF )
            // InternalMyDsl.g:2224:2: iv_ruleConcurrency= ruleConcurrency EOF
            {
             newCompositeNode(grammarAccess.getConcurrencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcurrency=ruleConcurrency();

            state._fsp--;

             current =iv_ruleConcurrency; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConcurrency"


    // $ANTLR start "ruleConcurrency"
    // InternalMyDsl.g:2230:1: ruleConcurrency returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
    public final EObject ruleConcurrency() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_END_BLOCK_9=null;
        AntlrDatatypeRuleToken lv_group_5_0 = null;

        AntlrDatatypeRuleToken lv_cancelInProgress_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2236:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2237:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2237:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2238:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2238:3: ()
            // InternalMyDsl.g:2239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcurrencyAccess().getConcurrencyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2245:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_BEG_BLOCK) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2246:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_41); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getConcurrencyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2251:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2252:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2252:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2253:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2256:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2257:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2257:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            loop50:
            do {
                int alt50=3;
                int LA50_0 = input.LA(1);

                if ( LA50_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
                    alt50=2;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:2258:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2258:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2259:5: {...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2259:108: ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2260:6: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2263:9: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2263:10: {...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:2263:19: (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2263:20: otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,81,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getConcurrencyAccess().getGroupKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConcurrencyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2271:9: ( (lv_group_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2272:10: (lv_group_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2272:10: (lv_group_5_0= ruleEString )
            	    // InternalMyDsl.g:2273:11: lv_group_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getGroupEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_group_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConcurrencyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"group",
            	    												lv_group_5_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2296:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2296:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:2297:5: {...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2297:108: ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:2298:6: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2301:9: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:2301:10: {...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:2301:19: (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:2301:20: otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,82,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConcurrencyAccess().getCancelInProgressKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_40); 

            	    									newLeafNode(otherlv_7, grammarAccess.getConcurrencyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2309:9: ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:2310:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:2310:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    // InternalMyDsl.g:2311:11: lv_cancelInProgress_8_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getCancelInProgressEBooleanParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
            	    lv_cancelInProgress_8_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getConcurrencyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cancelInProgress",
            	    												lv_cancelInProgress_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:2341:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_END_BLOCK) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2342:4: this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_9, grammarAccess.getConcurrencyAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConcurrency"


    // $ANTLR start "entryRuleEnvironment"
    // InternalMyDsl.g:2351:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:2351:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:2352:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalMyDsl.g:2358:1: ruleEnvironment returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_END_BLOCK_9=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_url_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2364:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2365:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2365:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2366:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2366:3: ()
            // InternalMyDsl.g:2367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2373:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BEG_BLOCK) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2374:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_42); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getEnvironmentAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2379:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2380:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2380:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2381:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2384:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2385:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2385:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            loop53:
            do {
                int alt53=3;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:2386:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2386:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2387:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2387:108: ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2388:6: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2391:9: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2391:10: {...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:2391:19: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2391:20: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2399:9: ( (lv_name_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2400:10: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2400:10: (lv_name_5_0= ruleEString )
            	    // InternalMyDsl.g:2401:11: lv_name_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_name_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_5_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2424:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2424:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2425:5: {...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2425:108: ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2426:6: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2429:9: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2429:10: {...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:2429:19: (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2429:20: otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,83,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2437:9: ( (lv_url_8_0= ruleEString ) )
            	    // InternalMyDsl.g:2438:10: (lv_url_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2438:10: (lv_url_8_0= ruleEString )
            	    // InternalMyDsl.g:2439:11: lv_url_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getUrlEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_42);
            	    lv_url_8_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    											}
            	    											set(
            	    												current,
            	    												"url",
            	    												lv_url_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:2469:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_END_BLOCK) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2470:4: this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_9, grammarAccess.getEnvironmentAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRulePermissions"
    // InternalMyDsl.g:2479:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // InternalMyDsl.g:2479:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalMyDsl.g:2480:2: iv_rulePermissions= rulePermissions EOF
            {
             newCompositeNode(grammarAccess.getPermissionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissions=rulePermissions();

            state._fsp--;

             current =iv_rulePermissions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissions"


    // $ANTLR start "rulePermissions"
    // InternalMyDsl.g:2486:1: rulePermissions returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? ) ;
    public final EObject rulePermissions() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token this_END_BLOCK_27=null;
        AntlrDatatypeRuleToken lv_contents_5_0 = null;

        AntlrDatatypeRuleToken lv_securityEvents_8_0 = null;

        AntlrDatatypeRuleToken lv_actions_11_0 = null;

        AntlrDatatypeRuleToken lv_pages_14_0 = null;

        AntlrDatatypeRuleToken lv_idToken_17_0 = null;

        AntlrDatatypeRuleToken lv_pullRequests_20_0 = null;

        AntlrDatatypeRuleToken lv_issues_23_0 = null;

        AntlrDatatypeRuleToken lv_packages_26_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2492:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2493:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2493:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2494:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2494:3: ()
            // InternalMyDsl.g:2495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionsAccess().getPermissionsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2501:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_BEG_BLOCK) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2502:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_43); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPermissionsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2507:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2508:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2508:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2509:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2512:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2513:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2513:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*
            loop56:
            do {
                int alt56=9;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:2514:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2514:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2515:5: {...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2515:108: ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2516:6: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2519:9: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2519:10: {...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2519:19: (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2519:20: otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPermissionsAccess().getContentsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPermissionsAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2527:9: ( (lv_contents_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2528:10: (lv_contents_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2528:10: (lv_contents_5_0= ruleEString )
            	    // InternalMyDsl.g:2529:11: lv_contents_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getContentsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_contents_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"contents",
            	    												lv_contents_5_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2552:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2552:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2553:5: {...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2553:108: ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2554:6: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2557:9: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2557:10: {...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2557:19: (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2557:20: otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPermissionsAccess().getSecurityEventsKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPermissionsAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2565:9: ( (lv_securityEvents_8_0= ruleEString ) )
            	    // InternalMyDsl.g:2566:10: (lv_securityEvents_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2566:10: (lv_securityEvents_8_0= ruleEString )
            	    // InternalMyDsl.g:2567:11: lv_securityEvents_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getSecurityEventsEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_securityEvents_8_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"securityEvents",
            	    												lv_securityEvents_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:2590:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2590:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2591:5: {...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2591:108: ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2592:6: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2595:9: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2595:10: {...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2595:19: (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2595:20: otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,47,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getPermissionsAccess().getActionsKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPermissionsAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:2603:9: ( (lv_actions_11_0= ruleEString ) )
            	    // InternalMyDsl.g:2604:10: (lv_actions_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2604:10: (lv_actions_11_0= ruleEString )
            	    // InternalMyDsl.g:2605:11: lv_actions_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getActionsEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_actions_11_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"actions",
            	    												lv_actions_11_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:2628:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2628:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2629:5: {...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2629:108: ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2630:6: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2633:9: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2633:10: {...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2633:19: (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2633:20: otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPermissionsAccess().getPagesKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getPermissionsAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:2641:9: ( (lv_pages_14_0= ruleEString ) )
            	    // InternalMyDsl.g:2642:10: (lv_pages_14_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2642:10: (lv_pages_14_0= ruleEString )
            	    // InternalMyDsl.g:2643:11: lv_pages_14_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPagesEStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_pages_14_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pages",
            	    												lv_pages_14_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:2666:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2666:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2667:5: {...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2667:108: ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2668:6: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2671:9: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2671:10: {...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2671:19: (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2671:20: otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getPermissionsAccess().getIdTokenKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPermissionsAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:2679:9: ( (lv_idToken_17_0= ruleEString ) )
            	    // InternalMyDsl.g:2680:10: (lv_idToken_17_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2680:10: (lv_idToken_17_0= ruleEString )
            	    // InternalMyDsl.g:2681:11: lv_idToken_17_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getIdTokenEStringParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_idToken_17_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"idToken",
            	    												lv_idToken_17_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:2704:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2704:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2705:5: {...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:2705:108: ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2706:6: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:2709:9: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2709:10: {...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2709:19: (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2709:20: otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getPermissionsAccess().getPullRequestsKeyword_2_5_0());
            	    								
            	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getPermissionsAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:2717:9: ( (lv_pullRequests_20_0= ruleEString ) )
            	    // InternalMyDsl.g:2718:10: (lv_pullRequests_20_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2718:10: (lv_pullRequests_20_0= ruleEString )
            	    // InternalMyDsl.g:2719:11: lv_pullRequests_20_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPullRequestsEStringParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_pullRequests_20_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"pullRequests",
            	    												lv_pullRequests_20_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:2742:4: ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2742:4: ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2743:5: {...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:2743:108: ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2744:6: ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:2747:9: ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2747:10: {...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2747:19: (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2747:20: otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) )
            	    {
            	    otherlv_21=(Token)match(input,54,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getPermissionsAccess().getIssuesKeyword_2_6_0());
            	    								
            	    otherlv_22=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_22, grammarAccess.getPermissionsAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:2755:9: ( (lv_issues_23_0= ruleEString ) )
            	    // InternalMyDsl.g:2756:10: (lv_issues_23_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2756:10: (lv_issues_23_0= ruleEString )
            	    // InternalMyDsl.g:2757:11: lv_issues_23_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getIssuesEStringParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_issues_23_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"issues",
            	    												lv_issues_23_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:2780:4: ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2780:4: ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2781:5: {...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:2781:108: ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2782:6: ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:2785:9: ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2785:10: {...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2785:19: (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2785:20: otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,70,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getPermissionsAccess().getPackagesKeyword_2_7_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getPermissionsAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalMyDsl.g:2793:9: ( (lv_packages_26_0= ruleEString ) )
            	    // InternalMyDsl.g:2794:10: (lv_packages_26_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2794:10: (lv_packages_26_0= ruleEString )
            	    // InternalMyDsl.g:2795:11: lv_packages_26_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPackagesEStringParserRuleCall_2_7_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_packages_26_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getPermissionsRule());
            	    											}
            	    											set(
            	    												current,
            	    												"packages",
            	    												lv_packages_26_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:2825:3: (this_END_BLOCK_27= RULE_END_BLOCK )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_END_BLOCK) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2826:4: this_END_BLOCK_27= RULE_END_BLOCK
                    {
                    this_END_BLOCK_27=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_27, grammarAccess.getPermissionsAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermissions"


    // $ANTLR start "entryRuleJob"
    // InternalMyDsl.g:2835:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDsl.g:2835:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDsl.g:2836:2: iv_ruleJob= ruleJob EOF
            {
             newCompositeNode(grammarAccess.getJobRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJob=ruleJob();

            state._fsp--;

             current =iv_ruleJob; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJob"


    // $ANTLR start "ruleJob"
    // InternalMyDsl.g:2842:1: ruleJob returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_BEG_BLOCK_13=null;
        Token otherlv_14=null;
        Token this_BEG_BLOCK_15=null;
        Token this_END_BLOCK_17=null;
        Token this_END_BLOCK_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token this_BEG_BLOCK_44=null;
        Token this_END_BLOCK_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token this_BEG_BLOCK_52=null;
        Token this_END_BLOCK_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token this_BEG_BLOCK_57=null;
        Token this_END_BLOCK_59=null;
        Token this_END_BLOCK_60=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_runsOn_9_0 = null;

        AntlrDatatypeRuleToken lv_needs_12_0 = null;

        AntlrDatatypeRuleToken lv_needs_16_0 = null;

        AntlrDatatypeRuleToken lv_needs_20_0 = null;

        AntlrDatatypeRuleToken lv_needs_22_0 = null;

        AntlrDatatypeRuleToken lv_if_26_0 = null;

        AntlrDatatypeRuleToken lv_uses_29_0 = null;

        EObject lv_environment_32_0 = null;

        EObject lv_strategy_35_0 = null;

        EObject lv_container_38_0 = null;

        EObject lv_outputs_41_0 = null;

        EObject lv_steps_45_0 = null;

        EObject lv_permissions_49_0 = null;

        EObject lv_env_53_0 = null;

        EObject lv_with_58_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2848:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2849:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2849:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2850:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2850:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2851:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2851:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2852:5: lv_id_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getJobAccess().getIdEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJobRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"pt.isep.yamldslgen.xtext.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2873:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_BEG_BLOCK) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2874:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_45); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2879:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2880:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2880:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2881:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2884:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:2885:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2885:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop73:
            do {
                int alt73=14;
                alt73 = dfa73.predict(input);
                switch (alt73) {
            	case 1 :
            	    // InternalMyDsl.g:2886:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2886:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2887:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2887:100: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2888:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2891:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2891:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2891:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2891:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getJobAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJobAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:2899:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2900:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2900:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2901:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_name_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_6_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:2924:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2924:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2925:5: {...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2925:100: ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2926:6: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2929:9: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2929:10: {...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2929:19: (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2929:20: otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJobAccess().getRunsOnKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:2937:9: ( (lv_runsOn_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2938:10: (lv_runsOn_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2938:10: (lv_runsOn_9_0= ruleEString )
            	    // InternalMyDsl.g:2939:11: lv_runsOn_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getRunsOnEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_runsOn_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"runsOn",
            	    												lv_runsOn_9_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:2962:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2962:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:2963:5: {...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2963:100: ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalMyDsl.g:2964:6: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2967:9: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalMyDsl.g:2967:10: {...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2967:19: (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    // InternalMyDsl.g:2967:20: otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    {
            	    otherlv_10=(Token)match(input,39,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getJobAccess().getNeedsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_46); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJobAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:2975:9: ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    int alt63=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_STRING:
            	    case RULE_GH_EXPRESSION:
            	    case RULE_YAML_SCALAR:
            	    case RULE_ID:
            	    case RULE_INT:
            	    case 23:
            	    case 24:
            	    case 25:
            	    case 26:
            	        {
            	        alt63=1;
            	        }
            	        break;
            	    case RULE_BEG_BLOCK:
            	        {
            	        alt63=2;
            	        }
            	        break;
            	    case 28:
            	        {
            	        alt63=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 63, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt63) {
            	        case 1 :
            	            // InternalMyDsl.g:2976:10: ( (lv_needs_12_0= ruleEString ) )
            	            {
            	            // InternalMyDsl.g:2976:10: ( (lv_needs_12_0= ruleEString ) )
            	            // InternalMyDsl.g:2977:11: (lv_needs_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2977:11: (lv_needs_12_0= ruleEString )
            	            // InternalMyDsl.g:2978:12: lv_needs_12_0= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_0_0());
            	            											
            	            pushFollow(FOLLOW_45);
            	            lv_needs_12_0=ruleEString();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getJobRule());
            	            												}
            	            												add(
            	            													current,
            	            													"needs",
            	            													lv_needs_12_0,
            	            													"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:2996:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:2996:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            // InternalMyDsl.g:2997:11: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_13, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:3001:11: (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+
            	            int cnt61=0;
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);

            	                if ( (LA61_0==27) ) {
            	                    alt61=1;
            	                }


            	                switch (alt61) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:3002:12: otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_14=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_14, grammarAccess.getJobAccess().getHyphenMinusKeyword_3_2_2_1_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:3006:12: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	            	    int alt59=2;
            	            	    int LA59_0 = input.LA(1);

            	            	    if ( (LA59_0==RULE_BEG_BLOCK) ) {
            	            	        alt59=1;
            	            	    }
            	            	    switch (alt59) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:3007:13: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_15, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:3012:12: ( (lv_needs_16_0= ruleEString ) )
            	            	    // InternalMyDsl.g:3013:13: (lv_needs_16_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:3013:13: (lv_needs_16_0= ruleEString )
            	            	    // InternalMyDsl.g:3014:14: lv_needs_16_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_1_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_needs_16_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getJobRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"needs",
            	            	    															lv_needs_16_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    // InternalMyDsl.g:3031:12: (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    int alt60=2;
            	            	    int LA60_0 = input.LA(1);

            	            	    if ( (LA60_0==RULE_END_BLOCK) ) {
            	            	        int LA60_1 = input.LA(2);

            	            	        if ( (LA60_1==RULE_END_BLOCK||LA60_1==27) ) {
            	            	            alt60=1;
            	            	        }
            	            	    }
            	            	    switch (alt60) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:3032:13: this_END_BLOCK_17= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	            													newLeafNode(this_END_BLOCK_17, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt61 >= 1 ) break loop61;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(61, input);
            	                        throw eee;
            	                }
            	                cnt61++;
            	            } while (true);

            	            this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_45); 

            	            											newLeafNode(this_END_BLOCK_18, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:3044:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            {
            	            // InternalMyDsl.g:3044:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            // InternalMyDsl.g:3045:11: otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']'
            	            {
            	            otherlv_19=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_3_2_2_2_0());
            	            										
            	            // InternalMyDsl.g:3049:11: ( (lv_needs_20_0= ruleEString ) )
            	            // InternalMyDsl.g:3050:12: (lv_needs_20_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:3050:12: (lv_needs_20_0= ruleEString )
            	            // InternalMyDsl.g:3051:13: lv_needs_20_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_needs_20_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getJobRule());
            	            													}
            	            													add(
            	            														current,
            	            														"needs",
            	            														lv_needs_20_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:3068:11: (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==31) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:3069:12: otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_21, grammarAccess.getJobAccess().getCommaKeyword_3_2_2_2_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:3073:12: ( (lv_needs_22_0= ruleEString ) )
            	            	    // InternalMyDsl.g:3074:13: (lv_needs_22_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:3074:13: (lv_needs_22_0= ruleEString )
            	            	    // InternalMyDsl.g:3075:14: lv_needs_22_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_needs_22_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getJobRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"needs",
            	            	    															lv_needs_22_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop62;
            	                }
            	            } while (true);

            	            otherlv_23=(Token)match(input,29,FOLLOW_45); 

            	            											newLeafNode(otherlv_23, grammarAccess.getJobAccess().getRightSquareBracketKeyword_3_2_2_2_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:3105:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3105:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3106:5: {...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:3106:100: ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3107:6: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:3110:9: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3110:10: {...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3110:19: (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3110:20: otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getJobAccess().getIfKeyword_3_3_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJobAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:3118:9: ( (lv_if_26_0= ruleEString ) )
            	    // InternalMyDsl.g:3119:10: (lv_if_26_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3119:10: (lv_if_26_0= ruleEString )
            	    // InternalMyDsl.g:3120:11: lv_if_26_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getIfEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_if_26_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"if",
            	    												lv_if_26_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:3143:4: ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3143:4: ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3144:5: {...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:3144:100: ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3145:6: ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:3148:9: ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3148:10: {...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3148:19: (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3148:20: otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) )
            	    {
            	    otherlv_27=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getJobAccess().getUsesKeyword_3_4_0());
            	    								
            	    otherlv_28=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_28, grammarAccess.getJobAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:3156:9: ( (lv_uses_29_0= ruleEString ) )
            	    // InternalMyDsl.g:3157:10: (lv_uses_29_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3157:10: (lv_uses_29_0= ruleEString )
            	    // InternalMyDsl.g:3158:11: lv_uses_29_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getUsesEStringParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_uses_29_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"uses",
            	    												lv_uses_29_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:3181:4: ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3181:4: ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) )
            	    // InternalMyDsl.g:3182:5: {...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:3182:100: ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) )
            	    // InternalMyDsl.g:3183:6: ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:3186:9: ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) )
            	    // InternalMyDsl.g:3186:10: {...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3186:19: (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) )
            	    // InternalMyDsl.g:3186:20: otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) )
            	    {
            	    otherlv_30=(Token)match(input,84,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getJobAccess().getEnvironmentKeyword_3_5_0());
            	    								
            	    otherlv_31=(Token)match(input,16,FOLLOW_47); 

            	    									newLeafNode(otherlv_31, grammarAccess.getJobAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:3194:9: ( (lv_environment_32_0= ruleEnvironment ) )
            	    // InternalMyDsl.g:3195:10: (lv_environment_32_0= ruleEnvironment )
            	    {
            	    // InternalMyDsl.g:3195:10: (lv_environment_32_0= ruleEnvironment )
            	    // InternalMyDsl.g:3196:11: lv_environment_32_0= ruleEnvironment
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_environment_32_0=ruleEnvironment();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"environment",
            	    												lv_environment_32_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Environment");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:3219:4: ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3219:4: ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) )
            	    // InternalMyDsl.g:3220:5: {...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:3220:100: ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) )
            	    // InternalMyDsl.g:3221:6: ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:3224:9: ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) )
            	    // InternalMyDsl.g:3224:10: {...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3224:19: (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) )
            	    // InternalMyDsl.g:3224:20: otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) )
            	    {
            	    otherlv_33=(Token)match(input,55,FOLLOW_3); 

            	    									newLeafNode(otherlv_33, grammarAccess.getJobAccess().getStrategyKeyword_3_6_0());
            	    								
            	    otherlv_34=(Token)match(input,16,FOLLOW_48); 

            	    									newLeafNode(otherlv_34, grammarAccess.getJobAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:3232:9: ( (lv_strategy_35_0= ruleStrategy ) )
            	    // InternalMyDsl.g:3233:10: (lv_strategy_35_0= ruleStrategy )
            	    {
            	    // InternalMyDsl.g:3233:10: (lv_strategy_35_0= ruleStrategy )
            	    // InternalMyDsl.g:3234:11: lv_strategy_35_0= ruleStrategy
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getStrategyStrategyParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_strategy_35_0=ruleStrategy();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"strategy",
            	    												lv_strategy_35_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Strategy");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:3257:4: ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3257:4: ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) )
            	    // InternalMyDsl.g:3258:5: {...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:3258:100: ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) )
            	    // InternalMyDsl.g:3259:6: ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:3262:9: ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) )
            	    // InternalMyDsl.g:3262:10: {...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3262:19: (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) )
            	    // InternalMyDsl.g:3262:20: otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) )
            	    {
            	    otherlv_36=(Token)match(input,71,FOLLOW_3); 

            	    									newLeafNode(otherlv_36, grammarAccess.getJobAccess().getContainerKeyword_3_7_0());
            	    								
            	    otherlv_37=(Token)match(input,16,FOLLOW_49); 

            	    									newLeafNode(otherlv_37, grammarAccess.getJobAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:3270:9: ( (lv_container_38_0= ruleContainer ) )
            	    // InternalMyDsl.g:3271:10: (lv_container_38_0= ruleContainer )
            	    {
            	    // InternalMyDsl.g:3271:10: (lv_container_38_0= ruleContainer )
            	    // InternalMyDsl.g:3272:11: lv_container_38_0= ruleContainer
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getContainerContainerParserRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_container_38_0=ruleContainer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"container",
            	    												lv_container_38_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Container");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:3295:4: ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3295:4: ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) )
            	    // InternalMyDsl.g:3296:5: {...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalMyDsl.g:3296:100: ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) )
            	    // InternalMyDsl.g:3297:6: ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalMyDsl.g:3300:9: ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) )
            	    // InternalMyDsl.g:3300:10: {...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3300:19: (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) )
            	    // InternalMyDsl.g:3300:20: otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) )
            	    {
            	    otherlv_39=(Token)match(input,73,FOLLOW_3); 

            	    									newLeafNode(otherlv_39, grammarAccess.getJobAccess().getOutputsKeyword_3_8_0());
            	    								
            	    otherlv_40=(Token)match(input,16,FOLLOW_50); 

            	    									newLeafNode(otherlv_40, grammarAccess.getJobAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalMyDsl.g:3308:9: ( (lv_outputs_41_0= ruleOutputs ) )
            	    // InternalMyDsl.g:3309:10: (lv_outputs_41_0= ruleOutputs )
            	    {
            	    // InternalMyDsl.g:3309:10: (lv_outputs_41_0= ruleOutputs )
            	    // InternalMyDsl.g:3310:11: lv_outputs_41_0= ruleOutputs
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getOutputsOutputsParserRuleCall_3_8_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_outputs_41_0=ruleOutputs();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"outputs",
            	    												lv_outputs_41_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Outputs");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:3333:4: ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:3333:4: ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3334:5: {...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalMyDsl.g:3334:100: ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3335:6: ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalMyDsl.g:3338:9: ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3338:10: {...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3338:19: (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3338:20: otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )?
            	    {
            	    otherlv_42=(Token)match(input,40,FOLLOW_3); 

            	    									newLeafNode(otherlv_42, grammarAccess.getJobAccess().getStepsKeyword_3_9_0());
            	    								
            	    otherlv_43=(Token)match(input,16,FOLLOW_20); 

            	    									newLeafNode(otherlv_43, grammarAccess.getJobAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalMyDsl.g:3346:9: (this_BEG_BLOCK_44= RULE_BEG_BLOCK )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_BEG_BLOCK) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalMyDsl.g:3347:10: this_BEG_BLOCK_44= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_44=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_20); 

            	            										newLeafNode(this_BEG_BLOCK_44, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_9_2());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3352:9: ( (lv_steps_45_0= ruleStep ) )+
            	    int cnt65=0;
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==27) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3353:10: (lv_steps_45_0= ruleStep )
            	    	    {
            	    	    // InternalMyDsl.g:3353:10: (lv_steps_45_0= ruleStep )
            	    	    // InternalMyDsl.g:3354:11: lv_steps_45_0= ruleStep
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_3_9_3_0());
            	    	    										
            	    	    pushFollow(FOLLOW_51);
            	    	    lv_steps_45_0=ruleStep();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"steps",
            	    	    												lv_steps_45_0,
            	    	    												"pt.isep.yamldslgen.xtext.MyDsl.Step");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt65 >= 1 ) break loop65;
            	                EarlyExitException eee =
            	                    new EarlyExitException(65, input);
            	                throw eee;
            	        }
            	        cnt65++;
            	    } while (true);

            	    // InternalMyDsl.g:3371:9: (this_END_BLOCK_46= RULE_END_BLOCK )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==RULE_END_BLOCK) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalMyDsl.g:3372:10: this_END_BLOCK_46= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_46=(Token)match(input,RULE_END_BLOCK,FOLLOW_45); 

            	            										newLeafNode(this_END_BLOCK_46, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_9_4());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:3383:4: ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3383:4: ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:3384:5: {...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalMyDsl.g:3384:101: ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:3385:6: ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalMyDsl.g:3388:9: ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:3388:10: {...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3388:19: (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:3388:20: otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) )
            	    {
            	    otherlv_47=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_47, grammarAccess.getJobAccess().getPermissionsKeyword_3_10_0());
            	    								
            	    otherlv_48=(Token)match(input,16,FOLLOW_52); 

            	    									newLeafNode(otherlv_48, grammarAccess.getJobAccess().getColonKeyword_3_10_1());
            	    								
            	    // InternalMyDsl.g:3396:9: ( (lv_permissions_49_0= rulePermissions ) )
            	    // InternalMyDsl.g:3397:10: (lv_permissions_49_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:3397:10: (lv_permissions_49_0= rulePermissions )
            	    // InternalMyDsl.g:3398:11: lv_permissions_49_0= rulePermissions
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getPermissionsPermissionsParserRuleCall_3_10_2_0());
            	    										
            	    pushFollow(FOLLOW_45);
            	    lv_permissions_49_0=rulePermissions();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"permissions",
            	    												lv_permissions_49_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Permissions");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:3421:4: ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3421:4: ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3422:5: {...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalMyDsl.g:3422:101: ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3423:6: ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalMyDsl.g:3426:9: ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3426:10: {...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3426:19: (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3426:20: otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? )
            	    {
            	    otherlv_50=(Token)match(input,22,FOLLOW_3); 

            	    									newLeafNode(otherlv_50, grammarAccess.getJobAccess().getEnvKeyword_3_11_0());
            	    								
            	    otherlv_51=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_51, grammarAccess.getJobAccess().getColonKeyword_3_11_1());
            	    								
            	    // InternalMyDsl.g:3434:9: ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3435:10: (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3435:10: (this_BEG_BLOCK_52= RULE_BEG_BLOCK )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==RULE_BEG_BLOCK) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalMyDsl.g:3436:11: this_BEG_BLOCK_52= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_52=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_52, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_11_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3441:10: ( (lv_env_53_0= ruleKeyValuePair ) )+
            	    int cnt68=0;
            	    loop68:
            	    do {
            	        int alt68=2;
            	        alt68 = dfa68.predict(input);
            	        switch (alt68) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3442:11: (lv_env_53_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3442:11: (lv_env_53_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3443:12: lv_env_53_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getJobAccess().getEnvKeyValuePairParserRuleCall_3_11_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_53);
            	    	    lv_env_53_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"env",
            	    	    													lv_env_53_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt68 >= 1 ) break loop68;
            	                EarlyExitException eee =
            	                    new EarlyExitException(68, input);
            	                throw eee;
            	        }
            	        cnt68++;
            	    } while (true);

            	    // InternalMyDsl.g:3460:10: (this_END_BLOCK_54= RULE_END_BLOCK )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==RULE_END_BLOCK) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalMyDsl.g:3461:11: this_END_BLOCK_54= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_54=(Token)match(input,RULE_END_BLOCK,FOLLOW_45); 

            	            											newLeafNode(this_END_BLOCK_54, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_11_2_2());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:3473:4: ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3473:4: ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3474:5: {...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalMyDsl.g:3474:101: ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3475:6: ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalMyDsl.g:3478:9: ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3478:10: {...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3478:19: (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3478:20: otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? )
            	    {
            	    otherlv_55=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_55, grammarAccess.getJobAccess().getWithKeyword_3_12_0());
            	    								
            	    otherlv_56=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_56, grammarAccess.getJobAccess().getColonKeyword_3_12_1());
            	    								
            	    // InternalMyDsl.g:3486:9: ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3487:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3487:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==RULE_BEG_BLOCK) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalMyDsl.g:3488:11: this_BEG_BLOCK_57= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_57=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_57, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_12_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3493:10: ( (lv_with_58_0= ruleKeyValuePair ) )+
            	    int cnt71=0;
            	    loop71:
            	    do {
            	        int alt71=2;
            	        alt71 = dfa71.predict(input);
            	        switch (alt71) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3494:11: (lv_with_58_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3494:11: (lv_with_58_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3495:12: lv_with_58_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getJobAccess().getWithKeyValuePairParserRuleCall_3_12_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_53);
            	    	    lv_with_58_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"with",
            	    	    													lv_with_58_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt71 >= 1 ) break loop71;
            	                EarlyExitException eee =
            	                    new EarlyExitException(71, input);
            	                throw eee;
            	        }
            	        cnt71++;
            	    } while (true);

            	    // InternalMyDsl.g:3512:10: (this_END_BLOCK_59= RULE_END_BLOCK )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==RULE_END_BLOCK) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalMyDsl.g:3513:11: this_END_BLOCK_59= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_59=(Token)match(input,RULE_END_BLOCK,FOLLOW_45); 

            	            											newLeafNode(this_END_BLOCK_59, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_12_2_2());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:3532:3: (this_END_BLOCK_60= RULE_END_BLOCK )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_END_BLOCK) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:3533:4: this_END_BLOCK_60= RULE_END_BLOCK
                    {
                    this_END_BLOCK_60=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_60, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJob"


    // $ANTLR start "entryRuleStep"
    // InternalMyDsl.g:3542:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalMyDsl.g:3542:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:3543:2: iv_ruleStep= ruleStep EOF
            {
             newCompositeNode(grammarAccess.getStepRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStep=ruleStep();

            state._fsp--;

             current =iv_ruleStep; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStep"


    // $ANTLR start "ruleStep"
    // InternalMyDsl.g:3549:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) ;
    public final EObject ruleStep() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token this_BEG_BLOCK_30=null;
        Token this_END_BLOCK_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token this_BEG_BLOCK_35=null;
        Token this_END_BLOCK_37=null;
        Token this_END_BLOCK_38=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_uses_12_0 = null;

        AntlrDatatypeRuleToken lv_run_15_0 = null;

        AntlrDatatypeRuleToken lv_if_18_0 = null;

        AntlrDatatypeRuleToken lv_workingDirectory_21_0 = null;

        AntlrDatatypeRuleToken lv_shell_24_0 = null;

        AntlrDatatypeRuleToken lv_continueOnError_27_0 = null;

        EObject lv_with_31_0 = null;

        EObject lv_env_36_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3555:2: ( ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:3556:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:3556:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            // InternalMyDsl.g:3557:3: () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:3557:3: ()
            // InternalMyDsl.g:3558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            // InternalMyDsl.g:3568:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_BEG_BLOCK) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:3569:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_55); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3574:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:3575:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:3575:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:3576:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:3579:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:3580:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:3580:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop82:
            do {
                int alt82=11;
                alt82 = dfa82.predict(input);
                switch (alt82) {
            	case 1 :
            	    // InternalMyDsl.g:3581:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3581:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3582:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:3582:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3583:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:3586:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3586:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3586:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3586:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getStepAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:3594:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:3595:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3595:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:3596:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_name_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"name",
            	    												lv_name_6_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:3619:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3619:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3620:5: {...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:3620:101: ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3621:6: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:3624:9: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3624:10: {...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3624:19: (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3624:20: otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,85,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStepAccess().getIdKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:3632:9: ( (lv_id_9_0= ruleEString ) )
            	    // InternalMyDsl.g:3633:10: (lv_id_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3633:10: (lv_id_9_0= ruleEString )
            	    // InternalMyDsl.g:3634:11: lv_id_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIdEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_id_9_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"id",
            	    												lv_id_9_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:3657:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3657:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3658:5: {...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:3658:101: ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3659:6: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:3662:9: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3662:10: {...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3662:19: (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3662:20: otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStepAccess().getUsesKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStepAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:3670:9: ( (lv_uses_12_0= ruleEString ) )
            	    // InternalMyDsl.g:3671:10: (lv_uses_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3671:10: (lv_uses_12_0= ruleEString )
            	    // InternalMyDsl.g:3672:11: lv_uses_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getUsesEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_uses_12_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"uses",
            	    												lv_uses_12_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:3695:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3695:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3696:5: {...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:3696:101: ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3697:6: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:3700:9: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3700:10: {...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3700:19: (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3700:20: otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStepAccess().getRunKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getStepAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:3708:9: ( (lv_run_15_0= ruleEString ) )
            	    // InternalMyDsl.g:3709:10: (lv_run_15_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3709:10: (lv_run_15_0= ruleEString )
            	    // InternalMyDsl.g:3710:11: lv_run_15_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_run_15_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"run",
            	    												lv_run_15_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:3733:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3733:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3734:5: {...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:3734:101: ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3735:6: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:3738:9: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3738:10: {...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3738:19: (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3738:20: otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getStepAccess().getIfKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getStepAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:3746:9: ( (lv_if_18_0= ruleEString ) )
            	    // InternalMyDsl.g:3747:10: (lv_if_18_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3747:10: (lv_if_18_0= ruleEString )
            	    // InternalMyDsl.g:3748:11: lv_if_18_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIfEStringParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_if_18_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"if",
            	    												lv_if_18_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:3771:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3771:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3772:5: {...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:3772:101: ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3773:6: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:3776:9: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3776:10: {...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3776:19: (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3776:20: otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,86,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getStepAccess().getWorkingDirectoryKeyword_3_5_0());
            	    								
            	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_20, grammarAccess.getStepAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:3784:9: ( (lv_workingDirectory_21_0= ruleEString ) )
            	    // InternalMyDsl.g:3785:10: (lv_workingDirectory_21_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3785:10: (lv_workingDirectory_21_0= ruleEString )
            	    // InternalMyDsl.g:3786:11: lv_workingDirectory_21_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getWorkingDirectoryEStringParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_workingDirectory_21_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"workingDirectory",
            	    												lv_workingDirectory_21_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:3809:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3809:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3810:5: {...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:3810:101: ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3811:6: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:3814:9: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3814:10: {...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3814:19: (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3814:20: otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,44,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getStepAccess().getShellKeyword_3_6_0());
            	    								
            	    otherlv_23=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getStepAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:3822:9: ( (lv_shell_24_0= ruleEString ) )
            	    // InternalMyDsl.g:3823:10: (lv_shell_24_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3823:10: (lv_shell_24_0= ruleEString )
            	    // InternalMyDsl.g:3824:11: lv_shell_24_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getShellEStringParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_shell_24_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"shell",
            	    												lv_shell_24_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:3847:4: ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3847:4: ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:3848:5: {...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:3848:101: ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:3849:6: ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:3852:9: ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:3852:10: {...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3852:19: (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:3852:20: otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) )
            	    {
            	    otherlv_25=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getStepAccess().getContinueOnErrorKeyword_3_7_0());
            	    								
            	    otherlv_26=(Token)match(input,16,FOLLOW_40); 

            	    									newLeafNode(otherlv_26, grammarAccess.getStepAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:3860:9: ( (lv_continueOnError_27_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:3861:10: (lv_continueOnError_27_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:3861:10: (lv_continueOnError_27_0= ruleEBoolean )
            	    // InternalMyDsl.g:3862:11: lv_continueOnError_27_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getContinueOnErrorEBooleanParserRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_55);
            	    lv_continueOnError_27_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"continueOnError",
            	    												lv_continueOnError_27_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:3885:4: ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3885:4: ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3886:5: {...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalMyDsl.g:3886:101: ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3887:6: ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalMyDsl.g:3890:9: ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3890:10: {...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3890:19: (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3890:20: otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? )
            	    {
            	    otherlv_28=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getStepAccess().getWithKeyword_3_8_0());
            	    								
            	    otherlv_29=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_29, grammarAccess.getStepAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalMyDsl.g:3898:9: ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3899:10: (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3899:10: (this_BEG_BLOCK_30= RULE_BEG_BLOCK )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==RULE_BEG_BLOCK) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // InternalMyDsl.g:3900:11: this_BEG_BLOCK_30= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_30=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_30, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_8_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3905:10: ( (lv_with_31_0= ruleKeyValuePair ) )+
            	    int cnt77=0;
            	    loop77:
            	    do {
            	        int alt77=2;
            	        alt77 = dfa77.predict(input);
            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3906:11: (lv_with_31_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3906:11: (lv_with_31_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3907:12: lv_with_31_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getWithKeyValuePairParserRuleCall_3_8_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_56);
            	    	    lv_with_31_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getStepRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"with",
            	    	    													lv_with_31_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt77 >= 1 ) break loop77;
            	                EarlyExitException eee =
            	                    new EarlyExitException(77, input);
            	                throw eee;
            	        }
            	        cnt77++;
            	    } while (true);

            	    // InternalMyDsl.g:3924:10: (this_END_BLOCK_32= RULE_END_BLOCK )?
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==RULE_END_BLOCK) ) {
            	        alt78=1;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalMyDsl.g:3925:11: this_END_BLOCK_32= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_32=(Token)match(input,RULE_END_BLOCK,FOLLOW_55); 

            	            											newLeafNode(this_END_BLOCK_32, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_3_8_2_2());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:3937:4: ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3937:4: ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3938:5: {...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalMyDsl.g:3938:101: ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3939:6: ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalMyDsl.g:3942:9: ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3942:10: {...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3942:19: (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3942:20: otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    {
            	    otherlv_33=(Token)match(input,22,FOLLOW_3); 

            	    									newLeafNode(otherlv_33, grammarAccess.getStepAccess().getEnvKeyword_3_9_0());
            	    								
            	    otherlv_34=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_34, grammarAccess.getStepAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalMyDsl.g:3950:9: ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3951:10: (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3951:10: (this_BEG_BLOCK_35= RULE_BEG_BLOCK )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==RULE_BEG_BLOCK) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalMyDsl.g:3952:11: this_BEG_BLOCK_35= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_35=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_35, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_9_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3957:10: ( (lv_env_36_0= ruleKeyValuePair ) )+
            	    int cnt80=0;
            	    loop80:
            	    do {
            	        int alt80=2;
            	        alt80 = dfa80.predict(input);
            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3958:11: (lv_env_36_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3958:11: (lv_env_36_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3959:12: lv_env_36_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getEnvKeyValuePairParserRuleCall_3_9_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_56);
            	    	    lv_env_36_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getStepRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"env",
            	    	    													lv_env_36_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt80 >= 1 ) break loop80;
            	                EarlyExitException eee =
            	                    new EarlyExitException(80, input);
            	                throw eee;
            	        }
            	        cnt80++;
            	    } while (true);

            	    // InternalMyDsl.g:3976:10: (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==RULE_END_BLOCK) ) {
            	        alt81=1;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // InternalMyDsl.g:3977:11: this_END_BLOCK_37= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_37=(Token)match(input,RULE_END_BLOCK,FOLLOW_55); 

            	            											newLeafNode(this_END_BLOCK_37, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_3_9_2_2());
            	            										

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStepAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:3996:3: (this_END_BLOCK_38= RULE_END_BLOCK )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_END_BLOCK) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyDsl.g:3997:4: this_END_BLOCK_38= RULE_END_BLOCK
                    {
                    this_END_BLOCK_38=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_38, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStep"


    // $ANTLR start "entryRuleStrategy"
    // InternalMyDsl.g:4006:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalMyDsl.g:4006:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalMyDsl.g:4007:2: iv_ruleStrategy= ruleStrategy EOF
            {
             newCompositeNode(grammarAccess.getStrategyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStrategy=ruleStrategy();

            state._fsp--;

             current =iv_ruleStrategy; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStrategy"


    // $ANTLR start "ruleStrategy"
    // InternalMyDsl.g:4013:1: ruleStrategy returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_END_BLOCK_9=null;
        AntlrDatatypeRuleToken lv_failFast_5_0 = null;

        EObject lv_matrix_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4019:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:4020:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:4020:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:4021:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:4021:3: ()
            // InternalMyDsl.g:4022:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrategyAccess().getStrategyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:4028:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_BEG_BLOCK) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:4029:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_57); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getStrategyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4034:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:4035:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:4035:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:4036:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4039:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* )
            // InternalMyDsl.g:4040:6: ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:4040:6: ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )*
            loop85:
            do {
                int alt85=3;
                int LA85_0 = input.LA(1);

                if ( LA85_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0) ) {
                    alt85=1;
                }
                else if ( LA85_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1) ) {
                    alt85=2;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalMyDsl.g:4041:4: ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4041:4: ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:4042:5: {...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4042:105: ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:4043:6: ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4046:9: ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:4046:10: {...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "true");
            	    }
            	    // InternalMyDsl.g:4046:19: (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:4046:20: otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,56,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getFailFastKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_40); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStrategyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:4054:9: ( (lv_failFast_5_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:4055:10: (lv_failFast_5_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:4055:10: (lv_failFast_5_0= ruleEBoolean )
            	    // InternalMyDsl.g:4056:11: lv_failFast_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getStrategyAccess().getFailFastEBooleanParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_57);
            	    lv_failFast_5_0=ruleEBoolean();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStrategyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"failFast",
            	    												lv_failFast_5_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EBoolean");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:4079:4: ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4079:4: ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) )
            	    // InternalMyDsl.g:4080:5: {...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4080:105: ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) )
            	    // InternalMyDsl.g:4081:6: ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4084:9: ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) )
            	    // InternalMyDsl.g:4084:10: {...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "true");
            	    }
            	    // InternalMyDsl.g:4084:19: (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) )
            	    // InternalMyDsl.g:4084:20: otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) )
            	    {
            	    otherlv_6=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getStrategyAccess().getMatrixKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_58); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStrategyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:4092:9: ( (lv_matrix_8_0= ruleMatrix ) )
            	    // InternalMyDsl.g:4093:10: (lv_matrix_8_0= ruleMatrix )
            	    {
            	    // InternalMyDsl.g:4093:10: (lv_matrix_8_0= ruleMatrix )
            	    // InternalMyDsl.g:4094:11: lv_matrix_8_0= ruleMatrix
            	    {

            	    											newCompositeNode(grammarAccess.getStrategyAccess().getMatrixMatrixParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_57);
            	    lv_matrix_8_0=ruleMatrix();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStrategyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"matrix",
            	    												lv_matrix_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.Matrix");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:4124:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_END_BLOCK) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:4125:4: this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_9, grammarAccess.getStrategyAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStrategy"


    // $ANTLR start "entryRuleMatrix"
    // InternalMyDsl.g:4134:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalMyDsl.g:4134:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalMyDsl.g:4135:2: iv_ruleMatrix= ruleMatrix EOF
            {
             newCompositeNode(grammarAccess.getMatrixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMatrix=ruleMatrix();

            state._fsp--;

             current =iv_ruleMatrix; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMatrix"


    // $ANTLR start "ruleMatrix"
    // InternalMyDsl.g:4141:1: ruleMatrix returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? ) ;
    public final EObject ruleMatrix() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_BEG_BLOCK_5=null;
        Token otherlv_6=null;
        Token this_BEG_BLOCK_7=null;
        Token this_END_BLOCK_9=null;
        Token this_END_BLOCK_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token this_BEG_BLOCK_18=null;
        Token otherlv_19=null;
        Token this_BEG_BLOCK_20=null;
        Token this_END_BLOCK_22=null;
        Token this_END_BLOCK_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token this_BEG_BLOCK_31=null;
        Token otherlv_32=null;
        Token this_BEG_BLOCK_33=null;
        Token this_END_BLOCK_35=null;
        Token this_END_BLOCK_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token this_BEG_BLOCK_44=null;
        Token otherlv_45=null;
        Token this_BEG_BLOCK_46=null;
        Token this_END_BLOCK_48=null;
        Token this_END_BLOCK_49=null;
        Token otherlv_50=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token this_BEG_BLOCK_57=null;
        Token otherlv_58=null;
        Token this_BEG_BLOCK_59=null;
        Token this_END_BLOCK_61=null;
        Token this_END_BLOCK_62=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token this_BEG_BLOCK_70=null;
        Token otherlv_71=null;
        Token this_BEG_BLOCK_72=null;
        Token this_END_BLOCK_74=null;
        Token this_END_BLOCK_75=null;
        Token otherlv_76=null;
        Token otherlv_78=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        Token this_BEG_BLOCK_83=null;
        Token otherlv_84=null;
        Token this_BEG_BLOCK_85=null;
        Token this_END_BLOCK_87=null;
        Token this_END_BLOCK_88=null;
        Token otherlv_89=null;
        Token otherlv_90=null;
        Token this_BEG_BLOCK_91=null;
        Token otherlv_92=null;
        Token this_BEG_BLOCK_93=null;
        Token this_END_BLOCK_95=null;
        Token this_END_BLOCK_96=null;
        Token this_END_BLOCK_97=null;
        AntlrDatatypeRuleToken lv_os_8_0 = null;

        AntlrDatatypeRuleToken lv_os_12_0 = null;

        AntlrDatatypeRuleToken lv_os_14_0 = null;

        AntlrDatatypeRuleToken lv_buildType_21_0 = null;

        AntlrDatatypeRuleToken lv_buildType_25_0 = null;

        AntlrDatatypeRuleToken lv_buildType_27_0 = null;

        AntlrDatatypeRuleToken lv_cCompiler_34_0 = null;

        AntlrDatatypeRuleToken lv_cCompiler_38_0 = null;

        AntlrDatatypeRuleToken lv_cCompiler_40_0 = null;

        AntlrDatatypeRuleToken lv_otp_47_0 = null;

        AntlrDatatypeRuleToken lv_otp_51_0 = null;

        AntlrDatatypeRuleToken lv_otp_53_0 = null;

        AntlrDatatypeRuleToken lv_elixir_60_0 = null;

        AntlrDatatypeRuleToken lv_elixir_64_0 = null;

        AntlrDatatypeRuleToken lv_elixir_66_0 = null;

        AntlrDatatypeRuleToken lv_configuration_73_0 = null;

        AntlrDatatypeRuleToken lv_configuration_77_0 = null;

        AntlrDatatypeRuleToken lv_configuration_79_0 = null;

        EObject lv_include_86_0 = null;

        EObject lv_exclude_94_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4147:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:4148:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:4148:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? )
            // InternalMyDsl.g:4149:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:4149:3: ()
            // InternalMyDsl.g:4150:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatrixAccess().getMatrixAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:4156:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_BEG_BLOCK) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalMyDsl.g:4157:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_59); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4162:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalMyDsl.g:4163:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:4163:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalMyDsl.g:4164:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4167:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* )
            // InternalMyDsl.g:4168:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalMyDsl.g:4168:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )*
            loop124:
            do {
                int alt124=9;
                alt124 = dfa124.predict(input);
                switch (alt124) {
            	case 1 :
            	    // InternalMyDsl.g:4169:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4169:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4170:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4170:103: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4171:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4174:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:4174:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4174:19: (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:4174:20: otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMatrixAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:4182:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt92=2;
            	    int LA92_0 = input.LA(1);

            	    if ( (LA92_0==RULE_BEG_BLOCK) ) {
            	        alt92=1;
            	    }
            	    else if ( (LA92_0==28) ) {
            	        alt92=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 92, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt92) {
            	        case 1 :
            	            // InternalMyDsl.g:4183:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4183:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4184:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:4188:11: (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+
            	            int cnt90=0;
            	            loop90:
            	            do {
            	                int alt90=2;
            	                int LA90_0 = input.LA(1);

            	                if ( (LA90_0==27) ) {
            	                    alt90=1;
            	                }


            	                switch (alt90) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4189:12: otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_6=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4193:12: (this_BEG_BLOCK_7= RULE_BEG_BLOCK )?
            	            	    int alt88=2;
            	            	    int LA88_0 = input.LA(1);

            	            	    if ( (LA88_0==RULE_BEG_BLOCK) ) {
            	            	        alt88=1;
            	            	    }
            	            	    switch (alt88) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4194:13: this_BEG_BLOCK_7= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_7, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4199:12: ( (lv_os_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4200:13: (lv_os_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4200:13: (lv_os_8_0= ruleEString )
            	            	    // InternalMyDsl.g:4201:14: lv_os_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOsEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_os_8_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"os",
            	            	    															lv_os_8_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    // InternalMyDsl.g:4218:12: (this_END_BLOCK_9= RULE_END_BLOCK )?
            	            	    int alt89=2;
            	            	    int LA89_0 = input.LA(1);

            	            	    if ( (LA89_0==RULE_END_BLOCK) ) {
            	            	        int LA89_1 = input.LA(2);

            	            	        if ( (LA89_1==RULE_END_BLOCK||LA89_1==27) ) {
            	            	            alt89=1;
            	            	        }
            	            	    }
            	            	    switch (alt89) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4219:13: this_END_BLOCK_9= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	            													newLeafNode(this_END_BLOCK_9, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt90 >= 1 ) break loop90;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(90, input);
            	                        throw eee;
            	                }
            	                cnt90++;
            	            } while (true);

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4231:10: (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:4231:10: (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:4232:11: otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:4236:11: ( (lv_os_12_0= ruleEString ) )
            	            // InternalMyDsl.g:4237:12: (lv_os_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4237:12: (lv_os_12_0= ruleEString )
            	            // InternalMyDsl.g:4238:13: lv_os_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getOsEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_os_12_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            													}
            	            													add(
            	            														current,
            	            														"os",
            	            														lv_os_12_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:4255:11: (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )*
            	            loop91:
            	            do {
            	                int alt91=2;
            	                int LA91_0 = input.LA(1);

            	                if ( (LA91_0==31) ) {
            	                    alt91=1;
            	                }


            	                switch (alt91) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4256:12: otherlv_13= ',' ( (lv_os_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getMatrixAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4260:12: ( (lv_os_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4261:13: (lv_os_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4261:13: (lv_os_14_0= ruleEString )
            	            	    // InternalMyDsl.g:4262:14: lv_os_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOsEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_os_14_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"os",
            	            	    															lv_os_14_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop91;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,29,FOLLOW_59); 

            	            											newLeafNode(otherlv_15, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_2_0_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:4292:4: ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4292:4: ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4293:5: {...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4293:103: ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4294:6: ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4297:9: ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:4297:10: {...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4297:19: (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:4297:20: otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMatrixAccess().getBuildTypeKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_17, grammarAccess.getMatrixAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:4305:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt97=2;
            	    int LA97_0 = input.LA(1);

            	    if ( (LA97_0==RULE_BEG_BLOCK) ) {
            	        alt97=1;
            	    }
            	    else if ( (LA97_0==28) ) {
            	        alt97=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 97, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt97) {
            	        case 1 :
            	            // InternalMyDsl.g:4306:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4306:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4307:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:4311:11: (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+
            	            int cnt95=0;
            	            loop95:
            	            do {
            	                int alt95=2;
            	                int LA95_0 = input.LA(1);

            	                if ( (LA95_0==27) ) {
            	                    alt95=1;
            	                }


            	                switch (alt95) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4312:12: otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_19=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4316:12: (this_BEG_BLOCK_20= RULE_BEG_BLOCK )?
            	            	    int alt93=2;
            	            	    int LA93_0 = input.LA(1);

            	            	    if ( (LA93_0==RULE_BEG_BLOCK) ) {
            	            	        alt93=1;
            	            	    }
            	            	    switch (alt93) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4317:13: this_BEG_BLOCK_20= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_20, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4322:12: ( (lv_buildType_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4323:13: (lv_buildType_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4323:13: (lv_buildType_21_0= ruleEString )
            	            	    // InternalMyDsl.g:4324:14: lv_buildType_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getBuildTypeEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_buildType_21_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"buildType",
            	            	    															lv_buildType_21_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    // InternalMyDsl.g:4341:12: (this_END_BLOCK_22= RULE_END_BLOCK )?
            	            	    int alt94=2;
            	            	    int LA94_0 = input.LA(1);

            	            	    if ( (LA94_0==RULE_END_BLOCK) ) {
            	            	        int LA94_1 = input.LA(2);

            	            	        if ( (LA94_1==RULE_END_BLOCK||LA94_1==27) ) {
            	            	            alt94=1;
            	            	        }
            	            	    }
            	            	    switch (alt94) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4342:13: this_END_BLOCK_22= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	            													newLeafNode(this_END_BLOCK_22, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt95 >= 1 ) break loop95;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(95, input);
            	                        throw eee;
            	                }
            	                cnt95++;
            	            } while (true);

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4354:10: (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:4354:10: (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:4355:11: otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:4359:11: ( (lv_buildType_25_0= ruleEString ) )
            	            // InternalMyDsl.g:4360:12: (lv_buildType_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4360:12: (lv_buildType_25_0= ruleEString )
            	            // InternalMyDsl.g:4361:13: lv_buildType_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getBuildTypeEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_buildType_25_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            													}
            	            													add(
            	            														current,
            	            														"buildType",
            	            														lv_buildType_25_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:4378:11: (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )*
            	            loop96:
            	            do {
            	                int alt96=2;
            	                int LA96_0 = input.LA(1);

            	                if ( (LA96_0==31) ) {
            	                    alt96=1;
            	                }


            	                switch (alt96) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4379:12: otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getMatrixAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4383:12: ( (lv_buildType_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4384:13: (lv_buildType_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4384:13: (lv_buildType_27_0= ruleEString )
            	            	    // InternalMyDsl.g:4385:14: lv_buildType_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getBuildTypeEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_buildType_27_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"buildType",
            	            	    															lv_buildType_27_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop96;
            	                }
            	            } while (true);

            	            otherlv_28=(Token)match(input,29,FOLLOW_59); 

            	            											newLeafNode(otherlv_28, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_2_1_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:4415:4: ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4415:4: ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4416:5: {...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:4416:103: ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4417:6: ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:4420:9: ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) )
            	    // InternalMyDsl.g:4420:10: {...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4420:19: (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) )
            	    // InternalMyDsl.g:4420:20: otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) )
            	    {
            	    otherlv_29=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_29, grammarAccess.getMatrixAccess().getCCompilerKeyword_2_2_0());
            	    								
            	    otherlv_30=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_30, grammarAccess.getMatrixAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:4428:9: ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) )
            	    int alt102=2;
            	    int LA102_0 = input.LA(1);

            	    if ( (LA102_0==RULE_BEG_BLOCK) ) {
            	        alt102=1;
            	    }
            	    else if ( (LA102_0==28) ) {
            	        alt102=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 102, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt102) {
            	        case 1 :
            	            // InternalMyDsl.g:4429:10: (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4429:10: (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4430:11: this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_31=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_31, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0_0());
            	            										
            	            // InternalMyDsl.g:4434:11: (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+
            	            int cnt100=0;
            	            loop100:
            	            do {
            	                int alt100=2;
            	                int LA100_0 = input.LA(1);

            	                if ( (LA100_0==27) ) {
            	                    alt100=1;
            	                }


            	                switch (alt100) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4435:12: otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_32=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_32, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_2_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4439:12: (this_BEG_BLOCK_33= RULE_BEG_BLOCK )?
            	            	    int alt98=2;
            	            	    int LA98_0 = input.LA(1);

            	            	    if ( (LA98_0==RULE_BEG_BLOCK) ) {
            	            	        alt98=1;
            	            	    }
            	            	    switch (alt98) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4440:13: this_BEG_BLOCK_33= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_33=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_33, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4445:12: ( (lv_cCompiler_34_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4446:13: (lv_cCompiler_34_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4446:13: (lv_cCompiler_34_0= ruleEString )
            	            	    // InternalMyDsl.g:4447:14: lv_cCompiler_34_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getCCompilerEStringParserRuleCall_2_2_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_cCompiler_34_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"cCompiler",
            	            	    															lv_cCompiler_34_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    // InternalMyDsl.g:4464:12: (this_END_BLOCK_35= RULE_END_BLOCK )?
            	            	    int alt99=2;
            	            	    int LA99_0 = input.LA(1);

            	            	    if ( (LA99_0==RULE_END_BLOCK) ) {
            	            	        int LA99_1 = input.LA(2);

            	            	        if ( (LA99_1==RULE_END_BLOCK||LA99_1==27) ) {
            	            	            alt99=1;
            	            	        }
            	            	    }
            	            	    switch (alt99) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4465:13: this_END_BLOCK_35= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_35=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	            													newLeafNode(this_END_BLOCK_35, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_2_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt100 >= 1 ) break loop100;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(100, input);
            	                        throw eee;
            	                }
            	                cnt100++;
            	            } while (true);

            	            this_END_BLOCK_36=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	            											newLeafNode(this_END_BLOCK_36, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_2_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4477:10: (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' )
            	            {
            	            // InternalMyDsl.g:4477:10: (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' )
            	            // InternalMyDsl.g:4478:11: otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']'
            	            {
            	            otherlv_37=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_37, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:4482:11: ( (lv_cCompiler_38_0= ruleEString ) )
            	            // InternalMyDsl.g:4483:12: (lv_cCompiler_38_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4483:12: (lv_cCompiler_38_0= ruleEString )
            	            // InternalMyDsl.g:4484:13: lv_cCompiler_38_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getCCompilerEStringParserRuleCall_2_2_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_cCompiler_38_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            													}
            	            													add(
            	            														current,
            	            														"cCompiler",
            	            														lv_cCompiler_38_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:4501:11: (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )*
            	            loop101:
            	            do {
            	                int alt101=2;
            	                int LA101_0 = input.LA(1);

            	                if ( (LA101_0==31) ) {
            	                    alt101=1;
            	                }


            	                switch (alt101) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4502:12: otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) )
            	            	    {
            	            	    otherlv_39=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_39, grammarAccess.getMatrixAccess().getCommaKeyword_2_2_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4506:12: ( (lv_cCompiler_40_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4507:13: (lv_cCompiler_40_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4507:13: (lv_cCompiler_40_0= ruleEString )
            	            	    // InternalMyDsl.g:4508:14: lv_cCompiler_40_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getCCompilerEStringParserRuleCall_2_2_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_cCompiler_40_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"cCompiler",
            	            	    															lv_cCompiler_40_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop101;
            	                }
            	            } while (true);

            	            otherlv_41=(Token)match(input,29,FOLLOW_59); 

            	            											newLeafNode(otherlv_41, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_2_2_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:4538:4: ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4538:4: ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4539:5: {...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:4539:103: ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4540:6: ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:4543:9: ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) )
            	    // InternalMyDsl.g:4543:10: {...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4543:19: (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) )
            	    // InternalMyDsl.g:4543:20: otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) )
            	    {
            	    otherlv_42=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_42, grammarAccess.getMatrixAccess().getOtpKeyword_2_3_0());
            	    								
            	    otherlv_43=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_43, grammarAccess.getMatrixAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:4551:9: ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) )
            	    int alt107=2;
            	    int LA107_0 = input.LA(1);

            	    if ( (LA107_0==RULE_BEG_BLOCK) ) {
            	        alt107=1;
            	    }
            	    else if ( (LA107_0==28) ) {
            	        alt107=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 107, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt107) {
            	        case 1 :
            	            // InternalMyDsl.g:4552:10: (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4552:10: (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4553:11: this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_44=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_44, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_0());
            	            										
            	            // InternalMyDsl.g:4557:11: (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+
            	            int cnt105=0;
            	            loop105:
            	            do {
            	                int alt105=2;
            	                int LA105_0 = input.LA(1);

            	                if ( (LA105_0==27) ) {
            	                    alt105=1;
            	                }


            	                switch (alt105) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4558:12: otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_45=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_45, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_3_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4562:12: (this_BEG_BLOCK_46= RULE_BEG_BLOCK )?
            	            	    int alt103=2;
            	            	    int LA103_0 = input.LA(1);

            	            	    if ( (LA103_0==RULE_BEG_BLOCK) ) {
            	            	        alt103=1;
            	            	    }
            	            	    switch (alt103) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4563:13: this_BEG_BLOCK_46= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_46=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_46, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4568:12: ( (lv_otp_47_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4569:13: (lv_otp_47_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4569:13: (lv_otp_47_0= ruleEString )
            	            	    // InternalMyDsl.g:4570:14: lv_otp_47_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOtpEStringParserRuleCall_2_3_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_otp_47_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"otp",
            	            	    															lv_otp_47_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    // InternalMyDsl.g:4587:12: (this_END_BLOCK_48= RULE_END_BLOCK )?
            	            	    int alt104=2;
            	            	    int LA104_0 = input.LA(1);

            	            	    if ( (LA104_0==RULE_END_BLOCK) ) {
            	            	        int LA104_1 = input.LA(2);

            	            	        if ( (LA104_1==RULE_END_BLOCK||LA104_1==27) ) {
            	            	            alt104=1;
            	            	        }
            	            	    }
            	            	    switch (alt104) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4588:13: this_END_BLOCK_48= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_48=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	            													newLeafNode(this_END_BLOCK_48, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt105 >= 1 ) break loop105;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(105, input);
            	                        throw eee;
            	                }
            	                cnt105++;
            	            } while (true);

            	            this_END_BLOCK_49=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	            											newLeafNode(this_END_BLOCK_49, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4600:10: (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' )
            	            {
            	            // InternalMyDsl.g:4600:10: (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' )
            	            // InternalMyDsl.g:4601:11: otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']'
            	            {
            	            otherlv_50=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_50, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_3_2_1_0());
            	            										
            	            // InternalMyDsl.g:4605:11: ( (lv_otp_51_0= ruleEString ) )
            	            // InternalMyDsl.g:4606:12: (lv_otp_51_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4606:12: (lv_otp_51_0= ruleEString )
            	            // InternalMyDsl.g:4607:13: lv_otp_51_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getOtpEStringParserRuleCall_2_3_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_otp_51_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            													}
            	            													add(
            	            														current,
            	            														"otp",
            	            														lv_otp_51_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:4624:11: (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )*
            	            loop106:
            	            do {
            	                int alt106=2;
            	                int LA106_0 = input.LA(1);

            	                if ( (LA106_0==31) ) {
            	                    alt106=1;
            	                }


            	                switch (alt106) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4625:12: otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) )
            	            	    {
            	            	    otherlv_52=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_52, grammarAccess.getMatrixAccess().getCommaKeyword_2_3_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4629:12: ( (lv_otp_53_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4630:13: (lv_otp_53_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4630:13: (lv_otp_53_0= ruleEString )
            	            	    // InternalMyDsl.g:4631:14: lv_otp_53_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOtpEStringParserRuleCall_2_3_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_otp_53_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"otp",
            	            	    															lv_otp_53_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop106;
            	                }
            	            } while (true);

            	            otherlv_54=(Token)match(input,29,FOLLOW_59); 

            	            											newLeafNode(otherlv_54, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_2_3_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:4661:4: ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4661:4: ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4662:5: {...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:4662:103: ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4663:6: ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:4666:9: ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) )
            	    // InternalMyDsl.g:4666:10: {...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4666:19: (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) )
            	    // InternalMyDsl.g:4666:20: otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) )
            	    {
            	    otherlv_55=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_55, grammarAccess.getMatrixAccess().getElixirKeyword_2_4_0());
            	    								
            	    otherlv_56=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_56, grammarAccess.getMatrixAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:4674:9: ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) )
            	    int alt112=2;
            	    int LA112_0 = input.LA(1);

            	    if ( (LA112_0==RULE_BEG_BLOCK) ) {
            	        alt112=1;
            	    }
            	    else if ( (LA112_0==28) ) {
            	        alt112=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 112, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt112) {
            	        case 1 :
            	            // InternalMyDsl.g:4675:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4675:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4676:11: this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_57=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_57, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_4_2_0_0());
            	            										
            	            // InternalMyDsl.g:4680:11: (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+
            	            int cnt110=0;
            	            loop110:
            	            do {
            	                int alt110=2;
            	                int LA110_0 = input.LA(1);

            	                if ( (LA110_0==27) ) {
            	                    alt110=1;
            	                }


            	                switch (alt110) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4681:12: otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_58=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_58, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_4_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4685:12: (this_BEG_BLOCK_59= RULE_BEG_BLOCK )?
            	            	    int alt108=2;
            	            	    int LA108_0 = input.LA(1);

            	            	    if ( (LA108_0==RULE_BEG_BLOCK) ) {
            	            	        alt108=1;
            	            	    }
            	            	    switch (alt108) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4686:13: this_BEG_BLOCK_59= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_59=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_59, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_4_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4691:12: ( (lv_elixir_60_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4692:13: (lv_elixir_60_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4692:13: (lv_elixir_60_0= ruleEString )
            	            	    // InternalMyDsl.g:4693:14: lv_elixir_60_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getElixirEStringParserRuleCall_2_4_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_elixir_60_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"elixir",
            	            	    															lv_elixir_60_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    // InternalMyDsl.g:4710:12: (this_END_BLOCK_61= RULE_END_BLOCK )?
            	            	    int alt109=2;
            	            	    int LA109_0 = input.LA(1);

            	            	    if ( (LA109_0==RULE_END_BLOCK) ) {
            	            	        int LA109_1 = input.LA(2);

            	            	        if ( (LA109_1==RULE_END_BLOCK||LA109_1==27) ) {
            	            	            alt109=1;
            	            	        }
            	            	    }
            	            	    switch (alt109) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4711:13: this_END_BLOCK_61= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_61=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	            													newLeafNode(this_END_BLOCK_61, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_4_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt110 >= 1 ) break loop110;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(110, input);
            	                        throw eee;
            	                }
            	                cnt110++;
            	            } while (true);

            	            this_END_BLOCK_62=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	            											newLeafNode(this_END_BLOCK_62, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_4_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4723:10: (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' )
            	            {
            	            // InternalMyDsl.g:4723:10: (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' )
            	            // InternalMyDsl.g:4724:11: otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']'
            	            {
            	            otherlv_63=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_63, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_4_2_1_0());
            	            										
            	            // InternalMyDsl.g:4728:11: ( (lv_elixir_64_0= ruleEString ) )
            	            // InternalMyDsl.g:4729:12: (lv_elixir_64_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4729:12: (lv_elixir_64_0= ruleEString )
            	            // InternalMyDsl.g:4730:13: lv_elixir_64_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getElixirEStringParserRuleCall_2_4_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_elixir_64_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            													}
            	            													add(
            	            														current,
            	            														"elixir",
            	            														lv_elixir_64_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:4747:11: (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )*
            	            loop111:
            	            do {
            	                int alt111=2;
            	                int LA111_0 = input.LA(1);

            	                if ( (LA111_0==31) ) {
            	                    alt111=1;
            	                }


            	                switch (alt111) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4748:12: otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) )
            	            	    {
            	            	    otherlv_65=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_65, grammarAccess.getMatrixAccess().getCommaKeyword_2_4_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4752:12: ( (lv_elixir_66_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4753:13: (lv_elixir_66_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4753:13: (lv_elixir_66_0= ruleEString )
            	            	    // InternalMyDsl.g:4754:14: lv_elixir_66_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getElixirEStringParserRuleCall_2_4_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_elixir_66_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"elixir",
            	            	    															lv_elixir_66_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop111;
            	                }
            	            } while (true);

            	            otherlv_67=(Token)match(input,29,FOLLOW_59); 

            	            											newLeafNode(otherlv_67, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_2_4_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:4784:4: ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4784:4: ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4785:5: {...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:4785:103: ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4786:6: ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:4789:9: ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) )
            	    // InternalMyDsl.g:4789:10: {...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4789:19: (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) )
            	    // InternalMyDsl.g:4789:20: otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) )
            	    {
            	    otherlv_68=(Token)match(input,76,FOLLOW_3); 

            	    									newLeafNode(otherlv_68, grammarAccess.getMatrixAccess().getConfigurationKeyword_2_5_0());
            	    								
            	    otherlv_69=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_69, grammarAccess.getMatrixAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:4797:9: ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) )
            	    int alt117=2;
            	    int LA117_0 = input.LA(1);

            	    if ( (LA117_0==RULE_BEG_BLOCK) ) {
            	        alt117=1;
            	    }
            	    else if ( (LA117_0==28) ) {
            	        alt117=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 117, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt117) {
            	        case 1 :
            	            // InternalMyDsl.g:4798:10: (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4798:10: (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4799:11: this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_70=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_70, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_5_2_0_0());
            	            										
            	            // InternalMyDsl.g:4803:11: (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+
            	            int cnt115=0;
            	            loop115:
            	            do {
            	                int alt115=2;
            	                int LA115_0 = input.LA(1);

            	                if ( (LA115_0==27) ) {
            	                    alt115=1;
            	                }


            	                switch (alt115) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4804:12: otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_71=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_71, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_5_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4808:12: (this_BEG_BLOCK_72= RULE_BEG_BLOCK )?
            	            	    int alt113=2;
            	            	    int LA113_0 = input.LA(1);

            	            	    if ( (LA113_0==RULE_BEG_BLOCK) ) {
            	            	        alt113=1;
            	            	    }
            	            	    switch (alt113) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4809:13: this_BEG_BLOCK_72= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_72=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_72, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_5_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4814:12: ( (lv_configuration_73_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4815:13: (lv_configuration_73_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4815:13: (lv_configuration_73_0= ruleEString )
            	            	    // InternalMyDsl.g:4816:14: lv_configuration_73_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getConfigurationEStringParserRuleCall_2_5_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_29);
            	            	    lv_configuration_73_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"configuration",
            	            	    															lv_configuration_73_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }

            	            	    // InternalMyDsl.g:4833:12: (this_END_BLOCK_74= RULE_END_BLOCK )?
            	            	    int alt114=2;
            	            	    int LA114_0 = input.LA(1);

            	            	    if ( (LA114_0==RULE_END_BLOCK) ) {
            	            	        int LA114_1 = input.LA(2);

            	            	        if ( (LA114_1==RULE_END_BLOCK||LA114_1==27) ) {
            	            	            alt114=1;
            	            	        }
            	            	    }
            	            	    switch (alt114) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4834:13: this_END_BLOCK_74= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_74=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            	            													newLeafNode(this_END_BLOCK_74, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_5_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt115 >= 1 ) break loop115;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(115, input);
            	                        throw eee;
            	                }
            	                cnt115++;
            	            } while (true);

            	            this_END_BLOCK_75=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	            											newLeafNode(this_END_BLOCK_75, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_5_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4846:10: (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' )
            	            {
            	            // InternalMyDsl.g:4846:10: (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' )
            	            // InternalMyDsl.g:4847:11: otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']'
            	            {
            	            otherlv_76=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_76, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_5_2_1_0());
            	            										
            	            // InternalMyDsl.g:4851:11: ( (lv_configuration_77_0= ruleEString ) )
            	            // InternalMyDsl.g:4852:12: (lv_configuration_77_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4852:12: (lv_configuration_77_0= ruleEString )
            	            // InternalMyDsl.g:4853:13: lv_configuration_77_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getConfigurationEStringParserRuleCall_2_5_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_30);
            	            lv_configuration_77_0=ruleEString();

            	            state._fsp--;


            	            													if (current==null) {
            	            														current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            													}
            	            													add(
            	            														current,
            	            														"configuration",
            	            														lv_configuration_77_0,
            	            														"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            													afterParserOrEnumRuleCall();
            	            												

            	            }


            	            }

            	            // InternalMyDsl.g:4870:11: (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )*
            	            loop116:
            	            do {
            	                int alt116=2;
            	                int LA116_0 = input.LA(1);

            	                if ( (LA116_0==31) ) {
            	                    alt116=1;
            	                }


            	                switch (alt116) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4871:12: otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) )
            	            	    {
            	            	    otherlv_78=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_78, grammarAccess.getMatrixAccess().getCommaKeyword_2_5_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4875:12: ( (lv_configuration_79_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4876:13: (lv_configuration_79_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4876:13: (lv_configuration_79_0= ruleEString )
            	            	    // InternalMyDsl.g:4877:14: lv_configuration_79_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getConfigurationEStringParserRuleCall_2_5_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_30);
            	            	    lv_configuration_79_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getMatrixRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"configuration",
            	            	    															lv_configuration_79_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop116;
            	                }
            	            } while (true);

            	            otherlv_80=(Token)match(input,29,FOLLOW_59); 

            	            											newLeafNode(otherlv_80, grammarAccess.getMatrixAccess().getRightSquareBracketKeyword_2_5_2_1_3());
            	            										

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:4907:4: ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:4907:4: ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:4908:5: {...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:4908:103: ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:4909:6: ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:4912:9: ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:4912:10: {...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4912:19: (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK )
            	    // InternalMyDsl.g:4912:20: otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK
            	    {
            	    otherlv_81=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_81, grammarAccess.getMatrixAccess().getIncludeKeyword_2_6_0());
            	    								
            	    otherlv_82=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_82, grammarAccess.getMatrixAccess().getColonKeyword_2_6_1());
            	    								
            	    this_BEG_BLOCK_83=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	    									newLeafNode(this_BEG_BLOCK_83, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_6_2());
            	    								
            	    // InternalMyDsl.g:4924:9: (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+
            	    int cnt120=0;
            	    loop120:
            	    do {
            	        int alt120=2;
            	        int LA120_0 = input.LA(1);

            	        if ( (LA120_0==27) ) {
            	            alt120=1;
            	        }


            	        switch (alt120) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4925:10: otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )?
            	    	    {
            	    	    otherlv_84=(Token)match(input,27,FOLLOW_60); 

            	    	    										newLeafNode(otherlv_84, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_6_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4929:10: (this_BEG_BLOCK_85= RULE_BEG_BLOCK )?
            	    	    int alt118=2;
            	    	    int LA118_0 = input.LA(1);

            	    	    if ( (LA118_0==RULE_BEG_BLOCK) ) {
            	    	        alt118=1;
            	    	    }
            	    	    switch (alt118) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:4930:11: this_BEG_BLOCK_85= RULE_BEG_BLOCK
            	    	            {
            	    	            this_BEG_BLOCK_85=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_60); 

            	    	            											newLeafNode(this_BEG_BLOCK_85, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_6_3_1());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalMyDsl.g:4935:10: ( (lv_include_86_0= ruleInclude ) )
            	    	    // InternalMyDsl.g:4936:11: (lv_include_86_0= ruleInclude )
            	    	    {
            	    	    // InternalMyDsl.g:4936:11: (lv_include_86_0= ruleInclude )
            	    	    // InternalMyDsl.g:4937:12: lv_include_86_0= ruleInclude
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMatrixAccess().getIncludeIncludeParserRuleCall_2_6_3_2_0());
            	    	    											
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_include_86_0=ruleInclude();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"include",
            	    	    													lv_include_86_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.Include");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:4954:10: (this_END_BLOCK_87= RULE_END_BLOCK )?
            	    	    int alt119=2;
            	    	    int LA119_0 = input.LA(1);

            	    	    if ( (LA119_0==RULE_END_BLOCK) ) {
            	    	        int LA119_1 = input.LA(2);

            	    	        if ( (LA119_1==RULE_END_BLOCK||LA119_1==27) ) {
            	    	            alt119=1;
            	    	        }
            	    	    }
            	    	    switch (alt119) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:4955:11: this_END_BLOCK_87= RULE_END_BLOCK
            	    	            {
            	    	            this_END_BLOCK_87=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	    	            											newLeafNode(this_END_BLOCK_87, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_6_3_3());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt120 >= 1 ) break loop120;
            	                EarlyExitException eee =
            	                    new EarlyExitException(120, input);
            	                throw eee;
            	        }
            	        cnt120++;
            	    } while (true);

            	    this_END_BLOCK_88=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	    									newLeafNode(this_END_BLOCK_88, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:4971:4: ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:4971:4: ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:4972:5: {...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:4972:103: ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:4973:6: ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:4976:9: ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:4976:10: {...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4976:19: (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	    // InternalMyDsl.g:4976:20: otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK
            	    {
            	    otherlv_89=(Token)match(input,65,FOLLOW_3); 

            	    									newLeafNode(otherlv_89, grammarAccess.getMatrixAccess().getExcludeKeyword_2_7_0());
            	    								
            	    otherlv_90=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_90, grammarAccess.getMatrixAccess().getColonKeyword_2_7_1());
            	    								
            	    this_BEG_BLOCK_91=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	    									newLeafNode(this_BEG_BLOCK_91, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_7_2());
            	    								
            	    // InternalMyDsl.g:4988:9: (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+
            	    int cnt123=0;
            	    loop123:
            	    do {
            	        int alt123=2;
            	        int LA123_0 = input.LA(1);

            	        if ( (LA123_0==27) ) {
            	            alt123=1;
            	        }


            	        switch (alt123) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4989:10: otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )?
            	    	    {
            	    	    otherlv_92=(Token)match(input,27,FOLLOW_61); 

            	    	    										newLeafNode(otherlv_92, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_7_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4993:10: (this_BEG_BLOCK_93= RULE_BEG_BLOCK )?
            	    	    int alt121=2;
            	    	    int LA121_0 = input.LA(1);

            	    	    if ( (LA121_0==RULE_BEG_BLOCK) ) {
            	    	        alt121=1;
            	    	    }
            	    	    switch (alt121) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:4994:11: this_BEG_BLOCK_93= RULE_BEG_BLOCK
            	    	            {
            	    	            this_BEG_BLOCK_93=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_61); 

            	    	            											newLeafNode(this_BEG_BLOCK_93, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_7_3_1());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalMyDsl.g:4999:10: ( (lv_exclude_94_0= ruleExclude ) )
            	    	    // InternalMyDsl.g:5000:11: (lv_exclude_94_0= ruleExclude )
            	    	    {
            	    	    // InternalMyDsl.g:5000:11: (lv_exclude_94_0= ruleExclude )
            	    	    // InternalMyDsl.g:5001:12: lv_exclude_94_0= ruleExclude
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMatrixAccess().getExcludeExcludeParserRuleCall_2_7_3_2_0());
            	    	    											
            	    	    pushFollow(FOLLOW_29);
            	    	    lv_exclude_94_0=ruleExclude();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"exclude",
            	    	    													lv_exclude_94_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.Exclude");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:5018:10: (this_END_BLOCK_95= RULE_END_BLOCK )?
            	    	    int alt122=2;
            	    	    int LA122_0 = input.LA(1);

            	    	    if ( (LA122_0==RULE_END_BLOCK) ) {
            	    	        int LA122_1 = input.LA(2);

            	    	        if ( (LA122_1==RULE_END_BLOCK||LA122_1==27) ) {
            	    	            alt122=1;
            	    	        }
            	    	    }
            	    	    switch (alt122) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:5019:11: this_END_BLOCK_95= RULE_END_BLOCK
            	    	            {
            	    	            this_END_BLOCK_95=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	    	            											newLeafNode(this_END_BLOCK_95, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_7_3_3());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt123 >= 1 ) break loop123;
            	                EarlyExitException eee =
            	                    new EarlyExitException(123, input);
            	                throw eee;
            	        }
            	        cnt123++;
            	    } while (true);

            	    this_END_BLOCK_96=(Token)match(input,RULE_END_BLOCK,FOLLOW_59); 

            	    									newLeafNode(this_END_BLOCK_96, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_7_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:5042:3: (this_END_BLOCK_97= RULE_END_BLOCK )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_END_BLOCK) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalMyDsl.g:5043:4: this_END_BLOCK_97= RULE_END_BLOCK
                    {
                    this_END_BLOCK_97=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_97, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMatrix"


    // $ANTLR start "entryRuleInclude"
    // InternalMyDsl.g:5052:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalMyDsl.g:5052:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalMyDsl.g:5053:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalMyDsl.g:5059:1: ruleInclude returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_END_BLOCK_12=null;
        AntlrDatatypeRuleToken lv_os_5_0 = null;

        AntlrDatatypeRuleToken lv_cCompiler_8_0 = null;

        AntlrDatatypeRuleToken lv_cppCompiler_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5065:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5066:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5066:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5067:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5067:3: ()
            // InternalMyDsl.g:5068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncludeAccess().getIncludeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5074:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_BEG_BLOCK) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalMyDsl.g:5075:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_62); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getIncludeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5080:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:5081:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:5081:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:5082:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:5085:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:5086:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:5086:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )*
            loop127:
            do {
                int alt127=4;
                int LA127_0 = input.LA(1);

                if ( LA127_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0) ) {
                    alt127=1;
                }
                else if ( LA127_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1) ) {
                    alt127=2;
                }
                else if ( LA127_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2) ) {
                    alt127=3;
                }


                switch (alt127) {
            	case 1 :
            	    // InternalMyDsl.g:5087:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5087:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5088:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:5088:104: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5089:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:5092:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5092:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:5092:19: (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5092:20: otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:5100:9: ( (lv_os_5_0= ruleEString ) )
            	    // InternalMyDsl.g:5101:10: (lv_os_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5101:10: (lv_os_5_0= ruleEString )
            	    // InternalMyDsl.g:5102:11: lv_os_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getOsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_62);
            	    lv_os_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIncludeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"os",
            	    												lv_os_5_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:5125:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5125:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5126:5: {...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:5126:104: ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5127:6: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:5130:9: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5130:10: {...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:5130:19: (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5130:20: otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getCCompilerKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIncludeAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:5138:9: ( (lv_cCompiler_8_0= ruleEString ) )
            	    // InternalMyDsl.g:5139:10: (lv_cCompiler_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5139:10: (lv_cCompiler_8_0= ruleEString )
            	    // InternalMyDsl.g:5140:11: lv_cCompiler_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getCCompilerEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_62);
            	    lv_cCompiler_8_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIncludeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cCompiler",
            	    												lv_cCompiler_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:5163:4: ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5163:4: ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5164:5: {...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:5164:104: ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5165:6: ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:5168:9: ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5168:10: {...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:5168:19: (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5168:20: otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getIncludeAccess().getCppCompilerKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getIncludeAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:5176:9: ( (lv_cppCompiler_11_0= ruleEString ) )
            	    // InternalMyDsl.g:5177:10: (lv_cppCompiler_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5177:10: (lv_cppCompiler_11_0= ruleEString )
            	    // InternalMyDsl.g:5178:11: lv_cppCompiler_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getCppCompilerEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_62);
            	    lv_cppCompiler_11_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getIncludeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cppCompiler",
            	    												lv_cppCompiler_11_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:5208:3: (this_END_BLOCK_12= RULE_END_BLOCK )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==RULE_END_BLOCK) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalMyDsl.g:5209:4: this_END_BLOCK_12= RULE_END_BLOCK
                    {
                    this_END_BLOCK_12=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_12, grammarAccess.getIncludeAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleExclude"
    // InternalMyDsl.g:5218:1: entryRuleExclude returns [EObject current=null] : iv_ruleExclude= ruleExclude EOF ;
    public final EObject entryRuleExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclude = null;


        try {
            // InternalMyDsl.g:5218:48: (iv_ruleExclude= ruleExclude EOF )
            // InternalMyDsl.g:5219:2: iv_ruleExclude= ruleExclude EOF
            {
             newCompositeNode(grammarAccess.getExcludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExclude=ruleExclude();

            state._fsp--;

             current =iv_ruleExclude; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclude"


    // $ANTLR start "ruleExclude"
    // InternalMyDsl.g:5225:1: ruleExclude returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
    public final EObject ruleExclude() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_END_BLOCK_9=null;
        AntlrDatatypeRuleToken lv_os_5_0 = null;

        AntlrDatatypeRuleToken lv_cCompiler_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5231:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5232:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5232:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5233:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5233:3: ()
            // InternalMyDsl.g:5234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExcludeAccess().getExcludeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5240:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_BEG_BLOCK) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalMyDsl.g:5241:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_63); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getExcludeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5246:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:5247:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:5247:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:5248:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getExcludeAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:5251:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:5252:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:5252:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )*
            loop130:
            do {
                int alt130=3;
                int LA130_0 = input.LA(1);

                if ( LA130_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0) ) {
                    alt130=1;
                }
                else if ( LA130_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1) ) {
                    alt130=2;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalMyDsl.g:5253:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5253:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5254:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:5254:104: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5255:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:5258:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5258:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "true");
            	    }
            	    // InternalMyDsl.g:5258:19: (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5258:20: otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getExcludeAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getExcludeAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:5266:9: ( (lv_os_5_0= ruleEString ) )
            	    // InternalMyDsl.g:5267:10: (lv_os_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5267:10: (lv_os_5_0= ruleEString )
            	    // InternalMyDsl.g:5268:11: lv_os_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getExcludeAccess().getOsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_63);
            	    lv_os_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getExcludeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"os",
            	    												lv_os_5_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExcludeAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:5291:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5291:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5292:5: {...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:5292:104: ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5293:6: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:5296:9: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5296:10: {...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "true");
            	    }
            	    // InternalMyDsl.g:5296:19: (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5296:20: otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getExcludeAccess().getCCompilerKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getExcludeAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:5304:9: ( (lv_cCompiler_8_0= ruleEString ) )
            	    // InternalMyDsl.g:5305:10: (lv_cCompiler_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5305:10: (lv_cCompiler_8_0= ruleEString )
            	    // InternalMyDsl.g:5306:11: lv_cCompiler_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getExcludeAccess().getCCompilerEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_63);
            	    lv_cCompiler_8_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getExcludeRule());
            	    											}
            	    											set(
            	    												current,
            	    												"cCompiler",
            	    												lv_cCompiler_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExcludeAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getExcludeAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:5336:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==RULE_END_BLOCK) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalMyDsl.g:5337:4: this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_9, grammarAccess.getExcludeAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclude"


    // $ANTLR start "entryRuleDefaults"
    // InternalMyDsl.g:5346:1: entryRuleDefaults returns [EObject current=null] : iv_ruleDefaults= ruleDefaults EOF ;
    public final EObject entryRuleDefaults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaults = null;


        try {
            // InternalMyDsl.g:5346:49: (iv_ruleDefaults= ruleDefaults EOF )
            // InternalMyDsl.g:5347:2: iv_ruleDefaults= ruleDefaults EOF
            {
             newCompositeNode(grammarAccess.getDefaultsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefaults=ruleDefaults();

            state._fsp--;

             current =iv_ruleDefaults; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaults"


    // $ANTLR start "ruleDefaults"
    // InternalMyDsl.g:5353:1: ruleDefaults returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleDefaults() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        EObject lv_run_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5359:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5360:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5360:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5361:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5361:3: ()
            // InternalMyDsl.g:5362:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefaultsAccess().getDefaultsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5368:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_BEG_BLOCK) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalMyDsl.g:5369:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_64); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getDefaultsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5374:3: (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) )
            // InternalMyDsl.g:5375:4: otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) )
            {
            otherlv_2=(Token)match(input,42,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getDefaultsAccess().getRunKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_65); 

            				newLeafNode(otherlv_3, grammarAccess.getDefaultsAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5383:4: ( (lv_run_4_0= ruleRun ) )
            // InternalMyDsl.g:5384:5: (lv_run_4_0= ruleRun )
            {
            // InternalMyDsl.g:5384:5: (lv_run_4_0= ruleRun )
            // InternalMyDsl.g:5385:6: lv_run_4_0= ruleRun
            {

            						newCompositeNode(grammarAccess.getDefaultsAccess().getRunRunParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_35);
            lv_run_4_0=ruleRun();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDefaultsRule());
            						}
            						set(
            							current,
            							"run",
            							lv_run_4_0,
            							"pt.isep.yamldslgen.xtext.MyDsl.Run");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:5403:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==RULE_END_BLOCK) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalMyDsl.g:5404:4: this_END_BLOCK_5= RULE_END_BLOCK
                    {
                    this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_5, grammarAccess.getDefaultsAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaults"


    // $ANTLR start "entryRuleRun"
    // InternalMyDsl.g:5413:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalMyDsl.g:5413:44: (iv_ruleRun= ruleRun EOF )
            // InternalMyDsl.g:5414:2: iv_ruleRun= ruleRun EOF
            {
             newCompositeNode(grammarAccess.getRunRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRun=ruleRun();

            state._fsp--;

             current =iv_ruleRun; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRun"


    // $ANTLR start "ruleRun"
    // InternalMyDsl.g:5420:1: ruleRun returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_shell_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5426:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5427:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5427:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5428:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5428:3: ()
            // InternalMyDsl.g:5429:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunAccess().getRunAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5435:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_BEG_BLOCK) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalMyDsl.g:5436:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_66); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getRunAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5441:3: (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) )
            // InternalMyDsl.g:5442:4: otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getRunAccess().getShellKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getRunAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5450:4: ( (lv_shell_4_0= ruleEString ) )
            // InternalMyDsl.g:5451:5: (lv_shell_4_0= ruleEString )
            {
            // InternalMyDsl.g:5451:5: (lv_shell_4_0= ruleEString )
            // InternalMyDsl.g:5452:6: lv_shell_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getRunAccess().getShellEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_35);
            lv_shell_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getRunRule());
            						}
            						set(
            							current,
            							"shell",
            							lv_shell_4_0,
            							"pt.isep.yamldslgen.xtext.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:5470:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_END_BLOCK) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalMyDsl.g:5471:4: this_END_BLOCK_5= RULE_END_BLOCK
                    {
                    this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_5, grammarAccess.getRunAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRun"


    // $ANTLR start "entryRuleOutputs"
    // InternalMyDsl.g:5480:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalMyDsl.g:5480:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalMyDsl.g:5481:2: iv_ruleOutputs= ruleOutputs EOF
            {
             newCompositeNode(grammarAccess.getOutputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputs=ruleOutputs();

            state._fsp--;

             current =iv_ruleOutputs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputs"


    // $ANTLR start "ruleOutputs"
    // InternalMyDsl.g:5487:1: ruleOutputs returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleOutputs() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_digests_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5493:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5494:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5494:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5495:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5495:3: ()
            // InternalMyDsl.g:5496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputsAccess().getOutputsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5502:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RULE_BEG_BLOCK) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalMyDsl.g:5503:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_67); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOutputsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5508:3: (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) )
            // InternalMyDsl.g:5509:4: otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,77,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getDigestsKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5517:4: ( (lv_digests_4_0= ruleEString ) )
            // InternalMyDsl.g:5518:5: (lv_digests_4_0= ruleEString )
            {
            // InternalMyDsl.g:5518:5: (lv_digests_4_0= ruleEString )
            // InternalMyDsl.g:5519:6: lv_digests_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getOutputsAccess().getDigestsEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_35);
            lv_digests_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getOutputsRule());
            						}
            						set(
            							current,
            							"digests",
            							lv_digests_4_0,
            							"pt.isep.yamldslgen.xtext.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:5537:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RULE_END_BLOCK) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalMyDsl.g:5538:4: this_END_BLOCK_5= RULE_END_BLOCK
                    {
                    this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_5, grammarAccess.getOutputsAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputs"


    // $ANTLR start "entryRuleRelease"
    // InternalMyDsl.g:5547:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalMyDsl.g:5547:48: (iv_ruleRelease= ruleRelease EOF )
            // InternalMyDsl.g:5548:2: iv_ruleRelease= ruleRelease EOF
            {
             newCompositeNode(grammarAccess.getReleaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelease=ruleRelease();

            state._fsp--;

             current =iv_ruleRelease; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelease"


    // $ANTLR start "ruleRelease"
    // InternalMyDsl.g:5554:1: ruleRelease returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? ) ;
    public final EObject ruleRelease() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEG_BLOCK_4=null;
        Token otherlv_5=null;
        Token this_BEG_BLOCK_6=null;
        Token this_END_BLOCK_8=null;
        Token this_END_BLOCK_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_END_BLOCK_15=null;
        AntlrDatatypeRuleToken lv_types_7_0 = null;

        AntlrDatatypeRuleToken lv_types_11_0 = null;

        AntlrDatatypeRuleToken lv_types_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5560:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5561:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5561:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5562:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5562:3: ()
            // InternalMyDsl.g:5563:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReleaseAccess().getReleaseAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5569:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==RULE_BEG_BLOCK) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalMyDsl.g:5570:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_68); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getReleaseAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5575:3: (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) )
            // InternalMyDsl.g:5576:4: otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
            {
            otherlv_2=(Token)match(input,50,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getReleaseAccess().getTypesKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_26); 

            				newLeafNode(otherlv_3, grammarAccess.getReleaseAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5584:4: ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==RULE_BEG_BLOCK) ) {
                alt143=1;
            }
            else if ( (LA143_0==28) ) {
                alt143=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalMyDsl.g:5585:5: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    {
                    // InternalMyDsl.g:5585:5: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    // InternalMyDsl.g:5586:6: this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

                    						newLeafNode(this_BEG_BLOCK_4, grammarAccess.getReleaseAccess().getBEG_BLOCKTerminalRuleCall_2_2_0_0());
                    					
                    // InternalMyDsl.g:5590:6: (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+
                    int cnt141=0;
                    loop141:
                    do {
                        int alt141=2;
                        int LA141_0 = input.LA(1);

                        if ( (LA141_0==27) ) {
                            alt141=1;
                        }


                        switch (alt141) {
                    	case 1 :
                    	    // InternalMyDsl.g:5591:7: otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )?
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getReleaseAccess().getHyphenMinusKeyword_2_2_0_1_0());
                    	    						
                    	    // InternalMyDsl.g:5595:7: (this_BEG_BLOCK_6= RULE_BEG_BLOCK )?
                    	    int alt139=2;
                    	    int LA139_0 = input.LA(1);

                    	    if ( (LA139_0==RULE_BEG_BLOCK) ) {
                    	        alt139=1;
                    	    }
                    	    switch (alt139) {
                    	        case 1 :
                    	            // InternalMyDsl.g:5596:8: this_BEG_BLOCK_6= RULE_BEG_BLOCK
                    	            {
                    	            this_BEG_BLOCK_6=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

                    	            								newLeafNode(this_BEG_BLOCK_6, grammarAccess.getReleaseAccess().getBEG_BLOCKTerminalRuleCall_2_2_0_1_1());
                    	            							

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:5601:7: ( (lv_types_7_0= ruleEString ) )
                    	    // InternalMyDsl.g:5602:8: (lv_types_7_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:5602:8: (lv_types_7_0= ruleEString )
                    	    // InternalMyDsl.g:5603:9: lv_types_7_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getReleaseAccess().getTypesEStringParserRuleCall_2_2_0_1_2_0());
                    	    								
                    	    pushFollow(FOLLOW_29);
                    	    lv_types_7_0=ruleEString();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getReleaseRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"types",
                    	    										lv_types_7_0,
                    	    										"pt.isep.yamldslgen.xtext.MyDsl.EString");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }

                    	    // InternalMyDsl.g:5620:7: (this_END_BLOCK_8= RULE_END_BLOCK )?
                    	    int alt140=2;
                    	    int LA140_0 = input.LA(1);

                    	    if ( (LA140_0==RULE_END_BLOCK) ) {
                    	        int LA140_1 = input.LA(2);

                    	        if ( (LA140_1==RULE_END_BLOCK||LA140_1==27) ) {
                    	            alt140=1;
                    	        }
                    	    }
                    	    switch (alt140) {
                    	        case 1 :
                    	            // InternalMyDsl.g:5621:8: this_END_BLOCK_8= RULE_END_BLOCK
                    	            {
                    	            this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

                    	            								newLeafNode(this_END_BLOCK_8, grammarAccess.getReleaseAccess().getEND_BLOCKTerminalRuleCall_2_2_0_1_3());
                    	            							

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt141 >= 1 ) break loop141;
                                EarlyExitException eee =
                                    new EarlyExitException(141, input);
                                throw eee;
                        }
                        cnt141++;
                    } while (true);

                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_35); 

                    						newLeafNode(this_END_BLOCK_9, grammarAccess.getReleaseAccess().getEND_BLOCKTerminalRuleCall_2_2_0_2());
                    					

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5633:5: (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    {
                    // InternalMyDsl.g:5633:5: (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    // InternalMyDsl.g:5634:6: otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_4); 

                    						newLeafNode(otherlv_10, grammarAccess.getReleaseAccess().getLeftSquareBracketKeyword_2_2_1_0());
                    					
                    // InternalMyDsl.g:5638:6: ( (lv_types_11_0= ruleEString ) )
                    // InternalMyDsl.g:5639:7: (lv_types_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:5639:7: (lv_types_11_0= ruleEString )
                    // InternalMyDsl.g:5640:8: lv_types_11_0= ruleEString
                    {

                    								newCompositeNode(grammarAccess.getReleaseAccess().getTypesEStringParserRuleCall_2_2_1_1_0());
                    							
                    pushFollow(FOLLOW_30);
                    lv_types_11_0=ruleEString();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getReleaseRule());
                    								}
                    								add(
                    									current,
                    									"types",
                    									lv_types_11_0,
                    									"pt.isep.yamldslgen.xtext.MyDsl.EString");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    // InternalMyDsl.g:5657:6: (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==31) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalMyDsl.g:5658:7: otherlv_12= ',' ( (lv_types_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,31,FOLLOW_4); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getReleaseAccess().getCommaKeyword_2_2_1_2_0());
                    	    						
                    	    // InternalMyDsl.g:5662:7: ( (lv_types_13_0= ruleEString ) )
                    	    // InternalMyDsl.g:5663:8: (lv_types_13_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:5663:8: (lv_types_13_0= ruleEString )
                    	    // InternalMyDsl.g:5664:9: lv_types_13_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getReleaseAccess().getTypesEStringParserRuleCall_2_2_1_2_1_0());
                    	    								
                    	    pushFollow(FOLLOW_30);
                    	    lv_types_13_0=ruleEString();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getReleaseRule());
                    	    									}
                    	    									add(
                    	    										current,
                    	    										"types",
                    	    										lv_types_13_0,
                    	    										"pt.isep.yamldslgen.xtext.MyDsl.EString");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop142;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,29,FOLLOW_35); 

                    						newLeafNode(otherlv_14, grammarAccess.getReleaseAccess().getRightSquareBracketKeyword_2_2_1_3());
                    					

                    }


                    }
                    break;

            }


            }

            // InternalMyDsl.g:5689:3: (this_END_BLOCK_15= RULE_END_BLOCK )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==RULE_END_BLOCK) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalMyDsl.g:5690:4: this_END_BLOCK_15= RULE_END_BLOCK
                    {
                    this_END_BLOCK_15=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_15, grammarAccess.getReleaseAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelease"


    // $ANTLR start "entryRuleContainer"
    // InternalMyDsl.g:5699:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:5699:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:5700:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // InternalMyDsl.g:5706:1: ruleContainer returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_image_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5712:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5713:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5713:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5714:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5714:3: ()
            // InternalMyDsl.g:5715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5721:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==RULE_BEG_BLOCK) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalMyDsl.g:5722:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_69); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getContainerAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5727:3: (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) )
            // InternalMyDsl.g:5728:4: otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,72,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getImageKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5736:4: ( (lv_image_4_0= ruleEString ) )
            // InternalMyDsl.g:5737:5: (lv_image_4_0= ruleEString )
            {
            // InternalMyDsl.g:5737:5: (lv_image_4_0= ruleEString )
            // InternalMyDsl.g:5738:6: lv_image_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getContainerAccess().getImageEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_35);
            lv_image_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getContainerRule());
            						}
            						set(
            							current,
            							"image",
            							lv_image_4_0,
            							"pt.isep.yamldslgen.xtext.MyDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            // InternalMyDsl.g:5756:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_END_BLOCK) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalMyDsl.g:5757:4: this_END_BLOCK_5= RULE_END_BLOCK
                    {
                    this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_5, grammarAccess.getContainerAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:5766:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:5766:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:5767:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:5773:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5779:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:5780:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:5780:2: (kw= 'true' | kw= 'false' )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==23) ) {
                alt147=1;
            }
            else if ( (LA147_0==24) ) {
                alt147=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;
            }
            switch (alt147) {
                case 1 :
                    // InternalMyDsl.g:5781:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5787:3: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA73 dfa73 = new DFA73(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA82 dfa82 = new DFA82(this);
    protected DFA77 dfa77 = new DFA77(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA124 dfa124 = new DFA124(this);
    static final String dfa_1s = "\101\uffff";
    static final String dfa_2s = "\1\1\11\uffff\1\1\2\uffff\1\1\12\uffff\2\27\13\56\11\66\1\uffff\5\66\1\1\2\uffff\5\100\5\uffff";
    static final String dfa_3s = "\1\5\1\uffff\6\20\1\uffff\1\6\5\4\11\uffff\2\5\2\4\22\5\1\uffff\5\5\1\4\1\6\1\uffff\5\5\5\uffff";
    static final String dfa_4s = "\1\115\1\uffff\6\20\1\uffff\1\32\1\117\1\52\1\32\1\106\1\115\11\uffff\26\115\1\uffff\5\115\1\124\1\32\1\uffff\5\115\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\6\uffff\1\1\6\uffff\11\1\26\uffff\1\1\7\uffff\1\1\5\uffff\5\1";
    static final String dfa_6s = "\101\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\3\10\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\1\7\13\uffff\54\10",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            "\1\17\1\20\1\23\1\24\1\25\14\uffff\1\26\1\27\1\21\1\22",
            "\2\1\5\27\4\uffff\1\1\1\uffff\6\1\4\27\7\uffff\2\1\36\uffff\2\1\6\uffff\1\1\3\uffff\2\1",
            "\1\1\1\uffff\5\27\14\uffff\4\27\17\uffff\1\1",
            "\1\1\1\uffff\1\30\1\31\1\34\1\35\1\36\14\uffff\1\37\1\40\1\32\1\33",
            "\2\1\5\27\4\uffff\1\1\1\uffff\6\1\4\27\22\uffff\5\1\1\uffff\1\1\2\uffff\1\1\17\uffff\1\1",
            "\1\1\1\uffff\2\27\1\41\1\42\1\43\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\27\7\uffff\54\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\2\uffff\1\27\1\10\1\27\4\uffff\1\27\1\1\6\27\13\uffff\54\27",
            "\1\27\2\uffff\1\27\1\10\1\27\4\uffff\1\27\1\1\6\27\13\uffff\54\27",
            "\1\44\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\56\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\56",
            "\1\44\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\56\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\65\6\56\13\uffff\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\65\6\56\13\uffff\54\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\65\6\56\13\uffff\54\56",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\56\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\56",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\54\66",
            "\1\66\2\uffff\1\66\1\10\1\66\4\uffff\1\66\1\1\6\66\13\uffff\54\66",
            "\4\1\1\67\1\70\1\71\4\uffff\1\1\1\uffff\6\1\1\72\1\73\2\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\2\1\1\74\1\75\1\76\14\uffff\1\77\1\100\2\1",
            "",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\54\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\54\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\54\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\54\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\54\100",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 345:9: ( (lv_env_24_0= ruleKeyValuePair ) )+";
        }
    }
    static final String dfa_8s = "\116\uffff";
    static final String dfa_9s = "\1\1\7\uffff\1\26\30\uffff\1\1\1\uffff\1\57\5\uffff\1\57\1\1\5\uffff\1\57\17\uffff\2\57\10\uffff\1\57\3\uffff";
    static final String dfa_10s = "\1\5\7\uffff\1\5\11\uffff\2\4\3\uffff\2\20\12\5\1\4\4\5\1\20\1\4\1\5\5\uffff\13\5\5\20\2\4\6\5\2\20\1\4\3\5";
    static final String dfa_11s = "\1\126\7\uffff\1\126\11\uffff\2\41\3\uffff\2\37\10\41\1\124\1\41\1\124\4\41\1\37\2\124\5\uffff\1\37\12\41\5\37\2\124\6\41\2\37\1\124\3\41";
    static final String dfa_12s = "\1\uffff\1\17\1\3\1\1\1\4\1\5\1\2\1\6\1\uffff\1\10\1\12\1\7\1\11\1\14\1\15\1\16\2\13\2\uffff\3\13\24\uffff\5\13\36\uffff";
    static final String dfa_13s = "\116\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\5\1\6\1\3\1\2\1\4\1\17\3\uffff\1\1\1\12\12\1\1\7\1\13\1\11\1\14\1\10\1\15\1\16\56\1\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\20\1\21\1\24\1\25\2\26\3\uffff\10\26\1\27\1\30\1\22\1\23\65\26\1\uffff\6\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\31\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "",
            "",
            "",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\52\1\57\1\54\1\53\1\55\1\56\1\47\3\uffff\1\1\1\43\12\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46\10\1\1\uffff\1\1\6\uffff\1\1\1\uffff\1\1\2\uffff\6\1\1\uffff\6\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\4\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\1\60\1\65\1\62\1\61\1\63\1\64\1\47\3\uffff\1\57\1\43\12\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\17\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\1\50\1\66\1\67\1\70\1\71\1\72\1\47\4\uffff\1\43\6\uffff\4\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\14\uffff\1\1\1\uffff\1\1",
            "\4\57\1\73\1\74\1\75\4\uffff\1\57\1\uffff\6\57\1\76\1\77\2\57\13\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\17\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\6\1\4\uffff\1\1\1\57\12\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\2\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\3\1\10\uffff\2\1\3\uffff\1\1\1\uffff\2\1\3\uffff\2\1\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "\6\57\4\uffff\14\57\2\uffff\1\1\1\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\65\1\62\1\102\1\103\1\104\1\47\3\uffff\1\57\1\43\12\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\17\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\1\57\1\60\1\65\1\62\1\105\1\106\1\107\1\47\3\uffff\1\57\1\43\6\57\1\110\1\111\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\17\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\65\1\62\1\113\1\114\1\115\1\47\3\uffff\1\57\1\43\6\57\1\76\1\77\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\17\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 581:3: (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )*";
        }
    }
    static final String dfa_15s = "\17\uffff";
    static final String dfa_16s = "\1\1\16\uffff";
    static final String dfa_17s = "\1\5\1\uffff\1\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_18s = "\1\124\1\uffff\1\20\1\uffff\1\32\11\0\1\uffff";
    static final String dfa_19s = "\1\uffff\1\3\1\uffff\1\2\12\uffff\1\1";
    static final String dfa_20s = "\1\10\4\uffff\1\11\1\0\1\2\1\6\1\5\1\1\1\4\1\3\1\7\1\uffff}>";
    static final String[] dfa_21s = {
            "\6\1\4\uffff\1\2\1\uffff\12\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\11\uffff\1\3\1\1",
            "",
            "\1\4",
            "",
            "\1\5\1\6\1\11\1\12\1\13\14\uffff\1\14\1\15\1\7\1\10",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 2385:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_6 = input.LA(1);

                         
                        int index53_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_10 = input.LA(1);

                         
                        int index53_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_10);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_11 = input.LA(1);

                         
                        int index53_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_13 = input.LA(1);

                         
                        int index53_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==EOF||(LA53_0>=RULE_END_BLOCK && LA53_0<=RULE_INT)||(LA53_0>=17 && LA53_0<=26)||(LA53_0>=38 && LA53_0<=41)||LA53_0==43||LA53_0==52||LA53_0==55||LA53_0==71||LA53_0==73||LA53_0==84) ) {s = 1;}

                        else if ( (LA53_0==15) ) {s = 2;}

                        else if ( LA53_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\12\uffff";
    static final String dfa_23s = "\1\1\11\uffff";
    static final String dfa_24s = "\1\5\11\uffff";
    static final String dfa_25s = "\1\124\11\uffff";
    static final String dfa_26s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_27s = "\1\0\11\uffff}>";
    static final String[] dfa_28s = {
            "\6\1\4\uffff\1\1\1\uffff\12\1\13\uffff\4\1\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\1\1\uffff\1\10\1\1\16\uffff\1\11\1\1\1\uffff\1\1\12\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 2513:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0==EOF||(LA56_0>=RULE_END_BLOCK && LA56_0<=RULE_INT)||LA56_0==15||(LA56_0>=17 && LA56_0<=26)||(LA56_0>=38 && LA56_0<=41)||LA56_0==43||LA56_0==52||LA56_0==55||LA56_0==71||LA56_0==73||LA56_0==84) ) {s = 1;}

                        else if ( LA56_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA56_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA56_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA56_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA56_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA56_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA56_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA56_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\136\uffff";
    static final String dfa_30s = "\1\1\135\uffff";
    static final String dfa_31s = "\1\5\1\uffff\3\20\12\uffff\1\6\1\0\1\4\11\0\1\uffff\1\10\65\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_32s = "\1\124\1\uffff\3\20\12\uffff\1\32\1\0\1\115\11\0\1\uffff\1\115\65\20\1\uffff\1\32\11\0\1\uffff";
    static final String dfa_33s = "\1\uffff\1\16\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\15\14\uffff\1\13\66\uffff\1\1\12\uffff\1\14";
    static final String dfa_34s = "\1\13\17\uffff\1\23\1\uffff\1\0\1\4\1\5\1\10\1\21\1\2\1\6\1\14\1\20\71\uffff\1\11\1\16\1\12\1\15\1\3\1\7\1\17\1\22\1\1\1\uffff}>";
    static final String[] dfa_35s = {
            "\6\1\4\uffff\1\2\1\uffff\4\1\1\3\1\4\4\1\13\uffff\1\5\1\6\1\15\1\10\1\uffff\1\16\10\uffff\1\7\2\uffff\1\12\17\uffff\1\13\1\uffff\1\14\12\uffff\1\11",
            "",
            "\1\17",
            "\1\20",
            "\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\1\23\1\26\1\27\1\30\14\uffff\1\31\1\32\1\24\1\25",
            "\1\uffff",
            "\1\34\3\uffff\1\36\1\35\1\37\4\uffff\1\40\1\uffff\1\41\1\uffff\1\114\1\42\1\43\1\44\13\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\115\1\116\1\117\1\120\1\121",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\36\1\35\1\37\4\uffff\1\40\1\uffff\1\41\1\uffff\1\114\1\42\1\43\1\44\13\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\115\1\116\1\117\1\120\1\121",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "\1\123",
            "",
            "\1\124\1\125\1\130\1\131\1\132\14\uffff\1\133\1\134\1\126\1\127",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()* loopback of 2885:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_92 = input.LA(1);

                         
                        int index73_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_92);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_88 = input.LA(1);

                         
                        int index73_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_88);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_89 = input.LA(1);

                         
                        int index73_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_89);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_84 = input.LA(1);

                         
                        int index73_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_84);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_86 = input.LA(1);

                         
                        int index73_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_86);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_0 = input.LA(1);

                         
                        int index73_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA73_0==EOF||(LA73_0>=RULE_END_BLOCK && LA73_0<=RULE_INT)||(LA73_0>=17 && LA73_0<=20)||(LA73_0>=23 && LA73_0<=26)) ) {s = 1;}

                        else if ( (LA73_0==15) ) {s = 2;}

                        else if ( (LA73_0==21) ) {s = 3;}

                        else if ( (LA73_0==22) ) {s = 4;}

                        else if ( LA73_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {s = 5;}

                        else if ( LA73_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {s = 6;}

                        else if ( LA73_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {s = 7;}

                        else if ( LA73_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {s = 8;}

                        else if ( LA73_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 9;}

                        else if ( LA73_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {s = 10;}

                        else if ( LA73_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7) ) {s = 11;}

                        else if ( LA73_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8) ) {s = 12;}

                        else if ( LA73_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9) ) {s = 13;}

                        else if ( LA73_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_87 = input.LA(1);

                         
                        int index73_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_87);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_85 = input.LA(1);

                         
                        int index73_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_85);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_90 = input.LA(1);

                         
                        int index73_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_90);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 82;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_91 = input.LA(1);

                         
                        int index73_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 93;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_91);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_36s = "\u0088\uffff";
    static final String dfa_37s = "\1\1\25\uffff\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\1\1\15\uffff\2\142\17\160\44\uffff\4\160\5\uffff\4\160\1\uffff\5\160\1\1\2\uffff\5\u0087\12\uffff";
    static final String dfa_38s = "\1\5\1\uffff\22\20\1\uffff\1\6\6\4\1\6\1\4\2\6\5\4\11\uffff\2\5\2\4\15\5\44\uffff\4\5\5\uffff\4\5\1\uffff\5\5\1\4\2\6\5\5\12\uffff";
    static final String dfa_39s = "\1\124\1\uffff\22\20\1\uffff\1\32\1\117\1\52\1\32\1\124\1\115\1\124\1\32\1\34\2\32\1\124\1\110\1\115\1\33\1\115\11\uffff\21\124\44\uffff\4\124\5\uffff\4\124\1\uffff\6\124\2\32\5\124\12\uffff";
    static final String dfa_40s = "\1\uffff\1\2\22\uffff\1\1\20\uffff\11\1\21\uffff\44\1\4\uffff\5\1\4\uffff\1\1\15\uffff\12\1";
    static final String dfa_41s = "\u0088\uffff}>";
    static final String[] dfa_42s = {
            "\3\1\1\10\1\11\1\12\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\1\7\4\1\7\uffff\4\24\1\13\1\14\1\22\1\16\1\24\1\23\10\24\1\15\2\24\1\17\17\24\1\20\1\24\1\21\4\24\6\uffff\1\1",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\33",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "",
            "\1\45\1\46\1\51\1\52\1\53\14\uffff\1\54\1\55\1\47\1\50",
            "\2\1\5\55\4\uffff\1\1\1\uffff\6\1\4\55\7\uffff\2\1\36\uffff\2\1\6\uffff\1\1\3\uffff\2\1",
            "\1\1\1\uffff\5\55\14\uffff\4\55\17\uffff\1\1",
            "\1\1\1\uffff\1\56\1\57\1\62\1\63\1\64\14\uffff\1\65\1\66\1\60\1\61",
            "\2\1\1\56\1\57\1\62\1\63\1\64\4\uffff\1\1\1\uffff\6\1\1\65\1\66\1\60\1\61\13\uffff\4\1\1\uffff\1\1\1\uffff\5\1\1\uffff\2\1\1\uffff\2\1\16\uffff\2\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\2\55\1\70\1\67\1\71\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\55\7\uffff\54\1",
            "\2\1\1\56\1\57\1\72\1\73\1\74\4\uffff\1\1\1\uffff\6\1\1\75\1\76\1\60\1\61\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\77\1\100\1\103\1\104\1\105\14\uffff\1\106\1\107\1\101\1\102",
            "\1\1\1\uffff\1\110\1\111\1\114\1\115\1\116\14\uffff\1\117\1\120\1\112\1\113\1\uffff\1\1",
            "\1\121\1\122\1\125\1\126\1\127\14\uffff\1\130\1\131\1\123\1\124",
            "\1\132\1\133\1\136\1\137\1\140\14\uffff\1\141\1\142\1\134\1\135",
            "\2\1\1\56\1\57\1\62\1\63\1\64\4\uffff\1\1\1\uffff\6\1\1\65\1\66\1\60\1\61\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\3\1\15\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\5\142\14\uffff\4\142\55\uffff\1\1",
            "\1\1\1\uffff\5\142\14\uffff\4\142\62\uffff\1\1",
            "\1\1\1\uffff\5\142\14\uffff\4\142\1\1",
            "\1\1\1\uffff\2\142\1\144\1\143\1\145\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\142\7\uffff\54\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\142\4\uffff\1\142\1\1\12\142\7\uffff\1\24\53\142\6\uffff\1\142",
            "\6\142\4\uffff\1\142\1\1\12\142\7\uffff\1\24\53\142\6\uffff\1\142",
            "\1\146\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\1\146\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\167\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\167\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\167\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\160\4\uffff\1\160\1\170\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\170\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\170\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "",
            "",
            "",
            "",
            "",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\53\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\1\12\160\7\uffff\1\24\53\160\6\uffff\1\160",
            "\4\1\1\171\1\172\1\173\4\uffff\1\1\1\uffff\6\1\1\174\1\175\2\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\2\1\1\176\1\177\1\u0080\14\uffff\1\u0081\1\u0082\2\1",
            "\2\1\1\u0083\1\u0084\1\u0085\14\uffff\1\u0086\1\u0087\2\1",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\53\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\53\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\53\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\53\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\53\u0087\6\uffff\1\u0087",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()+ loopback of 3441:10: ( (lv_env_53_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()+ loopback of 3493:10: ( (lv_with_58_0= ruleKeyValuePair ) )+";
        }
    }
    static final String dfa_43s = "\u00b1\uffff";
    static final String dfa_44s = "\1\1\u00b0\uffff";
    static final String dfa_45s = "\1\5\1\uffff\5\20\5\uffff\1\6\1\4\2\6\1\4\11\0\1\10\65\20\22\0\1\10\65\20\1\uffff\1\6\2\uffff\1\6\22\0\2\uffff";
    static final String dfa_46s = "\1\126\1\uffff\5\20\5\uffff\1\32\1\115\2\32\1\115\11\0\1\115\65\20\22\0\1\115\65\20\1\uffff\1\32\2\uffff\1\32\22\0\2\uffff";
    static final String dfa_47s = "\1\uffff\1\13\5\uffff\1\2\1\4\1\6\1\7\1\10\u008c\uffff\1\1\1\uffff\1\5\1\3\23\uffff\1\12\1\11";
    static final String dfa_48s = "\1\30\20\uffff\1\46\1\1\1\32\1\43\1\54\1\3\1\22\1\7\1\23\66\uffff\1\53\1\4\1\15\1\21\1\25\1\31\1\35\1\17\1\24\1\37\1\47\1\36\1\40\1\2\1\6\1\14\1\52\1\0\73\uffff\1\26\1\33\1\42\1\55\1\50\1\5\1\11\1\16\1\10\1\44\1\51\1\41\1\45\1\13\1\27\1\34\1\12\1\20\2\uffff}>";
    static final String[] dfa_49s = {
            "\6\1\4\uffff\1\2\1\uffff\5\1\1\3\5\1\12\uffff\3\1\1\5\1\10\1\6\1\12\7\uffff\1\4\1\13\1\uffff\1\1\17\uffff\1\1\1\uffff\1\1\12\uffff\1\1\1\7\1\11",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "\1\21\1\22\1\25\1\26\1\27\14\uffff\1\30\1\31\1\23\1\24",
            "\1\32\3\uffff\1\34\1\33\1\35\4\uffff\1\36\1\uffff\1\37\1\uffff\1\112\1\40\1\41\1\42\13\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\113\1\114\1\115\1\116\1\117",
            "\1\120\1\121\1\124\1\125\1\126\14\uffff\1\127\1\130\1\122\1\123",
            "\1\131\1\132\1\135\1\136\1\137\14\uffff\1\140\1\141\1\133\1\134",
            "\1\142\3\uffff\1\144\1\143\1\145\4\uffff\1\146\1\uffff\1\147\1\uffff\1\u0092\1\150\1\151\1\152\13\uffff\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\34\1\33\1\35\4\uffff\1\36\1\uffff\1\37\1\uffff\1\112\1\40\1\41\1\42\13\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\113\1\114\1\115\1\116\1\117",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\u0099",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\144\1\143\1\145\4\uffff\1\146\1\uffff\1\147\1\uffff\1\u0092\1\150\1\151\1\152\13\uffff\1\153\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0093\1\u0094\1\u0095\1\u0096\1\u0097",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "\1\u009c",
            "",
            "\1\u009d\1\u009e\1\u00a1\1\u00a2\1\u00a3\14\uffff\1\u00a4\1\u00a5\1\u009f\1\u00a0",
            "",
            "",
            "\1\u00a6\1\u00a7\1\u00aa\1\u00ab\1\u00ac\14\uffff\1\u00ad\1\u00ae\1\u00a8\1\u00a9",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_43;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()* loopback of 3580:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_97 = input.LA(1);

                         
                        int index82_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_97);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_18 = input.LA(1);

                         
                        int index82_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_93 = input.LA(1);

                         
                        int index82_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_93);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA82_22 = input.LA(1);

                         
                        int index82_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA82_81 = input.LA(1);

                         
                        int index82_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_81);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA82_162 = input.LA(1);

                         
                        int index82_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_162);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA82_94 = input.LA(1);

                         
                        int index82_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_94);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA82_24 = input.LA(1);

                         
                        int index82_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_24);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA82_165 = input.LA(1);

                         
                        int index82_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_165);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA82_163 = input.LA(1);

                         
                        int index82_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_163);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA82_173 = input.LA(1);

                         
                        int index82_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_173);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA82_170 = input.LA(1);

                         
                        int index82_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_170);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA82_95 = input.LA(1);

                         
                        int index82_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_95);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA82_82 = input.LA(1);

                         
                        int index82_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_82);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA82_164 = input.LA(1);

                         
                        int index82_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_164);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA82_87 = input.LA(1);

                         
                        int index82_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_87);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA82_174 = input.LA(1);

                         
                        int index82_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_174);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA82_83 = input.LA(1);

                         
                        int index82_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_83);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA82_23 = input.LA(1);

                         
                        int index82_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_23);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA82_25 = input.LA(1);

                         
                        int index82_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_25);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA82_88 = input.LA(1);

                         
                        int index82_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_88);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA82_84 = input.LA(1);

                         
                        int index82_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_84);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA82_157 = input.LA(1);

                         
                        int index82_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_157);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA82_171 = input.LA(1);

                         
                        int index82_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_171);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA82_0 = input.LA(1);

                         
                        int index82_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_0==EOF||(LA82_0>=RULE_END_BLOCK && LA82_0<=RULE_INT)||(LA82_0>=17 && LA82_0<=21)||(LA82_0>=23 && LA82_0<=27)||(LA82_0>=38 && LA82_0<=40)||LA82_0==55||LA82_0==71||LA82_0==73||LA82_0==84) ) {s = 1;}

                        else if ( (LA82_0==15) ) {s = 2;}

                        else if ( (LA82_0==22) ) {s = 3;}

                        else if ( (LA82_0==52) ) {s = 4;}

                        else if ( (LA82_0==41) ) {s = 5;}

                        else if ( (LA82_0==43) ) {s = 6;}

                        else if ( LA82_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {s = 7;}

                        else if ( LA82_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {s = 8;}

                        else if ( LA82_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {s = 9;}

                        else if ( LA82_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {s = 10;}

                        else if ( LA82_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 11;}

                         
                        input.seek(index82_0);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA82_85 = input.LA(1);

                         
                        int index82_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_85);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA82_19 = input.LA(1);

                         
                        int index82_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_19);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA82_158 = input.LA(1);

                         
                        int index82_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_158);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA82_172 = input.LA(1);

                         
                        int index82_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_172);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA82_86 = input.LA(1);

                         
                        int index82_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_86);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA82_91 = input.LA(1);

                         
                        int index82_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_91);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA82_89 = input.LA(1);

                         
                        int index82_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_89);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA82_92 = input.LA(1);

                         
                        int index82_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_92);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA82_168 = input.LA(1);

                         
                        int index82_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_168);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA82_159 = input.LA(1);

                         
                        int index82_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_159);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA82_20 = input.LA(1);

                         
                        int index82_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_20);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA82_166 = input.LA(1);

                         
                        int index82_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_166);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA82_169 = input.LA(1);

                         
                        int index82_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_169);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA82_17 = input.LA(1);

                         
                        int index82_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_17);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA82_90 = input.LA(1);

                         
                        int index82_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_90);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA82_161 = input.LA(1);

                         
                        int index82_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_161);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA82_167 = input.LA(1);

                         
                        int index82_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 176;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_167);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA82_96 = input.LA(1);

                         
                        int index82_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 155;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_96);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA82_80 = input.LA(1);

                         
                        int index82_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_80);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA82_21 = input.LA(1);

                         
                        int index82_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 152;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_21);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA82_160 = input.LA(1);

                         
                        int index82_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 175;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_160);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_50s = "\u00a3\uffff";
    static final String dfa_51s = "\1\1\30\uffff\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\1\1\20\uffff\2\177\17\u008a\44\uffff\3\u008a\24\uffff\1\u008a\5\uffff\4\u008a\1\uffff\5\u008a\1\1\2\uffff\6\u00a2\12\uffff";
    static final String dfa_52s = "\1\5\1\uffff\25\20\1\uffff\1\6\6\4\1\6\1\4\2\6\5\4\3\6\11\uffff\2\5\2\4\15\5\44\uffff\3\5\24\uffff\1\5\5\uffff\1\4\3\5\1\uffff\5\5\1\4\2\6\6\5\12\uffff";
    static final String dfa_53s = "\1\126\1\uffff\25\20\1\uffff\1\32\1\117\1\52\1\32\1\124\1\115\1\124\1\32\1\34\2\32\1\124\1\110\1\115\1\33\1\115\3\32\11\uffff\21\126\44\uffff\3\126\24\uffff\1\126\5\uffff\4\126\1\uffff\5\126\1\124\2\32\6\126\12\uffff";
    static final String dfa_54s = "\1\uffff\1\2\25\uffff\1\1\23\uffff\11\1\21\uffff\44\1\3\uffff\24\1\1\uffff\5\1\4\uffff\1\1\16\uffff\12\1";
    static final String dfa_55s = "\u00a3\uffff}>";
    static final String[] dfa_56s = {
            "\3\1\1\10\1\11\1\12\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\1\7\5\1\6\uffff\4\27\1\13\1\14\1\22\1\16\1\24\1\23\1\25\7\27\1\15\1\26\1\27\1\17\17\27\1\20\1\27\1\21\4\27\6\uffff\3\1",
            "",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\36",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "",
            "\1\53\1\54\1\57\1\60\1\61\14\uffff\1\62\1\63\1\55\1\56",
            "\2\1\5\63\4\uffff\1\1\1\uffff\6\1\4\63\7\uffff\2\1\36\uffff\2\1\6\uffff\1\1\3\uffff\2\1",
            "\1\1\1\uffff\5\63\14\uffff\4\63\17\uffff\1\1",
            "\1\1\1\uffff\1\64\1\65\1\70\1\71\1\72\14\uffff\1\73\1\74\1\66\1\67",
            "\2\1\1\64\1\65\1\70\1\71\1\72\4\uffff\1\1\1\uffff\6\1\1\73\1\74\1\66\1\67\13\uffff\4\1\1\uffff\1\1\1\uffff\5\1\1\uffff\2\1\1\uffff\2\1\16\uffff\2\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\2\63\1\76\1\75\1\77\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\63\7\uffff\54\1",
            "\2\1\1\64\1\65\1\100\1\101\1\102\4\uffff\1\1\1\uffff\6\1\1\103\1\104\1\66\1\67\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\105\1\106\1\111\1\112\1\113\14\uffff\1\114\1\115\1\107\1\110",
            "\1\1\1\uffff\1\116\1\117\1\122\1\123\1\124\14\uffff\1\125\1\126\1\120\1\121\1\uffff\1\1",
            "\1\127\1\130\1\133\1\134\1\135\14\uffff\1\136\1\137\1\131\1\132",
            "\1\140\1\141\1\144\1\145\1\146\14\uffff\1\147\1\150\1\142\1\143",
            "\2\1\1\64\1\65\1\70\1\71\1\72\4\uffff\1\1\1\uffff\6\1\1\73\1\74\1\66\1\67\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\3\1\15\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\5\150\14\uffff\4\150\55\uffff\1\1",
            "\1\1\1\uffff\5\150\14\uffff\4\150\62\uffff\1\1",
            "\1\1\1\uffff\5\150\14\uffff\4\150\1\1",
            "\1\1\1\uffff\2\150\1\152\1\151\1\153\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\150\7\uffff\54\1",
            "\1\154\1\155\1\160\1\161\1\162\14\uffff\1\163\1\164\1\156\1\157",
            "\1\165\1\166\1\171\1\172\1\173\14\uffff\1\174\1\175\1\167\1\170",
            "\5\177\14\uffff\1\176\3\177",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\177\4\uffff\1\177\1\1\13\177\6\uffff\1\27\53\177\6\uffff\3\177",
            "\6\177\4\uffff\1\177\1\1\13\177\6\uffff\1\27\53\177\6\uffff\3\177",
            "\1\u0080\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\1\u0080\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0091\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0091\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0091\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\u008a\4\uffff\1\u008a\1\u0092\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0092\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0092\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a\1\u0093\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\53\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\1\13\u008a\6\uffff\1\27\53\u008a\6\uffff\3\u008a",
            "\4\1\1\u0094\1\u0095\1\u0096\4\uffff\1\1\1\uffff\6\1\1\u0097\1\u0098\2\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\17\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\2\1\1\u0099\1\u009a\1\u009b\14\uffff\1\u009c\1\u009d\2\1",
            "\2\1\1\u009e\1\u009f\1\u00a0\14\uffff\1\u00a1\1\u00a2\2\1",
            "\6\u00a2\4\uffff\1\u00a2\1\1\13\u00a2\6\uffff\1\27\53\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\53\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\53\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\53\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\53\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\53\u00a2\6\uffff\3\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final char[] dfa_52 = DFA.unpackEncodedStringToUnsignedChars(dfa_52s);
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final short[] dfa_54 = DFA.unpackEncodedString(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_50;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "()+ loopback of 3905:10: ( (lv_with_31_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_50;
            this.eof = dfa_51;
            this.min = dfa_52;
            this.max = dfa_53;
            this.accept = dfa_54;
            this.special = dfa_55;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "()+ loopback of 3957:10: ( (lv_env_36_0= ruleKeyValuePair ) )+";
        }
    }
    static final String[] dfa_57s = {
            "\6\1\4\uffff\1\1\1\uffff\12\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\3\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\10\1\11\5\uffff\1\1\1\uffff\1\1\2\uffff\1\7\7\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };
    static final short[][] dfa_57 = unpackEncodedStringArray(dfa_57s);

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_57;
        }
        public String getDescription() {
            return "()* loopback of 4168:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA124_0 = input.LA(1);

                         
                        int index124_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA124_0==EOF||(LA124_0>=RULE_END_BLOCK && LA124_0<=RULE_INT)||LA124_0==15||(LA124_0>=17 && LA124_0<=26)||(LA124_0>=38 && LA124_0<=41)||LA124_0==43||LA124_0==52||(LA124_0>=55 && LA124_0<=57)||LA124_0==71||LA124_0==73||LA124_0==84) ) {s = 1;}

                        else if ( LA124_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA124_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA124_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA124_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA124_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA124_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA124_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA124_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index124_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 124, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000078007C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007E8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000C007E8030L,0x000000000000C40CL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007E8030L,0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000078007D0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007FE87F2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x004BE000007E8030L,0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFFFFFFFC007A8710L,0x0000000000003FFFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFFFFFFC007E8732L,0x0000000000003FFFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800700L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003F8010FF2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003F8010FE2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000C00000022L,0x000000000000C40CL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000C08000032L,0x000000000000C40CL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000C078007E2L,0x000000000000C40CL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000C00000030L,0x000000000000C41CL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004001000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L,0x0000000000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000078007F2L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000032L,0x0000000000000020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000022L,0x0000000000060000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008022L,0x0000000000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x004BE00000000022L,0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00900BC000608032L,0x0000000000100280L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00900BC000608022L,0x0000000000100280L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000000178007D0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00900BC000608030L,0x0000000000180280L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x03900BC000608030L,0x0000000000100280L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000010L,0x0000000000002000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00900BC008608032L,0x0000000000100280L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00DBEBC000608030L,0x00000000001002C0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFFFFFFFC007A8732L,0x0000000000103FFFL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00301E0000408032L,0x0000000000600000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00301E0000408022L,0x0000000000600000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xFFFFFFFC007A8732L,0x0000000000603FFFL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0300000000000022L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0xDF00000000000030L,0x0000000000001003L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xDC00000000000022L,0x0000000000001003L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x3400000008000030L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x1400000008000030L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x3400000000000022L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x1400000000000022L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});

}

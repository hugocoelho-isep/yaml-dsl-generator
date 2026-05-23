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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_GH_EXPRESSION", "RULE_YAML_SCALAR", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'name'", "':'", "'on'", "'concurrency'", "'defaults'", "'jobs'", "'permissions'", "'env'", "'true'", "'false'", "'>'", "'|'", "'-'", "'['", "']'", "';'", "','", "'{'", "'}'", "'push'", "'pull_request'", "'branches'", "'tags'", "'runs-on'", "'needs'", "'steps'", "'uses'", "'run'", "'with'", "'shell'", "'contents'", "'security-events'", "'actions'", "'pages'", "'id-token'", "'types'", "'pull-requests'", "'if'", "'continue-on-error'", "'issues'", "'strategy'", "'fail-fast'", "'max-parallel'", "'matrix'", "'os'", "'build-type'", "'c-compiler'", "'cpp-compiler'", "'otp'", "'elixir'", "'include'", "'exclude'", "'workflow_call'", "'pull_request_target'", "'secrets'", "'required'", "'packages'", "'container'", "'image'", "'outputs'", "'release'", "'python-version'", "'configuration'", "'digests'", "'schedule'", "'workflow_dispatch'", "'cron'", "'group'", "'cancel-in-progress'", "'url'", "'environment'", "'id'", "'working-directory'"
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
    public static final int T__87=87;

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
    // InternalMyDsl.g:698:1: ruleKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'max-parallel' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' ) ;
    public final AntlrDatatypeRuleToken ruleKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_YAML_SCALAR_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:704:2: ( (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'max-parallel' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' ) )
            // InternalMyDsl.g:705:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'max-parallel' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' )
            {
            // InternalMyDsl.g:705:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'max-parallel' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' | kw= 'container' | kw= 'image' | kw= 'defaults' | kw= 'outputs' | kw= 'release' | kw= 'python-version' | kw= 'configuration' | kw= 'digests' )
            int alt16=54;
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
            case 73:
                {
                alt16=48;
                }
                break;
            case 19:
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
            case 78:
                {
                alt16=54;
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
                    // InternalMyDsl.g:898:3: kw= 'max-parallel'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getMaxParallelKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalMyDsl.g:904:3: kw= 'matrix'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getMatrixKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalMyDsl.g:910:3: kw= 'os'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOsKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalMyDsl.g:916:3: kw= 'build-type'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getBuildTypeKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalMyDsl.g:922:3: kw= 'c-compiler'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getCCompilerKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalMyDsl.g:928:3: kw= 'cpp-compiler'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getCppCompilerKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalMyDsl.g:934:3: kw= 'otp'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOtpKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalMyDsl.g:940:3: kw= 'elixir'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getElixirKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalMyDsl.g:946:3: kw= 'include'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIncludeKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalMyDsl.g:952:3: kw= 'exclude'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getExcludeKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalMyDsl.g:958:3: kw= 'workflow_call'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getWorkflow_callKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalMyDsl.g:964:3: kw= 'pull_request_target'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPull_request_targetKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalMyDsl.g:970:3: kw= 'secrets'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getSecretsKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalMyDsl.g:976:3: kw= 'required'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRequiredKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalMyDsl.g:982:3: kw= 'packages'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPackagesKeyword_45());
                    		

                    }
                    break;
                case 47 :
                    // InternalMyDsl.g:988:3: kw= 'container'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getContainerKeyword_46());
                    		

                    }
                    break;
                case 48 :
                    // InternalMyDsl.g:994:3: kw= 'image'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getImageKeyword_47());
                    		

                    }
                    break;
                case 49 :
                    // InternalMyDsl.g:1000:3: kw= 'defaults'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getDefaultsKeyword_48());
                    		

                    }
                    break;
                case 50 :
                    // InternalMyDsl.g:1006:3: kw= 'outputs'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOutputsKeyword_49());
                    		

                    }
                    break;
                case 51 :
                    // InternalMyDsl.g:1012:3: kw= 'release'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getReleaseKeyword_50());
                    		

                    }
                    break;
                case 52 :
                    // InternalMyDsl.g:1018:3: kw= 'python-version'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPythonVersionKeyword_51());
                    		

                    }
                    break;
                case 53 :
                    // InternalMyDsl.g:1024:3: kw= 'configuration'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getConfigurationKeyword_52());
                    		

                    }
                    break;
                case 54 :
                    // InternalMyDsl.g:1030:3: kw= 'digests'
                    {
                    kw=(Token)match(input,78,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getDigestsKeyword_53());
                    		

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
    // InternalMyDsl.g:1039:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalMyDsl.g:1039:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalMyDsl.g:1040:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalMyDsl.g:1046:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1052:2: ( ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1053:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1053:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1054:3: ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1054:3: ( (lv_key_0_0= ruleKeyName ) )
            // InternalMyDsl.g:1055:4: (lv_key_0_0= ruleKeyName )
            {
            // InternalMyDsl.g:1055:4: (lv_key_0_0= ruleKeyName )
            // InternalMyDsl.g:1056:5: lv_key_0_0= ruleKeyName
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
            		
            // InternalMyDsl.g:1077:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMyDsl.g:1078:4: (lv_value_2_0= ruleEString )
            {
            // InternalMyDsl.g:1078:4: (lv_value_2_0= ruleEString )
            // InternalMyDsl.g:1079:5: lv_value_2_0= ruleEString
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
    // InternalMyDsl.g:1100:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
    public final EObject entryRuleOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOn = null;


        try {
            // InternalMyDsl.g:1100:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:1101:2: iv_ruleOn= ruleOn EOF
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
    // InternalMyDsl.g:1107:1: ruleOn returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_29= RULE_END_BLOCK )? ) ;
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
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token this_END_BLOCK_29=null;
        EObject lv_push_5_0 = null;

        EObject lv_pullRequest_8_0 = null;

        EObject lv_pullRequestTarget_11_0 = null;

        EObject lv_schedule_15_0 = null;

        AntlrDatatypeRuleToken lv_workflowDispatch_19_0 = null;

        EObject lv_workflowCall_22_0 = null;

        EObject lv_release_25_0 = null;

        AntlrDatatypeRuleToken lv_issues_28_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1113:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_29= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1114:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_29= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1114:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_29= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1115:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_29= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1115:3: ()
            // InternalMyDsl.g:1116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnAccess().getOnAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1122:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BEG_BLOCK) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1123:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_18); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1128:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1129:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1129:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1130:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1133:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1134:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1134:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )*
            loop22:
            do {
                int alt22=9;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1135:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1135:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:1136:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1136:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:1137:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1140:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:1140:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1140:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:1140:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
            	    {
            	    otherlv_3=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOnAccess().getPushKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOnAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1148:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:1149:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:1149:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:1150:11: lv_push_5_0= rulePush
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
            	    // InternalMyDsl.g:1173:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1173:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:1174:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1174:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:1175:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1178:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:1178:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1178:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:1178:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
            	    {
            	    otherlv_6=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getOnAccess().getPull_requestKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOnAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1186:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:1187:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:1187:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:1188:11: lv_pullRequest_8_0= rulePull_request
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
            	    // InternalMyDsl.g:1211:4: ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1211:4: ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:1212:5: {...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1212:99: ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:1213:6: ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1216:9: ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:1216:10: {...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1216:19: (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:1216:20: otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) )
            	    {
            	    otherlv_9=(Token)match(input,68,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getOnAccess().getPull_request_targetKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_10, grammarAccess.getOnAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:1224:9: ( (lv_pullRequestTarget_11_0= rulePull_request ) )
            	    // InternalMyDsl.g:1225:10: (lv_pullRequestTarget_11_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:1225:10: (lv_pullRequestTarget_11_0= rulePull_request )
            	    // InternalMyDsl.g:1226:11: lv_pullRequestTarget_11_0= rulePull_request
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
            	    // InternalMyDsl.g:1249:4: ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1249:4: ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:1250:5: {...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1250:99: ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:1251:6: ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1254:9: ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:1254:10: {...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1254:19: (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:1254:20: otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? )
            	    {
            	    otherlv_12=(Token)match(input,79,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOnAccess().getScheduleKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_20); 

            	    									newLeafNode(otherlv_13, grammarAccess.getOnAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:1262:9: ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:1263:10: (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:1263:10: (this_BEG_BLOCK_14= RULE_BEG_BLOCK )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_BEG_BLOCK) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMyDsl.g:1264:11: this_BEG_BLOCK_14= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_14=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_20); 

            	            											newLeafNode(this_BEG_BLOCK_14, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1269:10: ( (lv_schedule_15_0= ruleSchedule ) )+
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
            	    	    // InternalMyDsl.g:1270:11: (lv_schedule_15_0= ruleSchedule )
            	    	    {
            	    	    // InternalMyDsl.g:1270:11: (lv_schedule_15_0= ruleSchedule )
            	    	    // InternalMyDsl.g:1271:12: lv_schedule_15_0= ruleSchedule
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

            	    // InternalMyDsl.g:1288:10: (this_END_BLOCK_16= RULE_END_BLOCK )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==RULE_END_BLOCK) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMyDsl.g:1289:11: this_END_BLOCK_16= RULE_END_BLOCK
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
            	    // InternalMyDsl.g:1301:4: ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:1301:4: ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) )
            	    // InternalMyDsl.g:1302:5: {...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:1302:99: ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) )
            	    // InternalMyDsl.g:1303:6: ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:1306:9: ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) )
            	    // InternalMyDsl.g:1306:10: {...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1306:19: (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? )
            	    // InternalMyDsl.g:1306:20: otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )?
            	    {
            	    otherlv_17=(Token)match(input,80,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getOnAccess().getWorkflow_dispatchKeyword_2_4_0());
            	    								
            	    otherlv_18=(Token)match(input,16,FOLLOW_22); 

            	    									newLeafNode(otherlv_18, grammarAccess.getOnAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:1314:9: ( (lv_workflowDispatch_19_0= ruleEString ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=23 && LA21_0<=26)) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMyDsl.g:1315:10: (lv_workflowDispatch_19_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1315:10: (lv_workflowDispatch_19_0= ruleEString )
            	            // InternalMyDsl.g:1316:11: lv_workflowDispatch_19_0= ruleEString
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
            	    // InternalMyDsl.g:1339:4: ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1339:4: ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) )
            	    // InternalMyDsl.g:1340:5: {...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:1340:99: ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) )
            	    // InternalMyDsl.g:1341:6: ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:1344:9: ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) )
            	    // InternalMyDsl.g:1344:10: {...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1344:19: (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) )
            	    // InternalMyDsl.g:1344:20: otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) )
            	    {
            	    otherlv_20=(Token)match(input,67,FOLLOW_3); 

            	    									newLeafNode(otherlv_20, grammarAccess.getOnAccess().getWorkflow_callKeyword_2_5_0());
            	    								
            	    otherlv_21=(Token)match(input,16,FOLLOW_23); 

            	    									newLeafNode(otherlv_21, grammarAccess.getOnAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:1352:9: ( (lv_workflowCall_22_0= ruleWorkflow_call ) )
            	    // InternalMyDsl.g:1353:10: (lv_workflowCall_22_0= ruleWorkflow_call )
            	    {
            	    // InternalMyDsl.g:1353:10: (lv_workflowCall_22_0= ruleWorkflow_call )
            	    // InternalMyDsl.g:1354:11: lv_workflowCall_22_0= ruleWorkflow_call
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
            	    // InternalMyDsl.g:1377:4: ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1377:4: ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) )
            	    // InternalMyDsl.g:1378:5: {...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:1378:99: ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) )
            	    // InternalMyDsl.g:1379:6: ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:1382:9: ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) )
            	    // InternalMyDsl.g:1382:10: {...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1382:19: (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) )
            	    // InternalMyDsl.g:1382:20: otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) )
            	    {
            	    otherlv_23=(Token)match(input,75,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getOnAccess().getReleaseKeyword_2_6_0());
            	    								
            	    otherlv_24=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_24, grammarAccess.getOnAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:1390:9: ( (lv_release_25_0= ruleRelease ) )
            	    // InternalMyDsl.g:1391:10: (lv_release_25_0= ruleRelease )
            	    {
            	    // InternalMyDsl.g:1391:10: (lv_release_25_0= ruleRelease )
            	    // InternalMyDsl.g:1392:11: lv_release_25_0= ruleRelease
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
            	case 8 :
            	    // InternalMyDsl.g:1415:4: ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1415:4: ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1416:5: {...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:1416:99: ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1417:6: ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:1420:9: ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1420:10: {...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1420:19: (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1420:20: otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) )
            	    {
            	    otherlv_26=(Token)match(input,54,FOLLOW_3); 

            	    									newLeafNode(otherlv_26, grammarAccess.getOnAccess().getIssuesKeyword_2_7_0());
            	    								
            	    otherlv_27=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_27, grammarAccess.getOnAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalMyDsl.g:1428:9: ( (lv_issues_28_0= ruleEString ) )
            	    // InternalMyDsl.g:1429:10: (lv_issues_28_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1429:10: (lv_issues_28_0= ruleEString )
            	    // InternalMyDsl.g:1430:11: lv_issues_28_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getIssuesEStringParserRuleCall_2_7_2_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_issues_28_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getOnRule());
            	    											}
            	    											set(
            	    												current,
            	    												"issues",
            	    												lv_issues_28_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
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

            // InternalMyDsl.g:1460:3: (this_END_BLOCK_29= RULE_END_BLOCK )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_END_BLOCK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1461:4: this_END_BLOCK_29= RULE_END_BLOCK
                    {
                    this_END_BLOCK_29=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_29, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // InternalMyDsl.g:1470:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalMyDsl.g:1470:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:1471:2: iv_rulePush= rulePush EOF
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
    // InternalMyDsl.g:1477:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1483:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1484:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1484:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1485:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1485:3: ()
            // InternalMyDsl.g:1486:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1496:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1497:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1497:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1498:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1501:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1502:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1502:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
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
            	    // InternalMyDsl.g:1503:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1503:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1504:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1504:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1505:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1508:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1508:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1508:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1508:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPushAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPushAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1516:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
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
            	            // InternalMyDsl.g:1517:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1517:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1518:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1522:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1523:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1531:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1532:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1532:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1533:14: lv_branches_8_0= ruleEString
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
            	            // InternalMyDsl.g:1561:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1561:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1562:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1566:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1567:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1567:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1568:13: lv_branches_12_0= ruleEString
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

            	            // InternalMyDsl.g:1585:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==31) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1586:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPushAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1590:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1591:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1591:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1592:14: lv_branches_14_0= ruleEString
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
            	    // InternalMyDsl.g:1622:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1622:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1623:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1623:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1624:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1627:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1627:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1627:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1627:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,37,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPushAccess().getTagsKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPushAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1635:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
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
            	            // InternalMyDsl.g:1636:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1636:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1637:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1641:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1642:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1650:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1651:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1651:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1652:14: lv_tags_21_0= ruleEString
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
            	            // InternalMyDsl.g:1680:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1680:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1681:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1685:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1686:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1686:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:1687:13: lv_tags_25_0= ruleEString
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

            	            // InternalMyDsl.g:1704:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==31) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1705:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPushAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1709:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1710:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1710:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1711:14: lv_tags_27_0= ruleEString
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
    // InternalMyDsl.g:1756:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
    public final EObject entryRulePull_request() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_request = null;


        try {
            // InternalMyDsl.g:1756:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1757:2: iv_rulePull_request= rulePull_request EOF
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
    // InternalMyDsl.g:1763:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1769:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1770:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1770:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1771:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1771:3: ()
            // InternalMyDsl.g:1772:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPull_requestAccess().getPull_requestAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_31); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1782:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1783:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1783:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1784:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPull_requestAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1787:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1788:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1788:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+
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
            	    // InternalMyDsl.g:1789:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1789:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1790:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1790:109: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1791:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1794:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1794:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1794:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1794:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPull_requestAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPull_requestAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1802:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
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
            	            // InternalMyDsl.g:1803:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1803:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1804:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1808:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1809:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1817:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1818:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1818:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1819:14: lv_branches_8_0= ruleEString
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
            	            // InternalMyDsl.g:1847:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1847:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1848:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1852:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1853:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1853:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1854:13: lv_branches_12_0= ruleEString
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

            	            // InternalMyDsl.g:1871:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==31) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1872:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPull_requestAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1876:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1877:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1877:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1878:14: lv_branches_14_0= ruleEString
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
            	    // InternalMyDsl.g:1908:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1908:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1909:5: {...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1909:109: ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1910:6: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1913:9: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1913:10: {...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1913:19: (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1913:20: otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPull_requestAccess().getTypesKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPull_requestAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1921:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
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
            	            // InternalMyDsl.g:1922:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1922:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1923:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1927:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1928:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,27,FOLLOW_19); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1936:12: ( (lv_types_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1937:13: (lv_types_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1937:13: (lv_types_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1938:14: lv_types_21_0= ruleEString
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
            	            // InternalMyDsl.g:1966:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1966:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1967:11: otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1971:11: ( (lv_types_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1972:12: (lv_types_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1972:12: (lv_types_25_0= ruleEString )
            	            // InternalMyDsl.g:1973:13: lv_types_25_0= ruleEString
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

            	            // InternalMyDsl.g:1990:11: (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )*
            	            loop35:
            	            do {
            	                int alt35=2;
            	                int LA35_0 = input.LA(1);

            	                if ( (LA35_0==31) ) {
            	                    alt35=1;
            	                }


            	                switch (alt35) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1991:12: otherlv_26= ',' ( (lv_types_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPull_requestAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1995:12: ( (lv_types_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1996:13: (lv_types_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1996:13: (lv_types_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1997:14: lv_types_27_0= ruleEString
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
    // InternalMyDsl.g:2043:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMyDsl.g:2043:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMyDsl.g:2044:2: iv_ruleSchedule= ruleSchedule EOF
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
    // InternalMyDsl.g:2050:1: ruleSchedule returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2056:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2057:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2057:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2058:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:2062:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_BEG_BLOCK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2063:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_34); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getScheduleAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getCronKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:2076:3: ( (lv_cron_4_0= ruleEString ) )
            // InternalMyDsl.g:2077:4: (lv_cron_4_0= ruleEString )
            {
            // InternalMyDsl.g:2077:4: (lv_cron_4_0= ruleEString )
            // InternalMyDsl.g:2078:5: lv_cron_4_0= ruleEString
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

            // InternalMyDsl.g:2095:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_END_BLOCK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2096:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:2105:1: entryRuleWorkflow_call returns [EObject current=null] : iv_ruleWorkflow_call= ruleWorkflow_call EOF ;
    public final EObject entryRuleWorkflow_call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow_call = null;


        try {
            // InternalMyDsl.g:2105:54: (iv_ruleWorkflow_call= ruleWorkflow_call EOF )
            // InternalMyDsl.g:2106:2: iv_ruleWorkflow_call= ruleWorkflow_call EOF
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
    // InternalMyDsl.g:2112:1: ruleWorkflow_call returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2118:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2119:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2119:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2120:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2120:3: ()
            // InternalMyDsl.g:2121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkflow_callAccess().getWorkflow_callAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2127:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_BEG_BLOCK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:2128:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_36); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getWorkflow_callAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2133:3: (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==69) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2134:4: otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )?
                    {
                    otherlv_2=(Token)match(input,69,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkflow_callAccess().getSecretsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkflow_callAccess().getColonKeyword_2_1());
                    			
                    // InternalMyDsl.g:2142:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_BEG_BLOCK) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:2143:5: this_BEG_BLOCK_4= RULE_BEG_BLOCK
                            {
                            this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_9); 

                            					newLeafNode(this_BEG_BLOCK_4, grammarAccess.getWorkflow_callAccess().getBEG_BLOCKTerminalRuleCall_2_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:2148:4: ( (lv_secrets_5_0= ruleSecret ) )+
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
                    	    // InternalMyDsl.g:2149:5: (lv_secrets_5_0= ruleSecret )
                    	    {
                    	    // InternalMyDsl.g:2149:5: (lv_secrets_5_0= ruleSecret )
                    	    // InternalMyDsl.g:2150:6: lv_secrets_5_0= ruleSecret
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

                    // InternalMyDsl.g:2167:4: (this_END_BLOCK_6= RULE_END_BLOCK )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_END_BLOCK) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyDsl.g:2168:5: this_END_BLOCK_6= RULE_END_BLOCK
                            {
                            this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_35); 

                            					newLeafNode(this_END_BLOCK_6, grammarAccess.getWorkflow_callAccess().getEND_BLOCKTerminalRuleCall_2_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2174:3: (this_END_BLOCK_7= RULE_END_BLOCK )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_END_BLOCK) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2175:4: this_END_BLOCK_7= RULE_END_BLOCK
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
    // InternalMyDsl.g:2184:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalMyDsl.g:2184:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalMyDsl.g:2185:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalMyDsl.g:2191:1: ruleSecret returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2197:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2198:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2198:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2199:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2199:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2200:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2200:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2201:5: lv_id_0_0= ruleEString
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
            		
            // InternalMyDsl.g:2222:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BEG_BLOCK) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2223:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_39); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getSecretAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2228:3: (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2229:4: otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,70,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSecretAccess().getRequiredKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getColonKeyword_3_1());
                    			
                    // InternalMyDsl.g:2237:4: ( (lv_required_5_0= ruleEBoolean ) )
                    // InternalMyDsl.g:2238:5: (lv_required_5_0= ruleEBoolean )
                    {
                    // InternalMyDsl.g:2238:5: (lv_required_5_0= ruleEBoolean )
                    // InternalMyDsl.g:2239:6: lv_required_5_0= ruleEBoolean
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

            // InternalMyDsl.g:2257:3: (this_END_BLOCK_6= RULE_END_BLOCK )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_END_BLOCK) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2258:4: this_END_BLOCK_6= RULE_END_BLOCK
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
    // InternalMyDsl.g:2267:1: entryRuleConcurrency returns [EObject current=null] : iv_ruleConcurrency= ruleConcurrency EOF ;
    public final EObject entryRuleConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrency = null;


        try {
            // InternalMyDsl.g:2267:52: (iv_ruleConcurrency= ruleConcurrency EOF )
            // InternalMyDsl.g:2268:2: iv_ruleConcurrency= ruleConcurrency EOF
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
    // InternalMyDsl.g:2274:1: ruleConcurrency returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2280:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2281:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2281:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2282:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2282:3: ()
            // InternalMyDsl.g:2283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcurrencyAccess().getConcurrencyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2289:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_BEG_BLOCK) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2290:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_41); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getConcurrencyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2295:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2296:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2296:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2297:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2300:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2301:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2301:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            loop50:
            do {
                int alt50=3;
                int LA50_0 = input.LA(1);

                if ( LA50_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
                    alt50=2;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:2302:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2302:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2303:5: {...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2303:108: ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2304:6: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2307:9: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2307:10: {...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:2307:19: (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2307:20: otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,82,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getConcurrencyAccess().getGroupKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConcurrencyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2315:9: ( (lv_group_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2316:10: (lv_group_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2316:10: (lv_group_5_0= ruleEString )
            	    // InternalMyDsl.g:2317:11: lv_group_5_0= ruleEString
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
            	    // InternalMyDsl.g:2340:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2340:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:2341:5: {...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2341:108: ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:2342:6: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2345:9: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:2345:10: {...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:2345:19: (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:2345:20: otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,83,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConcurrencyAccess().getCancelInProgressKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_40); 

            	    									newLeafNode(otherlv_7, grammarAccess.getConcurrencyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2353:9: ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:2354:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:2354:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    // InternalMyDsl.g:2355:11: lv_cancelInProgress_8_0= ruleEBoolean
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

            // InternalMyDsl.g:2385:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_END_BLOCK) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2386:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:2395:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:2395:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:2396:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalMyDsl.g:2402:1: ruleEnvironment returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2408:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2409:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2409:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2410:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2410:3: ()
            // InternalMyDsl.g:2411:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2417:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BEG_BLOCK) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2418:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_42); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getEnvironmentAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2423:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2424:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2424:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2425:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2428:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2429:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2429:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            loop53:
            do {
                int alt53=3;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:2430:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2430:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2431:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2431:108: ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2432:6: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2435:9: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2435:10: {...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:2435:19: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2435:20: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2443:9: ( (lv_name_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2444:10: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2444:10: (lv_name_5_0= ruleEString )
            	    // InternalMyDsl.g:2445:11: lv_name_5_0= ruleEString
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
            	    // InternalMyDsl.g:2468:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2468:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2469:5: {...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2469:108: ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2470:6: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2473:9: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2473:10: {...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:2473:19: (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2473:20: otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,84,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2481:9: ( (lv_url_8_0= ruleEString ) )
            	    // InternalMyDsl.g:2482:10: (lv_url_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2482:10: (lv_url_8_0= ruleEString )
            	    // InternalMyDsl.g:2483:11: lv_url_8_0= ruleEString
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

            // InternalMyDsl.g:2513:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_END_BLOCK) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2514:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:2523:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // InternalMyDsl.g:2523:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalMyDsl.g:2524:2: iv_rulePermissions= rulePermissions EOF
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
    // InternalMyDsl.g:2530:1: rulePermissions returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2536:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2537:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2537:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2538:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2538:3: ()
            // InternalMyDsl.g:2539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionsAccess().getPermissionsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2545:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_BEG_BLOCK) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2546:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_43); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPermissionsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2551:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2552:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2552:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2553:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2556:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2557:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2557:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*
            loop56:
            do {
                int alt56=9;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:2558:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2558:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2559:5: {...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2559:108: ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2560:6: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2563:9: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2563:10: {...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2563:19: (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2563:20: otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPermissionsAccess().getContentsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPermissionsAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2571:9: ( (lv_contents_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2572:10: (lv_contents_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2572:10: (lv_contents_5_0= ruleEString )
            	    // InternalMyDsl.g:2573:11: lv_contents_5_0= ruleEString
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
            	    // InternalMyDsl.g:2596:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2596:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2597:5: {...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2597:108: ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2598:6: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2601:9: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2601:10: {...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2601:19: (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2601:20: otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPermissionsAccess().getSecurityEventsKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPermissionsAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2609:9: ( (lv_securityEvents_8_0= ruleEString ) )
            	    // InternalMyDsl.g:2610:10: (lv_securityEvents_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2610:10: (lv_securityEvents_8_0= ruleEString )
            	    // InternalMyDsl.g:2611:11: lv_securityEvents_8_0= ruleEString
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
            	    // InternalMyDsl.g:2634:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2634:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2635:5: {...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2635:108: ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2636:6: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2639:9: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2639:10: {...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2639:19: (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2639:20: otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,47,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getPermissionsAccess().getActionsKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPermissionsAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:2647:9: ( (lv_actions_11_0= ruleEString ) )
            	    // InternalMyDsl.g:2648:10: (lv_actions_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2648:10: (lv_actions_11_0= ruleEString )
            	    // InternalMyDsl.g:2649:11: lv_actions_11_0= ruleEString
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
            	    // InternalMyDsl.g:2672:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2672:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2673:5: {...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2673:108: ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2674:6: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2677:9: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2677:10: {...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2677:19: (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2677:20: otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPermissionsAccess().getPagesKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getPermissionsAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:2685:9: ( (lv_pages_14_0= ruleEString ) )
            	    // InternalMyDsl.g:2686:10: (lv_pages_14_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2686:10: (lv_pages_14_0= ruleEString )
            	    // InternalMyDsl.g:2687:11: lv_pages_14_0= ruleEString
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
            	    // InternalMyDsl.g:2710:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2710:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2711:5: {...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2711:108: ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2712:6: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2715:9: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2715:10: {...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2715:19: (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2715:20: otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getPermissionsAccess().getIdTokenKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPermissionsAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:2723:9: ( (lv_idToken_17_0= ruleEString ) )
            	    // InternalMyDsl.g:2724:10: (lv_idToken_17_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2724:10: (lv_idToken_17_0= ruleEString )
            	    // InternalMyDsl.g:2725:11: lv_idToken_17_0= ruleEString
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
            	    // InternalMyDsl.g:2748:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2748:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2749:5: {...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:2749:108: ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2750:6: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:2753:9: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2753:10: {...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2753:19: (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2753:20: otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getPermissionsAccess().getPullRequestsKeyword_2_5_0());
            	    								
            	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getPermissionsAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:2761:9: ( (lv_pullRequests_20_0= ruleEString ) )
            	    // InternalMyDsl.g:2762:10: (lv_pullRequests_20_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2762:10: (lv_pullRequests_20_0= ruleEString )
            	    // InternalMyDsl.g:2763:11: lv_pullRequests_20_0= ruleEString
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
            	    // InternalMyDsl.g:2786:4: ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2786:4: ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2787:5: {...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:2787:108: ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2788:6: ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:2791:9: ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2791:10: {...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2791:19: (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2791:20: otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) )
            	    {
            	    otherlv_21=(Token)match(input,54,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getPermissionsAccess().getIssuesKeyword_2_6_0());
            	    								
            	    otherlv_22=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_22, grammarAccess.getPermissionsAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:2799:9: ( (lv_issues_23_0= ruleEString ) )
            	    // InternalMyDsl.g:2800:10: (lv_issues_23_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2800:10: (lv_issues_23_0= ruleEString )
            	    // InternalMyDsl.g:2801:11: lv_issues_23_0= ruleEString
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
            	    // InternalMyDsl.g:2824:4: ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2824:4: ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2825:5: {...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:2825:108: ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2826:6: ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:2829:9: ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2829:10: {...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2829:19: (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2829:20: otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,71,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getPermissionsAccess().getPackagesKeyword_2_7_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getPermissionsAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalMyDsl.g:2837:9: ( (lv_packages_26_0= ruleEString ) )
            	    // InternalMyDsl.g:2838:10: (lv_packages_26_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2838:10: (lv_packages_26_0= ruleEString )
            	    // InternalMyDsl.g:2839:11: lv_packages_26_0= ruleEString
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

            // InternalMyDsl.g:2869:3: (this_END_BLOCK_27= RULE_END_BLOCK )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_END_BLOCK) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2870:4: this_END_BLOCK_27= RULE_END_BLOCK
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
    // InternalMyDsl.g:2879:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDsl.g:2879:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDsl.g:2880:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDsl.g:2886:1: ruleJob returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2892:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2893:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2893:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2894:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_60= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2894:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2895:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2895:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2896:5: lv_id_0_0= ruleEString
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
            		
            // InternalMyDsl.g:2917:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_BEG_BLOCK) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2918:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_45); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2923:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2924:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2924:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2925:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2928:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:2929:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2929:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop73:
            do {
                int alt73=14;
                alt73 = dfa73.predict(input);
                switch (alt73) {
            	case 1 :
            	    // InternalMyDsl.g:2930:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2930:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2931:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2931:100: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2932:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2935:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2935:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2935:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2935:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getJobAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJobAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:2943:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2944:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2944:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2945:11: lv_name_6_0= ruleEString
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
            	    // InternalMyDsl.g:2968:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2968:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2969:5: {...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2969:100: ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2970:6: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2973:9: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2973:10: {...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2973:19: (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2973:20: otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJobAccess().getRunsOnKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:2981:9: ( (lv_runsOn_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2982:10: (lv_runsOn_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2982:10: (lv_runsOn_9_0= ruleEString )
            	    // InternalMyDsl.g:2983:11: lv_runsOn_9_0= ruleEString
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
            	    // InternalMyDsl.g:3006:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3006:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:3007:5: {...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:3007:100: ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalMyDsl.g:3008:6: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:3011:9: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalMyDsl.g:3011:10: {...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3011:19: (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    // InternalMyDsl.g:3011:20: otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    {
            	    otherlv_10=(Token)match(input,39,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getJobAccess().getNeedsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_46); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJobAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:3019:9: ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
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
            	            // InternalMyDsl.g:3020:10: ( (lv_needs_12_0= ruleEString ) )
            	            {
            	            // InternalMyDsl.g:3020:10: ( (lv_needs_12_0= ruleEString ) )
            	            // InternalMyDsl.g:3021:11: (lv_needs_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:3021:11: (lv_needs_12_0= ruleEString )
            	            // InternalMyDsl.g:3022:12: lv_needs_12_0= ruleEString
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
            	            // InternalMyDsl.g:3040:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:3040:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            // InternalMyDsl.g:3041:11: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_13, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:3045:11: (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:3046:12: otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_14=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_14, grammarAccess.getJobAccess().getHyphenMinusKeyword_3_2_2_1_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:3050:12: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	            	    int alt59=2;
            	            	    int LA59_0 = input.LA(1);

            	            	    if ( (LA59_0==RULE_BEG_BLOCK) ) {
            	            	        alt59=1;
            	            	    }
            	            	    switch (alt59) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:3051:13: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_15, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:3056:12: ( (lv_needs_16_0= ruleEString ) )
            	            	    // InternalMyDsl.g:3057:13: (lv_needs_16_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:3057:13: (lv_needs_16_0= ruleEString )
            	            	    // InternalMyDsl.g:3058:14: lv_needs_16_0= ruleEString
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

            	            	    // InternalMyDsl.g:3075:12: (this_END_BLOCK_17= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:3076:13: this_END_BLOCK_17= RULE_END_BLOCK
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
            	            // InternalMyDsl.g:3088:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            {
            	            // InternalMyDsl.g:3088:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            // InternalMyDsl.g:3089:11: otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']'
            	            {
            	            otherlv_19=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_3_2_2_2_0());
            	            										
            	            // InternalMyDsl.g:3093:11: ( (lv_needs_20_0= ruleEString ) )
            	            // InternalMyDsl.g:3094:12: (lv_needs_20_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:3094:12: (lv_needs_20_0= ruleEString )
            	            // InternalMyDsl.g:3095:13: lv_needs_20_0= ruleEString
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

            	            // InternalMyDsl.g:3112:11: (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==31) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:3113:12: otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_21, grammarAccess.getJobAccess().getCommaKeyword_3_2_2_2_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:3117:12: ( (lv_needs_22_0= ruleEString ) )
            	            	    // InternalMyDsl.g:3118:13: (lv_needs_22_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:3118:13: (lv_needs_22_0= ruleEString )
            	            	    // InternalMyDsl.g:3119:14: lv_needs_22_0= ruleEString
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
            	    // InternalMyDsl.g:3149:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3149:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3150:5: {...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:3150:100: ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3151:6: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:3154:9: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3154:10: {...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3154:19: (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3154:20: otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getJobAccess().getIfKeyword_3_3_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJobAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:3162:9: ( (lv_if_26_0= ruleEString ) )
            	    // InternalMyDsl.g:3163:10: (lv_if_26_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3163:10: (lv_if_26_0= ruleEString )
            	    // InternalMyDsl.g:3164:11: lv_if_26_0= ruleEString
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
            	    // InternalMyDsl.g:3187:4: ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3187:4: ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3188:5: {...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:3188:100: ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3189:6: ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:3192:9: ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3192:10: {...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3192:19: (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3192:20: otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) )
            	    {
            	    otherlv_27=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getJobAccess().getUsesKeyword_3_4_0());
            	    								
            	    otherlv_28=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_28, grammarAccess.getJobAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:3200:9: ( (lv_uses_29_0= ruleEString ) )
            	    // InternalMyDsl.g:3201:10: (lv_uses_29_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3201:10: (lv_uses_29_0= ruleEString )
            	    // InternalMyDsl.g:3202:11: lv_uses_29_0= ruleEString
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
            	    // InternalMyDsl.g:3225:4: ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3225:4: ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) )
            	    // InternalMyDsl.g:3226:5: {...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:3226:100: ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) )
            	    // InternalMyDsl.g:3227:6: ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:3230:9: ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) )
            	    // InternalMyDsl.g:3230:10: {...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3230:19: (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) )
            	    // InternalMyDsl.g:3230:20: otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) )
            	    {
            	    otherlv_30=(Token)match(input,85,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getJobAccess().getEnvironmentKeyword_3_5_0());
            	    								
            	    otherlv_31=(Token)match(input,16,FOLLOW_47); 

            	    									newLeafNode(otherlv_31, grammarAccess.getJobAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:3238:9: ( (lv_environment_32_0= ruleEnvironment ) )
            	    // InternalMyDsl.g:3239:10: (lv_environment_32_0= ruleEnvironment )
            	    {
            	    // InternalMyDsl.g:3239:10: (lv_environment_32_0= ruleEnvironment )
            	    // InternalMyDsl.g:3240:11: lv_environment_32_0= ruleEnvironment
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
            	    // InternalMyDsl.g:3263:4: ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3263:4: ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) )
            	    // InternalMyDsl.g:3264:5: {...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:3264:100: ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) )
            	    // InternalMyDsl.g:3265:6: ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:3268:9: ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) )
            	    // InternalMyDsl.g:3268:10: {...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3268:19: (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) )
            	    // InternalMyDsl.g:3268:20: otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) )
            	    {
            	    otherlv_33=(Token)match(input,55,FOLLOW_3); 

            	    									newLeafNode(otherlv_33, grammarAccess.getJobAccess().getStrategyKeyword_3_6_0());
            	    								
            	    otherlv_34=(Token)match(input,16,FOLLOW_48); 

            	    									newLeafNode(otherlv_34, grammarAccess.getJobAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:3276:9: ( (lv_strategy_35_0= ruleStrategy ) )
            	    // InternalMyDsl.g:3277:10: (lv_strategy_35_0= ruleStrategy )
            	    {
            	    // InternalMyDsl.g:3277:10: (lv_strategy_35_0= ruleStrategy )
            	    // InternalMyDsl.g:3278:11: lv_strategy_35_0= ruleStrategy
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
            	    // InternalMyDsl.g:3301:4: ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3301:4: ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) )
            	    // InternalMyDsl.g:3302:5: {...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:3302:100: ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) )
            	    // InternalMyDsl.g:3303:6: ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:3306:9: ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) )
            	    // InternalMyDsl.g:3306:10: {...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3306:19: (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) )
            	    // InternalMyDsl.g:3306:20: otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) )
            	    {
            	    otherlv_36=(Token)match(input,72,FOLLOW_3); 

            	    									newLeafNode(otherlv_36, grammarAccess.getJobAccess().getContainerKeyword_3_7_0());
            	    								
            	    otherlv_37=(Token)match(input,16,FOLLOW_49); 

            	    									newLeafNode(otherlv_37, grammarAccess.getJobAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:3314:9: ( (lv_container_38_0= ruleContainer ) )
            	    // InternalMyDsl.g:3315:10: (lv_container_38_0= ruleContainer )
            	    {
            	    // InternalMyDsl.g:3315:10: (lv_container_38_0= ruleContainer )
            	    // InternalMyDsl.g:3316:11: lv_container_38_0= ruleContainer
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
            	    // InternalMyDsl.g:3339:4: ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3339:4: ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) )
            	    // InternalMyDsl.g:3340:5: {...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalMyDsl.g:3340:100: ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) )
            	    // InternalMyDsl.g:3341:6: ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalMyDsl.g:3344:9: ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) )
            	    // InternalMyDsl.g:3344:10: {...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3344:19: (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) )
            	    // InternalMyDsl.g:3344:20: otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) )
            	    {
            	    otherlv_39=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_39, grammarAccess.getJobAccess().getOutputsKeyword_3_8_0());
            	    								
            	    otherlv_40=(Token)match(input,16,FOLLOW_50); 

            	    									newLeafNode(otherlv_40, grammarAccess.getJobAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalMyDsl.g:3352:9: ( (lv_outputs_41_0= ruleOutputs ) )
            	    // InternalMyDsl.g:3353:10: (lv_outputs_41_0= ruleOutputs )
            	    {
            	    // InternalMyDsl.g:3353:10: (lv_outputs_41_0= ruleOutputs )
            	    // InternalMyDsl.g:3354:11: lv_outputs_41_0= ruleOutputs
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
            	    // InternalMyDsl.g:3377:4: ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:3377:4: ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3378:5: {...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalMyDsl.g:3378:100: ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3379:6: ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalMyDsl.g:3382:9: ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3382:10: {...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3382:19: (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3382:20: otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )?
            	    {
            	    otherlv_42=(Token)match(input,40,FOLLOW_3); 

            	    									newLeafNode(otherlv_42, grammarAccess.getJobAccess().getStepsKeyword_3_9_0());
            	    								
            	    otherlv_43=(Token)match(input,16,FOLLOW_20); 

            	    									newLeafNode(otherlv_43, grammarAccess.getJobAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalMyDsl.g:3390:9: (this_BEG_BLOCK_44= RULE_BEG_BLOCK )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_BEG_BLOCK) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalMyDsl.g:3391:10: this_BEG_BLOCK_44= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_44=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_20); 

            	            										newLeafNode(this_BEG_BLOCK_44, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_9_2());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3396:9: ( (lv_steps_45_0= ruleStep ) )+
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
            	    	    // InternalMyDsl.g:3397:10: (lv_steps_45_0= ruleStep )
            	    	    {
            	    	    // InternalMyDsl.g:3397:10: (lv_steps_45_0= ruleStep )
            	    	    // InternalMyDsl.g:3398:11: lv_steps_45_0= ruleStep
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

            	    // InternalMyDsl.g:3415:9: (this_END_BLOCK_46= RULE_END_BLOCK )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==RULE_END_BLOCK) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalMyDsl.g:3416:10: this_END_BLOCK_46= RULE_END_BLOCK
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
            	    // InternalMyDsl.g:3427:4: ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3427:4: ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:3428:5: {...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10)");
            	    }
            	    // InternalMyDsl.g:3428:101: ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:3429:6: ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10);
            	    					
            	    // InternalMyDsl.g:3432:9: ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:3432:10: {...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3432:19: (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:3432:20: otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) )
            	    {
            	    otherlv_47=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_47, grammarAccess.getJobAccess().getPermissionsKeyword_3_10_0());
            	    								
            	    otherlv_48=(Token)match(input,16,FOLLOW_52); 

            	    									newLeafNode(otherlv_48, grammarAccess.getJobAccess().getColonKeyword_3_10_1());
            	    								
            	    // InternalMyDsl.g:3440:9: ( (lv_permissions_49_0= rulePermissions ) )
            	    // InternalMyDsl.g:3441:10: (lv_permissions_49_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:3441:10: (lv_permissions_49_0= rulePermissions )
            	    // InternalMyDsl.g:3442:11: lv_permissions_49_0= rulePermissions
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
            	    // InternalMyDsl.g:3465:4: ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3465:4: ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3466:5: {...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11)");
            	    }
            	    // InternalMyDsl.g:3466:101: ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3467:6: ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11);
            	    					
            	    // InternalMyDsl.g:3470:9: ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3470:10: {...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3470:19: (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3470:20: otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? )
            	    {
            	    otherlv_50=(Token)match(input,22,FOLLOW_3); 

            	    									newLeafNode(otherlv_50, grammarAccess.getJobAccess().getEnvKeyword_3_11_0());
            	    								
            	    otherlv_51=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_51, grammarAccess.getJobAccess().getColonKeyword_3_11_1());
            	    								
            	    // InternalMyDsl.g:3478:9: ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3479:10: (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3479:10: (this_BEG_BLOCK_52= RULE_BEG_BLOCK )?
            	    int alt67=2;
            	    int LA67_0 = input.LA(1);

            	    if ( (LA67_0==RULE_BEG_BLOCK) ) {
            	        alt67=1;
            	    }
            	    switch (alt67) {
            	        case 1 :
            	            // InternalMyDsl.g:3480:11: this_BEG_BLOCK_52= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_52=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_52, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_11_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3485:10: ( (lv_env_53_0= ruleKeyValuePair ) )+
            	    int cnt68=0;
            	    loop68:
            	    do {
            	        int alt68=2;
            	        alt68 = dfa68.predict(input);
            	        switch (alt68) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3486:11: (lv_env_53_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3486:11: (lv_env_53_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3487:12: lv_env_53_0= ruleKeyValuePair
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

            	    // InternalMyDsl.g:3504:10: (this_END_BLOCK_54= RULE_END_BLOCK )?
            	    int alt69=2;
            	    int LA69_0 = input.LA(1);

            	    if ( (LA69_0==RULE_END_BLOCK) ) {
            	        alt69=1;
            	    }
            	    switch (alt69) {
            	        case 1 :
            	            // InternalMyDsl.g:3505:11: this_END_BLOCK_54= RULE_END_BLOCK
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
            	    // InternalMyDsl.g:3517:4: ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3517:4: ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3518:5: {...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12)");
            	    }
            	    // InternalMyDsl.g:3518:101: ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3519:6: ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12);
            	    					
            	    // InternalMyDsl.g:3522:9: ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3522:10: {...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3522:19: (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3522:20: otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? )
            	    {
            	    otherlv_55=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_55, grammarAccess.getJobAccess().getWithKeyword_3_12_0());
            	    								
            	    otherlv_56=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_56, grammarAccess.getJobAccess().getColonKeyword_3_12_1());
            	    								
            	    // InternalMyDsl.g:3530:9: ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3531:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3531:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==RULE_BEG_BLOCK) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalMyDsl.g:3532:11: this_BEG_BLOCK_57= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_57=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_57, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_12_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3537:10: ( (lv_with_58_0= ruleKeyValuePair ) )+
            	    int cnt71=0;
            	    loop71:
            	    do {
            	        int alt71=2;
            	        alt71 = dfa71.predict(input);
            	        switch (alt71) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3538:11: (lv_with_58_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3538:11: (lv_with_58_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3539:12: lv_with_58_0= ruleKeyValuePair
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

            	    // InternalMyDsl.g:3556:10: (this_END_BLOCK_59= RULE_END_BLOCK )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==RULE_END_BLOCK) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalMyDsl.g:3557:11: this_END_BLOCK_59= RULE_END_BLOCK
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

            // InternalMyDsl.g:3576:3: (this_END_BLOCK_60= RULE_END_BLOCK )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_END_BLOCK) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMyDsl.g:3577:4: this_END_BLOCK_60= RULE_END_BLOCK
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
    // InternalMyDsl.g:3586:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalMyDsl.g:3586:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:3587:2: iv_ruleStep= ruleStep EOF
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
    // InternalMyDsl.g:3593:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:3599:2: ( ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:3600:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:3600:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            // InternalMyDsl.g:3601:3: () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:3601:3: ()
            // InternalMyDsl.g:3602:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            // InternalMyDsl.g:3612:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_BEG_BLOCK) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalMyDsl.g:3613:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_55); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3618:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:3619:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:3619:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:3620:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:3623:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:3624:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:3624:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop82:
            do {
                int alt82=11;
                alt82 = dfa82.predict(input);
                switch (alt82) {
            	case 1 :
            	    // InternalMyDsl.g:3625:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3625:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3626:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:3626:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3627:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:3630:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3630:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3630:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3630:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getStepAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:3638:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:3639:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3639:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:3640:11: lv_name_6_0= ruleEString
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
            	    // InternalMyDsl.g:3663:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3663:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3664:5: {...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:3664:101: ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3665:6: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:3668:9: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3668:10: {...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3668:19: (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3668:20: otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,86,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStepAccess().getIdKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:3676:9: ( (lv_id_9_0= ruleEString ) )
            	    // InternalMyDsl.g:3677:10: (lv_id_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3677:10: (lv_id_9_0= ruleEString )
            	    // InternalMyDsl.g:3678:11: lv_id_9_0= ruleEString
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
            	    // InternalMyDsl.g:3701:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3701:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3702:5: {...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:3702:101: ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3703:6: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:3706:9: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3706:10: {...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3706:19: (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3706:20: otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStepAccess().getUsesKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStepAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:3714:9: ( (lv_uses_12_0= ruleEString ) )
            	    // InternalMyDsl.g:3715:10: (lv_uses_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3715:10: (lv_uses_12_0= ruleEString )
            	    // InternalMyDsl.g:3716:11: lv_uses_12_0= ruleEString
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
            	    // InternalMyDsl.g:3739:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3739:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3740:5: {...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:3740:101: ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3741:6: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:3744:9: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3744:10: {...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3744:19: (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3744:20: otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStepAccess().getRunKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getStepAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:3752:9: ( (lv_run_15_0= ruleEString ) )
            	    // InternalMyDsl.g:3753:10: (lv_run_15_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3753:10: (lv_run_15_0= ruleEString )
            	    // InternalMyDsl.g:3754:11: lv_run_15_0= ruleEString
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
            	    // InternalMyDsl.g:3777:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3777:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3778:5: {...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:3778:101: ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3779:6: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:3782:9: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3782:10: {...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3782:19: (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3782:20: otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getStepAccess().getIfKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getStepAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:3790:9: ( (lv_if_18_0= ruleEString ) )
            	    // InternalMyDsl.g:3791:10: (lv_if_18_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3791:10: (lv_if_18_0= ruleEString )
            	    // InternalMyDsl.g:3792:11: lv_if_18_0= ruleEString
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
            	    // InternalMyDsl.g:3815:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3815:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3816:5: {...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:3816:101: ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3817:6: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:3820:9: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3820:10: {...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3820:19: (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3820:20: otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,87,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getStepAccess().getWorkingDirectoryKeyword_3_5_0());
            	    								
            	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_20, grammarAccess.getStepAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:3828:9: ( (lv_workingDirectory_21_0= ruleEString ) )
            	    // InternalMyDsl.g:3829:10: (lv_workingDirectory_21_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3829:10: (lv_workingDirectory_21_0= ruleEString )
            	    // InternalMyDsl.g:3830:11: lv_workingDirectory_21_0= ruleEString
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
            	    // InternalMyDsl.g:3853:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3853:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3854:5: {...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:3854:101: ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3855:6: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:3858:9: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3858:10: {...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3858:19: (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3858:20: otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,44,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getStepAccess().getShellKeyword_3_6_0());
            	    								
            	    otherlv_23=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getStepAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:3866:9: ( (lv_shell_24_0= ruleEString ) )
            	    // InternalMyDsl.g:3867:10: (lv_shell_24_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3867:10: (lv_shell_24_0= ruleEString )
            	    // InternalMyDsl.g:3868:11: lv_shell_24_0= ruleEString
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
            	    // InternalMyDsl.g:3891:4: ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3891:4: ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:3892:5: {...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:3892:101: ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:3893:6: ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:3896:9: ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:3896:10: {...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3896:19: (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:3896:20: otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) )
            	    {
            	    otherlv_25=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getStepAccess().getContinueOnErrorKeyword_3_7_0());
            	    								
            	    otherlv_26=(Token)match(input,16,FOLLOW_40); 

            	    									newLeafNode(otherlv_26, grammarAccess.getStepAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:3904:9: ( (lv_continueOnError_27_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:3905:10: (lv_continueOnError_27_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:3905:10: (lv_continueOnError_27_0= ruleEBoolean )
            	    // InternalMyDsl.g:3906:11: lv_continueOnError_27_0= ruleEBoolean
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
            	    // InternalMyDsl.g:3929:4: ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3929:4: ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3930:5: {...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalMyDsl.g:3930:101: ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3931:6: ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalMyDsl.g:3934:9: ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3934:10: {...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3934:19: (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3934:20: otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? )
            	    {
            	    otherlv_28=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getStepAccess().getWithKeyword_3_8_0());
            	    								
            	    otherlv_29=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_29, grammarAccess.getStepAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalMyDsl.g:3942:9: ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3943:10: (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3943:10: (this_BEG_BLOCK_30= RULE_BEG_BLOCK )?
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==RULE_BEG_BLOCK) ) {
            	        alt76=1;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // InternalMyDsl.g:3944:11: this_BEG_BLOCK_30= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_30=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_30, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_8_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3949:10: ( (lv_with_31_0= ruleKeyValuePair ) )+
            	    int cnt77=0;
            	    loop77:
            	    do {
            	        int alt77=2;
            	        alt77 = dfa77.predict(input);
            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3950:11: (lv_with_31_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3950:11: (lv_with_31_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3951:12: lv_with_31_0= ruleKeyValuePair
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

            	    // InternalMyDsl.g:3968:10: (this_END_BLOCK_32= RULE_END_BLOCK )?
            	    int alt78=2;
            	    int LA78_0 = input.LA(1);

            	    if ( (LA78_0==RULE_END_BLOCK) ) {
            	        alt78=1;
            	    }
            	    switch (alt78) {
            	        case 1 :
            	            // InternalMyDsl.g:3969:11: this_END_BLOCK_32= RULE_END_BLOCK
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
            	    // InternalMyDsl.g:3981:4: ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3981:4: ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3982:5: {...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalMyDsl.g:3982:101: ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3983:6: ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalMyDsl.g:3986:9: ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3986:10: {...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3986:19: (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3986:20: otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    {
            	    otherlv_33=(Token)match(input,22,FOLLOW_3); 

            	    									newLeafNode(otherlv_33, grammarAccess.getStepAccess().getEnvKeyword_3_9_0());
            	    								
            	    otherlv_34=(Token)match(input,16,FOLLOW_12); 

            	    									newLeafNode(otherlv_34, grammarAccess.getStepAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalMyDsl.g:3994:9: ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3995:10: (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3995:10: (this_BEG_BLOCK_35= RULE_BEG_BLOCK )?
            	    int alt79=2;
            	    int LA79_0 = input.LA(1);

            	    if ( (LA79_0==RULE_BEG_BLOCK) ) {
            	        alt79=1;
            	    }
            	    switch (alt79) {
            	        case 1 :
            	            // InternalMyDsl.g:3996:11: this_BEG_BLOCK_35= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_35=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            											newLeafNode(this_BEG_BLOCK_35, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_9_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:4001:10: ( (lv_env_36_0= ruleKeyValuePair ) )+
            	    int cnt80=0;
            	    loop80:
            	    do {
            	        int alt80=2;
            	        alt80 = dfa80.predict(input);
            	        switch (alt80) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4002:11: (lv_env_36_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:4002:11: (lv_env_36_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:4003:12: lv_env_36_0= ruleKeyValuePair
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

            	    // InternalMyDsl.g:4020:10: (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    int alt81=2;
            	    int LA81_0 = input.LA(1);

            	    if ( (LA81_0==RULE_END_BLOCK) ) {
            	        alt81=1;
            	    }
            	    switch (alt81) {
            	        case 1 :
            	            // InternalMyDsl.g:4021:11: this_END_BLOCK_37= RULE_END_BLOCK
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

            // InternalMyDsl.g:4040:3: (this_END_BLOCK_38= RULE_END_BLOCK )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_END_BLOCK) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMyDsl.g:4041:4: this_END_BLOCK_38= RULE_END_BLOCK
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
    // InternalMyDsl.g:4050:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalMyDsl.g:4050:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalMyDsl.g:4051:2: iv_ruleStrategy= ruleStrategy EOF
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
    // InternalMyDsl.g:4057:1: ruleStrategy returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) ;
    public final EObject ruleStrategy() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_maxParallel_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_END_BLOCK_12=null;
        AntlrDatatypeRuleToken lv_failFast_5_0 = null;

        EObject lv_matrix_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:4063:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:4064:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:4064:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            // InternalMyDsl.g:4065:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:4065:3: ()
            // InternalMyDsl.g:4066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrategyAccess().getStrategyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:4072:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_BEG_BLOCK) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMyDsl.g:4073:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_57); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getStrategyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4078:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:4079:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:4079:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:4080:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4083:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )* )
            // InternalMyDsl.g:4084:6: ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:4084:6: ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) ) )*
            loop85:
            do {
                int alt85=4;
                int LA85_0 = input.LA(1);

                if ( LA85_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0) ) {
                    alt85=1;
                }
                else if ( LA85_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1) ) {
                    alt85=2;
                }
                else if ( LA85_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 2) ) {
                    alt85=3;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalMyDsl.g:4085:4: ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4085:4: ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:4086:5: {...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4086:105: ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:4087:6: ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4090:9: ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:4090:10: {...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "true");
            	    }
            	    // InternalMyDsl.g:4090:19: (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:4090:20: otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,56,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getFailFastKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_40); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStrategyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:4098:9: ( (lv_failFast_5_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:4099:10: (lv_failFast_5_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:4099:10: (lv_failFast_5_0= ruleEBoolean )
            	    // InternalMyDsl.g:4100:11: lv_failFast_5_0= ruleEBoolean
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
            	    // InternalMyDsl.g:4123:4: ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4123:4: ({...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) ) )
            	    // InternalMyDsl.g:4124:5: {...}? => ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4124:105: ( ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) ) )
            	    // InternalMyDsl.g:4125:6: ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4128:9: ({...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) ) )
            	    // InternalMyDsl.g:4128:10: {...}? => (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "true");
            	    }
            	    // InternalMyDsl.g:4128:19: (otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) ) )
            	    // InternalMyDsl.g:4128:20: otherlv_6= 'max-parallel' otherlv_7= ':' ( (lv_maxParallel_8_0= RULE_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getStrategyAccess().getMaxParallelKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_58); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStrategyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:4136:9: ( (lv_maxParallel_8_0= RULE_INT ) )
            	    // InternalMyDsl.g:4137:10: (lv_maxParallel_8_0= RULE_INT )
            	    {
            	    // InternalMyDsl.g:4137:10: (lv_maxParallel_8_0= RULE_INT )
            	    // InternalMyDsl.g:4138:11: lv_maxParallel_8_0= RULE_INT
            	    {
            	    lv_maxParallel_8_0=(Token)match(input,RULE_INT,FOLLOW_57); 

            	    											newLeafNode(lv_maxParallel_8_0, grammarAccess.getStrategyAccess().getMaxParallelINTTerminalRuleCall_2_1_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getStrategyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"maxParallel",
            	    												lv_maxParallel_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:4160:4: ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4160:4: ({...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) ) )
            	    // InternalMyDsl.g:4161:5: {...}? => ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:4161:105: ( ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) ) )
            	    // InternalMyDsl.g:4162:6: ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:4165:9: ({...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) ) )
            	    // InternalMyDsl.g:4165:10: {...}? => (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "true");
            	    }
            	    // InternalMyDsl.g:4165:19: (otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) ) )
            	    // InternalMyDsl.g:4165:20: otherlv_9= 'matrix' otherlv_10= ':' ( (lv_matrix_11_0= ruleMatrix ) )
            	    {
            	    otherlv_9=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getStrategyAccess().getMatrixKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_59); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStrategyAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:4173:9: ( (lv_matrix_11_0= ruleMatrix ) )
            	    // InternalMyDsl.g:4174:10: (lv_matrix_11_0= ruleMatrix )
            	    {
            	    // InternalMyDsl.g:4174:10: (lv_matrix_11_0= ruleMatrix )
            	    // InternalMyDsl.g:4175:11: lv_matrix_11_0= ruleMatrix
            	    {

            	    											newCompositeNode(grammarAccess.getStrategyAccess().getMatrixMatrixParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_57);
            	    lv_matrix_11_0=ruleMatrix();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStrategyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"matrix",
            	    												lv_matrix_11_0,
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

            // InternalMyDsl.g:4205:3: (this_END_BLOCK_12= RULE_END_BLOCK )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_END_BLOCK) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMyDsl.g:4206:4: this_END_BLOCK_12= RULE_END_BLOCK
                    {
                    this_END_BLOCK_12=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_12, grammarAccess.getStrategyAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // InternalMyDsl.g:4215:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalMyDsl.g:4215:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalMyDsl.g:4216:2: iv_ruleMatrix= ruleMatrix EOF
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
    // InternalMyDsl.g:4222:1: ruleMatrix returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:4228:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:4229:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:4229:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )? )
            // InternalMyDsl.g:4230:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_97= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:4230:3: ()
            // InternalMyDsl.g:4231:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatrixAccess().getMatrixAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:4237:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_BEG_BLOCK) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalMyDsl.g:4238:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_60); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4243:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalMyDsl.g:4244:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:4244:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalMyDsl.g:4245:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4248:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )* )
            // InternalMyDsl.g:4249:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalMyDsl.g:4249:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )*
            loop124:
            do {
                int alt124=9;
                alt124 = dfa124.predict(input);
                switch (alt124) {
            	case 1 :
            	    // InternalMyDsl.g:4250:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4250:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4251:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4251:103: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4252:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4255:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:4255:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4255:19: (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:4255:20: otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMatrixAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:4263:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
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
            	            // InternalMyDsl.g:4264:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4264:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4265:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:4269:11: (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:4270:12: otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_6=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4274:12: (this_BEG_BLOCK_7= RULE_BEG_BLOCK )?
            	            	    int alt88=2;
            	            	    int LA88_0 = input.LA(1);

            	            	    if ( (LA88_0==RULE_BEG_BLOCK) ) {
            	            	        alt88=1;
            	            	    }
            	            	    switch (alt88) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4275:13: this_BEG_BLOCK_7= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_7, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4280:12: ( (lv_os_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4281:13: (lv_os_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4281:13: (lv_os_8_0= ruleEString )
            	            	    // InternalMyDsl.g:4282:14: lv_os_8_0= ruleEString
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

            	            	    // InternalMyDsl.g:4299:12: (this_END_BLOCK_9= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:4300:13: this_END_BLOCK_9= RULE_END_BLOCK
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

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4312:10: (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:4312:10: (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:4313:11: otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:4317:11: ( (lv_os_12_0= ruleEString ) )
            	            // InternalMyDsl.g:4318:12: (lv_os_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4318:12: (lv_os_12_0= ruleEString )
            	            // InternalMyDsl.g:4319:13: lv_os_12_0= ruleEString
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

            	            // InternalMyDsl.g:4336:11: (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )*
            	            loop91:
            	            do {
            	                int alt91=2;
            	                int LA91_0 = input.LA(1);

            	                if ( (LA91_0==31) ) {
            	                    alt91=1;
            	                }


            	                switch (alt91) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4337:12: otherlv_13= ',' ( (lv_os_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getMatrixAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4341:12: ( (lv_os_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4342:13: (lv_os_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4342:13: (lv_os_14_0= ruleEString )
            	            	    // InternalMyDsl.g:4343:14: lv_os_14_0= ruleEString
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

            	            otherlv_15=(Token)match(input,29,FOLLOW_60); 

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
            	    // InternalMyDsl.g:4373:4: ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4373:4: ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4374:5: {...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4374:103: ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4375:6: ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4378:9: ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:4378:10: {...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4378:19: (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:4378:20: otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMatrixAccess().getBuildTypeKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_17, grammarAccess.getMatrixAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:4386:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
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
            	            // InternalMyDsl.g:4387:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4387:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4388:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:4392:11: (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:4393:12: otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_19=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4397:12: (this_BEG_BLOCK_20= RULE_BEG_BLOCK )?
            	            	    int alt93=2;
            	            	    int LA93_0 = input.LA(1);

            	            	    if ( (LA93_0==RULE_BEG_BLOCK) ) {
            	            	        alt93=1;
            	            	    }
            	            	    switch (alt93) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4398:13: this_BEG_BLOCK_20= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_20, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4403:12: ( (lv_buildType_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4404:13: (lv_buildType_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4404:13: (lv_buildType_21_0= ruleEString )
            	            	    // InternalMyDsl.g:4405:14: lv_buildType_21_0= ruleEString
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

            	            	    // InternalMyDsl.g:4422:12: (this_END_BLOCK_22= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:4423:13: this_END_BLOCK_22= RULE_END_BLOCK
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

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4435:10: (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:4435:10: (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:4436:11: otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:4440:11: ( (lv_buildType_25_0= ruleEString ) )
            	            // InternalMyDsl.g:4441:12: (lv_buildType_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4441:12: (lv_buildType_25_0= ruleEString )
            	            // InternalMyDsl.g:4442:13: lv_buildType_25_0= ruleEString
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

            	            // InternalMyDsl.g:4459:11: (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )*
            	            loop96:
            	            do {
            	                int alt96=2;
            	                int LA96_0 = input.LA(1);

            	                if ( (LA96_0==31) ) {
            	                    alt96=1;
            	                }


            	                switch (alt96) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4460:12: otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getMatrixAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4464:12: ( (lv_buildType_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4465:13: (lv_buildType_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4465:13: (lv_buildType_27_0= ruleEString )
            	            	    // InternalMyDsl.g:4466:14: lv_buildType_27_0= ruleEString
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

            	            otherlv_28=(Token)match(input,29,FOLLOW_60); 

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
            	    // InternalMyDsl.g:4496:4: ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4496:4: ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4497:5: {...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:4497:103: ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4498:6: ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:4501:9: ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) )
            	    // InternalMyDsl.g:4501:10: {...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4501:19: (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) )
            	    // InternalMyDsl.g:4501:20: otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) )
            	    {
            	    otherlv_29=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_29, grammarAccess.getMatrixAccess().getCCompilerKeyword_2_2_0());
            	    								
            	    otherlv_30=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_30, grammarAccess.getMatrixAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:4509:9: ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) )
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
            	            // InternalMyDsl.g:4510:10: (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4510:10: (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4511:11: this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_31=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_31, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0_0());
            	            										
            	            // InternalMyDsl.g:4515:11: (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:4516:12: otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_32=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_32, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_2_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4520:12: (this_BEG_BLOCK_33= RULE_BEG_BLOCK )?
            	            	    int alt98=2;
            	            	    int LA98_0 = input.LA(1);

            	            	    if ( (LA98_0==RULE_BEG_BLOCK) ) {
            	            	        alt98=1;
            	            	    }
            	            	    switch (alt98) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4521:13: this_BEG_BLOCK_33= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_33=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_33, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4526:12: ( (lv_cCompiler_34_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4527:13: (lv_cCompiler_34_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4527:13: (lv_cCompiler_34_0= ruleEString )
            	            	    // InternalMyDsl.g:4528:14: lv_cCompiler_34_0= ruleEString
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

            	            	    // InternalMyDsl.g:4545:12: (this_END_BLOCK_35= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:4546:13: this_END_BLOCK_35= RULE_END_BLOCK
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

            	            this_END_BLOCK_36=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

            	            											newLeafNode(this_END_BLOCK_36, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_2_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4558:10: (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' )
            	            {
            	            // InternalMyDsl.g:4558:10: (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' )
            	            // InternalMyDsl.g:4559:11: otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']'
            	            {
            	            otherlv_37=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_37, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:4563:11: ( (lv_cCompiler_38_0= ruleEString ) )
            	            // InternalMyDsl.g:4564:12: (lv_cCompiler_38_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4564:12: (lv_cCompiler_38_0= ruleEString )
            	            // InternalMyDsl.g:4565:13: lv_cCompiler_38_0= ruleEString
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

            	            // InternalMyDsl.g:4582:11: (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )*
            	            loop101:
            	            do {
            	                int alt101=2;
            	                int LA101_0 = input.LA(1);

            	                if ( (LA101_0==31) ) {
            	                    alt101=1;
            	                }


            	                switch (alt101) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4583:12: otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) )
            	            	    {
            	            	    otherlv_39=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_39, grammarAccess.getMatrixAccess().getCommaKeyword_2_2_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4587:12: ( (lv_cCompiler_40_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4588:13: (lv_cCompiler_40_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4588:13: (lv_cCompiler_40_0= ruleEString )
            	            	    // InternalMyDsl.g:4589:14: lv_cCompiler_40_0= ruleEString
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

            	            otherlv_41=(Token)match(input,29,FOLLOW_60); 

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
            	    // InternalMyDsl.g:4619:4: ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4619:4: ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4620:5: {...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:4620:103: ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4621:6: ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:4624:9: ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) )
            	    // InternalMyDsl.g:4624:10: {...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4624:19: (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) )
            	    // InternalMyDsl.g:4624:20: otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) )
            	    {
            	    otherlv_42=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_42, grammarAccess.getMatrixAccess().getOtpKeyword_2_3_0());
            	    								
            	    otherlv_43=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_43, grammarAccess.getMatrixAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:4632:9: ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) )
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
            	            // InternalMyDsl.g:4633:10: (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4633:10: (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4634:11: this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_44=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_44, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_0());
            	            										
            	            // InternalMyDsl.g:4638:11: (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:4639:12: otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_45=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_45, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_3_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4643:12: (this_BEG_BLOCK_46= RULE_BEG_BLOCK )?
            	            	    int alt103=2;
            	            	    int LA103_0 = input.LA(1);

            	            	    if ( (LA103_0==RULE_BEG_BLOCK) ) {
            	            	        alt103=1;
            	            	    }
            	            	    switch (alt103) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4644:13: this_BEG_BLOCK_46= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_46=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_46, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4649:12: ( (lv_otp_47_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4650:13: (lv_otp_47_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4650:13: (lv_otp_47_0= ruleEString )
            	            	    // InternalMyDsl.g:4651:14: lv_otp_47_0= ruleEString
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

            	            	    // InternalMyDsl.g:4668:12: (this_END_BLOCK_48= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:4669:13: this_END_BLOCK_48= RULE_END_BLOCK
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

            	            this_END_BLOCK_49=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

            	            											newLeafNode(this_END_BLOCK_49, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4681:10: (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' )
            	            {
            	            // InternalMyDsl.g:4681:10: (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' )
            	            // InternalMyDsl.g:4682:11: otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']'
            	            {
            	            otherlv_50=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_50, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_3_2_1_0());
            	            										
            	            // InternalMyDsl.g:4686:11: ( (lv_otp_51_0= ruleEString ) )
            	            // InternalMyDsl.g:4687:12: (lv_otp_51_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4687:12: (lv_otp_51_0= ruleEString )
            	            // InternalMyDsl.g:4688:13: lv_otp_51_0= ruleEString
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

            	            // InternalMyDsl.g:4705:11: (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )*
            	            loop106:
            	            do {
            	                int alt106=2;
            	                int LA106_0 = input.LA(1);

            	                if ( (LA106_0==31) ) {
            	                    alt106=1;
            	                }


            	                switch (alt106) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4706:12: otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) )
            	            	    {
            	            	    otherlv_52=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_52, grammarAccess.getMatrixAccess().getCommaKeyword_2_3_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4710:12: ( (lv_otp_53_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4711:13: (lv_otp_53_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4711:13: (lv_otp_53_0= ruleEString )
            	            	    // InternalMyDsl.g:4712:14: lv_otp_53_0= ruleEString
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

            	            otherlv_54=(Token)match(input,29,FOLLOW_60); 

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
            	    // InternalMyDsl.g:4742:4: ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4742:4: ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4743:5: {...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:4743:103: ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4744:6: ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:4747:9: ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) )
            	    // InternalMyDsl.g:4747:10: {...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4747:19: (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) )
            	    // InternalMyDsl.g:4747:20: otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) )
            	    {
            	    otherlv_55=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_55, grammarAccess.getMatrixAccess().getElixirKeyword_2_4_0());
            	    								
            	    otherlv_56=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_56, grammarAccess.getMatrixAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:4755:9: ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) )
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
            	            // InternalMyDsl.g:4756:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4756:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4757:11: this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_57=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_57, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_4_2_0_0());
            	            										
            	            // InternalMyDsl.g:4761:11: (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:4762:12: otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_58=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_58, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_4_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4766:12: (this_BEG_BLOCK_59= RULE_BEG_BLOCK )?
            	            	    int alt108=2;
            	            	    int LA108_0 = input.LA(1);

            	            	    if ( (LA108_0==RULE_BEG_BLOCK) ) {
            	            	        alt108=1;
            	            	    }
            	            	    switch (alt108) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4767:13: this_BEG_BLOCK_59= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_59=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_59, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_4_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4772:12: ( (lv_elixir_60_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4773:13: (lv_elixir_60_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4773:13: (lv_elixir_60_0= ruleEString )
            	            	    // InternalMyDsl.g:4774:14: lv_elixir_60_0= ruleEString
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

            	            	    // InternalMyDsl.g:4791:12: (this_END_BLOCK_61= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:4792:13: this_END_BLOCK_61= RULE_END_BLOCK
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

            	            this_END_BLOCK_62=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

            	            											newLeafNode(this_END_BLOCK_62, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_4_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4804:10: (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' )
            	            {
            	            // InternalMyDsl.g:4804:10: (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' )
            	            // InternalMyDsl.g:4805:11: otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']'
            	            {
            	            otherlv_63=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_63, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_4_2_1_0());
            	            										
            	            // InternalMyDsl.g:4809:11: ( (lv_elixir_64_0= ruleEString ) )
            	            // InternalMyDsl.g:4810:12: (lv_elixir_64_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4810:12: (lv_elixir_64_0= ruleEString )
            	            // InternalMyDsl.g:4811:13: lv_elixir_64_0= ruleEString
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

            	            // InternalMyDsl.g:4828:11: (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )*
            	            loop111:
            	            do {
            	                int alt111=2;
            	                int LA111_0 = input.LA(1);

            	                if ( (LA111_0==31) ) {
            	                    alt111=1;
            	                }


            	                switch (alt111) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4829:12: otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) )
            	            	    {
            	            	    otherlv_65=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_65, grammarAccess.getMatrixAccess().getCommaKeyword_2_4_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4833:12: ( (lv_elixir_66_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4834:13: (lv_elixir_66_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4834:13: (lv_elixir_66_0= ruleEString )
            	            	    // InternalMyDsl.g:4835:14: lv_elixir_66_0= ruleEString
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

            	            otherlv_67=(Token)match(input,29,FOLLOW_60); 

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
            	    // InternalMyDsl.g:4865:4: ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4865:4: ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4866:5: {...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:4866:103: ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4867:6: ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:4870:9: ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) )
            	    // InternalMyDsl.g:4870:10: {...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4870:19: (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) )
            	    // InternalMyDsl.g:4870:20: otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) )
            	    {
            	    otherlv_68=(Token)match(input,77,FOLLOW_3); 

            	    									newLeafNode(otherlv_68, grammarAccess.getMatrixAccess().getConfigurationKeyword_2_5_0());
            	    								
            	    otherlv_69=(Token)match(input,16,FOLLOW_26); 

            	    									newLeafNode(otherlv_69, grammarAccess.getMatrixAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:4878:9: ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) )
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
            	            // InternalMyDsl.g:4879:10: (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4879:10: (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4880:11: this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_70=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	            											newLeafNode(this_BEG_BLOCK_70, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_5_2_0_0());
            	            										
            	            // InternalMyDsl.g:4884:11: (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:4885:12: otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_71=(Token)match(input,27,FOLLOW_9); 

            	            	    												newLeafNode(otherlv_71, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_5_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4889:12: (this_BEG_BLOCK_72= RULE_BEG_BLOCK )?
            	            	    int alt113=2;
            	            	    int LA113_0 = input.LA(1);

            	            	    if ( (LA113_0==RULE_BEG_BLOCK) ) {
            	            	        alt113=1;
            	            	    }
            	            	    switch (alt113) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4890:13: this_BEG_BLOCK_72= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_72=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_72, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_5_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4895:12: ( (lv_configuration_73_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4896:13: (lv_configuration_73_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4896:13: (lv_configuration_73_0= ruleEString )
            	            	    // InternalMyDsl.g:4897:14: lv_configuration_73_0= ruleEString
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

            	            	    // InternalMyDsl.g:4914:12: (this_END_BLOCK_74= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:4915:13: this_END_BLOCK_74= RULE_END_BLOCK
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

            	            this_END_BLOCK_75=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

            	            											newLeafNode(this_END_BLOCK_75, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_5_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4927:10: (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' )
            	            {
            	            // InternalMyDsl.g:4927:10: (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' )
            	            // InternalMyDsl.g:4928:11: otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']'
            	            {
            	            otherlv_76=(Token)match(input,28,FOLLOW_4); 

            	            											newLeafNode(otherlv_76, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_5_2_1_0());
            	            										
            	            // InternalMyDsl.g:4932:11: ( (lv_configuration_77_0= ruleEString ) )
            	            // InternalMyDsl.g:4933:12: (lv_configuration_77_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4933:12: (lv_configuration_77_0= ruleEString )
            	            // InternalMyDsl.g:4934:13: lv_configuration_77_0= ruleEString
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

            	            // InternalMyDsl.g:4951:11: (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )*
            	            loop116:
            	            do {
            	                int alt116=2;
            	                int LA116_0 = input.LA(1);

            	                if ( (LA116_0==31) ) {
            	                    alt116=1;
            	                }


            	                switch (alt116) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4952:12: otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) )
            	            	    {
            	            	    otherlv_78=(Token)match(input,31,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_78, grammarAccess.getMatrixAccess().getCommaKeyword_2_5_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4956:12: ( (lv_configuration_79_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4957:13: (lv_configuration_79_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4957:13: (lv_configuration_79_0= ruleEString )
            	            	    // InternalMyDsl.g:4958:14: lv_configuration_79_0= ruleEString
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

            	            otherlv_80=(Token)match(input,29,FOLLOW_60); 

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
            	    // InternalMyDsl.g:4988:4: ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:4988:4: ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:4989:5: {...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:4989:103: ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:4990:6: ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:4993:9: ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:4993:10: {...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4993:19: (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK )
            	    // InternalMyDsl.g:4993:20: otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK
            	    {
            	    otherlv_81=(Token)match(input,65,FOLLOW_3); 

            	    									newLeafNode(otherlv_81, grammarAccess.getMatrixAccess().getIncludeKeyword_2_6_0());
            	    								
            	    otherlv_82=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_82, grammarAccess.getMatrixAccess().getColonKeyword_2_6_1());
            	    								
            	    this_BEG_BLOCK_83=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	    									newLeafNode(this_BEG_BLOCK_83, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_6_2());
            	    								
            	    // InternalMyDsl.g:5005:9: (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+
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
            	    	    // InternalMyDsl.g:5006:10: otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )?
            	    	    {
            	    	    otherlv_84=(Token)match(input,27,FOLLOW_61); 

            	    	    										newLeafNode(otherlv_84, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_6_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5010:10: (this_BEG_BLOCK_85= RULE_BEG_BLOCK )?
            	    	    int alt118=2;
            	    	    int LA118_0 = input.LA(1);

            	    	    if ( (LA118_0==RULE_BEG_BLOCK) ) {
            	    	        alt118=1;
            	    	    }
            	    	    switch (alt118) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:5011:11: this_BEG_BLOCK_85= RULE_BEG_BLOCK
            	    	            {
            	    	            this_BEG_BLOCK_85=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_61); 

            	    	            											newLeafNode(this_BEG_BLOCK_85, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_6_3_1());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalMyDsl.g:5016:10: ( (lv_include_86_0= ruleInclude ) )
            	    	    // InternalMyDsl.g:5017:11: (lv_include_86_0= ruleInclude )
            	    	    {
            	    	    // InternalMyDsl.g:5017:11: (lv_include_86_0= ruleInclude )
            	    	    // InternalMyDsl.g:5018:12: lv_include_86_0= ruleInclude
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

            	    	    // InternalMyDsl.g:5035:10: (this_END_BLOCK_87= RULE_END_BLOCK )?
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
            	    	            // InternalMyDsl.g:5036:11: this_END_BLOCK_87= RULE_END_BLOCK
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

            	    this_END_BLOCK_88=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

            	    									newLeafNode(this_END_BLOCK_88, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:5052:4: ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:5052:4: ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:5053:5: {...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:5053:103: ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:5054:6: ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:5057:9: ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:5057:10: {...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:5057:19: (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	    // InternalMyDsl.g:5057:20: otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK
            	    {
            	    otherlv_89=(Token)match(input,66,FOLLOW_3); 

            	    									newLeafNode(otherlv_89, grammarAccess.getMatrixAccess().getExcludeKeyword_2_7_0());
            	    								
            	    otherlv_90=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_90, grammarAccess.getMatrixAccess().getColonKeyword_2_7_1());
            	    								
            	    this_BEG_BLOCK_91=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            	    									newLeafNode(this_BEG_BLOCK_91, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_7_2());
            	    								
            	    // InternalMyDsl.g:5069:9: (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+
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
            	    	    // InternalMyDsl.g:5070:10: otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )?
            	    	    {
            	    	    otherlv_92=(Token)match(input,27,FOLLOW_62); 

            	    	    										newLeafNode(otherlv_92, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_7_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:5074:10: (this_BEG_BLOCK_93= RULE_BEG_BLOCK )?
            	    	    int alt121=2;
            	    	    int LA121_0 = input.LA(1);

            	    	    if ( (LA121_0==RULE_BEG_BLOCK) ) {
            	    	        alt121=1;
            	    	    }
            	    	    switch (alt121) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:5075:11: this_BEG_BLOCK_93= RULE_BEG_BLOCK
            	    	            {
            	    	            this_BEG_BLOCK_93=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_62); 

            	    	            											newLeafNode(this_BEG_BLOCK_93, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_7_3_1());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalMyDsl.g:5080:10: ( (lv_exclude_94_0= ruleExclude ) )
            	    	    // InternalMyDsl.g:5081:11: (lv_exclude_94_0= ruleExclude )
            	    	    {
            	    	    // InternalMyDsl.g:5081:11: (lv_exclude_94_0= ruleExclude )
            	    	    // InternalMyDsl.g:5082:12: lv_exclude_94_0= ruleExclude
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

            	    	    // InternalMyDsl.g:5099:10: (this_END_BLOCK_95= RULE_END_BLOCK )?
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
            	    	            // InternalMyDsl.g:5100:11: this_END_BLOCK_95= RULE_END_BLOCK
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

            	    this_END_BLOCK_96=(Token)match(input,RULE_END_BLOCK,FOLLOW_60); 

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

            // InternalMyDsl.g:5123:3: (this_END_BLOCK_97= RULE_END_BLOCK )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_END_BLOCK) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // InternalMyDsl.g:5124:4: this_END_BLOCK_97= RULE_END_BLOCK
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
    // InternalMyDsl.g:5133:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalMyDsl.g:5133:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalMyDsl.g:5134:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalMyDsl.g:5140:1: ruleInclude returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:5146:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5147:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5147:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5148:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5148:3: ()
            // InternalMyDsl.g:5149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncludeAccess().getIncludeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5155:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_BEG_BLOCK) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalMyDsl.g:5156:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_63); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getIncludeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5161:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:5162:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:5162:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:5163:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:5166:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:5167:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:5167:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )*
            loop127:
            do {
                int alt127=4;
                int LA127_0 = input.LA(1);

                if ( LA127_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0) ) {
                    alt127=1;
                }
                else if ( LA127_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1) ) {
                    alt127=2;
                }
                else if ( LA127_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2) ) {
                    alt127=3;
                }


                switch (alt127) {
            	case 1 :
            	    // InternalMyDsl.g:5168:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5168:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5169:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:5169:104: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5170:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:5173:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5173:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:5173:19: (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5173:20: otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:5181:9: ( (lv_os_5_0= ruleEString ) )
            	    // InternalMyDsl.g:5182:10: (lv_os_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5182:10: (lv_os_5_0= ruleEString )
            	    // InternalMyDsl.g:5183:11: lv_os_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getOsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_63);
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
            	    // InternalMyDsl.g:5206:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5206:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5207:5: {...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:5207:104: ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5208:6: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:5211:9: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5211:10: {...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:5211:19: (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5211:20: otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getCCompilerKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIncludeAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:5219:9: ( (lv_cCompiler_8_0= ruleEString ) )
            	    // InternalMyDsl.g:5220:10: (lv_cCompiler_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5220:10: (lv_cCompiler_8_0= ruleEString )
            	    // InternalMyDsl.g:5221:11: lv_cCompiler_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getCCompilerEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_63);
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
            	    // InternalMyDsl.g:5244:4: ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5244:4: ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5245:5: {...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:5245:104: ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5246:6: ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:5249:9: ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5249:10: {...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:5249:19: (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5249:20: otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getIncludeAccess().getCppCompilerKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getIncludeAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:5257:9: ( (lv_cppCompiler_11_0= ruleEString ) )
            	    // InternalMyDsl.g:5258:10: (lv_cppCompiler_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5258:10: (lv_cppCompiler_11_0= ruleEString )
            	    // InternalMyDsl.g:5259:11: lv_cppCompiler_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getCppCompilerEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_63);
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

            // InternalMyDsl.g:5289:3: (this_END_BLOCK_12= RULE_END_BLOCK )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==RULE_END_BLOCK) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // InternalMyDsl.g:5290:4: this_END_BLOCK_12= RULE_END_BLOCK
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
    // InternalMyDsl.g:5299:1: entryRuleExclude returns [EObject current=null] : iv_ruleExclude= ruleExclude EOF ;
    public final EObject entryRuleExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclude = null;


        try {
            // InternalMyDsl.g:5299:48: (iv_ruleExclude= ruleExclude EOF )
            // InternalMyDsl.g:5300:2: iv_ruleExclude= ruleExclude EOF
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
    // InternalMyDsl.g:5306:1: ruleExclude returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:5312:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5313:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5313:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5314:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5314:3: ()
            // InternalMyDsl.g:5315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExcludeAccess().getExcludeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5321:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==RULE_BEG_BLOCK) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // InternalMyDsl.g:5322:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_64); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getExcludeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5327:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:5328:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:5328:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:5329:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getExcludeAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:5332:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:5333:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:5333:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )*
            loop130:
            do {
                int alt130=3;
                int LA130_0 = input.LA(1);

                if ( LA130_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0) ) {
                    alt130=1;
                }
                else if ( LA130_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1) ) {
                    alt130=2;
                }


                switch (alt130) {
            	case 1 :
            	    // InternalMyDsl.g:5334:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5334:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5335:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:5335:104: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5336:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:5339:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5339:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "true");
            	    }
            	    // InternalMyDsl.g:5339:19: (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5339:20: otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getExcludeAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getExcludeAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:5347:9: ( (lv_os_5_0= ruleEString ) )
            	    // InternalMyDsl.g:5348:10: (lv_os_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5348:10: (lv_os_5_0= ruleEString )
            	    // InternalMyDsl.g:5349:11: lv_os_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getExcludeAccess().getOsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_64);
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
            	    // InternalMyDsl.g:5372:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:5372:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:5373:5: {...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:5373:104: ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:5374:6: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:5377:9: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:5377:10: {...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "true");
            	    }
            	    // InternalMyDsl.g:5377:19: (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:5377:20: otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getExcludeAccess().getCCompilerKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getExcludeAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:5385:9: ( (lv_cCompiler_8_0= ruleEString ) )
            	    // InternalMyDsl.g:5386:10: (lv_cCompiler_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:5386:10: (lv_cCompiler_8_0= ruleEString )
            	    // InternalMyDsl.g:5387:11: lv_cCompiler_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getExcludeAccess().getCCompilerEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_64);
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

            // InternalMyDsl.g:5417:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==RULE_END_BLOCK) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // InternalMyDsl.g:5418:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:5427:1: entryRuleDefaults returns [EObject current=null] : iv_ruleDefaults= ruleDefaults EOF ;
    public final EObject entryRuleDefaults() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaults = null;


        try {
            // InternalMyDsl.g:5427:49: (iv_ruleDefaults= ruleDefaults EOF )
            // InternalMyDsl.g:5428:2: iv_ruleDefaults= ruleDefaults EOF
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
    // InternalMyDsl.g:5434:1: ruleDefaults returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleDefaults() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        EObject lv_run_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5440:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5441:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5441:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5442:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5442:3: ()
            // InternalMyDsl.g:5443:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDefaultsAccess().getDefaultsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5449:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==RULE_BEG_BLOCK) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // InternalMyDsl.g:5450:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_65); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getDefaultsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5455:3: (otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) ) )
            // InternalMyDsl.g:5456:4: otherlv_2= 'run' otherlv_3= ':' ( (lv_run_4_0= ruleRun ) )
            {
            otherlv_2=(Token)match(input,42,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getDefaultsAccess().getRunKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_66); 

            				newLeafNode(otherlv_3, grammarAccess.getDefaultsAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5464:4: ( (lv_run_4_0= ruleRun ) )
            // InternalMyDsl.g:5465:5: (lv_run_4_0= ruleRun )
            {
            // InternalMyDsl.g:5465:5: (lv_run_4_0= ruleRun )
            // InternalMyDsl.g:5466:6: lv_run_4_0= ruleRun
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

            // InternalMyDsl.g:5484:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==RULE_END_BLOCK) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalMyDsl.g:5485:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:5494:1: entryRuleRun returns [EObject current=null] : iv_ruleRun= ruleRun EOF ;
    public final EObject entryRuleRun() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRun = null;


        try {
            // InternalMyDsl.g:5494:44: (iv_ruleRun= ruleRun EOF )
            // InternalMyDsl.g:5495:2: iv_ruleRun= ruleRun EOF
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
    // InternalMyDsl.g:5501:1: ruleRun returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleRun() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_shell_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5507:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5508:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5508:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5509:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5509:3: ()
            // InternalMyDsl.g:5510:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRunAccess().getRunAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5516:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==RULE_BEG_BLOCK) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalMyDsl.g:5517:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_67); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getRunAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5522:3: (otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) ) )
            // InternalMyDsl.g:5523:4: otherlv_2= 'shell' otherlv_3= ':' ( (lv_shell_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,44,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getRunAccess().getShellKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getRunAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5531:4: ( (lv_shell_4_0= ruleEString ) )
            // InternalMyDsl.g:5532:5: (lv_shell_4_0= ruleEString )
            {
            // InternalMyDsl.g:5532:5: (lv_shell_4_0= ruleEString )
            // InternalMyDsl.g:5533:6: lv_shell_4_0= ruleEString
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

            // InternalMyDsl.g:5551:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==RULE_END_BLOCK) ) {
                alt135=1;
            }
            switch (alt135) {
                case 1 :
                    // InternalMyDsl.g:5552:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:5561:1: entryRuleOutputs returns [EObject current=null] : iv_ruleOutputs= ruleOutputs EOF ;
    public final EObject entryRuleOutputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputs = null;


        try {
            // InternalMyDsl.g:5561:48: (iv_ruleOutputs= ruleOutputs EOF )
            // InternalMyDsl.g:5562:2: iv_ruleOutputs= ruleOutputs EOF
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
    // InternalMyDsl.g:5568:1: ruleOutputs returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleOutputs() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_digests_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5574:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5575:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5575:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5576:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5576:3: ()
            // InternalMyDsl.g:5577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOutputsAccess().getOutputsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5583:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==RULE_BEG_BLOCK) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // InternalMyDsl.g:5584:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_68); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOutputsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5589:3: (otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) ) )
            // InternalMyDsl.g:5590:4: otherlv_2= 'digests' otherlv_3= ':' ( (lv_digests_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,78,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getOutputsAccess().getDigestsKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getOutputsAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5598:4: ( (lv_digests_4_0= ruleEString ) )
            // InternalMyDsl.g:5599:5: (lv_digests_4_0= ruleEString )
            {
            // InternalMyDsl.g:5599:5: (lv_digests_4_0= ruleEString )
            // InternalMyDsl.g:5600:6: lv_digests_4_0= ruleEString
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

            // InternalMyDsl.g:5618:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==RULE_END_BLOCK) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // InternalMyDsl.g:5619:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:5628:1: entryRuleRelease returns [EObject current=null] : iv_ruleRelease= ruleRelease EOF ;
    public final EObject entryRuleRelease() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelease = null;


        try {
            // InternalMyDsl.g:5628:48: (iv_ruleRelease= ruleRelease EOF )
            // InternalMyDsl.g:5629:2: iv_ruleRelease= ruleRelease EOF
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
    // InternalMyDsl.g:5635:1: ruleRelease returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:5641:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5642:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5642:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5643:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) (this_END_BLOCK_15= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5643:3: ()
            // InternalMyDsl.g:5644:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReleaseAccess().getReleaseAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5650:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt138=2;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==RULE_BEG_BLOCK) ) {
                alt138=1;
            }
            switch (alt138) {
                case 1 :
                    // InternalMyDsl.g:5651:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_69); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getReleaseAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5656:3: (otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) )
            // InternalMyDsl.g:5657:4: otherlv_2= 'types' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
            {
            otherlv_2=(Token)match(input,50,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getReleaseAccess().getTypesKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_26); 

            				newLeafNode(otherlv_3, grammarAccess.getReleaseAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5665:4: ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
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
                    // InternalMyDsl.g:5666:5: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    {
                    // InternalMyDsl.g:5666:5: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    // InternalMyDsl.g:5667:6: this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

                    						newLeafNode(this_BEG_BLOCK_4, grammarAccess.getReleaseAccess().getBEG_BLOCKTerminalRuleCall_2_2_0_0());
                    					
                    // InternalMyDsl.g:5671:6: (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+
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
                    	    // InternalMyDsl.g:5672:7: otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_types_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )?
                    	    {
                    	    otherlv_5=(Token)match(input,27,FOLLOW_9); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getReleaseAccess().getHyphenMinusKeyword_2_2_0_1_0());
                    	    						
                    	    // InternalMyDsl.g:5676:7: (this_BEG_BLOCK_6= RULE_BEG_BLOCK )?
                    	    int alt139=2;
                    	    int LA139_0 = input.LA(1);

                    	    if ( (LA139_0==RULE_BEG_BLOCK) ) {
                    	        alt139=1;
                    	    }
                    	    switch (alt139) {
                    	        case 1 :
                    	            // InternalMyDsl.g:5677:8: this_BEG_BLOCK_6= RULE_BEG_BLOCK
                    	            {
                    	            this_BEG_BLOCK_6=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

                    	            								newLeafNode(this_BEG_BLOCK_6, grammarAccess.getReleaseAccess().getBEG_BLOCKTerminalRuleCall_2_2_0_1_1());
                    	            							

                    	            }
                    	            break;

                    	    }

                    	    // InternalMyDsl.g:5682:7: ( (lv_types_7_0= ruleEString ) )
                    	    // InternalMyDsl.g:5683:8: (lv_types_7_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:5683:8: (lv_types_7_0= ruleEString )
                    	    // InternalMyDsl.g:5684:9: lv_types_7_0= ruleEString
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

                    	    // InternalMyDsl.g:5701:7: (this_END_BLOCK_8= RULE_END_BLOCK )?
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
                    	            // InternalMyDsl.g:5702:8: this_END_BLOCK_8= RULE_END_BLOCK
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
                    // InternalMyDsl.g:5714:5: (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    {
                    // InternalMyDsl.g:5714:5: (otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    // InternalMyDsl.g:5715:6: otherlv_10= '[' ( (lv_types_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,28,FOLLOW_4); 

                    						newLeafNode(otherlv_10, grammarAccess.getReleaseAccess().getLeftSquareBracketKeyword_2_2_1_0());
                    					
                    // InternalMyDsl.g:5719:6: ( (lv_types_11_0= ruleEString ) )
                    // InternalMyDsl.g:5720:7: (lv_types_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:5720:7: (lv_types_11_0= ruleEString )
                    // InternalMyDsl.g:5721:8: lv_types_11_0= ruleEString
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

                    // InternalMyDsl.g:5738:6: (otherlv_12= ',' ( (lv_types_13_0= ruleEString ) ) )*
                    loop142:
                    do {
                        int alt142=2;
                        int LA142_0 = input.LA(1);

                        if ( (LA142_0==31) ) {
                            alt142=1;
                        }


                        switch (alt142) {
                    	case 1 :
                    	    // InternalMyDsl.g:5739:7: otherlv_12= ',' ( (lv_types_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,31,FOLLOW_4); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getReleaseAccess().getCommaKeyword_2_2_1_2_0());
                    	    						
                    	    // InternalMyDsl.g:5743:7: ( (lv_types_13_0= ruleEString ) )
                    	    // InternalMyDsl.g:5744:8: (lv_types_13_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:5744:8: (lv_types_13_0= ruleEString )
                    	    // InternalMyDsl.g:5745:9: lv_types_13_0= ruleEString
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

            // InternalMyDsl.g:5770:3: (this_END_BLOCK_15= RULE_END_BLOCK )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==RULE_END_BLOCK) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // InternalMyDsl.g:5771:4: this_END_BLOCK_15= RULE_END_BLOCK
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
    // InternalMyDsl.g:5780:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // InternalMyDsl.g:5780:50: (iv_ruleContainer= ruleContainer EOF )
            // InternalMyDsl.g:5781:2: iv_ruleContainer= ruleContainer EOF
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
    // InternalMyDsl.g:5787:1: ruleContainer returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_image_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:5793:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:5794:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:5794:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:5795:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:5795:3: ()
            // InternalMyDsl.g:5796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainerAccess().getContainerAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:5802:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt145=2;
            int LA145_0 = input.LA(1);

            if ( (LA145_0==RULE_BEG_BLOCK) ) {
                alt145=1;
            }
            switch (alt145) {
                case 1 :
                    // InternalMyDsl.g:5803:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_70); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getContainerAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:5808:3: (otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) ) )
            // InternalMyDsl.g:5809:4: otherlv_2= 'image' otherlv_3= ':' ( (lv_image_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,73,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getImageKeyword_2_0());
            			
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getContainerAccess().getColonKeyword_2_1());
            			
            // InternalMyDsl.g:5817:4: ( (lv_image_4_0= ruleEString ) )
            // InternalMyDsl.g:5818:5: (lv_image_4_0= ruleEString )
            {
            // InternalMyDsl.g:5818:5: (lv_image_4_0= ruleEString )
            // InternalMyDsl.g:5819:6: lv_image_4_0= ruleEString
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

            // InternalMyDsl.g:5837:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==RULE_END_BLOCK) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // InternalMyDsl.g:5838:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:5847:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:5847:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:5848:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalMyDsl.g:5854:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:5860:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:5861:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:5861:2: (kw= 'true' | kw= 'false' )
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
                    // InternalMyDsl.g:5862:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:5868:3: kw= 'false'
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
    protected DFA22 dfa22 = new DFA22(this);
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
    static final String dfa_4s = "\1\116\1\uffff\6\20\1\uffff\1\32\1\120\1\52\1\32\1\107\1\116\11\uffff\26\116\1\uffff\5\116\1\125\1\32\1\uffff\5\116\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\6\uffff\1\1\6\uffff\11\1\26\uffff\1\1\7\uffff\1\1\5\uffff\5\1";
    static final String dfa_6s = "\101\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\3\10\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\1\7\13\uffff\55\10",
            "",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            "\1\17\1\20\1\23\1\24\1\25\14\uffff\1\26\1\27\1\21\1\22",
            "\2\1\5\27\4\uffff\1\1\1\uffff\6\1\4\27\7\uffff\2\1\22\uffff\1\1\14\uffff\2\1\6\uffff\1\1\3\uffff\2\1",
            "\1\1\1\uffff\5\27\14\uffff\4\27\17\uffff\1\1",
            "\1\1\1\uffff\1\30\1\31\1\34\1\35\1\36\14\uffff\1\37\1\40\1\32\1\33",
            "\2\1\5\27\4\uffff\1\1\1\uffff\6\1\4\27\22\uffff\5\1\1\uffff\1\1\2\uffff\1\1\20\uffff\1\1",
            "\1\1\1\uffff\2\27\1\41\1\42\1\43\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\27\7\uffff\55\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27\2\uffff\1\27\1\10\1\27\4\uffff\1\27\1\1\6\27\13\uffff\55\27",
            "\1\27\2\uffff\1\27\1\10\1\27\4\uffff\1\27\1\1\6\27\13\uffff\55\27",
            "\1\44\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\56\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\56",
            "\1\44\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\56\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\64\6\56\13\uffff\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\65\6\56\13\uffff\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\65\6\56\13\uffff\55\56",
            "\1\56\2\uffff\1\56\1\10\1\56\4\uffff\1\56\1\65\6\56\13\uffff\55\56",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\56\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\56",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\10\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\63\1\51\1\46\1\45\1\47\1\50\1\62\3\uffff\1\66\1\56\6\66\4\uffff\1\52\1\53\1\54\1\55\1\57\1\60\1\61\55\66",
            "\1\66\2\uffff\1\66\1\10\1\66\4\uffff\1\66\1\1\6\66\13\uffff\55\66",
            "\4\1\1\67\1\70\1\71\4\uffff\1\1\1\uffff\6\1\1\72\1\73\2\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\20\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\2\1\1\74\1\75\1\76\14\uffff\1\77\1\100\2\1",
            "",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\55\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\55\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\55\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\55\100",
            "\1\100\2\uffff\1\100\1\10\1\100\4\uffff\1\100\1\64\6\100\13\uffff\55\100",
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
    static final String dfa_11s = "\1\127\7\uffff\1\127\11\uffff\2\41\3\uffff\2\37\10\41\1\125\1\41\1\125\4\41\1\37\2\125\5\uffff\1\37\12\41\5\37\2\125\6\41\2\37\1\125\3\41";
    static final String dfa_12s = "\1\uffff\1\17\1\3\1\1\1\4\1\5\1\2\1\6\1\uffff\1\10\1\12\1\7\1\11\1\14\1\15\1\16\2\13\2\uffff\3\13\24\uffff\5\13\36\uffff";
    static final String dfa_13s = "\116\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\5\1\6\1\3\1\2\1\4\1\17\3\uffff\1\1\1\12\12\1\1\7\1\13\1\11\1\14\1\10\1\15\1\16\57\1\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\20\1\21\1\24\1\25\2\26\3\uffff\10\26\1\27\1\30\1\22\1\23\66\26\1\uffff\6\26",
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
            "\1\52\1\53\1\54\1\55\1\56\1\57\1\47\3\uffff\1\1\1\43\12\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46\10\1\1\uffff\1\1\6\uffff\1\1\1\uffff\1\1\1\uffff\10\1\1\uffff\6\1\3\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\4\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\1\60\1\65\1\62\1\61\1\63\1\64\1\47\3\uffff\1\57\1\43\12\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\20\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\1\50\1\66\1\67\1\70\1\71\1\72\1\47\4\uffff\1\43\6\uffff\4\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\14\uffff\1\1\1\uffff\1\1",
            "\4\57\1\73\1\74\1\75\4\uffff\1\57\1\uffff\6\57\1\76\1\77\2\57\13\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\20\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\6\1\4\uffff\1\1\1\57\12\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\2\uffff\4\1\1\uffff\1\1\10\uffff\1\1\1\uffff\5\1\10\uffff\2\1\3\uffff\1\1\1\uffff\2\1\3\uffff\2\1\4\uffff\1\1",
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
            "\1\57\1\60\1\65\1\62\1\102\1\103\1\104\1\47\3\uffff\1\57\1\43\12\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\20\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\1\57\1\60\1\65\1\62\1\105\1\106\1\107\1\47\3\uffff\1\57\1\43\6\57\1\110\1\111\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\20\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\12\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\51\14\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\65\1\62\1\113\1\114\1\115\1\47\3\uffff\1\57\1\43\6\57\1\76\1\77\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\4\57\1\uffff\1\57\10\uffff\1\57\2\uffff\1\57\20\uffff\1\57\1\uffff\1\57\12\uffff\1\57",
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
    static final String dfa_15s = "\12\uffff";
    static final String dfa_16s = "\1\1\11\uffff";
    static final String dfa_17s = "\1\5\11\uffff";
    static final String dfa_18s = "\1\120\11\uffff";
    static final String dfa_19s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_20s = "\1\0\11\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\11\uffff\1\1\1\uffff\6\1\13\uffff\1\2\1\3\22\uffff\1\11\14\uffff\1\7\1\4\6\uffff\1\10\3\uffff\1\5\1\6",
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

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 1134:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'release' otherlv_24= ':' ( (lv_release_25_0= ruleRelease ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'issues' otherlv_27= ':' ( (lv_issues_28_0= ruleEString ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==EOF||LA22_0==RULE_END_BLOCK||LA22_0==15||(LA22_0>=17 && LA22_0<=22)) ) {s = 1;}

                        else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA22_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA22_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA22_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA22_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA22_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA22_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA22_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\17\uffff";
    static final String dfa_23s = "\1\1\16\uffff";
    static final String dfa_24s = "\1\5\1\uffff\1\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_25s = "\1\125\1\uffff\1\20\1\uffff\1\32\11\0\1\uffff";
    static final String dfa_26s = "\1\uffff\1\3\1\uffff\1\2\12\uffff\1\1";
    static final String dfa_27s = "\1\10\4\uffff\1\7\1\11\1\1\1\5\1\3\1\6\1\2\1\0\1\4\1\uffff}>";
    static final String[] dfa_28s = {
            "\6\1\4\uffff\1\2\1\uffff\12\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\20\uffff\1\1\1\uffff\1\1\11\uffff\1\3\1\1",
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

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 2429:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_11 = input.LA(1);

                         
                        int index53_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_11);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_13 = input.LA(1);

                         
                        int index53_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_13);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA53_8 = input.LA(1);

                         
                        int index53_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_8);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA53_10 = input.LA(1);

                         
                        int index53_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==EOF||(LA53_0>=RULE_END_BLOCK && LA53_0<=RULE_INT)||(LA53_0>=17 && LA53_0<=26)||(LA53_0>=38 && LA53_0<=41)||LA53_0==43||LA53_0==52||LA53_0==55||LA53_0==72||LA53_0==74||LA53_0==85) ) {s = 1;}

                        else if ( (LA53_0==15) ) {s = 2;}

                        else if ( LA53_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_6 = input.LA(1);

                         
                        int index53_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\1\125\11\uffff";
    static final String[] dfa_30s = {
            "\6\1\4\uffff\1\1\1\uffff\12\1\13\uffff\4\1\1\uffff\1\1\1\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\1\1\uffff\1\10\1\1\17\uffff\1\11\1\1\1\uffff\1\1\12\uffff\1\1",
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
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[][] dfa_30 = unpackEncodedStringArray(dfa_30s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_29;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_30;
        }
        public String getDescription() {
            return "()* loopback of 2557:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*";
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
                        if ( (LA56_0==EOF||(LA56_0>=RULE_END_BLOCK && LA56_0<=RULE_INT)||LA56_0==15||(LA56_0>=17 && LA56_0<=26)||(LA56_0>=38 && LA56_0<=41)||LA56_0==43||LA56_0==52||LA56_0==55||LA56_0==72||LA56_0==74||LA56_0==85) ) {s = 1;}

                        else if ( LA56_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA56_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA56_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA56_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA56_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA56_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA56_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA56_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
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
    static final String dfa_31s = "\137\uffff";
    static final String dfa_32s = "\1\1\136\uffff";
    static final String dfa_33s = "\1\5\1\uffff\3\20\12\uffff\1\6\1\0\1\4\11\0\1\uffff\1\10\66\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_34s = "\1\125\1\uffff\3\20\12\uffff\1\32\1\0\1\116\11\0\1\uffff\1\116\66\20\1\uffff\1\32\11\0\1\uffff";
    static final String dfa_35s = "\1\uffff\1\16\3\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\15\14\uffff\1\13\67\uffff\1\1\12\uffff\1\14";
    static final String dfa_36s = "\1\1\17\uffff\1\10\1\uffff\1\2\1\6\1\11\1\14\1\0\1\4\1\13\1\20\1\22\72\uffff\1\7\1\16\1\12\1\15\1\3\1\5\1\17\1\21\1\23\1\uffff}>";
    static final String[] dfa_37s = {
            "\6\1\4\uffff\1\2\1\uffff\4\1\1\3\1\4\4\1\13\uffff\1\5\1\6\1\15\1\10\1\uffff\1\16\10\uffff\1\7\2\uffff\1\12\20\uffff\1\13\1\uffff\1\14\12\uffff\1\11",
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
            "\1\34\3\uffff\1\36\1\35\1\37\4\uffff\1\40\1\uffff\1\41\1\uffff\1\115\1\42\1\43\1\44\13\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\116\1\117\1\120\1\121\1\122",
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
            "\1\36\1\35\1\37\4\uffff\1\40\1\uffff\1\41\1\uffff\1\115\1\42\1\43\1\44\13\uffff\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\113\1\114\1\116\1\117\1\120\1\121\1\122",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "\1\124",
            "",
            "\1\125\1\126\1\131\1\132\1\133\14\uffff\1\134\1\135\1\127\1\130",
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

    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_31;
            this.eof = dfa_32;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "()* loopback of 2929:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'uses' otherlv_28= ':' ( (lv_uses_29_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'environment' otherlv_31= ':' ( (lv_environment_32_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'strategy' otherlv_34= ':' ( (lv_strategy_35_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_36= 'container' otherlv_37= ':' ( (lv_container_38_0= ruleContainer ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= 'outputs' otherlv_40= ':' ( (lv_outputs_41_0= ruleOutputs ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'steps' otherlv_43= ':' (this_BEG_BLOCK_44= RULE_BEG_BLOCK )? ( (lv_steps_45_0= ruleStep ) )+ (this_END_BLOCK_46= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= 'permissions' otherlv_48= ':' ( (lv_permissions_49_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_50= 'env' otherlv_51= ':' ( (this_BEG_BLOCK_52= RULE_BEG_BLOCK )? ( (lv_env_53_0= ruleKeyValuePair ) )+ (this_END_BLOCK_54= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'with' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK )? ( (lv_with_58_0= ruleKeyValuePair ) )+ (this_END_BLOCK_59= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
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

                        else if ( LA73_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 9;}

                        else if ( LA73_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {s = 10;}

                        else if ( LA73_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7) ) {s = 11;}

                        else if ( LA73_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 8) ) {s = 12;}

                        else if ( LA73_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 9) ) {s = 13;}

                        else if ( LA73_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 12) ) {s = 14;}

                         
                        input.seek(index73_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_89 = input.LA(1);

                         
                        int index73_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_89);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_90 = input.LA(1);

                         
                        int index73_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_90);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_85 = input.LA(1);

                         
                        int index73_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_85);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 10) ) {s = 27;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_87 = input.LA(1);

                         
                        int index73_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_87);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_88 = input.LA(1);

                         
                        int index73_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_88);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_86 = input.LA(1);

                         
                        int index73_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_86);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_91 = input.LA(1);

                         
                        int index73_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_91);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_92 = input.LA(1);

                         
                        int index73_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_92);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 83;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_93 = input.LA(1);

                         
                        int index73_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 11) ) {s = 94;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_93);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_38s = "\u0088\uffff";
    static final String dfa_39s = "\1\1\25\uffff\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\1\1\15\uffff\2\142\17\160\44\uffff\4\160\5\uffff\4\160\1\uffff\5\160\1\1\2\uffff\5\u0087\12\uffff";
    static final String dfa_40s = "\1\5\1\uffff\22\20\1\uffff\1\6\6\4\1\6\1\4\2\6\5\4\11\uffff\2\5\2\4\15\5\44\uffff\4\5\5\uffff\4\5\1\uffff\5\5\1\4\2\6\5\5\12\uffff";
    static final String dfa_41s = "\1\125\1\uffff\22\20\1\uffff\1\32\1\120\1\52\1\32\1\125\1\116\1\125\1\32\1\34\2\32\1\125\1\111\1\116\1\33\1\116\11\uffff\21\125\44\uffff\4\125\5\uffff\4\125\1\uffff\6\125\2\32\5\125\12\uffff";
    static final String dfa_42s = "\1\uffff\1\2\22\uffff\1\1\20\uffff\11\1\21\uffff\44\1\4\uffff\5\1\4\uffff\1\1\15\uffff\12\1";
    static final String dfa_43s = "\u0088\uffff}>";
    static final String[] dfa_44s = {
            "\3\1\1\10\1\11\1\12\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\1\7\4\1\7\uffff\4\24\1\13\1\14\1\22\1\16\1\24\1\23\10\24\1\15\2\24\1\17\20\24\1\20\1\24\1\21\4\24\6\uffff\1\1",
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
            "\2\1\5\55\4\uffff\1\1\1\uffff\6\1\4\55\7\uffff\2\1\22\uffff\1\1\14\uffff\2\1\6\uffff\1\1\3\uffff\2\1",
            "\1\1\1\uffff\5\55\14\uffff\4\55\17\uffff\1\1",
            "\1\1\1\uffff\1\56\1\57\1\62\1\63\1\64\14\uffff\1\65\1\66\1\60\1\61",
            "\2\1\1\56\1\57\1\62\1\63\1\64\4\uffff\1\1\1\uffff\6\1\1\65\1\66\1\60\1\61\13\uffff\4\1\1\uffff\1\1\1\uffff\5\1\1\uffff\2\1\1\uffff\2\1\17\uffff\2\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\2\55\1\67\1\70\1\71\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\55\7\uffff\55\1",
            "\2\1\1\56\1\57\1\72\1\73\1\74\4\uffff\1\1\1\uffff\6\1\1\75\1\76\1\60\1\61\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\20\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\77\1\100\1\103\1\104\1\105\14\uffff\1\106\1\107\1\101\1\102",
            "\1\1\1\uffff\1\110\1\111\1\114\1\115\1\116\14\uffff\1\117\1\120\1\112\1\113\1\uffff\1\1",
            "\1\121\1\122\1\125\1\126\1\127\14\uffff\1\130\1\131\1\123\1\124",
            "\1\132\1\133\1\136\1\137\1\140\14\uffff\1\141\1\142\1\134\1\135",
            "\2\1\1\56\1\57\1\62\1\63\1\64\4\uffff\1\1\1\uffff\6\1\1\65\1\66\1\60\1\61\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\4\1\15\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\5\142\14\uffff\4\142\56\uffff\1\1",
            "\1\1\1\uffff\5\142\14\uffff\4\142\63\uffff\1\1",
            "\1\1\1\uffff\5\142\14\uffff\4\142\1\1",
            "\1\1\1\uffff\2\142\1\143\1\144\1\145\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\142\7\uffff\55\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\142\4\uffff\1\142\1\1\12\142\7\uffff\1\24\54\142\6\uffff\1\142",
            "\6\142\4\uffff\1\142\1\1\12\142\7\uffff\1\24\54\142\6\uffff\1\142",
            "\1\146\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\1\146\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\167\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\167\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\167\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\166\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
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
            "\6\160\4\uffff\1\160\1\170\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\170\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\170\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "",
            "",
            "",
            "",
            "",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\1\165\1\153\1\150\1\147\1\151\1\152\1\164\3\uffff\14\160\1\154\1\155\1\156\1\157\1\161\1\162\1\163\1\24\54\160\6\uffff\1\160",
            "\6\160\4\uffff\1\160\1\1\12\160\7\uffff\1\24\54\160\6\uffff\1\160",
            "\4\1\1\171\1\172\1\173\4\uffff\1\1\1\uffff\6\1\1\174\1\175\2\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\20\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\2\1\1\176\1\177\1\u0080\14\uffff\1\u0081\1\u0082\2\1",
            "\2\1\1\u0083\1\u0084\1\u0085\14\uffff\1\u0086\1\u0087\2\1",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\54\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\54\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\54\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\54\u0087\6\uffff\1\u0087",
            "\6\u0087\4\uffff\1\u0087\1\166\12\u0087\7\uffff\1\24\54\u0087\6\uffff\1\u0087",
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

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()+ loopback of 3485:10: ( (lv_env_53_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()+ loopback of 3537:10: ( (lv_with_58_0= ruleKeyValuePair ) )+";
        }
    }
    static final String dfa_45s = "\u00b3\uffff";
    static final String dfa_46s = "\1\1\u00b2\uffff";
    static final String dfa_47s = "\1\5\1\uffff\5\20\5\uffff\1\6\1\4\2\6\1\4\11\0\1\10\66\20\22\0\1\10\66\20\1\uffff\1\6\2\uffff\1\6\22\0\2\uffff";
    static final String dfa_48s = "\1\127\1\uffff\5\20\5\uffff\1\32\1\116\2\32\1\116\11\0\1\116\66\20\22\0\1\116\66\20\1\uffff\1\32\2\uffff\1\32\22\0\2\uffff";
    static final String dfa_49s = "\1\uffff\1\13\5\uffff\1\2\1\4\1\6\1\7\1\10\u008e\uffff\1\1\1\uffff\1\5\1\3\23\uffff\1\12\1\11";
    static final String dfa_50s = "\1\46\20\uffff\1\7\1\12\1\54\1\2\1\10\1\21\1\40\1\32\1\35\67\uffff\1\14\1\23\1\31\1\37\1\42\1\44\1\51\1\27\1\36\1\53\1\3\1\50\1\1\1\17\1\24\1\30\1\11\1\13\74\uffff\1\33\1\43\1\55\1\5\1\6\1\16\1\22\1\15\1\20\1\52\1\4\1\47\1\0\1\34\1\41\1\45\1\25\1\26\2\uffff}>";
    static final String[] dfa_51s = {
            "\6\1\4\uffff\1\2\1\uffff\5\1\1\3\5\1\12\uffff\3\1\1\5\1\10\1\6\1\12\7\uffff\1\4\1\13\1\uffff\1\1\20\uffff\1\1\1\uffff\1\1\12\uffff\1\1\1\7\1\11",
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
            "\1\32\3\uffff\1\34\1\33\1\35\4\uffff\1\36\1\uffff\1\37\1\uffff\1\113\1\40\1\41\1\42\13\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\114\1\115\1\116\1\117\1\120",
            "\1\121\1\122\1\125\1\126\1\127\14\uffff\1\130\1\131\1\123\1\124",
            "\1\132\1\133\1\136\1\137\1\140\14\uffff\1\141\1\142\1\134\1\135",
            "\1\143\3\uffff\1\145\1\144\1\146\4\uffff\1\147\1\uffff\1\150\1\uffff\1\u0094\1\151\1\152\1\153\13\uffff\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\34\1\33\1\35\4\uffff\1\36\1\uffff\1\37\1\uffff\1\113\1\40\1\41\1\42\13\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112\1\114\1\115\1\116\1\117\1\120",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
            "\1\u009b",
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
            "\1\145\1\144\1\146\4\uffff\1\147\1\uffff\1\150\1\uffff\1\u0094\1\151\1\152\1\153\13\uffff\1\154\1\155\1\156\1\157\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0095\1\u0096\1\u0097\1\u0098\1\u0099",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "\1\u009e",
            "",
            "\1\u009f\1\u00a0\1\u00a3\1\u00a4\1\u00a5\14\uffff\1\u00a6\1\u00a7\1\u00a1\1\u00a2",
            "",
            "",
            "\1\u00a8\1\u00a9\1\u00ac\1\u00ad\1\u00ae\14\uffff\1\u00af\1\u00b0\1\u00aa\1\u00ab",
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

    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[][] dfa_51 = unpackEncodedStringArray(dfa_51s);

    class DFA82 extends DFA {

        public DFA82(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 82;
            this.eot = dfa_45;
            this.eof = dfa_46;
            this.min = dfa_47;
            this.max = dfa_48;
            this.accept = dfa_49;
            this.special = dfa_50;
            this.transition = dfa_51;
        }
        public String getDescription() {
            return "()* loopback of 3624:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA82_171 = input.LA(1);

                         
                        int index82_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_171);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA82_93 = input.LA(1);

                         
                        int index82_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_93);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA82_20 = input.LA(1);

                         
                        int index82_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA82_91 = input.LA(1);

                         
                        int index82_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_91);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA82_169 = input.LA(1);

                         
                        int index82_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_169);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA82_162 = input.LA(1);

                         
                        int index82_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_162);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA82_163 = input.LA(1);

                         
                        int index82_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_163);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA82_17 = input.LA(1);

                         
                        int index82_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_17);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA82_21 = input.LA(1);

                         
                        int index82_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_21);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA82_97 = input.LA(1);

                         
                        int index82_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_97);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA82_18 = input.LA(1);

                         
                        int index82_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_18);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA82_98 = input.LA(1);

                         
                        int index82_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_98);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA82_81 = input.LA(1);

                         
                        int index82_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_81);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA82_166 = input.LA(1);

                         
                        int index82_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_166);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA82_164 = input.LA(1);

                         
                        int index82_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_164);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA82_94 = input.LA(1);

                         
                        int index82_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_94);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA82_167 = input.LA(1);

                         
                        int index82_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_167);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA82_22 = input.LA(1);

                         
                        int index82_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_22);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA82_165 = input.LA(1);

                         
                        int index82_165 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_165);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA82_82 = input.LA(1);

                         
                        int index82_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_82);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA82_95 = input.LA(1);

                         
                        int index82_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_95);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA82_175 = input.LA(1);

                         
                        int index82_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_175);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA82_176 = input.LA(1);

                         
                        int index82_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_176);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA82_88 = input.LA(1);

                         
                        int index82_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_88);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA82_96 = input.LA(1);

                         
                        int index82_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_96);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA82_83 = input.LA(1);

                         
                        int index82_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_83);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA82_24 = input.LA(1);

                         
                        int index82_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_24);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA82_159 = input.LA(1);

                         
                        int index82_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_159);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA82_172 = input.LA(1);

                         
                        int index82_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_172);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA82_25 = input.LA(1);

                         
                        int index82_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_25);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA82_89 = input.LA(1);

                         
                        int index82_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_89);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA82_84 = input.LA(1);

                         
                        int index82_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_84);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA82_23 = input.LA(1);

                         
                        int index82_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_23);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA82_173 = input.LA(1);

                         
                        int index82_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_173);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA82_85 = input.LA(1);

                         
                        int index82_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_85);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA82_160 = input.LA(1);

                         
                        int index82_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_160);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA82_86 = input.LA(1);

                         
                        int index82_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_86);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA82_174 = input.LA(1);

                         
                        int index82_174 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_174);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA82_0 = input.LA(1);

                         
                        int index82_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA82_0==EOF||(LA82_0>=RULE_END_BLOCK && LA82_0<=RULE_INT)||(LA82_0>=17 && LA82_0<=21)||(LA82_0>=23 && LA82_0<=27)||(LA82_0>=38 && LA82_0<=40)||LA82_0==55||LA82_0==72||LA82_0==74||LA82_0==85) ) {s = 1;}

                        else if ( (LA82_0==15) ) {s = 2;}

                        else if ( (LA82_0==22) ) {s = 3;}

                        else if ( (LA82_0==52) ) {s = 4;}

                        else if ( (LA82_0==41) ) {s = 5;}

                        else if ( (LA82_0==43) ) {s = 6;}

                        else if ( LA82_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {s = 7;}

                        else if ( LA82_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {s = 8;}

                        else if ( LA82_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {s = 9;}

                        else if ( LA82_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {s = 10;}

                        else if ( LA82_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 11;}

                         
                        input.seek(index82_0);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA82_170 = input.LA(1);

                         
                        int index82_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_170);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA82_92 = input.LA(1);

                         
                        int index82_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_92);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA82_87 = input.LA(1);

                         
                        int index82_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 156;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_87);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA82_168 = input.LA(1);

                         
                        int index82_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 178;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_168);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA82_90 = input.LA(1);

                         
                        int index82_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 157;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_90);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA82_19 = input.LA(1);

                         
                        int index82_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 154;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_19);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA82_161 = input.LA(1);

                         
                        int index82_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 177;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index82_161);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 82, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_52s = "\u00a3\uffff";
    static final String dfa_53s = "\1\1\30\uffff\1\1\2\uffff\1\1\1\uffff\1\1\4\uffff\1\1\20\uffff\2\177\17\u008a\44\uffff\3\u008a\24\uffff\1\u008a\5\uffff\4\u008a\1\uffff\5\u008a\1\1\2\uffff\6\u00a2\12\uffff";
    static final String dfa_54s = "\1\5\1\uffff\25\20\1\uffff\1\6\6\4\1\6\1\4\2\6\5\4\3\6\11\uffff\2\5\2\4\15\5\44\uffff\3\5\24\uffff\1\5\5\uffff\1\4\3\5\1\uffff\5\5\1\4\2\6\6\5\12\uffff";
    static final String dfa_55s = "\1\127\1\uffff\25\20\1\uffff\1\32\1\120\1\52\1\32\1\125\1\116\1\125\1\32\1\34\2\32\1\125\1\111\1\116\1\33\1\116\3\32\11\uffff\21\127\44\uffff\3\127\24\uffff\1\127\5\uffff\4\127\1\uffff\5\127\1\125\2\32\6\127\12\uffff";
    static final String dfa_56s = "\1\uffff\1\2\25\uffff\1\1\23\uffff\11\1\21\uffff\44\1\3\uffff\24\1\1\uffff\5\1\4\uffff\1\1\16\uffff\12\1";
    static final String dfa_57s = "\u00a3\uffff}>";
    static final String[] dfa_58s = {
            "\3\1\1\10\1\11\1\12\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\1\7\5\1\6\uffff\4\27\1\13\1\14\1\22\1\16\1\24\1\23\1\25\7\27\1\15\1\26\1\27\1\17\20\27\1\20\1\27\1\21\4\27\6\uffff\3\1",
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
            "\2\1\5\63\4\uffff\1\1\1\uffff\6\1\4\63\7\uffff\2\1\22\uffff\1\1\14\uffff\2\1\6\uffff\1\1\3\uffff\2\1",
            "\1\1\1\uffff\5\63\14\uffff\4\63\17\uffff\1\1",
            "\1\1\1\uffff\1\64\1\65\1\70\1\71\1\72\14\uffff\1\73\1\74\1\66\1\67",
            "\2\1\1\64\1\65\1\70\1\71\1\72\4\uffff\1\1\1\uffff\6\1\1\73\1\74\1\66\1\67\13\uffff\4\1\1\uffff\1\1\1\uffff\5\1\1\uffff\2\1\1\uffff\2\1\17\uffff\2\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\2\63\1\76\1\75\1\77\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\63\7\uffff\55\1",
            "\2\1\1\64\1\65\1\100\1\101\1\102\4\uffff\1\1\1\uffff\6\1\1\103\1\104\1\66\1\67\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\20\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\105\1\106\1\111\1\112\1\113\14\uffff\1\114\1\115\1\107\1\110",
            "\1\1\1\uffff\1\116\1\117\1\122\1\123\1\124\14\uffff\1\125\1\126\1\120\1\121\1\uffff\1\1",
            "\1\127\1\130\1\133\1\134\1\135\14\uffff\1\136\1\137\1\131\1\132",
            "\1\140\1\141\1\144\1\145\1\146\14\uffff\1\147\1\150\1\142\1\143",
            "\2\1\1\64\1\65\1\70\1\71\1\72\4\uffff\1\1\1\uffff\6\1\1\73\1\74\1\66\1\67\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\4\1\15\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\1\1\1\uffff\5\150\14\uffff\4\150\56\uffff\1\1",
            "\1\1\1\uffff\5\150\14\uffff\4\150\63\uffff\1\1",
            "\1\1\1\uffff\5\150\14\uffff\4\150\1\1",
            "\1\1\1\uffff\2\150\1\152\1\151\1\153\4\uffff\1\1\1\uffff\1\1\1\uffff\4\1\4\150\7\uffff\55\1",
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
            "\6\177\4\uffff\1\177\1\1\13\177\6\uffff\1\27\54\177\6\uffff\3\177",
            "\6\177\4\uffff\1\177\1\1\13\177\6\uffff\1\27\54\177\6\uffff\3\177",
            "\1\u0080\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\1\u0080\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0091\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0091\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0091\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0090\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
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
            "\6\u008a\4\uffff\1\u008a\1\u0092\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0092\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\u0092\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
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
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "",
            "",
            "",
            "",
            "",
            "\1\u008a\1\u0093\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\1\u008f\1\u0085\1\u0082\1\u0081\1\u0083\1\u0084\1\u008e\3\uffff\14\u008a\1\u0086\1\u0087\1\u0088\1\u0089\1\u008b\1\u008c\1\u008d\1\27\54\u008a\6\uffff\3\u008a",
            "\6\u008a\4\uffff\1\u008a\1\1\13\u008a\6\uffff\1\27\54\u008a\6\uffff\3\u008a",
            "\4\1\1\u0094\1\u0095\1\u0096\4\uffff\1\1\1\uffff\6\1\1\u0097\1\u0098\2\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\20\uffff\1\1\1\uffff\1\1\12\uffff\1\1",
            "\2\1\1\u0099\1\u009a\1\u009b\14\uffff\1\u009c\1\u009d\2\1",
            "\2\1\1\u009e\1\u009f\1\u00a0\14\uffff\1\u00a1\1\u00a2\2\1",
            "\6\u00a2\4\uffff\1\u00a2\1\1\13\u00a2\6\uffff\1\27\54\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\54\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\54\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\54\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\54\u00a2\6\uffff\3\u00a2",
            "\6\u00a2\4\uffff\1\u00a2\1\u0090\13\u00a2\6\uffff\1\27\54\u00a2\6\uffff\3\u00a2",
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

    static final short[] dfa_52 = DFA.unpackEncodedString(dfa_52s);
    static final short[] dfa_53 = DFA.unpackEncodedString(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final char[] dfa_55 = DFA.unpackEncodedStringToUnsignedChars(dfa_55s);
    static final short[] dfa_56 = DFA.unpackEncodedString(dfa_56s);
    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[][] dfa_58 = unpackEncodedStringArray(dfa_58s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_52;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "()+ loopback of 3949:10: ( (lv_with_31_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = dfa_52;
            this.eof = dfa_53;
            this.min = dfa_54;
            this.max = dfa_55;
            this.accept = dfa_56;
            this.special = dfa_57;
            this.transition = dfa_58;
        }
        public String getDescription() {
            return "()+ loopback of 4001:10: ( (lv_env_36_0= ruleKeyValuePair ) )+";
        }
    }
    static final String[] dfa_59s = {
            "\6\1\4\uffff\1\1\1\uffff\12\1\13\uffff\4\1\1\uffff\1\1\10\uffff\1\1\2\uffff\4\1\1\2\1\3\1\4\1\uffff\1\5\1\6\1\10\1\11\5\uffff\1\1\1\uffff\1\1\2\uffff\1\7\7\uffff\1\1",
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
    static final short[][] dfa_59 = unpackEncodedStringArray(dfa_59s);

    class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_29;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_59;
        }
        public String getDescription() {
            return "()* loopback of 4249:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'configuration' otherlv_69= ':' ( (this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_configuration_73_0= ruleEString ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) | (otherlv_76= '[' ( (lv_configuration_77_0= ruleEString ) ) (otherlv_78= ',' ( (lv_configuration_79_0= ruleEString ) ) )* otherlv_80= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_81= 'include' otherlv_82= ':' this_BEG_BLOCK_83= RULE_BEG_BLOCK (otherlv_84= '-' (this_BEG_BLOCK_85= RULE_BEG_BLOCK )? ( (lv_include_86_0= ruleInclude ) ) (this_END_BLOCK_87= RULE_END_BLOCK )? )+ this_END_BLOCK_88= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_89= 'exclude' otherlv_90= ':' this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_exclude_94_0= ruleExclude ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) ) ) ) )*";
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
                        if ( (LA124_0==EOF||(LA124_0>=RULE_END_BLOCK && LA124_0<=RULE_INT)||LA124_0==15||(LA124_0>=17 && LA124_0<=26)||(LA124_0>=38 && LA124_0<=41)||LA124_0==43||LA124_0==52||(LA124_0>=55 && LA124_0<=58)||LA124_0==72||LA124_0==74||LA124_0==85) ) {s = 1;}

                        else if ( LA124_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA124_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA124_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA124_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA124_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA124_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA124_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA124_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0040000C007E8030L,0x0000000000018818L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000007E8030L,0x00000000000C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000078007D0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007FE87F2L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x004BE000007E8030L,0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFFFFFFFC007A8710L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0xFFFFFFFC007E8732L,0x0000000000007FFFL});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800700L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000003F8010FF2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000003F8010FE2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040000C00000022L,0x0000000000018818L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040000C08000032L,0x0000000000018818L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0040000C078007E2L,0x0000000000018818L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0040000C00000030L,0x0000000000018838L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0004000000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0004001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004001000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000010L,0x0000000000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00000000078007F2L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000032L,0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000022L,0x00000000000C0000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008022L,0x0000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x004BE00000000022L,0x0000000000000080L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00900BC000608032L,0x0000000000200500L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x00900BC000608022L,0x0000000000200500L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000000178007D0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00900BC000608030L,0x0000000000300500L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x07900BC000608030L,0x0000000000200500L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000010L,0x0000000000004000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00900BC008608032L,0x0000000000200500L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00DBEBC000608030L,0x0000000000200580L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xFFFFFFFC007A8732L,0x0000000000207FFFL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00301E0000408032L,0x0000000000C00000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00301E0000408022L,0x0000000000C00000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0xFFFFFFFC007A8732L,0x0000000000C07FFFL});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0700000000000022L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0xBF00000000000030L,0x0000000000002007L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xB800000000000022L,0x0000000000002007L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x6800000008000030L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x2800000008000030L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x6800000000000022L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x2800000000000022L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000100000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});

}

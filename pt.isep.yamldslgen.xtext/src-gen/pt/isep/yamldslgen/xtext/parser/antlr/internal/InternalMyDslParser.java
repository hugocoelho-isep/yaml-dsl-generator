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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_GH_EXPRESSION", "RULE_YAML_SCALAR", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'name'", "':'", "'on'", "'concurrency'", "'jobs'", "'permissions'", "'env'", "'true'", "'false'", "'>'", "'|'", "'-'", "'['", "']'", "';'", "','", "'{'", "'}'", "'push'", "'pull_request'", "'branches'", "'tags'", "'runs-on'", "'needs'", "'steps'", "'uses'", "'run'", "'with'", "'schedule'", "'workflow_dispatch'", "'cron'", "'group'", "'cancel-in-progress'", "'url'", "'environment'", "'id'", "'if'", "'working-directory'"
    };
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
    // InternalMyDsl.g:71:1: ruleGithubActions returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) ) ;
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
        Token this_BEG_BLOCK_12=null;
        Token this_END_BLOCK_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_BEG_BLOCK_17=null;
        Token this_END_BLOCK_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token this_BEG_BLOCK_22=null;
        Token this_END_BLOCK_24=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_on_6_0 = null;

        EObject lv_concurrency_9_0 = null;

        EObject lv_jobs_13_0 = null;

        EObject lv_permissions_18_0 = null;

        EObject lv_env_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=7;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4) ) {
                    alt10=5;
                }
                else if ( LA10_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5) ) {
                    alt10=6;
                }


                switch (alt10) {
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
            	    // InternalMyDsl.g:199:3: ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:199:3: ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:200:4: {...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalMyDsl.g:200:107: ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:201:5: ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalMyDsl.g:204:8: ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:204:9: {...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:204:18: (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:204:19: otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )?
            	    {
            	    otherlv_10=(Token)match(input,19,FOLLOW_3); 

            	    								newLeafNode(otherlv_10, grammarAccess.getGithubActionsAccess().getJobsKeyword_3_0());
            	    							
            	    otherlv_11=(Token)match(input,16,FOLLOW_8); 

            	    								newLeafNode(otherlv_11, grammarAccess.getGithubActionsAccess().getColonKeyword_3_1());
            	    							
            	    // InternalMyDsl.g:212:8: (this_BEG_BLOCK_12= RULE_BEG_BLOCK )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==RULE_BEG_BLOCK) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalMyDsl.g:213:9: this_BEG_BLOCK_12= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_12=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_8); 

            	            									newLeafNode(this_BEG_BLOCK_12, grammarAccess.getGithubActionsAccess().getBEG_BLOCKTerminalRuleCall_3_2());
            	            								

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:218:8: ( (lv_jobs_13_0= ruleJob ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)||(LA2_0>=22 && LA2_0<=25)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:219:9: (lv_jobs_13_0= ruleJob )
            	    	    {
            	    	    // InternalMyDsl.g:219:9: (lv_jobs_13_0= ruleJob )
            	    	    // InternalMyDsl.g:220:10: lv_jobs_13_0= ruleJob
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getJobsJobParserRuleCall_3_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_9);
            	    	    lv_jobs_13_0=ruleJob();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"jobs",
            	    	    											lv_jobs_13_0,
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

            	    // InternalMyDsl.g:237:8: (this_END_BLOCK_14= RULE_END_BLOCK )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_END_BLOCK) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalMyDsl.g:238:9: this_END_BLOCK_14= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_14=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	            									newLeafNode(this_END_BLOCK_14, grammarAccess.getGithubActionsAccess().getEND_BLOCKTerminalRuleCall_3_4());
            	            								

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
            	case 5 :
            	    // InternalMyDsl.g:249:3: ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:249:3: ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:250:4: {...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalMyDsl.g:250:107: ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:251:5: ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalMyDsl.g:254:8: ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:254:9: {...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:254:18: (otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:254:19: otherlv_15= 'permissions' otherlv_16= ':' ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? )
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_3); 

            	    								newLeafNode(otherlv_15, grammarAccess.getGithubActionsAccess().getPermissionsKeyword_4_0());
            	    							
            	    otherlv_16=(Token)match(input,16,FOLLOW_10); 

            	    								newLeafNode(otherlv_16, grammarAccess.getGithubActionsAccess().getColonKeyword_4_1());
            	    							
            	    // InternalMyDsl.g:262:8: ( (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:263:9: (this_BEG_BLOCK_17= RULE_BEG_BLOCK )? ( (lv_permissions_18_0= ruleKeyValuePair ) )+ (this_END_BLOCK_19= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:263:9: (this_BEG_BLOCK_17= RULE_BEG_BLOCK )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_BEG_BLOCK) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDsl.g:264:10: this_BEG_BLOCK_17= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_17=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_10); 

            	            										newLeafNode(this_BEG_BLOCK_17, grammarAccess.getGithubActionsAccess().getBEG_BLOCKTerminalRuleCall_4_2_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:269:9: ( (lv_permissions_18_0= ruleKeyValuePair ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        alt5 = dfa5.predict(input);
            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:270:10: (lv_permissions_18_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:270:10: (lv_permissions_18_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:271:11: lv_permissions_18_0= ruleKeyValuePair
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getGithubActionsAccess().getPermissionsKeyValuePairParserRuleCall_4_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_permissions_18_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"permissions",
            	    	    												lv_permissions_18_0,
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

            	    // InternalMyDsl.g:288:9: (this_END_BLOCK_19= RULE_END_BLOCK )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_END_BLOCK) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMyDsl.g:289:10: this_END_BLOCK_19= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_19=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	            										newLeafNode(this_END_BLOCK_19, grammarAccess.getGithubActionsAccess().getEND_BLOCKTerminalRuleCall_4_2_2());
            	            									

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
            	case 6 :
            	    // InternalMyDsl.g:301:3: ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:301:3: ({...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:302:4: {...}? => ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalMyDsl.g:302:107: ( ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:303:5: ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalMyDsl.g:306:8: ({...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:306:9: {...}? => (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:306:18: (otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:306:19: otherlv_20= 'env' otherlv_21= ':' ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? )
            	    {
            	    otherlv_20=(Token)match(input,21,FOLLOW_3); 

            	    								newLeafNode(otherlv_20, grammarAccess.getGithubActionsAccess().getEnvKeyword_5_0());
            	    							
            	    otherlv_21=(Token)match(input,16,FOLLOW_10); 

            	    								newLeafNode(otherlv_21, grammarAccess.getGithubActionsAccess().getColonKeyword_5_1());
            	    							
            	    // InternalMyDsl.g:314:8: ( (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:315:9: (this_BEG_BLOCK_22= RULE_BEG_BLOCK )? ( (lv_env_23_0= ruleKeyValuePair ) )+ (this_END_BLOCK_24= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:315:9: (this_BEG_BLOCK_22= RULE_BEG_BLOCK )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==RULE_BEG_BLOCK) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMyDsl.g:316:10: this_BEG_BLOCK_22= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_22=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_10); 

            	            										newLeafNode(this_BEG_BLOCK_22, grammarAccess.getGithubActionsAccess().getBEG_BLOCKTerminalRuleCall_5_2_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:321:9: ( (lv_env_23_0= ruleKeyValuePair ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        alt8 = dfa8.predict(input);
            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:322:10: (lv_env_23_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:322:10: (lv_env_23_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:323:11: lv_env_23_0= ruleKeyValuePair
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getGithubActionsAccess().getEnvKeyValuePairParserRuleCall_5_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_11);
            	    	    lv_env_23_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"env",
            	    	    												lv_env_23_0,
            	    	    												"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	    // InternalMyDsl.g:340:9: (this_END_BLOCK_24= RULE_END_BLOCK )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_END_BLOCK) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMyDsl.g:341:10: this_END_BLOCK_24= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_24=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	            										newLeafNode(this_END_BLOCK_24, grammarAccess.getGithubActionsAccess().getEND_BLOCKTerminalRuleCall_5_2_2());
            	            									

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
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
    // InternalMyDsl.g:364:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:364:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:365:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:371:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_GH_EXPRESSION_1=null;
        AntlrDatatypeRuleToken this_BlockString_2 = null;

        AntlrDatatypeRuleToken this_ScalarSequence_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:377:2: ( (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence ) )
            // InternalMyDsl.g:378:2: (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence )
            {
            // InternalMyDsl.g:378:2: (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt11=1;
                }
                break;
            case RULE_GH_EXPRESSION:
                {
                alt11=2;
                }
                break;
            case 24:
            case 25:
                {
                alt11=3;
                }
                break;
            case RULE_YAML_SCALAR:
            case RULE_ID:
            case RULE_INT:
            case 22:
            case 23:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:379:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:387:3: this_GH_EXPRESSION_1= RULE_GH_EXPRESSION
                    {
                    this_GH_EXPRESSION_1=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_GH_EXPRESSION_1);
                    		

                    			newLeafNode(this_GH_EXPRESSION_1, grammarAccess.getEStringAccess().getGH_EXPRESSIONTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:395:3: this_BlockString_2= ruleBlockString
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
                    // InternalMyDsl.g:406:3: this_ScalarSequence_3= ruleScalarSequence
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
    // InternalMyDsl.g:420:1: entryRuleScalarSequence returns [String current=null] : iv_ruleScalarSequence= ruleScalarSequence EOF ;
    public final String entryRuleScalarSequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarSequence = null;


        try {
            // InternalMyDsl.g:420:54: (iv_ruleScalarSequence= ruleScalarSequence EOF )
            // InternalMyDsl.g:421:2: iv_ruleScalarSequence= ruleScalarSequence EOF
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
    // InternalMyDsl.g:427:1: ruleScalarSequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* ) ;
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
            // InternalMyDsl.g:433:2: ( ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* ) )
            // InternalMyDsl.g:434:2: ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* )
            {
            // InternalMyDsl.g:434:2: ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* )
            // InternalMyDsl.g:435:3: (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )*
            {
            // InternalMyDsl.g:435:3: (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' )
            int alt12=5;
            switch ( input.LA(1) ) {
            case RULE_YAML_SCALAR:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case RULE_INT:
                {
                alt12=3;
                }
                break;
            case 22:
                {
                alt12=4;
                }
                break;
            case 23:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:436:4: this_YAML_SCALAR_0= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_0=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_12); 

                    				current.merge(this_YAML_SCALAR_0);
                    			

                    				newLeafNode(this_YAML_SCALAR_0, grammarAccess.getScalarSequenceAccess().getYAML_SCALARTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:444:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_12); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getScalarSequenceAccess().getIDTerminalRuleCall_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:452:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_12); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getScalarSequenceAccess().getINTTerminalRuleCall_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:460:4: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getTrueKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:466:4: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_12); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getFalseKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:472:3: (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    switch ( input.LA(2) ) {
                    case RULE_YAML_SCALAR:
                        {
                        alt14=1;
                        }
                        break;
                    case RULE_ID:
                        {
                        alt14=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt14=1;
                        }
                        break;
                    case 22:
                        {
                        alt14=1;
                        }
                        break;
                    case 23:
                        {
                        alt14=1;
                        }
                        break;

                    }

                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:473:4: kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' )
            	    {
            	    kw=(Token)match(input,16,FOLLOW_13); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getColonKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:478:4: (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' )
            	    int alt13=5;
            	    switch ( input.LA(1) ) {
            	    case RULE_YAML_SCALAR:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case RULE_INT:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    case 22:
            	        {
            	        alt13=4;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt13=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // InternalMyDsl.g:479:5: this_YAML_SCALAR_6= RULE_YAML_SCALAR
            	            {
            	            this_YAML_SCALAR_6=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_12); 

            	            					current.merge(this_YAML_SCALAR_6);
            	            				

            	            					newLeafNode(this_YAML_SCALAR_6, grammarAccess.getScalarSequenceAccess().getYAML_SCALARTerminalRuleCall_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:487:5: this_ID_7= RULE_ID
            	            {
            	            this_ID_7=(Token)match(input,RULE_ID,FOLLOW_12); 

            	            					current.merge(this_ID_7);
            	            				

            	            					newLeafNode(this_ID_7, grammarAccess.getScalarSequenceAccess().getIDTerminalRuleCall_1_1_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:495:5: this_INT_8= RULE_INT
            	            {
            	            this_INT_8=(Token)match(input,RULE_INT,FOLLOW_12); 

            	            					current.merge(this_INT_8);
            	            				

            	            					newLeafNode(this_INT_8, grammarAccess.getScalarSequenceAccess().getINTTerminalRuleCall_1_1_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:503:5: kw= 'true'
            	            {
            	            kw=(Token)match(input,22,FOLLOW_12); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getTrueKeyword_1_1_3());
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalMyDsl.g:509:5: kw= 'false'
            	            {
            	            kw=(Token)match(input,23,FOLLOW_12); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getFalseKeyword_1_1_4());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalMyDsl.g:520:1: entryRuleBlockString returns [String current=null] : iv_ruleBlockString= ruleBlockString EOF ;
    public final String entryRuleBlockString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockString = null;


        try {
            // InternalMyDsl.g:520:51: (iv_ruleBlockString= ruleBlockString EOF )
            // InternalMyDsl.g:521:2: iv_ruleBlockString= ruleBlockString EOF
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
    // InternalMyDsl.g:527:1: ruleBlockString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:533:2: ( ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:534:2: ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:534:2: ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalMyDsl.g:535:3: (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:535:3: (kw= '>' | kw= '|' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==25) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:536:4: kw= '>'
                    {
                    kw=(Token)match(input,24,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:542:4: kw= '|'
                    {
                    kw=(Token)match(input,25,FOLLOW_14); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLineKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:548:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_BEG_BLOCK) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:549:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

                    				current.merge(this_BEG_BLOCK_2);
                    			

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getBlockStringAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:557:3: (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )*
            loop17:
            do {
                int alt17=15;
                alt17 = dfa17.predict(input);
                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:558:4: this_YAML_SCALAR_3= RULE_YAML_SCALAR
            	    {
            	    this_YAML_SCALAR_3=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_15); 

            	    				current.merge(this_YAML_SCALAR_3);
            	    			

            	    				newLeafNode(this_YAML_SCALAR_3, grammarAccess.getBlockStringAccess().getYAML_SCALARTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:566:4: this_GH_EXPRESSION_4= RULE_GH_EXPRESSION
            	    {
            	    this_GH_EXPRESSION_4=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_15); 

            	    				current.merge(this_GH_EXPRESSION_4);
            	    			

            	    				newLeafNode(this_GH_EXPRESSION_4, grammarAccess.getBlockStringAccess().getGH_EXPRESSIONTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:574:4: this_ID_5= RULE_ID
            	    {
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_15); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getBlockStringAccess().getIDTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:582:4: this_INT_6= RULE_INT
            	    {
            	    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_15); 

            	    				current.merge(this_INT_6);
            	    			

            	    				newLeafNode(this_INT_6, grammarAccess.getBlockStringAccess().getINTTerminalRuleCall_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:590:4: this_STRING_7= RULE_STRING
            	    {
            	    this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_15); 

            	    				current.merge(this_STRING_7);
            	    			

            	    				newLeafNode(this_STRING_7, grammarAccess.getBlockStringAccess().getSTRINGTerminalRuleCall_2_4());
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:598:4: kw= '-'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getHyphenMinusKeyword_2_5());
            	    			

            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:604:4: kw= '['
            	    {
            	    kw=(Token)match(input,27,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftSquareBracketKeyword_2_6());
            	    			

            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:610:4: kw= ']'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightSquareBracketKeyword_2_7());
            	    			

            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:616:4: kw= ';'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getSemicolonKeyword_2_8());
            	    			

            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:622:4: kw= ':'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getColonKeyword_2_9());
            	    			

            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:628:4: kw= ','
            	    {
            	    kw=(Token)match(input,30,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getCommaKeyword_2_10());
            	    			

            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:634:4: kw= '{'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftCurlyBracketKeyword_2_11());
            	    			

            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:640:4: kw= '}'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightCurlyBracketKeyword_2_12());
            	    			

            	    }
            	    break;
            	case 14 :
            	    // InternalMyDsl.g:646:4: this_ANY_OTHER_16= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_16=(Token)match(input,RULE_ANY_OTHER,FOLLOW_15); 

            	    				current.merge(this_ANY_OTHER_16);
            	    			

            	    				newLeafNode(this_ANY_OTHER_16, grammarAccess.getBlockStringAccess().getANY_OTHERTerminalRuleCall_2_13());
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalMyDsl.g:654:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_END_BLOCK) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:655:4: this_END_BLOCK_17= RULE_END_BLOCK
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
    // InternalMyDsl.g:667:1: entryRuleKeyName returns [String current=null] : iv_ruleKeyName= ruleKeyName EOF ;
    public final String entryRuleKeyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyName = null;


        try {
            // InternalMyDsl.g:667:47: (iv_ruleKeyName= ruleKeyName EOF )
            // InternalMyDsl.g:668:2: iv_ruleKeyName= ruleKeyName EOF
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
    // InternalMyDsl.g:674:1: ruleKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' ) ;
    public final AntlrDatatypeRuleToken ruleKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_YAML_SCALAR_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:680:2: ( (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' ) )
            // InternalMyDsl.g:681:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' )
            {
            // InternalMyDsl.g:681:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' )
            int alt19=18;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt19=1;
                }
                break;
            case RULE_YAML_SCALAR:
                {
                alt19=2;
                }
                break;
            case RULE_INT:
                {
                alt19=3;
                }
                break;
            case 15:
                {
                alt19=4;
                }
                break;
            case 17:
                {
                alt19=5;
                }
                break;
            case 19:
                {
                alt19=6;
                }
                break;
            case 20:
                {
                alt19=7;
                }
                break;
            case 21:
                {
                alt19=8;
                }
                break;
            case 33:
                {
                alt19=9;
                }
                break;
            case 34:
                {
                alt19=10;
                }
                break;
            case 35:
                {
                alt19=11;
                }
                break;
            case 36:
                {
                alt19=12;
                }
                break;
            case 37:
                {
                alt19=13;
                }
                break;
            case 38:
                {
                alt19=14;
                }
                break;
            case 39:
                {
                alt19=15;
                }
                break;
            case 40:
                {
                alt19=16;
                }
                break;
            case 41:
                {
                alt19=17;
                }
                break;
            case 42:
                {
                alt19=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:682:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getKeyNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:690:3: this_YAML_SCALAR_1= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_1=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_2); 

                    			current.merge(this_YAML_SCALAR_1);
                    		

                    			newLeafNode(this_YAML_SCALAR_1, grammarAccess.getKeyNameAccess().getYAML_SCALARTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:698:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getKeyNameAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:706:3: kw= 'name'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getNameKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:712:3: kw= 'on'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOnKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:718:3: kw= 'jobs'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getJobsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:724:3: kw= 'permissions'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPermissionsKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:730:3: kw= 'env'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getEnvKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:736:3: kw= 'push'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPushKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:742:3: kw= 'pull_request'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPull_requestKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:748:3: kw= 'branches'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getBranchesKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:754:3: kw= 'tags'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getTagsKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:760:3: kw= 'runs-on'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRunsOnKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:766:3: kw= 'needs'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getNeedsKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:772:3: kw= 'steps'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getStepsKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:778:3: kw= 'uses'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getUsesKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:784:3: kw= 'run'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRunKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:790:3: kw= 'with'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getWithKeyword_17());
                    		

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
    // InternalMyDsl.g:799:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalMyDsl.g:799:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalMyDsl.g:800:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalMyDsl.g:806:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:812:2: ( ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:813:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:813:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            // InternalMyDsl.g:814:3: ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:814:3: ( (lv_key_0_0= ruleKeyName ) )
            // InternalMyDsl.g:815:4: (lv_key_0_0= ruleKeyName )
            {
            // InternalMyDsl.g:815:4: (lv_key_0_0= ruleKeyName )
            // InternalMyDsl.g:816:5: lv_key_0_0= ruleKeyName
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
            		
            // InternalMyDsl.g:837:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMyDsl.g:838:4: (lv_value_2_0= ruleEString )
            {
            // InternalMyDsl.g:838:4: (lv_value_2_0= ruleEString )
            // InternalMyDsl.g:839:5: lv_value_2_0= ruleEString
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
    // InternalMyDsl.g:860:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
    public final EObject entryRuleOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOn = null;


        try {
            // InternalMyDsl.g:860:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:861:2: iv_ruleOn= ruleOn EOF
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
    // InternalMyDsl.g:867:1: ruleOn returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
    public final EObject ruleOn() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_BEG_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token this_END_BLOCK_17=null;
        EObject lv_push_5_0 = null;

        EObject lv_pullRequest_8_0 = null;

        EObject lv_schedule_12_0 = null;

        AntlrDatatypeRuleToken lv_workflowDispatch_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:873:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:874:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:874:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalMyDsl.g:875:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:875:3: ()
            // InternalMyDsl.g:876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnAccess().getOnAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:882:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_BEG_BLOCK) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:883:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_16); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:888:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) )
            // InternalMyDsl.g:889:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:889:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) )
            // InternalMyDsl.g:890:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:893:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* )
            // InternalMyDsl.g:894:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )*
            {
            // InternalMyDsl.g:894:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )*
            loop25:
            do {
                int alt25=5;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
                    alt25=4;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:895:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:895:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:896:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:896:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:897:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:900:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:900:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:900:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:900:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOnAccess().getPushKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_17); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOnAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:908:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:909:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:909:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:910:11: lv_push_5_0= rulePush
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPushPushParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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
            	    // InternalMyDsl.g:933:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:933:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:934:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:934:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:935:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:938:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:938:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:938:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:938:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
            	    {
            	    otherlv_6=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getOnAccess().getPull_requestKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_17); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOnAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:946:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:947:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:947:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:948:11: lv_pullRequest_8_0= rulePull_request
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPullRequestPull_requestParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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
            	    // InternalMyDsl.g:971:4: ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:971:4: ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:972:5: {...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:972:99: ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:973:6: ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:976:9: ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:976:10: {...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:976:19: (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:976:20: otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? )
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getOnAccess().getScheduleKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_10, grammarAccess.getOnAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:984:9: ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:985:10: (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:985:10: (this_BEG_BLOCK_11= RULE_BEG_BLOCK )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==RULE_BEG_BLOCK) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMyDsl.g:986:11: this_BEG_BLOCK_11= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_11=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_18); 

            	            											newLeafNode(this_BEG_BLOCK_11, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:991:10: ( (lv_schedule_12_0= ruleSchedule ) )+
            	    int cnt22=0;
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==26) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:992:11: (lv_schedule_12_0= ruleSchedule )
            	    	    {
            	    	    // InternalMyDsl.g:992:11: (lv_schedule_12_0= ruleSchedule )
            	    	    // InternalMyDsl.g:993:12: lv_schedule_12_0= ruleSchedule
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getOnAccess().getScheduleScheduleParserRuleCall_2_2_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_schedule_12_0=ruleSchedule();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getOnRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"schedule",
            	    	    													lv_schedule_12_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.Schedule");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt22 >= 1 ) break loop22;
            	                EarlyExitException eee =
            	                    new EarlyExitException(22, input);
            	                throw eee;
            	        }
            	        cnt22++;
            	    } while (true);

            	    // InternalMyDsl.g:1010:10: (this_END_BLOCK_13= RULE_END_BLOCK )?
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==RULE_END_BLOCK) ) {
            	        alt23=1;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalMyDsl.g:1011:11: this_END_BLOCK_13= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            											newLeafNode(this_END_BLOCK_13, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_2_2_2_2());
            	            										

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
            	case 4 :
            	    // InternalMyDsl.g:1023:4: ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:1023:4: ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) )
            	    // InternalMyDsl.g:1024:5: {...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1024:99: ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) )
            	    // InternalMyDsl.g:1025:6: ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1028:9: ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) )
            	    // InternalMyDsl.g:1028:10: {...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1028:19: (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? )
            	    // InternalMyDsl.g:1028:20: otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )?
            	    {
            	    otherlv_14=(Token)match(input,44,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getOnAccess().getWorkflow_dispatchKeyword_2_3_0());
            	    								
            	    otherlv_15=(Token)match(input,16,FOLLOW_20); 

            	    									newLeafNode(otherlv_15, grammarAccess.getOnAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:1036:9: ( (lv_workflowDispatch_16_0= ruleEString ) )?
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_INT)||(LA24_0>=22 && LA24_0<=25)) ) {
            	        alt24=1;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalMyDsl.g:1037:10: (lv_workflowDispatch_16_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1037:10: (lv_workflowDispatch_16_0= ruleEString )
            	            // InternalMyDsl.g:1038:11: lv_workflowDispatch_16_0= ruleEString
            	            {

            	            											newCompositeNode(grammarAccess.getOnAccess().getWorkflowDispatchEStringParserRuleCall_2_3_2_0());
            	            										
            	            pushFollow(FOLLOW_16);
            	            lv_workflowDispatch_16_0=ruleEString();

            	            state._fsp--;


            	            											if (current==null) {
            	            												current = createModelElementForParent(grammarAccess.getOnRule());
            	            											}
            	            											set(
            	            												current,
            	            												"workflowDispatch",
            	            												lv_workflowDispatch_16_0,
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

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1068:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_END_BLOCK) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1069:4: this_END_BLOCK_17= RULE_END_BLOCK
                    {
                    this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_17, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // InternalMyDsl.g:1078:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalMyDsl.g:1078:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:1079:2: iv_rulePush= rulePush EOF
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
    // InternalMyDsl.g:1085:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1091:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1092:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1092:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1093:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1093:3: ()
            // InternalMyDsl.g:1094:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_21); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1104:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1105:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1105:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1106:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1109:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1110:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1110:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:1111:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1111:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1112:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1112:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1113:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1116:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1116:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1116:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1116:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPushAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_22); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPushAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1124:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_BEG_BLOCK) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==27) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalMyDsl.g:1125:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1125:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1126:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_23); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1130:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt27=0;
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==26) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1131:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,26,FOLLOW_17); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1139:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1140:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1140:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1141:14: lv_branches_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_24);
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

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	            	    												newLeafNode(this_END_BLOCK_9, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_1_3());
            	            	    											

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

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_21); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1169:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1169:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1170:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1174:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1175:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1175:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1176:13: lv_branches_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_26);
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

            	            // InternalMyDsl.g:1193:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==30) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1194:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPushAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1198:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1199:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1199:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1200:14: lv_branches_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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
            	            	    break loop28;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,28,FOLLOW_21); 

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
            	    // InternalMyDsl.g:1230:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1230:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1231:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1231:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1232:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1235:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1235:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1235:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1235:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPushAccess().getTagsKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_22); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPushAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1243:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_BEG_BLOCK) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==27) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalMyDsl.g:1244:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1244:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1245:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_23); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1249:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
            	            int cnt30=0;
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==26) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1250:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,26,FOLLOW_17); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1258:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1259:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1259:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1260:14: lv_tags_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_24);
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

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	            	    												newLeafNode(this_END_BLOCK_22, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_1_3());
            	            	    											

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt30 >= 1 ) break loop30;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(30, input);
            	                        throw eee;
            	                }
            	                cnt30++;
            	            } while (true);

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_21); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1288:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1288:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1289:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1293:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1294:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1294:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:1295:13: lv_tags_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_26);
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

            	            // InternalMyDsl.g:1312:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==30) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1313:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPushAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1317:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1318:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1318:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1319:14: lv_tags_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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
            	            	    break loop31;
            	                }
            	            } while (true);

            	            otherlv_28=(Token)match(input,28,FOLLOW_21); 

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
            	    break loop33;
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
    // InternalMyDsl.g:1364:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
    public final EObject entryRulePull_request() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_request = null;


        try {
            // InternalMyDsl.g:1364:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1365:2: iv_rulePull_request= rulePull_request EOF
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
    // InternalMyDsl.g:1371:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) ;
    public final EObject rulePull_request() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_branches_7_0 = null;

        AntlrDatatypeRuleToken lv_branches_11_0 = null;

        AntlrDatatypeRuleToken lv_branches_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1377:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1378:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1378:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            // InternalMyDsl.g:1379:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1379:3: ()
            // InternalMyDsl.g:1380:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPull_requestAccess().getPull_requestAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_27); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPull_requestAccess().getBranchesKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getPull_requestAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1398:3: ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_BEG_BLOCK) ) {
                alt36=1;
            }
            else if ( (LA36_0==27) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1399:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    {
                    // InternalMyDsl.g:1399:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    // InternalMyDsl.g:1400:5: this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_23); 

                    					newLeafNode(this_BEG_BLOCK_4, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_4_0_0());
                    				
                    // InternalMyDsl.g:1404:5: (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==26) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalMyDsl.g:1405:6: otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_17); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_4_0_1_0());
                    	    					
                    	    this_BEG_BLOCK_6=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

                    	    						newLeafNode(this_BEG_BLOCK_6, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_4_0_1_1());
                    	    					
                    	    // InternalMyDsl.g:1413:6: ( (lv_branches_7_0= ruleEString ) )
                    	    // InternalMyDsl.g:1414:7: (lv_branches_7_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1414:7: (lv_branches_7_0= ruleEString )
                    	    // InternalMyDsl.g:1415:8: lv_branches_7_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_24);
                    	    lv_branches_7_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPull_requestRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"branches",
                    	    									lv_branches_7_0,
                    	    									"pt.isep.yamldslgen.xtext.MyDsl.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

                    	    						newLeafNode(this_END_BLOCK_8, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_4_0_1_3());
                    	    					

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

                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_24); 

                    					newLeafNode(this_END_BLOCK_9, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1443:4: (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    {
                    // InternalMyDsl.g:1443:4: (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    // InternalMyDsl.g:1444:5: otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalMyDsl.g:1448:5: ( (lv_branches_11_0= ruleEString ) )
                    // InternalMyDsl.g:1449:6: (lv_branches_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:1449:6: (lv_branches_11_0= ruleEString )
                    // InternalMyDsl.g:1450:7: lv_branches_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_1_1_0());
                    						
                    pushFollow(FOLLOW_26);
                    lv_branches_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPull_requestRule());
                    							}
                    							add(
                    								current,
                    								"branches",
                    								lv_branches_11_0,
                    								"pt.isep.yamldslgen.xtext.MyDsl.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:1467:5: (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==30) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalMyDsl.g:1468:6: otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,30,FOLLOW_4); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getPull_requestAccess().getCommaKeyword_4_1_2_0());
                    	    					
                    	    // InternalMyDsl.g:1472:6: ( (lv_branches_13_0= ruleEString ) )
                    	    // InternalMyDsl.g:1473:7: (lv_branches_13_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1473:7: (lv_branches_13_0= ruleEString )
                    	    // InternalMyDsl.g:1474:8: lv_branches_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_26);
                    	    lv_branches_13_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPull_requestRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"branches",
                    	    									lv_branches_13_0,
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

                    otherlv_14=(Token)match(input,28,FOLLOW_24); 

                    					newLeafNode(otherlv_14, grammarAccess.getPull_requestAccess().getRightSquareBracketKeyword_4_1_3());
                    				

                    }


                    }
                    break;

            }

            this_END_BLOCK_15=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_15, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_5());
            		

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
    // InternalMyDsl.g:1506:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMyDsl.g:1506:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMyDsl.g:1507:2: iv_ruleSchedule= ruleSchedule EOF
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
    // InternalMyDsl.g:1513:1: ruleSchedule returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1519:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1520:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1520:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1521:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:1525:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_BEG_BLOCK) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:1526:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_29); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getScheduleAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getCronKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1539:3: ( (lv_cron_4_0= ruleEString ) )
            // InternalMyDsl.g:1540:4: (lv_cron_4_0= ruleEString )
            {
            // InternalMyDsl.g:1540:4: (lv_cron_4_0= ruleEString )
            // InternalMyDsl.g:1541:5: lv_cron_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getCronEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalMyDsl.g:1558:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_END_BLOCK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1559:4: this_END_BLOCK_5= RULE_END_BLOCK
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


    // $ANTLR start "entryRuleConcurrency"
    // InternalMyDsl.g:1568:1: entryRuleConcurrency returns [EObject current=null] : iv_ruleConcurrency= ruleConcurrency EOF ;
    public final EObject entryRuleConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrency = null;


        try {
            // InternalMyDsl.g:1568:52: (iv_ruleConcurrency= ruleConcurrency EOF )
            // InternalMyDsl.g:1569:2: iv_ruleConcurrency= ruleConcurrency EOF
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
    // InternalMyDsl.g:1575:1: ruleConcurrency returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1581:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1582:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1582:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1583:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1583:3: ()
            // InternalMyDsl.g:1584:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcurrencyAccess().getConcurrencyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1590:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_BEG_BLOCK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1591:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_31); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getConcurrencyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1596:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1597:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1597:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1598:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1601:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1602:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1602:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( LA40_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
                    alt40=1;
                }
                else if ( LA40_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:1603:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1603:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1604:5: {...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1604:108: ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1605:6: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1608:9: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1608:10: {...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:1608:19: (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1608:20: otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,46,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getConcurrencyAccess().getGroupKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConcurrencyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1616:9: ( (lv_group_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1617:10: (lv_group_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1617:10: (lv_group_5_0= ruleEString )
            	    // InternalMyDsl.g:1618:11: lv_group_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getGroupEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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
            	    // InternalMyDsl.g:1641:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1641:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:1642:5: {...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1642:108: ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:1643:6: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1646:9: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:1646:10: {...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:1646:19: (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:1646:20: otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,47,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConcurrencyAccess().getCancelInProgressKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_32); 

            	    									newLeafNode(otherlv_7, grammarAccess.getConcurrencyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1654:9: ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:1655:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:1655:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    // InternalMyDsl.g:1656:11: lv_cancelInProgress_8_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getCancelInProgressEBooleanParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_31);
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
            	    break loop40;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1686:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_END_BLOCK) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1687:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:1696:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:1696:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:1697:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalMyDsl.g:1703:1: ruleEnvironment returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1709:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1710:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1710:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1711:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1711:3: ()
            // InternalMyDsl.g:1712:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1718:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BEG_BLOCK) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1719:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_33); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getEnvironmentAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1724:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1725:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1725:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1726:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1729:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1730:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1730:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            loop43:
            do {
                int alt43=3;
                alt43 = dfa43.predict(input);
                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:1731:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1731:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1732:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1732:108: ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1733:6: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1736:9: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1736:10: {...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:1736:19: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1736:20: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1744:9: ( (lv_name_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1745:10: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1745:10: (lv_name_5_0= ruleEString )
            	    // InternalMyDsl.g:1746:11: lv_name_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    // InternalMyDsl.g:1769:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1769:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1770:5: {...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1770:108: ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1771:6: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1774:9: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1774:10: {...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:1774:19: (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1774:20: otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1782:9: ( (lv_url_8_0= ruleEString ) )
            	    // InternalMyDsl.g:1783:10: (lv_url_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1783:10: (lv_url_8_0= ruleEString )
            	    // InternalMyDsl.g:1784:11: lv_url_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getUrlEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    break loop43;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1814:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_END_BLOCK) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1815:4: this_END_BLOCK_9= RULE_END_BLOCK
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


    // $ANTLR start "entryRuleJob"
    // InternalMyDsl.g:1824:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDsl.g:1824:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDsl.g:1825:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDsl.g:1831:1: ruleJob returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_37= RULE_END_BLOCK )? ) ;
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
        Token this_BEG_BLOCK_29=null;
        Token this_END_BLOCK_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token this_BEG_BLOCK_34=null;
        Token this_END_BLOCK_36=null;
        Token this_END_BLOCK_37=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_runsOn_9_0 = null;

        AntlrDatatypeRuleToken lv_needs_12_0 = null;

        AntlrDatatypeRuleToken lv_needs_16_0 = null;

        AntlrDatatypeRuleToken lv_needs_20_0 = null;

        AntlrDatatypeRuleToken lv_needs_22_0 = null;

        EObject lv_environment_26_0 = null;

        EObject lv_steps_30_0 = null;

        EObject lv_permissions_35_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1837:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1838:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_37= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1838:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_37= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1839:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_37= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1839:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:1840:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:1840:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:1841:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:1862:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_BEG_BLOCK) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:1863:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_35); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1868:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1869:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1869:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1870:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:1873:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:1874:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1874:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop57:
            do {
                int alt57=7;
                alt57 = dfa57.predict(input);
                switch (alt57) {
            	case 1 :
            	    // InternalMyDsl.g:1875:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1875:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1876:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:1876:100: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1877:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:1880:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1880:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:1880:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1880:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getJobAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJobAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:1888:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:1889:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1889:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:1890:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    // InternalMyDsl.g:1913:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1913:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1914:5: {...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:1914:100: ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1915:6: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:1918:9: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1918:10: {...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:1918:19: (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1918:20: otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJobAccess().getRunsOnKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:1926:9: ( (lv_runsOn_9_0= ruleEString ) )
            	    // InternalMyDsl.g:1927:10: (lv_runsOn_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1927:10: (lv_runsOn_9_0= ruleEString )
            	    // InternalMyDsl.g:1928:11: lv_runsOn_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getRunsOnEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    // InternalMyDsl.g:1951:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1951:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1952:5: {...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:1952:100: ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1953:6: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:1956:9: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalMyDsl.g:1956:10: {...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:1956:19: (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    // InternalMyDsl.g:1956:20: otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    {
            	    otherlv_10=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getJobAccess().getNeedsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_36); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJobAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:1964:9: ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    int alt50=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_STRING:
            	    case RULE_GH_EXPRESSION:
            	    case RULE_YAML_SCALAR:
            	    case RULE_ID:
            	    case RULE_INT:
            	    case 22:
            	    case 23:
            	    case 24:
            	    case 25:
            	        {
            	        alt50=1;
            	        }
            	        break;
            	    case RULE_BEG_BLOCK:
            	        {
            	        alt50=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt50=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 50, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt50) {
            	        case 1 :
            	            // InternalMyDsl.g:1965:10: ( (lv_needs_12_0= ruleEString ) )
            	            {
            	            // InternalMyDsl.g:1965:10: ( (lv_needs_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1966:11: (lv_needs_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1966:11: (lv_needs_12_0= ruleEString )
            	            // InternalMyDsl.g:1967:12: lv_needs_12_0= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_0_0());
            	            											
            	            pushFollow(FOLLOW_35);
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
            	            // InternalMyDsl.g:1985:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1985:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1986:11: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_23); 

            	            											newLeafNode(this_BEG_BLOCK_13, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:1990:11: (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+
            	            int cnt48=0;
            	            loop48:
            	            do {
            	                int alt48=2;
            	                int LA48_0 = input.LA(1);

            	                if ( (LA48_0==26) ) {
            	                    alt48=1;
            	                }


            	                switch (alt48) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1991:12: otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_14=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_14, grammarAccess.getJobAccess().getHyphenMinusKeyword_3_2_2_1_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:1995:12: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	            	    int alt46=2;
            	            	    int LA46_0 = input.LA(1);

            	            	    if ( (LA46_0==RULE_BEG_BLOCK) ) {
            	            	        alt46=1;
            	            	    }
            	            	    switch (alt46) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:1996:13: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_15, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:2001:12: ( (lv_needs_16_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2002:13: (lv_needs_16_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2002:13: (lv_needs_16_0= ruleEString )
            	            	    // InternalMyDsl.g:2003:14: lv_needs_16_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_1_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_25);
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

            	            	    // InternalMyDsl.g:2020:12: (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    int alt47=2;
            	            	    int LA47_0 = input.LA(1);

            	            	    if ( (LA47_0==RULE_END_BLOCK) ) {
            	            	        int LA47_1 = input.LA(2);

            	            	        if ( (LA47_1==RULE_END_BLOCK||LA47_1==26) ) {
            	            	            alt47=1;
            	            	        }
            	            	    }
            	            	    switch (alt47) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:2021:13: this_END_BLOCK_17= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	            	            													newLeafNode(this_END_BLOCK_17, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt48 >= 1 ) break loop48;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(48, input);
            	                        throw eee;
            	                }
            	                cnt48++;
            	            } while (true);

            	            this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_35); 

            	            											newLeafNode(this_END_BLOCK_18, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:2033:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            {
            	            // InternalMyDsl.g:2033:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            // InternalMyDsl.g:2034:11: otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']'
            	            {
            	            otherlv_19=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_3_2_2_2_0());
            	            										
            	            // InternalMyDsl.g:2038:11: ( (lv_needs_20_0= ruleEString ) )
            	            // InternalMyDsl.g:2039:12: (lv_needs_20_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2039:12: (lv_needs_20_0= ruleEString )
            	            // InternalMyDsl.g:2040:13: lv_needs_20_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_1_0());
            	            												
            	            pushFollow(FOLLOW_26);
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

            	            // InternalMyDsl.g:2057:11: (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==30) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:2058:12: otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_21, grammarAccess.getJobAccess().getCommaKeyword_3_2_2_2_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:2062:12: ( (lv_needs_22_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2063:13: (lv_needs_22_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2063:13: (lv_needs_22_0= ruleEString )
            	            	    // InternalMyDsl.g:2064:14: lv_needs_22_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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
            	            	    break loop49;
            	                }
            	            } while (true);

            	            otherlv_23=(Token)match(input,28,FOLLOW_35); 

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
            	    // InternalMyDsl.g:2094:4: ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2094:4: ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) )
            	    // InternalMyDsl.g:2095:5: {...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2095:100: ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) )
            	    // InternalMyDsl.g:2096:6: ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2099:9: ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) )
            	    // InternalMyDsl.g:2099:10: {...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2099:19: (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) )
            	    // InternalMyDsl.g:2099:20: otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) )
            	    {
            	    otherlv_24=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getJobAccess().getEnvironmentKeyword_3_3_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_37); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJobAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:2107:9: ( (lv_environment_26_0= ruleEnvironment ) )
            	    // InternalMyDsl.g:2108:10: (lv_environment_26_0= ruleEnvironment )
            	    {
            	    // InternalMyDsl.g:2108:10: (lv_environment_26_0= ruleEnvironment )
            	    // InternalMyDsl.g:2109:11: lv_environment_26_0= ruleEnvironment
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
            	    lv_environment_26_0=ruleEnvironment();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"environment",
            	    												lv_environment_26_0,
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
            	case 5 :
            	    // InternalMyDsl.g:2132:4: ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:2132:4: ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2133:5: {...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2133:100: ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2134:6: ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2137:9: ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2137:10: {...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2137:19: (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2137:20: otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )?
            	    {
            	    otherlv_27=(Token)match(input,39,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getJobAccess().getStepsKeyword_3_4_0());
            	    								
            	    otherlv_28=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_28, grammarAccess.getJobAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:2145:9: (this_BEG_BLOCK_29= RULE_BEG_BLOCK )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_BEG_BLOCK) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalMyDsl.g:2146:10: this_BEG_BLOCK_29= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_29=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_18); 

            	            										newLeafNode(this_BEG_BLOCK_29, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_4_2());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2151:9: ( (lv_steps_30_0= ruleStep ) )+
            	    int cnt52=0;
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==26) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2152:10: (lv_steps_30_0= ruleStep )
            	    	    {
            	    	    // InternalMyDsl.g:2152:10: (lv_steps_30_0= ruleStep )
            	    	    // InternalMyDsl.g:2153:11: lv_steps_30_0= ruleStep
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_3_4_3_0());
            	    	    										
            	    	    pushFollow(FOLLOW_38);
            	    	    lv_steps_30_0=ruleStep();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"steps",
            	    	    												lv_steps_30_0,
            	    	    												"pt.isep.yamldslgen.xtext.MyDsl.Step");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt52 >= 1 ) break loop52;
            	                EarlyExitException eee =
            	                    new EarlyExitException(52, input);
            	                throw eee;
            	        }
            	        cnt52++;
            	    } while (true);

            	    // InternalMyDsl.g:2170:9: (this_END_BLOCK_31= RULE_END_BLOCK )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_END_BLOCK) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalMyDsl.g:2171:10: this_END_BLOCK_31= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_31=(Token)match(input,RULE_END_BLOCK,FOLLOW_35); 

            	            										newLeafNode(this_END_BLOCK_31, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_4_4());
            	            									

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
            	case 6 :
            	    // InternalMyDsl.g:2182:4: ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2182:4: ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:2183:5: {...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:2183:100: ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2184:6: ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:2187:9: ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2187:10: {...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2187:19: (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2187:20: otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? )
            	    {
            	    otherlv_32=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_32, grammarAccess.getJobAccess().getPermissionsKeyword_3_5_0());
            	    								
            	    otherlv_33=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_33, grammarAccess.getJobAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:2195:9: ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2196:10: (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:2196:10: (this_BEG_BLOCK_34= RULE_BEG_BLOCK )?
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==RULE_BEG_BLOCK) ) {
            	        alt54=1;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // InternalMyDsl.g:2197:11: this_BEG_BLOCK_34= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_34=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_10); 

            	            											newLeafNode(this_BEG_BLOCK_34, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_5_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2202:10: ( (lv_permissions_35_0= ruleKeyValuePair ) )+
            	    int cnt55=0;
            	    loop55:
            	    do {
            	        int alt55=2;
            	        alt55 = dfa55.predict(input);
            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2203:11: (lv_permissions_35_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:2203:11: (lv_permissions_35_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:2204:12: lv_permissions_35_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getJobAccess().getPermissionsKeyValuePairParserRuleCall_3_5_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_39);
            	    	    lv_permissions_35_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"permissions",
            	    	    													lv_permissions_35_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt55 >= 1 ) break loop55;
            	                EarlyExitException eee =
            	                    new EarlyExitException(55, input);
            	                throw eee;
            	        }
            	        cnt55++;
            	    } while (true);

            	    // InternalMyDsl.g:2221:10: (this_END_BLOCK_36= RULE_END_BLOCK )?
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==RULE_END_BLOCK) ) {
            	        alt56=1;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // InternalMyDsl.g:2222:11: this_END_BLOCK_36= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_36=(Token)match(input,RULE_END_BLOCK,FOLLOW_35); 

            	            											newLeafNode(this_END_BLOCK_36, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_5_2_2());
            	            										

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
            	    break loop57;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:2241:3: (this_END_BLOCK_37= RULE_END_BLOCK )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_END_BLOCK) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2242:4: this_END_BLOCK_37= RULE_END_BLOCK
                    {
                    this_END_BLOCK_37=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_37, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

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
    // InternalMyDsl.g:2251:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalMyDsl.g:2251:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:2252:2: iv_ruleStep= ruleStep EOF
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
    // InternalMyDsl.g:2258:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_32= RULE_END_BLOCK )? ) ;
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
        Token this_BEG_BLOCK_24=null;
        Token this_END_BLOCK_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token this_BEG_BLOCK_29=null;
        Token this_END_BLOCK_31=null;
        Token this_END_BLOCK_32=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_uses_12_0 = null;

        AntlrDatatypeRuleToken lv_run_15_0 = null;

        AntlrDatatypeRuleToken lv_if_18_0 = null;

        AntlrDatatypeRuleToken lv_workingDirectory_21_0 = null;

        EObject lv_with_25_0 = null;

        EObject lv_env_30_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2264:2: ( ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_32= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2265:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_32= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2265:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_32= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2266:3: () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_32= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2266:3: ()
            // InternalMyDsl.g:2267:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            // InternalMyDsl.g:2277:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_BEG_BLOCK) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2278:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_41); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2283:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2284:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2284:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2285:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2288:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:2289:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2289:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop66:
            do {
                int alt66=9;
                alt66 = dfa66.predict(input);
                switch (alt66) {
            	case 1 :
            	    // InternalMyDsl.g:2290:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2290:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2291:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2291:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2292:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2295:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2295:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2295:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2295:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getStepAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:2303:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2304:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2304:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2305:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2328:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2328:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2329:5: {...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2329:101: ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2330:6: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2333:9: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2333:10: {...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2333:19: (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2333:20: otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStepAccess().getIdKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:2341:9: ( (lv_id_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2342:10: (lv_id_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2342:10: (lv_id_9_0= ruleEString )
            	    // InternalMyDsl.g:2343:11: lv_id_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIdEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2366:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2366:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2367:5: {...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2367:101: ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2368:6: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2371:9: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2371:10: {...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2371:19: (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2371:20: otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,40,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStepAccess().getUsesKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStepAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:2379:9: ( (lv_uses_12_0= ruleEString ) )
            	    // InternalMyDsl.g:2380:10: (lv_uses_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2380:10: (lv_uses_12_0= ruleEString )
            	    // InternalMyDsl.g:2381:11: lv_uses_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getUsesEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2404:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2404:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2405:5: {...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2405:101: ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2406:6: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2409:9: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2409:10: {...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2409:19: (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2409:20: otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStepAccess().getRunKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getStepAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:2417:9: ( (lv_run_15_0= ruleEString ) )
            	    // InternalMyDsl.g:2418:10: (lv_run_15_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2418:10: (lv_run_15_0= ruleEString )
            	    // InternalMyDsl.g:2419:11: lv_run_15_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2442:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2442:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2443:5: {...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2443:101: ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2444:6: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2447:9: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2447:10: {...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2447:19: (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2447:20: otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getStepAccess().getIfKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getStepAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:2455:9: ( (lv_if_18_0= ruleEString ) )
            	    // InternalMyDsl.g:2456:10: (lv_if_18_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2456:10: (lv_if_18_0= ruleEString )
            	    // InternalMyDsl.g:2457:11: lv_if_18_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIfEStringParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2480:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2480:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2481:5: {...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:2481:101: ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2482:6: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:2485:9: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2485:10: {...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2485:19: (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2485:20: otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getStepAccess().getWorkingDirectoryKeyword_3_5_0());
            	    								
            	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_20, grammarAccess.getStepAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:2493:9: ( (lv_workingDirectory_21_0= ruleEString ) )
            	    // InternalMyDsl.g:2494:10: (lv_workingDirectory_21_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2494:10: (lv_workingDirectory_21_0= ruleEString )
            	    // InternalMyDsl.g:2495:11: lv_workingDirectory_21_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getWorkingDirectoryEStringParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2518:4: ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2518:4: ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:2519:5: {...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:2519:101: ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2520:6: ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:2523:9: ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2523:10: {...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2523:19: (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2523:20: otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? )
            	    {
            	    otherlv_22=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getStepAccess().getWithKeyword_3_6_0());
            	    								
            	    otherlv_23=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_23, grammarAccess.getStepAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:2531:9: ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2532:10: (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:2532:10: (this_BEG_BLOCK_24= RULE_BEG_BLOCK )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==RULE_BEG_BLOCK) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalMyDsl.g:2533:11: this_BEG_BLOCK_24= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_24=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_10); 

            	            											newLeafNode(this_BEG_BLOCK_24, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_6_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2538:10: ( (lv_with_25_0= ruleKeyValuePair ) )+
            	    int cnt61=0;
            	    loop61:
            	    do {
            	        int alt61=2;
            	        alt61 = dfa61.predict(input);
            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2539:11: (lv_with_25_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:2539:11: (lv_with_25_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:2540:12: lv_with_25_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getWithKeyValuePairParserRuleCall_3_6_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_42);
            	    	    lv_with_25_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getStepRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"with",
            	    	    													lv_with_25_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

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

            	    // InternalMyDsl.g:2557:10: (this_END_BLOCK_26= RULE_END_BLOCK )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==RULE_END_BLOCK) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalMyDsl.g:2558:11: this_END_BLOCK_26= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_26=(Token)match(input,RULE_END_BLOCK,FOLLOW_41); 

            	            											newLeafNode(this_END_BLOCK_26, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_3_6_2_2());
            	            										

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
            	case 8 :
            	    // InternalMyDsl.g:2570:4: ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2570:4: ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:2571:5: {...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:2571:101: ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2572:6: ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:2575:9: ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2575:10: {...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2575:19: (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2575:20: otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? )
            	    {
            	    otherlv_27=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getStepAccess().getEnvKeyword_3_7_0());
            	    								
            	    otherlv_28=(Token)match(input,16,FOLLOW_10); 

            	    									newLeafNode(otherlv_28, grammarAccess.getStepAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:2583:9: ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2584:10: (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:2584:10: (this_BEG_BLOCK_29= RULE_BEG_BLOCK )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==RULE_BEG_BLOCK) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalMyDsl.g:2585:11: this_BEG_BLOCK_29= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_29=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_10); 

            	            											newLeafNode(this_BEG_BLOCK_29, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_7_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2590:10: ( (lv_env_30_0= ruleKeyValuePair ) )+
            	    int cnt64=0;
            	    loop64:
            	    do {
            	        int alt64=2;
            	        alt64 = dfa64.predict(input);
            	        switch (alt64) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2591:11: (lv_env_30_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:2591:11: (lv_env_30_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:2592:12: lv_env_30_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getEnvKeyValuePairParserRuleCall_3_7_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_42);
            	    	    lv_env_30_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getStepRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"env",
            	    	    													lv_env_30_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt64 >= 1 ) break loop64;
            	                EarlyExitException eee =
            	                    new EarlyExitException(64, input);
            	                throw eee;
            	        }
            	        cnt64++;
            	    } while (true);

            	    // InternalMyDsl.g:2609:10: (this_END_BLOCK_31= RULE_END_BLOCK )?
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_END_BLOCK) ) {
            	        alt65=1;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalMyDsl.g:2610:11: this_END_BLOCK_31= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_31=(Token)match(input,RULE_END_BLOCK,FOLLOW_41); 

            	            											newLeafNode(this_END_BLOCK_31, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_3_7_2_2());
            	            										

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
            	    break loop66;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:2629:3: (this_END_BLOCK_32= RULE_END_BLOCK )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_END_BLOCK) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMyDsl.g:2630:4: this_END_BLOCK_32= RULE_END_BLOCK
                    {
                    this_END_BLOCK_32=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_32, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

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


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:2639:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:2639:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:2640:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalMyDsl.g:2646:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2652:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:2653:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:2653:2: (kw= 'true' | kw= 'false' )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==22) ) {
                alt68=1;
            }
            else if ( (LA68_0==23) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:2654:3: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2660:3: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

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
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA66 dfa66 = new DFA66(this);
    protected DFA61 dfa61 = new DFA61(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String dfa_1s = "\110\uffff";
    static final String dfa_2s = "\1\1\10\uffff\1\1\14\uffff\2\25\16\57\11\70\1\uffff\5\70\1\1\3\uffff\5\107\12\uffff";
    static final String dfa_3s = "\1\5\1\uffff\5\20\1\uffff\1\6\4\4\11\uffff\2\5\2\4\25\5\1\uffff\5\5\1\4\2\6\1\uffff\5\5\12\uffff";
    static final String dfa_4s = "\1\52\1\uffff\5\20\1\uffff\1\31\1\54\1\31\2\52\11\uffff\31\52\1\uffff\5\52\1\61\2\31\1\uffff\5\52\12\uffff";
    static final String dfa_5s = "\1\uffff\1\2\5\uffff\1\1\5\uffff\11\1\31\uffff\1\1\10\uffff\1\1\5\uffff\12\1";
    static final String dfa_6s = "\110\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\3\7\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\13\uffff\12\7",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15\1\16\1\21\1\22\1\23\13\uffff\1\24\1\25\1\17\1\20",
            "\2\1\5\25\4\uffff\1\1\1\uffff\5\1\4\25\7\uffff\2\1\10\uffff\2\1",
            "\1\1\1\uffff\1\26\1\27\1\32\1\33\1\34\13\uffff\1\35\1\36\1\30\1\31",
            "\1\1\1\uffff\2\25\1\40\1\37\1\41\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\25\7\uffff\12\1",
            "\1\1\1\uffff\2\25\1\43\1\42\1\44\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\25\7\uffff\12\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\12\25",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\12\25",
            "\1\45\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\7\57\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\57",
            "\1\45\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\7\57\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\65\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\65\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\65\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\65\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\65\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\66\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\66\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\66\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\67\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\67\5\57\13\uffff\12\57",
            "\1\57\2\uffff\1\57\1\7\1\57\4\uffff\1\57\1\67\5\57\13\uffff\12\57",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\7\57\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\57",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\7\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\7\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\7\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\64\1\52\1\47\1\46\1\50\1\51\1\63\3\uffff\1\70\1\57\5\70\4\uffff\1\53\1\54\1\55\1\56\1\60\1\61\1\62\12\70",
            "\1\70\2\uffff\1\70\1\7\1\70\4\uffff\1\70\1\1\5\70\13\uffff\12\70",
            "\4\1\1\71\1\72\1\73\4\uffff\1\1\1\uffff\5\1\1\74\1\75\2\1\13\uffff\3\1\11\uffff\1\1",
            "\2\1\1\76\1\77\1\100\13\uffff\1\101\1\102\2\1",
            "\2\1\1\103\1\104\1\105\13\uffff\1\106\1\107\2\1",
            "",
            "\1\107\2\uffff\1\107\1\7\1\107\4\uffff\1\107\1\65\5\107\13\uffff\12\107",
            "\1\107\2\uffff\1\107\1\7\1\107\4\uffff\1\107\1\65\5\107\13\uffff\12\107",
            "\1\107\2\uffff\1\107\1\7\1\107\4\uffff\1\107\1\65\5\107\13\uffff\12\107",
            "\1\107\2\uffff\1\107\1\7\1\107\4\uffff\1\107\1\65\5\107\13\uffff\12\107",
            "\1\107\2\uffff\1\107\1\7\1\107\4\uffff\1\107\1\65\5\107\13\uffff\12\107",
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
            return "()+ loopback of 269:9: ( (lv_permissions_18_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()+ loopback of 321:9: ( (lv_env_23_0= ruleKeyValuePair ) )+";
        }
    }
    static final String dfa_8s = "\116\uffff";
    static final String dfa_9s = "\1\1\7\uffff\1\26\30\uffff\1\1\1\uffff\1\57\5\uffff\1\57\1\1\5\uffff\1\57\17\uffff\2\57\10\uffff\1\57\3\uffff";
    static final String dfa_10s = "\1\5\7\uffff\1\5\11\uffff\2\4\3\uffff\2\20\12\5\1\4\4\5\1\20\1\4\1\5\5\uffff\13\5\5\20\2\4\6\5\2\20\1\4\3\5";
    static final String dfa_11s = "\1\64\7\uffff\1\64\11\uffff\2\40\3\uffff\2\36\10\40\1\61\1\40\1\61\4\40\1\36\1\61\1\54\5\uffff\1\36\12\40\5\36\2\61\6\40\2\36\1\61\3\40";
    static final String dfa_12s = "\1\uffff\1\17\1\3\1\1\1\4\1\5\1\2\1\6\1\uffff\1\10\1\12\1\7\1\11\1\14\1\15\1\16\2\13\2\uffff\3\13\24\uffff\5\13\36\uffff";
    static final String dfa_13s = "\116\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\5\1\6\1\3\1\2\1\4\1\17\3\uffff\1\1\1\12\11\1\1\7\1\13\1\11\1\14\1\10\1\15\1\16\14\1\1\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\20\1\21\1\24\1\25\2\26\3\uffff\7\26\1\27\1\30\1\22\1\23\23\26\1\uffff\7\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\31\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\31\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "",
            "",
            "",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\52\1\57\1\54\1\53\1\55\1\56\1\47\3\uffff\1\1\1\43\11\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46\2\uffff\5\1\11\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\47\3\uffff\1\57\1\43\11\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\11\uffff\1\57",
            "\1\50\1\72\1\67\1\66\1\70\1\71\1\47\4\uffff\1\43\5\uffff\4\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\13\uffff\1\1\1\uffff\1\1",
            "\4\57\1\73\1\74\1\75\4\uffff\1\57\1\uffff\5\57\1\76\1\77\2\57\13\uffff\3\57\11\uffff\1\57",
            "\6\1\4\uffff\1\1\1\57\11\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\10\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\6\57\4\uffff\13\57\2\uffff\1\1\1\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\61\1\62\1\102\1\103\1\104\1\47\3\uffff\1\57\1\43\11\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\11\uffff\1\57",
            "\1\57\1\60\1\61\1\62\1\105\1\106\1\107\1\47\3\uffff\1\57\1\43\5\57\1\110\1\111\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\11\uffff\1\57",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\61\1\62\1\113\1\114\1\115\1\47\3\uffff\1\57\1\43\5\57\1\76\1\77\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\11\uffff\1\57",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 557:3: (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )*";
        }
    }
    static final String dfa_15s = "\17\uffff";
    static final String dfa_16s = "\1\1\16\uffff";
    static final String dfa_17s = "\1\5\1\uffff\1\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_18s = "\1\61\1\uffff\1\20\1\uffff\1\31\11\0\1\uffff";
    static final String dfa_19s = "\1\uffff\1\3\1\uffff\1\2\12\uffff\1\1";
    static final String dfa_20s = "\1\11\4\uffff\1\6\1\1\1\4\1\2\1\10\1\5\1\0\1\7\1\3\1\uffff}>";
    static final String[] dfa_21s = {
            "\6\1\4\uffff\1\2\1\uffff\11\1\13\uffff\3\1\10\uffff\1\3\1\1",
            "",
            "\1\4",
            "",
            "\1\5\1\6\1\11\1\12\1\13\13\uffff\1\14\1\15\1\7\1\10",
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

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 1730:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_11 = input.LA(1);

                         
                        int index43_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_11);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA43_6 = input.LA(1);

                         
                        int index43_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_6);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA43_8 = input.LA(1);

                         
                        int index43_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_8);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA43_13 = input.LA(1);

                         
                        int index43_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA43_7 = input.LA(1);

                         
                        int index43_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_7);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA43_10 = input.LA(1);

                         
                        int index43_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA43_5 = input.LA(1);

                         
                        int index43_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_5);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA43_12 = input.LA(1);

                         
                        int index43_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_12);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA43_9 = input.LA(1);

                         
                        int index43_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA43_0 = input.LA(1);

                         
                        int index43_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA43_0==EOF||(LA43_0>=RULE_END_BLOCK && LA43_0<=RULE_INT)||(LA43_0>=17 && LA43_0<=25)||(LA43_0>=37 && LA43_0<=39)||LA43_0==49) ) {s = 1;}

                        else if ( (LA43_0==15) ) {s = 2;}

                        else if ( LA43_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                         
                        input.seek(index43_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\62\uffff";
    static final String dfa_23s = "\1\1\61\uffff";
    static final String dfa_24s = "\1\5\1\uffff\2\20\4\uffff\1\6\1\4\11\0\1\10\22\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_25s = "\1\61\1\uffff\2\20\4\uffff\1\31\1\52\11\0\1\52\22\20\1\uffff\1\31\11\0\1\uffff";
    static final String dfa_26s = "\1\uffff\1\7\2\uffff\1\2\1\3\1\4\1\5\36\uffff\1\1\12\uffff\1\6";
    static final String dfa_27s = "\1\13\11\uffff\1\15\1\22\1\0\1\1\1\14\1\21\1\3\1\5\1\10\25\uffff\1\6\1\17\1\7\1\12\1\20\1\2\1\4\1\11\1\16\1\uffff}>";
    static final String[] dfa_28s = {
            "\6\1\4\uffff\1\2\1\uffff\3\1\1\3\5\1\13\uffff\1\4\1\5\1\7\11\uffff\1\6",
            "",
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\12\1\13\1\16\1\17\1\20\13\uffff\1\21\1\22\1\14\1\15",
            "\1\23\3\uffff\1\25\1\24\1\26\4\uffff\1\27\1\uffff\1\30\1\uffff\1\31\1\32\1\33\13\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\25\1\24\1\26\4\uffff\1\27\1\uffff\1\30\1\uffff\1\31\1\32\1\33\13\uffff\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "\1\47",
            "",
            "\1\50\1\51\1\54\1\55\1\56\13\uffff\1\57\1\60\1\52\1\53",
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

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 1874:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (this_BEG_BLOCK_34= RULE_BEG_BLOCK )? ( (lv_permissions_35_0= ruleKeyValuePair ) )+ (this_END_BLOCK_36= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_12 = input.LA(1);

                         
                        int index57_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_13 = input.LA(1);

                         
                        int index57_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_45 = input.LA(1);

                         
                        int index57_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_45);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_16 = input.LA(1);

                         
                        int index57_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA57_46 = input.LA(1);

                         
                        int index57_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_46);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA57_17 = input.LA(1);

                         
                        int index57_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA57_40 = input.LA(1);

                         
                        int index57_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_40);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA57_42 = input.LA(1);

                         
                        int index57_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_42);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA57_18 = input.LA(1);

                         
                        int index57_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_18);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA57_47 = input.LA(1);

                         
                        int index57_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_47);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA57_43 = input.LA(1);

                         
                        int index57_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_43);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0==EOF||(LA57_0>=RULE_END_BLOCK && LA57_0<=RULE_INT)||(LA57_0>=17 && LA57_0<=19)||(LA57_0>=21 && LA57_0<=25)) ) {s = 1;}

                        else if ( (LA57_0==15) ) {s = 2;}

                        else if ( (LA57_0==20) ) {s = 3;}

                        else if ( LA57_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                        else if ( LA57_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {s = 5;}

                        else if ( LA57_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {s = 6;}

                        else if ( LA57_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {s = 7;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA57_14 = input.LA(1);

                         
                        int index57_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_14);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA57_10 = input.LA(1);

                         
                        int index57_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_10);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA57_48 = input.LA(1);

                         
                        int index57_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_48);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA57_41 = input.LA(1);

                         
                        int index57_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_41);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA57_44 = input.LA(1);

                         
                        int index57_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_44);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA57_15 = input.LA(1);

                         
                        int index57_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_15);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA57_11 = input.LA(1);

                         
                        int index57_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index57_11);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\150\uffff";
    static final String dfa_30s = "\1\1\16\uffff\1\1\3\uffff\1\1\14\uffff\2\105\22\120\22\uffff\1\120\5\uffff\4\120\1\uffff\5\120\1\1\2\uffff\5\147\12\uffff";
    static final String dfa_31s = "\1\5\1\uffff\13\20\1\uffff\1\6\5\4\1\6\2\4\11\uffff\2\5\2\4\20\5\22\uffff\1\5\5\uffff\4\5\1\uffff\5\5\1\4\2\6\5\5\12\uffff";
    static final String dfa_32s = "\1\61\1\uffff\13\20\1\uffff\1\31\1\54\1\31\2\52\1\61\1\31\1\33\1\32\11\uffff\24\61\22\uffff\1\61\5\uffff\4\61\1\uffff\6\61\2\31\5\61\12\uffff";
    static final String dfa_33s = "\1\uffff\1\2\13\uffff\1\1\11\uffff\11\1\24\uffff\22\1\1\uffff\5\1\4\uffff\1\1\15\uffff\12\1";
    static final String dfa_34s = "\150\uffff}>";
    static final String[] dfa_35s = {
            "\3\1\1\7\1\10\1\11\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\4\1\7\uffff\4\15\1\12\1\13\1\14\3\15\6\uffff\1\1",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "",
            "\1\27\1\30\1\33\1\34\1\35\13\uffff\1\36\1\37\1\31\1\32",
            "\2\1\5\37\4\uffff\1\1\1\uffff\5\1\4\37\7\uffff\2\1\10\uffff\2\1",
            "\1\1\1\uffff\1\40\1\41\1\44\1\45\1\46\13\uffff\1\47\1\50\1\42\1\43",
            "\1\1\1\uffff\2\37\1\52\1\51\1\53\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\37\7\uffff\12\1",
            "\1\1\1\uffff\2\37\1\55\1\54\1\56\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\37\7\uffff\12\1",
            "\2\1\1\40\1\41\1\57\1\60\1\61\4\uffff\1\1\1\uffff\5\1\1\62\1\63\1\42\1\43\13\uffff\3\1\11\uffff\1\1",
            "\1\64\1\65\1\70\1\71\1\72\13\uffff\1\73\1\74\1\66\1\67",
            "\1\1\1\uffff\1\75\1\76\1\101\1\102\1\103\13\uffff\1\104\1\105\1\77\1\100\1\uffff\1\1",
            "\1\1\1\uffff\5\105\13\uffff\4\105\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\105\4\uffff\1\105\1\1\11\105\7\uffff\1\15\11\105\6\uffff\1\105",
            "\6\105\4\uffff\1\105\1\1\11\105\7\uffff\1\15\11\105\6\uffff\1\105",
            "\1\106\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\1\106\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\127\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\127\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\127\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\130\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\130\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\130\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\126\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
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
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "",
            "",
            "",
            "",
            "",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\1\125\1\113\1\110\1\107\1\111\1\112\1\124\3\uffff\13\120\1\114\1\115\1\116\1\117\1\121\1\122\1\123\1\15\11\120\6\uffff\1\120",
            "\6\120\4\uffff\1\120\1\1\11\120\7\uffff\1\15\11\120\6\uffff\1\120",
            "\4\1\1\131\1\132\1\133\4\uffff\1\1\1\uffff\5\1\1\134\1\135\2\1\13\uffff\3\1\11\uffff\1\1",
            "\2\1\1\136\1\137\1\140\13\uffff\1\141\1\142\2\1",
            "\2\1\1\143\1\144\1\145\13\uffff\1\146\1\147\2\1",
            "\6\147\4\uffff\1\147\1\126\11\147\7\uffff\1\15\11\147\6\uffff\1\147",
            "\6\147\4\uffff\1\147\1\126\11\147\7\uffff\1\15\11\147\6\uffff\1\147",
            "\6\147\4\uffff\1\147\1\126\11\147\7\uffff\1\15\11\147\6\uffff\1\147",
            "\6\147\4\uffff\1\147\1\126\11\147\7\uffff\1\15\11\147\6\uffff\1\147",
            "\6\147\4\uffff\1\147\1\126\11\147\7\uffff\1\15\11\147\6\uffff\1\147",
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

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()+ loopback of 2202:10: ( (lv_permissions_35_0= ruleKeyValuePair ) )+";
        }
    }
    static final String dfa_36s = "\64\uffff";
    static final String dfa_37s = "\1\1\63\uffff";
    static final String dfa_38s = "\1\5\1\uffff\2\20\6\uffff\1\6\1\4\11\0\1\10\22\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_39s = "\1\64\1\uffff\2\20\6\uffff\1\31\1\52\11\0\1\52\22\20\1\uffff\1\31\11\0\1\uffff";
    static final String dfa_40s = "\1\uffff\1\11\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\36\uffff\1\1\12\uffff\1\10";
    static final String dfa_41s = "\1\12\13\uffff\1\17\1\3\1\2\1\7\1\10\1\20\1\1\1\13\1\16\25\uffff\1\21\1\4\1\5\1\11\1\15\1\22\1\0\1\6\1\14\1\uffff}>";
    static final String[] dfa_42s = {
            "\6\1\4\uffff\1\2\1\uffff\4\1\1\3\5\1\12\uffff\3\1\1\5\1\6\1\11\6\uffff\1\1\1\4\1\7\1\10",
            "",
            "\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\1\15\1\20\1\21\1\22\13\uffff\1\23\1\24\1\16\1\17",
            "\1\25\3\uffff\1\27\1\26\1\30\4\uffff\1\31\1\uffff\1\32\1\uffff\1\33\1\34\1\35\13\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\27\1\26\1\30\4\uffff\1\31\1\uffff\1\32\1\uffff\1\33\1\34\1\35\13\uffff\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "\1\51",
            "",
            "\1\52\1\53\1\56\1\57\1\60\13\uffff\1\61\1\62\1\54\1\55",
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

    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA66 extends DFA {

        public DFA66(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 66;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 2289:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'with' otherlv_23= ':' ( (this_BEG_BLOCK_24= RULE_BEG_BLOCK )? ( (lv_with_25_0= ruleKeyValuePair ) )+ (this_END_BLOCK_26= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'env' otherlv_28= ':' ( (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_env_30_0= ruleKeyValuePair ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA66_48 = input.LA(1);

                         
                        int index66_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_48);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA66_18 = input.LA(1);

                         
                        int index66_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA66_14 = input.LA(1);

                         
                        int index66_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_14);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA66_13 = input.LA(1);

                         
                        int index66_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA66_43 = input.LA(1);

                         
                        int index66_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_43);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA66_44 = input.LA(1);

                         
                        int index66_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_44);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA66_49 = input.LA(1);

                         
                        int index66_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_49);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA66_15 = input.LA(1);

                         
                        int index66_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_15);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA66_16 = input.LA(1);

                         
                        int index66_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_16);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA66_45 = input.LA(1);

                         
                        int index66_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_45);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA66_0 = input.LA(1);

                         
                        int index66_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA66_0==EOF||(LA66_0>=RULE_END_BLOCK && LA66_0<=RULE_INT)||(LA66_0>=17 && LA66_0<=20)||(LA66_0>=22 && LA66_0<=26)||(LA66_0>=37 && LA66_0<=39)||LA66_0==49) ) {s = 1;}

                        else if ( (LA66_0==15) ) {s = 2;}

                        else if ( (LA66_0==21) ) {s = 3;}

                        else if ( LA66_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                        else if ( LA66_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 5;}

                        else if ( LA66_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {s = 6;}

                        else if ( LA66_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 7;}

                        else if ( LA66_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {s = 8;}

                        else if ( LA66_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {s = 9;}

                         
                        input.seek(index66_0);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA66_19 = input.LA(1);

                         
                        int index66_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_19);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA66_50 = input.LA(1);

                         
                        int index66_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_50);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA66_46 = input.LA(1);

                         
                        int index66_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_46);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA66_20 = input.LA(1);

                         
                        int index66_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_20);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA66_12 = input.LA(1);

                         
                        int index66_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_12);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA66_17 = input.LA(1);

                         
                        int index66_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA66_42 = input.LA(1);

                         
                        int index66_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_42);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA66_47 = input.LA(1);

                         
                        int index66_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 51;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index66_47);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 66, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_43s = "\u008a\uffff";
    static final String dfa_44s = "\1\1\21\uffff\1\1\3\uffff\1\1\17\uffff\2\135\22\153\44\uffff\4\153\5\uffff\4\153\1\uffff\5\153\1\1\3\uffff\6\u0089\17\uffff";
    static final String dfa_45s = "\1\5\1\uffff\16\20\1\uffff\1\6\5\4\1\6\2\4\2\6\1\4\11\uffff\2\5\2\4\20\5\44\uffff\4\5\5\uffff\1\4\3\5\1\uffff\5\5\1\4\3\6\6\5\17\uffff";
    static final String dfa_46s = "\1\64\1\uffff\16\20\1\uffff\1\31\1\54\1\31\2\52\1\61\1\31\1\33\1\32\2\31\1\52\11\uffff\24\64\44\uffff\4\64\5\uffff\4\64\1\uffff\5\64\1\61\3\31\6\64\17\uffff";
    static final String dfa_47s = "\1\uffff\1\2\16\uffff\1\1\14\uffff\11\1\24\uffff\44\1\4\uffff\5\1\4\uffff\1\1\17\uffff\17\1";
    static final String dfa_48s = "\u008a\uffff}>";
    static final String[] dfa_49s = {
            "\3\1\1\7\1\10\1\11\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\5\1\6\uffff\4\20\1\12\1\13\1\14\1\15\1\16\1\17\6\uffff\4\1",
            "",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\26",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "",
            "\1\35\1\36\1\41\1\42\1\43\13\uffff\1\44\1\45\1\37\1\40",
            "\2\1\5\45\4\uffff\1\1\1\uffff\5\1\4\45\7\uffff\2\1\10\uffff\2\1",
            "\1\1\1\uffff\1\46\1\47\1\52\1\53\1\54\13\uffff\1\55\1\56\1\50\1\51",
            "\1\1\1\uffff\2\45\1\60\1\57\1\61\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\45\7\uffff\12\1",
            "\1\1\1\uffff\2\45\1\63\1\62\1\64\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\45\7\uffff\12\1",
            "\2\1\1\46\1\47\1\65\1\66\1\67\4\uffff\1\1\1\uffff\5\1\1\70\1\71\1\50\1\51\13\uffff\3\1\11\uffff\1\1",
            "\1\72\1\73\1\76\1\77\1\100\13\uffff\1\101\1\102\1\74\1\75",
            "\1\1\1\uffff\1\103\1\104\1\107\1\110\1\111\13\uffff\1\112\1\113\1\105\1\106\1\uffff\1\1",
            "\1\1\1\uffff\5\113\13\uffff\4\113\1\1",
            "\1\114\1\115\1\120\1\121\1\122\13\uffff\1\123\1\124\1\116\1\117",
            "\1\125\1\126\1\131\1\132\1\133\13\uffff\1\134\1\135\1\127\1\130",
            "\1\1\1\uffff\2\135\1\136\1\137\1\140\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\135\7\uffff\12\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\135\4\uffff\1\135\1\1\12\135\6\uffff\1\20\11\135\6\uffff\4\135",
            "\6\135\4\uffff\1\135\1\1\12\135\6\uffff\1\20\11\135\6\uffff\4\135",
            "\1\141\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\1\141\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\162\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\162\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\162\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\163\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\163\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\163\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\161\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
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
            "\6\153\4\uffff\1\153\1\164\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\164\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\164\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "",
            "",
            "",
            "",
            "",
            "\1\153\1\165\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\1\160\1\146\1\143\1\142\1\144\1\145\1\157\3\uffff\13\153\1\147\1\150\1\151\1\152\1\154\1\155\1\156\1\20\11\153\6\uffff\4\153",
            "\6\153\4\uffff\1\153\1\1\12\153\6\uffff\1\20\11\153\6\uffff\4\153",
            "\4\1\1\166\1\167\1\170\4\uffff\1\1\1\uffff\5\1\1\171\1\172\2\1\13\uffff\3\1\11\uffff\1\1",
            "\2\1\1\173\1\174\1\175\13\uffff\1\176\1\177\2\1",
            "\2\1\1\u0080\1\u0081\1\u0082\13\uffff\1\u0083\1\u0084\2\1",
            "\2\1\1\u0085\1\u0086\1\u0087\13\uffff\1\u0088\1\u0089\2\1",
            "\6\u0089\4\uffff\1\u0089\1\1\12\u0089\6\uffff\1\20\11\u0089\6\uffff\4\u0089",
            "\6\u0089\4\uffff\1\u0089\1\161\12\u0089\6\uffff\1\20\11\u0089\6\uffff\4\u0089",
            "\6\u0089\4\uffff\1\u0089\1\161\12\u0089\6\uffff\1\20\11\u0089\6\uffff\4\u0089",
            "\6\u0089\4\uffff\1\u0089\1\161\12\u0089\6\uffff\1\20\11\u0089\6\uffff\4\u0089",
            "\6\u0089\4\uffff\1\u0089\1\161\12\u0089\6\uffff\1\20\11\u0089\6\uffff\4\u0089",
            "\6\u0089\4\uffff\1\u0089\1\161\12\u0089\6\uffff\1\20\11\u0089\6\uffff\4\u0089",
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
            ""
    };

    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final char[] dfa_45 = DFA.unpackEncodedStringToUnsignedChars(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[][] dfa_49 = unpackEncodedStringArray(dfa_49s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_43;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()+ loopback of 2538:10: ( (lv_with_25_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_43;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()+ loopback of 2590:10: ( (lv_env_30_0= ruleKeyValuePair ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003C007C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003E8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00001806003E8030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000C000003E8030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C007D0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003FE87F2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000007FE003A8710L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000007FE003E8732L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00700L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000001FC010FF2L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001FC010FE2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000180600000022L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000180604000032L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000180603C007E2L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000C00000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000008022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000200E000108032L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000200E000108022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000BC007D0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000300E000108030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000200E004108032L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000207FE003A8732L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x001C070000208032L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x001C070000208022L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x001C07FE003A8732L});

}

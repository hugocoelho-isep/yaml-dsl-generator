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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_GH_EXPRESSION", "RULE_YAML_SCALAR", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'name'", "':'", "'on'", "'concurrency'", "'jobs'", "'permissions'", "'env'", "'true'", "'false'", "'>'", "'|'", "'-'", "'['", "']'", "';'", "','", "'{'", "'}'", "'push'", "'pull_request'", "'branches'", "'tags'", "'runs-on'", "'needs'", "'steps'", "'uses'", "'run'", "'with'", "'shell'", "'contents'", "'security-events'", "'actions'", "'pages'", "'id-token'", "'types'", "'pull-requests'", "'if'", "'continue-on-error'", "'issues'", "'strategy'", "'fail-fast'", "'matrix'", "'os'", "'build-type'", "'c-compiler'", "'cpp-compiler'", "'otp'", "'elixir'", "'include'", "'exclude'", "'workflow_call'", "'pull_request_target'", "'secrets'", "'required'", "'packages'", "'schedule'", "'workflow_dispatch'", "'cron'", "'group'", "'cancel-in-progress'", "'url'", "'environment'", "'id'", "'working-directory'"
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
    // InternalMyDsl.g:71:1: ruleGithubActions returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) ) ;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token this_BEG_BLOCK_20=null;
        Token this_END_BLOCK_22=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_on_6_0 = null;

        EObject lv_concurrency_9_0 = null;

        EObject lv_jobs_13_0 = null;

        EObject lv_permissions_17_0 = null;

        EObject lv_env_21_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'concurrency' otherlv_8= ':' ( (lv_concurrency_9_0= ruleConcurrency ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'jobs' otherlv_11= ':' (this_BEG_BLOCK_12= RULE_BEG_BLOCK )? ( (lv_jobs_13_0= ruleJob ) )+ (this_END_BLOCK_14= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=7;
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
            	    // InternalMyDsl.g:249:3: ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:249:3: ({...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:250:4: {...}? => ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalMyDsl.g:250:107: ( ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:251:5: ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalMyDsl.g:254:8: ({...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:254:9: {...}? => (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:254:18: (otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:254:19: otherlv_15= 'permissions' otherlv_16= ':' ( (lv_permissions_17_0= rulePermissions ) )
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_3); 

            	    								newLeafNode(otherlv_15, grammarAccess.getGithubActionsAccess().getPermissionsKeyword_4_0());
            	    							
            	    otherlv_16=(Token)match(input,16,FOLLOW_10); 

            	    								newLeafNode(otherlv_16, grammarAccess.getGithubActionsAccess().getColonKeyword_4_1());
            	    							
            	    // InternalMyDsl.g:262:8: ( (lv_permissions_17_0= rulePermissions ) )
            	    // InternalMyDsl.g:263:9: (lv_permissions_17_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:263:9: (lv_permissions_17_0= rulePermissions )
            	    // InternalMyDsl.g:264:10: lv_permissions_17_0= rulePermissions
            	    {

            	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getPermissionsPermissionsParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_permissions_17_0=rulePermissions();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    										}
            	    										set(
            	    											current,
            	    											"permissions",
            	    											lv_permissions_17_0,
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
            	case 6 :
            	    // InternalMyDsl.g:287:3: ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:287:3: ({...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:288:4: {...}? => ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalMyDsl.g:288:107: ( ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:289:5: ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalMyDsl.g:292:8: ({...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:292:9: {...}? => (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:292:18: (otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:292:19: otherlv_18= 'env' otherlv_19= ':' ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? )
            	    {
            	    otherlv_18=(Token)match(input,21,FOLLOW_3); 

            	    								newLeafNode(otherlv_18, grammarAccess.getGithubActionsAccess().getEnvKeyword_5_0());
            	    							
            	    otherlv_19=(Token)match(input,16,FOLLOW_11); 

            	    								newLeafNode(otherlv_19, grammarAccess.getGithubActionsAccess().getColonKeyword_5_1());
            	    							
            	    // InternalMyDsl.g:300:8: ( (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:301:9: (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_env_21_0= ruleKeyValuePair ) )+ (this_END_BLOCK_22= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:301:9: (this_BEG_BLOCK_20= RULE_BEG_BLOCK )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==RULE_BEG_BLOCK) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDsl.g:302:10: this_BEG_BLOCK_20= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            	            										newLeafNode(this_BEG_BLOCK_20, grammarAccess.getGithubActionsAccess().getBEG_BLOCKTerminalRuleCall_5_2_0());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:307:9: ( (lv_env_21_0= ruleKeyValuePair ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        alt5 = dfa5.predict(input);
            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:308:10: (lv_env_21_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:308:10: (lv_env_21_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:309:11: lv_env_21_0= ruleKeyValuePair
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getGithubActionsAccess().getEnvKeyValuePairParserRuleCall_5_2_1_0());
            	    	    										
            	    	    pushFollow(FOLLOW_12);
            	    	    lv_env_21_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"env",
            	    	    												lv_env_21_0,
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

            	    // InternalMyDsl.g:326:9: (this_END_BLOCK_22= RULE_END_BLOCK )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==RULE_END_BLOCK) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMyDsl.g:327:10: this_END_BLOCK_22= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	            										newLeafNode(this_END_BLOCK_22, grammarAccess.getGithubActionsAccess().getEND_BLOCKTerminalRuleCall_5_2_2());
            	            									

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
    // InternalMyDsl.g:350:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:350:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:351:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:357:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_GH_EXPRESSION_1=null;
        AntlrDatatypeRuleToken this_BlockString_2 = null;

        AntlrDatatypeRuleToken this_ScalarSequence_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:363:2: ( (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence ) )
            // InternalMyDsl.g:364:2: (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence )
            {
            // InternalMyDsl.g:364:2: (this_STRING_0= RULE_STRING | this_GH_EXPRESSION_1= RULE_GH_EXPRESSION | this_BlockString_2= ruleBlockString | this_ScalarSequence_3= ruleScalarSequence )
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
            case 24:
            case 25:
                {
                alt8=3;
                }
                break;
            case RULE_YAML_SCALAR:
            case RULE_ID:
            case RULE_INT:
            case 22:
            case 23:
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
                    // InternalMyDsl.g:365:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:373:3: this_GH_EXPRESSION_1= RULE_GH_EXPRESSION
                    {
                    this_GH_EXPRESSION_1=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_GH_EXPRESSION_1);
                    		

                    			newLeafNode(this_GH_EXPRESSION_1, grammarAccess.getEStringAccess().getGH_EXPRESSIONTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:381:3: this_BlockString_2= ruleBlockString
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
                    // InternalMyDsl.g:392:3: this_ScalarSequence_3= ruleScalarSequence
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
    // InternalMyDsl.g:406:1: entryRuleScalarSequence returns [String current=null] : iv_ruleScalarSequence= ruleScalarSequence EOF ;
    public final String entryRuleScalarSequence() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleScalarSequence = null;


        try {
            // InternalMyDsl.g:406:54: (iv_ruleScalarSequence= ruleScalarSequence EOF )
            // InternalMyDsl.g:407:2: iv_ruleScalarSequence= ruleScalarSequence EOF
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
    // InternalMyDsl.g:413:1: ruleScalarSequence returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* ) ;
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
            // InternalMyDsl.g:419:2: ( ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* ) )
            // InternalMyDsl.g:420:2: ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* )
            {
            // InternalMyDsl.g:420:2: ( (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )* )
            // InternalMyDsl.g:421:3: (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' ) (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )*
            {
            // InternalMyDsl.g:421:3: (this_YAML_SCALAR_0= RULE_YAML_SCALAR | this_ID_1= RULE_ID | this_INT_2= RULE_INT | kw= 'true' | kw= 'false' )
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
            case 22:
                {
                alt9=4;
                }
                break;
            case 23:
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
                    // InternalMyDsl.g:422:4: this_YAML_SCALAR_0= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_0=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_13); 

                    				current.merge(this_YAML_SCALAR_0);
                    			

                    				newLeafNode(this_YAML_SCALAR_0, grammarAccess.getScalarSequenceAccess().getYAML_SCALARTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:430:4: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_13); 

                    				current.merge(this_ID_1);
                    			

                    				newLeafNode(this_ID_1, grammarAccess.getScalarSequenceAccess().getIDTerminalRuleCall_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:438:4: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_13); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getScalarSequenceAccess().getINTTerminalRuleCall_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:446:4: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getTrueKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:452:4: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getFalseKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:458:3: (kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' ) )*
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
                    case 22:
                        {
                        alt11=1;
                        }
                        break;
                    case 23:
                        {
                        alt11=1;
                        }
                        break;

                    }

                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:459:4: kw= ':' (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' )
            	    {
            	    kw=(Token)match(input,16,FOLLOW_14); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getColonKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:464:4: (this_YAML_SCALAR_6= RULE_YAML_SCALAR | this_ID_7= RULE_ID | this_INT_8= RULE_INT | kw= 'true' | kw= 'false' )
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
            	    case 22:
            	        {
            	        alt10=4;
            	        }
            	        break;
            	    case 23:
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
            	            // InternalMyDsl.g:465:5: this_YAML_SCALAR_6= RULE_YAML_SCALAR
            	            {
            	            this_YAML_SCALAR_6=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_13); 

            	            					current.merge(this_YAML_SCALAR_6);
            	            				

            	            					newLeafNode(this_YAML_SCALAR_6, grammarAccess.getScalarSequenceAccess().getYAML_SCALARTerminalRuleCall_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:473:5: this_ID_7= RULE_ID
            	            {
            	            this_ID_7=(Token)match(input,RULE_ID,FOLLOW_13); 

            	            					current.merge(this_ID_7);
            	            				

            	            					newLeafNode(this_ID_7, grammarAccess.getScalarSequenceAccess().getIDTerminalRuleCall_1_1_1());
            	            				

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:481:5: this_INT_8= RULE_INT
            	            {
            	            this_INT_8=(Token)match(input,RULE_INT,FOLLOW_13); 

            	            					current.merge(this_INT_8);
            	            				

            	            					newLeafNode(this_INT_8, grammarAccess.getScalarSequenceAccess().getINTTerminalRuleCall_1_1_2());
            	            				

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:489:5: kw= 'true'
            	            {
            	            kw=(Token)match(input,22,FOLLOW_13); 

            	            					current.merge(kw);
            	            					newLeafNode(kw, grammarAccess.getScalarSequenceAccess().getTrueKeyword_1_1_3());
            	            				

            	            }
            	            break;
            	        case 5 :
            	            // InternalMyDsl.g:495:5: kw= 'false'
            	            {
            	            kw=(Token)match(input,23,FOLLOW_13); 

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
    // InternalMyDsl.g:506:1: entryRuleBlockString returns [String current=null] : iv_ruleBlockString= ruleBlockString EOF ;
    public final String entryRuleBlockString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockString = null;


        try {
            // InternalMyDsl.g:506:51: (iv_ruleBlockString= ruleBlockString EOF )
            // InternalMyDsl.g:507:2: iv_ruleBlockString= ruleBlockString EOF
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
    // InternalMyDsl.g:513:1: ruleBlockString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:519:2: ( ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:520:2: ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:520:2: ( (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalMyDsl.g:521:3: (kw= '>' | kw= '|' ) (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )* (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:521:3: (kw= '>' | kw= '|' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:522:4: kw= '>'
                    {
                    kw=(Token)match(input,24,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:528:4: kw= '|'
                    {
                    kw=(Token)match(input,25,FOLLOW_15); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLineKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:534:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BEG_BLOCK) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:535:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_16); 

                    				current.merge(this_BEG_BLOCK_2);
                    			

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getBlockStringAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:543:3: (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )*
            loop14:
            do {
                int alt14=15;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:544:4: this_YAML_SCALAR_3= RULE_YAML_SCALAR
            	    {
            	    this_YAML_SCALAR_3=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_16); 

            	    				current.merge(this_YAML_SCALAR_3);
            	    			

            	    				newLeafNode(this_YAML_SCALAR_3, grammarAccess.getBlockStringAccess().getYAML_SCALARTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:552:4: this_GH_EXPRESSION_4= RULE_GH_EXPRESSION
            	    {
            	    this_GH_EXPRESSION_4=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_16); 

            	    				current.merge(this_GH_EXPRESSION_4);
            	    			

            	    				newLeafNode(this_GH_EXPRESSION_4, grammarAccess.getBlockStringAccess().getGH_EXPRESSIONTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:560:4: this_ID_5= RULE_ID
            	    {
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getBlockStringAccess().getIDTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:568:4: this_INT_6= RULE_INT
            	    {
            	    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_16); 

            	    				current.merge(this_INT_6);
            	    			

            	    				newLeafNode(this_INT_6, grammarAccess.getBlockStringAccess().getINTTerminalRuleCall_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:576:4: this_STRING_7= RULE_STRING
            	    {
            	    this_STRING_7=(Token)match(input,RULE_STRING,FOLLOW_16); 

            	    				current.merge(this_STRING_7);
            	    			

            	    				newLeafNode(this_STRING_7, grammarAccess.getBlockStringAccess().getSTRINGTerminalRuleCall_2_4());
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:584:4: kw= '-'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getHyphenMinusKeyword_2_5());
            	    			

            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:590:4: kw= '['
            	    {
            	    kw=(Token)match(input,27,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftSquareBracketKeyword_2_6());
            	    			

            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:596:4: kw= ']'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightSquareBracketKeyword_2_7());
            	    			

            	    }
            	    break;
            	case 9 :
            	    // InternalMyDsl.g:602:4: kw= ';'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getSemicolonKeyword_2_8());
            	    			

            	    }
            	    break;
            	case 10 :
            	    // InternalMyDsl.g:608:4: kw= ':'
            	    {
            	    kw=(Token)match(input,16,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getColonKeyword_2_9());
            	    			

            	    }
            	    break;
            	case 11 :
            	    // InternalMyDsl.g:614:4: kw= ','
            	    {
            	    kw=(Token)match(input,30,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getCommaKeyword_2_10());
            	    			

            	    }
            	    break;
            	case 12 :
            	    // InternalMyDsl.g:620:4: kw= '{'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftCurlyBracketKeyword_2_11());
            	    			

            	    }
            	    break;
            	case 13 :
            	    // InternalMyDsl.g:626:4: kw= '}'
            	    {
            	    kw=(Token)match(input,32,FOLLOW_16); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightCurlyBracketKeyword_2_12());
            	    			

            	    }
            	    break;
            	case 14 :
            	    // InternalMyDsl.g:632:4: this_ANY_OTHER_16= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_16=(Token)match(input,RULE_ANY_OTHER,FOLLOW_16); 

            	    				current.merge(this_ANY_OTHER_16);
            	    			

            	    				newLeafNode(this_ANY_OTHER_16, grammarAccess.getBlockStringAccess().getANY_OTHERTerminalRuleCall_2_13());
            	    			

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalMyDsl.g:640:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_END_BLOCK) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:641:4: this_END_BLOCK_17= RULE_END_BLOCK
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
    // InternalMyDsl.g:653:1: entryRuleKeyName returns [String current=null] : iv_ruleKeyName= ruleKeyName EOF ;
    public final String entryRuleKeyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyName = null;


        try {
            // InternalMyDsl.g:653:47: (iv_ruleKeyName= ruleKeyName EOF )
            // InternalMyDsl.g:654:2: iv_ruleKeyName= ruleKeyName EOF
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
    // InternalMyDsl.g:660:1: ruleKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' ) ;
    public final AntlrDatatypeRuleToken ruleKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_YAML_SCALAR_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:666:2: ( (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' ) )
            // InternalMyDsl.g:667:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' )
            {
            // InternalMyDsl.g:667:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' | kw= 'continue-on-error' | kw= 'issues' | kw= 'strategy' | kw= 'fail-fast' | kw= 'matrix' | kw= 'os' | kw= 'build-type' | kw= 'c-compiler' | kw= 'cpp-compiler' | kw= 'otp' | kw= 'elixir' | kw= 'include' | kw= 'exclude' | kw= 'workflow_call' | kw= 'pull_request_target' | kw= 'secrets' | kw= 'required' | kw= 'packages' )
            int alt16=45;
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
            case 19:
                {
                alt16=6;
                }
                break;
            case 20:
                {
                alt16=7;
                }
                break;
            case 21:
                {
                alt16=8;
                }
                break;
            case 33:
                {
                alt16=9;
                }
                break;
            case 34:
                {
                alt16=10;
                }
                break;
            case 35:
                {
                alt16=11;
                }
                break;
            case 36:
                {
                alt16=12;
                }
                break;
            case 37:
                {
                alt16=13;
                }
                break;
            case 38:
                {
                alt16=14;
                }
                break;
            case 39:
                {
                alt16=15;
                }
                break;
            case 40:
                {
                alt16=16;
                }
                break;
            case 41:
                {
                alt16=17;
                }
                break;
            case 42:
                {
                alt16=18;
                }
                break;
            case 43:
                {
                alt16=19;
                }
                break;
            case 44:
                {
                alt16=20;
                }
                break;
            case 45:
                {
                alt16=21;
                }
                break;
            case 46:
                {
                alt16=22;
                }
                break;
            case 47:
                {
                alt16=23;
                }
                break;
            case 48:
                {
                alt16=24;
                }
                break;
            case 49:
                {
                alt16=25;
                }
                break;
            case 50:
                {
                alt16=26;
                }
                break;
            case 51:
                {
                alt16=27;
                }
                break;
            case 52:
                {
                alt16=28;
                }
                break;
            case 53:
                {
                alt16=29;
                }
                break;
            case 54:
                {
                alt16=30;
                }
                break;
            case 55:
                {
                alt16=31;
                }
                break;
            case 56:
                {
                alt16=32;
                }
                break;
            case 57:
                {
                alt16=33;
                }
                break;
            case 58:
                {
                alt16=34;
                }
                break;
            case 59:
                {
                alt16=35;
                }
                break;
            case 60:
                {
                alt16=36;
                }
                break;
            case 61:
                {
                alt16=37;
                }
                break;
            case 62:
                {
                alt16=38;
                }
                break;
            case 63:
                {
                alt16=39;
                }
                break;
            case 64:
                {
                alt16=40;
                }
                break;
            case 65:
                {
                alt16=41;
                }
                break;
            case 66:
                {
                alt16=42;
                }
                break;
            case 67:
                {
                alt16=43;
                }
                break;
            case 68:
                {
                alt16=44;
                }
                break;
            case 69:
                {
                alt16=45;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:668:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getKeyNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:676:3: this_YAML_SCALAR_1= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_1=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_2); 

                    			current.merge(this_YAML_SCALAR_1);
                    		

                    			newLeafNode(this_YAML_SCALAR_1, grammarAccess.getKeyNameAccess().getYAML_SCALARTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:684:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getKeyNameAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:692:3: kw= 'name'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getNameKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:698:3: kw= 'on'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOnKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:704:3: kw= 'jobs'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getJobsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:710:3: kw= 'permissions'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPermissionsKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:716:3: kw= 'env'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getEnvKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:722:3: kw= 'push'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPushKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:728:3: kw= 'pull_request'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPull_requestKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:734:3: kw= 'branches'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getBranchesKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:740:3: kw= 'tags'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getTagsKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:746:3: kw= 'runs-on'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRunsOnKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:752:3: kw= 'needs'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getNeedsKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:758:3: kw= 'steps'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getStepsKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalMyDsl.g:764:3: kw= 'uses'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getUsesKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalMyDsl.g:770:3: kw= 'run'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRunKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalMyDsl.g:776:3: kw= 'with'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getWithKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalMyDsl.g:782:3: kw= 'shell'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getShellKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalMyDsl.g:788:3: kw= 'contents'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getContentsKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalMyDsl.g:794:3: kw= 'security-events'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getSecurityEventsKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalMyDsl.g:800:3: kw= 'actions'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getActionsKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalMyDsl.g:806:3: kw= 'pages'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPagesKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalMyDsl.g:812:3: kw= 'id-token'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIdTokenKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalMyDsl.g:818:3: kw= 'types'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getTypesKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalMyDsl.g:824:3: kw= 'pull-requests'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPullRequestsKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalMyDsl.g:830:3: kw= 'if'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIfKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalMyDsl.g:836:3: kw= 'continue-on-error'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getContinueOnErrorKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalMyDsl.g:842:3: kw= 'issues'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIssuesKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalMyDsl.g:848:3: kw= 'strategy'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getStrategyKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalMyDsl.g:854:3: kw= 'fail-fast'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getFailFastKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalMyDsl.g:860:3: kw= 'matrix'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getMatrixKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalMyDsl.g:866:3: kw= 'os'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOsKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalMyDsl.g:872:3: kw= 'build-type'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getBuildTypeKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalMyDsl.g:878:3: kw= 'c-compiler'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getCCompilerKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalMyDsl.g:884:3: kw= 'cpp-compiler'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getCppCompilerKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalMyDsl.g:890:3: kw= 'otp'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getOtpKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalMyDsl.g:896:3: kw= 'elixir'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getElixirKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalMyDsl.g:902:3: kw= 'include'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getIncludeKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalMyDsl.g:908:3: kw= 'exclude'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getExcludeKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalMyDsl.g:914:3: kw= 'workflow_call'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getWorkflow_callKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalMyDsl.g:920:3: kw= 'pull_request_target'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPull_request_targetKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalMyDsl.g:926:3: kw= 'secrets'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getSecretsKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalMyDsl.g:932:3: kw= 'required'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getRequiredKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalMyDsl.g:938:3: kw= 'packages'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKeyNameAccess().getPackagesKeyword_44());
                    		

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
    // InternalMyDsl.g:947:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalMyDsl.g:947:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalMyDsl.g:948:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalMyDsl.g:954:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:960:2: ( ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:961:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:961:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            // InternalMyDsl.g:962:3: ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:962:3: ( (lv_key_0_0= ruleKeyName ) )
            // InternalMyDsl.g:963:4: (lv_key_0_0= ruleKeyName )
            {
            // InternalMyDsl.g:963:4: (lv_key_0_0= ruleKeyName )
            // InternalMyDsl.g:964:5: lv_key_0_0= ruleKeyName
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
            		
            // InternalMyDsl.g:985:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMyDsl.g:986:4: (lv_value_2_0= ruleEString )
            {
            // InternalMyDsl.g:986:4: (lv_value_2_0= ruleEString )
            // InternalMyDsl.g:987:5: lv_value_2_0= ruleEString
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
    // InternalMyDsl.g:1008:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
    public final EObject entryRuleOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOn = null;


        try {
            // InternalMyDsl.g:1008:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:1009:2: iv_ruleOn= ruleOn EOF
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
    // InternalMyDsl.g:1015:1: ruleOn returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_23= RULE_END_BLOCK )? ) ;
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
        Token this_END_BLOCK_23=null;
        EObject lv_push_5_0 = null;

        EObject lv_pullRequest_8_0 = null;

        EObject lv_pullRequestTarget_11_0 = null;

        EObject lv_schedule_15_0 = null;

        AntlrDatatypeRuleToken lv_workflowDispatch_19_0 = null;

        EObject lv_workflowCall_22_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1021:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_23= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1022:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_23= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1022:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_23= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1023:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_23= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1023:3: ()
            // InternalMyDsl.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnAccess().getOnAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1030:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BEG_BLOCK) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1031:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_17); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1036:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1037:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1037:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1038:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1041:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1042:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1042:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) ) )*
            loop22:
            do {
                int alt22=7;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
                    alt22=4;
                }
                else if ( LA22_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4) ) {
                    alt22=5;
                }
                else if ( LA22_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5) ) {
                    alt22=6;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1043:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1043:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:1044:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1044:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:1045:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1048:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:1048:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1048:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:1048:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOnAccess().getPushKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOnAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1056:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:1057:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:1057:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:1058:11: lv_push_5_0= rulePush
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPushPushParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
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
            	    // InternalMyDsl.g:1081:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1081:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:1082:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1082:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:1083:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1086:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:1086:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1086:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:1086:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
            	    {
            	    otherlv_6=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getOnAccess().getPull_requestKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOnAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1094:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:1095:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:1095:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:1096:11: lv_pullRequest_8_0= rulePull_request
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPullRequestPull_requestParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
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
            	    // InternalMyDsl.g:1119:4: ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1119:4: ({...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:1120:5: {...}? => ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1120:99: ( ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:1121:6: ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1124:9: ({...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:1124:10: {...}? => (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1124:19: (otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:1124:20: otherlv_9= 'pull_request_target' otherlv_10= ':' ( (lv_pullRequestTarget_11_0= rulePull_request ) )
            	    {
            	    otherlv_9=(Token)match(input,66,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getOnAccess().getPull_request_targetKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_10, grammarAccess.getOnAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:1132:9: ( (lv_pullRequestTarget_11_0= rulePull_request ) )
            	    // InternalMyDsl.g:1133:10: (lv_pullRequestTarget_11_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:1133:10: (lv_pullRequestTarget_11_0= rulePull_request )
            	    // InternalMyDsl.g:1134:11: lv_pullRequestTarget_11_0= rulePull_request
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPullRequestTargetPull_requestParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
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
            	    // InternalMyDsl.g:1157:4: ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1157:4: ({...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:1158:5: {...}? => ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1158:99: ( ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:1159:6: ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1162:9: ({...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:1162:10: {...}? => (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1162:19: (otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:1162:20: otherlv_12= 'schedule' otherlv_13= ':' ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? )
            	    {
            	    otherlv_12=(Token)match(input,70,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getOnAccess().getScheduleKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_13, grammarAccess.getOnAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:1170:9: ( (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:1171:10: (this_BEG_BLOCK_14= RULE_BEG_BLOCK )? ( (lv_schedule_15_0= ruleSchedule ) )+ (this_END_BLOCK_16= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:1171:10: (this_BEG_BLOCK_14= RULE_BEG_BLOCK )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_BEG_BLOCK) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMyDsl.g:1172:11: this_BEG_BLOCK_14= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_14=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	            											newLeafNode(this_BEG_BLOCK_14, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1177:10: ( (lv_schedule_15_0= ruleSchedule ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==26) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:1178:11: (lv_schedule_15_0= ruleSchedule )
            	    	    {
            	    	    // InternalMyDsl.g:1178:11: (lv_schedule_15_0= ruleSchedule )
            	    	    // InternalMyDsl.g:1179:12: lv_schedule_15_0= ruleSchedule
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getOnAccess().getScheduleScheduleParserRuleCall_2_3_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_20);
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

            	    // InternalMyDsl.g:1196:10: (this_END_BLOCK_16= RULE_END_BLOCK )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==RULE_END_BLOCK) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMyDsl.g:1197:11: this_END_BLOCK_16= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_16=(Token)match(input,RULE_END_BLOCK,FOLLOW_17); 

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
            	    // InternalMyDsl.g:1209:4: ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:1209:4: ({...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) ) )
            	    // InternalMyDsl.g:1210:5: {...}? => ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:1210:99: ( ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) ) )
            	    // InternalMyDsl.g:1211:6: ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:1214:9: ({...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? ) )
            	    // InternalMyDsl.g:1214:10: {...}? => (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1214:19: (otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )? )
            	    // InternalMyDsl.g:1214:20: otherlv_17= 'workflow_dispatch' otherlv_18= ':' ( (lv_workflowDispatch_19_0= ruleEString ) )?
            	    {
            	    otherlv_17=(Token)match(input,71,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getOnAccess().getWorkflow_dispatchKeyword_2_4_0());
            	    								
            	    otherlv_18=(Token)match(input,16,FOLLOW_21); 

            	    									newLeafNode(otherlv_18, grammarAccess.getOnAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:1222:9: ( (lv_workflowDispatch_19_0= ruleEString ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=22 && LA21_0<=25)) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMyDsl.g:1223:10: (lv_workflowDispatch_19_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1223:10: (lv_workflowDispatch_19_0= ruleEString )
            	            // InternalMyDsl.g:1224:11: lv_workflowDispatch_19_0= ruleEString
            	            {

            	            											newCompositeNode(grammarAccess.getOnAccess().getWorkflowDispatchEStringParserRuleCall_2_4_2_0());
            	            										
            	            pushFollow(FOLLOW_17);
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
            	    // InternalMyDsl.g:1247:4: ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1247:4: ({...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) ) )
            	    // InternalMyDsl.g:1248:5: {...}? => ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:1248:99: ( ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) ) )
            	    // InternalMyDsl.g:1249:6: ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:1252:9: ({...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) ) )
            	    // InternalMyDsl.g:1252:10: {...}? => (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1252:19: (otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) ) )
            	    // InternalMyDsl.g:1252:20: otherlv_20= 'workflow_call' otherlv_21= ':' ( (lv_workflowCall_22_0= ruleWorkflow_call ) )
            	    {
            	    otherlv_20=(Token)match(input,65,FOLLOW_3); 

            	    									newLeafNode(otherlv_20, grammarAccess.getOnAccess().getWorkflow_callKeyword_2_5_0());
            	    								
            	    otherlv_21=(Token)match(input,16,FOLLOW_22); 

            	    									newLeafNode(otherlv_21, grammarAccess.getOnAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:1260:9: ( (lv_workflowCall_22_0= ruleWorkflow_call ) )
            	    // InternalMyDsl.g:1261:10: (lv_workflowCall_22_0= ruleWorkflow_call )
            	    {
            	    // InternalMyDsl.g:1261:10: (lv_workflowCall_22_0= ruleWorkflow_call )
            	    // InternalMyDsl.g:1262:11: lv_workflowCall_22_0= ruleWorkflow_call
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getWorkflowCallWorkflow_callParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_17);
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

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1292:3: (this_END_BLOCK_23= RULE_END_BLOCK )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_END_BLOCK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1293:4: this_END_BLOCK_23= RULE_END_BLOCK
                    {
                    this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_23, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // InternalMyDsl.g:1302:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalMyDsl.g:1302:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:1303:2: iv_rulePush= rulePush EOF
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
    // InternalMyDsl.g:1309:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1315:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1316:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1316:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1317:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1317:3: ()
            // InternalMyDsl.g:1318:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_23); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1328:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1329:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1329:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1330:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1333:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1334:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1334:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:1335:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1335:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1336:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1336:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1337:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1340:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1340:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1340:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1340:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPushAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPushAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1348:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_BEG_BLOCK) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==27) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalMyDsl.g:1349:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1349:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1350:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1354:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt24=0;
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==26) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1355:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1363:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1364:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1364:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1365:14: lv_branches_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

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

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_23); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1393:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1393:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1394:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1398:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1399:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1399:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1400:13: lv_branches_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:1417:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==30) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1418:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPushAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1422:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1423:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1423:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1424:14: lv_branches_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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

            	            otherlv_15=(Token)match(input,28,FOLLOW_23); 

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
            	    // InternalMyDsl.g:1454:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1454:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1455:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1455:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1456:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1459:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1459:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1459:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1459:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPushAccess().getTagsKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPushAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1467:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
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
            	            // InternalMyDsl.g:1468:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1468:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1469:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1473:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1474:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1482:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1483:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1483:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1484:14: lv_tags_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

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

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_23); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1512:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1512:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1513:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1517:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1518:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1518:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:1519:13: lv_tags_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:1536:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==30) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1537:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPushAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1541:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1542:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1542:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1543:14: lv_tags_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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

            	            otherlv_28=(Token)match(input,28,FOLLOW_23); 

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
    // InternalMyDsl.g:1588:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
    public final EObject entryRulePull_request() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_request = null;


        try {
            // InternalMyDsl.g:1588:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1589:2: iv_rulePull_request= rulePull_request EOF
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
    // InternalMyDsl.g:1595:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1601:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1602:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1602:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1603:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1603:3: ()
            // InternalMyDsl.g:1604:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPull_requestAccess().getPull_requestAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_29); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1614:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1615:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1615:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1616:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPull_requestAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1619:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1620:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1620:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:1621:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1621:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1622:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1622:109: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1623:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1626:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1626:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1626:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1626:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPull_requestAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPull_requestAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1634:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_BEG_BLOCK) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==27) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // InternalMyDsl.g:1635:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1635:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1636:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1640:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt31=0;
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==26) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1641:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1649:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1650:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1650:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1651:14: lv_branches_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

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

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_30); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1679:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1679:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1680:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1684:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1685:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1685:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1686:13: lv_branches_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:1703:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==30) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1704:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPull_requestAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1708:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1709:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1709:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1710:14: lv_branches_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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

            	            otherlv_15=(Token)match(input,28,FOLLOW_30); 

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
            	    // InternalMyDsl.g:1740:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1740:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1741:5: {...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1741:109: ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1742:6: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1745:9: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1745:10: {...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1745:19: (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1745:20: otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPull_requestAccess().getTypesKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPull_requestAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1753:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
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
            	            // InternalMyDsl.g:1754:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1754:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1755:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1759:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1760:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1768:12: ( (lv_types_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1769:13: (lv_types_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1769:13: (lv_types_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1770:14: lv_types_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

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

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_30); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1798:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1798:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1799:11: otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1803:11: ( (lv_types_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1804:12: (lv_types_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1804:12: (lv_types_25_0= ruleEString )
            	            // InternalMyDsl.g:1805:13: lv_types_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:1822:11: (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )*
            	            loop35:
            	            do {
            	                int alt35=2;
            	                int LA35_0 = input.LA(1);

            	                if ( (LA35_0==30) ) {
            	                    alt35=1;
            	                }


            	                switch (alt35) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1823:12: otherlv_26= ',' ( (lv_types_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPull_requestAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1827:12: ( (lv_types_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1828:13: (lv_types_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1828:13: (lv_types_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1829:14: lv_types_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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

            	            otherlv_28=(Token)match(input,28,FOLLOW_30); 

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
    // InternalMyDsl.g:1875:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMyDsl.g:1875:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMyDsl.g:1876:2: iv_ruleSchedule= ruleSchedule EOF
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
    // InternalMyDsl.g:1882:1: ruleSchedule returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1888:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1889:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1889:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1890:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:1894:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_BEG_BLOCK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1895:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_32); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getScheduleAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getCronKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1908:3: ( (lv_cron_4_0= ruleEString ) )
            // InternalMyDsl.g:1909:4: (lv_cron_4_0= ruleEString )
            {
            // InternalMyDsl.g:1909:4: (lv_cron_4_0= ruleEString )
            // InternalMyDsl.g:1910:5: lv_cron_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getCronEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_33);
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

            // InternalMyDsl.g:1927:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_END_BLOCK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1928:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:1937:1: entryRuleWorkflow_call returns [EObject current=null] : iv_ruleWorkflow_call= ruleWorkflow_call EOF ;
    public final EObject entryRuleWorkflow_call() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkflow_call = null;


        try {
            // InternalMyDsl.g:1937:54: (iv_ruleWorkflow_call= ruleWorkflow_call EOF )
            // InternalMyDsl.g:1938:2: iv_ruleWorkflow_call= ruleWorkflow_call EOF
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
    // InternalMyDsl.g:1944:1: ruleWorkflow_call returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1950:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1951:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1951:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1952:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )? (this_END_BLOCK_7= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1952:3: ()
            // InternalMyDsl.g:1953:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWorkflow_callAccess().getWorkflow_callAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1959:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_BEG_BLOCK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1960:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_34); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getWorkflow_callAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1965:3: (otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )? )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==67) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:1966:4: otherlv_2= 'secrets' otherlv_3= ':' (this_BEG_BLOCK_4= RULE_BEG_BLOCK )? ( (lv_secrets_5_0= ruleSecret ) )+ (this_END_BLOCK_6= RULE_END_BLOCK )?
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getWorkflow_callAccess().getSecretsKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkflow_callAccess().getColonKeyword_2_1());
                    			
                    // InternalMyDsl.g:1974:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_BEG_BLOCK) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalMyDsl.g:1975:5: this_BEG_BLOCK_4= RULE_BEG_BLOCK
                            {
                            this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_8); 

                            					newLeafNode(this_BEG_BLOCK_4, grammarAccess.getWorkflow_callAccess().getBEG_BLOCKTerminalRuleCall_2_2());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:1980:4: ( (lv_secrets_5_0= ruleSecret ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_INT)||(LA42_0>=22 && LA42_0<=25)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMyDsl.g:1981:5: (lv_secrets_5_0= ruleSecret )
                    	    {
                    	    // InternalMyDsl.g:1981:5: (lv_secrets_5_0= ruleSecret )
                    	    // InternalMyDsl.g:1982:6: lv_secrets_5_0= ruleSecret
                    	    {

                    	    						newCompositeNode(grammarAccess.getWorkflow_callAccess().getSecretsSecretParserRuleCall_2_3_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
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

                    // InternalMyDsl.g:1999:4: (this_END_BLOCK_6= RULE_END_BLOCK )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_END_BLOCK) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalMyDsl.g:2000:5: this_END_BLOCK_6= RULE_END_BLOCK
                            {
                            this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_33); 

                            					newLeafNode(this_END_BLOCK_6, grammarAccess.getWorkflow_callAccess().getEND_BLOCKTerminalRuleCall_2_4());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2006:3: (this_END_BLOCK_7= RULE_END_BLOCK )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_END_BLOCK) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2007:4: this_END_BLOCK_7= RULE_END_BLOCK
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
    // InternalMyDsl.g:2016:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalMyDsl.g:2016:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalMyDsl.g:2017:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalMyDsl.g:2023:1: ruleSecret returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2029:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2030:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2030:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2031:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )? (this_END_BLOCK_6= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2031:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2032:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2032:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2033:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,16,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getSecretAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2054:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BEG_BLOCK) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2055:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_37); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getSecretAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2060:3: (otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==68) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2061:4: otherlv_3= 'required' otherlv_4= ':' ( (lv_required_5_0= ruleEBoolean ) )
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSecretAccess().getRequiredKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,16,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getColonKeyword_3_1());
                    			
                    // InternalMyDsl.g:2069:4: ( (lv_required_5_0= ruleEBoolean ) )
                    // InternalMyDsl.g:2070:5: (lv_required_5_0= ruleEBoolean )
                    {
                    // InternalMyDsl.g:2070:5: (lv_required_5_0= ruleEBoolean )
                    // InternalMyDsl.g:2071:6: lv_required_5_0= ruleEBoolean
                    {

                    						newCompositeNode(grammarAccess.getSecretAccess().getRequiredEBooleanParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_33);
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

            // InternalMyDsl.g:2089:3: (this_END_BLOCK_6= RULE_END_BLOCK )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_END_BLOCK) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2090:4: this_END_BLOCK_6= RULE_END_BLOCK
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
    // InternalMyDsl.g:2099:1: entryRuleConcurrency returns [EObject current=null] : iv_ruleConcurrency= ruleConcurrency EOF ;
    public final EObject entryRuleConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrency = null;


        try {
            // InternalMyDsl.g:2099:52: (iv_ruleConcurrency= ruleConcurrency EOF )
            // InternalMyDsl.g:2100:2: iv_ruleConcurrency= ruleConcurrency EOF
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
    // InternalMyDsl.g:2106:1: ruleConcurrency returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2112:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2113:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2113:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2114:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2114:3: ()
            // InternalMyDsl.g:2115:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcurrencyAccess().getConcurrencyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2121:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_BEG_BLOCK) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2122:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_39); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getConcurrencyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2127:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2128:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2128:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2129:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2132:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2133:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2133:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            loop50:
            do {
                int alt50=3;
                int LA50_0 = input.LA(1);

                if ( LA50_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
                    alt50=2;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMyDsl.g:2134:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2134:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2135:5: {...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2135:108: ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2136:6: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2139:9: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2139:10: {...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:2139:19: (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2139:20: otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,73,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getConcurrencyAccess().getGroupKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConcurrencyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2147:9: ( (lv_group_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2148:10: (lv_group_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2148:10: (lv_group_5_0= ruleEString )
            	    // InternalMyDsl.g:2149:11: lv_group_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getGroupEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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
            	    // InternalMyDsl.g:2172:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2172:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:2173:5: {...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2173:108: ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:2174:6: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2177:9: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:2177:10: {...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:2177:19: (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:2177:20: otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,74,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConcurrencyAccess().getCancelInProgressKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_38); 

            	    									newLeafNode(otherlv_7, grammarAccess.getConcurrencyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2185:9: ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:2186:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:2186:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    // InternalMyDsl.g:2187:11: lv_cancelInProgress_8_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getCancelInProgressEBooleanParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_39);
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

            // InternalMyDsl.g:2217:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_END_BLOCK) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMyDsl.g:2218:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:2227:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:2227:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:2228:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalMyDsl.g:2234:1: ruleEnvironment returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2240:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2241:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2241:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2242:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2242:3: ()
            // InternalMyDsl.g:2243:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2249:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BEG_BLOCK) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2250:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_40); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getEnvironmentAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2255:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2256:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2256:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2257:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2260:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2261:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2261:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            loop53:
            do {
                int alt53=3;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // InternalMyDsl.g:2262:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2262:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2263:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2263:108: ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2264:6: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2267:9: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2267:10: {...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:2267:19: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2267:20: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2275:9: ( (lv_name_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2276:10: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2276:10: (lv_name_5_0= ruleEString )
            	    // InternalMyDsl.g:2277:11: lv_name_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_40);
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
            	    // InternalMyDsl.g:2300:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2300:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2301:5: {...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2301:108: ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2302:6: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2305:9: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2305:10: {...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:2305:19: (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2305:20: otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,75,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2313:9: ( (lv_url_8_0= ruleEString ) )
            	    // InternalMyDsl.g:2314:10: (lv_url_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2314:10: (lv_url_8_0= ruleEString )
            	    // InternalMyDsl.g:2315:11: lv_url_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getUrlEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_40);
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

            // InternalMyDsl.g:2345:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_END_BLOCK) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMyDsl.g:2346:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:2355:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // InternalMyDsl.g:2355:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalMyDsl.g:2356:2: iv_rulePermissions= rulePermissions EOF
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
    // InternalMyDsl.g:2362:1: rulePermissions returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:2368:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2369:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2369:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2370:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_27= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2370:3: ()
            // InternalMyDsl.g:2371:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionsAccess().getPermissionsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2377:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_BEG_BLOCK) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2378:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_41); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPermissionsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2383:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2384:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2384:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2385:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2388:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2389:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2389:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*
            loop56:
            do {
                int alt56=9;
                alt56 = dfa56.predict(input);
                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:2390:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2390:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2391:5: {...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2391:108: ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2392:6: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2395:9: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2395:10: {...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2395:19: (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2395:20: otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPermissionsAccess().getContentsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPermissionsAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2403:9: ( (lv_contents_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2404:10: (lv_contents_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2404:10: (lv_contents_5_0= ruleEString )
            	    // InternalMyDsl.g:2405:11: lv_contents_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getContentsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2428:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2428:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2429:5: {...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2429:108: ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2430:6: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2433:9: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2433:10: {...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2433:19: (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2433:20: otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,45,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPermissionsAccess().getSecurityEventsKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPermissionsAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2441:9: ( (lv_securityEvents_8_0= ruleEString ) )
            	    // InternalMyDsl.g:2442:10: (lv_securityEvents_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2442:10: (lv_securityEvents_8_0= ruleEString )
            	    // InternalMyDsl.g:2443:11: lv_securityEvents_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getSecurityEventsEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2466:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2466:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2467:5: {...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2467:108: ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2468:6: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2471:9: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2471:10: {...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2471:19: (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2471:20: otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getPermissionsAccess().getActionsKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPermissionsAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:2479:9: ( (lv_actions_11_0= ruleEString ) )
            	    // InternalMyDsl.g:2480:10: (lv_actions_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2480:10: (lv_actions_11_0= ruleEString )
            	    // InternalMyDsl.g:2481:11: lv_actions_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getActionsEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2504:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2504:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2505:5: {...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2505:108: ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2506:6: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2509:9: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2509:10: {...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2509:19: (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2509:20: otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,47,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPermissionsAccess().getPagesKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getPermissionsAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:2517:9: ( (lv_pages_14_0= ruleEString ) )
            	    // InternalMyDsl.g:2518:10: (lv_pages_14_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2518:10: (lv_pages_14_0= ruleEString )
            	    // InternalMyDsl.g:2519:11: lv_pages_14_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPagesEStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2542:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2542:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2543:5: {...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2543:108: ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2544:6: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2547:9: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2547:10: {...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2547:19: (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2547:20: otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getPermissionsAccess().getIdTokenKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPermissionsAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:2555:9: ( (lv_idToken_17_0= ruleEString ) )
            	    // InternalMyDsl.g:2556:10: (lv_idToken_17_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2556:10: (lv_idToken_17_0= ruleEString )
            	    // InternalMyDsl.g:2557:11: lv_idToken_17_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getIdTokenEStringParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2580:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2580:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2581:5: {...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:2581:108: ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2582:6: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:2585:9: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2585:10: {...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2585:19: (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2585:20: otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getPermissionsAccess().getPullRequestsKeyword_2_5_0());
            	    								
            	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getPermissionsAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:2593:9: ( (lv_pullRequests_20_0= ruleEString ) )
            	    // InternalMyDsl.g:2594:10: (lv_pullRequests_20_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2594:10: (lv_pullRequests_20_0= ruleEString )
            	    // InternalMyDsl.g:2595:11: lv_pullRequests_20_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPullRequestsEStringParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2618:4: ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2618:4: ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2619:5: {...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:2619:108: ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2620:6: ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:2623:9: ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2623:10: {...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2623:19: (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2623:20: otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) )
            	    {
            	    otherlv_21=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getPermissionsAccess().getIssuesKeyword_2_6_0());
            	    								
            	    otherlv_22=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_22, grammarAccess.getPermissionsAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:2631:9: ( (lv_issues_23_0= ruleEString ) )
            	    // InternalMyDsl.g:2632:10: (lv_issues_23_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2632:10: (lv_issues_23_0= ruleEString )
            	    // InternalMyDsl.g:2633:11: lv_issues_23_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getIssuesEStringParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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
            	    // InternalMyDsl.g:2656:4: ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2656:4: ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2657:5: {...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:2657:108: ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2658:6: ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:2661:9: ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2661:10: {...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2661:19: (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2661:20: otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,69,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getPermissionsAccess().getPackagesKeyword_2_7_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getPermissionsAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalMyDsl.g:2669:9: ( (lv_packages_26_0= ruleEString ) )
            	    // InternalMyDsl.g:2670:10: (lv_packages_26_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2670:10: (lv_packages_26_0= ruleEString )
            	    // InternalMyDsl.g:2671:11: lv_packages_26_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPackagesEStringParserRuleCall_2_7_2_0());
            	    										
            	    pushFollow(FOLLOW_41);
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

            // InternalMyDsl.g:2701:3: (this_END_BLOCK_27= RULE_END_BLOCK )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_END_BLOCK) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2702:4: this_END_BLOCK_27= RULE_END_BLOCK
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
    // InternalMyDsl.g:2711:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDsl.g:2711:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDsl.g:2712:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDsl.g:2718:1: ruleJob returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_41= RULE_END_BLOCK )? ) ;
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
        Token this_BEG_BLOCK_35=null;
        Token this_END_BLOCK_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token this_END_BLOCK_41=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_runsOn_9_0 = null;

        AntlrDatatypeRuleToken lv_needs_12_0 = null;

        AntlrDatatypeRuleToken lv_needs_16_0 = null;

        AntlrDatatypeRuleToken lv_needs_20_0 = null;

        AntlrDatatypeRuleToken lv_needs_22_0 = null;

        AntlrDatatypeRuleToken lv_if_26_0 = null;

        EObject lv_environment_29_0 = null;

        EObject lv_strategy_32_0 = null;

        EObject lv_steps_36_0 = null;

        EObject lv_permissions_40_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2724:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_41= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2725:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_41= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2725:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_41= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2726:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_41= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2726:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2727:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2727:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2728:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2749:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_BEG_BLOCK) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMyDsl.g:2750:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_43); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2755:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2756:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2756:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2757:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2760:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2761:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2761:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )*
            loop67:
            do {
                int alt67=9;
                alt67 = dfa67.predict(input);
                switch (alt67) {
            	case 1 :
            	    // InternalMyDsl.g:2762:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2762:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2763:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2763:100: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2764:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2767:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2767:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2767:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2767:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getJobAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJobAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:2775:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2776:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2776:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2777:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2800:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2800:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2801:5: {...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2801:100: ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2802:6: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2805:9: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2805:10: {...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2805:19: (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2805:20: otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJobAccess().getRunsOnKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:2813:9: ( (lv_runsOn_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2814:10: (lv_runsOn_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2814:10: (lv_runsOn_9_0= ruleEString )
            	    // InternalMyDsl.g:2815:11: lv_runsOn_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getRunsOnEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2838:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2838:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:2839:5: {...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2839:100: ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalMyDsl.g:2840:6: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2843:9: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalMyDsl.g:2843:10: {...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2843:19: (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    // InternalMyDsl.g:2843:20: otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    {
            	    otherlv_10=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getJobAccess().getNeedsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_44); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJobAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:2851:9: ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    int alt63=3;
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
            	        alt63=1;
            	        }
            	        break;
            	    case RULE_BEG_BLOCK:
            	        {
            	        alt63=2;
            	        }
            	        break;
            	    case 27:
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
            	            // InternalMyDsl.g:2852:10: ( (lv_needs_12_0= ruleEString ) )
            	            {
            	            // InternalMyDsl.g:2852:10: ( (lv_needs_12_0= ruleEString ) )
            	            // InternalMyDsl.g:2853:11: (lv_needs_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2853:11: (lv_needs_12_0= ruleEString )
            	            // InternalMyDsl.g:2854:12: lv_needs_12_0= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_0_0());
            	            											
            	            pushFollow(FOLLOW_43);
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
            	            // InternalMyDsl.g:2872:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:2872:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            // InternalMyDsl.g:2873:11: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_13, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:2877:11: (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+
            	            int cnt61=0;
            	            loop61:
            	            do {
            	                int alt61=2;
            	                int LA61_0 = input.LA(1);

            	                if ( (LA61_0==26) ) {
            	                    alt61=1;
            	                }


            	                switch (alt61) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:2878:12: otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_14=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_14, grammarAccess.getJobAccess().getHyphenMinusKeyword_3_2_2_1_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:2882:12: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	            	    int alt59=2;
            	            	    int LA59_0 = input.LA(1);

            	            	    if ( (LA59_0==RULE_BEG_BLOCK) ) {
            	            	        alt59=1;
            	            	    }
            	            	    switch (alt59) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:2883:13: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_15, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:2888:12: ( (lv_needs_16_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2889:13: (lv_needs_16_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2889:13: (lv_needs_16_0= ruleEString )
            	            	    // InternalMyDsl.g:2890:14: lv_needs_16_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_1_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            	    // InternalMyDsl.g:2907:12: (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    int alt60=2;
            	            	    int LA60_0 = input.LA(1);

            	            	    if ( (LA60_0==RULE_END_BLOCK) ) {
            	            	        int LA60_1 = input.LA(2);

            	            	        if ( (LA60_1==RULE_END_BLOCK||LA60_1==26) ) {
            	            	            alt60=1;
            	            	        }
            	            	    }
            	            	    switch (alt60) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:2908:13: this_END_BLOCK_17= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

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

            	            this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_43); 

            	            											newLeafNode(this_END_BLOCK_18, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:2920:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            {
            	            // InternalMyDsl.g:2920:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            // InternalMyDsl.g:2921:11: otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']'
            	            {
            	            otherlv_19=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_3_2_2_2_0());
            	            										
            	            // InternalMyDsl.g:2925:11: ( (lv_needs_20_0= ruleEString ) )
            	            // InternalMyDsl.g:2926:12: (lv_needs_20_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2926:12: (lv_needs_20_0= ruleEString )
            	            // InternalMyDsl.g:2927:13: lv_needs_20_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:2944:11: (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )*
            	            loop62:
            	            do {
            	                int alt62=2;
            	                int LA62_0 = input.LA(1);

            	                if ( (LA62_0==30) ) {
            	                    alt62=1;
            	                }


            	                switch (alt62) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:2945:12: otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_21, grammarAccess.getJobAccess().getCommaKeyword_3_2_2_2_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:2949:12: ( (lv_needs_22_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2950:13: (lv_needs_22_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2950:13: (lv_needs_22_0= ruleEString )
            	            	    // InternalMyDsl.g:2951:14: lv_needs_22_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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

            	            otherlv_23=(Token)match(input,28,FOLLOW_43); 

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
            	    // InternalMyDsl.g:2981:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2981:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2982:5: {...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2982:100: ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2983:6: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2986:9: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2986:10: {...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2986:19: (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2986:20: otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getJobAccess().getIfKeyword_3_3_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJobAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:2994:9: ( (lv_if_26_0= ruleEString ) )
            	    // InternalMyDsl.g:2995:10: (lv_if_26_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2995:10: (lv_if_26_0= ruleEString )
            	    // InternalMyDsl.g:2996:11: lv_if_26_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getIfEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:3019:4: ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3019:4: ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) )
            	    // InternalMyDsl.g:3020:5: {...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:3020:100: ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) )
            	    // InternalMyDsl.g:3021:6: ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:3024:9: ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) )
            	    // InternalMyDsl.g:3024:10: {...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3024:19: (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) )
            	    // InternalMyDsl.g:3024:20: otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) )
            	    {
            	    otherlv_27=(Token)match(input,76,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getJobAccess().getEnvironmentKeyword_3_4_0());
            	    								
            	    otherlv_28=(Token)match(input,16,FOLLOW_45); 

            	    									newLeafNode(otherlv_28, grammarAccess.getJobAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:3032:9: ( (lv_environment_29_0= ruleEnvironment ) )
            	    // InternalMyDsl.g:3033:10: (lv_environment_29_0= ruleEnvironment )
            	    {
            	    // InternalMyDsl.g:3033:10: (lv_environment_29_0= ruleEnvironment )
            	    // InternalMyDsl.g:3034:11: lv_environment_29_0= ruleEnvironment
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_environment_29_0=ruleEnvironment();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"environment",
            	    												lv_environment_29_0,
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
            	case 6 :
            	    // InternalMyDsl.g:3057:4: ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3057:4: ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) )
            	    // InternalMyDsl.g:3058:5: {...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:3058:100: ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) )
            	    // InternalMyDsl.g:3059:6: ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:3062:9: ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) )
            	    // InternalMyDsl.g:3062:10: {...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3062:19: (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) )
            	    // InternalMyDsl.g:3062:20: otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) )
            	    {
            	    otherlv_30=(Token)match(input,54,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getJobAccess().getStrategyKeyword_3_5_0());
            	    								
            	    otherlv_31=(Token)match(input,16,FOLLOW_46); 

            	    									newLeafNode(otherlv_31, grammarAccess.getJobAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:3070:9: ( (lv_strategy_32_0= ruleStrategy ) )
            	    // InternalMyDsl.g:3071:10: (lv_strategy_32_0= ruleStrategy )
            	    {
            	    // InternalMyDsl.g:3071:10: (lv_strategy_32_0= ruleStrategy )
            	    // InternalMyDsl.g:3072:11: lv_strategy_32_0= ruleStrategy
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getStrategyStrategyParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_strategy_32_0=ruleStrategy();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"strategy",
            	    												lv_strategy_32_0,
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
            	case 7 :
            	    // InternalMyDsl.g:3095:4: ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:3095:4: ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3096:5: {...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:3096:100: ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3097:6: ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:3100:9: ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3100:10: {...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3100:19: (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3100:20: otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    {
            	    otherlv_33=(Token)match(input,39,FOLLOW_3); 

            	    									newLeafNode(otherlv_33, grammarAccess.getJobAccess().getStepsKeyword_3_6_0());
            	    								
            	    otherlv_34=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_34, grammarAccess.getJobAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:3108:9: (this_BEG_BLOCK_35= RULE_BEG_BLOCK )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_BEG_BLOCK) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalMyDsl.g:3109:10: this_BEG_BLOCK_35= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_35=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	            										newLeafNode(this_BEG_BLOCK_35, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_6_2());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3114:9: ( (lv_steps_36_0= ruleStep ) )+
            	    int cnt65=0;
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==26) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3115:10: (lv_steps_36_0= ruleStep )
            	    	    {
            	    	    // InternalMyDsl.g:3115:10: (lv_steps_36_0= ruleStep )
            	    	    // InternalMyDsl.g:3116:11: lv_steps_36_0= ruleStep
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_3_6_3_0());
            	    	    										
            	    	    pushFollow(FOLLOW_47);
            	    	    lv_steps_36_0=ruleStep();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"steps",
            	    	    												lv_steps_36_0,
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

            	    // InternalMyDsl.g:3133:9: (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==RULE_END_BLOCK) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalMyDsl.g:3134:10: this_END_BLOCK_37= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_37=(Token)match(input,RULE_END_BLOCK,FOLLOW_43); 

            	            										newLeafNode(this_END_BLOCK_37, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_6_4());
            	            									

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
            	case 8 :
            	    // InternalMyDsl.g:3145:4: ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3145:4: ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:3146:5: {...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:3146:100: ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:3147:6: ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:3150:9: ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:3150:10: {...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:3150:19: (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:3150:20: otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) )
            	    {
            	    otherlv_38=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_38, grammarAccess.getJobAccess().getPermissionsKeyword_3_7_0());
            	    								
            	    otherlv_39=(Token)match(input,16,FOLLOW_48); 

            	    									newLeafNode(otherlv_39, grammarAccess.getJobAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:3158:9: ( (lv_permissions_40_0= rulePermissions ) )
            	    // InternalMyDsl.g:3159:10: (lv_permissions_40_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:3159:10: (lv_permissions_40_0= rulePermissions )
            	    // InternalMyDsl.g:3160:11: lv_permissions_40_0= rulePermissions
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getPermissionsPermissionsParserRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
            	    lv_permissions_40_0=rulePermissions();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"permissions",
            	    												lv_permissions_40_0,
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

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:3190:3: (this_END_BLOCK_41= RULE_END_BLOCK )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_END_BLOCK) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:3191:4: this_END_BLOCK_41= RULE_END_BLOCK
                    {
                    this_END_BLOCK_41=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_41, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

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
    // InternalMyDsl.g:3200:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalMyDsl.g:3200:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:3201:2: iv_ruleStep= ruleStep EOF
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
    // InternalMyDsl.g:3207:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:3213:2: ( ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:3214:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:3214:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            // InternalMyDsl.g:3215:3: () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:3215:3: ()
            // InternalMyDsl.g:3216:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            // InternalMyDsl.g:3226:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_BEG_BLOCK) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:3227:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_50); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3232:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:3233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:3233:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:3234:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:3237:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:3238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:3238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop76:
            do {
                int alt76=11;
                alt76 = dfa76.predict(input);
                switch (alt76) {
            	case 1 :
            	    // InternalMyDsl.g:3239:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3239:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3240:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:3240:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3241:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:3244:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3244:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3244:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3244:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getStepAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:3252:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:3253:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3253:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:3254:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3277:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3277:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3278:5: {...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:3278:101: ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3279:6: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:3282:9: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3282:10: {...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3282:19: (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3282:20: otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,77,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStepAccess().getIdKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:3290:9: ( (lv_id_9_0= ruleEString ) )
            	    // InternalMyDsl.g:3291:10: (lv_id_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3291:10: (lv_id_9_0= ruleEString )
            	    // InternalMyDsl.g:3292:11: lv_id_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIdEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3315:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3315:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3316:5: {...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:3316:101: ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3317:6: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:3320:9: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3320:10: {...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3320:19: (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3320:20: otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,40,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStepAccess().getUsesKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStepAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:3328:9: ( (lv_uses_12_0= ruleEString ) )
            	    // InternalMyDsl.g:3329:10: (lv_uses_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3329:10: (lv_uses_12_0= ruleEString )
            	    // InternalMyDsl.g:3330:11: lv_uses_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getUsesEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3353:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3353:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3354:5: {...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:3354:101: ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3355:6: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:3358:9: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3358:10: {...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3358:19: (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3358:20: otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStepAccess().getRunKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getStepAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:3366:9: ( (lv_run_15_0= ruleEString ) )
            	    // InternalMyDsl.g:3367:10: (lv_run_15_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3367:10: (lv_run_15_0= ruleEString )
            	    // InternalMyDsl.g:3368:11: lv_run_15_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3391:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3391:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3392:5: {...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:3392:101: ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3393:6: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:3396:9: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3396:10: {...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3396:19: (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3396:20: otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getStepAccess().getIfKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getStepAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:3404:9: ( (lv_if_18_0= ruleEString ) )
            	    // InternalMyDsl.g:3405:10: (lv_if_18_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3405:10: (lv_if_18_0= ruleEString )
            	    // InternalMyDsl.g:3406:11: lv_if_18_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIfEStringParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3429:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3429:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3430:5: {...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:3430:101: ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3431:6: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:3434:9: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3434:10: {...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3434:19: (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3434:20: otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,78,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getStepAccess().getWorkingDirectoryKeyword_3_5_0());
            	    								
            	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_20, grammarAccess.getStepAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:3442:9: ( (lv_workingDirectory_21_0= ruleEString ) )
            	    // InternalMyDsl.g:3443:10: (lv_workingDirectory_21_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3443:10: (lv_workingDirectory_21_0= ruleEString )
            	    // InternalMyDsl.g:3444:11: lv_workingDirectory_21_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getWorkingDirectoryEStringParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3467:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3467:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3468:5: {...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:3468:101: ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3469:6: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:3472:9: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3472:10: {...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3472:19: (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3472:20: otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getStepAccess().getShellKeyword_3_6_0());
            	    								
            	    otherlv_23=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getStepAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:3480:9: ( (lv_shell_24_0= ruleEString ) )
            	    // InternalMyDsl.g:3481:10: (lv_shell_24_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3481:10: (lv_shell_24_0= ruleEString )
            	    // InternalMyDsl.g:3482:11: lv_shell_24_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getShellEStringParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3505:4: ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3505:4: ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:3506:5: {...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:3506:101: ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:3507:6: ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:3510:9: ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:3510:10: {...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3510:19: (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:3510:20: otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) )
            	    {
            	    otherlv_25=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getStepAccess().getContinueOnErrorKeyword_3_7_0());
            	    								
            	    otherlv_26=(Token)match(input,16,FOLLOW_38); 

            	    									newLeafNode(otherlv_26, grammarAccess.getStepAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:3518:9: ( (lv_continueOnError_27_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:3519:10: (lv_continueOnError_27_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:3519:10: (lv_continueOnError_27_0= ruleEBoolean )
            	    // InternalMyDsl.g:3520:11: lv_continueOnError_27_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getContinueOnErrorEBooleanParserRuleCall_3_7_2_0());
            	    										
            	    pushFollow(FOLLOW_50);
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
            	    // InternalMyDsl.g:3543:4: ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3543:4: ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3544:5: {...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalMyDsl.g:3544:101: ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3545:6: ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalMyDsl.g:3548:9: ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3548:10: {...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3548:19: (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3548:20: otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? )
            	    {
            	    otherlv_28=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_28, grammarAccess.getStepAccess().getWithKeyword_3_8_0());
            	    								
            	    otherlv_29=(Token)match(input,16,FOLLOW_11); 

            	    									newLeafNode(otherlv_29, grammarAccess.getStepAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalMyDsl.g:3556:9: ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3557:10: (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3557:10: (this_BEG_BLOCK_30= RULE_BEG_BLOCK )?
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==RULE_BEG_BLOCK) ) {
            	        alt70=1;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalMyDsl.g:3558:11: this_BEG_BLOCK_30= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_30=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            	            											newLeafNode(this_BEG_BLOCK_30, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_8_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3563:10: ( (lv_with_31_0= ruleKeyValuePair ) )+
            	    int cnt71=0;
            	    loop71:
            	    do {
            	        int alt71=2;
            	        alt71 = dfa71.predict(input);
            	        switch (alt71) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3564:11: (lv_with_31_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3564:11: (lv_with_31_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3565:12: lv_with_31_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getWithKeyValuePairParserRuleCall_3_8_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_51);
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
            	    	    if ( cnt71 >= 1 ) break loop71;
            	                EarlyExitException eee =
            	                    new EarlyExitException(71, input);
            	                throw eee;
            	        }
            	        cnt71++;
            	    } while (true);

            	    // InternalMyDsl.g:3582:10: (this_END_BLOCK_32= RULE_END_BLOCK )?
            	    int alt72=2;
            	    int LA72_0 = input.LA(1);

            	    if ( (LA72_0==RULE_END_BLOCK) ) {
            	        alt72=1;
            	    }
            	    switch (alt72) {
            	        case 1 :
            	            // InternalMyDsl.g:3583:11: this_END_BLOCK_32= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_32=(Token)match(input,RULE_END_BLOCK,FOLLOW_50); 

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
            	    // InternalMyDsl.g:3595:4: ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3595:4: ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3596:5: {...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // InternalMyDsl.g:3596:101: ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3597:6: ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9);
            	    					
            	    // InternalMyDsl.g:3600:9: ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3600:10: {...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3600:19: (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3600:20: otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    {
            	    otherlv_33=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_33, grammarAccess.getStepAccess().getEnvKeyword_3_9_0());
            	    								
            	    otherlv_34=(Token)match(input,16,FOLLOW_11); 

            	    									newLeafNode(otherlv_34, grammarAccess.getStepAccess().getColonKeyword_3_9_1());
            	    								
            	    // InternalMyDsl.g:3608:9: ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3609:10: (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3609:10: (this_BEG_BLOCK_35= RULE_BEG_BLOCK )?
            	    int alt73=2;
            	    int LA73_0 = input.LA(1);

            	    if ( (LA73_0==RULE_BEG_BLOCK) ) {
            	        alt73=1;
            	    }
            	    switch (alt73) {
            	        case 1 :
            	            // InternalMyDsl.g:3610:11: this_BEG_BLOCK_35= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_35=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            	            											newLeafNode(this_BEG_BLOCK_35, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_9_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3615:10: ( (lv_env_36_0= ruleKeyValuePair ) )+
            	    int cnt74=0;
            	    loop74:
            	    do {
            	        int alt74=2;
            	        alt74 = dfa74.predict(input);
            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3616:11: (lv_env_36_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3616:11: (lv_env_36_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3617:12: lv_env_36_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getEnvKeyValuePairParserRuleCall_3_9_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_51);
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
            	    	    if ( cnt74 >= 1 ) break loop74;
            	                EarlyExitException eee =
            	                    new EarlyExitException(74, input);
            	                throw eee;
            	        }
            	        cnt74++;
            	    } while (true);

            	    // InternalMyDsl.g:3634:10: (this_END_BLOCK_37= RULE_END_BLOCK )?
            	    int alt75=2;
            	    int LA75_0 = input.LA(1);

            	    if ( (LA75_0==RULE_END_BLOCK) ) {
            	        alt75=1;
            	    }
            	    switch (alt75) {
            	        case 1 :
            	            // InternalMyDsl.g:3635:11: this_END_BLOCK_37= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_37=(Token)match(input,RULE_END_BLOCK,FOLLOW_50); 

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
            	    break loop76;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:3654:3: (this_END_BLOCK_38= RULE_END_BLOCK )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_END_BLOCK) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMyDsl.g:3655:4: this_END_BLOCK_38= RULE_END_BLOCK
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
    // InternalMyDsl.g:3664:1: entryRuleStrategy returns [EObject current=null] : iv_ruleStrategy= ruleStrategy EOF ;
    public final EObject entryRuleStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategy = null;


        try {
            // InternalMyDsl.g:3664:49: (iv_ruleStrategy= ruleStrategy EOF )
            // InternalMyDsl.g:3665:2: iv_ruleStrategy= ruleStrategy EOF
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
    // InternalMyDsl.g:3671:1: ruleStrategy returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:3677:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:3678:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:3678:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:3679:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:3679:3: ()
            // InternalMyDsl.g:3680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStrategyAccess().getStrategyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:3686:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_BEG_BLOCK) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalMyDsl.g:3687:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_52); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getStrategyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3692:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:3693:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:3693:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:3694:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:3697:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )* )
            // InternalMyDsl.g:3698:6: ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:3698:6: ( ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) ) )*
            loop79:
            do {
                int alt79=3;
                int LA79_0 = input.LA(1);

                if ( LA79_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0) ) {
                    alt79=1;
                }
                else if ( LA79_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1) ) {
                    alt79=2;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMyDsl.g:3699:4: ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3699:4: ({...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:3700:5: {...}? => ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:3700:105: ( ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:3701:6: ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:3704:9: ({...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:3704:10: {...}? => (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "true");
            	    }
            	    // InternalMyDsl.g:3704:19: (otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:3704:20: otherlv_3= 'fail-fast' otherlv_4= ':' ( (lv_failFast_5_0= ruleEBoolean ) )
            	    {
            	    otherlv_3=(Token)match(input,55,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getFailFastKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_38); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStrategyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:3712:9: ( (lv_failFast_5_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:3713:10: (lv_failFast_5_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:3713:10: (lv_failFast_5_0= ruleEBoolean )
            	    // InternalMyDsl.g:3714:11: lv_failFast_5_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getStrategyAccess().getFailFastEBooleanParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    // InternalMyDsl.g:3737:4: ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3737:4: ({...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) ) )
            	    // InternalMyDsl.g:3738:5: {...}? => ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:3738:105: ( ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) ) )
            	    // InternalMyDsl.g:3739:6: ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStrategyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:3742:9: ({...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) ) )
            	    // InternalMyDsl.g:3742:10: {...}? => (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStrategy", "true");
            	    }
            	    // InternalMyDsl.g:3742:19: (otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) ) )
            	    // InternalMyDsl.g:3742:20: otherlv_6= 'matrix' otherlv_7= ':' ( (lv_matrix_8_0= ruleMatrix ) )
            	    {
            	    otherlv_6=(Token)match(input,56,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getStrategyAccess().getMatrixKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_53); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStrategyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:3750:9: ( (lv_matrix_8_0= ruleMatrix ) )
            	    // InternalMyDsl.g:3751:10: (lv_matrix_8_0= ruleMatrix )
            	    {
            	    // InternalMyDsl.g:3751:10: (lv_matrix_8_0= ruleMatrix )
            	    // InternalMyDsl.g:3752:11: lv_matrix_8_0= ruleMatrix
            	    {

            	    											newCompositeNode(grammarAccess.getStrategyAccess().getMatrixMatrixParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_52);
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
            	    break loop79;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStrategyAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:3782:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_END_BLOCK) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMyDsl.g:3783:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:3792:1: entryRuleMatrix returns [EObject current=null] : iv_ruleMatrix= ruleMatrix EOF ;
    public final EObject entryRuleMatrix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMatrix = null;


        try {
            // InternalMyDsl.g:3792:47: (iv_ruleMatrix= ruleMatrix EOF )
            // InternalMyDsl.g:3793:2: iv_ruleMatrix= ruleMatrix EOF
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
    // InternalMyDsl.g:3799:1: ruleMatrix returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_84= RULE_END_BLOCK )? ) ;
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
        Token otherlv_77=null;
        Token this_BEG_BLOCK_78=null;
        Token otherlv_79=null;
        Token this_BEG_BLOCK_80=null;
        Token this_END_BLOCK_82=null;
        Token this_END_BLOCK_83=null;
        Token this_END_BLOCK_84=null;
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

        EObject lv_include_73_0 = null;

        EObject lv_exclude_81_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:3805:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_84= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:3806:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_84= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:3806:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_84= RULE_END_BLOCK )? )
            // InternalMyDsl.g:3807:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) ) ) (this_END_BLOCK_84= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:3807:3: ()
            // InternalMyDsl.g:3808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMatrixAccess().getMatrixAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:3814:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==RULE_BEG_BLOCK) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMyDsl.g:3815:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_54); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:3820:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) ) )
            // InternalMyDsl.g:3821:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:3821:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* ) )
            // InternalMyDsl.g:3822:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:3825:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )* )
            // InternalMyDsl.g:3826:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )*
            {
            // InternalMyDsl.g:3826:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) ) )*
            loop113:
            do {
                int alt113=8;
                int LA113_0 = input.LA(1);

                if ( LA113_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0) ) {
                    alt113=1;
                }
                else if ( LA113_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1) ) {
                    alt113=2;
                }
                else if ( LA113_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2) ) {
                    alt113=3;
                }
                else if ( LA113_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3) ) {
                    alt113=4;
                }
                else if ( LA113_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4) ) {
                    alt113=5;
                }
                else if ( LA113_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5) ) {
                    alt113=6;
                }
                else if ( LA113_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6) ) {
                    alt113=7;
                }


                switch (alt113) {
            	case 1 :
            	    // InternalMyDsl.g:3827:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3827:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:3828:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:3828:103: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:3829:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:3832:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:3832:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:3832:19: (otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:3832:20: otherlv_3= 'os' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMatrixAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_4, grammarAccess.getMatrixAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:3840:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt86=2;
            	    int LA86_0 = input.LA(1);

            	    if ( (LA86_0==RULE_BEG_BLOCK) ) {
            	        alt86=1;
            	    }
            	    else if ( (LA86_0==27) ) {
            	        alt86=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 86, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt86) {
            	        case 1 :
            	            // InternalMyDsl.g:3841:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:3841:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:3842:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:3846:11: (otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )+
            	            int cnt84=0;
            	            loop84:
            	            do {
            	                int alt84=2;
            	                int LA84_0 = input.LA(1);

            	                if ( (LA84_0==26) ) {
            	                    alt84=1;
            	                }


            	                switch (alt84) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:3847:12: otherlv_6= '-' (this_BEG_BLOCK_7= RULE_BEG_BLOCK )? ( (lv_os_8_0= ruleEString ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_6=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:3851:12: (this_BEG_BLOCK_7= RULE_BEG_BLOCK )?
            	            	    int alt82=2;
            	            	    int LA82_0 = input.LA(1);

            	            	    if ( (LA82_0==RULE_BEG_BLOCK) ) {
            	            	        alt82=1;
            	            	    }
            	            	    switch (alt82) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:3852:13: this_BEG_BLOCK_7= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_7, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:3857:12: ( (lv_os_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:3858:13: (lv_os_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:3858:13: (lv_os_8_0= ruleEString )
            	            	    // InternalMyDsl.g:3859:14: lv_os_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOsEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            	    // InternalMyDsl.g:3876:12: (this_END_BLOCK_9= RULE_END_BLOCK )?
            	            	    int alt83=2;
            	            	    int LA83_0 = input.LA(1);

            	            	    if ( (LA83_0==RULE_END_BLOCK) ) {
            	            	        int LA83_1 = input.LA(2);

            	            	        if ( (LA83_1==RULE_END_BLOCK||LA83_1==26) ) {
            	            	            alt83=1;
            	            	        }
            	            	    }
            	            	    switch (alt83) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:3877:13: this_END_BLOCK_9= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	            	            													newLeafNode(this_END_BLOCK_9, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt84 >= 1 ) break loop84;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(84, input);
            	                        throw eee;
            	                }
            	                cnt84++;
            	            } while (true);

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_54); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:3889:10: (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:3889:10: (otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:3890:11: otherlv_11= '[' ( (lv_os_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:3894:11: ( (lv_os_12_0= ruleEString ) )
            	            // InternalMyDsl.g:3895:12: (lv_os_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:3895:12: (lv_os_12_0= ruleEString )
            	            // InternalMyDsl.g:3896:13: lv_os_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getOsEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:3913:11: (otherlv_13= ',' ( (lv_os_14_0= ruleEString ) ) )*
            	            loop85:
            	            do {
            	                int alt85=2;
            	                int LA85_0 = input.LA(1);

            	                if ( (LA85_0==30) ) {
            	                    alt85=1;
            	                }


            	                switch (alt85) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:3914:12: otherlv_13= ',' ( (lv_os_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getMatrixAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:3918:12: ( (lv_os_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:3919:13: (lv_os_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:3919:13: (lv_os_14_0= ruleEString )
            	            	    // InternalMyDsl.g:3920:14: lv_os_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOsEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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
            	            	    break loop85;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,28,FOLLOW_54); 

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
            	    // InternalMyDsl.g:3950:4: ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3950:4: ({...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:3951:5: {...}? => ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:3951:103: ( ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:3952:6: ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:3955:9: ({...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:3955:10: {...}? => (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:3955:19: (otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:3955:20: otherlv_16= 'build-type' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getMatrixAccess().getBuildTypeKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_17, grammarAccess.getMatrixAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:3963:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt91=2;
            	    int LA91_0 = input.LA(1);

            	    if ( (LA91_0==RULE_BEG_BLOCK) ) {
            	        alt91=1;
            	    }
            	    else if ( (LA91_0==27) ) {
            	        alt91=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 91, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt91) {
            	        case 1 :
            	            // InternalMyDsl.g:3964:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:3964:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:3965:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:3969:11: (otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )? )+
            	            int cnt89=0;
            	            loop89:
            	            do {
            	                int alt89=2;
            	                int LA89_0 = input.LA(1);

            	                if ( (LA89_0==26) ) {
            	                    alt89=1;
            	                }


            	                switch (alt89) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:3970:12: otherlv_19= '-' (this_BEG_BLOCK_20= RULE_BEG_BLOCK )? ( (lv_buildType_21_0= ruleEString ) ) (this_END_BLOCK_22= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_19=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:3974:12: (this_BEG_BLOCK_20= RULE_BEG_BLOCK )?
            	            	    int alt87=2;
            	            	    int LA87_0 = input.LA(1);

            	            	    if ( (LA87_0==RULE_BEG_BLOCK) ) {
            	            	        alt87=1;
            	            	    }
            	            	    switch (alt87) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:3975:13: this_BEG_BLOCK_20= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_20, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:3980:12: ( (lv_buildType_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:3981:13: (lv_buildType_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:3981:13: (lv_buildType_21_0= ruleEString )
            	            	    // InternalMyDsl.g:3982:14: lv_buildType_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getBuildTypeEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            	    // InternalMyDsl.g:3999:12: (this_END_BLOCK_22= RULE_END_BLOCK )?
            	            	    int alt88=2;
            	            	    int LA88_0 = input.LA(1);

            	            	    if ( (LA88_0==RULE_END_BLOCK) ) {
            	            	        int LA88_1 = input.LA(2);

            	            	        if ( (LA88_1==RULE_END_BLOCK||LA88_1==26) ) {
            	            	            alt88=1;
            	            	        }
            	            	    }
            	            	    switch (alt88) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4000:13: this_END_BLOCK_22= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	            	            													newLeafNode(this_END_BLOCK_22, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt89 >= 1 ) break loop89;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(89, input);
            	                        throw eee;
            	                }
            	                cnt89++;
            	            } while (true);

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_54); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4012:10: (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:4012:10: (otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:4013:11: otherlv_24= '[' ( (lv_buildType_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:4017:11: ( (lv_buildType_25_0= ruleEString ) )
            	            // InternalMyDsl.g:4018:12: (lv_buildType_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4018:12: (lv_buildType_25_0= ruleEString )
            	            // InternalMyDsl.g:4019:13: lv_buildType_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getBuildTypeEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:4036:11: (otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) ) )*
            	            loop90:
            	            do {
            	                int alt90=2;
            	                int LA90_0 = input.LA(1);

            	                if ( (LA90_0==30) ) {
            	                    alt90=1;
            	                }


            	                switch (alt90) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4037:12: otherlv_26= ',' ( (lv_buildType_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getMatrixAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4041:12: ( (lv_buildType_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4042:13: (lv_buildType_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4042:13: (lv_buildType_27_0= ruleEString )
            	            	    // InternalMyDsl.g:4043:14: lv_buildType_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getBuildTypeEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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
            	            	    break loop90;
            	                }
            	            } while (true);

            	            otherlv_28=(Token)match(input,28,FOLLOW_54); 

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
            	    // InternalMyDsl.g:4073:4: ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4073:4: ({...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4074:5: {...}? => ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:4074:103: ( ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4075:6: ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:4078:9: ({...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) ) )
            	    // InternalMyDsl.g:4078:10: {...}? => (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4078:19: (otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) ) )
            	    // InternalMyDsl.g:4078:20: otherlv_29= 'c-compiler' otherlv_30= ':' ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) )
            	    {
            	    otherlv_29=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_29, grammarAccess.getMatrixAccess().getCCompilerKeyword_2_2_0());
            	    								
            	    otherlv_30=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_30, grammarAccess.getMatrixAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:4086:9: ( (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK ) | (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' ) )
            	    int alt96=2;
            	    int LA96_0 = input.LA(1);

            	    if ( (LA96_0==RULE_BEG_BLOCK) ) {
            	        alt96=1;
            	    }
            	    else if ( (LA96_0==27) ) {
            	        alt96=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 96, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt96) {
            	        case 1 :
            	            // InternalMyDsl.g:4087:10: (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4087:10: (this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4088:11: this_BEG_BLOCK_31= RULE_BEG_BLOCK (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+ this_END_BLOCK_36= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_31=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_31, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0_0());
            	            										
            	            // InternalMyDsl.g:4092:11: (otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )+
            	            int cnt94=0;
            	            loop94:
            	            do {
            	                int alt94=2;
            	                int LA94_0 = input.LA(1);

            	                if ( (LA94_0==26) ) {
            	                    alt94=1;
            	                }


            	                switch (alt94) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4093:12: otherlv_32= '-' (this_BEG_BLOCK_33= RULE_BEG_BLOCK )? ( (lv_cCompiler_34_0= ruleEString ) ) (this_END_BLOCK_35= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_32=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_32, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_2_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4097:12: (this_BEG_BLOCK_33= RULE_BEG_BLOCK )?
            	            	    int alt92=2;
            	            	    int LA92_0 = input.LA(1);

            	            	    if ( (LA92_0==RULE_BEG_BLOCK) ) {
            	            	        alt92=1;
            	            	    }
            	            	    switch (alt92) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4098:13: this_BEG_BLOCK_33= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_33=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_33, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4103:12: ( (lv_cCompiler_34_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4104:13: (lv_cCompiler_34_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4104:13: (lv_cCompiler_34_0= ruleEString )
            	            	    // InternalMyDsl.g:4105:14: lv_cCompiler_34_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getCCompilerEStringParserRuleCall_2_2_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            	    // InternalMyDsl.g:4122:12: (this_END_BLOCK_35= RULE_END_BLOCK )?
            	            	    int alt93=2;
            	            	    int LA93_0 = input.LA(1);

            	            	    if ( (LA93_0==RULE_END_BLOCK) ) {
            	            	        int LA93_1 = input.LA(2);

            	            	        if ( (LA93_1==RULE_END_BLOCK||LA93_1==26) ) {
            	            	            alt93=1;
            	            	        }
            	            	    }
            	            	    switch (alt93) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4123:13: this_END_BLOCK_35= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_35=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	            	            													newLeafNode(this_END_BLOCK_35, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_2_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt94 >= 1 ) break loop94;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(94, input);
            	                        throw eee;
            	                }
            	                cnt94++;
            	            } while (true);

            	            this_END_BLOCK_36=(Token)match(input,RULE_END_BLOCK,FOLLOW_54); 

            	            											newLeafNode(this_END_BLOCK_36, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_2_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4135:10: (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' )
            	            {
            	            // InternalMyDsl.g:4135:10: (otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']' )
            	            // InternalMyDsl.g:4136:11: otherlv_37= '[' ( (lv_cCompiler_38_0= ruleEString ) ) (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )* otherlv_41= ']'
            	            {
            	            otherlv_37=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_37, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:4140:11: ( (lv_cCompiler_38_0= ruleEString ) )
            	            // InternalMyDsl.g:4141:12: (lv_cCompiler_38_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4141:12: (lv_cCompiler_38_0= ruleEString )
            	            // InternalMyDsl.g:4142:13: lv_cCompiler_38_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getCCompilerEStringParserRuleCall_2_2_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:4159:11: (otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) ) )*
            	            loop95:
            	            do {
            	                int alt95=2;
            	                int LA95_0 = input.LA(1);

            	                if ( (LA95_0==30) ) {
            	                    alt95=1;
            	                }


            	                switch (alt95) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4160:12: otherlv_39= ',' ( (lv_cCompiler_40_0= ruleEString ) )
            	            	    {
            	            	    otherlv_39=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_39, grammarAccess.getMatrixAccess().getCommaKeyword_2_2_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4164:12: ( (lv_cCompiler_40_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4165:13: (lv_cCompiler_40_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4165:13: (lv_cCompiler_40_0= ruleEString )
            	            	    // InternalMyDsl.g:4166:14: lv_cCompiler_40_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getCCompilerEStringParserRuleCall_2_2_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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
            	            	    break loop95;
            	                }
            	            } while (true);

            	            otherlv_41=(Token)match(input,28,FOLLOW_54); 

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
            	    // InternalMyDsl.g:4196:4: ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4196:4: ({...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4197:5: {...}? => ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:4197:103: ( ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4198:6: ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:4201:9: ({...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) ) )
            	    // InternalMyDsl.g:4201:10: {...}? => (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4201:19: (otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) ) )
            	    // InternalMyDsl.g:4201:20: otherlv_42= 'otp' otherlv_43= ':' ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) )
            	    {
            	    otherlv_42=(Token)match(input,61,FOLLOW_3); 

            	    									newLeafNode(otherlv_42, grammarAccess.getMatrixAccess().getOtpKeyword_2_3_0());
            	    								
            	    otherlv_43=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_43, grammarAccess.getMatrixAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:4209:9: ( (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK ) | (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' ) )
            	    int alt101=2;
            	    int LA101_0 = input.LA(1);

            	    if ( (LA101_0==RULE_BEG_BLOCK) ) {
            	        alt101=1;
            	    }
            	    else if ( (LA101_0==27) ) {
            	        alt101=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 101, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt101) {
            	        case 1 :
            	            // InternalMyDsl.g:4210:10: (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4210:10: (this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4211:11: this_BEG_BLOCK_44= RULE_BEG_BLOCK (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+ this_END_BLOCK_49= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_44=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_44, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_0());
            	            										
            	            // InternalMyDsl.g:4215:11: (otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )? )+
            	            int cnt99=0;
            	            loop99:
            	            do {
            	                int alt99=2;
            	                int LA99_0 = input.LA(1);

            	                if ( (LA99_0==26) ) {
            	                    alt99=1;
            	                }


            	                switch (alt99) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4216:12: otherlv_45= '-' (this_BEG_BLOCK_46= RULE_BEG_BLOCK )? ( (lv_otp_47_0= ruleEString ) ) (this_END_BLOCK_48= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_45=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_45, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_3_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4220:12: (this_BEG_BLOCK_46= RULE_BEG_BLOCK )?
            	            	    int alt97=2;
            	            	    int LA97_0 = input.LA(1);

            	            	    if ( (LA97_0==RULE_BEG_BLOCK) ) {
            	            	        alt97=1;
            	            	    }
            	            	    switch (alt97) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4221:13: this_BEG_BLOCK_46= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_46=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_46, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4226:12: ( (lv_otp_47_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4227:13: (lv_otp_47_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4227:13: (lv_otp_47_0= ruleEString )
            	            	    // InternalMyDsl.g:4228:14: lv_otp_47_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOtpEStringParserRuleCall_2_3_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            	    // InternalMyDsl.g:4245:12: (this_END_BLOCK_48= RULE_END_BLOCK )?
            	            	    int alt98=2;
            	            	    int LA98_0 = input.LA(1);

            	            	    if ( (LA98_0==RULE_END_BLOCK) ) {
            	            	        int LA98_1 = input.LA(2);

            	            	        if ( (LA98_1==RULE_END_BLOCK||LA98_1==26) ) {
            	            	            alt98=1;
            	            	        }
            	            	    }
            	            	    switch (alt98) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4246:13: this_END_BLOCK_48= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_48=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	            	            													newLeafNode(this_END_BLOCK_48, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt99 >= 1 ) break loop99;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(99, input);
            	                        throw eee;
            	                }
            	                cnt99++;
            	            } while (true);

            	            this_END_BLOCK_49=(Token)match(input,RULE_END_BLOCK,FOLLOW_54); 

            	            											newLeafNode(this_END_BLOCK_49, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4258:10: (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' )
            	            {
            	            // InternalMyDsl.g:4258:10: (otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']' )
            	            // InternalMyDsl.g:4259:11: otherlv_50= '[' ( (lv_otp_51_0= ruleEString ) ) (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )* otherlv_54= ']'
            	            {
            	            otherlv_50=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_50, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_3_2_1_0());
            	            										
            	            // InternalMyDsl.g:4263:11: ( (lv_otp_51_0= ruleEString ) )
            	            // InternalMyDsl.g:4264:12: (lv_otp_51_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4264:12: (lv_otp_51_0= ruleEString )
            	            // InternalMyDsl.g:4265:13: lv_otp_51_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getOtpEStringParserRuleCall_2_3_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:4282:11: (otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) ) )*
            	            loop100:
            	            do {
            	                int alt100=2;
            	                int LA100_0 = input.LA(1);

            	                if ( (LA100_0==30) ) {
            	                    alt100=1;
            	                }


            	                switch (alt100) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4283:12: otherlv_52= ',' ( (lv_otp_53_0= ruleEString ) )
            	            	    {
            	            	    otherlv_52=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_52, grammarAccess.getMatrixAccess().getCommaKeyword_2_3_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4287:12: ( (lv_otp_53_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4288:13: (lv_otp_53_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4288:13: (lv_otp_53_0= ruleEString )
            	            	    // InternalMyDsl.g:4289:14: lv_otp_53_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getOtpEStringParserRuleCall_2_3_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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
            	            	    break loop100;
            	                }
            	            } while (true);

            	            otherlv_54=(Token)match(input,28,FOLLOW_54); 

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
            	    // InternalMyDsl.g:4319:4: ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4319:4: ({...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:4320:5: {...}? => ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:4320:103: ( ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) ) )
            	    // InternalMyDsl.g:4321:6: ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:4324:9: ({...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) ) )
            	    // InternalMyDsl.g:4324:10: {...}? => (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4324:19: (otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) ) )
            	    // InternalMyDsl.g:4324:20: otherlv_55= 'elixir' otherlv_56= ':' ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) )
            	    {
            	    otherlv_55=(Token)match(input,62,FOLLOW_3); 

            	    									newLeafNode(otherlv_55, grammarAccess.getMatrixAccess().getElixirKeyword_2_4_0());
            	    								
            	    otherlv_56=(Token)match(input,16,FOLLOW_24); 

            	    									newLeafNode(otherlv_56, grammarAccess.getMatrixAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:4332:9: ( (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK ) | (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' ) )
            	    int alt106=2;
            	    int LA106_0 = input.LA(1);

            	    if ( (LA106_0==RULE_BEG_BLOCK) ) {
            	        alt106=1;
            	    }
            	    else if ( (LA106_0==27) ) {
            	        alt106=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 106, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt106) {
            	        case 1 :
            	            // InternalMyDsl.g:4333:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:4333:10: (this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK )
            	            // InternalMyDsl.g:4334:11: this_BEG_BLOCK_57= RULE_BEG_BLOCK (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+ this_END_BLOCK_62= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_57=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	            											newLeafNode(this_BEG_BLOCK_57, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_4_2_0_0());
            	            										
            	            // InternalMyDsl.g:4338:11: (otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )? )+
            	            int cnt104=0;
            	            loop104:
            	            do {
            	                int alt104=2;
            	                int LA104_0 = input.LA(1);

            	                if ( (LA104_0==26) ) {
            	                    alt104=1;
            	                }


            	                switch (alt104) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4339:12: otherlv_58= '-' (this_BEG_BLOCK_59= RULE_BEG_BLOCK )? ( (lv_elixir_60_0= ruleEString ) ) (this_END_BLOCK_61= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_58=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_58, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_4_2_0_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:4343:12: (this_BEG_BLOCK_59= RULE_BEG_BLOCK )?
            	            	    int alt102=2;
            	            	    int LA102_0 = input.LA(1);

            	            	    if ( (LA102_0==RULE_BEG_BLOCK) ) {
            	            	        alt102=1;
            	            	    }
            	            	    switch (alt102) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4344:13: this_BEG_BLOCK_59= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_59=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_59, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_4_2_0_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:4349:12: ( (lv_elixir_60_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4350:13: (lv_elixir_60_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4350:13: (lv_elixir_60_0= ruleEString )
            	            	    // InternalMyDsl.g:4351:14: lv_elixir_60_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getElixirEStringParserRuleCall_2_4_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            	    // InternalMyDsl.g:4368:12: (this_END_BLOCK_61= RULE_END_BLOCK )?
            	            	    int alt103=2;
            	            	    int LA103_0 = input.LA(1);

            	            	    if ( (LA103_0==RULE_END_BLOCK) ) {
            	            	        int LA103_1 = input.LA(2);

            	            	        if ( (LA103_1==RULE_END_BLOCK||LA103_1==26) ) {
            	            	            alt103=1;
            	            	        }
            	            	    }
            	            	    switch (alt103) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:4369:13: this_END_BLOCK_61= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_61=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	            	            													newLeafNode(this_END_BLOCK_61, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_4_2_0_1_3());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt104 >= 1 ) break loop104;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(104, input);
            	                        throw eee;
            	                }
            	                cnt104++;
            	            } while (true);

            	            this_END_BLOCK_62=(Token)match(input,RULE_END_BLOCK,FOLLOW_54); 

            	            											newLeafNode(this_END_BLOCK_62, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_4_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:4381:10: (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' )
            	            {
            	            // InternalMyDsl.g:4381:10: (otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']' )
            	            // InternalMyDsl.g:4382:11: otherlv_63= '[' ( (lv_elixir_64_0= ruleEString ) ) (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )* otherlv_67= ']'
            	            {
            	            otherlv_63=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_63, grammarAccess.getMatrixAccess().getLeftSquareBracketKeyword_2_4_2_1_0());
            	            										
            	            // InternalMyDsl.g:4386:11: ( (lv_elixir_64_0= ruleEString ) )
            	            // InternalMyDsl.g:4387:12: (lv_elixir_64_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:4387:12: (lv_elixir_64_0= ruleEString )
            	            // InternalMyDsl.g:4388:13: lv_elixir_64_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getMatrixAccess().getElixirEStringParserRuleCall_2_4_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_28);
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

            	            // InternalMyDsl.g:4405:11: (otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) ) )*
            	            loop105:
            	            do {
            	                int alt105=2;
            	                int LA105_0 = input.LA(1);

            	                if ( (LA105_0==30) ) {
            	                    alt105=1;
            	                }


            	                switch (alt105) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:4406:12: otherlv_65= ',' ( (lv_elixir_66_0= ruleEString ) )
            	            	    {
            	            	    otherlv_65=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_65, grammarAccess.getMatrixAccess().getCommaKeyword_2_4_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:4410:12: ( (lv_elixir_66_0= ruleEString ) )
            	            	    // InternalMyDsl.g:4411:13: (lv_elixir_66_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:4411:13: (lv_elixir_66_0= ruleEString )
            	            	    // InternalMyDsl.g:4412:14: lv_elixir_66_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getMatrixAccess().getElixirEStringParserRuleCall_2_4_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_28);
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
            	            	    break loop105;
            	                }
            	            } while (true);

            	            otherlv_67=(Token)match(input,28,FOLLOW_54); 

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
            	    // InternalMyDsl.g:4442:4: ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:4442:4: ({...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:4443:5: {...}? => ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:4443:103: ( ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:4444:6: ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:4447:9: ({...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:4447:10: {...}? => (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4447:19: (otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK )
            	    // InternalMyDsl.g:4447:20: otherlv_68= 'include' otherlv_69= ':' this_BEG_BLOCK_70= RULE_BEG_BLOCK (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+ this_END_BLOCK_75= RULE_END_BLOCK
            	    {
            	    otherlv_68=(Token)match(input,63,FOLLOW_3); 

            	    									newLeafNode(otherlv_68, grammarAccess.getMatrixAccess().getIncludeKeyword_2_5_0());
            	    								
            	    otherlv_69=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_69, grammarAccess.getMatrixAccess().getColonKeyword_2_5_1());
            	    								
            	    this_BEG_BLOCK_70=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	    									newLeafNode(this_BEG_BLOCK_70, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_5_2());
            	    								
            	    // InternalMyDsl.g:4459:9: (otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )? )+
            	    int cnt109=0;
            	    loop109:
            	    do {
            	        int alt109=2;
            	        int LA109_0 = input.LA(1);

            	        if ( (LA109_0==26) ) {
            	            alt109=1;
            	        }


            	        switch (alt109) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4460:10: otherlv_71= '-' (this_BEG_BLOCK_72= RULE_BEG_BLOCK )? ( (lv_include_73_0= ruleInclude ) ) (this_END_BLOCK_74= RULE_END_BLOCK )?
            	    	    {
            	    	    otherlv_71=(Token)match(input,26,FOLLOW_55); 

            	    	    										newLeafNode(otherlv_71, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_5_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4464:10: (this_BEG_BLOCK_72= RULE_BEG_BLOCK )?
            	    	    int alt107=2;
            	    	    int LA107_0 = input.LA(1);

            	    	    if ( (LA107_0==RULE_BEG_BLOCK) ) {
            	    	        alt107=1;
            	    	    }
            	    	    switch (alt107) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:4465:11: this_BEG_BLOCK_72= RULE_BEG_BLOCK
            	    	            {
            	    	            this_BEG_BLOCK_72=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_55); 

            	    	            											newLeafNode(this_BEG_BLOCK_72, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_5_3_1());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalMyDsl.g:4470:10: ( (lv_include_73_0= ruleInclude ) )
            	    	    // InternalMyDsl.g:4471:11: (lv_include_73_0= ruleInclude )
            	    	    {
            	    	    // InternalMyDsl.g:4471:11: (lv_include_73_0= ruleInclude )
            	    	    // InternalMyDsl.g:4472:12: lv_include_73_0= ruleInclude
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMatrixAccess().getIncludeIncludeParserRuleCall_2_5_3_2_0());
            	    	    											
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_include_73_0=ruleInclude();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"include",
            	    	    													lv_include_73_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.Include");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:4489:10: (this_END_BLOCK_74= RULE_END_BLOCK )?
            	    	    int alt108=2;
            	    	    int LA108_0 = input.LA(1);

            	    	    if ( (LA108_0==RULE_END_BLOCK) ) {
            	    	        int LA108_1 = input.LA(2);

            	    	        if ( (LA108_1==RULE_END_BLOCK||LA108_1==26) ) {
            	    	            alt108=1;
            	    	        }
            	    	    }
            	    	    switch (alt108) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:4490:11: this_END_BLOCK_74= RULE_END_BLOCK
            	    	            {
            	    	            this_END_BLOCK_74=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	    	            											newLeafNode(this_END_BLOCK_74, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_5_3_3());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt109 >= 1 ) break loop109;
            	                EarlyExitException eee =
            	                    new EarlyExitException(109, input);
            	                throw eee;
            	        }
            	        cnt109++;
            	    } while (true);

            	    this_END_BLOCK_75=(Token)match(input,RULE_END_BLOCK,FOLLOW_54); 

            	    									newLeafNode(this_END_BLOCK_75, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:4506:4: ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:4506:4: ({...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:4507:5: {...}? => ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "getUnorderedGroupHelper().canSelect(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:4507:103: ( ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:4508:6: ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMatrixAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:4511:9: ({...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:4511:10: {...}? => (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMatrix", "true");
            	    }
            	    // InternalMyDsl.g:4511:19: (otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK )
            	    // InternalMyDsl.g:4511:20: otherlv_76= 'exclude' otherlv_77= ':' this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK
            	    {
            	    otherlv_76=(Token)match(input,64,FOLLOW_3); 

            	    									newLeafNode(otherlv_76, grammarAccess.getMatrixAccess().getExcludeKeyword_2_6_0());
            	    								
            	    otherlv_77=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_77, grammarAccess.getMatrixAccess().getColonKeyword_2_6_1());
            	    								
            	    this_BEG_BLOCK_78=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            	    									newLeafNode(this_BEG_BLOCK_78, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_6_2());
            	    								
            	    // InternalMyDsl.g:4523:9: (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+
            	    int cnt112=0;
            	    loop112:
            	    do {
            	        int alt112=2;
            	        int LA112_0 = input.LA(1);

            	        if ( (LA112_0==26) ) {
            	            alt112=1;
            	        }


            	        switch (alt112) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:4524:10: otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_exclude_81_0= ruleExclude ) ) (this_END_BLOCK_82= RULE_END_BLOCK )?
            	    	    {
            	    	    otherlv_79=(Token)match(input,26,FOLLOW_56); 

            	    	    										newLeafNode(otherlv_79, grammarAccess.getMatrixAccess().getHyphenMinusKeyword_2_6_3_0());
            	    	    									
            	    	    // InternalMyDsl.g:4528:10: (this_BEG_BLOCK_80= RULE_BEG_BLOCK )?
            	    	    int alt110=2;
            	    	    int LA110_0 = input.LA(1);

            	    	    if ( (LA110_0==RULE_BEG_BLOCK) ) {
            	    	        alt110=1;
            	    	    }
            	    	    switch (alt110) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:4529:11: this_BEG_BLOCK_80= RULE_BEG_BLOCK
            	    	            {
            	    	            this_BEG_BLOCK_80=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_56); 

            	    	            											newLeafNode(this_BEG_BLOCK_80, grammarAccess.getMatrixAccess().getBEG_BLOCKTerminalRuleCall_2_6_3_1());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalMyDsl.g:4534:10: ( (lv_exclude_81_0= ruleExclude ) )
            	    	    // InternalMyDsl.g:4535:11: (lv_exclude_81_0= ruleExclude )
            	    	    {
            	    	    // InternalMyDsl.g:4535:11: (lv_exclude_81_0= ruleExclude )
            	    	    // InternalMyDsl.g:4536:12: lv_exclude_81_0= ruleExclude
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMatrixAccess().getExcludeExcludeParserRuleCall_2_6_3_2_0());
            	    	    											
            	    	    pushFollow(FOLLOW_27);
            	    	    lv_exclude_81_0=ruleExclude();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMatrixRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"exclude",
            	    	    													lv_exclude_81_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.Exclude");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }

            	    	    // InternalMyDsl.g:4553:10: (this_END_BLOCK_82= RULE_END_BLOCK )?
            	    	    int alt111=2;
            	    	    int LA111_0 = input.LA(1);

            	    	    if ( (LA111_0==RULE_END_BLOCK) ) {
            	    	        int LA111_1 = input.LA(2);

            	    	        if ( (LA111_1==RULE_END_BLOCK||LA111_1==26) ) {
            	    	            alt111=1;
            	    	        }
            	    	    }
            	    	    switch (alt111) {
            	    	        case 1 :
            	    	            // InternalMyDsl.g:4554:11: this_END_BLOCK_82= RULE_END_BLOCK
            	    	            {
            	    	            this_END_BLOCK_82=(Token)match(input,RULE_END_BLOCK,FOLLOW_27); 

            	    	            											newLeafNode(this_END_BLOCK_82, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_6_3_3());
            	    	            										

            	    	            }
            	    	            break;

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt112 >= 1 ) break loop112;
            	                EarlyExitException eee =
            	                    new EarlyExitException(112, input);
            	                throw eee;
            	        }
            	        cnt112++;
            	    } while (true);

            	    this_END_BLOCK_83=(Token)match(input,RULE_END_BLOCK,FOLLOW_54); 

            	    									newLeafNode(this_END_BLOCK_83, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_2_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop113;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMatrixAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:4577:3: (this_END_BLOCK_84= RULE_END_BLOCK )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( (LA114_0==RULE_END_BLOCK) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // InternalMyDsl.g:4578:4: this_END_BLOCK_84= RULE_END_BLOCK
                    {
                    this_END_BLOCK_84=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_84, grammarAccess.getMatrixAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // InternalMyDsl.g:4587:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalMyDsl.g:4587:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalMyDsl.g:4588:2: iv_ruleInclude= ruleInclude EOF
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
    // InternalMyDsl.g:4594:1: ruleInclude returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:4600:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:4601:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:4601:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )? )
            // InternalMyDsl.g:4602:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_12= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:4602:3: ()
            // InternalMyDsl.g:4603:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIncludeAccess().getIncludeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:4609:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_BEG_BLOCK) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // InternalMyDsl.g:4610:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_57); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getIncludeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4615:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:4616:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:4616:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:4617:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4620:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:4621:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:4621:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) ) )*
            loop116:
            do {
                int alt116=4;
                int LA116_0 = input.LA(1);

                if ( LA116_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0) ) {
                    alt116=1;
                }
                else if ( LA116_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1) ) {
                    alt116=2;
                }
                else if ( LA116_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2) ) {
                    alt116=3;
                }


                switch (alt116) {
            	case 1 :
            	    // InternalMyDsl.g:4622:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4622:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:4623:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4623:104: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:4624:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4627:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:4627:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:4627:19: (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:4627:20: otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getIncludeAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:4635:9: ( (lv_os_5_0= ruleEString ) )
            	    // InternalMyDsl.g:4636:10: (lv_os_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:4636:10: (lv_os_5_0= ruleEString )
            	    // InternalMyDsl.g:4637:11: lv_os_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getOsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_57);
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
            	    // InternalMyDsl.g:4660:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4660:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:4661:5: {...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4661:104: ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:4662:6: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4665:9: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:4665:10: {...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:4665:19: (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:4665:20: otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getIncludeAccess().getCCompilerKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getIncludeAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:4673:9: ( (lv_cCompiler_8_0= ruleEString ) )
            	    // InternalMyDsl.g:4674:10: (lv_cCompiler_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:4674:10: (lv_cCompiler_8_0= ruleEString )
            	    // InternalMyDsl.g:4675:11: lv_cCompiler_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getCCompilerEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_57);
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
            	    // InternalMyDsl.g:4698:4: ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4698:4: ({...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:4699:5: {...}? => ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:4699:104: ( ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:4700:6: ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getIncludeAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:4703:9: ({...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:4703:10: {...}? => (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInclude", "true");
            	    }
            	    // InternalMyDsl.g:4703:19: (otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:4703:20: otherlv_9= 'cpp-compiler' otherlv_10= ':' ( (lv_cppCompiler_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getIncludeAccess().getCppCompilerKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getIncludeAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:4711:9: ( (lv_cppCompiler_11_0= ruleEString ) )
            	    // InternalMyDsl.g:4712:10: (lv_cppCompiler_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:4712:10: (lv_cppCompiler_11_0= ruleEString )
            	    // InternalMyDsl.g:4713:11: lv_cppCompiler_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getIncludeAccess().getCppCompilerEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_57);
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
            	    break loop116;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getIncludeAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:4743:3: (this_END_BLOCK_12= RULE_END_BLOCK )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==RULE_END_BLOCK) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // InternalMyDsl.g:4744:4: this_END_BLOCK_12= RULE_END_BLOCK
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
    // InternalMyDsl.g:4753:1: entryRuleExclude returns [EObject current=null] : iv_ruleExclude= ruleExclude EOF ;
    public final EObject entryRuleExclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclude = null;


        try {
            // InternalMyDsl.g:4753:48: (iv_ruleExclude= ruleExclude EOF )
            // InternalMyDsl.g:4754:2: iv_ruleExclude= ruleExclude EOF
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
    // InternalMyDsl.g:4760:1: ruleExclude returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:4766:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:4767:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:4767:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:4768:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:4768:3: ()
            // InternalMyDsl.g:4769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExcludeAccess().getExcludeAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:4775:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==RULE_BEG_BLOCK) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalMyDsl.g:4776:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_58); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getExcludeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:4781:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:4782:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:4782:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:4783:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getExcludeAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:4786:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:4787:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:4787:6: ( ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) ) )*
            loop119:
            do {
                int alt119=3;
                int LA119_0 = input.LA(1);

                if ( LA119_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0) ) {
                    alt119=1;
                }
                else if ( LA119_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1) ) {
                    alt119=2;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalMyDsl.g:4788:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4788:4: ({...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:4789:5: {...}? => ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:4789:104: ( ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:4790:6: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:4793:9: ({...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:4793:10: {...}? => (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "true");
            	    }
            	    // InternalMyDsl.g:4793:19: (otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:4793:20: otherlv_3= 'os' otherlv_4= ':' ( (lv_os_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getExcludeAccess().getOsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getExcludeAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:4801:9: ( (lv_os_5_0= ruleEString ) )
            	    // InternalMyDsl.g:4802:10: (lv_os_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:4802:10: (lv_os_5_0= ruleEString )
            	    // InternalMyDsl.g:4803:11: lv_os_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getExcludeAccess().getOsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_58);
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
            	    // InternalMyDsl.g:4826:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:4826:4: ({...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:4827:5: {...}? => ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "getUnorderedGroupHelper().canSelect(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:4827:104: ( ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:4828:6: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getExcludeAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:4831:9: ({...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:4831:10: {...}? => (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleExclude", "true");
            	    }
            	    // InternalMyDsl.g:4831:19: (otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:4831:20: otherlv_6= 'c-compiler' otherlv_7= ':' ( (lv_cCompiler_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,59,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getExcludeAccess().getCCompilerKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getExcludeAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:4839:9: ( (lv_cCompiler_8_0= ruleEString ) )
            	    // InternalMyDsl.g:4840:10: (lv_cCompiler_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:4840:10: (lv_cCompiler_8_0= ruleEString )
            	    // InternalMyDsl.g:4841:11: lv_cCompiler_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getExcludeAccess().getCCompilerEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_58);
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
            	    break loop119;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getExcludeAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:4871:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==RULE_END_BLOCK) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // InternalMyDsl.g:4872:4: this_END_BLOCK_9= RULE_END_BLOCK
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:4881:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:4881:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:4882:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalMyDsl.g:4888:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:4894:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:4895:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:4895:2: (kw= 'true' | kw= 'false' )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==22) ) {
                alt121=1;
            }
            else if ( (LA121_0==23) ) {
                alt121=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // InternalMyDsl.g:4896:3: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:4902:3: kw= 'false'
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
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA71 dfa71 = new DFA71(this);
    protected DFA74 dfa74 = new DFA74(this);
    static final String dfa_1s = "\77\uffff";
    static final String dfa_2s = "\1\1\10\uffff\1\1\1\uffff\1\1\12\uffff\2\25\13\54\11\64\1\uffff\5\64\1\1\2\uffff\5\76\5\uffff";
    static final String dfa_3s = "\1\5\1\uffff\5\20\1\uffff\1\6\4\4\11\uffff\2\5\2\4\22\5\1\uffff\5\5\1\4\1\6\1\uffff\5\5\5\uffff";
    static final String dfa_4s = "\1\105\1\uffff\5\20\1\uffff\1\31\1\107\1\31\2\105\11\uffff\26\105\1\uffff\5\105\1\114\1\31\1\uffff\5\105\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\5\uffff\1\1\5\uffff\11\1\26\uffff\1\1\7\uffff\1\1\5\uffff\5\1";
    static final String dfa_6s = "\77\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\3\7\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\13\uffff\45\7",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15\1\16\1\21\1\22\1\23\13\uffff\1\24\1\25\1\17\1\20",
            "\2\1\5\25\4\uffff\1\1\1\uffff\5\1\4\25\7\uffff\2\1\36\uffff\2\1\3\uffff\2\1",
            "\1\1\1\uffff\1\26\1\27\1\32\1\33\1\34\13\uffff\1\35\1\36\1\30\1\31",
            "\2\1\5\25\4\uffff\1\1\1\uffff\5\1\4\25\22\uffff\5\1\1\uffff\1\1\2\uffff\1\1\17\uffff\1\1",
            "\1\1\1\uffff\2\25\1\37\1\40\1\41\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\25\7\uffff\45\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\45\25",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\45\25",
            "\1\42\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\54",
            "\1\42\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\45\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\45\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\45\64",
            "\1\64\2\uffff\1\64\1\7\1\64\4\uffff\1\64\1\1\5\64\13\uffff\45\64",
            "\4\1\1\65\1\66\1\67\4\uffff\1\1\1\uffff\5\1\1\70\1\71\2\1\13\uffff\3\1\13\uffff\1\1\2\uffff\1\1\25\uffff\1\1",
            "\2\1\1\72\1\73\1\74\13\uffff\1\75\1\76\2\1",
            "",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\45\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\45\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\45\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\45\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\45\76",
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
            return "()+ loopback of 307:9: ( (lv_env_21_0= ruleKeyValuePair ) )+";
        }
    }
    static final String dfa_8s = "\116\uffff";
    static final String dfa_9s = "\1\1\7\uffff\1\26\30\uffff\1\1\1\uffff\1\57\5\uffff\1\57\1\1\5\uffff\1\57\17\uffff\2\57\10\uffff\1\57\3\uffff";
    static final String dfa_10s = "\1\5\7\uffff\1\5\11\uffff\2\4\3\uffff\2\20\12\5\1\4\4\5\1\20\1\4\1\5\5\uffff\13\5\5\20\2\4\6\5\2\20\1\4\3\5";
    static final String dfa_11s = "\1\116\7\uffff\1\116\11\uffff\2\40\3\uffff\2\36\10\40\1\114\1\40\1\114\4\40\1\36\2\114\5\uffff\1\36\12\40\5\36\2\114\6\40\2\36\1\114\3\40";
    static final String dfa_12s = "\1\uffff\1\17\1\3\1\1\1\4\1\5\1\2\1\6\1\uffff\1\10\1\12\1\7\1\11\1\14\1\15\1\16\2\13\2\uffff\3\13\24\uffff\5\13\36\uffff";
    static final String dfa_13s = "\116\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\5\1\6\1\3\1\2\1\4\1\17\3\uffff\1\1\1\12\11\1\1\7\1\13\1\11\1\14\1\10\1\15\1\16\47\1\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\20\1\21\1\24\1\25\2\26\3\uffff\7\26\1\27\1\30\1\22\1\23\56\26\1\uffff\6\26",
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
            "\1\52\1\57\1\54\1\53\1\55\1\56\1\47\3\uffff\1\1\1\43\11\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46\2\uffff\5\1\11\uffff\1\1\1\uffff\1\1\2\uffff\6\1\1\uffff\4\1\13\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\1\60\1\65\1\62\1\61\1\63\1\64\1\47\3\uffff\1\57\1\43\11\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\13\uffff\1\57\2\uffff\1\57\25\uffff\1\57",
            "\1\50\1\72\1\67\1\66\1\70\1\71\1\47\4\uffff\1\43\5\uffff\4\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\13\uffff\1\1\1\uffff\1\1",
            "\4\57\1\73\1\74\1\75\4\uffff\1\57\1\uffff\5\57\1\76\1\77\2\57\13\uffff\3\57\13\uffff\1\57\2\uffff\1\57\25\uffff\1\57",
            "\6\1\4\uffff\1\1\1\57\11\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\2\uffff\3\1\13\uffff\1\1\2\uffff\3\1\10\uffff\2\1\3\uffff\2\1\4\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "\6\57\4\uffff\13\57\2\uffff\1\1\1\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
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
            "\1\57\1\60\1\65\1\62\1\102\1\103\1\104\1\47\3\uffff\1\57\1\43\11\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\13\uffff\1\57\2\uffff\1\57\25\uffff\1\57",
            "\1\57\1\60\1\65\1\62\1\105\1\106\1\107\1\47\3\uffff\1\57\1\43\5\57\1\110\1\111\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\13\uffff\1\57\2\uffff\1\57\25\uffff\1\57",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\65\1\62\1\113\1\114\1\115\1\47\3\uffff\1\57\1\43\5\57\1\76\1\77\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\13\uffff\1\57\2\uffff\1\57\25\uffff\1\57",
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
            return "()* loopback of 543:3: (this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_STRING_7= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_16= RULE_ANY_OTHER )*";
        }
    }
    static final String dfa_15s = "\17\uffff";
    static final String dfa_16s = "\1\1\16\uffff";
    static final String dfa_17s = "\1\5\1\uffff\1\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_18s = "\1\114\1\uffff\1\20\1\uffff\1\31\11\0\1\uffff";
    static final String dfa_19s = "\1\uffff\1\3\1\uffff\1\2\12\uffff\1\1";
    static final String dfa_20s = "\1\4\4\uffff\1\3\1\0\1\10\1\5\1\2\1\7\1\6\1\1\1\11\1\uffff}>";
    static final String[] dfa_21s = {
            "\6\1\4\uffff\1\2\1\uffff\11\1\13\uffff\3\1\13\uffff\1\1\2\uffff\1\1\24\uffff\1\3\1\1",
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
            return "()* loopback of 2261:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*";
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
                        int LA53_12 = input.LA(1);

                         
                        int index53_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_12);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA53_5 = input.LA(1);

                         
                        int index53_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==EOF||(LA53_0>=RULE_END_BLOCK && LA53_0<=RULE_INT)||(LA53_0>=17 && LA53_0<=25)||(LA53_0>=37 && LA53_0<=39)||LA53_0==51||LA53_0==54||LA53_0==76) ) {s = 1;}

                        else if ( (LA53_0==15) ) {s = 2;}

                        else if ( LA53_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                         
                        input.seek(index53_0);
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
                        int LA53_11 = input.LA(1);

                         
                        int index53_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA53_10 = input.LA(1);

                         
                        int index53_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_10);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA53_13 = input.LA(1);

                         
                        int index53_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index53_13);
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
    static final String dfa_25s = "\1\114\11\uffff";
    static final String dfa_26s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_27s = "\1\0\11\uffff}>";
    static final String[] dfa_28s = {
            "\6\1\4\uffff\1\1\1\uffff\11\1\13\uffff\3\1\4\uffff\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\1\1\uffff\1\10\1\1\16\uffff\1\11\6\uffff\1\1",
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
            return "()* loopback of 2389:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'issues' otherlv_22= ':' ( (lv_issues_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'packages' otherlv_25= ':' ( (lv_packages_26_0= ruleEString ) ) ) ) ) ) )*";
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
                        if ( (LA56_0==EOF||(LA56_0>=RULE_END_BLOCK && LA56_0<=RULE_INT)||LA56_0==15||(LA56_0>=17 && LA56_0<=25)||(LA56_0>=37 && LA56_0<=39)||LA56_0==51||LA56_0==54||LA56_0==76) ) {s = 1;}

                        else if ( LA56_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA56_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA56_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA56_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA56_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA56_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA56_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA56_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
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
    static final String dfa_29s = "\27\uffff";
    static final String dfa_30s = "\1\1\26\uffff";
    static final String dfa_31s = "\1\5\1\uffff\2\20\6\uffff\1\6\12\0\2\uffff";
    static final String dfa_32s = "\1\114\1\uffff\2\20\6\uffff\1\31\12\0\2\uffff";
    static final String dfa_33s = "\1\uffff\1\11\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\13\uffff\1\10\1\1";
    static final String dfa_34s = "\1\2\12\uffff\1\4\1\3\1\7\1\6\1\0\1\5\1\11\1\12\1\1\1\10\2\uffff}>";
    static final String[] dfa_35s = {
            "\6\1\4\uffff\1\2\1\uffff\3\1\1\3\5\1\13\uffff\1\4\1\5\1\11\13\uffff\1\6\2\uffff\1\10\25\uffff\1\7",
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

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA67 extends DFA {

        public DFA67(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 67;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()* loopback of 2761:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'strategy' otherlv_31= ':' ( (lv_strategy_32_0= ruleStrategy ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'steps' otherlv_34= ':' (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_steps_36_0= ruleStep ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'permissions' otherlv_39= ':' ( (lv_permissions_40_0= rulePermissions ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==EOF||(LA67_0>=RULE_END_BLOCK && LA67_0<=RULE_INT)||(LA67_0>=17 && LA67_0<=19)||(LA67_0>=21 && LA67_0<=25)) ) {s = 1;}

                        else if ( (LA67_0==15) ) {s = 2;}

                        else if ( (LA67_0==20) ) {s = 3;}

                        else if ( LA67_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                        else if ( LA67_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {s = 5;}

                        else if ( LA67_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {s = 6;}

                        else if ( LA67_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {s = 7;}

                        else if ( LA67_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 8;}

                        else if ( LA67_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {s = 9;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_12 = input.LA(1);

                         
                        int index67_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_11 = input.LA(1);

                         
                        int index67_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 7) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_11);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_13 = input.LA(1);

                         
                        int index67_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_13);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_17);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 22;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_36s = "\134\uffff";
    static final String dfa_37s = "\1\1\133\uffff";
    static final String dfa_38s = "\1\5\1\uffff\3\20\7\uffff\1\6\1\4\1\6\11\0\1\10\55\20\11\0\1\uffff\1\6\1\uffff\11\0\1\uffff";
    static final String dfa_39s = "\1\116\1\uffff\3\20\7\uffff\1\31\1\105\1\31\11\0\1\105\55\20\11\0\1\uffff\1\31\1\uffff\11\0\1\uffff";
    static final String dfa_40s = "\1\uffff\1\13\3\uffff\1\2\1\3\1\4\1\6\1\7\1\10\1\11\103\uffff\1\1\1\uffff\1\5\11\uffff\1\12";
    static final String dfa_41s = "\1\15\16\uffff\1\30\1\11\1\13\1\23\1\26\1\6\1\20\1\22\1\31\56\uffff\1\12\1\21\1\27\1\3\1\10\1\24\1\32\1\33\1\4\3\uffff\1\1\1\16\1\7\1\14\1\17\1\25\1\0\1\2\1\5\1\uffff}>";
    static final String[] dfa_42s = {
            "\6\1\4\uffff\1\2\1\uffff\4\1\1\3\5\1\12\uffff\3\1\1\6\1\7\1\13\1\11\7\uffff\1\4\1\12\1\uffff\1\1\25\uffff\1\1\1\5\1\10",
            "",
            "\1\14",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\1\20\1\23\1\24\1\25\13\uffff\1\26\1\27\1\21\1\22",
            "\1\30\3\uffff\1\32\1\31\1\33\4\uffff\1\34\1\uffff\1\35\1\uffff\1\36\1\37\1\40\13\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105",
            "\1\106\1\107\1\112\1\113\1\114\13\uffff\1\115\1\116\1\110\1\111",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\32\1\31\1\33\4\uffff\1\34\1\uffff\1\35\1\uffff\1\36\1\37\1\40\13\uffff\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
            "\1\120",
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
            "\1\122\1\123\1\126\1\127\1\130\13\uffff\1\131\1\132\1\124\1\125",
            "",
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

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()* loopback of 3238:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'continue-on-error' otherlv_26= ':' ( (lv_continueOnError_27_0= ruleEBoolean ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'with' otherlv_29= ':' ( (this_BEG_BLOCK_30= RULE_BEG_BLOCK )? ( (lv_with_31_0= ruleKeyValuePair ) )+ (this_END_BLOCK_32= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= 'env' otherlv_34= ':' ( (this_BEG_BLOCK_35= RULE_BEG_BLOCK )? ( (lv_env_36_0= ruleKeyValuePair ) )+ (this_END_BLOCK_37= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA76_88 = input.LA(1);

                         
                        int index76_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_88);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA76_82 = input.LA(1);

                         
                        int index76_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_82);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA76_89 = input.LA(1);

                         
                        int index76_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_89);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA76_73 = input.LA(1);

                         
                        int index76_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_73);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA76_78 = input.LA(1);

                         
                        int index76_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_78);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA76_90 = input.LA(1);

                         
                        int index76_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_90);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA76_20 = input.LA(1);

                         
                        int index76_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA76_84 = input.LA(1);

                         
                        int index76_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_84);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA76_74 = input.LA(1);

                         
                        int index76_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_74);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA76_16 = input.LA(1);

                         
                        int index76_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_16);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA76_70 = input.LA(1);

                         
                        int index76_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_70);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA76_17 = input.LA(1);

                         
                        int index76_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_17);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA76_85 = input.LA(1);

                         
                        int index76_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_85);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA76_0 = input.LA(1);

                         
                        int index76_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA76_0==EOF||(LA76_0>=RULE_END_BLOCK && LA76_0<=RULE_INT)||(LA76_0>=17 && LA76_0<=20)||(LA76_0>=22 && LA76_0<=26)||(LA76_0>=37 && LA76_0<=39)||LA76_0==54||LA76_0==76) ) {s = 1;}

                        else if ( (LA76_0==15) ) {s = 2;}

                        else if ( (LA76_0==21) ) {s = 3;}

                        else if ( (LA76_0==51) ) {s = 4;}

                        else if ( LA76_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {s = 5;}

                        else if ( LA76_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 6;}

                        else if ( LA76_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {s = 7;}

                        else if ( LA76_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {s = 8;}

                        else if ( LA76_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {s = 9;}

                        else if ( LA76_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 10;}

                        else if ( LA76_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 11;}

                         
                        input.seek(index76_0);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA76_83 = input.LA(1);

                         
                        int index76_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_83);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA76_86 = input.LA(1);

                         
                        int index76_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_86);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA76_21 = input.LA(1);

                         
                        int index76_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_21);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA76_71 = input.LA(1);

                         
                        int index76_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_71);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA76_22 = input.LA(1);

                         
                        int index76_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_22);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA76_18 = input.LA(1);

                         
                        int index76_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_18);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA76_75 = input.LA(1);

                         
                        int index76_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_75);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA76_87 = input.LA(1);

                         
                        int index76_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 9) ) {s = 91;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_87);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA76_19 = input.LA(1);

                         
                        int index76_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_19);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA76_72 = input.LA(1);

                         
                        int index76_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_72);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA76_15 = input.LA(1);

                         
                        int index76_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_15);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA76_23 = input.LA(1);

                         
                        int index76_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 79;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_23);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA76_76 = input.LA(1);

                         
                        int index76_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_76);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA76_77 = input.LA(1);

                         
                        int index76_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 81;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index76_77);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 76, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_43s = "\u009d\uffff";
    static final String dfa_44s = "\1\1\25\uffff\1\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\17\uffff\2\166\17\u0084\70\uffff\4\u0084\5\uffff\4\u0084\1\uffff\5\u0084\1\1\2\uffff\6\u009c\12\uffff";
    static final String dfa_45s = "\1\5\1\uffff\22\20\1\uffff\1\6\5\4\1\6\1\4\1\6\2\4\4\6\1\4\11\uffff\2\5\2\4\15\5\70\uffff\4\5\5\uffff\1\4\3\5\1\uffff\5\5\1\4\2\6\6\5\12\uffff";
    static final String dfa_46s = "\1\116\1\uffff\22\20\1\uffff\1\31\1\107\1\31\1\114\1\105\1\114\1\31\1\33\1\31\1\114\1\32\4\31\1\105\11\uffff\21\116\70\uffff\4\116\5\uffff\4\116\1\uffff\5\116\1\114\2\31\6\116\12\uffff";
    static final String dfa_47s = "\1\uffff\1\2\22\uffff\1\1\20\uffff\11\1\21\uffff\70\1\4\uffff\5\1\4\uffff\1\1\16\uffff\12\1";
    static final String dfa_48s = "\u009d\uffff}>";
    static final String[] dfa_49s = {
            "\3\1\1\7\1\10\1\11\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\5\1\6\uffff\4\24\1\12\1\13\1\16\1\17\1\20\1\23\1\21\7\24\1\14\1\22\1\24\1\15\17\24\6\uffff\3\1",
            "",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\32",
            "\1\32",
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
            "\1\45\1\46\1\51\1\52\1\53\13\uffff\1\54\1\55\1\47\1\50",
            "\2\1\5\55\4\uffff\1\1\1\uffff\5\1\4\55\7\uffff\2\1\36\uffff\2\1\3\uffff\2\1",
            "\1\1\1\uffff\1\56\1\57\1\62\1\63\1\64\13\uffff\1\65\1\66\1\60\1\61",
            "\2\1\1\56\1\57\1\62\1\63\1\64\4\uffff\1\1\1\uffff\5\1\1\65\1\66\1\60\1\61\13\uffff\3\1\4\uffff\5\1\1\uffff\2\1\1\uffff\2\1\16\uffff\1\1\6\uffff\1\1",
            "\1\1\1\uffff\2\55\1\67\1\70\1\71\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\55\7\uffff\45\1",
            "\2\1\1\56\1\57\1\72\1\73\1\74\4\uffff\1\1\1\uffff\5\1\1\75\1\76\1\60\1\61\13\uffff\3\1\13\uffff\1\1\2\uffff\1\1\25\uffff\1\1",
            "\1\77\1\100\1\103\1\104\1\105\13\uffff\1\106\1\107\1\101\1\102",
            "\1\1\1\uffff\1\110\1\111\1\114\1\115\1\116\13\uffff\1\117\1\120\1\112\1\113\1\uffff\1\1",
            "\1\121\1\122\1\125\1\126\1\127\13\uffff\1\130\1\131\1\123\1\124",
            "\2\1\1\56\1\57\1\62\1\63\1\64\4\uffff\1\1\1\uffff\5\1\1\65\1\66\1\60\1\61\13\uffff\3\1\13\uffff\1\1\2\uffff\3\1\23\uffff\1\1",
            "\1\1\1\uffff\5\131\13\uffff\4\131\1\1",
            "\1\132\1\133\1\136\1\137\1\140\13\uffff\1\141\1\142\1\134\1\135",
            "\1\143\1\144\1\147\1\150\1\151\13\uffff\1\152\1\153\1\145\1\146",
            "\1\154\1\155\1\160\1\161\1\162\13\uffff\1\163\1\164\1\156\1\157",
            "\5\164\13\uffff\1\165\1\166\2\164",
            "\1\1\1\uffff\2\166\1\167\1\170\1\171\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\166\7\uffff\45\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\166\4\uffff\1\166\1\1\12\166\6\uffff\1\24\44\166\6\uffff\3\166",
            "\6\166\4\uffff\1\166\1\1\12\166\6\uffff\1\24\44\166\6\uffff\3\166",
            "\1\172\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\1\172\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008b\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008b\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008b\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008a\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
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
            "\6\u0084\4\uffff\1\u0084\1\u008c\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008c\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\u008c\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "",
            "",
            "",
            "",
            "",
            "\1\u0084\1\u008d\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\1\u0089\1\177\1\174\1\173\1\175\1\176\1\u0088\3\uffff\13\u0084\1\u0080\1\u0081\1\u0082\1\u0083\1\u0085\1\u0086\1\u0087\1\24\44\u0084\6\uffff\3\u0084",
            "\6\u0084\4\uffff\1\u0084\1\1\12\u0084\6\uffff\1\24\44\u0084\6\uffff\3\u0084",
            "\4\1\1\u008e\1\u008f\1\u0090\4\uffff\1\1\1\uffff\5\1\1\u0091\1\u0092\2\1\13\uffff\3\1\13\uffff\1\1\2\uffff\1\1\25\uffff\1\1",
            "\2\1\1\u0093\1\u0094\1\u0095\13\uffff\1\u0096\1\u0097\2\1",
            "\2\1\1\u0098\1\u0099\1\u009a\13\uffff\1\u009b\1\u009c\2\1",
            "\6\u009c\4\uffff\1\u009c\1\1\12\u009c\6\uffff\1\24\44\u009c\6\uffff\3\u009c",
            "\6\u009c\4\uffff\1\u009c\1\u008a\12\u009c\6\uffff\1\24\44\u009c\6\uffff\3\u009c",
            "\6\u009c\4\uffff\1\u009c\1\u008a\12\u009c\6\uffff\1\24\44\u009c\6\uffff\3\u009c",
            "\6\u009c\4\uffff\1\u009c\1\u008a\12\u009c\6\uffff\1\24\44\u009c\6\uffff\3\u009c",
            "\6\u009c\4\uffff\1\u009c\1\u008a\12\u009c\6\uffff\1\24\44\u009c\6\uffff\3\u009c",
            "\6\u009c\4\uffff\1\u009c\1\u008a\12\u009c\6\uffff\1\24\44\u009c\6\uffff\3\u009c",
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

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = dfa_43;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()+ loopback of 3563:10: ( (lv_with_31_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA74 extends DFA {

        public DFA74(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 74;
            this.eot = dfa_43;
            this.eof = dfa_44;
            this.min = dfa_45;
            this.max = dfa_46;
            this.accept = dfa_47;
            this.special = dfa_48;
            this.transition = dfa_49;
        }
        public String getDescription() {
            return "()+ loopback of 3615:10: ( (lv_env_36_0= ruleKeyValuePair ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003C007C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003E8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000006003E8030L,0x00000000000000C6L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003E8030L,0x0000000000000600L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C007D0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003FE87F2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0025F000003E8030L,0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xFFFFFFFE003A8710L,0x000000000000003FL});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFFFFFFFE003E8732L,0x000000000000003FL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00700L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001FC010FF2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001FC010FE2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000600000022L,0x00000000000000C6L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000604000032L,0x00000000000000C6L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000603C007E2L,0x00000000000000C6L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000600000030L,0x00000000000000CEL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000800000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000003C007F2L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000032L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000600L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008022L,0x0000000000000800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0025F00000000022L,0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x004800E000108032L,0x0000000000001000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x004800E000108022L,0x0000000000001000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000000BC007D0L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x004800E000108030L,0x0000000000001800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x01C800E000108030L,0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x004800E004108032L,0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x006DF0E000108030L,0x0000000000001020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00180F0000208032L,0x0000000000006000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00180F0000208022L,0x0000000000006000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xFFFFFFFE003A8732L,0x000000000000603FL});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0180000000000022L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xEF80000000000030L,0x0000000000000001L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xEE00000000000022L,0x0000000000000001L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x1A00000004000030L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0A00000004000030L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x1A00000000000022L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0A00000000000022L});

}

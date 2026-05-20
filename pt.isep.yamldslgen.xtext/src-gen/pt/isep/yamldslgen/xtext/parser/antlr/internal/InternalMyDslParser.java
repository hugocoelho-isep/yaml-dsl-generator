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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_GH_EXPRESSION", "RULE_YAML_SCALAR", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'name'", "':'", "'on'", "'concurrency'", "'jobs'", "'permissions'", "'env'", "'true'", "'false'", "'>'", "'|'", "'-'", "'['", "']'", "';'", "','", "'{'", "'}'", "'push'", "'pull_request'", "'branches'", "'tags'", "'runs-on'", "'needs'", "'steps'", "'uses'", "'run'", "'with'", "'shell'", "'contents'", "'security-events'", "'actions'", "'pages'", "'id-token'", "'schedule'", "'workflow_dispatch'", "'cron'", "'group'", "'cancel-in-progress'", "'url'", "'environment'", "'id'", "'if'", "'working-directory'"
    };
    public static final int T__50=50;
    public static final int RULE_BEG_BLOCK=4;
    public static final int T__19=19;
    public static final int T__15=15;
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
    // InternalMyDsl.g:660:1: ruleKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' ) ;
    public final AntlrDatatypeRuleToken ruleKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_YAML_SCALAR_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:666:2: ( (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' ) )
            // InternalMyDsl.g:667:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' )
            {
            // InternalMyDsl.g:667:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' )
            int alt16=24;
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
    // InternalMyDsl.g:821:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalMyDsl.g:821:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalMyDsl.g:822:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalMyDsl.g:828:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:834:2: ( ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:835:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:835:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            // InternalMyDsl.g:836:3: ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:836:3: ( (lv_key_0_0= ruleKeyName ) )
            // InternalMyDsl.g:837:4: (lv_key_0_0= ruleKeyName )
            {
            // InternalMyDsl.g:837:4: (lv_key_0_0= ruleKeyName )
            // InternalMyDsl.g:838:5: lv_key_0_0= ruleKeyName
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
            		
            // InternalMyDsl.g:859:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMyDsl.g:860:4: (lv_value_2_0= ruleEString )
            {
            // InternalMyDsl.g:860:4: (lv_value_2_0= ruleEString )
            // InternalMyDsl.g:861:5: lv_value_2_0= ruleEString
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
    // InternalMyDsl.g:882:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
    public final EObject entryRuleOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOn = null;


        try {
            // InternalMyDsl.g:882:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:883:2: iv_ruleOn= ruleOn EOF
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
    // InternalMyDsl.g:889:1: ruleOn returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:895:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:896:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:896:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalMyDsl.g:897:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:897:3: ()
            // InternalMyDsl.g:898:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnAccess().getOnAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:904:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BEG_BLOCK) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:905:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_17); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:910:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) )
            // InternalMyDsl.g:911:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:911:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) )
            // InternalMyDsl.g:912:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:915:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* )
            // InternalMyDsl.g:916:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )*
            {
            // InternalMyDsl.g:916:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )*
            loop22:
            do {
                int alt22=5;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
                    alt22=4;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:917:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:917:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:918:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:918:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:919:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:922:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:922:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:922:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:922:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOnAccess().getPushKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOnAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:930:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:931:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:931:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:932:11: lv_push_5_0= rulePush
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
            	    // InternalMyDsl.g:955:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:955:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:956:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:956:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:957:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:960:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:960:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:960:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:960:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
            	    {
            	    otherlv_6=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getOnAccess().getPull_requestKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_18); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOnAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:968:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:969:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:969:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:970:11: lv_pullRequest_8_0= rulePull_request
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
            	    // InternalMyDsl.g:993:4: ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:993:4: ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:994:5: {...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:994:99: ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:995:6: ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:998:9: ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:998:10: {...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:998:19: (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:998:20: otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? )
            	    {
            	    otherlv_9=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getOnAccess().getScheduleKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_10, grammarAccess.getOnAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:1006:9: ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:1007:10: (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:1007:10: (this_BEG_BLOCK_11= RULE_BEG_BLOCK )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_BEG_BLOCK) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMyDsl.g:1008:11: this_BEG_BLOCK_11= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_11=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	            											newLeafNode(this_BEG_BLOCK_11, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1013:10: ( (lv_schedule_12_0= ruleSchedule ) )+
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
            	    	    // InternalMyDsl.g:1014:11: (lv_schedule_12_0= ruleSchedule )
            	    	    {
            	    	    // InternalMyDsl.g:1014:11: (lv_schedule_12_0= ruleSchedule )
            	    	    // InternalMyDsl.g:1015:12: lv_schedule_12_0= ruleSchedule
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getOnAccess().getScheduleScheduleParserRuleCall_2_2_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_20);
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
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	    // InternalMyDsl.g:1032:10: (this_END_BLOCK_13= RULE_END_BLOCK )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==RULE_END_BLOCK) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMyDsl.g:1033:11: this_END_BLOCK_13= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_17); 

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
            	    // InternalMyDsl.g:1045:4: ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:1045:4: ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) )
            	    // InternalMyDsl.g:1046:5: {...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1046:99: ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) )
            	    // InternalMyDsl.g:1047:6: ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1050:9: ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) )
            	    // InternalMyDsl.g:1050:10: {...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1050:19: (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? )
            	    // InternalMyDsl.g:1050:20: otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )?
            	    {
            	    otherlv_14=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getOnAccess().getWorkflow_dispatchKeyword_2_3_0());
            	    								
            	    otherlv_15=(Token)match(input,16,FOLLOW_21); 

            	    									newLeafNode(otherlv_15, grammarAccess.getOnAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:1058:9: ( (lv_workflowDispatch_16_0= ruleEString ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=22 && LA21_0<=25)) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMyDsl.g:1059:10: (lv_workflowDispatch_16_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1059:10: (lv_workflowDispatch_16_0= ruleEString )
            	            // InternalMyDsl.g:1060:11: lv_workflowDispatch_16_0= ruleEString
            	            {

            	            											newCompositeNode(grammarAccess.getOnAccess().getWorkflowDispatchEStringParserRuleCall_2_3_2_0());
            	            										
            	            pushFollow(FOLLOW_17);
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
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1090:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_END_BLOCK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1091:4: this_END_BLOCK_17= RULE_END_BLOCK
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
    // InternalMyDsl.g:1100:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalMyDsl.g:1100:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:1101:2: iv_rulePush= rulePush EOF
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
    // InternalMyDsl.g:1107:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1113:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1114:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1114:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1115:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1115:3: ()
            // InternalMyDsl.g:1116:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_22); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1126:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1127:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1127:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1128:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1131:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1132:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1132:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
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
            	    // InternalMyDsl.g:1133:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1133:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1134:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1134:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1135:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1138:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1138:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1138:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1138:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPushAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_23); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPushAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1146:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
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
            	            // InternalMyDsl.g:1147:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1147:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1148:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_24); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1152:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1153:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1161:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1162:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1162:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1163:14: lv_branches_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_25);
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

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

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

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_22); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1191:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1191:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1192:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1196:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1197:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1197:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1198:13: lv_branches_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_27);
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

            	            // InternalMyDsl.g:1215:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==30) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1216:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPushAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1220:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1221:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1221:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1222:14: lv_branches_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            otherlv_15=(Token)match(input,28,FOLLOW_22); 

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
            	    // InternalMyDsl.g:1252:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1252:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1253:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1253:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1254:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1257:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1257:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:1257:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1257:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPushAccess().getTagsKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_23); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPushAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1265:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
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
            	            // InternalMyDsl.g:1266:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1266:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1267:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_24); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1271:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1272:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1280:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1281:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1281:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1282:14: lv_tags_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_25);
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

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

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

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_22); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1310:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1310:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1311:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1315:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1316:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1316:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:1317:13: lv_tags_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_27);
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

            	            // InternalMyDsl.g:1334:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==30) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1335:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPushAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1339:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1340:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1340:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1341:14: lv_tags_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            otherlv_28=(Token)match(input,28,FOLLOW_22); 

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
    // InternalMyDsl.g:1386:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
    public final EObject entryRulePull_request() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_request = null;


        try {
            // InternalMyDsl.g:1386:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1387:2: iv_rulePull_request= rulePull_request EOF
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
    // InternalMyDsl.g:1393:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1399:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1400:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1400:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            // InternalMyDsl.g:1401:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1401:3: ()
            // InternalMyDsl.g:1402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPull_requestAccess().getPull_requestAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_28); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPull_requestAccess().getBranchesKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getPull_requestAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1420:3: ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
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
                    // InternalMyDsl.g:1421:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    {
                    // InternalMyDsl.g:1421:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    // InternalMyDsl.g:1422:5: this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_24); 

                    					newLeafNode(this_BEG_BLOCK_4, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_4_0_0());
                    				
                    // InternalMyDsl.g:1426:5: (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+
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
                    	    // InternalMyDsl.g:1427:6: otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK
                    	    {
                    	    otherlv_5=(Token)match(input,26,FOLLOW_18); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_4_0_1_0());
                    	    					
                    	    this_BEG_BLOCK_6=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

                    	    						newLeafNode(this_BEG_BLOCK_6, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_4_0_1_1());
                    	    					
                    	    // InternalMyDsl.g:1435:6: ( (lv_branches_7_0= ruleEString ) )
                    	    // InternalMyDsl.g:1436:7: (lv_branches_7_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1436:7: (lv_branches_7_0= ruleEString )
                    	    // InternalMyDsl.g:1437:8: lv_branches_7_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_25);
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

                    	    this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

                    	    						newLeafNode(this_END_BLOCK_8, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_4_0_1_3());
                    	    					

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

                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

                    					newLeafNode(this_END_BLOCK_9, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1465:4: (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    {
                    // InternalMyDsl.g:1465:4: (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    // InternalMyDsl.g:1466:5: otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalMyDsl.g:1470:5: ( (lv_branches_11_0= ruleEString ) )
                    // InternalMyDsl.g:1471:6: (lv_branches_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:1471:6: (lv_branches_11_0= ruleEString )
                    // InternalMyDsl.g:1472:7: lv_branches_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_1_1_0());
                    						
                    pushFollow(FOLLOW_27);
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

                    // InternalMyDsl.g:1489:5: (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==30) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalMyDsl.g:1490:6: otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,30,FOLLOW_4); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getPull_requestAccess().getCommaKeyword_4_1_2_0());
                    	    					
                    	    // InternalMyDsl.g:1494:6: ( (lv_branches_13_0= ruleEString ) )
                    	    // InternalMyDsl.g:1495:7: (lv_branches_13_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1495:7: (lv_branches_13_0= ruleEString )
                    	    // InternalMyDsl.g:1496:8: lv_branches_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,28,FOLLOW_25); 

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
    // InternalMyDsl.g:1528:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMyDsl.g:1528:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMyDsl.g:1529:2: iv_ruleSchedule= ruleSchedule EOF
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
    // InternalMyDsl.g:1535:1: ruleSchedule returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1541:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1542:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1542:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1543:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:1547:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_BEG_BLOCK) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1548:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_30); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getScheduleAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getCronKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1561:3: ( (lv_cron_4_0= ruleEString ) )
            // InternalMyDsl.g:1562:4: (lv_cron_4_0= ruleEString )
            {
            // InternalMyDsl.g:1562:4: (lv_cron_4_0= ruleEString )
            // InternalMyDsl.g:1563:5: lv_cron_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getCronEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalMyDsl.g:1580:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_END_BLOCK) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1581:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:1590:1: entryRuleConcurrency returns [EObject current=null] : iv_ruleConcurrency= ruleConcurrency EOF ;
    public final EObject entryRuleConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrency = null;


        try {
            // InternalMyDsl.g:1590:52: (iv_ruleConcurrency= ruleConcurrency EOF )
            // InternalMyDsl.g:1591:2: iv_ruleConcurrency= ruleConcurrency EOF
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
    // InternalMyDsl.g:1597:1: ruleConcurrency returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1603:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1604:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1604:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1605:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1605:3: ()
            // InternalMyDsl.g:1606:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcurrencyAccess().getConcurrencyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1612:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_BEG_BLOCK) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:1613:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_32); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getConcurrencyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1618:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1619:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1619:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1620:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1623:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1624:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1624:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMyDsl.g:1625:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1625:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1626:5: {...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1626:108: ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1627:6: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1630:9: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1630:10: {...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:1630:19: (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1630:20: otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getConcurrencyAccess().getGroupKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConcurrencyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1638:9: ( (lv_group_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1639:10: (lv_group_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1639:10: (lv_group_5_0= ruleEString )
            	    // InternalMyDsl.g:1640:11: lv_group_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getGroupEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
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
            	    // InternalMyDsl.g:1663:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1663:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:1664:5: {...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1664:108: ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:1665:6: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1668:9: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:1668:10: {...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:1668:19: (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:1668:20: otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConcurrencyAccess().getCancelInProgressKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_33); 

            	    									newLeafNode(otherlv_7, grammarAccess.getConcurrencyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1676:9: ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:1677:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:1677:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    // InternalMyDsl.g:1678:11: lv_cancelInProgress_8_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getCancelInProgressEBooleanParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_32);
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
            	    break loop37;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1708:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_END_BLOCK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1709:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:1718:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:1718:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:1719:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalMyDsl.g:1725:1: ruleEnvironment returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1731:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1732:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1732:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1733:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1733:3: ()
            // InternalMyDsl.g:1734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1740:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_BEG_BLOCK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1741:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_34); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getEnvironmentAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1746:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1747:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1747:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1748:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1751:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1752:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1752:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            loop40:
            do {
                int alt40=3;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // InternalMyDsl.g:1753:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1753:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1754:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1754:108: ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1755:6: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1758:9: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1758:10: {...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:1758:19: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1758:20: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1766:9: ( (lv_name_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1767:10: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1767:10: (lv_name_5_0= ruleEString )
            	    // InternalMyDsl.g:1768:11: lv_name_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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
            	    // InternalMyDsl.g:1791:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1791:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1792:5: {...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1792:108: ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1793:6: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1796:9: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1796:10: {...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:1796:19: (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1796:20: otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,54,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1804:9: ( (lv_url_8_0= ruleEString ) )
            	    // InternalMyDsl.g:1805:10: (lv_url_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1805:10: (lv_url_8_0= ruleEString )
            	    // InternalMyDsl.g:1806:11: lv_url_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getUrlEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_34);
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
            	    break loop40;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1836:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_END_BLOCK) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:1837:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:1846:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // InternalMyDsl.g:1846:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalMyDsl.g:1847:2: iv_rulePermissions= rulePermissions EOF
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
    // InternalMyDsl.g:1853:1: rulePermissions returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_18= RULE_END_BLOCK )? ) ;
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
        Token this_END_BLOCK_18=null;
        AntlrDatatypeRuleToken lv_contents_5_0 = null;

        AntlrDatatypeRuleToken lv_securityEvents_8_0 = null;

        AntlrDatatypeRuleToken lv_actions_11_0 = null;

        AntlrDatatypeRuleToken lv_pages_14_0 = null;

        AntlrDatatypeRuleToken lv_idToken_17_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1859:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_18= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1860:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_18= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1860:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_18= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1861:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_18= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1861:3: ()
            // InternalMyDsl.g:1862:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionsAccess().getPermissionsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1868:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BEG_BLOCK) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1869:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_35); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPermissionsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1874:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1875:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1875:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1876:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1879:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1880:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1880:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) )*
            loop43:
            do {
                int alt43=6;
                int LA43_0 = input.LA(1);

                if ( LA43_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {
                    alt43=2;
                }
                else if ( LA43_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {
                    alt43=3;
                }
                else if ( LA43_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {
                    alt43=4;
                }
                else if ( LA43_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {
                    alt43=5;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMyDsl.g:1881:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1881:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1882:5: {...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1882:108: ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1883:6: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1886:9: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1886:10: {...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:1886:19: (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1886:20: otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPermissionsAccess().getContentsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPermissionsAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1894:9: ( (lv_contents_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1895:10: (lv_contents_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1895:10: (lv_contents_5_0= ruleEString )
            	    // InternalMyDsl.g:1896:11: lv_contents_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getContentsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    // InternalMyDsl.g:1919:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1919:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1920:5: {...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1920:108: ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1921:6: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1924:9: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1924:10: {...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:1924:19: (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1924:20: otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,45,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPermissionsAccess().getSecurityEventsKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPermissionsAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1932:9: ( (lv_securityEvents_8_0= ruleEString ) )
            	    // InternalMyDsl.g:1933:10: (lv_securityEvents_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1933:10: (lv_securityEvents_8_0= ruleEString )
            	    // InternalMyDsl.g:1934:11: lv_securityEvents_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getSecurityEventsEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    // InternalMyDsl.g:1957:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1957:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1958:5: {...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1958:108: ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1959:6: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1962:9: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1962:10: {...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:1962:19: (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1962:20: otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getPermissionsAccess().getActionsKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPermissionsAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:1970:9: ( (lv_actions_11_0= ruleEString ) )
            	    // InternalMyDsl.g:1971:10: (lv_actions_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1971:10: (lv_actions_11_0= ruleEString )
            	    // InternalMyDsl.g:1972:11: lv_actions_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getActionsEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    // InternalMyDsl.g:1995:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1995:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1996:5: {...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1996:108: ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1997:6: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2000:9: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2000:10: {...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2000:19: (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2000:20: otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,47,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPermissionsAccess().getPagesKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getPermissionsAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:2008:9: ( (lv_pages_14_0= ruleEString ) )
            	    // InternalMyDsl.g:2009:10: (lv_pages_14_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2009:10: (lv_pages_14_0= ruleEString )
            	    // InternalMyDsl.g:2010:11: lv_pages_14_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPagesEStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    // InternalMyDsl.g:2033:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2033:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2034:5: {...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2034:108: ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2035:6: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2038:9: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2038:10: {...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2038:19: (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2038:20: otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getPermissionsAccess().getIdTokenKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPermissionsAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:2046:9: ( (lv_idToken_17_0= ruleEString ) )
            	    // InternalMyDsl.g:2047:10: (lv_idToken_17_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2047:10: (lv_idToken_17_0= ruleEString )
            	    // InternalMyDsl.g:2048:11: lv_idToken_17_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getIdTokenEStringParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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

            	default :
            	    break loop43;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:2078:3: (this_END_BLOCK_18= RULE_END_BLOCK )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_END_BLOCK) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMyDsl.g:2079:4: this_END_BLOCK_18= RULE_END_BLOCK
                    {
                    this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_18, grammarAccess.getPermissionsAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // InternalMyDsl.g:2088:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDsl.g:2088:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDsl.g:2089:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDsl.g:2095:1: ruleJob returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? ) ;
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
        Token this_END_BLOCK_35=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_runsOn_9_0 = null;

        AntlrDatatypeRuleToken lv_needs_12_0 = null;

        AntlrDatatypeRuleToken lv_needs_16_0 = null;

        AntlrDatatypeRuleToken lv_needs_20_0 = null;

        AntlrDatatypeRuleToken lv_needs_22_0 = null;

        EObject lv_environment_26_0 = null;

        EObject lv_steps_30_0 = null;

        EObject lv_permissions_34_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2101:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2102:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2102:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2103:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2103:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2104:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2104:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2105:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,16,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2126:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_BEG_BLOCK) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2127:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_37); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2132:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2133:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2133:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2134:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2137:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2138:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2138:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )*
            loop54:
            do {
                int alt54=7;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // InternalMyDsl.g:2139:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2139:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2140:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2140:100: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2141:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2144:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2144:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2144:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2144:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getJobAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJobAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:2152:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2153:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2153:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2154:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
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
            	    // InternalMyDsl.g:2177:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2177:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2178:5: {...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2178:100: ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2179:6: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2182:9: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2182:10: {...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2182:19: (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2182:20: otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJobAccess().getRunsOnKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:2190:9: ( (lv_runsOn_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2191:10: (lv_runsOn_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2191:10: (lv_runsOn_9_0= ruleEString )
            	    // InternalMyDsl.g:2192:11: lv_runsOn_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getRunsOnEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
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
            	    // InternalMyDsl.g:2215:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2215:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:2216:5: {...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2216:100: ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalMyDsl.g:2217:6: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2220:9: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalMyDsl.g:2220:10: {...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2220:19: (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    // InternalMyDsl.g:2220:20: otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    {
            	    otherlv_10=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getJobAccess().getNeedsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_38); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJobAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:2228:9: ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
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
            	            // InternalMyDsl.g:2229:10: ( (lv_needs_12_0= ruleEString ) )
            	            {
            	            // InternalMyDsl.g:2229:10: ( (lv_needs_12_0= ruleEString ) )
            	            // InternalMyDsl.g:2230:11: (lv_needs_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2230:11: (lv_needs_12_0= ruleEString )
            	            // InternalMyDsl.g:2231:12: lv_needs_12_0= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_0_0());
            	            											
            	            pushFollow(FOLLOW_37);
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
            	            // InternalMyDsl.g:2249:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:2249:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            // InternalMyDsl.g:2250:11: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_24); 

            	            											newLeafNode(this_BEG_BLOCK_13, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:2254:11: (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:2255:12: otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_14=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_14, grammarAccess.getJobAccess().getHyphenMinusKeyword_3_2_2_1_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:2259:12: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	            	    int alt46=2;
            	            	    int LA46_0 = input.LA(1);

            	            	    if ( (LA46_0==RULE_BEG_BLOCK) ) {
            	            	        alt46=1;
            	            	    }
            	            	    switch (alt46) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:2260:13: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_15, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:2265:12: ( (lv_needs_16_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2266:13: (lv_needs_16_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2266:13: (lv_needs_16_0= ruleEString )
            	            	    // InternalMyDsl.g:2267:14: lv_needs_16_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_1_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_26);
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

            	            	    // InternalMyDsl.g:2284:12: (this_END_BLOCK_17= RULE_END_BLOCK )?
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
            	            	            // InternalMyDsl.g:2285:13: this_END_BLOCK_17= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

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

            	            this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_37); 

            	            											newLeafNode(this_END_BLOCK_18, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:2297:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            {
            	            // InternalMyDsl.g:2297:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            // InternalMyDsl.g:2298:11: otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']'
            	            {
            	            otherlv_19=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_3_2_2_2_0());
            	            										
            	            // InternalMyDsl.g:2302:11: ( (lv_needs_20_0= ruleEString ) )
            	            // InternalMyDsl.g:2303:12: (lv_needs_20_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2303:12: (lv_needs_20_0= ruleEString )
            	            // InternalMyDsl.g:2304:13: lv_needs_20_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_1_0());
            	            												
            	            pushFollow(FOLLOW_27);
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

            	            // InternalMyDsl.g:2321:11: (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )*
            	            loop49:
            	            do {
            	                int alt49=2;
            	                int LA49_0 = input.LA(1);

            	                if ( (LA49_0==30) ) {
            	                    alt49=1;
            	                }


            	                switch (alt49) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:2322:12: otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_21, grammarAccess.getJobAccess().getCommaKeyword_3_2_2_2_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:2326:12: ( (lv_needs_22_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2327:13: (lv_needs_22_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2327:13: (lv_needs_22_0= ruleEString )
            	            	    // InternalMyDsl.g:2328:14: lv_needs_22_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_2_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            otherlv_23=(Token)match(input,28,FOLLOW_37); 

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
            	    // InternalMyDsl.g:2358:4: ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2358:4: ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) )
            	    // InternalMyDsl.g:2359:5: {...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2359:100: ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) )
            	    // InternalMyDsl.g:2360:6: ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2363:9: ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) )
            	    // InternalMyDsl.g:2363:10: {...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2363:19: (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) )
            	    // InternalMyDsl.g:2363:20: otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) )
            	    {
            	    otherlv_24=(Token)match(input,55,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getJobAccess().getEnvironmentKeyword_3_3_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_39); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJobAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:2371:9: ( (lv_environment_26_0= ruleEnvironment ) )
            	    // InternalMyDsl.g:2372:10: (lv_environment_26_0= ruleEnvironment )
            	    {
            	    // InternalMyDsl.g:2372:10: (lv_environment_26_0= ruleEnvironment )
            	    // InternalMyDsl.g:2373:11: lv_environment_26_0= ruleEnvironment
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
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
            	    // InternalMyDsl.g:2396:4: ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:2396:4: ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2397:5: {...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2397:100: ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2398:6: ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2401:9: ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2401:10: {...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2401:19: (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2401:20: otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )?
            	    {
            	    otherlv_27=(Token)match(input,39,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getJobAccess().getStepsKeyword_3_4_0());
            	    								
            	    otherlv_28=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_28, grammarAccess.getJobAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:2409:9: (this_BEG_BLOCK_29= RULE_BEG_BLOCK )?
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_BEG_BLOCK) ) {
            	        alt51=1;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalMyDsl.g:2410:10: this_BEG_BLOCK_29= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_29=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	            										newLeafNode(this_BEG_BLOCK_29, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_4_2());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2415:9: ( (lv_steps_30_0= ruleStep ) )+
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
            	    	    // InternalMyDsl.g:2416:10: (lv_steps_30_0= ruleStep )
            	    	    {
            	    	    // InternalMyDsl.g:2416:10: (lv_steps_30_0= ruleStep )
            	    	    // InternalMyDsl.g:2417:11: lv_steps_30_0= ruleStep
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_3_4_3_0());
            	    	    										
            	    	    pushFollow(FOLLOW_40);
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

            	    // InternalMyDsl.g:2434:9: (this_END_BLOCK_31= RULE_END_BLOCK )?
            	    int alt53=2;
            	    int LA53_0 = input.LA(1);

            	    if ( (LA53_0==RULE_END_BLOCK) ) {
            	        alt53=1;
            	    }
            	    switch (alt53) {
            	        case 1 :
            	            // InternalMyDsl.g:2435:10: this_END_BLOCK_31= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_31=(Token)match(input,RULE_END_BLOCK,FOLLOW_37); 

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
            	    // InternalMyDsl.g:2446:4: ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2446:4: ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:2447:5: {...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:2447:100: ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:2448:6: ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:2451:9: ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:2451:10: {...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2451:19: (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:2451:20: otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) )
            	    {
            	    otherlv_32=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_32, grammarAccess.getJobAccess().getPermissionsKeyword_3_5_0());
            	    								
            	    otherlv_33=(Token)match(input,16,FOLLOW_41); 

            	    									newLeafNode(otherlv_33, grammarAccess.getJobAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:2459:9: ( (lv_permissions_34_0= rulePermissions ) )
            	    // InternalMyDsl.g:2460:10: (lv_permissions_34_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:2460:10: (lv_permissions_34_0= rulePermissions )
            	    // InternalMyDsl.g:2461:11: lv_permissions_34_0= rulePermissions
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getPermissionsPermissionsParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_37);
            	    lv_permissions_34_0=rulePermissions();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"permissions",
            	    												lv_permissions_34_0,
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
            	    break loop54;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:2491:3: (this_END_BLOCK_35= RULE_END_BLOCK )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_END_BLOCK) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2492:4: this_END_BLOCK_35= RULE_END_BLOCK
                    {
                    this_END_BLOCK_35=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_35, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

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
    // InternalMyDsl.g:2501:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalMyDsl.g:2501:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:2502:2: iv_ruleStep= ruleStep EOF
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
    // InternalMyDsl.g:2508:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? ) ;
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
        Token this_BEG_BLOCK_27=null;
        Token this_END_BLOCK_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token this_BEG_BLOCK_32=null;
        Token this_END_BLOCK_34=null;
        Token this_END_BLOCK_35=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;

        AntlrDatatypeRuleToken lv_uses_12_0 = null;

        AntlrDatatypeRuleToken lv_run_15_0 = null;

        AntlrDatatypeRuleToken lv_if_18_0 = null;

        AntlrDatatypeRuleToken lv_workingDirectory_21_0 = null;

        AntlrDatatypeRuleToken lv_shell_24_0 = null;

        EObject lv_with_28_0 = null;

        EObject lv_env_33_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2514:2: ( ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2515:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2515:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2516:3: () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2516:3: ()
            // InternalMyDsl.g:2517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            // InternalMyDsl.g:2527:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_BEG_BLOCK) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMyDsl.g:2528:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_43); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2533:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2534:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2534:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2535:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2538:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:2539:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2539:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop63:
            do {
                int alt63=10;
                alt63 = dfa63.predict(input);
                switch (alt63) {
            	case 1 :
            	    // InternalMyDsl.g:2540:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2540:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2541:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2541:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2542:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2545:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2545:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2545:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2545:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getStepAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:2553:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2554:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2554:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2555:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2578:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2578:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2579:5: {...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2579:101: ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2580:6: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2583:9: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2583:10: {...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2583:19: (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2583:20: otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,56,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStepAccess().getIdKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:2591:9: ( (lv_id_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2592:10: (lv_id_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2592:10: (lv_id_9_0= ruleEString )
            	    // InternalMyDsl.g:2593:11: lv_id_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIdEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2616:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2616:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2617:5: {...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2617:101: ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2618:6: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2621:9: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2621:10: {...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2621:19: (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2621:20: otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,40,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStepAccess().getUsesKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStepAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:2629:9: ( (lv_uses_12_0= ruleEString ) )
            	    // InternalMyDsl.g:2630:10: (lv_uses_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2630:10: (lv_uses_12_0= ruleEString )
            	    // InternalMyDsl.g:2631:11: lv_uses_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getUsesEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2654:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2654:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2655:5: {...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2655:101: ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2656:6: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2659:9: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2659:10: {...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2659:19: (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2659:20: otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStepAccess().getRunKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_14, grammarAccess.getStepAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:2667:9: ( (lv_run_15_0= ruleEString ) )
            	    // InternalMyDsl.g:2668:10: (lv_run_15_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2668:10: (lv_run_15_0= ruleEString )
            	    // InternalMyDsl.g:2669:11: lv_run_15_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2692:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2692:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2693:5: {...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2693:101: ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2694:6: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2697:9: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2697:10: {...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2697:19: (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2697:20: otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getStepAccess().getIfKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getStepAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:2705:9: ( (lv_if_18_0= ruleEString ) )
            	    // InternalMyDsl.g:2706:10: (lv_if_18_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2706:10: (lv_if_18_0= ruleEString )
            	    // InternalMyDsl.g:2707:11: lv_if_18_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIfEStringParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2730:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2730:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2731:5: {...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:2731:101: ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2732:6: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:2735:9: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2735:10: {...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2735:19: (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2735:20: otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getStepAccess().getWorkingDirectoryKeyword_3_5_0());
            	    								
            	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_20, grammarAccess.getStepAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:2743:9: ( (lv_workingDirectory_21_0= ruleEString ) )
            	    // InternalMyDsl.g:2744:10: (lv_workingDirectory_21_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2744:10: (lv_workingDirectory_21_0= ruleEString )
            	    // InternalMyDsl.g:2745:11: lv_workingDirectory_21_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getWorkingDirectoryEStringParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2768:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2768:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2769:5: {...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:2769:101: ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2770:6: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:2773:9: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2773:10: {...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2773:19: (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2773:20: otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getStepAccess().getShellKeyword_3_6_0());
            	    								
            	    otherlv_23=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getStepAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:2781:9: ( (lv_shell_24_0= ruleEString ) )
            	    // InternalMyDsl.g:2782:10: (lv_shell_24_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2782:10: (lv_shell_24_0= ruleEString )
            	    // InternalMyDsl.g:2783:11: lv_shell_24_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getShellEStringParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_43);
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
            	    // InternalMyDsl.g:2806:4: ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2806:4: ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:2807:5: {...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:2807:101: ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2808:6: ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:2811:9: ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2811:10: {...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2811:19: (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2811:20: otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? )
            	    {
            	    otherlv_25=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getStepAccess().getWithKeyword_3_7_0());
            	    								
            	    otherlv_26=(Token)match(input,16,FOLLOW_11); 

            	    									newLeafNode(otherlv_26, grammarAccess.getStepAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:2819:9: ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2820:10: (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:2820:10: (this_BEG_BLOCK_27= RULE_BEG_BLOCK )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==RULE_BEG_BLOCK) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalMyDsl.g:2821:11: this_BEG_BLOCK_27= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_27=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            	            											newLeafNode(this_BEG_BLOCK_27, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_7_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2826:10: ( (lv_with_28_0= ruleKeyValuePair ) )+
            	    int cnt58=0;
            	    loop58:
            	    do {
            	        int alt58=2;
            	        alt58 = dfa58.predict(input);
            	        switch (alt58) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2827:11: (lv_with_28_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:2827:11: (lv_with_28_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:2828:12: lv_with_28_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getWithKeyValuePairParserRuleCall_3_7_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_44);
            	    	    lv_with_28_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getStepRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"with",
            	    	    													lv_with_28_0,
            	    	    													"pt.isep.yamldslgen.xtext.MyDsl.KeyValuePair");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt58 >= 1 ) break loop58;
            	                EarlyExitException eee =
            	                    new EarlyExitException(58, input);
            	                throw eee;
            	        }
            	        cnt58++;
            	    } while (true);

            	    // InternalMyDsl.g:2845:10: (this_END_BLOCK_29= RULE_END_BLOCK )?
            	    int alt59=2;
            	    int LA59_0 = input.LA(1);

            	    if ( (LA59_0==RULE_END_BLOCK) ) {
            	        alt59=1;
            	    }
            	    switch (alt59) {
            	        case 1 :
            	            // InternalMyDsl.g:2846:11: this_END_BLOCK_29= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_29=(Token)match(input,RULE_END_BLOCK,FOLLOW_43); 

            	            											newLeafNode(this_END_BLOCK_29, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_3_7_2_2());
            	            										

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
            	case 9 :
            	    // InternalMyDsl.g:2858:4: ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2858:4: ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:2859:5: {...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalMyDsl.g:2859:101: ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2860:6: ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalMyDsl.g:2863:9: ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2863:10: {...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2863:19: (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2863:20: otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? )
            	    {
            	    otherlv_30=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getStepAccess().getEnvKeyword_3_8_0());
            	    								
            	    otherlv_31=(Token)match(input,16,FOLLOW_11); 

            	    									newLeafNode(otherlv_31, grammarAccess.getStepAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalMyDsl.g:2871:9: ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2872:10: (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:2872:10: (this_BEG_BLOCK_32= RULE_BEG_BLOCK )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==RULE_BEG_BLOCK) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // InternalMyDsl.g:2873:11: this_BEG_BLOCK_32= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_32=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            	            											newLeafNode(this_BEG_BLOCK_32, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_8_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2878:10: ( (lv_env_33_0= ruleKeyValuePair ) )+
            	    int cnt61=0;
            	    loop61:
            	    do {
            	        int alt61=2;
            	        alt61 = dfa61.predict(input);
            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2879:11: (lv_env_33_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:2879:11: (lv_env_33_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:2880:12: lv_env_33_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getEnvKeyValuePairParserRuleCall_3_8_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_44);
            	    	    lv_env_33_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getStepRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"env",
            	    	    													lv_env_33_0,
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

            	    // InternalMyDsl.g:2897:10: (this_END_BLOCK_34= RULE_END_BLOCK )?
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( (LA62_0==RULE_END_BLOCK) ) {
            	        alt62=1;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // InternalMyDsl.g:2898:11: this_END_BLOCK_34= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_34=(Token)match(input,RULE_END_BLOCK,FOLLOW_43); 

            	            											newLeafNode(this_END_BLOCK_34, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_3_8_2_2());
            	            										

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
            	    break loop63;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:2917:3: (this_END_BLOCK_35= RULE_END_BLOCK )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_END_BLOCK) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMyDsl.g:2918:4: this_END_BLOCK_35= RULE_END_BLOCK
                    {
                    this_END_BLOCK_35=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_35, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

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
    // InternalMyDsl.g:2927:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalMyDsl.g:2927:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:2928:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalMyDsl.g:2934:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2940:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:2941:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:2941:2: (kw= 'true' | kw= 'false' )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==22) ) {
                alt65=1;
            }
            else if ( (LA65_0==23) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalMyDsl.g:2942:3: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2948:3: kw= 'false'
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
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\77\uffff";
    static final String dfa_2s = "\1\1\10\uffff\1\1\1\uffff\1\1\12\uffff\2\25\14\54\10\64\1\uffff\5\64\1\1\2\uffff\5\76\5\uffff";
    static final String dfa_3s = "\1\5\1\uffff\5\20\1\uffff\1\6\4\4\11\uffff\2\5\2\4\22\5\1\uffff\5\5\1\4\1\6\1\uffff\5\5\5\uffff";
    static final String dfa_4s = "\1\60\1\uffff\5\20\1\uffff\1\31\1\62\1\31\2\60\11\uffff\26\60\1\uffff\5\60\1\67\1\31\1\uffff\5\60\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\5\uffff\1\1\5\uffff\11\1\26\uffff\1\1\7\uffff\1\1\5\uffff\5\1";
    static final String dfa_6s = "\77\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\3\7\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\13\uffff\20\7",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15\1\16\1\21\1\22\1\23\13\uffff\1\24\1\25\1\17\1\20",
            "\2\1\5\25\4\uffff\1\1\1\uffff\5\1\4\25\7\uffff\2\1\16\uffff\2\1",
            "\1\1\1\uffff\1\26\1\27\1\32\1\33\1\34\13\uffff\1\35\1\36\1\30\1\31",
            "\2\1\5\25\4\uffff\1\1\1\uffff\5\1\4\25\22\uffff\5\1",
            "\1\1\1\uffff\2\25\1\40\1\37\1\41\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\25\7\uffff\20\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\20\25",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\20\25",
            "\1\42\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\54",
            "\1\42\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\20\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\20\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\54\1\64\5\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\20\64",
            "\1\64\2\uffff\1\64\1\7\1\64\4\uffff\1\64\1\1\5\64\13\uffff\20\64",
            "\4\1\1\65\1\66\1\67\4\uffff\1\1\1\uffff\5\1\1\70\1\71\2\1\13\uffff\3\1\17\uffff\1\1",
            "\2\1\1\72\1\73\1\74\13\uffff\1\75\1\76\2\1",
            "",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\20\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\20\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\20\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\20\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\20\76",
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
    static final String dfa_11s = "\1\72\7\uffff\1\72\11\uffff\2\40\3\uffff\2\36\10\40\1\67\1\40\1\67\4\40\1\36\1\67\1\62\5\uffff\1\36\12\40\5\36\2\67\6\40\2\36\1\67\3\40";
    static final String dfa_12s = "\1\uffff\1\17\1\3\1\1\1\4\1\5\1\2\1\6\1\uffff\1\10\1\12\1\7\1\11\1\14\1\15\1\16\2\13\2\uffff\3\13\24\uffff\5\13\36\uffff";
    static final String dfa_13s = "\116\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\5\1\6\1\3\1\2\1\4\1\17\3\uffff\1\1\1\12\11\1\1\7\1\13\1\11\1\14\1\10\1\15\1\16\22\1\1\uffff\7\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\26\1\20\1\21\1\24\1\25\2\26\3\uffff\7\26\1\27\1\30\1\22\1\23\31\26\1\uffff\7\26",
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
            "\1\52\1\57\1\54\1\53\1\55\1\56\1\47\3\uffff\1\1\1\43\11\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46\2\uffff\5\1\17\uffff\1\1",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\1\60\1\65\1\62\1\61\1\63\1\64\1\47\3\uffff\1\57\1\43\11\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\17\uffff\1\57",
            "\1\50\1\66\1\67\1\70\1\71\1\72\1\47\4\uffff\1\43\5\uffff\4\1\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\57\13\uffff\1\1\1\uffff\1\1",
            "\4\57\1\73\1\74\1\75\4\uffff\1\57\1\uffff\5\57\1\76\1\77\2\57\13\uffff\3\57\17\uffff\1\57",
            "\6\1\4\uffff\1\1\1\57\11\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\16\uffff\2\1",
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
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\43\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\101\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\65\1\62\1\102\1\103\1\104\1\47\3\uffff\1\57\1\43\11\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\17\uffff\1\57",
            "\1\57\1\60\1\65\1\62\1\105\1\106\1\107\1\47\3\uffff\1\57\1\43\5\57\1\110\1\111\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\17\uffff\1\57",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\100\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\50\1\36\1\33\1\32\1\34\1\35\1\47\4\uffff\1\112\11\uffff\1\37\1\40\1\41\1\42\1\44\1\45\1\46",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\51\13\uffff\1\1\1\uffff\1\1",
            "\1\57\1\60\1\65\1\62\1\113\1\114\1\115\1\47\3\uffff\1\57\1\43\5\57\1\76\1\77\2\57\1\37\1\40\1\41\1\42\1\44\1\45\1\46\4\uffff\3\57\17\uffff\1\57",
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
    static final String dfa_18s = "\1\67\1\uffff\1\20\1\uffff\1\31\11\0\1\uffff";
    static final String dfa_19s = "\1\uffff\1\3\1\uffff\1\2\12\uffff\1\1";
    static final String dfa_20s = "\1\1\4\uffff\1\7\1\3\1\10\1\6\1\0\1\11\1\5\1\4\1\2\1\uffff}>";
    static final String[] dfa_21s = {
            "\6\1\4\uffff\1\2\1\uffff\11\1\13\uffff\3\1\16\uffff\1\3\1\1",
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

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 1752:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_9 = input.LA(1);

                         
                        int index40_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==EOF||(LA40_0>=RULE_END_BLOCK && LA40_0<=RULE_INT)||(LA40_0>=17 && LA40_0<=25)||(LA40_0>=37 && LA40_0<=39)||LA40_0==55) ) {s = 1;}

                        else if ( (LA40_0==15) ) {s = 2;}

                        else if ( LA40_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_13 = input.LA(1);

                         
                        int index40_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_6 = input.LA(1);

                         
                        int index40_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_12 = input.LA(1);

                         
                        int index40_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_11 = input.LA(1);

                         
                        int index40_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_11);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_8 = input.LA(1);

                         
                        int index40_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_8);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA40_5 = input.LA(1);

                         
                        int index40_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_5);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA40_7 = input.LA(1);

                         
                        int index40_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_7);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA40_10 = input.LA(1);

                         
                        int index40_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index40_10);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_22s = "\25\uffff";
    static final String dfa_23s = "\1\1\24\uffff";
    static final String dfa_24s = "\1\5\1\uffff\2\20\4\uffff\1\6\12\0\2\uffff";
    static final String dfa_25s = "\1\67\1\uffff\2\20\4\uffff\1\31\12\0\2\uffff";
    static final String dfa_26s = "\1\uffff\1\7\2\uffff\1\2\1\3\1\4\1\5\13\uffff\1\6\1\1";
    static final String dfa_27s = "\1\10\10\uffff\1\4\1\3\1\7\1\0\1\2\1\5\1\11\1\12\1\6\1\1\2\uffff}>";
    static final String[] dfa_28s = {
            "\6\1\4\uffff\1\2\1\uffff\3\1\1\3\5\1\13\uffff\1\4\1\5\1\7\17\uffff\1\6",
            "",
            "\1\10",
            "\1\11",
            "",
            "",
            "",
            "",
            "\1\12\1\13\1\16\1\17\1\20\13\uffff\1\21\1\22\1\14\1\15",
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

    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final char[] dfa_24 = DFA.unpackEncodedStringToUnsignedChars(dfa_24s);
    static final char[] dfa_25 = DFA.unpackEncodedStringToUnsignedChars(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[][] dfa_28 = unpackEncodedStringArray(dfa_28s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 2138:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'environment' otherlv_25= ':' ( (lv_environment_26_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'steps' otherlv_28= ':' (this_BEG_BLOCK_29= RULE_BEG_BLOCK )? ( (lv_steps_30_0= ruleStep ) )+ (this_END_BLOCK_31= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'permissions' otherlv_33= ':' ( (lv_permissions_34_0= rulePermissions ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_12 = input.LA(1);

                         
                        int index54_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_12);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_18 = input.LA(1);

                         
                        int index54_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_18);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_13 = input.LA(1);

                         
                        int index54_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_13);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA54_10 = input.LA(1);

                         
                        int index54_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_10);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA54_9 = input.LA(1);

                         
                        int index54_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA54_14 = input.LA(1);

                         
                        int index54_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_14);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA54_17 = input.LA(1);

                         
                        int index54_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_17);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA54_11 = input.LA(1);

                         
                        int index54_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_11);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==EOF||(LA54_0>=RULE_END_BLOCK && LA54_0<=RULE_INT)||(LA54_0>=17 && LA54_0<=19)||(LA54_0>=21 && LA54_0<=25)) ) {s = 1;}

                        else if ( (LA54_0==15) ) {s = 2;}

                        else if ( (LA54_0==20) ) {s = 3;}

                        else if ( LA54_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                        else if ( LA54_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {s = 5;}

                        else if ( LA54_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {s = 6;}

                        else if ( LA54_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {s = 7;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA54_15 = input.LA(1);

                         
                        int index54_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_15);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA54_16 = input.LA(1);

                         
                        int index54_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_16);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\73\uffff";
    static final String dfa_30s = "\1\1\72\uffff";
    static final String dfa_31s = "\1\5\1\uffff\2\20\7\uffff\1\6\1\4\11\0\1\10\30\20\1\uffff\1\6\11\0\1\uffff";
    static final String dfa_32s = "\1\72\1\uffff\2\20\7\uffff\1\31\1\60\11\0\1\60\30\20\1\uffff\1\31\11\0\1\uffff";
    static final String dfa_33s = "\1\uffff\1\12\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\44\uffff\1\1\12\uffff\1\11";
    static final String dfa_34s = "\1\17\14\uffff\1\10\1\21\1\16\1\22\1\5\1\14\1\1\1\13\1\20\33\uffff\1\7\1\12\1\0\1\4\1\3\1\11\1\15\1\2\1\6\1\uffff}>";
    static final String[] dfa_35s = {
            "\6\1\4\uffff\1\2\1\uffff\4\1\1\3\5\1\12\uffff\3\1\1\5\1\6\1\12\1\11\13\uffff\1\1\1\4\1\7\1\10",
            "",
            "\1\13",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\1\16\1\21\1\22\1\23\13\uffff\1\24\1\25\1\17\1\20",
            "\1\26\3\uffff\1\30\1\27\1\31\4\uffff\1\32\1\uffff\1\33\1\uffff\1\34\1\35\1\36\13\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\30\1\27\1\31\4\uffff\1\32\1\uffff\1\33\1\uffff\1\34\1\35\1\36\13\uffff\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "\1\60",
            "",
            "\1\61\1\62\1\65\1\66\1\67\13\uffff\1\70\1\71\1\63\1\64",
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

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "()* loopback of 2539:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA63_51 = input.LA(1);

                         
                        int index63_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_51);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA63_19 = input.LA(1);

                         
                        int index63_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_19);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA63_56 = input.LA(1);

                         
                        int index63_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_56);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA63_53 = input.LA(1);

                         
                        int index63_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_53);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA63_52 = input.LA(1);

                         
                        int index63_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_52);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA63_17 = input.LA(1);

                         
                        int index63_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_17);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA63_57 = input.LA(1);

                         
                        int index63_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_57);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA63_49 = input.LA(1);

                         
                        int index63_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_49);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA63_13 = input.LA(1);

                         
                        int index63_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_13);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA63_54 = input.LA(1);

                         
                        int index63_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_54);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA63_50 = input.LA(1);

                         
                        int index63_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_50);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA63_20 = input.LA(1);

                         
                        int index63_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_20);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA63_18 = input.LA(1);

                         
                        int index63_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_18);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA63_55 = input.LA(1);

                         
                        int index63_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_55);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA63_15 = input.LA(1);

                         
                        int index63_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA63_0 = input.LA(1);

                         
                        int index63_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA63_0==EOF||(LA63_0>=RULE_END_BLOCK && LA63_0<=RULE_INT)||(LA63_0>=17 && LA63_0<=20)||(LA63_0>=22 && LA63_0<=26)||(LA63_0>=37 && LA63_0<=39)||LA63_0==55) ) {s = 1;}

                        else if ( (LA63_0==15) ) {s = 2;}

                        else if ( (LA63_0==21) ) {s = 3;}

                        else if ( LA63_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                        else if ( LA63_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 5;}

                        else if ( LA63_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {s = 6;}

                        else if ( LA63_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 7;}

                        else if ( LA63_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {s = 8;}

                        else if ( LA63_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {s = 9;}

                        else if ( LA63_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 10;}

                         
                        input.seek(index63_0);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA63_21 = input.LA(1);

                         
                        int index63_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_21);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA63_14 = input.LA(1);

                         
                        int index63_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_14);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA63_16 = input.LA(1);

                         
                        int index63_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index63_16);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 63, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_36s = "\u008c\uffff";
    static final String dfa_37s = "\1\1\22\uffff\1\1\1\uffff\1\1\1\uffff\1\1\20\uffff\2\145\17\163\55\uffff\4\163\5\uffff\4\163\1\uffff\5\163\1\1\2\uffff\6\u008b\12\uffff";
    static final String dfa_38s = "\1\5\1\uffff\17\20\1\uffff\1\6\5\4\1\6\2\4\3\6\1\4\11\uffff\2\5\2\4\15\5\55\uffff\4\5\5\uffff\1\4\3\5\1\uffff\5\5\1\4\2\6\6\5\12\uffff";
    static final String dfa_39s = "\1\72\1\uffff\17\20\1\uffff\1\31\1\62\1\31\1\67\1\60\1\67\1\31\1\33\1\32\3\31\1\60\11\uffff\21\72\55\uffff\4\72\5\uffff\4\72\1\uffff\5\72\1\67\2\31\6\72\12\uffff";
    static final String dfa_40s = "\1\uffff\1\2\17\uffff\1\1\15\uffff\11\1\21\uffff\55\1\4\uffff\5\1\4\uffff\1\1\16\uffff\12\1";
    static final String dfa_41s = "\u008c\uffff}>";
    static final String[] dfa_42s = {
            "\3\1\1\7\1\10\1\11\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\5\1\6\uffff\4\21\1\12\1\13\1\14\1\15\1\16\1\20\1\17\5\21\6\uffff\4\1",
            "",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\27",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "\1\37\1\40\1\43\1\44\1\45\13\uffff\1\46\1\47\1\41\1\42",
            "\2\1\5\47\4\uffff\1\1\1\uffff\5\1\4\47\7\uffff\2\1\16\uffff\2\1",
            "\1\1\1\uffff\1\50\1\51\1\54\1\55\1\56\13\uffff\1\57\1\60\1\52\1\53",
            "\2\1\1\50\1\51\1\54\1\55\1\56\4\uffff\1\1\1\uffff\5\1\1\57\1\60\1\52\1\53\13\uffff\3\1\4\uffff\5\1\6\uffff\1\1",
            "\1\1\1\uffff\2\47\1\61\1\62\1\63\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\47\7\uffff\20\1",
            "\2\1\1\50\1\51\1\64\1\65\1\66\4\uffff\1\1\1\uffff\5\1\1\67\1\70\1\52\1\53\13\uffff\3\1\17\uffff\1\1",
            "\1\71\1\72\1\75\1\76\1\77\13\uffff\1\100\1\101\1\73\1\74",
            "\1\1\1\uffff\1\102\1\103\1\106\1\107\1\110\13\uffff\1\111\1\112\1\104\1\105\1\uffff\1\1",
            "\1\1\1\uffff\5\112\13\uffff\4\112\1\1",
            "\1\113\1\114\1\117\1\120\1\121\13\uffff\1\122\1\123\1\115\1\116",
            "\1\124\1\125\1\130\1\131\1\132\13\uffff\1\133\1\134\1\126\1\127",
            "\1\135\1\136\1\141\1\142\1\143\13\uffff\1\144\1\145\1\137\1\140",
            "\1\1\1\uffff\2\145\1\146\1\147\1\150\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\145\7\uffff\20\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\145\4\uffff\1\145\1\1\12\145\6\uffff\1\21\17\145\6\uffff\4\145",
            "\6\145\4\uffff\1\145\1\1\12\145\6\uffff\1\21\17\145\6\uffff\4\145",
            "\1\151\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\1\151\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\172\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\172\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\172\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\171\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
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
            "\6\163\4\uffff\1\163\1\173\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\173\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\173\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "",
            "",
            "",
            "",
            "",
            "\1\163\1\174\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\1\170\1\156\1\153\1\152\1\154\1\155\1\167\3\uffff\13\163\1\157\1\160\1\161\1\162\1\164\1\165\1\166\1\21\17\163\6\uffff\4\163",
            "\6\163\4\uffff\1\163\1\1\12\163\6\uffff\1\21\17\163\6\uffff\4\163",
            "\4\1\1\175\1\176\1\177\4\uffff\1\1\1\uffff\5\1\1\u0080\1\u0081\2\1\13\uffff\3\1\17\uffff\1\1",
            "\2\1\1\u0082\1\u0083\1\u0084\13\uffff\1\u0085\1\u0086\2\1",
            "\2\1\1\u0087\1\u0088\1\u0089\13\uffff\1\u008a\1\u008b\2\1",
            "\6\u008b\4\uffff\1\u008b\1\1\12\u008b\6\uffff\1\21\17\u008b\6\uffff\4\u008b",
            "\6\u008b\4\uffff\1\u008b\1\171\12\u008b\6\uffff\1\21\17\u008b\6\uffff\4\u008b",
            "\6\u008b\4\uffff\1\u008b\1\171\12\u008b\6\uffff\1\21\17\u008b\6\uffff\4\u008b",
            "\6\u008b\4\uffff\1\u008b\1\171\12\u008b\6\uffff\1\21\17\u008b\6\uffff\4\u008b",
            "\6\u008b\4\uffff\1\u008b\1\171\12\u008b\6\uffff\1\21\17\u008b\6\uffff\4\u008b",
            "\6\u008b\4\uffff\1\u008b\1\171\12\u008b\6\uffff\1\21\17\u008b\6\uffff\4\u008b",
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

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()+ loopback of 2826:10: ( (lv_with_28_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()+ loopback of 2878:10: ( (lv_env_33_0= ruleKeyValuePair ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003C007C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003E8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00060006003E8030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00300000003E8030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C007D0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003FE87F2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0001F000003E8030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0001FFFE003A8710L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0001FFFE003E8732L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00700L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001FC010FF2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001FC010FE2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0006000600000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0006000604000032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0006000603C007E2L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0030000000000022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0040000000008022L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001F00000000022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x008000E000108032L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x008000E000108022L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000BC007D0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00C000E000108030L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x008000E004108032L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0081F0E000108030L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x07000F0000208032L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x07000F0000208022L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0701FFFE003A8732L});

}

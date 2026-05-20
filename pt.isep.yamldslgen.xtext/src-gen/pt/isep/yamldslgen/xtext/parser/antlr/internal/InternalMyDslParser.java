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
<<<<<<< Updated upstream
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PLAIN_SCALAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "':'", "'on'", "'jobs'", "'true'", "'false'", "'push'", "'pull_request'", "'runs-on'", "'needs'", "'-'", "'['", "','", "']'", "'steps'", "'permissions'", "'branches'", "'tags'", "'uses'", "'run'", "'with'", "'contents'", "'java-version'", "'distribution'", "'path'", "'target'", "'token'", "'files'", "'generate_release_notes'"
=======
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_GH_EXPRESSION", "RULE_YAML_SCALAR", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'name'", "':'", "'on'", "'concurrency'", "'jobs'", "'permissions'", "'env'", "'true'", "'false'", "'>'", "'|'", "'-'", "'['", "']'", "';'", "','", "'{'", "'}'", "'push'", "'pull_request'", "'branches'", "'tags'", "'runs-on'", "'needs'", "'steps'", "'uses'", "'run'", "'with'", "'shell'", "'contents'", "'security-events'", "'actions'", "'pages'", "'id-token'", "'types'", "'pull-requests'", "'if'", "'schedule'", "'workflow_dispatch'", "'cron'", "'group'", "'cancel-in-progress'", "'url'", "'environment'", "'id'", "'working-directory'"
>>>>>>> Stashed changes
    };
    public static final int RULE_STRING=6;
    public static final int RULE_BEG_BLOCK=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
<<<<<<< Updated upstream
=======
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
>>>>>>> Stashed changes
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_END_BLOCK=5;
    public static final int RULE_ID=7;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int RULE_PLAIN_SCALAR=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

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
    // InternalMyDsl.g:71:1: ruleGithubActions returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGithubActions() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_BEG_BLOCK_9=null;
        Token this_END_BLOCK_11=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_on_6_0 = null;

        EObject lv_jobs_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) ) )
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) )
            {
            // InternalMyDsl.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            			
            // InternalMyDsl.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'name' otherlv_2= ':' ( (lv_name_3_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'on' otherlv_5= ':' ( (lv_on_6_0= ruleOn ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=4;
                int LA2_0 = input.LA(1);

                if ( LA2_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 0) ) {
                    alt2=1;
                }
                else if ( LA2_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 1) ) {
                    alt2=2;
                }
                else if ( LA2_0 == 17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2) ) {
                    alt2=3;
                }


                switch (alt2) {
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
            	    otherlv_1=(Token)match(input,14,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGithubActionsAccess().getNameKeyword_0_0());
            	    							
            	    otherlv_2=(Token)match(input,15,FOLLOW_4); 

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
            	    otherlv_4=(Token)match(input,16,FOLLOW_3); 

            	    								newLeafNode(otherlv_4, grammarAccess.getGithubActionsAccess().getOnKeyword_1_0());
            	    							
            	    otherlv_5=(Token)match(input,15,FOLLOW_6); 

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
            	    // InternalMyDsl.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:161:3: ({...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:162:4: {...}? => ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "getUnorderedGroupHelper().canSelect(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyDsl.g:162:107: ( ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:163:5: ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGithubActionsAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyDsl.g:166:8: ({...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:166:9: {...}? => (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGithubActions", "true");
            	    }
            	    // InternalMyDsl.g:166:18: (otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK )
            	    // InternalMyDsl.g:166:19: otherlv_7= 'jobs' otherlv_8= ':' this_BEG_BLOCK_9= RULE_BEG_BLOCK ( (lv_jobs_10_0= ruleJob ) )+ this_END_BLOCK_11= RULE_END_BLOCK
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_3); 

            	    								newLeafNode(otherlv_7, grammarAccess.getGithubActionsAccess().getJobsKeyword_2_0());
            	    							
            	    otherlv_8=(Token)match(input,15,FOLLOW_6); 

            	    								newLeafNode(otherlv_8, grammarAccess.getGithubActionsAccess().getColonKeyword_2_1());
            	    							
            	    this_BEG_BLOCK_9=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	    								newLeafNode(this_BEG_BLOCK_9, grammarAccess.getGithubActionsAccess().getBEG_BLOCKTerminalRuleCall_2_2());
            	    							
            	    // InternalMyDsl.g:178:8: ( (lv_jobs_10_0= ruleJob ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_PLAIN_SCALAR)||(LA1_0>=18 && LA1_0<=19)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:179:9: (lv_jobs_10_0= ruleJob )
            	    	    {
            	    	    // InternalMyDsl.g:179:9: (lv_jobs_10_0= ruleJob )
            	    	    // InternalMyDsl.g:180:10: lv_jobs_10_0= ruleJob
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getGithubActionsAccess().getJobsJobParserRuleCall_2_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_jobs_10_0=ruleJob();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getGithubActionsRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"jobs",
            	    	    											lv_jobs_10_0,
            	    	    											"pt.isep.yamldslgen.xtext.MyDsl.Job");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	    this_END_BLOCK_11=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	    								newLeafNode(this_END_BLOCK_11, grammarAccess.getGithubActionsAccess().getEND_BLOCKTerminalRuleCall_2_4());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGithubActionsAccess().getUnorderedGroup());
            	    				

            	    }


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
    // InternalMyDsl.g:218:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:218:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:219:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:225:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_PlainScalar_1= rulePlainScalar ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        AntlrDatatypeRuleToken this_PlainScalar_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:231:2: ( (this_STRING_0= RULE_STRING | this_PlainScalar_1= rulePlainScalar ) )
            // InternalMyDsl.g:232:2: (this_STRING_0= RULE_STRING | this_PlainScalar_1= rulePlainScalar )
            {
            // InternalMyDsl.g:232:2: (this_STRING_0= RULE_STRING | this_PlainScalar_1= rulePlainScalar )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_PLAIN_SCALAR)||(LA3_0>=18 && LA3_0<=19)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:233:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:241:3: this_PlainScalar_1= rulePlainScalar
                    {

                    			newCompositeNode(grammarAccess.getEStringAccess().getPlainScalarParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PlainScalar_1=rulePlainScalar();

                    state._fsp--;


                    			current.merge(this_PlainScalar_1);
                    		

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


    // $ANTLR start "entryRulePlainScalar"
    // InternalMyDsl.g:255:1: entryRulePlainScalar returns [String current=null] : iv_rulePlainScalar= rulePlainScalar EOF ;
    public final String entryRulePlainScalar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePlainScalar = null;


        try {
            // InternalMyDsl.g:255:51: (iv_rulePlainScalar= rulePlainScalar EOF )
            // InternalMyDsl.g:256:2: iv_rulePlainScalar= rulePlainScalar EOF
            {
             newCompositeNode(grammarAccess.getPlainScalarRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlainScalar=rulePlainScalar();

            state._fsp--;

             current =iv_rulePlainScalar.getText(); 
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
    // $ANTLR end "entryRulePlainScalar"


    // $ANTLR start "rulePlainScalar"
    // InternalMyDsl.g:262:1: rulePlainScalar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_PLAIN_SCALAR_2= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' ) (this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_PLAIN_SCALAR_7= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' )* ) ;
    public final AntlrDatatypeRuleToken rulePlainScalar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_INT_1=null;
        Token this_PLAIN_SCALAR_2=null;
        Token kw=null;
        Token this_ID_5=null;
        Token this_INT_6=null;
        Token this_PLAIN_SCALAR_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:268:2: ( ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_PLAIN_SCALAR_2= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' ) (this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_PLAIN_SCALAR_7= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' )* ) )
            // InternalMyDsl.g:269:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_PLAIN_SCALAR_2= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' ) (this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_PLAIN_SCALAR_7= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' )* )
            {
            // InternalMyDsl.g:269:2: ( (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_PLAIN_SCALAR_2= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' ) (this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_PLAIN_SCALAR_7= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' )* )
            // InternalMyDsl.g:270:3: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_PLAIN_SCALAR_2= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' ) (this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_PLAIN_SCALAR_7= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' )*
            {
            // InternalMyDsl.g:270:3: (this_ID_0= RULE_ID | this_INT_1= RULE_INT | this_PLAIN_SCALAR_2= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_PLAIN_SCALAR:
                {
                alt4=3;
                }
                break;
            case 18:
                {
                alt4=4;
                }
                break;
            case 19:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:271:4: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_8); 

                    				current.merge(this_ID_0);
                    			

                    				newLeafNode(this_ID_0, grammarAccess.getPlainScalarAccess().getIDTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:279:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_8); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getPlainScalarAccess().getINTTerminalRuleCall_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:287:4: this_PLAIN_SCALAR_2= RULE_PLAIN_SCALAR
                    {
                    this_PLAIN_SCALAR_2=(Token)match(input,RULE_PLAIN_SCALAR,FOLLOW_8); 

                    				current.merge(this_PLAIN_SCALAR_2);
                    			

                    				newLeafNode(this_PLAIN_SCALAR_2, grammarAccess.getPlainScalarAccess().getPLAIN_SCALARTerminalRuleCall_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:295:4: kw= 'true'
                    {
                    kw=(Token)match(input,18,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPlainScalarAccess().getTrueKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:301:4: kw= 'false'
                    {
                    kw=(Token)match(input,19,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getPlainScalarAccess().getFalseKeyword_0_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:307:3: (this_ID_5= RULE_ID | this_INT_6= RULE_INT | this_PLAIN_SCALAR_7= RULE_PLAIN_SCALAR | kw= 'true' | kw= 'false' )*
            loop5:
            do {
                int alt5=6;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_INT:
                    {
                    alt5=2;
                    }
                    break;
                case RULE_PLAIN_SCALAR:
                    {
                    alt5=3;
                    }
                    break;
                case 18:
                    {
                    alt5=4;
                    }
                    break;
                case 19:
                    {
                    alt5=5;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:308:4: this_ID_5= RULE_ID
            	    {
            	    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    				current.merge(this_ID_5);
            	    			

            	    				newLeafNode(this_ID_5, grammarAccess.getPlainScalarAccess().getIDTerminalRuleCall_1_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:316:4: this_INT_6= RULE_INT
            	    {
            	    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_8); 

            	    				current.merge(this_INT_6);
            	    			

            	    				newLeafNode(this_INT_6, grammarAccess.getPlainScalarAccess().getINTTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:324:4: this_PLAIN_SCALAR_7= RULE_PLAIN_SCALAR
            	    {
            	    this_PLAIN_SCALAR_7=(Token)match(input,RULE_PLAIN_SCALAR,FOLLOW_8); 

            	    				current.merge(this_PLAIN_SCALAR_7);
            	    			

            	    				newLeafNode(this_PLAIN_SCALAR_7, grammarAccess.getPlainScalarAccess().getPLAIN_SCALARTerminalRuleCall_1_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:332:4: kw= 'true'
            	    {
            	    kw=(Token)match(input,18,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPlainScalarAccess().getTrueKeyword_1_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:338:4: kw= 'false'
            	    {
            	    kw=(Token)match(input,19,FOLLOW_8); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getPlainScalarAccess().getFalseKeyword_1_4());
            	    			

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

<<<<<<< Updated upstream
=======
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
    // InternalMyDsl.g:660:1: ruleKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' ) ;
    public final AntlrDatatypeRuleToken ruleKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_YAML_SCALAR_1=null;
        Token this_INT_2=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:666:2: ( (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' ) )
            // InternalMyDsl.g:667:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' )
            {
            // InternalMyDsl.g:667:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | kw= 'name' | kw= 'on' | kw= 'jobs' | kw= 'permissions' | kw= 'env' | kw= 'push' | kw= 'pull_request' | kw= 'branches' | kw= 'tags' | kw= 'runs-on' | kw= 'needs' | kw= 'steps' | kw= 'uses' | kw= 'run' | kw= 'with' | kw= 'shell' | kw= 'contents' | kw= 'security-events' | kw= 'actions' | kw= 'pages' | kw= 'id-token' | kw= 'types' | kw= 'pull-requests' | kw= 'if' )
            int alt16=27;
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
>>>>>>> Stashed changes

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
<<<<<<< Updated upstream
    // $ANTLR end "rulePlainScalar"


    // $ANTLR start "entryRuleOn"
    // InternalMyDsl.g:348:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
=======
    // $ANTLR end "ruleKeyName"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalMyDsl.g:839:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalMyDsl.g:839:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalMyDsl.g:840:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalMyDsl.g:846:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:852:2: ( ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:853:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:853:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            // InternalMyDsl.g:854:3: ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:854:3: ( (lv_key_0_0= ruleKeyName ) )
            // InternalMyDsl.g:855:4: (lv_key_0_0= ruleKeyName )
            {
            // InternalMyDsl.g:855:4: (lv_key_0_0= ruleKeyName )
            // InternalMyDsl.g:856:5: lv_key_0_0= ruleKeyName
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
            		
            // InternalMyDsl.g:877:3: ( (lv_value_2_0= ruleEString ) )
            // InternalMyDsl.g:878:4: (lv_value_2_0= ruleEString )
            {
            // InternalMyDsl.g:878:4: (lv_value_2_0= ruleEString )
            // InternalMyDsl.g:879:5: lv_value_2_0= ruleEString
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
    // InternalMyDsl.g:900:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
>>>>>>> Stashed changes
    public final EObject entryRuleOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOn = null;


        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:348:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:349:2: iv_ruleOn= ruleOn EOF
=======
            // InternalMyDsl.g:900:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:901:2: iv_ruleOn= ruleOn EOF
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    // InternalMyDsl.g:355:1: ruleOn returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ;
=======
    // InternalMyDsl.g:907:1: ruleOn returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
>>>>>>> Stashed changes
    public final EObject ruleOn() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_END_BLOCK_9=null;
        EObject lv_push_5_0 = null;

        EObject lv_pullRequest_8_0 = null;



        	enterRule();

        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:361:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            // InternalMyDsl.g:362:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:362:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            // InternalMyDsl.g:363:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK
            {
            // InternalMyDsl.g:363:3: ()
            // InternalMyDsl.g:364:4: 
=======
            // InternalMyDsl.g:913:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:914:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:914:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalMyDsl.g:915:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:915:3: ()
            // InternalMyDsl.g:916:4: 
>>>>>>> Stashed changes
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnAccess().getOnAction_0(),
            					current);
            			

            }

<<<<<<< Updated upstream
            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_9); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:374:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:375:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:375:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:376:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* )
=======
            // InternalMyDsl.g:922:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_BEG_BLOCK) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:923:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_17); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:928:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) ) )
            // InternalMyDsl.g:929:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:929:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* ) )
            // InternalMyDsl.g:930:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* )
>>>>>>> Stashed changes
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				
<<<<<<< Updated upstream
            // InternalMyDsl.g:379:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* )
            // InternalMyDsl.g:380:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:380:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )*
            loop6:
=======
            // InternalMyDsl.g:933:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )* )
            // InternalMyDsl.g:934:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )*
            {
            // InternalMyDsl.g:934:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) ) )*
            loop22:
>>>>>>> Stashed changes
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
                    alt6=1;
                }
<<<<<<< Updated upstream
                else if ( LA6_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
                    alt6=2;
=======
                else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
                    alt22=4;
>>>>>>> Stashed changes
                }


                switch (alt6) {
            	case 1 :
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:381:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:381:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:382:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
=======
            	    // InternalMyDsl.g:935:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:935:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:936:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:382:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:383:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
=======
            	    // InternalMyDsl.g:936:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:937:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:386:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:386:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
=======
            	    // InternalMyDsl.g:940:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:940:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:386:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:386:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
=======
            	    // InternalMyDsl.g:940:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:940:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
>>>>>>> Stashed changes
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOnAccess().getPushKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOnAccess().getColonKeyword_2_0_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:394:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:395:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:395:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:396:11: lv_push_5_0= rulePush
=======
            	    // InternalMyDsl.g:948:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:949:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:949:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:950:11: lv_push_5_0= rulePush
>>>>>>> Stashed changes
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPushPushParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
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
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:419:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:419:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:420:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
=======
            	    // InternalMyDsl.g:973:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:973:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:974:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:420:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:421:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
=======
            	    // InternalMyDsl.g:974:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:975:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:424:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:424:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
=======
            	    // InternalMyDsl.g:978:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:978:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:424:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:424:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
=======
            	    // InternalMyDsl.g:978:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:978:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
>>>>>>> Stashed changes
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getOnAccess().getPull_requestKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOnAccess().getColonKeyword_2_1_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:432:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:433:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:433:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:434:11: lv_pullRequest_8_0= rulePull_request
=======
            	    // InternalMyDsl.g:986:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:987:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:987:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:988:11: lv_pullRequest_8_0= rulePull_request
>>>>>>> Stashed changes
            	    {

            	    											newCompositeNode(grammarAccess.getOnAccess().getPullRequestPull_requestParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_9);
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
<<<<<<< Updated upstream
=======
            	case 3 :
            	    // InternalMyDsl.g:1011:4: ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1011:4: ({...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:1012:5: {...}? => ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1012:99: ( ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:1013:6: ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1016:9: ({...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:1016:10: {...}? => (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1016:19: (otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:1016:20: otherlv_9= 'schedule' otherlv_10= ':' ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? )
            	    {
            	    otherlv_9=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getOnAccess().getScheduleKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_10, grammarAccess.getOnAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:1024:9: ( (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:1025:10: (this_BEG_BLOCK_11= RULE_BEG_BLOCK )? ( (lv_schedule_12_0= ruleSchedule ) )+ (this_END_BLOCK_13= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:1025:10: (this_BEG_BLOCK_11= RULE_BEG_BLOCK )?
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==RULE_BEG_BLOCK) ) {
            	        alt18=1;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalMyDsl.g:1026:11: this_BEG_BLOCK_11= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_11=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	            											newLeafNode(this_BEG_BLOCK_11, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_2_2_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:1031:10: ( (lv_schedule_12_0= ruleSchedule ) )+
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
            	    	    // InternalMyDsl.g:1032:11: (lv_schedule_12_0= ruleSchedule )
            	    	    {
            	    	    // InternalMyDsl.g:1032:11: (lv_schedule_12_0= ruleSchedule )
            	    	    // InternalMyDsl.g:1033:12: lv_schedule_12_0= ruleSchedule
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

            	    // InternalMyDsl.g:1050:10: (this_END_BLOCK_13= RULE_END_BLOCK )?
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==RULE_END_BLOCK) ) {
            	        alt20=1;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalMyDsl.g:1051:11: this_END_BLOCK_13= RULE_END_BLOCK
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
            	    // InternalMyDsl.g:1063:4: ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:1063:4: ({...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) ) )
            	    // InternalMyDsl.g:1064:5: {...}? => ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1064:99: ( ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) ) )
            	    // InternalMyDsl.g:1065:6: ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1068:9: ({...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? ) )
            	    // InternalMyDsl.g:1068:10: {...}? => (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:1068:19: (otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )? )
            	    // InternalMyDsl.g:1068:20: otherlv_14= 'workflow_dispatch' otherlv_15= ':' ( (lv_workflowDispatch_16_0= ruleEString ) )?
            	    {
            	    otherlv_14=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getOnAccess().getWorkflow_dispatchKeyword_2_3_0());
            	    								
            	    otherlv_15=(Token)match(input,16,FOLLOW_21); 

            	    									newLeafNode(otherlv_15, grammarAccess.getOnAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:1076:9: ( (lv_workflowDispatch_16_0= ruleEString ) )?
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||(LA21_0>=22 && LA21_0<=25)) ) {
            	        alt21=1;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalMyDsl.g:1077:10: (lv_workflowDispatch_16_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1077:10: (lv_workflowDispatch_16_0= ruleEString )
            	            // InternalMyDsl.g:1078:11: lv_workflowDispatch_16_0= ruleEString
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
>>>>>>> Stashed changes

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				

            }

<<<<<<< Updated upstream
            this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 
=======
            // InternalMyDsl.g:1108:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_END_BLOCK) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1109:4: this_END_BLOCK_17= RULE_END_BLOCK
                    {
                    this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_17, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

                    }
                    break;

            }
>>>>>>> Stashed changes

            			newLeafNode(this_END_BLOCK_9, grammarAccess.getOnAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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


    // $ANTLR start "entryRuleJob"
    // InternalMyDsl.g:472:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDsl.g:472:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDsl.g:473:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDsl.g:479:1: ruleJob returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_28= RULE_END_BLOCK ) ;
    public final EObject ruleJob() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_BEG_BLOCK_9=null;
        Token otherlv_10=null;
        Token this_BEG_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        Token this_END_BLOCK_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token this_BEG_BLOCK_22=null;
        Token this_END_BLOCK_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token this_END_BLOCK_28=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_runsOn_6_0 = null;

        AntlrDatatypeRuleToken lv_needs_12_0 = null;

        AntlrDatatypeRuleToken lv_needs_16_0 = null;

        AntlrDatatypeRuleToken lv_needs_18_0 = null;

        EObject lv_steps_23_0 = null;

        EObject lv_permissions_27_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:485:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_28= RULE_END_BLOCK ) )
            // InternalMyDsl.g:486:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_28= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:486:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_28= RULE_END_BLOCK )
            // InternalMyDsl.g:487:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_28= RULE_END_BLOCK
            {
            // InternalMyDsl.g:487:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:488:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:488:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:489:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getColonKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_10); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalMyDsl.g:514:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:515:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:515:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:516:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:519:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:520:6: ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:520:6: ( ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:521:4: ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:521:4: ({...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:522:5: {...}? => ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:522:100: ( ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:523:6: ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:526:9: ({...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:526:10: {...}? => (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:526:19: (otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:526:20: otherlv_4= 'runs-on' otherlv_5= ':' ( (lv_runsOn_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,22,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getJobAccess().getRunsOnKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJobAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:534:9: ( (lv_runsOn_6_0= ruleEString ) )
            	    // InternalMyDsl.g:535:10: (lv_runsOn_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:535:10: (lv_runsOn_6_0= ruleEString )
            	    // InternalMyDsl.g:536:11: lv_runsOn_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getRunsOnEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_runsOn_6_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"runsOn",
            	    												lv_runsOn_6_0,
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
            	    // InternalMyDsl.g:559:4: ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:559:4: ({...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:560:5: {...}? => ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:560:100: ( ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) ) )
            	    // InternalMyDsl.g:561:6: ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:564:9: ({...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) ) )
            	    // InternalMyDsl.g:564:10: {...}? => (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:564:19: (otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) ) )
            	    // InternalMyDsl.g:564:20: otherlv_7= 'needs' otherlv_8= ':' ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJobAccess().getNeedsKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,15,FOLLOW_12); 

            	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:572:9: ( (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK ) | (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==RULE_BEG_BLOCK) ) {
            	        alt9=1;
            	    }
            	    else if ( (LA9_0==25) ) {
            	        alt9=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // InternalMyDsl.g:573:10: (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:573:10: (this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK )
            	            // InternalMyDsl.g:574:11: this_BEG_BLOCK_9= RULE_BEG_BLOCK (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+ this_END_BLOCK_14= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_9=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_13); 

            	            											newLeafNode(this_BEG_BLOCK_9, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:578:11: (otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK )+
            	            int cnt7=0;
            	            loop7:
            	            do {
            	                int alt7=2;
            	                int LA7_0 = input.LA(1);

            	                if ( (LA7_0==24) ) {
            	                    alt7=1;
            	                }


            	                switch (alt7) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:579:12: otherlv_10= '-' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_needs_12_0= ruleEString ) ) this_END_BLOCK_13= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_10=(Token)match(input,24,FOLLOW_6); 

            	            	    												newLeafNode(otherlv_10, grammarAccess.getJobAccess().getHyphenMinusKeyword_3_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_11=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_11, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:587:12: ( (lv_needs_12_0= ruleEString ) )
            	            	    // InternalMyDsl.g:588:13: (lv_needs_12_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:588:13: (lv_needs_12_0= ruleEString )
            	            	    // InternalMyDsl.g:589:14: lv_needs_12_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_14);
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

            	            	    this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_15); 

            	            	    												newLeafNode(this_END_BLOCK_13, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_1_2_0_1_3());
            	            	    											

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

            	            this_END_BLOCK_14=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            											newLeafNode(this_END_BLOCK_14, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:617:10: (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' )
            	            {
            	            // InternalMyDsl.g:617:10: (otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']' )
            	            // InternalMyDsl.g:618:11: otherlv_15= '[' ( (lv_needs_16_0= ruleEString ) ) (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )* otherlv_19= ']'
            	            {
            	            otherlv_15=(Token)match(input,25,FOLLOW_4); 

            	            											newLeafNode(otherlv_15, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_3_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:622:11: ( (lv_needs_16_0= ruleEString ) )
            	            // InternalMyDsl.g:623:12: (lv_needs_16_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:623:12: (lv_needs_16_0= ruleEString )
            	            // InternalMyDsl.g:624:13: lv_needs_16_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_16);
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

            	            // InternalMyDsl.g:641:11: (otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) ) )*
            	            loop8:
            	            do {
            	                int alt8=2;
            	                int LA8_0 = input.LA(1);

            	                if ( (LA8_0==26) ) {
            	                    alt8=1;
            	                }


            	                switch (alt8) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:642:12: otherlv_17= ',' ( (lv_needs_18_0= ruleEString ) )
            	            	    {
            	            	    otherlv_17=(Token)match(input,26,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_17, grammarAccess.getJobAccess().getCommaKeyword_3_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:646:12: ( (lv_needs_18_0= ruleEString ) )
            	            	    // InternalMyDsl.g:647:13: (lv_needs_18_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:647:13: (lv_needs_18_0= ruleEString )
            	            	    // InternalMyDsl.g:648:14: lv_needs_18_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_needs_18_0=ruleEString();

            	            	    state._fsp--;


            	            	    														if (current==null) {
            	            	    															current = createModelElementForParent(grammarAccess.getJobRule());
            	            	    														}
            	            	    														add(
            	            	    															current,
            	            	    															"needs",
            	            	    															lv_needs_18_0,
            	            	    															"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	            	    														afterParserOrEnumRuleCall();
            	            	    													

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop8;
            	                }
            	            } while (true);

            	            otherlv_19=(Token)match(input,27,FOLLOW_11); 

            	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getRightSquareBracketKeyword_3_1_2_1_3());
            	            										

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
            	case 3 :
            	    // InternalMyDsl.g:678:4: ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) )
            	    {
            	    // InternalMyDsl.g:678:4: ({...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) ) )
            	    // InternalMyDsl.g:679:5: {...}? => ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:679:100: ( ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) ) )
            	    // InternalMyDsl.g:680:6: ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:683:9: ({...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK ) )
            	    // InternalMyDsl.g:683:10: {...}? => (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:683:19: (otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK )
            	    // InternalMyDsl.g:683:20: otherlv_20= 'steps' otherlv_21= ':' this_BEG_BLOCK_22= RULE_BEG_BLOCK ( (lv_steps_23_0= ruleStep ) )+ this_END_BLOCK_24= RULE_END_BLOCK
            	    {
            	    otherlv_20=(Token)match(input,28,FOLLOW_3); 

            	    									newLeafNode(otherlv_20, grammarAccess.getJobAccess().getStepsKeyword_3_2_0());
            	    								
            	    otherlv_21=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_21, grammarAccess.getJobAccess().getColonKeyword_3_2_1());
            	    								
            	    this_BEG_BLOCK_22=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_13); 

            	    									newLeafNode(this_BEG_BLOCK_22, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2());
            	    								
            	    // InternalMyDsl.g:695:9: ( (lv_steps_23_0= ruleStep ) )+
            	    int cnt10=0;
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==24) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:696:10: (lv_steps_23_0= ruleStep )
            	    	    {
            	    	    // InternalMyDsl.g:696:10: (lv_steps_23_0= ruleStep )
            	    	    // InternalMyDsl.g:697:11: lv_steps_23_0= ruleStep
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_3_2_3_0());
            	    	    										
            	    	    pushFollow(FOLLOW_15);
            	    	    lv_steps_23_0=ruleStep();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"steps",
            	    	    												lv_steps_23_0,
            	    	    												"pt.isep.yamldslgen.xtext.MyDsl.Step");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

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

            	    this_END_BLOCK_24=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	    									newLeafNode(this_END_BLOCK_24, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getJobAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:724:4: ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:724:4: ({...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:725:5: {...}? => ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:725:100: ( ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:726:6: ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:729:9: ({...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:729:10: {...}? => (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:729:19: (otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:729:20: otherlv_25= 'permissions' otherlv_26= ':' ( (lv_permissions_27_0= rulePermissions ) )
            	    {
            	    otherlv_25=(Token)match(input,29,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJobAccess().getPermissionsKeyword_3_3_0());
            	    								
            	    otherlv_26=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_26, grammarAccess.getJobAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:737:9: ( (lv_permissions_27_0= rulePermissions ) )
            	    // InternalMyDsl.g:738:10: (lv_permissions_27_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:738:10: (lv_permissions_27_0= rulePermissions )
            	    // InternalMyDsl.g:739:11: lv_permissions_27_0= rulePermissions
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getPermissionsPermissionsParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    lv_permissions_27_0=rulePermissions();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"permissions",
            	    												lv_permissions_27_0,
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canLeave(grammarAccess.getJobAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				

            }

            this_END_BLOCK_28=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_28, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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


    // $ANTLR start "entryRulePush"
<<<<<<< Updated upstream
    // InternalMyDsl.g:778:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
=======
    // InternalMyDsl.g:1118:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
>>>>>>> Stashed changes
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:778:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:779:2: iv_rulePush= rulePush EOF
=======
            // InternalMyDsl.g:1118:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:1119:2: iv_rulePush= rulePush EOF
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    // InternalMyDsl.g:785:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
=======
    // InternalMyDsl.g:1125:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
            // InternalMyDsl.g:791:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:792:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:792:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:793:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:793:3: ()
            // InternalMyDsl.g:794:4: 
=======
            // InternalMyDsl.g:1131:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1132:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1132:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1133:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1133:3: ()
            // InternalMyDsl.g:1134:4: 
>>>>>>> Stashed changes
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_17); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
<<<<<<< Updated upstream
            // InternalMyDsl.g:804:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:805:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:805:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:806:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
=======
            // InternalMyDsl.g:1144:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1145:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1145:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1146:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
>>>>>>> Stashed changes
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				
<<<<<<< Updated upstream
            // InternalMyDsl.g:809:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:810:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:810:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            loop18:
=======
            // InternalMyDsl.g:1149:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1150:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1150:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            loop30:
>>>>>>> Stashed changes
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( LA18_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:811:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:811:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:812:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
=======
            	    // InternalMyDsl.g:1151:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1151:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1152:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:812:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:813:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
=======
            	    // InternalMyDsl.g:1152:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1153:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:816:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:816:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
=======
            	    // InternalMyDsl.g:1156:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1156:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:816:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:816:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
=======
            	    // InternalMyDsl.g:1156:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1156:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
>>>>>>> Stashed changes
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPushAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,15,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPushAccess().getColonKeyword_2_0_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:824:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);
=======
            	    // InternalMyDsl.g:1164:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);
>>>>>>> Stashed changes

            	    if ( (LA14_0==RULE_BEG_BLOCK) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==25) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:825:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:825:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:826:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
=======
            	            // InternalMyDsl.g:1165:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1165:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1166:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
>>>>>>> Stashed changes
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_13); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:830:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt12=0;
            	            loop12:
=======
            	            // InternalMyDsl.g:1170:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt24=0;
            	            loop24:
>>>>>>> Stashed changes
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==24) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:831:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
=======
            	            	    // InternalMyDsl.g:1171:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
>>>>>>> Stashed changes
            	            	    {
            	            	    otherlv_6=(Token)match(input,24,FOLLOW_6); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:839:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:840:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:840:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:841:14: lv_branches_8_0= ruleEString
=======
            	            	    // InternalMyDsl.g:1179:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1180:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1180:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1181:14: lv_branches_8_0= ruleEString
>>>>>>> Stashed changes
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_14);
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

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_15); 

            	            	    												newLeafNode(this_END_BLOCK_9, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_1_3());
            	            	    											

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt12 >= 1 ) break loop12;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(12, input);
            	                        throw eee;
            	                }
            	                cnt12++;
            	            } while (true);

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_17); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:869:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:869:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:870:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
=======
            	            // InternalMyDsl.g:1209:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1209:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1210:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
>>>>>>> Stashed changes
            	            {
            	            otherlv_11=(Token)match(input,25,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:874:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:875:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:875:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:876:13: lv_branches_12_0= ruleEString
=======
            	            // InternalMyDsl.g:1214:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1215:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1215:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1216:13: lv_branches_12_0= ruleEString
>>>>>>> Stashed changes
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_16);
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

<<<<<<< Updated upstream
            	            // InternalMyDsl.g:893:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop13:
=======
            	            // InternalMyDsl.g:1233:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop25:
>>>>>>> Stashed changes
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==26) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:894:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
=======
            	            	    // InternalMyDsl.g:1234:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
>>>>>>> Stashed changes
            	            	    {
            	            	    otherlv_13=(Token)match(input,26,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPushAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:898:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:899:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:899:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:900:14: lv_branches_14_0= ruleEString
=======
            	            	    // InternalMyDsl.g:1238:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1239:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1239:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1240:14: lv_branches_14_0= ruleEString
>>>>>>> Stashed changes
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_16);
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
            	            	    break loop13;
            	                }
            	            } while (true);

            	            otherlv_15=(Token)match(input,27,FOLLOW_17); 

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
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:930:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:930:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:931:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
=======
            	    // InternalMyDsl.g:1270:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1270:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1271:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:931:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:932:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
=======
            	    // InternalMyDsl.g:1271:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1272:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:935:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:935:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
=======
            	    // InternalMyDsl.g:1275:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1275:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:935:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:935:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
=======
            	    // InternalMyDsl.g:1275:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1275:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
>>>>>>> Stashed changes
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPushAccess().getTagsKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,15,FOLLOW_12); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPushAccess().getColonKeyword_2_1_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:943:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);
=======
            	    // InternalMyDsl.g:1283:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);
>>>>>>> Stashed changes

            	    if ( (LA17_0==RULE_BEG_BLOCK) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==25) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:944:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:944:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:945:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
=======
            	            // InternalMyDsl.g:1284:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1284:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1285:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
>>>>>>> Stashed changes
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_13); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:949:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
            	            int cnt15=0;
            	            loop15:
=======
            	            // InternalMyDsl.g:1289:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
            	            int cnt27=0;
            	            loop27:
>>>>>>> Stashed changes
            	            do {
            	                int alt15=2;
            	                int LA15_0 = input.LA(1);

            	                if ( (LA15_0==24) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:950:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
=======
            	            	    // InternalMyDsl.g:1290:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
>>>>>>> Stashed changes
            	            	    {
            	            	    otherlv_19=(Token)match(input,24,FOLLOW_6); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:958:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:959:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:959:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:960:14: lv_tags_21_0= ruleEString
=======
            	            	    // InternalMyDsl.g:1298:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1299:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1299:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1300:14: lv_tags_21_0= ruleEString
>>>>>>> Stashed changes
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_14);
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

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_15); 

            	            	    												newLeafNode(this_END_BLOCK_22, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_1_3());
            	            	    											

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

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_17); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPushAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:988:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:988:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:989:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
=======
            	            // InternalMyDsl.g:1328:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1328:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1329:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
>>>>>>> Stashed changes
            	            {
            	            otherlv_24=(Token)match(input,25,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
<<<<<<< Updated upstream
            	            // InternalMyDsl.g:993:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:994:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:994:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:995:13: lv_tags_25_0= ruleEString
=======
            	            // InternalMyDsl.g:1333:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1334:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1334:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:1335:13: lv_tags_25_0= ruleEString
>>>>>>> Stashed changes
            	            {

            	            													newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_16);
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

<<<<<<< Updated upstream
            	            // InternalMyDsl.g:1012:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop16:
=======
            	            // InternalMyDsl.g:1352:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop28:
>>>>>>> Stashed changes
            	            do {
            	                int alt16=2;
            	                int LA16_0 = input.LA(1);

            	                if ( (LA16_0==26) ) {
            	                    alt16=1;
            	                }


            	                switch (alt16) {
            	            	case 1 :
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:1013:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
=======
            	            	    // InternalMyDsl.g:1353:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
>>>>>>> Stashed changes
            	            	    {
            	            	    otherlv_26=(Token)match(input,26,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPushAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
<<<<<<< Updated upstream
            	            	    // InternalMyDsl.g:1017:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1018:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1018:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1019:14: lv_tags_27_0= ruleEString
=======
            	            	    // InternalMyDsl.g:1357:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1358:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1358:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1359:14: lv_tags_27_0= ruleEString
>>>>>>> Stashed changes
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPushAccess().getTagsEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_16);
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
            	            	    break loop16;
            	                }
            	            } while (true);

            	            otherlv_28=(Token)match(input,27,FOLLOW_17); 

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
            	    break loop18;
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
<<<<<<< Updated upstream
    // InternalMyDsl.g:1064:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
=======
    // InternalMyDsl.g:1404:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
>>>>>>> Stashed changes
    public final EObject entryRulePull_request() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_request = null;


        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:1064:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1065:2: iv_rulePull_request= rulePull_request EOF
=======
            // InternalMyDsl.g:1404:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1405:2: iv_rulePull_request= rulePull_request EOF
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    // InternalMyDsl.g:1071:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) ;
=======
    // InternalMyDsl.g:1411:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
            // InternalMyDsl.g:1077:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1078:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1078:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            // InternalMyDsl.g:1079:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1079:3: ()
            // InternalMyDsl.g:1080:4: 
=======
            // InternalMyDsl.g:1417:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1418:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1418:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:1419:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1419:3: ()
            // InternalMyDsl.g:1420:4: 
>>>>>>> Stashed changes
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPull_requestAccess().getPull_requestAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_18); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
<<<<<<< Updated upstream
            otherlv_2=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPull_requestAccess().getBranchesKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getPull_requestAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1098:3: ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_BEG_BLOCK) ) {
                alt21=1;
            }
            else if ( (LA21_0==25) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1099:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    {
                    // InternalMyDsl.g:1099:4: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK )
                    // InternalMyDsl.g:1100:5: this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_13); 

                    					newLeafNode(this_BEG_BLOCK_4, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_4_0_0());
                    				
                    // InternalMyDsl.g:1104:5: (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==24) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMyDsl.g:1105:6: otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_6); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_4_0_1_0());
                    	    					
                    	    this_BEG_BLOCK_6=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

                    	    						newLeafNode(this_BEG_BLOCK_6, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_4_0_1_1());
                    	    					
                    	    // InternalMyDsl.g:1113:6: ( (lv_branches_7_0= ruleEString ) )
                    	    // InternalMyDsl.g:1114:7: (lv_branches_7_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1114:7: (lv_branches_7_0= ruleEString )
                    	    // InternalMyDsl.g:1115:8: lv_branches_7_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_0_1_2_0());
                    	    							
                    	    pushFollow(FOLLOW_14);
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

                    	    this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_15); 

                    	    						newLeafNode(this_END_BLOCK_8, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_4_0_1_3());
                    	    					

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

                    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_14); 

                    					newLeafNode(this_END_BLOCK_9, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_4_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1143:4: (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    {
                    // InternalMyDsl.g:1143:4: (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    // InternalMyDsl.g:1144:5: otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_4); 

                    					newLeafNode(otherlv_10, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_4_1_0());
                    				
                    // InternalMyDsl.g:1148:5: ( (lv_branches_11_0= ruleEString ) )
                    // InternalMyDsl.g:1149:6: (lv_branches_11_0= ruleEString )
                    {
                    // InternalMyDsl.g:1149:6: (lv_branches_11_0= ruleEString )
                    // InternalMyDsl.g:1150:7: lv_branches_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_1_1_0());
                    						
                    pushFollow(FOLLOW_16);
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

                    // InternalMyDsl.g:1167:5: (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==26) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:1168:6: otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,26,FOLLOW_4); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getPull_requestAccess().getCommaKeyword_4_1_2_0());
                    	    					
                    	    // InternalMyDsl.g:1172:6: ( (lv_branches_13_0= ruleEString ) )
                    	    // InternalMyDsl.g:1173:7: (lv_branches_13_0= ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1173:7: (lv_branches_13_0= ruleEString )
                    	    // InternalMyDsl.g:1174:8: lv_branches_13_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_4_1_2_1_0());
                    	    							
                    	    pushFollow(FOLLOW_16);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,27,FOLLOW_14); 

                    					newLeafNode(otherlv_14, grammarAccess.getPull_requestAccess().getRightSquareBracketKeyword_4_1_3());
                    				

                    }


                    }
                    break;
=======
            // InternalMyDsl.g:1430:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) ) )
            // InternalMyDsl.g:1431:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalMyDsl.g:1431:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?) )
            // InternalMyDsl.g:1432:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPull_requestAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1435:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?)
            // InternalMyDsl.g:1436:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+ {...}?
            {
            // InternalMyDsl.g:1436:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )+
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
            	    // InternalMyDsl.g:1437:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1437:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1438:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1438:109: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1439:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1442:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:1442:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1442:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:1442:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPull_requestAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_23); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPull_requestAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1450:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
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
            	            // InternalMyDsl.g:1451:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1451:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1452:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_24); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:1456:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1457:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1465:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1466:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1466:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:1467:14: lv_branches_8_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_25);
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

            	            	    this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

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

            	            this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            											newLeafNode(this_END_BLOCK_10, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1495:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:1495:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:1496:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:1500:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:1501:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1501:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:1502:13: lv_branches_12_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_27);
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

            	            // InternalMyDsl.g:1519:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop32:
            	            do {
            	                int alt32=2;
            	                int LA32_0 = input.LA(1);

            	                if ( (LA32_0==30) ) {
            	                    alt32=1;
            	                }


            	                switch (alt32) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1520:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPull_requestAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1524:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1525:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1525:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:1526:14: lv_branches_14_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getBranchesEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            otherlv_15=(Token)match(input,28,FOLLOW_29); 

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
            	    // InternalMyDsl.g:1556:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1556:4: ({...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:1557:5: {...}? => ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "getUnorderedGroupHelper().canSelect(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1557:109: ( ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:1558:6: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPull_requestAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1561:9: ({...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:1561:10: {...}? => (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePull_request", "true");
            	    }
            	    // InternalMyDsl.g:1561:19: (otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:1561:20: otherlv_16= 'types' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPull_requestAccess().getTypesKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_23); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPull_requestAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1569:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
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
            	            // InternalMyDsl.g:1570:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:1570:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:1571:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_24); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:1575:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
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
            	            	    // InternalMyDsl.g:1576:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_types_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,26,FOLLOW_18); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPull_requestAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:1584:12: ( (lv_types_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1585:13: (lv_types_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1585:13: (lv_types_21_0= ruleEString )
            	            	    // InternalMyDsl.g:1586:14: lv_types_21_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_0_1_2_0());
            	            	    													
            	            	    pushFollow(FOLLOW_25);
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

            	            	    this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

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

            	            this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            											newLeafNode(this_END_BLOCK_23, grammarAccess.getPull_requestAccess().getEND_BLOCKTerminalRuleCall_2_1_2_0_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:1614:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:1614:10: (otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:1615:11: otherlv_24= '[' ( (lv_types_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPull_requestAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:1619:11: ( (lv_types_25_0= ruleEString ) )
            	            // InternalMyDsl.g:1620:12: (lv_types_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:1620:12: (lv_types_25_0= ruleEString )
            	            // InternalMyDsl.g:1621:13: lv_types_25_0= ruleEString
            	            {

            	            													newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_1_1_0());
            	            												
            	            pushFollow(FOLLOW_27);
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

            	            // InternalMyDsl.g:1638:11: (otherlv_26= ',' ( (lv_types_27_0= ruleEString ) ) )*
            	            loop35:
            	            do {
            	                int alt35=2;
            	                int LA35_0 = input.LA(1);

            	                if ( (LA35_0==30) ) {
            	                    alt35=1;
            	                }


            	                switch (alt35) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1639:12: otherlv_26= ',' ( (lv_types_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPull_requestAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1643:12: ( (lv_types_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1644:13: (lv_types_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1644:13: (lv_types_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1645:14: lv_types_27_0= ruleEString
            	            	    {

            	            	    														newCompositeNode(grammarAccess.getPull_requestAccess().getTypesEStringParserRuleCall_2_1_2_1_2_1_0());
            	            	    													
            	            	    pushFollow(FOLLOW_27);
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

            	            otherlv_28=(Token)match(input,28,FOLLOW_29); 

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
>>>>>>> Stashed changes

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


<<<<<<< Updated upstream
    // $ANTLR start "entryRuleStep"
    // InternalMyDsl.g:1206:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
=======
    // $ANTLR start "entryRuleSchedule"
    // InternalMyDsl.g:1691:1: entryRuleSchedule returns [EObject current=null] : iv_ruleSchedule= ruleSchedule EOF ;
    public final EObject entryRuleSchedule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchedule = null;


        try {
            // InternalMyDsl.g:1691:49: (iv_ruleSchedule= ruleSchedule EOF )
            // InternalMyDsl.g:1692:2: iv_ruleSchedule= ruleSchedule EOF
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
    // InternalMyDsl.g:1698:1: ruleSchedule returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1704:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1705:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1705:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1706:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? otherlv_2= 'cron' otherlv_3= ':' ( (lv_cron_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getScheduleAccess().getHyphenMinusKeyword_0());
            		
            // InternalMyDsl.g:1710:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_BEG_BLOCK) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:1711:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_31); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getScheduleAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getScheduleAccess().getCronKeyword_2());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getScheduleAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1724:3: ( (lv_cron_4_0= ruleEString ) )
            // InternalMyDsl.g:1725:4: (lv_cron_4_0= ruleEString )
            {
            // InternalMyDsl.g:1725:4: (lv_cron_4_0= ruleEString )
            // InternalMyDsl.g:1726:5: lv_cron_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getScheduleAccess().getCronEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1743:3: (this_END_BLOCK_5= RULE_END_BLOCK )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_END_BLOCK) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:1744:4: this_END_BLOCK_5= RULE_END_BLOCK
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
    // InternalMyDsl.g:1753:1: entryRuleConcurrency returns [EObject current=null] : iv_ruleConcurrency= ruleConcurrency EOF ;
    public final EObject entryRuleConcurrency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcurrency = null;


        try {
            // InternalMyDsl.g:1753:52: (iv_ruleConcurrency= ruleConcurrency EOF )
            // InternalMyDsl.g:1754:2: iv_ruleConcurrency= ruleConcurrency EOF
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
    // InternalMyDsl.g:1760:1: ruleConcurrency returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1766:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1767:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1767:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1768:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1768:3: ()
            // InternalMyDsl.g:1769:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcurrencyAccess().getConcurrencyAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1775:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_BEG_BLOCK) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMyDsl.g:1776:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_33); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getConcurrencyAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1781:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1782:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1782:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1783:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1786:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1787:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1787:6: ( ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) ) )*
            loop41:
            do {
                int alt41=3;
                int LA41_0 = input.LA(1);

                if ( LA41_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
                    alt41=1;
                }
                else if ( LA41_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
                    alt41=2;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMyDsl.g:1788:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1788:4: ({...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1789:5: {...}? => ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1789:108: ( ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1790:6: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1793:9: ({...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1793:10: {...}? => (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:1793:19: (otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1793:20: otherlv_3= 'group' otherlv_4= ':' ( (lv_group_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,55,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getConcurrencyAccess().getGroupKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getConcurrencyAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1801:9: ( (lv_group_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1802:10: (lv_group_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1802:10: (lv_group_5_0= ruleEString )
            	    // InternalMyDsl.g:1803:11: lv_group_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getGroupEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    // InternalMyDsl.g:1826:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1826:4: ({...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) ) )
            	    // InternalMyDsl.g:1827:5: {...}? => ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "getUnorderedGroupHelper().canSelect(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1827:108: ( ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) ) )
            	    // InternalMyDsl.g:1828:6: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1831:9: ({...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) ) )
            	    // InternalMyDsl.g:1831:10: {...}? => (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleConcurrency", "true");
            	    }
            	    // InternalMyDsl.g:1831:19: (otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) ) )
            	    // InternalMyDsl.g:1831:20: otherlv_6= 'cancel-in-progress' otherlv_7= ':' ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    {
            	    otherlv_6=(Token)match(input,56,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getConcurrencyAccess().getCancelInProgressKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_34); 

            	    									newLeafNode(otherlv_7, grammarAccess.getConcurrencyAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1839:9: ( (lv_cancelInProgress_8_0= ruleEBoolean ) )
            	    // InternalMyDsl.g:1840:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    {
            	    // InternalMyDsl.g:1840:10: (lv_cancelInProgress_8_0= ruleEBoolean )
            	    // InternalMyDsl.g:1841:11: lv_cancelInProgress_8_0= ruleEBoolean
            	    {

            	    											newCompositeNode(grammarAccess.getConcurrencyAccess().getCancelInProgressEBooleanParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_33);
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
            	    break loop41;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getConcurrencyAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1871:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_END_BLOCK) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMyDsl.g:1872:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:1881:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalMyDsl.g:1881:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalMyDsl.g:1882:2: iv_ruleEnvironment= ruleEnvironment EOF
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
    // InternalMyDsl.g:1888:1: ruleEnvironment returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) ;
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
            // InternalMyDsl.g:1894:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:1895:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:1895:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )? )
            // InternalMyDsl.g:1896:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_9= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:1896:3: ()
            // InternalMyDsl.g:1897:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvironmentAccess().getEnvironmentAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1903:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_BEG_BLOCK) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:1904:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_35); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getEnvironmentAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1909:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1910:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1910:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1911:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1914:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1915:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1915:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*
            loop44:
            do {
                int alt44=3;
                alt44 = dfa44.predict(input);
                switch (alt44) {
            	case 1 :
            	    // InternalMyDsl.g:1916:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1916:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1917:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1917:108: ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1918:6: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1921:9: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1921:10: {...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:1921:19: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1921:20: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1929:9: ( (lv_name_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1930:10: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1930:10: (lv_name_5_0= ruleEString )
            	    // InternalMyDsl.g:1931:11: lv_name_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    // InternalMyDsl.g:1954:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1954:4: ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1955:5: {...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1955:108: ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1956:6: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1959:9: ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1959:10: {...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEnvironment", "true");
            	    }
            	    // InternalMyDsl.g:1959:19: (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1959:20: otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,57,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getUrlKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getEnvironmentAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1967:9: ( (lv_url_8_0= ruleEString ) )
            	    // InternalMyDsl.g:1968:10: (lv_url_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1968:10: (lv_url_8_0= ruleEString )
            	    // InternalMyDsl.g:1969:11: lv_url_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getEnvironmentAccess().getUrlEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_35);
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
            	    break loop44;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:1999:3: (this_END_BLOCK_9= RULE_END_BLOCK )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_END_BLOCK) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2000:4: this_END_BLOCK_9= RULE_END_BLOCK
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
    // InternalMyDsl.g:2009:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // InternalMyDsl.g:2009:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalMyDsl.g:2010:2: iv_rulePermissions= rulePermissions EOF
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
    // InternalMyDsl.g:2016:1: rulePermissions returns [EObject current=null] : ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_21= RULE_END_BLOCK )? ) ;
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
        Token this_END_BLOCK_21=null;
        AntlrDatatypeRuleToken lv_contents_5_0 = null;

        AntlrDatatypeRuleToken lv_securityEvents_8_0 = null;

        AntlrDatatypeRuleToken lv_actions_11_0 = null;

        AntlrDatatypeRuleToken lv_pages_14_0 = null;

        AntlrDatatypeRuleToken lv_idToken_17_0 = null;

        AntlrDatatypeRuleToken lv_pullRequests_20_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2022:2: ( ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_21= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2023:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_21= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2023:2: ( () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_21= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2024:3: () (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_21= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2024:3: ()
            // InternalMyDsl.g:2025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionsAccess().getPermissionsAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:2031:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BEG_BLOCK) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMyDsl.g:2032:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_36); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPermissionsAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2037:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2038:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2038:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2039:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:2042:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2043:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2043:6: ( ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) ) )*
            loop47:
            do {
                int alt47=7;
                int LA47_0 = input.LA(1);

                if ( LA47_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {
                    alt47=2;
                }
                else if ( LA47_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {
                    alt47=3;
                }
                else if ( LA47_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {
                    alt47=4;
                }
                else if ( LA47_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {
                    alt47=5;
                }
                else if ( LA47_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {
                    alt47=6;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMyDsl.g:2044:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2044:4: ({...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2045:5: {...}? => ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:2045:108: ( ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2046:6: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:2049:9: ({...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2049:10: {...}? => (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2049:19: (otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2049:20: otherlv_3= 'contents' otherlv_4= ':' ( (lv_contents_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,44,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPermissionsAccess().getContentsKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPermissionsAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:2057:9: ( (lv_contents_5_0= ruleEString ) )
            	    // InternalMyDsl.g:2058:10: (lv_contents_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2058:10: (lv_contents_5_0= ruleEString )
            	    // InternalMyDsl.g:2059:11: lv_contents_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getContentsEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalMyDsl.g:2082:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2082:4: ({...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2083:5: {...}? => ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:2083:108: ( ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2084:6: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:2087:9: ({...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2087:10: {...}? => (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2087:19: (otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2087:20: otherlv_6= 'security-events' otherlv_7= ':' ( (lv_securityEvents_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,45,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getPermissionsAccess().getSecurityEventsKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getPermissionsAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:2095:9: ( (lv_securityEvents_8_0= ruleEString ) )
            	    // InternalMyDsl.g:2096:10: (lv_securityEvents_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2096:10: (lv_securityEvents_8_0= ruleEString )
            	    // InternalMyDsl.g:2097:11: lv_securityEvents_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getSecurityEventsEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalMyDsl.g:2120:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2120:4: ({...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2121:5: {...}? => ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:2121:108: ( ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2122:6: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:2125:9: ({...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2125:10: {...}? => (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2125:19: (otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2125:20: otherlv_9= 'actions' otherlv_10= ':' ( (lv_actions_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,46,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getPermissionsAccess().getActionsKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getPermissionsAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:2133:9: ( (lv_actions_11_0= ruleEString ) )
            	    // InternalMyDsl.g:2134:10: (lv_actions_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2134:10: (lv_actions_11_0= ruleEString )
            	    // InternalMyDsl.g:2135:11: lv_actions_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getActionsEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalMyDsl.g:2158:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2158:4: ({...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2159:5: {...}? => ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:2159:108: ( ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2160:6: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:2163:9: ({...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2163:10: {...}? => (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2163:19: (otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2163:20: otherlv_12= 'pages' otherlv_13= ':' ( (lv_pages_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,47,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getPermissionsAccess().getPagesKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getPermissionsAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:2171:9: ( (lv_pages_14_0= ruleEString ) )
            	    // InternalMyDsl.g:2172:10: (lv_pages_14_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2172:10: (lv_pages_14_0= ruleEString )
            	    // InternalMyDsl.g:2173:11: lv_pages_14_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPagesEStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalMyDsl.g:2196:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2196:4: ({...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2197:5: {...}? => ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:2197:108: ( ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2198:6: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:2201:9: ({...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2201:10: {...}? => (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2201:19: (otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2201:20: otherlv_15= 'id-token' otherlv_16= ':' ( (lv_idToken_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getPermissionsAccess().getIdTokenKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPermissionsAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:2209:9: ( (lv_idToken_17_0= ruleEString ) )
            	    // InternalMyDsl.g:2210:10: (lv_idToken_17_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2210:10: (lv_idToken_17_0= ruleEString )
            	    // InternalMyDsl.g:2211:11: lv_idToken_17_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getIdTokenEStringParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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
            	    // InternalMyDsl.g:2234:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2234:4: ({...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2235:5: {...}? => ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "getUnorderedGroupHelper().canSelect(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:2235:108: ( ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2236:6: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPermissionsAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:2239:9: ({...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2239:10: {...}? => (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePermissions", "true");
            	    }
            	    // InternalMyDsl.g:2239:19: (otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2239:20: otherlv_18= 'pull-requests' otherlv_19= ':' ( (lv_pullRequests_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getPermissionsAccess().getPullRequestsKeyword_2_5_0());
            	    								
            	    otherlv_19=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getPermissionsAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:2247:9: ( (lv_pullRequests_20_0= ruleEString ) )
            	    // InternalMyDsl.g:2248:10: (lv_pullRequests_20_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2248:10: (lv_pullRequests_20_0= ruleEString )
            	    // InternalMyDsl.g:2249:11: lv_pullRequests_20_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getPermissionsAccess().getPullRequestsEStringParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_36);
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

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getPermissionsAccess().getUnorderedGroup_2());
            				

            }

            // InternalMyDsl.g:2279:3: (this_END_BLOCK_21= RULE_END_BLOCK )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_END_BLOCK) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2280:4: this_END_BLOCK_21= RULE_END_BLOCK
                    {
                    this_END_BLOCK_21=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_21, grammarAccess.getPermissionsAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // InternalMyDsl.g:2289:1: entryRuleJob returns [EObject current=null] : iv_ruleJob= ruleJob EOF ;
    public final EObject entryRuleJob() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJob = null;


        try {
            // InternalMyDsl.g:2289:44: (iv_ruleJob= ruleJob EOF )
            // InternalMyDsl.g:2290:2: iv_ruleJob= ruleJob EOF
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
    // InternalMyDsl.g:2296:1: ruleJob returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) ;
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
        Token this_BEG_BLOCK_32=null;
        Token this_END_BLOCK_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token this_END_BLOCK_38=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_runsOn_9_0 = null;

        AntlrDatatypeRuleToken lv_needs_12_0 = null;

        AntlrDatatypeRuleToken lv_needs_16_0 = null;

        AntlrDatatypeRuleToken lv_needs_20_0 = null;

        AntlrDatatypeRuleToken lv_needs_22_0 = null;

        AntlrDatatypeRuleToken lv_if_26_0 = null;

        EObject lv_environment_29_0 = null;

        EObject lv_steps_33_0 = null;

        EObject lv_permissions_37_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2302:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2303:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2303:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2304:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) ) ) (this_END_BLOCK_38= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2304:3: ( (lv_id_0_0= ruleEString ) )
            // InternalMyDsl.g:2305:4: (lv_id_0_0= ruleEString )
            {
            // InternalMyDsl.g:2305:4: (lv_id_0_0= ruleEString )
            // InternalMyDsl.g:2306:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getJobAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:2327:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_BEG_BLOCK) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMyDsl.g:2328:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_38); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2333:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2334:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2334:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2335:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				
            // InternalMyDsl.g:2338:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )* )
            // InternalMyDsl.g:2339:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2339:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )*
            loop58:
            do {
                int alt58=8;
                alt58 = dfa58.predict(input);
                switch (alt58) {
            	case 1 :
            	    // InternalMyDsl.g:2340:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2340:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2341:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:2341:100: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2342:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:2345:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2345:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2345:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2345:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getJobAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getJobAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:2353:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2354:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2354:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2355:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalMyDsl.g:2378:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2378:4: ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2379:5: {...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:2379:100: ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2380:6: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:2383:9: ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2383:10: {...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2383:19: (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2383:20: otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,37,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getJobAccess().getRunsOnKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getJobAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:2391:9: ( (lv_runsOn_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2392:10: (lv_runsOn_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2392:10: (lv_runsOn_9_0= ruleEString )
            	    // InternalMyDsl.g:2393:11: lv_runsOn_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getRunsOnEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalMyDsl.g:2416:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2416:4: ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:2417:5: {...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:2417:100: ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) )
            	    // InternalMyDsl.g:2418:6: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:2421:9: ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )
            	    // InternalMyDsl.g:2421:10: {...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2421:19: (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    // InternalMyDsl.g:2421:20: otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    {
            	    otherlv_10=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getJobAccess().getNeedsKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,16,FOLLOW_39); 

            	    									newLeafNode(otherlv_11, grammarAccess.getJobAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:2429:9: ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    int alt54=3;
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
            	        alt54=1;
            	        }
            	        break;
            	    case RULE_BEG_BLOCK:
            	        {
            	        alt54=2;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt54=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt54) {
            	        case 1 :
            	            // InternalMyDsl.g:2430:10: ( (lv_needs_12_0= ruleEString ) )
            	            {
            	            // InternalMyDsl.g:2430:10: ( (lv_needs_12_0= ruleEString ) )
            	            // InternalMyDsl.g:2431:11: (lv_needs_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2431:11: (lv_needs_12_0= ruleEString )
            	            // InternalMyDsl.g:2432:12: lv_needs_12_0= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getJobAccess().getNeedsEStringParserRuleCall_3_2_2_0_0());
            	            											
            	            pushFollow(FOLLOW_38);
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
            	            // InternalMyDsl.g:2450:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:2450:10: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            // InternalMyDsl.g:2451:11: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_24); 

            	            											newLeafNode(this_BEG_BLOCK_13, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_0());
            	            										
            	            // InternalMyDsl.g:2455:11: (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+
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
            	            	    // InternalMyDsl.g:2456:12: otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_14=(Token)match(input,26,FOLLOW_8); 

            	            	    												newLeafNode(otherlv_14, grammarAccess.getJobAccess().getHyphenMinusKeyword_3_2_2_1_1_0());
            	            	    											
            	            	    // InternalMyDsl.g:2460:12: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	            	    int alt50=2;
            	            	    int LA50_0 = input.LA(1);

            	            	    if ( (LA50_0==RULE_BEG_BLOCK) ) {
            	            	        alt50=1;
            	            	    }
            	            	    switch (alt50) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:2461:13: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            													newLeafNode(this_BEG_BLOCK_15, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_2_2_1_1_1());
            	            	            												

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalMyDsl.g:2466:12: ( (lv_needs_16_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2467:13: (lv_needs_16_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2467:13: (lv_needs_16_0= ruleEString )
            	            	    // InternalMyDsl.g:2468:14: lv_needs_16_0= ruleEString
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

            	            	    // InternalMyDsl.g:2485:12: (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    int alt51=2;
            	            	    int LA51_0 = input.LA(1);

            	            	    if ( (LA51_0==RULE_END_BLOCK) ) {
            	            	        int LA51_1 = input.LA(2);

            	            	        if ( (LA51_1==RULE_END_BLOCK||LA51_1==26) ) {
            	            	            alt51=1;
            	            	        }
            	            	    }
            	            	    switch (alt51) {
            	            	        case 1 :
            	            	            // InternalMyDsl.g:2486:13: this_END_BLOCK_17= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

            	            	            													newLeafNode(this_END_BLOCK_17, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_1_3());
            	            	            												

            	            	            }
            	            	            break;

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

            	            this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_38); 

            	            											newLeafNode(this_END_BLOCK_18, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_2_2_1_2());
            	            										

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:2498:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            {
            	            // InternalMyDsl.g:2498:10: (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            // InternalMyDsl.g:2499:11: otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']'
            	            {
            	            otherlv_19=(Token)match(input,27,FOLLOW_4); 

            	            											newLeafNode(otherlv_19, grammarAccess.getJobAccess().getLeftSquareBracketKeyword_3_2_2_2_0());
            	            										
            	            // InternalMyDsl.g:2503:11: ( (lv_needs_20_0= ruleEString ) )
            	            // InternalMyDsl.g:2504:12: (lv_needs_20_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:2504:12: (lv_needs_20_0= ruleEString )
            	            // InternalMyDsl.g:2505:13: lv_needs_20_0= ruleEString
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

            	            // InternalMyDsl.g:2522:11: (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )*
            	            loop53:
            	            do {
            	                int alt53=2;
            	                int LA53_0 = input.LA(1);

            	                if ( (LA53_0==30) ) {
            	                    alt53=1;
            	                }


            	                switch (alt53) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:2523:12: otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,30,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_21, grammarAccess.getJobAccess().getCommaKeyword_3_2_2_2_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:2527:12: ( (lv_needs_22_0= ruleEString ) )
            	            	    // InternalMyDsl.g:2528:13: (lv_needs_22_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:2528:13: (lv_needs_22_0= ruleEString )
            	            	    // InternalMyDsl.g:2529:14: lv_needs_22_0= ruleEString
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
            	            	    break loop53;
            	                }
            	            } while (true);

            	            otherlv_23=(Token)match(input,28,FOLLOW_38); 

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
            	    // InternalMyDsl.g:2559:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2559:4: ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2560:5: {...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:2560:100: ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2561:6: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:2564:9: ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2564:10: {...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2564:19: (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2564:20: otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getJobAccess().getIfKeyword_3_3_0());
            	    								
            	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_25, grammarAccess.getJobAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:2572:9: ( (lv_if_26_0= ruleEString ) )
            	    // InternalMyDsl.g:2573:10: (lv_if_26_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2573:10: (lv_if_26_0= ruleEString )
            	    // InternalMyDsl.g:2574:11: lv_if_26_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getIfEStringParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalMyDsl.g:2597:4: ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2597:4: ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) )
            	    // InternalMyDsl.g:2598:5: {...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2598:100: ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) )
            	    // InternalMyDsl.g:2599:6: ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2602:9: ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) )
            	    // InternalMyDsl.g:2602:10: {...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2602:19: (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) )
            	    // InternalMyDsl.g:2602:20: otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) )
            	    {
            	    otherlv_27=(Token)match(input,58,FOLLOW_3); 

            	    									newLeafNode(otherlv_27, grammarAccess.getJobAccess().getEnvironmentKeyword_3_4_0());
            	    								
            	    otherlv_28=(Token)match(input,16,FOLLOW_40); 

            	    									newLeafNode(otherlv_28, grammarAccess.getJobAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:2610:9: ( (lv_environment_29_0= ruleEnvironment ) )
            	    // InternalMyDsl.g:2611:10: (lv_environment_29_0= ruleEnvironment )
            	    {
            	    // InternalMyDsl.g:2611:10: (lv_environment_29_0= ruleEnvironment )
            	    // InternalMyDsl.g:2612:11: lv_environment_29_0= ruleEnvironment
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getEnvironmentEnvironmentParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_38);
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
            	    // InternalMyDsl.g:2635:4: ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    // InternalMyDsl.g:2635:4: ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:2636:5: {...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:2636:100: ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:2637:6: ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:2640:9: ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:2640:10: {...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2640:19: (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:2640:20: otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )?
            	    {
            	    otherlv_30=(Token)match(input,39,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getJobAccess().getStepsKeyword_3_5_0());
            	    								
            	    otherlv_31=(Token)match(input,16,FOLLOW_19); 

            	    									newLeafNode(otherlv_31, grammarAccess.getJobAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:2648:9: (this_BEG_BLOCK_32= RULE_BEG_BLOCK )?
            	    int alt55=2;
            	    int LA55_0 = input.LA(1);

            	    if ( (LA55_0==RULE_BEG_BLOCK) ) {
            	        alt55=1;
            	    }
            	    switch (alt55) {
            	        case 1 :
            	            // InternalMyDsl.g:2649:10: this_BEG_BLOCK_32= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_32=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	            										newLeafNode(this_BEG_BLOCK_32, grammarAccess.getJobAccess().getBEG_BLOCKTerminalRuleCall_3_5_2());
            	            									

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:2654:9: ( (lv_steps_33_0= ruleStep ) )+
            	    int cnt56=0;
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==26) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:2655:10: (lv_steps_33_0= ruleStep )
            	    	    {
            	    	    // InternalMyDsl.g:2655:10: (lv_steps_33_0= ruleStep )
            	    	    // InternalMyDsl.g:2656:11: lv_steps_33_0= ruleStep
            	    	    {

            	    	    											newCompositeNode(grammarAccess.getJobAccess().getStepsStepParserRuleCall_3_5_3_0());
            	    	    										
            	    	    pushFollow(FOLLOW_41);
            	    	    lv_steps_33_0=ruleStep();

            	    	    state._fsp--;


            	    	    											if (current==null) {
            	    	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    	    											}
            	    	    											add(
            	    	    												current,
            	    	    												"steps",
            	    	    												lv_steps_33_0,
            	    	    												"pt.isep.yamldslgen.xtext.MyDsl.Step");
            	    	    											afterParserOrEnumRuleCall();
            	    	    										

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt56 >= 1 ) break loop56;
            	                EarlyExitException eee =
            	                    new EarlyExitException(56, input);
            	                throw eee;
            	        }
            	        cnt56++;
            	    } while (true);

            	    // InternalMyDsl.g:2673:9: (this_END_BLOCK_34= RULE_END_BLOCK )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==RULE_END_BLOCK) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalMyDsl.g:2674:10: this_END_BLOCK_34= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_34=(Token)match(input,RULE_END_BLOCK,FOLLOW_38); 

            	            										newLeafNode(this_END_BLOCK_34, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_3_5_4());
            	            									

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
            	case 7 :
            	    // InternalMyDsl.g:2685:4: ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2685:4: ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) )
            	    // InternalMyDsl.g:2686:5: {...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:2686:100: ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) )
            	    // InternalMyDsl.g:2687:6: ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:2690:9: ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) )
            	    // InternalMyDsl.g:2690:10: {...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleJob", "true");
            	    }
            	    // InternalMyDsl.g:2690:19: (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) )
            	    // InternalMyDsl.g:2690:20: otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) )
            	    {
            	    otherlv_35=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_35, grammarAccess.getJobAccess().getPermissionsKeyword_3_6_0());
            	    								
            	    otherlv_36=(Token)match(input,16,FOLLOW_42); 

            	    									newLeafNode(otherlv_36, grammarAccess.getJobAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:2698:9: ( (lv_permissions_37_0= rulePermissions ) )
            	    // InternalMyDsl.g:2699:10: (lv_permissions_37_0= rulePermissions )
            	    {
            	    // InternalMyDsl.g:2699:10: (lv_permissions_37_0= rulePermissions )
            	    // InternalMyDsl.g:2700:11: lv_permissions_37_0= rulePermissions
            	    {

            	    											newCompositeNode(grammarAccess.getJobAccess().getPermissionsPermissionsParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_38);
            	    lv_permissions_37_0=rulePermissions();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getJobRule());
            	    											}
            	    											set(
            	    												current,
            	    												"permissions",
            	    												lv_permissions_37_0,
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
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getJobAccess().getUnorderedGroup_3());
            				

            }

            // InternalMyDsl.g:2730:3: (this_END_BLOCK_38= RULE_END_BLOCK )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_END_BLOCK) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2731:4: this_END_BLOCK_38= RULE_END_BLOCK
                    {
                    this_END_BLOCK_38=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_38, grammarAccess.getJobAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

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
    // InternalMyDsl.g:2740:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
>>>>>>> Stashed changes
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:1206:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:1207:2: iv_ruleStep= ruleStep EOF
=======
            // InternalMyDsl.g:2740:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:2741:2: iv_ruleStep= ruleStep EOF
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
    // InternalMyDsl.g:1213:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ;
=======
    // InternalMyDsl.g:2747:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? ) ;
>>>>>>> Stashed changes
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
        Token this_END_BLOCK_16=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_uses_9_0 = null;

        AntlrDatatypeRuleToken lv_run_12_0 = null;

        EObject lv_with_15_0 = null;



        	enterRule();

        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:1219:2: ( ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1220:2: ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1220:2: ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK )
            // InternalMyDsl.g:1221:3: () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1221:3: ()
            // InternalMyDsl.g:1222:4: 
=======
            // InternalMyDsl.g:2753:2: ( ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? ) )
            // InternalMyDsl.g:2754:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )
            {
            // InternalMyDsl.g:2754:2: ( () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )? )
            // InternalMyDsl.g:2755:3: () otherlv_1= '-' (this_BEG_BLOCK_2= RULE_BEG_BLOCK )? ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) ) (this_END_BLOCK_35= RULE_END_BLOCK )?
            {
            // InternalMyDsl.g:2755:3: ()
            // InternalMyDsl.g:2756:4: 
>>>>>>> Stashed changes
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

<<<<<<< Updated upstream
            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalMyDsl.g:1236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* )
=======
            otherlv_1=(Token)match(input,26,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            // InternalMyDsl.g:2766:3: (this_BEG_BLOCK_2= RULE_BEG_BLOCK )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_BEG_BLOCK) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:2767:4: this_BEG_BLOCK_2= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_44); 

                    				newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2772:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:2773:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:2773:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* ) )
            // InternalMyDsl.g:2774:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* )
>>>>>>> Stashed changes
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				
<<<<<<< Updated upstream
            // InternalMyDsl.g:1241:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1242:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )*
            loop22:
            do {
                int alt22=5;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
                    alt22=4;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1243:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1243:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1244:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
=======
            // InternalMyDsl.g:2777:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )* )
            // InternalMyDsl.g:2778:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )*
            {
            // InternalMyDsl.g:2778:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )*
            loop67:
            do {
                int alt67=10;
                alt67 = dfa67.predict(input);
                switch (alt67) {
            	case 1 :
            	    // InternalMyDsl.g:2779:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2779:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2780:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1244:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1245:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
=======
            	    // InternalMyDsl.g:2780:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2781:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1248:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1248:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
=======
            	    // InternalMyDsl.g:2784:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2784:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1248:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1248:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
=======
            	    // InternalMyDsl.g:2784:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2784:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
>>>>>>> Stashed changes
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getStepAccess().getColonKeyword_3_0_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1256:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:1257:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1257:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:1258:11: lv_name_6_0= ruleEString
=======
            	    // InternalMyDsl.g:2792:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:2793:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2793:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:2794:11: lv_name_6_0= ruleEString
>>>>>>> Stashed changes
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
<<<<<<< Updated upstream
            	    pushFollow(FOLLOW_19);
=======
            	    pushFollow(FOLLOW_44);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1281:4: ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1281:4: ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1282:5: {...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) )
=======
            	    // InternalMyDsl.g:2817:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2817:4: ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2818:5: {...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1282:101: ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1283:6: ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) )
=======
            	    // InternalMyDsl.g:2818:101: ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2819:6: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1286:9: ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1286:10: {...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) )
=======
            	    // InternalMyDsl.g:2822:9: ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2822:10: {...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1286:19: (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1286:20: otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_3); 
=======
            	    // InternalMyDsl.g:2822:19: (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2822:20: otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,59,FOLLOW_3); 
>>>>>>> Stashed changes

            	    									newLeafNode(otherlv_7, grammarAccess.getStepAccess().getUsesKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getColonKeyword_3_1_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1294:9: ( (lv_uses_9_0= ruleEString ) )
            	    // InternalMyDsl.g:1295:10: (lv_uses_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1295:10: (lv_uses_9_0= ruleEString )
            	    // InternalMyDsl.g:1296:11: lv_uses_9_0= ruleEString
=======
            	    // InternalMyDsl.g:2830:9: ( (lv_id_9_0= ruleEString ) )
            	    // InternalMyDsl.g:2831:10: (lv_id_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2831:10: (lv_id_9_0= ruleEString )
            	    // InternalMyDsl.g:2832:11: lv_id_9_0= ruleEString
>>>>>>> Stashed changes
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getUsesEStringParserRuleCall_3_1_2_0());
            	    										
<<<<<<< Updated upstream
            	    pushFollow(FOLLOW_19);
            	    lv_uses_9_0=ruleEString();
=======
            	    pushFollow(FOLLOW_44);
            	    lv_id_9_0=ruleEString();
>>>>>>> Stashed changes

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"uses",
            	    												lv_uses_9_0,
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
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1319:4: ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1319:4: ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1320:5: {...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) )
=======
            	    // InternalMyDsl.g:2855:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2855:4: ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2856:5: {...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1320:101: ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1321:6: ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) )
=======
            	    // InternalMyDsl.g:2856:101: ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2857:6: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1324:9: ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1324:10: {...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) )
=======
            	    // InternalMyDsl.g:2860:9: ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2860:10: {...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1324:19: (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1324:20: otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) )
=======
            	    // InternalMyDsl.g:2860:19: (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2860:20: otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) )
>>>>>>> Stashed changes
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStepAccess().getRunKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStepAccess().getColonKeyword_3_2_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1332:9: ( (lv_run_12_0= ruleEString ) )
            	    // InternalMyDsl.g:1333:10: (lv_run_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1333:10: (lv_run_12_0= ruleEString )
            	    // InternalMyDsl.g:1334:11: lv_run_12_0= ruleEString
=======
            	    // InternalMyDsl.g:2868:9: ( (lv_uses_12_0= ruleEString ) )
            	    // InternalMyDsl.g:2869:10: (lv_uses_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2869:10: (lv_uses_12_0= ruleEString )
            	    // InternalMyDsl.g:2870:11: lv_uses_12_0= ruleEString
>>>>>>> Stashed changes
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_3_2_2_0());
            	    										
<<<<<<< Updated upstream
            	    pushFollow(FOLLOW_19);
            	    lv_run_12_0=ruleEString();
=======
            	    pushFollow(FOLLOW_44);
            	    lv_uses_12_0=ruleEString();
>>>>>>> Stashed changes

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"run",
            	    												lv_run_12_0,
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
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1357:4: ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1357:4: ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) )
            	    // InternalMyDsl.g:1358:5: {...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) )
=======
            	    // InternalMyDsl.g:2893:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2893:4: ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2894:5: {...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3)");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1358:101: ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) )
            	    // InternalMyDsl.g:1359:6: ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) )
=======
            	    // InternalMyDsl.g:2894:101: ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2895:6: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
>>>>>>> Stashed changes
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3);
            	    					
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1362:9: ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) )
            	    // InternalMyDsl.g:1362:10: {...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) )
=======
            	    // InternalMyDsl.g:2898:9: ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2898:10: {...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
>>>>>>> Stashed changes
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1362:19: (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) )
            	    // InternalMyDsl.g:1362:20: otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) )
=======
            	    // InternalMyDsl.g:2898:19: (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2898:20: otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) )
>>>>>>> Stashed changes
            	    {
            	    otherlv_13=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStepAccess().getWithKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_14, grammarAccess.getStepAccess().getColonKeyword_3_3_1());
            	    								
<<<<<<< Updated upstream
            	    // InternalMyDsl.g:1370:9: ( (lv_with_15_0= ruleWith ) )
            	    // InternalMyDsl.g:1371:10: (lv_with_15_0= ruleWith )
            	    {
            	    // InternalMyDsl.g:1371:10: (lv_with_15_0= ruleWith )
            	    // InternalMyDsl.g:1372:11: lv_with_15_0= ruleWith
=======
            	    // InternalMyDsl.g:2906:9: ( (lv_run_15_0= ruleEString ) )
            	    // InternalMyDsl.g:2907:10: (lv_run_15_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2907:10: (lv_run_15_0= ruleEString )
            	    // InternalMyDsl.g:2908:11: lv_run_15_0= ruleEString
>>>>>>> Stashed changes
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getWithWithParserRuleCall_3_3_2_0());
            	    										
<<<<<<< Updated upstream
            	    pushFollow(FOLLOW_19);
            	    lv_with_15_0=ruleWith();
=======
            	    pushFollow(FOLLOW_44);
            	    lv_run_15_0=ruleEString();
>>>>>>> Stashed changes

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getStepRule());
            	    											}
            	    											set(
            	    												current,
            	    												"with",
            	    												lv_with_15_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.With");
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
<<<<<<< Updated upstream

            	default :
            	    break loop22;
=======
            	case 5 :
            	    // InternalMyDsl.g:2931:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2931:4: ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2932:5: {...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMyDsl.g:2932:101: ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2933:6: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMyDsl.g:2936:9: ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2936:10: {...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2936:19: (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2936:20: otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getStepAccess().getIfKeyword_3_4_0());
            	    								
            	    otherlv_17=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_17, grammarAccess.getStepAccess().getColonKeyword_3_4_1());
            	    								
            	    // InternalMyDsl.g:2944:9: ( (lv_if_18_0= ruleEString ) )
            	    // InternalMyDsl.g:2945:10: (lv_if_18_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2945:10: (lv_if_18_0= ruleEString )
            	    // InternalMyDsl.g:2946:11: lv_if_18_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getIfEStringParserRuleCall_3_4_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
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
            	    // InternalMyDsl.g:2969:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:2969:4: ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:2970:5: {...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // InternalMyDsl.g:2970:101: ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:2971:6: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5);
            	    					
            	    // InternalMyDsl.g:2974:9: ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:2974:10: {...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:2974:19: (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) )
            	    // InternalMyDsl.g:2974:20: otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,60,FOLLOW_3); 

            	    									newLeafNode(otherlv_19, grammarAccess.getStepAccess().getWorkingDirectoryKeyword_3_5_0());
            	    								
            	    otherlv_20=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_20, grammarAccess.getStepAccess().getColonKeyword_3_5_1());
            	    								
            	    // InternalMyDsl.g:2982:9: ( (lv_workingDirectory_21_0= ruleEString ) )
            	    // InternalMyDsl.g:2983:10: (lv_workingDirectory_21_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:2983:10: (lv_workingDirectory_21_0= ruleEString )
            	    // InternalMyDsl.g:2984:11: lv_workingDirectory_21_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getWorkingDirectoryEStringParserRuleCall_3_5_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
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
            	    // InternalMyDsl.g:3007:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3007:4: ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:3008:5: {...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // InternalMyDsl.g:3008:101: ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:3009:6: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6);
            	    					
            	    // InternalMyDsl.g:3012:9: ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:3012:10: {...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3012:19: (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) )
            	    // InternalMyDsl.g:3012:20: otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,43,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getStepAccess().getShellKeyword_3_6_0());
            	    								
            	    otherlv_23=(Token)match(input,16,FOLLOW_4); 

            	    									newLeafNode(otherlv_23, grammarAccess.getStepAccess().getColonKeyword_3_6_1());
            	    								
            	    // InternalMyDsl.g:3020:9: ( (lv_shell_24_0= ruleEString ) )
            	    // InternalMyDsl.g:3021:10: (lv_shell_24_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:3021:10: (lv_shell_24_0= ruleEString )
            	    // InternalMyDsl.g:3022:11: lv_shell_24_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getShellEStringParserRuleCall_3_6_2_0());
            	    										
            	    pushFollow(FOLLOW_44);
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
            	    // InternalMyDsl.g:3045:4: ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3045:4: ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3046:5: {...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // InternalMyDsl.g:3046:101: ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3047:6: ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7);
            	    					
            	    // InternalMyDsl.g:3050:9: ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3050:10: {...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3050:19: (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3050:20: otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? )
            	    {
            	    otherlv_25=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_25, grammarAccess.getStepAccess().getWithKeyword_3_7_0());
            	    								
            	    otherlv_26=(Token)match(input,16,FOLLOW_11); 

            	    									newLeafNode(otherlv_26, grammarAccess.getStepAccess().getColonKeyword_3_7_1());
            	    								
            	    // InternalMyDsl.g:3058:9: ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3059:10: (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3059:10: (this_BEG_BLOCK_27= RULE_BEG_BLOCK )?
            	    int alt61=2;
            	    int LA61_0 = input.LA(1);

            	    if ( (LA61_0==RULE_BEG_BLOCK) ) {
            	        alt61=1;
            	    }
            	    switch (alt61) {
            	        case 1 :
            	            // InternalMyDsl.g:3060:11: this_BEG_BLOCK_27= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_27=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            	            											newLeafNode(this_BEG_BLOCK_27, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_7_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3065:10: ( (lv_with_28_0= ruleKeyValuePair ) )+
            	    int cnt62=0;
            	    loop62:
            	    do {
            	        int alt62=2;
            	        alt62 = dfa62.predict(input);
            	        switch (alt62) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3066:11: (lv_with_28_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3066:11: (lv_with_28_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3067:12: lv_with_28_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getWithKeyValuePairParserRuleCall_3_7_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_45);
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
            	    	    if ( cnt62 >= 1 ) break loop62;
            	                EarlyExitException eee =
            	                    new EarlyExitException(62, input);
            	                throw eee;
            	        }
            	        cnt62++;
            	    } while (true);

            	    // InternalMyDsl.g:3084:10: (this_END_BLOCK_29= RULE_END_BLOCK )?
            	    int alt63=2;
            	    int LA63_0 = input.LA(1);

            	    if ( (LA63_0==RULE_END_BLOCK) ) {
            	        alt63=1;
            	    }
            	    switch (alt63) {
            	        case 1 :
            	            // InternalMyDsl.g:3085:11: this_END_BLOCK_29= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_29=(Token)match(input,RULE_END_BLOCK,FOLLOW_44); 

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
            	    // InternalMyDsl.g:3097:4: ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:3097:4: ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) )
            	    // InternalMyDsl.g:3098:5: {...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // InternalMyDsl.g:3098:101: ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) )
            	    // InternalMyDsl.g:3099:6: ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8);
            	    					
            	    // InternalMyDsl.g:3102:9: ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) )
            	    // InternalMyDsl.g:3102:10: {...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:3102:19: (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) )
            	    // InternalMyDsl.g:3102:20: otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? )
            	    {
            	    otherlv_30=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_30, grammarAccess.getStepAccess().getEnvKeyword_3_8_0());
            	    								
            	    otherlv_31=(Token)match(input,16,FOLLOW_11); 

            	    									newLeafNode(otherlv_31, grammarAccess.getStepAccess().getColonKeyword_3_8_1());
            	    								
            	    // InternalMyDsl.g:3110:9: ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? )
            	    // InternalMyDsl.g:3111:10: (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )?
            	    {
            	    // InternalMyDsl.g:3111:10: (this_BEG_BLOCK_32= RULE_BEG_BLOCK )?
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==RULE_BEG_BLOCK) ) {
            	        alt64=1;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalMyDsl.g:3112:11: this_BEG_BLOCK_32= RULE_BEG_BLOCK
            	            {
            	            this_BEG_BLOCK_32=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            	            											newLeafNode(this_BEG_BLOCK_32, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_3_8_2_0());
            	            										

            	            }
            	            break;

            	    }

            	    // InternalMyDsl.g:3117:10: ( (lv_env_33_0= ruleKeyValuePair ) )+
            	    int cnt65=0;
            	    loop65:
            	    do {
            	        int alt65=2;
            	        alt65 = dfa65.predict(input);
            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:3118:11: (lv_env_33_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalMyDsl.g:3118:11: (lv_env_33_0= ruleKeyValuePair )
            	    	    // InternalMyDsl.g:3119:12: lv_env_33_0= ruleKeyValuePair
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getStepAccess().getEnvKeyValuePairParserRuleCall_3_8_2_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_45);
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
            	    	    if ( cnt65 >= 1 ) break loop65;
            	                EarlyExitException eee =
            	                    new EarlyExitException(65, input);
            	                throw eee;
            	        }
            	        cnt65++;
            	    } while (true);

            	    // InternalMyDsl.g:3136:10: (this_END_BLOCK_34= RULE_END_BLOCK )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==RULE_END_BLOCK) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalMyDsl.g:3137:11: this_END_BLOCK_34= RULE_END_BLOCK
            	            {
            	            this_END_BLOCK_34=(Token)match(input,RULE_END_BLOCK,FOLLOW_44); 

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
            	    break loop67;
>>>>>>> Stashed changes
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				

            }

<<<<<<< Updated upstream
            this_END_BLOCK_16=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 
=======
            // InternalMyDsl.g:3156:3: (this_END_BLOCK_35= RULE_END_BLOCK )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_END_BLOCK) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMyDsl.g:3157:4: this_END_BLOCK_35= RULE_END_BLOCK
                    {
                    this_END_BLOCK_35=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_35, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_4());
                    			

                    }
                    break;

            }
>>>>>>> Stashed changes

            			newLeafNode(this_END_BLOCK_16, grammarAccess.getStepAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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


<<<<<<< Updated upstream
    // $ANTLR start "entryRulePermissions"
    // InternalMyDsl.g:1410:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;
=======
    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:3166:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;
>>>>>>> Stashed changes

        EObject iv_rulePermissions = null;


        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:1410:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalMyDsl.g:1411:2: iv_rulePermissions= rulePermissions EOF
=======
            // InternalMyDsl.g:3166:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalMyDsl.g:3167:2: iv_ruleEBoolean= ruleEBoolean EOF
>>>>>>> Stashed changes
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


<<<<<<< Updated upstream
    // $ANTLR start "rulePermissions"
    // InternalMyDsl.g:1417:1: rulePermissions returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'contents' otherlv_3= ':' ( (lv_contents_4_0= ruleEString ) ) this_END_BLOCK_5= RULE_END_BLOCK ) ;
    public final EObject rulePermissions() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_contents_4_0 = null;
=======
    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:3173:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();
>>>>>>> Stashed changes



        	enterRule();

        try {
<<<<<<< Updated upstream
            // InternalMyDsl.g:1423:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'contents' otherlv_3= ':' ( (lv_contents_4_0= ruleEString ) ) this_END_BLOCK_5= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1424:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'contents' otherlv_3= ':' ( (lv_contents_4_0= ruleEString ) ) this_END_BLOCK_5= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1424:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'contents' otherlv_3= ':' ( (lv_contents_4_0= ruleEString ) ) this_END_BLOCK_5= RULE_END_BLOCK )
            // InternalMyDsl.g:1425:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'contents' otherlv_3= ':' ( (lv_contents_4_0= ruleEString ) ) this_END_BLOCK_5= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1425:3: ()
            // InternalMyDsl.g:1426:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionsAccess().getPermissionsAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_20); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPermissionsAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPermissionsAccess().getContentsKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getPermissionsAccess().getColonKeyword_3());
            		
            // InternalMyDsl.g:1444:3: ( (lv_contents_4_0= ruleEString ) )
            // InternalMyDsl.g:1445:4: (lv_contents_4_0= ruleEString )
            {
            // InternalMyDsl.g:1445:4: (lv_contents_4_0= ruleEString )
            // InternalMyDsl.g:1446:5: lv_contents_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPermissionsAccess().getContentsEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_contents_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissionsRule());
            					}
            					set(
            						current,
            						"contents",
            						lv_contents_4_0,
            						"pt.isep.yamldslgen.xtext.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }
=======
            // InternalMyDsl.g:3179:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalMyDsl.g:3180:2: (kw= 'true' | kw= 'false' )
            {
            // InternalMyDsl.g:3180:2: (kw= 'true' | kw= 'false' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==22) ) {
                alt69=1;
            }
            else if ( (LA69_0==23) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);
>>>>>>> Stashed changes


            }
<<<<<<< Updated upstream
=======
            switch (alt69) {
                case 1 :
                    // InternalMyDsl.g:3181:3: kw= 'true'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 
>>>>>>> Stashed changes

            this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

<<<<<<< Updated upstream
            			newLeafNode(this_END_BLOCK_5, grammarAccess.getPermissionsAccess().getEND_BLOCKTerminalRuleCall_5());
            		
=======
                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3187:3: kw= 'false'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;
>>>>>>> Stashed changes

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


    // $ANTLR start "entryRuleWith"
    // InternalMyDsl.g:1471:1: entryRuleWith returns [EObject current=null] : iv_ruleWith= ruleWith EOF ;
    public final EObject entryRuleWith() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWith = null;


        try {
            // InternalMyDsl.g:1471:45: (iv_ruleWith= ruleWith EOF )
            // InternalMyDsl.g:1472:2: iv_ruleWith= ruleWith EOF
            {
             newCompositeNode(grammarAccess.getWithRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWith=ruleWith();

            state._fsp--;

             current =iv_ruleWith; 
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
    // $ANTLR end "entryRuleWith"


    // $ANTLR start "ruleWith"
    // InternalMyDsl.g:1478:1: ruleWith returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_27= RULE_END_BLOCK ) ;
    public final EObject ruleWith() throws RecognitionException {
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
        Token lv_generateReleaseNotes_26_0=null;
        Token this_END_BLOCK_27=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_javaVersion_8_0 = null;

        AntlrDatatypeRuleToken lv_distribution_11_0 = null;

        AntlrDatatypeRuleToken lv_path_14_0 = null;

        AntlrDatatypeRuleToken lv_target_17_0 = null;

        AntlrDatatypeRuleToken lv_token_20_0 = null;

        AntlrDatatypeRuleToken lv_files_23_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1484:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_27= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1485:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_27= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1485:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_27= RULE_END_BLOCK )
            // InternalMyDsl.g:1486:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_27= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1486:3: ()
            // InternalMyDsl.g:1487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWithAccess().getWithAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_21); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getWithAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:1497:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1498:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1498:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1499:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getWithAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:1502:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:1503:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:1503:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )*
            loop23:
            do {
                int alt23=9;
                alt23 = dfa23.predict(input);
                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:1504:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1504:4: ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1505:5: {...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:1505:101: ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1506:6: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:1509:9: ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1509:10: {...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1509:19: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1509:20: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getWithAccess().getNameKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_4, grammarAccess.getWithAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:1517:9: ( (lv_name_5_0= ruleEString ) )
            	    // InternalMyDsl.g:1518:10: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1518:10: (lv_name_5_0= ruleEString )
            	    // InternalMyDsl.g:1519:11: lv_name_5_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getWithAccess().getNameEStringParserRuleCall_2_0_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_name_5_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWithRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:1542:4: ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1542:4: ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1543:5: {...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:1543:101: ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1544:6: ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:1547:9: ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1547:10: {...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1547:19: (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1547:20: otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,36,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getWithAccess().getJavaVersionKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_7, grammarAccess.getWithAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:1555:9: ( (lv_javaVersion_8_0= ruleEString ) )
            	    // InternalMyDsl.g:1556:10: (lv_javaVersion_8_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1556:10: (lv_javaVersion_8_0= ruleEString )
            	    // InternalMyDsl.g:1557:11: lv_javaVersion_8_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getWithAccess().getJavaVersionEStringParserRuleCall_2_1_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_javaVersion_8_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWithRule());
            	    											}
            	    											set(
            	    												current,
            	    												"javaVersion",
            	    												lv_javaVersion_8_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:1580:4: ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1580:4: ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1581:5: {...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalMyDsl.g:1581:101: ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1582:6: ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalMyDsl.g:1585:9: ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1585:10: {...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1585:19: (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1585:20: otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,37,FOLLOW_3); 

            	    									newLeafNode(otherlv_9, grammarAccess.getWithAccess().getDistributionKeyword_2_2_0());
            	    								
            	    otherlv_10=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_10, grammarAccess.getWithAccess().getColonKeyword_2_2_1());
            	    								
            	    // InternalMyDsl.g:1593:9: ( (lv_distribution_11_0= ruleEString ) )
            	    // InternalMyDsl.g:1594:10: (lv_distribution_11_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1594:10: (lv_distribution_11_0= ruleEString )
            	    // InternalMyDsl.g:1595:11: lv_distribution_11_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getWithAccess().getDistributionEStringParserRuleCall_2_2_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_distribution_11_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWithRule());
            	    											}
            	    											set(
            	    												current,
            	    												"distribution",
            	    												lv_distribution_11_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:1618:4: ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1618:4: ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1619:5: {...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalMyDsl.g:1619:101: ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1620:6: ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalMyDsl.g:1623:9: ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1623:10: {...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1623:19: (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1623:20: otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_12, grammarAccess.getWithAccess().getPathKeyword_2_3_0());
            	    								
            	    otherlv_13=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_13, grammarAccess.getWithAccess().getColonKeyword_2_3_1());
            	    								
            	    // InternalMyDsl.g:1631:9: ( (lv_path_14_0= ruleEString ) )
            	    // InternalMyDsl.g:1632:10: (lv_path_14_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1632:10: (lv_path_14_0= ruleEString )
            	    // InternalMyDsl.g:1633:11: lv_path_14_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getWithAccess().getPathEStringParserRuleCall_2_3_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_path_14_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWithRule());
            	    											}
            	    											set(
            	    												current,
            	    												"path",
            	    												lv_path_14_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMyDsl.g:1656:4: ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1656:4: ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1657:5: {...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalMyDsl.g:1657:101: ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1658:6: ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalMyDsl.g:1661:9: ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1661:10: {...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1661:19: (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1661:20: otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,39,FOLLOW_3); 

            	    									newLeafNode(otherlv_15, grammarAccess.getWithAccess().getTargetKeyword_2_4_0());
            	    								
            	    otherlv_16=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_16, grammarAccess.getWithAccess().getColonKeyword_2_4_1());
            	    								
            	    // InternalMyDsl.g:1669:9: ( (lv_target_17_0= ruleEString ) )
            	    // InternalMyDsl.g:1670:10: (lv_target_17_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1670:10: (lv_target_17_0= ruleEString )
            	    // InternalMyDsl.g:1671:11: lv_target_17_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getWithAccess().getTargetEStringParserRuleCall_2_4_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_target_17_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWithRule());
            	    											}
            	    											set(
            	    												current,
            	    												"target",
            	    												lv_target_17_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMyDsl.g:1694:4: ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1694:4: ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1695:5: {...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalMyDsl.g:1695:101: ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1696:6: ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalMyDsl.g:1699:9: ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1699:10: {...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1699:19: (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1699:20: otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,40,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getWithAccess().getTokenKeyword_2_5_0());
            	    								
            	    otherlv_19=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_19, grammarAccess.getWithAccess().getColonKeyword_2_5_1());
            	    								
            	    // InternalMyDsl.g:1707:9: ( (lv_token_20_0= ruleEString ) )
            	    // InternalMyDsl.g:1708:10: (lv_token_20_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1708:10: (lv_token_20_0= ruleEString )
            	    // InternalMyDsl.g:1709:11: lv_token_20_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getWithAccess().getTokenEStringParserRuleCall_2_5_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_token_20_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWithRule());
            	    											}
            	    											set(
            	    												current,
            	    												"token",
            	    												lv_token_20_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalMyDsl.g:1732:4: ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1732:4: ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1733:5: {...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalMyDsl.g:1733:101: ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1734:6: ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalMyDsl.g:1737:9: ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1737:10: {...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1737:19: (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1737:20: otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) )
            	    {
            	    otherlv_21=(Token)match(input,41,FOLLOW_3); 

            	    									newLeafNode(otherlv_21, grammarAccess.getWithAccess().getFilesKeyword_2_6_0());
            	    								
            	    otherlv_22=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_22, grammarAccess.getWithAccess().getColonKeyword_2_6_1());
            	    								
            	    // InternalMyDsl.g:1745:9: ( (lv_files_23_0= ruleEString ) )
            	    // InternalMyDsl.g:1746:10: (lv_files_23_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1746:10: (lv_files_23_0= ruleEString )
            	    // InternalMyDsl.g:1747:11: lv_files_23_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getWithAccess().getFilesEStringParserRuleCall_2_6_2_0());
            	    										
            	    pushFollow(FOLLOW_21);
            	    lv_files_23_0=ruleEString();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getWithRule());
            	    											}
            	    											set(
            	    												current,
            	    												"files",
            	    												lv_files_23_0,
            	    												"pt.isep.yamldslgen.xtext.MyDsl.EString");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalMyDsl.g:1770:4: ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1770:4: ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) )
            	    // InternalMyDsl.g:1771:5: {...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalMyDsl.g:1771:101: ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) )
            	    // InternalMyDsl.g:1772:6: ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getWithAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalMyDsl.g:1775:9: ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) )
            	    // InternalMyDsl.g:1775:10: {...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleWith", "true");
            	    }
            	    // InternalMyDsl.g:1775:19: (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) )
            	    // InternalMyDsl.g:1775:20: otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) )
            	    {
            	    otherlv_24=(Token)match(input,42,FOLLOW_3); 

            	    									newLeafNode(otherlv_24, grammarAccess.getWithAccess().getGenerate_release_notesKeyword_2_7_0());
            	    								
            	    otherlv_25=(Token)match(input,15,FOLLOW_22); 

            	    									newLeafNode(otherlv_25, grammarAccess.getWithAccess().getColonKeyword_2_7_1());
            	    								
            	    // InternalMyDsl.g:1783:9: ( (lv_generateReleaseNotes_26_0= 'true' ) )
            	    // InternalMyDsl.g:1784:10: (lv_generateReleaseNotes_26_0= 'true' )
            	    {
            	    // InternalMyDsl.g:1784:10: (lv_generateReleaseNotes_26_0= 'true' )
            	    // InternalMyDsl.g:1785:11: lv_generateReleaseNotes_26_0= 'true'
            	    {
            	    lv_generateReleaseNotes_26_0=(Token)match(input,18,FOLLOW_21); 

            	    											newLeafNode(lv_generateReleaseNotes_26_0, grammarAccess.getWithAccess().getGenerateReleaseNotesTrueKeyword_2_7_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getWithRule());
            	    											}
            	    											setWithLastConsumed(current, "generateReleaseNotes", lv_generateReleaseNotes_26_0 != null, "true");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getWithAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getWithAccess().getUnorderedGroup_2());
            				

            }

            this_END_BLOCK_27=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_27, grammarAccess.getWithAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleWith"

    // Delegated rules


<<<<<<< Updated upstream
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\5\11\uffff";
    static final String dfa_3s = "\1\52\11\uffff";
    static final String dfa_4s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\10\uffff\1\2\25\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
=======
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA44 dfa44 = new DFA44(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA67 dfa67 = new DFA67(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\77\uffff";
    static final String dfa_2s = "\1\1\10\uffff\1\1\1\uffff\1\1\12\uffff\2\25\14\54\10\64\1\uffff\5\64\1\1\2\uffff\5\76\5\uffff";
    static final String dfa_3s = "\1\5\1\uffff\5\20\1\uffff\1\6\4\4\11\uffff\2\5\2\4\22\5\1\uffff\5\5\1\4\1\6\1\uffff\5\5\5\uffff";
    static final String dfa_4s = "\1\63\1\uffff\5\20\1\uffff\1\31\1\65\1\31\1\62\1\63\11\uffff\26\63\1\uffff\5\63\1\72\1\31\1\uffff\5\63\5\uffff";
    static final String dfa_5s = "\1\uffff\1\2\5\uffff\1\1\5\uffff\11\1\26\uffff\1\1\7\uffff\1\1\5\uffff\5\1";
    static final String dfa_6s = "\77\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\2\uffff\3\7\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\13\uffff\23\7",
            "",
            "\1\10",
            "\1\11",
            "\1\12",
            "\1\13",
            "\1\14",
            "",
            "\1\15\1\16\1\21\1\22\1\23\13\uffff\1\24\1\25\1\17\1\20",
            "\2\1\5\25\4\uffff\1\1\1\uffff\5\1\4\25\7\uffff\2\1\21\uffff\2\1",
            "\1\1\1\uffff\1\26\1\27\1\32\1\33\1\34\13\uffff\1\35\1\36\1\30\1\31",
            "\2\1\5\25\4\uffff\1\1\1\uffff\5\1\4\25\22\uffff\5\1\1\uffff\1\1",
            "\1\1\1\uffff\2\25\1\40\1\37\1\41\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\25\7\uffff\23\1",
>>>>>>> Stashed changes
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
<<<<<<< Updated upstream
=======
            "",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\23\25",
            "\1\25\2\uffff\1\25\1\7\1\25\4\uffff\1\25\1\1\5\25\13\uffff\23\25",
            "\1\42\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\54",
            "\1\42\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\62\5\54\13\uffff\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\23\54",
            "\1\54\2\uffff\1\54\1\7\1\54\4\uffff\1\54\1\63\5\54\13\uffff\23\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\54\1\64\5\54\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\54",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\7\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\61\1\47\1\44\1\43\1\45\1\46\1\60\3\uffff\1\64\1\54\5\64\4\uffff\1\50\1\51\1\52\1\53\1\55\1\56\1\57\23\64",
            "\1\64\2\uffff\1\64\1\7\1\64\4\uffff\1\64\1\1\5\64\13\uffff\23\64",
            "\4\1\1\65\1\66\1\67\4\uffff\1\1\1\uffff\5\1\1\70\1\71\2\1\13\uffff\3\1\13\uffff\1\1\6\uffff\1\1",
            "\2\1\1\72\1\73\1\74\13\uffff\1\75\1\76\2\1",
            "",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\23\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\23\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\23\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\23\76",
            "\1\76\2\uffff\1\76\1\7\1\76\4\uffff\1\76\1\62\5\76\13\uffff\23\76",
            "",
            "",
            "",
            "",
>>>>>>> Stashed changes
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
<<<<<<< Updated upstream
            return "()* loopback of 1503:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )*";
=======
            return "()+ loopback of 307:9: ( (lv_env_21_0= ruleKeyValuePair ) )+";
        }
    }
    static final String dfa_8s = "\117\uffff";
    static final String dfa_9s = "\1\1\7\uffff\1\20\31\uffff\1\1\1\uffff\1\60\5\uffff\1\60\1\1\5\uffff\1\60\17\uffff\2\60\10\uffff\1\60\3\uffff";
    static final String dfa_10s = "\1\5\7\uffff\1\5\15\uffff\2\4\2\20\12\5\1\4\4\5\1\20\1\4\1\5\5\uffff\13\5\5\20\2\4\6\5\2\20\1\4\3\5";
    static final String dfa_11s = "\1\74\7\uffff\1\74\15\uffff\2\40\2\36\10\40\1\72\1\40\1\72\4\40\1\36\1\72\1\65\5\uffff\1\36\12\40\5\36\2\72\6\40\2\36\1\72\3\40";
    static final String dfa_12s = "\1\uffff\1\17\1\3\1\1\1\4\1\5\1\2\1\6\1\uffff\1\10\1\12\1\7\1\11\1\14\1\15\1\16\6\13\26\uffff\5\13\36\uffff";
    static final String dfa_13s = "\117\uffff}>";
    static final String[] dfa_14s = {
            "\1\1\1\5\1\6\1\3\1\2\1\4\1\17\3\uffff\1\1\1\12\11\1\1\7\1\13\1\11\1\14\1\10\1\15\1\16\25\1\1\uffff\6\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\1\24\1\25\1\22\1\21\1\23\1\25\3\uffff\1\20\1\25\5\20\1\30\1\31\1\26\1\27\7\25\23\23\2\25\1\uffff\6\25",
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
            "\1\32\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\32\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\53\1\60\1\55\1\54\1\56\1\57\1\50\3\uffff\1\1\1\44\11\1\1\40\1\41\1\42\1\43\1\45\1\46\1\47\2\uffff\5\1\11\uffff\1\1\1\uffff\1\1\6\uffff\1\1",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\60\1\61\1\66\1\63\1\62\1\64\1\65\1\50\3\uffff\1\60\1\44\11\60\1\40\1\41\1\42\1\43\1\45\1\46\1\47\4\uffff\3\60\13\uffff\1\60\6\uffff\1\60",
            "\1\51\1\73\1\70\1\67\1\71\1\72\1\50\4\uffff\1\44\5\uffff\4\1\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\60\13\uffff\1\1\1\uffff\1\1",
            "\4\60\1\74\1\75\1\76\4\uffff\1\60\1\uffff\5\60\1\77\1\100\2\60\13\uffff\3\60\13\uffff\1\60\6\uffff\1\60",
            "\6\1\4\uffff\1\1\1\60\11\1\2\uffff\1\1\1\uffff\1\1\2\uffff\2\1\21\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "\6\60\4\uffff\13\60\2\uffff\1\1\1\uffff\1\1",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\101\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\101\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\101\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\102\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\102\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\102\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\44\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\60\1\61\1\66\1\63\1\103\1\104\1\105\1\50\3\uffff\1\60\1\44\11\60\1\40\1\41\1\42\1\43\1\45\1\46\1\47\4\uffff\3\60\13\uffff\1\60\6\uffff\1\60",
            "\1\60\1\61\1\66\1\63\1\106\1\107\1\110\1\50\3\uffff\1\60\1\44\5\60\1\111\1\112\2\60\1\40\1\41\1\42\1\43\1\45\1\46\1\47\4\uffff\3\60\13\uffff\1\60\6\uffff\1\60",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\101\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\101\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\101\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\113\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\113\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\113\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\52\13\uffff\1\1\1\uffff\1\1",
            "\1\60\1\61\1\66\1\63\1\114\1\115\1\116\1\50\3\uffff\1\60\1\44\5\60\1\77\1\100\2\60\1\40\1\41\1\42\1\43\1\45\1\46\1\47\4\uffff\3\60\13\uffff\1\60\6\uffff\1\60",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\113\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\113\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47",
            "\1\51\1\37\1\34\1\33\1\35\1\36\1\50\4\uffff\1\113\11\uffff\1\40\1\41\1\42\1\43\1\45\1\46\1\47"
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
    static final String dfa_18s = "\1\72\1\uffff\1\20\1\uffff\1\31\11\0\1\uffff";
    static final String dfa_19s = "\1\uffff\1\3\1\uffff\1\2\12\uffff\1\1";
    static final String dfa_20s = "\1\1\4\uffff\1\7\1\5\1\10\1\4\1\2\1\0\1\11\1\6\1\3\1\uffff}>";
    static final String[] dfa_21s = {
            "\6\1\4\uffff\1\2\1\uffff\11\1\13\uffff\3\1\13\uffff\1\1\5\uffff\1\3\1\1",
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

    class DFA44 extends DFA {

        public DFA44(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 44;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "()* loopback of 1915:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'url' otherlv_7= ':' ( (lv_url_8_0= ruleEString ) ) ) ) ) ) )*";
>>>>>>> Stashed changes
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
<<<<<<< Updated upstream
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
=======
                        int LA44_10 = input.LA(1);

                         
                        int index44_10 = input.index();
>>>>>>> Stashed changes
                        input.rewind();
                        s = -1;
                        if ( (LA23_0==RULE_END_BLOCK) ) {s = 1;}

                        else if ( LA23_0 == 14 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA23_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA23_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA23_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA23_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA23_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA23_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA23_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getWithAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                         
<<<<<<< Updated upstream
                        input.seek(index23_0);
=======
                        input.seek(index44_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA44_0 = input.LA(1);

                         
                        int index44_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA44_0==EOF||(LA44_0>=RULE_END_BLOCK && LA44_0<=RULE_INT)||(LA44_0>=17 && LA44_0<=25)||(LA44_0>=37 && LA44_0<=39)||LA44_0==51||LA44_0==58) ) {s = 1;}

                        else if ( (LA44_0==15) ) {s = 2;}

                        else if ( LA44_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                         
                        input.seek(index44_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA44_9 = input.LA(1);

                         
                        int index44_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_9);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA44_13 = input.LA(1);

                         
                        int index44_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA44_8 = input.LA(1);

                         
                        int index44_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA44_6 = input.LA(1);

                         
                        int index44_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA44_12 = input.LA(1);

                         
                        int index44_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_12);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA44_5 = input.LA(1);

                         
                        int index44_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_5);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA44_7 = input.LA(1);

                         
                        int index44_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_7);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA44_11 = input.LA(1);

                         
                        int index44_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEnvironmentAccess().getUnorderedGroup_2(), 0) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index44_11);
>>>>>>> Stashed changes
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
<<<<<<< Updated upstream
                new NoViableAltException(getDescription(), 23, _s, input);
=======
                new NoViableAltException(getDescription(), 44, _s, input);
>>>>>>> Stashed changes
            error(nvae);
            throw nvae;
        }
    }
<<<<<<< Updated upstream
=======
    static final String dfa_22s = "\26\uffff";
    static final String dfa_23s = "\1\1\25\uffff";
    static final String dfa_24s = "\1\5\1\uffff\2\20\5\uffff\1\6\12\0\2\uffff";
    static final String dfa_25s = "\1\72\1\uffff\2\20\5\uffff\1\31\12\0\2\uffff";
    static final String dfa_26s = "\1\uffff\1\10\2\uffff\1\2\1\3\1\4\1\5\1\6\13\uffff\1\7\1\1";
    static final String dfa_27s = "\1\5\11\uffff\1\0\1\3\1\4\1\1\1\6\1\10\1\11\1\12\1\7\1\2\2\uffff}>";
    static final String[] dfa_28s = {
            "\6\1\4\uffff\1\2\1\uffff\3\1\1\3\5\1\13\uffff\1\4\1\5\1\10\13\uffff\1\6\6\uffff\1\7",
            "",
            "\1\11",
            "\1\12",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\14\1\17\1\20\1\21\13\uffff\1\22\1\23\1\15\1\16",
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

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "()* loopback of 2339:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'runs-on' otherlv_8= ':' ( (lv_runsOn_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'needs' otherlv_11= ':' ( ( (lv_needs_12_0= ruleEString ) ) | (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_needs_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_needs_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_needs_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'if' otherlv_25= ':' ( (lv_if_26_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_27= 'environment' otherlv_28= ':' ( (lv_environment_29_0= ruleEnvironment ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'steps' otherlv_31= ':' (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_steps_33_0= ruleStep ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'permissions' otherlv_36= ':' ( (lv_permissions_37_0= rulePermissions ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_10 = input.LA(1);

                         
                        int index58_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 6) ) {s = 20;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_10);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_13 = input.LA(1);

                         
                        int index58_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_19 = input.LA(1);

                         
                        int index58_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_19);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA58_11 = input.LA(1);

                         
                        int index58_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_11);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA58_12 = input.LA(1);

                         
                        int index58_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA58_0 = input.LA(1);

                         
                        int index58_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA58_0==EOF||(LA58_0>=RULE_END_BLOCK && LA58_0<=RULE_INT)||(LA58_0>=17 && LA58_0<=19)||(LA58_0>=21 && LA58_0<=25)) ) {s = 1;}

                        else if ( (LA58_0==15) ) {s = 2;}

                        else if ( (LA58_0==20) ) {s = 3;}

                        else if ( LA58_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 1) ) {s = 4;}

                        else if ( LA58_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 2) ) {s = 5;}

                        else if ( LA58_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 3) ) {s = 6;}

                        else if ( LA58_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 4) ) {s = 7;}

                        else if ( LA58_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 5) ) {s = 8;}

                         
                        input.seek(index58_0);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA58_14 = input.LA(1);

                         
                        int index58_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_14);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA58_18 = input.LA(1);

                         
                        int index58_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA58_15 = input.LA(1);

                         
                        int index58_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA58_16 = input.LA(1);

                         
                        int index58_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_16);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA58_17 = input.LA(1);

                         
                        int index58_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getJobAccess().getUnorderedGroup_3(), 0) ) {s = 21;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_17);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_29s = "\111\uffff";
    static final String dfa_30s = "\1\1\110\uffff";
    static final String dfa_31s = "\1\5\1\uffff\3\20\6\uffff\1\6\1\4\1\6\11\0\1\10\33\20\11\0\1\uffff\1\6\1\uffff\11\0\1\uffff";
    static final String dfa_32s = "\1\74\1\uffff\3\20\6\uffff\1\31\1\63\1\31\11\0\1\63\33\20\11\0\1\uffff\1\31\1\uffff\11\0\1\uffff";
    static final String dfa_33s = "\1\uffff\1\12\3\uffff\1\2\1\3\1\4\1\6\1\7\1\10\61\uffff\1\1\1\uffff\1\5\11\uffff\1\11";
    static final String dfa_34s = "\1\1\15\uffff\1\20\1\2\1\32\1\4\1\11\1\27\1\6\1\30\1\0\34\uffff\1\5\1\10\1\15\1\23\1\24\1\33\1\7\1\21\1\26\3\uffff\1\22\1\31\1\12\1\16\1\14\1\25\1\3\1\13\1\17\1\uffff}>";
    static final String[] dfa_35s = {
            "\6\1\4\uffff\1\2\1\uffff\4\1\1\3\5\1\12\uffff\3\1\1\6\1\7\1\12\1\11\7\uffff\1\4\6\uffff\1\1\1\5\1\10",
            "",
            "\1\13",
            "\1\14",
            "\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\17\1\22\1\23\1\24\13\uffff\1\25\1\26\1\20\1\21",
            "\1\27\3\uffff\1\31\1\30\1\32\4\uffff\1\33\1\uffff\1\34\1\uffff\1\35\1\36\1\37\13\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62",
            "\1\63\1\64\1\67\1\70\1\71\13\uffff\1\72\1\73\1\65\1\66",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\31\1\30\1\32\4\uffff\1\33\1\uffff\1\34\1\uffff\1\35\1\36\1\37\13\uffff\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
            "\1\75",
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
            "\1\77\1\100\1\103\1\104\1\105\13\uffff\1\106\1\107\1\101\1\102",
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
            return "()* loopback of 2778:6: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'id' otherlv_8= ':' ( (lv_id_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'uses' otherlv_11= ':' ( (lv_uses_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'run' otherlv_14= ':' ( (lv_run_15_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'if' otherlv_17= ':' ( (lv_if_18_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'working-directory' otherlv_20= ':' ( (lv_workingDirectory_21_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'shell' otherlv_23= ':' ( (lv_shell_24_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'with' otherlv_26= ':' ( (this_BEG_BLOCK_27= RULE_BEG_BLOCK )? ( (lv_with_28_0= ruleKeyValuePair ) )+ (this_END_BLOCK_29= RULE_END_BLOCK )? ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_30= 'env' otherlv_31= ':' ( (this_BEG_BLOCK_32= RULE_BEG_BLOCK )? ( (lv_env_33_0= ruleKeyValuePair ) )+ (this_END_BLOCK_34= RULE_END_BLOCK )? ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA67_22 = input.LA(1);

                         
                        int index67_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_22);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA67_0 = input.LA(1);

                         
                        int index67_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA67_0==EOF||(LA67_0>=RULE_END_BLOCK && LA67_0<=RULE_INT)||(LA67_0>=17 && LA67_0<=20)||(LA67_0>=22 && LA67_0<=26)||(LA67_0>=37 && LA67_0<=39)||LA67_0==58) ) {s = 1;}

                        else if ( (LA67_0==15) ) {s = 2;}

                        else if ( (LA67_0==21) ) {s = 3;}

                        else if ( (LA67_0==51) ) {s = 4;}

                        else if ( LA67_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {s = 5;}

                        else if ( LA67_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {s = 6;}

                        else if ( LA67_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {s = 7;}

                        else if ( LA67_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 5) ) {s = 8;}

                        else if ( LA67_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 6) ) {s = 9;}

                        else if ( LA67_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 7) ) {s = 10;}

                         
                        input.seek(index67_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA67_15 = input.LA(1);

                         
                        int index67_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA67_69 = input.LA(1);

                         
                        int index67_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_69);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA67_17 = input.LA(1);

                         
                        int index67_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_17);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA67_51 = input.LA(1);

                         
                        int index67_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_51);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA67_20 = input.LA(1);

                         
                        int index67_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_20);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA67_57 = input.LA(1);

                         
                        int index67_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_57);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA67_52 = input.LA(1);

                         
                        int index67_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_52);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA67_18 = input.LA(1);

                         
                        int index67_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_18);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA67_65 = input.LA(1);

                         
                        int index67_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_65);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA67_70 = input.LA(1);

                         
                        int index67_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_70);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA67_67 = input.LA(1);

                         
                        int index67_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_67);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA67_53 = input.LA(1);

                         
                        int index67_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_53);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA67_66 = input.LA(1);

                         
                        int index67_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_66);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA67_71 = input.LA(1);

                         
                        int index67_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_71);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA67_14 = input.LA(1);

                         
                        int index67_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_14);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA67_58 = input.LA(1);

                         
                        int index67_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_58);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA67_63 = input.LA(1);

                         
                        int index67_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_63);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA67_54 = input.LA(1);

                         
                        int index67_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_54);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA67_55 = input.LA(1);

                         
                        int index67_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_55);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA67_68 = input.LA(1);

                         
                        int index67_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_68);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA67_59 = input.LA(1);

                         
                        int index67_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_59);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA67_19 = input.LA(1);

                         
                        int index67_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_19);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA67_21 = input.LA(1);

                         
                        int index67_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_21);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA67_64 = input.LA(1);

                         
                        int index67_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 8) ) {s = 72;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_64);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA67_16 = input.LA(1);

                         
                        int index67_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {s = 60;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_16);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA67_56 = input.LA(1);

                         
                        int index67_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 4) ) {s = 62;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index67_56);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 67, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_36s = "\u0097\uffff";
    static final String dfa_37s = "\1\1\23\uffff\1\1\1\uffff\1\1\1\uffff\1\1\21\uffff\2\160\17\176\66\uffff\4\176\5\uffff\4\176\1\uffff\5\176\1\1\2\uffff\6\u0096\12\uffff";
    static final String dfa_38s = "\1\5\1\uffff\20\20\1\uffff\1\6\5\4\1\6\1\4\1\6\1\4\3\6\1\4\11\uffff\2\5\2\4\15\5\66\uffff\4\5\5\uffff\1\4\3\5\1\uffff\5\5\1\4\2\6\6\5\12\uffff";
    static final String dfa_39s = "\1\74\1\uffff\20\20\1\uffff\1\31\1\65\1\31\1\72\1\63\1\72\1\31\1\33\1\31\1\32\3\31\1\63\11\uffff\21\74\66\uffff\4\74\5\uffff\4\74\1\uffff\5\74\1\72\2\31\6\74\12\uffff";
    static final String dfa_40s = "\1\uffff\1\2\20\uffff\1\1\16\uffff\11\1\21\uffff\66\1\4\uffff\5\1\4\uffff\1\1\16\uffff\12\1";
    static final String dfa_41s = "\u0097\uffff}>";
    static final String[] dfa_42s = {
            "\3\1\1\7\1\10\1\11\4\uffff\1\2\1\uffff\1\3\1\1\1\4\1\5\1\6\5\1\6\uffff\4\22\1\12\1\13\1\15\1\16\1\17\1\21\1\20\7\22\1\14\6\uffff\3\1",
            "",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\30",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "",
            "\1\41\1\42\1\45\1\46\1\47\13\uffff\1\50\1\51\1\43\1\44",
            "\2\1\5\51\4\uffff\1\1\1\uffff\5\1\4\51\7\uffff\2\1\21\uffff\2\1",
            "\1\1\1\uffff\1\52\1\53\1\56\1\57\1\60\13\uffff\1\61\1\62\1\54\1\55",
            "\2\1\1\52\1\53\1\56\1\57\1\60\4\uffff\1\1\1\uffff\5\1\1\61\1\62\1\54\1\55\13\uffff\3\1\4\uffff\5\1\1\uffff\2\1\6\uffff\1\1",
            "\1\1\1\uffff\2\51\1\63\1\64\1\65\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\51\7\uffff\23\1",
            "\2\1\1\52\1\53\1\66\1\67\1\70\4\uffff\1\1\1\uffff\5\1\1\71\1\72\1\54\1\55\13\uffff\3\1\13\uffff\1\1\6\uffff\1\1",
            "\1\73\1\74\1\77\1\100\1\101\13\uffff\1\102\1\103\1\75\1\76",
            "\1\1\1\uffff\1\104\1\105\1\110\1\111\1\112\13\uffff\1\113\1\114\1\106\1\107\1\uffff\1\1",
            "\1\115\1\116\1\121\1\122\1\123\13\uffff\1\124\1\125\1\117\1\120",
            "\1\1\1\uffff\5\125\13\uffff\4\125\1\1",
            "\1\126\1\127\1\132\1\133\1\134\13\uffff\1\135\1\136\1\130\1\131",
            "\1\137\1\140\1\143\1\144\1\145\13\uffff\1\146\1\147\1\141\1\142",
            "\1\150\1\151\1\154\1\155\1\156\13\uffff\1\157\1\160\1\152\1\153",
            "\1\1\1\uffff\2\160\1\161\1\162\1\163\4\uffff\1\1\1\uffff\1\1\1\uffff\3\1\4\160\7\uffff\23\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\160\4\uffff\1\160\1\1\12\160\6\uffff\1\22\22\160\6\uffff\3\160",
            "\6\160\4\uffff\1\160\1\1\12\160\6\uffff\1\22\22\160\6\uffff\3\160",
            "\1\164\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\1\164\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0085\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0085\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0085\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0084\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
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
            "\6\176\4\uffff\1\176\1\u0086\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0086\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\u0086\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "",
            "",
            "",
            "",
            "",
            "\1\176\1\u0087\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\1\u0083\1\171\1\166\1\165\1\167\1\170\1\u0082\3\uffff\13\176\1\172\1\173\1\174\1\175\1\177\1\u0080\1\u0081\1\22\22\176\6\uffff\3\176",
            "\6\176\4\uffff\1\176\1\1\12\176\6\uffff\1\22\22\176\6\uffff\3\176",
            "\4\1\1\u0088\1\u0089\1\u008a\4\uffff\1\1\1\uffff\5\1\1\u008b\1\u008c\2\1\13\uffff\3\1\13\uffff\1\1\6\uffff\1\1",
            "\2\1\1\u008d\1\u008e\1\u008f\13\uffff\1\u0090\1\u0091\2\1",
            "\2\1\1\u0092\1\u0093\1\u0094\13\uffff\1\u0095\1\u0096\2\1",
            "\6\u0096\4\uffff\1\u0096\1\1\12\u0096\6\uffff\1\22\22\u0096\6\uffff\3\u0096",
            "\6\u0096\4\uffff\1\u0096\1\u0084\12\u0096\6\uffff\1\22\22\u0096\6\uffff\3\u0096",
            "\6\u0096\4\uffff\1\u0096\1\u0084\12\u0096\6\uffff\1\22\22\u0096\6\uffff\3\u0096",
            "\6\u0096\4\uffff\1\u0096\1\u0084\12\u0096\6\uffff\1\22\22\u0096\6\uffff\3\u0096",
            "\6\u0096\4\uffff\1\u0096\1\u0084\12\u0096\6\uffff\1\22\22\u0096\6\uffff\3\u0096",
            "\6\u0096\4\uffff\1\u0096\1\u0084\12\u0096\6\uffff\1\22\22\u0096\6\uffff\3\u0096",
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

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()+ loopback of 3065:10: ( (lv_with_28_0= ruleKeyValuePair ) )+";
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_36;
            this.eof = dfa_37;
            this.min = dfa_38;
            this.max = dfa_39;
            this.accept = dfa_40;
            this.special = dfa_41;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "()+ loopback of 3117:10: ( (lv_env_33_0= ruleKeyValuePair ) )+";
        }
    }
>>>>>>> Stashed changes
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
<<<<<<< Updated upstream
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C03C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000034002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000C03E0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C0382L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000300020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000030C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000030C00020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000C0000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000700004020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000007F000004020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040000L});
=======
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003C007C0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000003E8002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00300006003E8030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x01800000003E8030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000003C007D0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003FE87F2L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0005F000003E8030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000FFFFE003A8710L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000FFFFE003E8732L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000C00700L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000001FC010FF2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000001FC010FE2L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0030000600000022L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0030000604000032L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0030000603C007E2L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000800000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0180000000000022L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0200000000008022L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0005F00000000022L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x040800E000108032L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x040800E000108022L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000BC007D0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x060800E000108030L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x040800E004108032L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x040DF0E000108030L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x18080F0000208032L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x18080F0000208022L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x180FFFFE003A8732L});
>>>>>>> Stashed changes

}

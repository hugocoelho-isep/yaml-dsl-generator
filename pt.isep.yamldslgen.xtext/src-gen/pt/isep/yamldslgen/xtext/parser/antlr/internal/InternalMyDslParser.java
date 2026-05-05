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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PLAIN_SCALAR", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'name'", "':'", "'on'", "'jobs'", "'true'", "'false'", "'push'", "'pull_request'", "'runs-on'", "'needs'", "'-'", "'['", "','", "']'", "'steps'", "'permissions'", "'branches'", "'tags'", "'uses'", "'run'", "'with'", "'contents'", "'java-version'", "'distribution'", "'path'", "'target'", "'token'", "'files'", "'generate_release_notes'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_BEG_BLOCK=4;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
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
    // $ANTLR end "rulePlainScalar"


    // $ANTLR start "entryRuleOn"
    // InternalMyDsl.g:348:1: entryRuleOn returns [EObject current=null] : iv_ruleOn= ruleOn EOF ;
    public final EObject entryRuleOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOn = null;


        try {
            // InternalMyDsl.g:348:43: (iv_ruleOn= ruleOn EOF )
            // InternalMyDsl.g:349:2: iv_ruleOn= ruleOn EOF
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
    // InternalMyDsl.g:355:1: ruleOn returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:361:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK ) )
            // InternalMyDsl.g:362:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:362:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK )
            // InternalMyDsl.g:363:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_9= RULE_END_BLOCK
            {
            // InternalMyDsl.g:363:3: ()
            // InternalMyDsl.g:364:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOnAccess().getOnAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_9); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getOnAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:374:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:375:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:375:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:376:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:379:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )* )
            // InternalMyDsl.g:380:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:380:6: ( ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( LA6_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
                    alt6=1;
                }
                else if ( LA6_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:381:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:381:4: ({...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) ) )
            	    // InternalMyDsl.g:382:5: {...}? => ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:382:99: ( ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) ) )
            	    // InternalMyDsl.g:383:6: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:386:9: ({...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) ) )
            	    // InternalMyDsl.g:386:10: {...}? => (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:386:19: (otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) ) )
            	    // InternalMyDsl.g:386:20: otherlv_3= 'push' otherlv_4= ':' ( (lv_push_5_0= rulePush ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getOnAccess().getPushKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_4, grammarAccess.getOnAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:394:9: ( (lv_push_5_0= rulePush ) )
            	    // InternalMyDsl.g:395:10: (lv_push_5_0= rulePush )
            	    {
            	    // InternalMyDsl.g:395:10: (lv_push_5_0= rulePush )
            	    // InternalMyDsl.g:396:11: lv_push_5_0= rulePush
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
            	    // InternalMyDsl.g:419:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:419:4: ({...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) ) )
            	    // InternalMyDsl.g:420:5: {...}? => ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "getUnorderedGroupHelper().canSelect(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:420:99: ( ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) ) )
            	    // InternalMyDsl.g:421:6: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getOnAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:424:9: ({...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) ) )
            	    // InternalMyDsl.g:424:10: {...}? => (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleOn", "true");
            	    }
            	    // InternalMyDsl.g:424:19: (otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) ) )
            	    // InternalMyDsl.g:424:20: otherlv_6= 'pull_request' otherlv_7= ':' ( (lv_pullRequest_8_0= rulePull_request ) )
            	    {
            	    otherlv_6=(Token)match(input,21,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getOnAccess().getPull_requestKeyword_2_1_0());
            	    								
            	    otherlv_7=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_7, grammarAccess.getOnAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:432:9: ( (lv_pullRequest_8_0= rulePull_request ) )
            	    // InternalMyDsl.g:433:10: (lv_pullRequest_8_0= rulePull_request )
            	    {
            	    // InternalMyDsl.g:433:10: (lv_pullRequest_8_0= rulePull_request )
            	    // InternalMyDsl.g:434:11: lv_pullRequest_8_0= rulePull_request
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

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getOnAccess().getUnorderedGroup_2());
            				

            }

            this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

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
    // InternalMyDsl.g:778:1: entryRulePush returns [EObject current=null] : iv_rulePush= rulePush EOF ;
    public final EObject entryRulePush() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePush = null;


        try {
            // InternalMyDsl.g:778:45: (iv_rulePush= rulePush EOF )
            // InternalMyDsl.g:779:2: iv_rulePush= rulePush EOF
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
    // InternalMyDsl.g:785:1: rulePush returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:791:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK ) )
            // InternalMyDsl.g:792:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:792:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK )
            // InternalMyDsl.g:793:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_29= RULE_END_BLOCK
            {
            // InternalMyDsl.g:793:3: ()
            // InternalMyDsl.g:794:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPushAccess().getPushAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_17); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalMyDsl.g:804:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:805:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:805:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:806:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getPushAccess().getUnorderedGroup_2());
            				
            // InternalMyDsl.g:809:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )* )
            // InternalMyDsl.g:810:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            {
            // InternalMyDsl.g:810:6: ( ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) ) )*
            loop18:
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
            	    // InternalMyDsl.g:811:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:811:4: ({...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:812:5: {...}? => ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMyDsl.g:812:101: ( ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) ) )
            	    // InternalMyDsl.g:813:6: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMyDsl.g:816:9: ({...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) ) )
            	    // InternalMyDsl.g:816:10: {...}? => (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:816:19: (otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) ) )
            	    // InternalMyDsl.g:816:20: otherlv_3= 'branches' otherlv_4= ':' ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getPushAccess().getBranchesKeyword_2_0_0());
            	    								
            	    otherlv_4=(Token)match(input,15,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getPushAccess().getColonKeyword_2_0_1());
            	    								
            	    // InternalMyDsl.g:824:9: ( (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

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
            	            // InternalMyDsl.g:825:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:825:10: (this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	            // InternalMyDsl.g:826:11: this_BEG_BLOCK_5= RULE_BEG_BLOCK (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+ this_END_BLOCK_10= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_5=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_13); 

            	            											newLeafNode(this_BEG_BLOCK_5, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            										
            	            // InternalMyDsl.g:830:11: (otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK )+
            	            int cnt12=0;
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==24) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:831:12: otherlv_6= '-' this_BEG_BLOCK_7= RULE_BEG_BLOCK ( (lv_branches_8_0= ruleEString ) ) this_END_BLOCK_9= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_6=(Token)match(input,24,FOLLOW_6); 

            	            	    												newLeafNode(otherlv_6, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_7=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_7, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:839:12: ( (lv_branches_8_0= ruleEString ) )
            	            	    // InternalMyDsl.g:840:13: (lv_branches_8_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:840:13: (lv_branches_8_0= ruleEString )
            	            	    // InternalMyDsl.g:841:14: lv_branches_8_0= ruleEString
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
            	            // InternalMyDsl.g:869:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            {
            	            // InternalMyDsl.g:869:10: (otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']' )
            	            // InternalMyDsl.g:870:11: otherlv_11= '[' ( (lv_branches_12_0= ruleEString ) ) (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )* otherlv_15= ']'
            	            {
            	            otherlv_11=(Token)match(input,25,FOLLOW_4); 

            	            											newLeafNode(otherlv_11, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            										
            	            // InternalMyDsl.g:874:11: ( (lv_branches_12_0= ruleEString ) )
            	            // InternalMyDsl.g:875:12: (lv_branches_12_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:875:12: (lv_branches_12_0= ruleEString )
            	            // InternalMyDsl.g:876:13: lv_branches_12_0= ruleEString
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

            	            // InternalMyDsl.g:893:11: (otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) ) )*
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==26) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:894:12: otherlv_13= ',' ( (lv_branches_14_0= ruleEString ) )
            	            	    {
            	            	    otherlv_13=(Token)match(input,26,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_13, grammarAccess.getPushAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:898:12: ( (lv_branches_14_0= ruleEString ) )
            	            	    // InternalMyDsl.g:899:13: (lv_branches_14_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:899:13: (lv_branches_14_0= ruleEString )
            	            	    // InternalMyDsl.g:900:14: lv_branches_14_0= ruleEString
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
            	    // InternalMyDsl.g:930:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:930:4: ({...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) ) )
            	    // InternalMyDsl.g:931:5: {...}? => ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "rulePush", "getUnorderedGroupHelper().canSelect(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMyDsl.g:931:101: ( ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) ) )
            	    // InternalMyDsl.g:932:6: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getPushAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMyDsl.g:935:9: ({...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) ) )
            	    // InternalMyDsl.g:935:10: {...}? => (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "rulePush", "true");
            	    }
            	    // InternalMyDsl.g:935:19: (otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) ) )
            	    // InternalMyDsl.g:935:20: otherlv_16= 'tags' otherlv_17= ':' ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    {
            	    otherlv_16=(Token)match(input,31,FOLLOW_3); 

            	    									newLeafNode(otherlv_16, grammarAccess.getPushAccess().getTagsKeyword_2_1_0());
            	    								
            	    otherlv_17=(Token)match(input,15,FOLLOW_12); 

            	    									newLeafNode(otherlv_17, grammarAccess.getPushAccess().getColonKeyword_2_1_1());
            	    								
            	    // InternalMyDsl.g:943:9: ( (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK ) | (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

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
            	            // InternalMyDsl.g:944:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            {
            	            // InternalMyDsl.g:944:10: (this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	            // InternalMyDsl.g:945:11: this_BEG_BLOCK_18= RULE_BEG_BLOCK (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+ this_END_BLOCK_23= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_18=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_13); 

            	            											newLeafNode(this_BEG_BLOCK_18, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_0());
            	            										
            	            // InternalMyDsl.g:949:11: (otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK )+
            	            int cnt15=0;
            	            loop15:
            	            do {
            	                int alt15=2;
            	                int LA15_0 = input.LA(1);

            	                if ( (LA15_0==24) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:950:12: otherlv_19= '-' this_BEG_BLOCK_20= RULE_BEG_BLOCK ( (lv_tags_21_0= ruleEString ) ) this_END_BLOCK_22= RULE_END_BLOCK
            	            	    {
            	            	    otherlv_19=(Token)match(input,24,FOLLOW_6); 

            	            	    												newLeafNode(otherlv_19, grammarAccess.getPushAccess().getHyphenMinusKeyword_2_1_2_0_1_0());
            	            	    											
            	            	    this_BEG_BLOCK_20=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	    												newLeafNode(this_BEG_BLOCK_20, grammarAccess.getPushAccess().getBEG_BLOCKTerminalRuleCall_2_1_2_0_1_1());
            	            	    											
            	            	    // InternalMyDsl.g:958:12: ( (lv_tags_21_0= ruleEString ) )
            	            	    // InternalMyDsl.g:959:13: (lv_tags_21_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:959:13: (lv_tags_21_0= ruleEString )
            	            	    // InternalMyDsl.g:960:14: lv_tags_21_0= ruleEString
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
            	            // InternalMyDsl.g:988:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            {
            	            // InternalMyDsl.g:988:10: (otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']' )
            	            // InternalMyDsl.g:989:11: otherlv_24= '[' ( (lv_tags_25_0= ruleEString ) ) (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )* otherlv_28= ']'
            	            {
            	            otherlv_24=(Token)match(input,25,FOLLOW_4); 

            	            											newLeafNode(otherlv_24, grammarAccess.getPushAccess().getLeftSquareBracketKeyword_2_1_2_1_0());
            	            										
            	            // InternalMyDsl.g:993:11: ( (lv_tags_25_0= ruleEString ) )
            	            // InternalMyDsl.g:994:12: (lv_tags_25_0= ruleEString )
            	            {
            	            // InternalMyDsl.g:994:12: (lv_tags_25_0= ruleEString )
            	            // InternalMyDsl.g:995:13: lv_tags_25_0= ruleEString
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

            	            // InternalMyDsl.g:1012:11: (otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) ) )*
            	            loop16:
            	            do {
            	                int alt16=2;
            	                int LA16_0 = input.LA(1);

            	                if ( (LA16_0==26) ) {
            	                    alt16=1;
            	                }


            	                switch (alt16) {
            	            	case 1 :
            	            	    // InternalMyDsl.g:1013:12: otherlv_26= ',' ( (lv_tags_27_0= ruleEString ) )
            	            	    {
            	            	    otherlv_26=(Token)match(input,26,FOLLOW_4); 

            	            	    												newLeafNode(otherlv_26, grammarAccess.getPushAccess().getCommaKeyword_2_1_2_1_2_0());
            	            	    											
            	            	    // InternalMyDsl.g:1017:12: ( (lv_tags_27_0= ruleEString ) )
            	            	    // InternalMyDsl.g:1018:13: (lv_tags_27_0= ruleEString )
            	            	    {
            	            	    // InternalMyDsl.g:1018:13: (lv_tags_27_0= ruleEString )
            	            	    // InternalMyDsl.g:1019:14: lv_tags_27_0= ruleEString
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
    // InternalMyDsl.g:1064:1: entryRulePull_request returns [EObject current=null] : iv_rulePull_request= rulePull_request EOF ;
    public final EObject entryRulePull_request() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePull_request = null;


        try {
            // InternalMyDsl.g:1064:53: (iv_rulePull_request= rulePull_request EOF )
            // InternalMyDsl.g:1065:2: iv_rulePull_request= rulePull_request EOF
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
    // InternalMyDsl.g:1071:1: rulePull_request returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1077:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1078:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1078:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK )
            // InternalMyDsl.g:1079:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'branches' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' this_BEG_BLOCK_6= RULE_BEG_BLOCK ( (lv_branches_7_0= ruleEString ) ) this_END_BLOCK_8= RULE_END_BLOCK )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_branches_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_branches_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) this_END_BLOCK_15= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1079:3: ()
            // InternalMyDsl.g:1080:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPull_requestAccess().getPull_requestAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_18); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getPull_requestAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
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


    // $ANTLR start "entryRuleStep"
    // InternalMyDsl.g:1206:1: entryRuleStep returns [EObject current=null] : iv_ruleStep= ruleStep EOF ;
    public final EObject entryRuleStep() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStep = null;


        try {
            // InternalMyDsl.g:1206:45: (iv_ruleStep= ruleStep EOF )
            // InternalMyDsl.g:1207:2: iv_ruleStep= ruleStep EOF
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
    // InternalMyDsl.g:1213:1: ruleStep returns [EObject current=null] : ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK ) ;
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
            // InternalMyDsl.g:1219:2: ( ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK ) )
            // InternalMyDsl.g:1220:2: ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK )
            {
            // InternalMyDsl.g:1220:2: ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK )
            // InternalMyDsl.g:1221:3: () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) ) this_END_BLOCK_16= RULE_END_BLOCK
            {
            // InternalMyDsl.g:1221:3: ()
            // InternalMyDsl.g:1222:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStepAccess().getStepAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getStepAccess().getHyphenMinusKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getStepAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalMyDsl.g:1236:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) ) )
            // InternalMyDsl.g:1237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) )
            {
            // InternalMyDsl.g:1237:4: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* ) )
            // InternalMyDsl.g:1238:5: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				
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
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMyDsl.g:1244:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1245:6: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMyDsl.g:1248:9: ({...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1248:10: {...}? => (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:1248:19: (otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1248:20: otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) )
            	    {
            	    otherlv_4=(Token)match(input,14,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getStepAccess().getNameKeyword_3_0_0());
            	    								
            	    otherlv_5=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_5, grammarAccess.getStepAccess().getColonKeyword_3_0_1());
            	    								
            	    // InternalMyDsl.g:1256:9: ( (lv_name_6_0= ruleEString ) )
            	    // InternalMyDsl.g:1257:10: (lv_name_6_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1257:10: (lv_name_6_0= ruleEString )
            	    // InternalMyDsl.g:1258:11: lv_name_6_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getNameEStringParserRuleCall_3_0_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
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
            	    // InternalMyDsl.g:1281:4: ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1281:4: ({...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1282:5: {...}? => ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMyDsl.g:1282:101: ( ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1283:6: ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMyDsl.g:1286:9: ({...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1286:10: {...}? => (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:1286:19: (otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1286:20: otherlv_7= 'uses' otherlv_8= ':' ( (lv_uses_9_0= ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_7, grammarAccess.getStepAccess().getUsesKeyword_3_1_0());
            	    								
            	    otherlv_8=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_8, grammarAccess.getStepAccess().getColonKeyword_3_1_1());
            	    								
            	    // InternalMyDsl.g:1294:9: ( (lv_uses_9_0= ruleEString ) )
            	    // InternalMyDsl.g:1295:10: (lv_uses_9_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1295:10: (lv_uses_9_0= ruleEString )
            	    // InternalMyDsl.g:1296:11: lv_uses_9_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getUsesEStringParserRuleCall_3_1_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_uses_9_0=ruleEString();

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
            	    // InternalMyDsl.g:1319:4: ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1319:4: ({...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) ) )
            	    // InternalMyDsl.g:1320:5: {...}? => ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMyDsl.g:1320:101: ( ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) ) )
            	    // InternalMyDsl.g:1321:6: ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMyDsl.g:1324:9: ({...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) ) )
            	    // InternalMyDsl.g:1324:10: {...}? => (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:1324:19: (otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) ) )
            	    // InternalMyDsl.g:1324:20: otherlv_10= 'run' otherlv_11= ':' ( (lv_run_12_0= ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getStepAccess().getRunKeyword_3_2_0());
            	    								
            	    otherlv_11=(Token)match(input,15,FOLLOW_4); 

            	    									newLeafNode(otherlv_11, grammarAccess.getStepAccess().getColonKeyword_3_2_1());
            	    								
            	    // InternalMyDsl.g:1332:9: ( (lv_run_12_0= ruleEString ) )
            	    // InternalMyDsl.g:1333:10: (lv_run_12_0= ruleEString )
            	    {
            	    // InternalMyDsl.g:1333:10: (lv_run_12_0= ruleEString )
            	    // InternalMyDsl.g:1334:11: lv_run_12_0= ruleEString
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getRunEStringParserRuleCall_3_2_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_run_12_0=ruleEString();

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
            	    // InternalMyDsl.g:1357:4: ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) )
            	    {
            	    // InternalMyDsl.g:1357:4: ({...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) ) )
            	    // InternalMyDsl.g:1358:5: {...}? => ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "getUnorderedGroupHelper().canSelect(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMyDsl.g:1358:101: ( ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) ) )
            	    // InternalMyDsl.g:1359:6: ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getStepAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMyDsl.g:1362:9: ({...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) ) )
            	    // InternalMyDsl.g:1362:10: {...}? => (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStep", "true");
            	    }
            	    // InternalMyDsl.g:1362:19: (otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) ) )
            	    // InternalMyDsl.g:1362:20: otherlv_13= 'with' otherlv_14= ':' ( (lv_with_15_0= ruleWith ) )
            	    {
            	    otherlv_13=(Token)match(input,34,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getStepAccess().getWithKeyword_3_3_0());
            	    								
            	    otherlv_14=(Token)match(input,15,FOLLOW_6); 

            	    									newLeafNode(otherlv_14, grammarAccess.getStepAccess().getColonKeyword_3_3_1());
            	    								
            	    // InternalMyDsl.g:1370:9: ( (lv_with_15_0= ruleWith ) )
            	    // InternalMyDsl.g:1371:10: (lv_with_15_0= ruleWith )
            	    {
            	    // InternalMyDsl.g:1371:10: (lv_with_15_0= ruleWith )
            	    // InternalMyDsl.g:1372:11: lv_with_15_0= ruleWith
            	    {

            	    											newCompositeNode(grammarAccess.getStepAccess().getWithWithParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
            	    lv_with_15_0=ruleWith();

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

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getStepAccess().getUnorderedGroup_3());
            				

            }

            this_END_BLOCK_16=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

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


    // $ANTLR start "entryRulePermissions"
    // InternalMyDsl.g:1410:1: entryRulePermissions returns [EObject current=null] : iv_rulePermissions= rulePermissions EOF ;
    public final EObject entryRulePermissions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissions = null;


        try {
            // InternalMyDsl.g:1410:52: (iv_rulePermissions= rulePermissions EOF )
            // InternalMyDsl.g:1411:2: iv_rulePermissions= rulePermissions EOF
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
    // InternalMyDsl.g:1417:1: rulePermissions returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK otherlv_2= 'contents' otherlv_3= ':' ( (lv_contents_4_0= ruleEString ) ) this_END_BLOCK_5= RULE_END_BLOCK ) ;
    public final EObject rulePermissions() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_END_BLOCK_5=null;
        AntlrDatatypeRuleToken lv_contents_4_0 = null;



        	enterRule();

        try {
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


            }

            this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_5, grammarAccess.getPermissionsAccess().getEND_BLOCKTerminalRuleCall_5());
            		

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


    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\5\11\uffff";
    static final String dfa_3s = "\1\52\11\uffff";
    static final String dfa_4s = "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_5s = "\1\0\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\10\uffff\1\2\25\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11",
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
            return "()* loopback of 1503:6: ( ({...}? => ( ({...}? => (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'java-version' otherlv_7= ':' ( (lv_javaVersion_8_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'distribution' otherlv_10= ':' ( (lv_distribution_11_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'path' otherlv_13= ':' ( (lv_path_14_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'target' otherlv_16= ':' ( (lv_target_17_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'token' otherlv_19= ':' ( (lv_token_20_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= 'files' otherlv_22= ':' ( (lv_files_23_0= ruleEString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'generate_release_notes' otherlv_25= ':' ( (lv_generateReleaseNotes_26_0= 'true' ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                         
                        int index23_0 = input.index();
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

                         
                        input.seek(index23_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
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

}

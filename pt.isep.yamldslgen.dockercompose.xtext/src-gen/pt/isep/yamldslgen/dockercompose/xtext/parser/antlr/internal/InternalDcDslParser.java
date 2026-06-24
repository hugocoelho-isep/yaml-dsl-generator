package pt.isep.yamldslgen.dockercompose.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.yamldslgen.dockercompose.xtext.services.DcDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDcDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BEG_BLOCK", "RULE_END_BLOCK", "RULE_STRING", "RULE_SQ_STRING", "RULE_YAML_SCALAR", "RULE_GH_EXPRESSION", "RULE_ID", "RULE_INT", "RULE_ANY_OTHER", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_WS", "'version'", "':'", "'name'", "'services'", "'networks'", "'volumes'", "'secrets'", "'true'", "'false'", "'>'", "'|'", "'>-'", "'>+'", "'|-'", "'|+'", "'-'", "'['", "']'", "';'", "','", "'{'", "'}'", "'image'", "'build'", "'container_name'", "'restart'", "'user'", "'hostname'", "'network_mode'", "'platform'", "'runtime'", "'stop_signal'", "'stdin_open'", "'ports'", "'expose'", "'command'", "'cap_add'", "'labels'", "'sysctls'", "'environment'", "'depends_on'", "'healthcheck'", "'deploy'", "'context'", "'dockerfile'", "'target'", "'args'", "'driver'", "'ipv4_address'", "'ipam'", "'subnet'", "'condition'", "'type'", "'source'", "'read_only'", "'test'", "'interval'", "'timeout'", "'retries'", "'start_period'", "'memory'", "'file'"
    };
    public static final int T__50=50;
    public static final int RULE_BEG_BLOCK=4;
    public static final int T__19=19;
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
    public static final int RULE_ID=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
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
    public static final int RULE_GH_EXPRESSION=9;
    public static final int T__72=72;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
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
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_SQ_STRING=7;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalDcDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDcDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDcDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDcDsl.g"; }



     	private DcDslGrammarAccess grammarAccess;

        public InternalDcDslParser(TokenStream input, DcDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DockerCompose";
       	}

       	@Override
       	protected DcDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDockerCompose"
    // InternalDcDsl.g:64:1: entryRuleDockerCompose returns [EObject current=null] : iv_ruleDockerCompose= ruleDockerCompose EOF ;
    public final EObject entryRuleDockerCompose() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDockerCompose = null;


        try {
            // InternalDcDsl.g:64:54: (iv_ruleDockerCompose= ruleDockerCompose EOF )
            // InternalDcDsl.g:65:2: iv_ruleDockerCompose= ruleDockerCompose EOF
            {
             newCompositeNode(grammarAccess.getDockerComposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDockerCompose=ruleDockerCompose();

            state._fsp--;

             current =iv_ruleDockerCompose; 
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
    // $ANTLR end "entryRuleDockerCompose"


    // $ANTLR start "ruleDockerCompose"
    // InternalDcDsl.g:71:1: ruleDockerCompose returns [EObject current=null] : ( (otherlv_0= 'version' otherlv_1= ':' ( (lv_version_2_0= ruleEString ) ) ) | (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) | (otherlv_6= 'services' otherlv_7= ':' this_BEG_BLOCK_8= RULE_BEG_BLOCK ( (lv_services_9_0= ruleService ) )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= 'networks' otherlv_12= ':' ( (lv_networks_13_0= ruleNetworks ) ) ) | (otherlv_14= 'volumes' otherlv_15= ':' this_BEG_BLOCK_16= RULE_BEG_BLOCK ( (lv_volumes_17_0= ruleNamedVolume ) )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= 'secrets' otherlv_20= ':' this_BEG_BLOCK_21= RULE_BEG_BLOCK ( (lv_secrets_22_0= ruleSecret ) )+ this_END_BLOCK_23= RULE_END_BLOCK ) )* ;
    public final EObject ruleDockerCompose() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_BEG_BLOCK_8=null;
        Token this_END_BLOCK_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token this_BEG_BLOCK_16=null;
        Token this_END_BLOCK_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token this_BEG_BLOCK_21=null;
        Token this_END_BLOCK_23=null;
        AntlrDatatypeRuleToken lv_version_2_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_services_9_0 = null;

        EObject lv_networks_13_0 = null;

        EObject lv_volumes_17_0 = null;

        EObject lv_secrets_22_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:77:2: ( ( (otherlv_0= 'version' otherlv_1= ':' ( (lv_version_2_0= ruleEString ) ) ) | (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) | (otherlv_6= 'services' otherlv_7= ':' this_BEG_BLOCK_8= RULE_BEG_BLOCK ( (lv_services_9_0= ruleService ) )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= 'networks' otherlv_12= ':' ( (lv_networks_13_0= ruleNetworks ) ) ) | (otherlv_14= 'volumes' otherlv_15= ':' this_BEG_BLOCK_16= RULE_BEG_BLOCK ( (lv_volumes_17_0= ruleNamedVolume ) )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= 'secrets' otherlv_20= ':' this_BEG_BLOCK_21= RULE_BEG_BLOCK ( (lv_secrets_22_0= ruleSecret ) )+ this_END_BLOCK_23= RULE_END_BLOCK ) )* )
            // InternalDcDsl.g:78:2: ( (otherlv_0= 'version' otherlv_1= ':' ( (lv_version_2_0= ruleEString ) ) ) | (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) | (otherlv_6= 'services' otherlv_7= ':' this_BEG_BLOCK_8= RULE_BEG_BLOCK ( (lv_services_9_0= ruleService ) )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= 'networks' otherlv_12= ':' ( (lv_networks_13_0= ruleNetworks ) ) ) | (otherlv_14= 'volumes' otherlv_15= ':' this_BEG_BLOCK_16= RULE_BEG_BLOCK ( (lv_volumes_17_0= ruleNamedVolume ) )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= 'secrets' otherlv_20= ':' this_BEG_BLOCK_21= RULE_BEG_BLOCK ( (lv_secrets_22_0= ruleSecret ) )+ this_END_BLOCK_23= RULE_END_BLOCK ) )*
            {
            // InternalDcDsl.g:78:2: ( (otherlv_0= 'version' otherlv_1= ':' ( (lv_version_2_0= ruleEString ) ) ) | (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) ) | (otherlv_6= 'services' otherlv_7= ':' this_BEG_BLOCK_8= RULE_BEG_BLOCK ( (lv_services_9_0= ruleService ) )+ this_END_BLOCK_10= RULE_END_BLOCK ) | (otherlv_11= 'networks' otherlv_12= ':' ( (lv_networks_13_0= ruleNetworks ) ) ) | (otherlv_14= 'volumes' otherlv_15= ':' this_BEG_BLOCK_16= RULE_BEG_BLOCK ( (lv_volumes_17_0= ruleNamedVolume ) )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= 'secrets' otherlv_20= ':' this_BEG_BLOCK_21= RULE_BEG_BLOCK ( (lv_secrets_22_0= ruleSecret ) )+ this_END_BLOCK_23= RULE_END_BLOCK ) )*
            loop4:
            do {
                int alt4=7;
                switch ( input.LA(1) ) {
                case 16:
                    {
                    alt4=1;
                    }
                    break;
                case 18:
                    {
                    alt4=2;
                    }
                    break;
                case 19:
                    {
                    alt4=3;
                    }
                    break;
                case 20:
                    {
                    alt4=4;
                    }
                    break;
                case 21:
                    {
                    alt4=5;
                    }
                    break;
                case 22:
                    {
                    alt4=6;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // InternalDcDsl.g:79:3: (otherlv_0= 'version' otherlv_1= ':' ( (lv_version_2_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:79:3: (otherlv_0= 'version' otherlv_1= ':' ( (lv_version_2_0= ruleEString ) ) )
            	    // InternalDcDsl.g:80:4: otherlv_0= 'version' otherlv_1= ':' ( (lv_version_2_0= ruleEString ) )
            	    {
            	    otherlv_0=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_0, grammarAccess.getDockerComposeAccess().getVersionKeyword_0_0());
            	    			
            	    otherlv_1=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getDockerComposeAccess().getColonKeyword_0_1());
            	    			
            	    // InternalDcDsl.g:88:4: ( (lv_version_2_0= ruleEString ) )
            	    // InternalDcDsl.g:89:5: (lv_version_2_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:89:5: (lv_version_2_0= ruleEString )
            	    // InternalDcDsl.g:90:6: lv_version_2_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getVersionEStringParserRuleCall_0_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_version_2_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"version",
            	    							lv_version_2_0,
            	    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDcDsl.g:109:3: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:109:3: (otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) )
            	    // InternalDcDsl.g:110:4: otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,18,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDockerComposeAccess().getNameKeyword_1_0());
            	    			
            	    otherlv_4=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDockerComposeAccess().getColonKeyword_1_1());
            	    			
            	    // InternalDcDsl.g:118:4: ( (lv_name_5_0= ruleEString ) )
            	    // InternalDcDsl.g:119:5: (lv_name_5_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:119:5: (lv_name_5_0= ruleEString )
            	    // InternalDcDsl.g:120:6: lv_name_5_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getNameEStringParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_name_5_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"name",
            	    							lv_name_5_0,
            	    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDcDsl.g:139:3: (otherlv_6= 'services' otherlv_7= ':' this_BEG_BLOCK_8= RULE_BEG_BLOCK ( (lv_services_9_0= ruleService ) )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:139:3: (otherlv_6= 'services' otherlv_7= ':' this_BEG_BLOCK_8= RULE_BEG_BLOCK ( (lv_services_9_0= ruleService ) )+ this_END_BLOCK_10= RULE_END_BLOCK )
            	    // InternalDcDsl.g:140:4: otherlv_6= 'services' otherlv_7= ':' this_BEG_BLOCK_8= RULE_BEG_BLOCK ( (lv_services_9_0= ruleService ) )+ this_END_BLOCK_10= RULE_END_BLOCK
            	    {
            	    otherlv_6=(Token)match(input,19,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDockerComposeAccess().getServicesKeyword_2_0());
            	    			
            	    otherlv_7=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getDockerComposeAccess().getColonKeyword_2_1());
            	    			
            	    this_BEG_BLOCK_8=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	    				newLeafNode(this_BEG_BLOCK_8, grammarAccess.getDockerComposeAccess().getBEG_BLOCKTerminalRuleCall_2_2());
            	    			
            	    // InternalDcDsl.g:152:4: ( (lv_services_9_0= ruleService ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_INT)||(LA1_0>=23 && LA1_0<=30)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:153:5: (lv_services_9_0= ruleService )
            	    	    {
            	    	    // InternalDcDsl.g:153:5: (lv_services_9_0= ruleService )
            	    	    // InternalDcDsl.g:154:6: lv_services_9_0= ruleService
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getServicesServiceParserRuleCall_2_3_0());
            	    	    					
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_services_9_0=ruleService();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"services",
            	    	    							lv_services_9_0,
            	    	    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Service");
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

            	    this_END_BLOCK_10=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	    				newLeafNode(this_END_BLOCK_10, grammarAccess.getDockerComposeAccess().getEND_BLOCKTerminalRuleCall_2_4());
            	    			

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDcDsl.g:177:3: (otherlv_11= 'networks' otherlv_12= ':' ( (lv_networks_13_0= ruleNetworks ) ) )
            	    {
            	    // InternalDcDsl.g:177:3: (otherlv_11= 'networks' otherlv_12= ':' ( (lv_networks_13_0= ruleNetworks ) ) )
            	    // InternalDcDsl.g:178:4: otherlv_11= 'networks' otherlv_12= ':' ( (lv_networks_13_0= ruleNetworks ) )
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_3); 

            	    				newLeafNode(otherlv_11, grammarAccess.getDockerComposeAccess().getNetworksKeyword_3_0());
            	    			
            	    otherlv_12=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_12, grammarAccess.getDockerComposeAccess().getColonKeyword_3_1());
            	    			
            	    // InternalDcDsl.g:186:4: ( (lv_networks_13_0= ruleNetworks ) )
            	    // InternalDcDsl.g:187:5: (lv_networks_13_0= ruleNetworks )
            	    {
            	    // InternalDcDsl.g:187:5: (lv_networks_13_0= ruleNetworks )
            	    // InternalDcDsl.g:188:6: lv_networks_13_0= ruleNetworks
            	    {

            	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getNetworksNetworksParserRuleCall_3_2_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_networks_13_0=ruleNetworks();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    						}
            	    						set(
            	    							current,
            	    							"networks",
            	    							lv_networks_13_0,
            	    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Networks");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDcDsl.g:207:3: (otherlv_14= 'volumes' otherlv_15= ':' this_BEG_BLOCK_16= RULE_BEG_BLOCK ( (lv_volumes_17_0= ruleNamedVolume ) )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:207:3: (otherlv_14= 'volumes' otherlv_15= ':' this_BEG_BLOCK_16= RULE_BEG_BLOCK ( (lv_volumes_17_0= ruleNamedVolume ) )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	    // InternalDcDsl.g:208:4: otherlv_14= 'volumes' otherlv_15= ':' this_BEG_BLOCK_16= RULE_BEG_BLOCK ( (lv_volumes_17_0= ruleNamedVolume ) )+ this_END_BLOCK_18= RULE_END_BLOCK
            	    {
            	    otherlv_14=(Token)match(input,21,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getDockerComposeAccess().getVolumesKeyword_4_0());
            	    			
            	    otherlv_15=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_15, grammarAccess.getDockerComposeAccess().getColonKeyword_4_1());
            	    			
            	    this_BEG_BLOCK_16=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	    				newLeafNode(this_BEG_BLOCK_16, grammarAccess.getDockerComposeAccess().getBEG_BLOCKTerminalRuleCall_4_2());
            	    			
            	    // InternalDcDsl.g:220:4: ( (lv_volumes_17_0= ruleNamedVolume ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)||(LA2_0>=23 && LA2_0<=30)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:221:5: (lv_volumes_17_0= ruleNamedVolume )
            	    	    {
            	    	    // InternalDcDsl.g:221:5: (lv_volumes_17_0= ruleNamedVolume )
            	    	    // InternalDcDsl.g:222:6: lv_volumes_17_0= ruleNamedVolume
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getVolumesNamedVolumeParserRuleCall_4_3_0());
            	    	    					
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_volumes_17_0=ruleNamedVolume();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"volumes",
            	    	    							lv_volumes_17_0,
            	    	    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.NamedVolume");
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

            	    this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	    				newLeafNode(this_END_BLOCK_18, grammarAccess.getDockerComposeAccess().getEND_BLOCKTerminalRuleCall_4_4());
            	    			

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDcDsl.g:245:3: (otherlv_19= 'secrets' otherlv_20= ':' this_BEG_BLOCK_21= RULE_BEG_BLOCK ( (lv_secrets_22_0= ruleSecret ) )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:245:3: (otherlv_19= 'secrets' otherlv_20= ':' this_BEG_BLOCK_21= RULE_BEG_BLOCK ( (lv_secrets_22_0= ruleSecret ) )+ this_END_BLOCK_23= RULE_END_BLOCK )
            	    // InternalDcDsl.g:246:4: otherlv_19= 'secrets' otherlv_20= ':' this_BEG_BLOCK_21= RULE_BEG_BLOCK ( (lv_secrets_22_0= ruleSecret ) )+ this_END_BLOCK_23= RULE_END_BLOCK
            	    {
            	    otherlv_19=(Token)match(input,22,FOLLOW_3); 

            	    				newLeafNode(otherlv_19, grammarAccess.getDockerComposeAccess().getSecretsKeyword_5_0());
            	    			
            	    otherlv_20=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_20, grammarAccess.getDockerComposeAccess().getColonKeyword_5_1());
            	    			
            	    this_BEG_BLOCK_21=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	    				newLeafNode(this_BEG_BLOCK_21, grammarAccess.getDockerComposeAccess().getBEG_BLOCKTerminalRuleCall_5_2());
            	    			
            	    // InternalDcDsl.g:258:4: ( (lv_secrets_22_0= ruleSecret ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_INT)||(LA3_0>=23 && LA3_0<=30)) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:259:5: (lv_secrets_22_0= ruleSecret )
            	    	    {
            	    	    // InternalDcDsl.g:259:5: (lv_secrets_22_0= ruleSecret )
            	    	    // InternalDcDsl.g:260:6: lv_secrets_22_0= ruleSecret
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getDockerComposeAccess().getSecretsSecretParserRuleCall_5_3_0());
            	    	    					
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_secrets_22_0=ruleSecret();

            	    	    state._fsp--;


            	    	    						if (current==null) {
            	    	    							current = createModelElementForParent(grammarAccess.getDockerComposeRule());
            	    	    						}
            	    	    						add(
            	    	    							current,
            	    	    							"secrets",
            	    	    							lv_secrets_22_0,
            	    	    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Secret");
            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	    this_END_BLOCK_23=(Token)match(input,RULE_END_BLOCK,FOLLOW_5); 

            	    				newLeafNode(this_END_BLOCK_23, grammarAccess.getDockerComposeAccess().getEND_BLOCKTerminalRuleCall_5_4());
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


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
    // $ANTLR end "ruleDockerCompose"


    // $ANTLR start "entryRuleEString"
    // InternalDcDsl.g:286:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDcDsl.g:286:47: (iv_ruleEString= ruleEString EOF )
            // InternalDcDsl.g:287:2: iv_ruleEString= ruleEString EOF
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
    // InternalDcDsl.g:293:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_SQ_STRING_1= RULE_SQ_STRING | this_BlockString_2= ruleBlockString | this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_SQ_STRING_1=null;
        Token this_YAML_SCALAR_3=null;
        Token this_GH_EXPRESSION_4=null;
        Token this_ID_5=null;
        Token this_INT_6=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_BlockString_2 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:299:2: ( (this_STRING_0= RULE_STRING | this_SQ_STRING_1= RULE_SQ_STRING | this_BlockString_2= ruleBlockString | this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | kw= 'true' | kw= 'false' ) )
            // InternalDcDsl.g:300:2: (this_STRING_0= RULE_STRING | this_SQ_STRING_1= RULE_SQ_STRING | this_BlockString_2= ruleBlockString | this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | kw= 'true' | kw= 'false' )
            {
            // InternalDcDsl.g:300:2: (this_STRING_0= RULE_STRING | this_SQ_STRING_1= RULE_SQ_STRING | this_BlockString_2= ruleBlockString | this_YAML_SCALAR_3= RULE_YAML_SCALAR | this_GH_EXPRESSION_4= RULE_GH_EXPRESSION | this_ID_5= RULE_ID | this_INT_6= RULE_INT | kw= 'true' | kw= 'false' )
            int alt5=9;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_SQ_STRING:
                {
                alt5=2;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt5=3;
                }
                break;
            case RULE_YAML_SCALAR:
                {
                alt5=4;
                }
                break;
            case RULE_GH_EXPRESSION:
                {
                alt5=5;
                }
                break;
            case RULE_ID:
                {
                alt5=6;
                }
                break;
            case RULE_INT:
                {
                alt5=7;
                }
                break;
            case 23:
                {
                alt5=8;
                }
                break;
            case 24:
                {
                alt5=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDcDsl.g:301:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:309:3: this_SQ_STRING_1= RULE_SQ_STRING
                    {
                    this_SQ_STRING_1=(Token)match(input,RULE_SQ_STRING,FOLLOW_2); 

                    			current.merge(this_SQ_STRING_1);
                    		

                    			newLeafNode(this_SQ_STRING_1, grammarAccess.getEStringAccess().getSQ_STRINGTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDcDsl.g:317:3: this_BlockString_2= ruleBlockString
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
                    // InternalDcDsl.g:328:3: this_YAML_SCALAR_3= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_3=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_2); 

                    			current.merge(this_YAML_SCALAR_3);
                    		

                    			newLeafNode(this_YAML_SCALAR_3, grammarAccess.getEStringAccess().getYAML_SCALARTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDcDsl.g:336:3: this_GH_EXPRESSION_4= RULE_GH_EXPRESSION
                    {
                    this_GH_EXPRESSION_4=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_2); 

                    			current.merge(this_GH_EXPRESSION_4);
                    		

                    			newLeafNode(this_GH_EXPRESSION_4, grammarAccess.getEStringAccess().getGH_EXPRESSIONTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDcDsl.g:344:3: this_ID_5= RULE_ID
                    {
                    this_ID_5=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_5);
                    		

                    			newLeafNode(this_ID_5, grammarAccess.getEStringAccess().getIDTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDcDsl.g:352:3: this_INT_6= RULE_INT
                    {
                    this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_6);
                    		

                    			newLeafNode(this_INT_6, grammarAccess.getEStringAccess().getINTTerminalRuleCall_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDcDsl.g:360:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEStringAccess().getTrueKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDcDsl.g:366:3: kw= 'false'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEStringAccess().getFalseKeyword_8());
                    		

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


    // $ANTLR start "entryRuleBlockString"
    // InternalDcDsl.g:375:1: entryRuleBlockString returns [String current=null] : iv_ruleBlockString= ruleBlockString EOF ;
    public final String entryRuleBlockString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBlockString = null;


        try {
            // InternalDcDsl.g:375:51: (iv_ruleBlockString= ruleBlockString EOF )
            // InternalDcDsl.g:376:2: iv_ruleBlockString= ruleBlockString EOF
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
    // InternalDcDsl.g:382:1: ruleBlockString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '>' | kw= '|' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' ) (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? (this_YAML_SCALAR_7= RULE_YAML_SCALAR | this_GH_EXPRESSION_8= RULE_GH_EXPRESSION | this_ID_9= RULE_ID | this_INT_10= RULE_INT | this_STRING_11= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_20= RULE_ANY_OTHER | kw= '|' | kw= '>' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )* (this_END_BLOCK_27= RULE_END_BLOCK )? ) ;
    public final AntlrDatatypeRuleToken ruleBlockString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_BEG_BLOCK_6=null;
        Token this_YAML_SCALAR_7=null;
        Token this_GH_EXPRESSION_8=null;
        Token this_ID_9=null;
        Token this_INT_10=null;
        Token this_STRING_11=null;
        Token this_ANY_OTHER_20=null;
        Token this_END_BLOCK_27=null;


        	enterRule();

        try {
            // InternalDcDsl.g:388:2: ( ( (kw= '>' | kw= '|' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' ) (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? (this_YAML_SCALAR_7= RULE_YAML_SCALAR | this_GH_EXPRESSION_8= RULE_GH_EXPRESSION | this_ID_9= RULE_ID | this_INT_10= RULE_INT | this_STRING_11= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_20= RULE_ANY_OTHER | kw= '|' | kw= '>' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )* (this_END_BLOCK_27= RULE_END_BLOCK )? ) )
            // InternalDcDsl.g:389:2: ( (kw= '>' | kw= '|' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' ) (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? (this_YAML_SCALAR_7= RULE_YAML_SCALAR | this_GH_EXPRESSION_8= RULE_GH_EXPRESSION | this_ID_9= RULE_ID | this_INT_10= RULE_INT | this_STRING_11= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_20= RULE_ANY_OTHER | kw= '|' | kw= '>' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )* (this_END_BLOCK_27= RULE_END_BLOCK )? )
            {
            // InternalDcDsl.g:389:2: ( (kw= '>' | kw= '|' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' ) (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? (this_YAML_SCALAR_7= RULE_YAML_SCALAR | this_GH_EXPRESSION_8= RULE_GH_EXPRESSION | this_ID_9= RULE_ID | this_INT_10= RULE_INT | this_STRING_11= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_20= RULE_ANY_OTHER | kw= '|' | kw= '>' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )* (this_END_BLOCK_27= RULE_END_BLOCK )? )
            // InternalDcDsl.g:390:3: (kw= '>' | kw= '|' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' ) (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? (this_YAML_SCALAR_7= RULE_YAML_SCALAR | this_GH_EXPRESSION_8= RULE_GH_EXPRESSION | this_ID_9= RULE_ID | this_INT_10= RULE_INT | this_STRING_11= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_20= RULE_ANY_OTHER | kw= '|' | kw= '>' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )* (this_END_BLOCK_27= RULE_END_BLOCK )?
            {
            // InternalDcDsl.g:390:3: (kw= '>' | kw= '|' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            case 29:
                {
                alt6=5;
                }
                break;
            case 30:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDcDsl.g:391:4: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:397:4: kw= '|'
                    {
                    kw=(Token)match(input,26,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLineKeyword_0_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalDcDsl.g:403:4: kw= '>-'
                    {
                    kw=(Token)match(input,27,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignHyphenMinusKeyword_0_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalDcDsl.g:409:4: kw= '>+'
                    {
                    kw=(Token)match(input,28,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignPlusSignKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalDcDsl.g:415:4: kw= '|-'
                    {
                    kw=(Token)match(input,29,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLineHyphenMinusKeyword_0_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalDcDsl.g:421:4: kw= '|+'
                    {
                    kw=(Token)match(input,30,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLinePlusSignKeyword_0_5());
                    			

                    }
                    break;

            }

            // InternalDcDsl.g:427:3: (this_BEG_BLOCK_6= RULE_BEG_BLOCK )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_BEG_BLOCK) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDcDsl.g:428:4: this_BEG_BLOCK_6= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_6=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_10); 

                    				current.merge(this_BEG_BLOCK_6);
                    			

                    				newLeafNode(this_BEG_BLOCK_6, grammarAccess.getBlockStringAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalDcDsl.g:436:3: (this_YAML_SCALAR_7= RULE_YAML_SCALAR | this_GH_EXPRESSION_8= RULE_GH_EXPRESSION | this_ID_9= RULE_ID | this_INT_10= RULE_INT | this_STRING_11= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_20= RULE_ANY_OTHER | kw= '|' | kw= '>' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )*
            loop8:
            do {
                int alt8=21;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalDcDsl.g:437:4: this_YAML_SCALAR_7= RULE_YAML_SCALAR
            	    {
            	    this_YAML_SCALAR_7=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_10); 

            	    				current.merge(this_YAML_SCALAR_7);
            	    			

            	    				newLeafNode(this_YAML_SCALAR_7, grammarAccess.getBlockStringAccess().getYAML_SCALARTerminalRuleCall_2_0());
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalDcDsl.g:445:4: this_GH_EXPRESSION_8= RULE_GH_EXPRESSION
            	    {
            	    this_GH_EXPRESSION_8=(Token)match(input,RULE_GH_EXPRESSION,FOLLOW_10); 

            	    				current.merge(this_GH_EXPRESSION_8);
            	    			

            	    				newLeafNode(this_GH_EXPRESSION_8, grammarAccess.getBlockStringAccess().getGH_EXPRESSIONTerminalRuleCall_2_1());
            	    			

            	    }
            	    break;
            	case 3 :
            	    // InternalDcDsl.g:453:4: this_ID_9= RULE_ID
            	    {
            	    this_ID_9=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    				current.merge(this_ID_9);
            	    			

            	    				newLeafNode(this_ID_9, grammarAccess.getBlockStringAccess().getIDTerminalRuleCall_2_2());
            	    			

            	    }
            	    break;
            	case 4 :
            	    // InternalDcDsl.g:461:4: this_INT_10= RULE_INT
            	    {
            	    this_INT_10=(Token)match(input,RULE_INT,FOLLOW_10); 

            	    				current.merge(this_INT_10);
            	    			

            	    				newLeafNode(this_INT_10, grammarAccess.getBlockStringAccess().getINTTerminalRuleCall_2_3());
            	    			

            	    }
            	    break;
            	case 5 :
            	    // InternalDcDsl.g:469:4: this_STRING_11= RULE_STRING
            	    {
            	    this_STRING_11=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	    				current.merge(this_STRING_11);
            	    			

            	    				newLeafNode(this_STRING_11, grammarAccess.getBlockStringAccess().getSTRINGTerminalRuleCall_2_4());
            	    			

            	    }
            	    break;
            	case 6 :
            	    // InternalDcDsl.g:477:4: kw= '-'
            	    {
            	    kw=(Token)match(input,31,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getHyphenMinusKeyword_2_5());
            	    			

            	    }
            	    break;
            	case 7 :
            	    // InternalDcDsl.g:483:4: kw= '['
            	    {
            	    kw=(Token)match(input,32,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftSquareBracketKeyword_2_6());
            	    			

            	    }
            	    break;
            	case 8 :
            	    // InternalDcDsl.g:489:4: kw= ']'
            	    {
            	    kw=(Token)match(input,33,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightSquareBracketKeyword_2_7());
            	    			

            	    }
            	    break;
            	case 9 :
            	    // InternalDcDsl.g:495:4: kw= ';'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getSemicolonKeyword_2_8());
            	    			

            	    }
            	    break;
            	case 10 :
            	    // InternalDcDsl.g:501:4: kw= ':'
            	    {
            	    kw=(Token)match(input,17,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getColonKeyword_2_9());
            	    			

            	    }
            	    break;
            	case 11 :
            	    // InternalDcDsl.g:507:4: kw= ','
            	    {
            	    kw=(Token)match(input,35,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getCommaKeyword_2_10());
            	    			

            	    }
            	    break;
            	case 12 :
            	    // InternalDcDsl.g:513:4: kw= '{'
            	    {
            	    kw=(Token)match(input,36,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getLeftCurlyBracketKeyword_2_11());
            	    			

            	    }
            	    break;
            	case 13 :
            	    // InternalDcDsl.g:519:4: kw= '}'
            	    {
            	    kw=(Token)match(input,37,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getRightCurlyBracketKeyword_2_12());
            	    			

            	    }
            	    break;
            	case 14 :
            	    // InternalDcDsl.g:525:4: this_ANY_OTHER_20= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_20=(Token)match(input,RULE_ANY_OTHER,FOLLOW_10); 

            	    				current.merge(this_ANY_OTHER_20);
            	    			

            	    				newLeafNode(this_ANY_OTHER_20, grammarAccess.getBlockStringAccess().getANY_OTHERTerminalRuleCall_2_13());
            	    			

            	    }
            	    break;
            	case 15 :
            	    // InternalDcDsl.g:533:4: kw= '|'
            	    {
            	    kw=(Token)match(input,26,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLineKeyword_2_14());
            	    			

            	    }
            	    break;
            	case 16 :
            	    // InternalDcDsl.g:539:4: kw= '>'
            	    {
            	    kw=(Token)match(input,25,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignKeyword_2_15());
            	    			

            	    }
            	    break;
            	case 17 :
            	    // InternalDcDsl.g:545:4: kw= '>-'
            	    {
            	    kw=(Token)match(input,27,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignHyphenMinusKeyword_2_16());
            	    			

            	    }
            	    break;
            	case 18 :
            	    // InternalDcDsl.g:551:4: kw= '>+'
            	    {
            	    kw=(Token)match(input,28,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getGreaterThanSignPlusSignKeyword_2_17());
            	    			

            	    }
            	    break;
            	case 19 :
            	    // InternalDcDsl.g:557:4: kw= '|-'
            	    {
            	    kw=(Token)match(input,29,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLineHyphenMinusKeyword_2_18());
            	    			

            	    }
            	    break;
            	case 20 :
            	    // InternalDcDsl.g:563:4: kw= '|+'
            	    {
            	    kw=(Token)match(input,30,FOLLOW_10); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getBlockStringAccess().getVerticalLinePlusSignKeyword_2_19());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalDcDsl.g:569:3: (this_END_BLOCK_27= RULE_END_BLOCK )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_END_BLOCK) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDcDsl.g:570:4: this_END_BLOCK_27= RULE_END_BLOCK
                    {
                    this_END_BLOCK_27=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				current.merge(this_END_BLOCK_27);
                    			

                    				newLeafNode(this_END_BLOCK_27, grammarAccess.getBlockStringAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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


    // $ANTLR start "entryRuleReservedWord"
    // InternalDcDsl.g:582:1: entryRuleReservedWord returns [String current=null] : iv_ruleReservedWord= ruleReservedWord EOF ;
    public final String entryRuleReservedWord() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReservedWord = null;


        try {
            // InternalDcDsl.g:582:52: (iv_ruleReservedWord= ruleReservedWord EOF )
            // InternalDcDsl.g:583:2: iv_ruleReservedWord= ruleReservedWord EOF
            {
             newCompositeNode(grammarAccess.getReservedWordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReservedWord=ruleReservedWord();

            state._fsp--;

             current =iv_ruleReservedWord.getText(); 
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
    // $ANTLR end "entryRuleReservedWord"


    // $ANTLR start "ruleReservedWord"
    // InternalDcDsl.g:589:1: ruleReservedWord returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'version' | kw= 'name' | kw= 'services' | kw= 'networks' | kw= 'volumes' | kw= 'secrets' | kw= 'image' | kw= 'build' | kw= 'container_name' | kw= 'restart' | kw= 'user' | kw= 'hostname' | kw= 'network_mode' | kw= 'platform' | kw= 'runtime' | kw= 'stop_signal' | kw= 'stdin_open' | kw= 'ports' | kw= 'expose' | kw= 'command' | kw= 'cap_add' | kw= 'labels' | kw= 'sysctls' | kw= 'environment' | kw= 'depends_on' | kw= 'healthcheck' | kw= 'deploy' | kw= 'context' | kw= 'dockerfile' | kw= 'target' | kw= 'args' | kw= 'driver' | kw= 'ipv4_address' | kw= 'ipam' | kw= 'subnet' | kw= 'condition' | kw= 'type' | kw= 'source' | kw= 'read_only' | kw= 'test' | kw= 'interval' | kw= 'timeout' | kw= 'retries' | kw= 'start_period' | kw= 'memory' | kw= 'file' ) ;
    public final AntlrDatatypeRuleToken ruleReservedWord() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDcDsl.g:595:2: ( (kw= 'version' | kw= 'name' | kw= 'services' | kw= 'networks' | kw= 'volumes' | kw= 'secrets' | kw= 'image' | kw= 'build' | kw= 'container_name' | kw= 'restart' | kw= 'user' | kw= 'hostname' | kw= 'network_mode' | kw= 'platform' | kw= 'runtime' | kw= 'stop_signal' | kw= 'stdin_open' | kw= 'ports' | kw= 'expose' | kw= 'command' | kw= 'cap_add' | kw= 'labels' | kw= 'sysctls' | kw= 'environment' | kw= 'depends_on' | kw= 'healthcheck' | kw= 'deploy' | kw= 'context' | kw= 'dockerfile' | kw= 'target' | kw= 'args' | kw= 'driver' | kw= 'ipv4_address' | kw= 'ipam' | kw= 'subnet' | kw= 'condition' | kw= 'type' | kw= 'source' | kw= 'read_only' | kw= 'test' | kw= 'interval' | kw= 'timeout' | kw= 'retries' | kw= 'start_period' | kw= 'memory' | kw= 'file' ) )
            // InternalDcDsl.g:596:2: (kw= 'version' | kw= 'name' | kw= 'services' | kw= 'networks' | kw= 'volumes' | kw= 'secrets' | kw= 'image' | kw= 'build' | kw= 'container_name' | kw= 'restart' | kw= 'user' | kw= 'hostname' | kw= 'network_mode' | kw= 'platform' | kw= 'runtime' | kw= 'stop_signal' | kw= 'stdin_open' | kw= 'ports' | kw= 'expose' | kw= 'command' | kw= 'cap_add' | kw= 'labels' | kw= 'sysctls' | kw= 'environment' | kw= 'depends_on' | kw= 'healthcheck' | kw= 'deploy' | kw= 'context' | kw= 'dockerfile' | kw= 'target' | kw= 'args' | kw= 'driver' | kw= 'ipv4_address' | kw= 'ipam' | kw= 'subnet' | kw= 'condition' | kw= 'type' | kw= 'source' | kw= 'read_only' | kw= 'test' | kw= 'interval' | kw= 'timeout' | kw= 'retries' | kw= 'start_period' | kw= 'memory' | kw= 'file' )
            {
            // InternalDcDsl.g:596:2: (kw= 'version' | kw= 'name' | kw= 'services' | kw= 'networks' | kw= 'volumes' | kw= 'secrets' | kw= 'image' | kw= 'build' | kw= 'container_name' | kw= 'restart' | kw= 'user' | kw= 'hostname' | kw= 'network_mode' | kw= 'platform' | kw= 'runtime' | kw= 'stop_signal' | kw= 'stdin_open' | kw= 'ports' | kw= 'expose' | kw= 'command' | kw= 'cap_add' | kw= 'labels' | kw= 'sysctls' | kw= 'environment' | kw= 'depends_on' | kw= 'healthcheck' | kw= 'deploy' | kw= 'context' | kw= 'dockerfile' | kw= 'target' | kw= 'args' | kw= 'driver' | kw= 'ipv4_address' | kw= 'ipam' | kw= 'subnet' | kw= 'condition' | kw= 'type' | kw= 'source' | kw= 'read_only' | kw= 'test' | kw= 'interval' | kw= 'timeout' | kw= 'retries' | kw= 'start_period' | kw= 'memory' | kw= 'file' )
            int alt10=46;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 20:
                {
                alt10=4;
                }
                break;
            case 21:
                {
                alt10=5;
                }
                break;
            case 22:
                {
                alt10=6;
                }
                break;
            case 38:
                {
                alt10=7;
                }
                break;
            case 39:
                {
                alt10=8;
                }
                break;
            case 40:
                {
                alt10=9;
                }
                break;
            case 41:
                {
                alt10=10;
                }
                break;
            case 42:
                {
                alt10=11;
                }
                break;
            case 43:
                {
                alt10=12;
                }
                break;
            case 44:
                {
                alt10=13;
                }
                break;
            case 45:
                {
                alt10=14;
                }
                break;
            case 46:
                {
                alt10=15;
                }
                break;
            case 47:
                {
                alt10=16;
                }
                break;
            case 48:
                {
                alt10=17;
                }
                break;
            case 49:
                {
                alt10=18;
                }
                break;
            case 50:
                {
                alt10=19;
                }
                break;
            case 51:
                {
                alt10=20;
                }
                break;
            case 52:
                {
                alt10=21;
                }
                break;
            case 53:
                {
                alt10=22;
                }
                break;
            case 54:
                {
                alt10=23;
                }
                break;
            case 55:
                {
                alt10=24;
                }
                break;
            case 56:
                {
                alt10=25;
                }
                break;
            case 57:
                {
                alt10=26;
                }
                break;
            case 58:
                {
                alt10=27;
                }
                break;
            case 59:
                {
                alt10=28;
                }
                break;
            case 60:
                {
                alt10=29;
                }
                break;
            case 61:
                {
                alt10=30;
                }
                break;
            case 62:
                {
                alt10=31;
                }
                break;
            case 63:
                {
                alt10=32;
                }
                break;
            case 64:
                {
                alt10=33;
                }
                break;
            case 65:
                {
                alt10=34;
                }
                break;
            case 66:
                {
                alt10=35;
                }
                break;
            case 67:
                {
                alt10=36;
                }
                break;
            case 68:
                {
                alt10=37;
                }
                break;
            case 69:
                {
                alt10=38;
                }
                break;
            case 70:
                {
                alt10=39;
                }
                break;
            case 71:
                {
                alt10=40;
                }
                break;
            case 72:
                {
                alt10=41;
                }
                break;
            case 73:
                {
                alt10=42;
                }
                break;
            case 74:
                {
                alt10=43;
                }
                break;
            case 75:
                {
                alt10=44;
                }
                break;
            case 76:
                {
                alt10=45;
                }
                break;
            case 77:
                {
                alt10=46;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDcDsl.g:597:3: kw= 'version'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getVersionKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:603:3: kw= 'name'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getNameKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDcDsl.g:609:3: kw= 'services'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getServicesKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDcDsl.g:615:3: kw= 'networks'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getNetworksKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalDcDsl.g:621:3: kw= 'volumes'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getVolumesKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalDcDsl.g:627:3: kw= 'secrets'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getSecretsKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalDcDsl.g:633:3: kw= 'image'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getImageKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalDcDsl.g:639:3: kw= 'build'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getBuildKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalDcDsl.g:645:3: kw= 'container_name'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getContainer_nameKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalDcDsl.g:651:3: kw= 'restart'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getRestartKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalDcDsl.g:657:3: kw= 'user'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getUserKeyword_10());
                    		

                    }
                    break;
                case 12 :
                    // InternalDcDsl.g:663:3: kw= 'hostname'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getHostnameKeyword_11());
                    		

                    }
                    break;
                case 13 :
                    // InternalDcDsl.g:669:3: kw= 'network_mode'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getNetwork_modeKeyword_12());
                    		

                    }
                    break;
                case 14 :
                    // InternalDcDsl.g:675:3: kw= 'platform'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getPlatformKeyword_13());
                    		

                    }
                    break;
                case 15 :
                    // InternalDcDsl.g:681:3: kw= 'runtime'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getRuntimeKeyword_14());
                    		

                    }
                    break;
                case 16 :
                    // InternalDcDsl.g:687:3: kw= 'stop_signal'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getStop_signalKeyword_15());
                    		

                    }
                    break;
                case 17 :
                    // InternalDcDsl.g:693:3: kw= 'stdin_open'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getStdin_openKeyword_16());
                    		

                    }
                    break;
                case 18 :
                    // InternalDcDsl.g:699:3: kw= 'ports'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getPortsKeyword_17());
                    		

                    }
                    break;
                case 19 :
                    // InternalDcDsl.g:705:3: kw= 'expose'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getExposeKeyword_18());
                    		

                    }
                    break;
                case 20 :
                    // InternalDcDsl.g:711:3: kw= 'command'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getCommandKeyword_19());
                    		

                    }
                    break;
                case 21 :
                    // InternalDcDsl.g:717:3: kw= 'cap_add'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getCap_addKeyword_20());
                    		

                    }
                    break;
                case 22 :
                    // InternalDcDsl.g:723:3: kw= 'labels'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getLabelsKeyword_21());
                    		

                    }
                    break;
                case 23 :
                    // InternalDcDsl.g:729:3: kw= 'sysctls'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getSysctlsKeyword_22());
                    		

                    }
                    break;
                case 24 :
                    // InternalDcDsl.g:735:3: kw= 'environment'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getEnvironmentKeyword_23());
                    		

                    }
                    break;
                case 25 :
                    // InternalDcDsl.g:741:3: kw= 'depends_on'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getDepends_onKeyword_24());
                    		

                    }
                    break;
                case 26 :
                    // InternalDcDsl.g:747:3: kw= 'healthcheck'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getHealthcheckKeyword_25());
                    		

                    }
                    break;
                case 27 :
                    // InternalDcDsl.g:753:3: kw= 'deploy'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getDeployKeyword_26());
                    		

                    }
                    break;
                case 28 :
                    // InternalDcDsl.g:759:3: kw= 'context'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getContextKeyword_27());
                    		

                    }
                    break;
                case 29 :
                    // InternalDcDsl.g:765:3: kw= 'dockerfile'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getDockerfileKeyword_28());
                    		

                    }
                    break;
                case 30 :
                    // InternalDcDsl.g:771:3: kw= 'target'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getTargetKeyword_29());
                    		

                    }
                    break;
                case 31 :
                    // InternalDcDsl.g:777:3: kw= 'args'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getArgsKeyword_30());
                    		

                    }
                    break;
                case 32 :
                    // InternalDcDsl.g:783:3: kw= 'driver'
                    {
                    kw=(Token)match(input,63,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getDriverKeyword_31());
                    		

                    }
                    break;
                case 33 :
                    // InternalDcDsl.g:789:3: kw= 'ipv4_address'
                    {
                    kw=(Token)match(input,64,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getIpv4_addressKeyword_32());
                    		

                    }
                    break;
                case 34 :
                    // InternalDcDsl.g:795:3: kw= 'ipam'
                    {
                    kw=(Token)match(input,65,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getIpamKeyword_33());
                    		

                    }
                    break;
                case 35 :
                    // InternalDcDsl.g:801:3: kw= 'subnet'
                    {
                    kw=(Token)match(input,66,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getSubnetKeyword_34());
                    		

                    }
                    break;
                case 36 :
                    // InternalDcDsl.g:807:3: kw= 'condition'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getConditionKeyword_35());
                    		

                    }
                    break;
                case 37 :
                    // InternalDcDsl.g:813:3: kw= 'type'
                    {
                    kw=(Token)match(input,68,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getTypeKeyword_36());
                    		

                    }
                    break;
                case 38 :
                    // InternalDcDsl.g:819:3: kw= 'source'
                    {
                    kw=(Token)match(input,69,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getSourceKeyword_37());
                    		

                    }
                    break;
                case 39 :
                    // InternalDcDsl.g:825:3: kw= 'read_only'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getRead_onlyKeyword_38());
                    		

                    }
                    break;
                case 40 :
                    // InternalDcDsl.g:831:3: kw= 'test'
                    {
                    kw=(Token)match(input,71,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getTestKeyword_39());
                    		

                    }
                    break;
                case 41 :
                    // InternalDcDsl.g:837:3: kw= 'interval'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getIntervalKeyword_40());
                    		

                    }
                    break;
                case 42 :
                    // InternalDcDsl.g:843:3: kw= 'timeout'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getTimeoutKeyword_41());
                    		

                    }
                    break;
                case 43 :
                    // InternalDcDsl.g:849:3: kw= 'retries'
                    {
                    kw=(Token)match(input,74,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getRetriesKeyword_42());
                    		

                    }
                    break;
                case 44 :
                    // InternalDcDsl.g:855:3: kw= 'start_period'
                    {
                    kw=(Token)match(input,75,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getStart_periodKeyword_43());
                    		

                    }
                    break;
                case 45 :
                    // InternalDcDsl.g:861:3: kw= 'memory'
                    {
                    kw=(Token)match(input,76,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getMemoryKeyword_44());
                    		

                    }
                    break;
                case 46 :
                    // InternalDcDsl.g:867:3: kw= 'file'
                    {
                    kw=(Token)match(input,77,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getReservedWordAccess().getFileKeyword_45());
                    		

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
    // $ANTLR end "ruleReservedWord"


    // $ANTLR start "entryRuleKeyName"
    // InternalDcDsl.g:876:1: entryRuleKeyName returns [String current=null] : iv_ruleKeyName= ruleKeyName EOF ;
    public final String entryRuleKeyName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyName = null;


        try {
            // InternalDcDsl.g:876:47: (iv_ruleKeyName= ruleKeyName EOF )
            // InternalDcDsl.g:877:2: iv_ruleKeyName= ruleKeyName EOF
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
    // InternalDcDsl.g:883:1: ruleKeyName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | this_ReservedWord_3= ruleReservedWord ) ;
    public final AntlrDatatypeRuleToken ruleKeyName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_YAML_SCALAR_1=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_ReservedWord_3 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:889:2: ( (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | this_ReservedWord_3= ruleReservedWord ) )
            // InternalDcDsl.g:890:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | this_ReservedWord_3= ruleReservedWord )
            {
            // InternalDcDsl.g:890:2: (this_ID_0= RULE_ID | this_YAML_SCALAR_1= RULE_YAML_SCALAR | this_INT_2= RULE_INT | this_ReservedWord_3= ruleReservedWord )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt11=1;
                }
                break;
            case RULE_YAML_SCALAR:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                alt11=3;
                }
                break;
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
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
                    // InternalDcDsl.g:891:3: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_0);
                    		

                    			newLeafNode(this_ID_0, grammarAccess.getKeyNameAccess().getIDTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:899:3: this_YAML_SCALAR_1= RULE_YAML_SCALAR
                    {
                    this_YAML_SCALAR_1=(Token)match(input,RULE_YAML_SCALAR,FOLLOW_2); 

                    			current.merge(this_YAML_SCALAR_1);
                    		

                    			newLeafNode(this_YAML_SCALAR_1, grammarAccess.getKeyNameAccess().getYAML_SCALARTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalDcDsl.g:907:3: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_2);
                    		

                    			newLeafNode(this_INT_2, grammarAccess.getKeyNameAccess().getINTTerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalDcDsl.g:915:3: this_ReservedWord_3= ruleReservedWord
                    {

                    			newCompositeNode(grammarAccess.getKeyNameAccess().getReservedWordParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ReservedWord_3=ruleReservedWord();

                    state._fsp--;


                    			current.merge(this_ReservedWord_3);
                    		

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
    // $ANTLR end "ruleKeyName"


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalDcDsl.g:929:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalDcDsl.g:929:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalDcDsl.g:930:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
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
    // InternalDcDsl.g:936:1: ruleKeyValuePair returns [EObject current=null] : ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_key_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:942:2: ( ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) ) )
            // InternalDcDsl.g:943:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            {
            // InternalDcDsl.g:943:2: ( ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) ) )
            // InternalDcDsl.g:944:3: ( (lv_key_0_0= ruleKeyName ) ) otherlv_1= ':' ( (lv_value_2_0= ruleEString ) )
            {
            // InternalDcDsl.g:944:3: ( (lv_key_0_0= ruleKeyName ) )
            // InternalDcDsl.g:945:4: (lv_key_0_0= ruleKeyName )
            {
            // InternalDcDsl.g:945:4: (lv_key_0_0= ruleKeyName )
            // InternalDcDsl.g:946:5: lv_key_0_0= ruleKeyName
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
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.KeyName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getColonKeyword_1());
            		
            // InternalDcDsl.g:967:3: ( (lv_value_2_0= ruleEString ) )
            // InternalDcDsl.g:968:4: (lv_value_2_0= ruleEString )
            {
            // InternalDcDsl.g:968:4: (lv_value_2_0= ruleEString )
            // InternalDcDsl.g:969:5: lv_value_2_0= ruleEString
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
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
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


    // $ANTLR start "entryRuleService"
    // InternalDcDsl.g:990:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDcDsl.g:990:48: (iv_ruleService= ruleService EOF )
            // InternalDcDsl.g:991:2: iv_ruleService= ruleService EOF
            {
             newCompositeNode(grammarAccess.getServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleService=ruleService();

            state._fsp--;

             current =iv_ruleService; 
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
    // $ANTLR end "entryRuleService"


    // $ANTLR start "ruleService"
    // InternalDcDsl.g:997:1: ruleService returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) ) | (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) ) | (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) ) | (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) ) | (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) ) | (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) ) | (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK ) | (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) ) | (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) ) | (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK ) | (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) ) | (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK ) )* this_END_BLOCK_137= RULE_END_BLOCK ) ;
    public final EObject ruleService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
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
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token this_BEG_BLOCK_38=null;
        Token otherlv_39=null;
        Token this_END_BLOCK_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token this_BEG_BLOCK_49=null;
        Token otherlv_50=null;
        Token lv_expose_51_0=null;
        Token this_END_BLOCK_52=null;
        Token otherlv_53=null;
        Token lv_expose_54_0=null;
        Token otherlv_55=null;
        Token lv_expose_56_0=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token this_BEG_BLOCK_60=null;
        Token otherlv_61=null;
        Token this_END_BLOCK_63=null;
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token this_BEG_BLOCK_71=null;
        Token otherlv_72=null;
        Token this_END_BLOCK_74=null;
        Token otherlv_75=null;
        Token otherlv_77=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token this_BEG_BLOCK_82=null;
        Token otherlv_83=null;
        Token this_END_BLOCK_85=null;
        Token otherlv_86=null;
        Token otherlv_88=null;
        Token otherlv_90=null;
        Token otherlv_91=null;
        Token otherlv_92=null;
        Token this_BEG_BLOCK_93=null;
        Token otherlv_94=null;
        Token this_END_BLOCK_96=null;
        Token otherlv_97=null;
        Token otherlv_99=null;
        Token otherlv_101=null;
        Token otherlv_102=null;
        Token otherlv_103=null;
        Token this_BEG_BLOCK_104=null;
        Token otherlv_105=null;
        Token this_END_BLOCK_107=null;
        Token otherlv_108=null;
        Token otherlv_110=null;
        Token otherlv_112=null;
        Token otherlv_113=null;
        Token otherlv_114=null;
        Token this_BEG_BLOCK_115=null;
        Token this_END_BLOCK_117=null;
        Token otherlv_118=null;
        Token otherlv_119=null;
        Token otherlv_121=null;
        Token otherlv_122=null;
        Token otherlv_124=null;
        Token otherlv_125=null;
        Token this_BEG_BLOCK_126=null;
        Token this_END_BLOCK_128=null;
        Token otherlv_129=null;
        Token otherlv_130=null;
        Token otherlv_132=null;
        Token otherlv_133=null;
        Token this_BEG_BLOCK_134=null;
        Token this_END_BLOCK_136=null;
        Token this_END_BLOCK_137=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_image_5_0 = null;

        EObject lv_build_8_0 = null;

        AntlrDatatypeRuleToken lv_containerName_11_0 = null;

        AntlrDatatypeRuleToken lv_restart_14_0 = null;

        AntlrDatatypeRuleToken lv_user_17_0 = null;

        AntlrDatatypeRuleToken lv_hostname_20_0 = null;

        AntlrDatatypeRuleToken lv_networkMode_23_0 = null;

        AntlrDatatypeRuleToken lv_platform_26_0 = null;

        AntlrDatatypeRuleToken lv_runtime_29_0 = null;

        AntlrDatatypeRuleToken lv_stopSignal_32_0 = null;

        AntlrDatatypeRuleToken lv_stdinOpen_35_0 = null;

        AntlrDatatypeRuleToken lv_ports_40_0 = null;

        AntlrDatatypeRuleToken lv_ports_43_0 = null;

        AntlrDatatypeRuleToken lv_ports_45_0 = null;

        AntlrDatatypeRuleToken lv_command_62_0 = null;

        AntlrDatatypeRuleToken lv_command_65_0 = null;

        AntlrDatatypeRuleToken lv_command_67_0 = null;

        AntlrDatatypeRuleToken lv_secrets_73_0 = null;

        AntlrDatatypeRuleToken lv_secrets_76_0 = null;

        AntlrDatatypeRuleToken lv_secrets_78_0 = null;

        AntlrDatatypeRuleToken lv_capAdd_84_0 = null;

        AntlrDatatypeRuleToken lv_capAdd_87_0 = null;

        AntlrDatatypeRuleToken lv_capAdd_89_0 = null;

        AntlrDatatypeRuleToken lv_labels_95_0 = null;

        AntlrDatatypeRuleToken lv_labels_98_0 = null;

        AntlrDatatypeRuleToken lv_labels_100_0 = null;

        AntlrDatatypeRuleToken lv_sysctls_106_0 = null;

        AntlrDatatypeRuleToken lv_sysctls_109_0 = null;

        AntlrDatatypeRuleToken lv_sysctls_111_0 = null;

        EObject lv_environment_116_0 = null;

        EObject lv_dependsOn_120_0 = null;

        EObject lv_networks_123_0 = null;

        EObject lv_volumes_127_0 = null;

        EObject lv_healthcheck_131_0 = null;

        EObject lv_deploy_135_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:1003:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) ) | (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) ) | (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) ) | (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) ) | (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) ) | (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) ) | (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK ) | (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) ) | (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) ) | (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK ) | (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) ) | (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK ) )* this_END_BLOCK_137= RULE_END_BLOCK ) )
            // InternalDcDsl.g:1004:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) ) | (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) ) | (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) ) | (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) ) | (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) ) | (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) ) | (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK ) | (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) ) | (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) ) | (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK ) | (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) ) | (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK ) )* this_END_BLOCK_137= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:1004:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) ) | (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) ) | (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) ) | (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) ) | (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) ) | (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) ) | (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK ) | (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) ) | (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) ) | (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK ) | (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) ) | (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK ) )* this_END_BLOCK_137= RULE_END_BLOCK )
            // InternalDcDsl.g:1005:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) ) | (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) ) | (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) ) | (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) ) | (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) ) | (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) ) | (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK ) | (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) ) | (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) ) | (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK ) | (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) ) | (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK ) )* this_END_BLOCK_137= RULE_END_BLOCK
            {
            // InternalDcDsl.g:1005:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:1006:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:1006:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:1007:5: lv_id_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceAccess().getIdEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceAccess().getColonKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_11); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalDcDsl.g:1032:3: ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) ) | (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) ) | (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) ) | (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) ) | (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) ) | (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) ) | (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK ) | (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) ) | (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) ) | (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK ) | (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) ) | (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK ) )*
            loop36:
            do {
                int alt36=25;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt36=1;
                    }
                    break;
                case 39:
                    {
                    alt36=2;
                    }
                    break;
                case 40:
                    {
                    alt36=3;
                    }
                    break;
                case 41:
                    {
                    alt36=4;
                    }
                    break;
                case 42:
                    {
                    alt36=5;
                    }
                    break;
                case 43:
                    {
                    alt36=6;
                    }
                    break;
                case 44:
                    {
                    alt36=7;
                    }
                    break;
                case 45:
                    {
                    alt36=8;
                    }
                    break;
                case 46:
                    {
                    alt36=9;
                    }
                    break;
                case 47:
                    {
                    alt36=10;
                    }
                    break;
                case 48:
                    {
                    alt36=11;
                    }
                    break;
                case 49:
                    {
                    alt36=12;
                    }
                    break;
                case 50:
                    {
                    alt36=13;
                    }
                    break;
                case 51:
                    {
                    alt36=14;
                    }
                    break;
                case 22:
                    {
                    alt36=15;
                    }
                    break;
                case 52:
                    {
                    alt36=16;
                    }
                    break;
                case 53:
                    {
                    alt36=17;
                    }
                    break;
                case 54:
                    {
                    alt36=18;
                    }
                    break;
                case 55:
                    {
                    alt36=19;
                    }
                    break;
                case 56:
                    {
                    alt36=20;
                    }
                    break;
                case 20:
                    {
                    alt36=21;
                    }
                    break;
                case 21:
                    {
                    alt36=22;
                    }
                    break;
                case 57:
                    {
                    alt36=23;
                    }
                    break;
                case 58:
                    {
                    alt36=24;
                    }
                    break;

                }

                switch (alt36) {
            	case 1 :
            	    // InternalDcDsl.g:1033:4: (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1033:4: (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1034:5: otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getImageKeyword_3_0_0());
            	    				
            	    otherlv_4=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getColonKeyword_3_0_1());
            	    				
            	    // InternalDcDsl.g:1042:5: ( (lv_image_5_0= ruleEString ) )
            	    // InternalDcDsl.g:1043:6: (lv_image_5_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1043:6: (lv_image_5_0= ruleEString )
            	    // InternalDcDsl.g:1044:7: lv_image_5_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getImageEStringParserRuleCall_3_0_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_image_5_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"image",
            	    								lv_image_5_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDcDsl.g:1063:4: (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) )
            	    {
            	    // InternalDcDsl.g:1063:4: (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) )
            	    // InternalDcDsl.g:1064:5: otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_3); 

            	    					newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getBuildKeyword_3_1_0());
            	    				
            	    otherlv_7=(Token)match(input,17,FOLLOW_12); 

            	    					newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getColonKeyword_3_1_1());
            	    				
            	    // InternalDcDsl.g:1072:5: ( (lv_build_8_0= ruleBuild ) )
            	    // InternalDcDsl.g:1073:6: (lv_build_8_0= ruleBuild )
            	    {
            	    // InternalDcDsl.g:1073:6: (lv_build_8_0= ruleBuild )
            	    // InternalDcDsl.g:1074:7: lv_build_8_0= ruleBuild
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getBuildBuildParserRuleCall_3_1_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_build_8_0=ruleBuild();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"build",
            	    								lv_build_8_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Build");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDcDsl.g:1093:4: (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1093:4: (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1094:5: otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_3); 

            	    					newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getContainer_nameKeyword_3_2_0());
            	    				
            	    otherlv_10=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getColonKeyword_3_2_1());
            	    				
            	    // InternalDcDsl.g:1102:5: ( (lv_containerName_11_0= ruleEString ) )
            	    // InternalDcDsl.g:1103:6: (lv_containerName_11_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1103:6: (lv_containerName_11_0= ruleEString )
            	    // InternalDcDsl.g:1104:7: lv_containerName_11_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getContainerNameEStringParserRuleCall_3_2_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_containerName_11_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"containerName",
            	    								lv_containerName_11_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDcDsl.g:1123:4: (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1123:4: (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1124:5: otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,41,FOLLOW_3); 

            	    					newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getRestartKeyword_3_3_0());
            	    				
            	    otherlv_13=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getColonKeyword_3_3_1());
            	    				
            	    // InternalDcDsl.g:1132:5: ( (lv_restart_14_0= ruleEString ) )
            	    // InternalDcDsl.g:1133:6: (lv_restart_14_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1133:6: (lv_restart_14_0= ruleEString )
            	    // InternalDcDsl.g:1134:7: lv_restart_14_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getRestartEStringParserRuleCall_3_3_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_restart_14_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"restart",
            	    								lv_restart_14_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDcDsl.g:1153:4: (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1153:4: (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1154:5: otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,42,FOLLOW_3); 

            	    					newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getUserKeyword_3_4_0());
            	    				
            	    otherlv_16=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getColonKeyword_3_4_1());
            	    				
            	    // InternalDcDsl.g:1162:5: ( (lv_user_17_0= ruleEString ) )
            	    // InternalDcDsl.g:1163:6: (lv_user_17_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1163:6: (lv_user_17_0= ruleEString )
            	    // InternalDcDsl.g:1164:7: lv_user_17_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getUserEStringParserRuleCall_3_4_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_user_17_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"user",
            	    								lv_user_17_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalDcDsl.g:1183:4: (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1183:4: (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1184:5: otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,43,FOLLOW_3); 

            	    					newLeafNode(otherlv_18, grammarAccess.getServiceAccess().getHostnameKeyword_3_5_0());
            	    				
            	    otherlv_19=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getColonKeyword_3_5_1());
            	    				
            	    // InternalDcDsl.g:1192:5: ( (lv_hostname_20_0= ruleEString ) )
            	    // InternalDcDsl.g:1193:6: (lv_hostname_20_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1193:6: (lv_hostname_20_0= ruleEString )
            	    // InternalDcDsl.g:1194:7: lv_hostname_20_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getHostnameEStringParserRuleCall_3_5_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_hostname_20_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"hostname",
            	    								lv_hostname_20_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalDcDsl.g:1213:4: (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1213:4: (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1214:5: otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) )
            	    {
            	    otherlv_21=(Token)match(input,44,FOLLOW_3); 

            	    					newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getNetwork_modeKeyword_3_6_0());
            	    				
            	    otherlv_22=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_22, grammarAccess.getServiceAccess().getColonKeyword_3_6_1());
            	    				
            	    // InternalDcDsl.g:1222:5: ( (lv_networkMode_23_0= ruleEString ) )
            	    // InternalDcDsl.g:1223:6: (lv_networkMode_23_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1223:6: (lv_networkMode_23_0= ruleEString )
            	    // InternalDcDsl.g:1224:7: lv_networkMode_23_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getNetworkModeEStringParserRuleCall_3_6_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_networkMode_23_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"networkMode",
            	    								lv_networkMode_23_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalDcDsl.g:1243:4: (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1243:4: (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1244:5: otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,45,FOLLOW_3); 

            	    					newLeafNode(otherlv_24, grammarAccess.getServiceAccess().getPlatformKeyword_3_7_0());
            	    				
            	    otherlv_25=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getColonKeyword_3_7_1());
            	    				
            	    // InternalDcDsl.g:1252:5: ( (lv_platform_26_0= ruleEString ) )
            	    // InternalDcDsl.g:1253:6: (lv_platform_26_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1253:6: (lv_platform_26_0= ruleEString )
            	    // InternalDcDsl.g:1254:7: lv_platform_26_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getPlatformEStringParserRuleCall_3_7_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_platform_26_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"platform",
            	    								lv_platform_26_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalDcDsl.g:1273:4: (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1273:4: (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1274:5: otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) )
            	    {
            	    otherlv_27=(Token)match(input,46,FOLLOW_3); 

            	    					newLeafNode(otherlv_27, grammarAccess.getServiceAccess().getRuntimeKeyword_3_8_0());
            	    				
            	    otherlv_28=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getColonKeyword_3_8_1());
            	    				
            	    // InternalDcDsl.g:1282:5: ( (lv_runtime_29_0= ruleEString ) )
            	    // InternalDcDsl.g:1283:6: (lv_runtime_29_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1283:6: (lv_runtime_29_0= ruleEString )
            	    // InternalDcDsl.g:1284:7: lv_runtime_29_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getRuntimeEStringParserRuleCall_3_8_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_runtime_29_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"runtime",
            	    								lv_runtime_29_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // InternalDcDsl.g:1303:4: (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1303:4: (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1304:5: otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,47,FOLLOW_3); 

            	    					newLeafNode(otherlv_30, grammarAccess.getServiceAccess().getStop_signalKeyword_3_9_0());
            	    				
            	    otherlv_31=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getColonKeyword_3_9_1());
            	    				
            	    // InternalDcDsl.g:1312:5: ( (lv_stopSignal_32_0= ruleEString ) )
            	    // InternalDcDsl.g:1313:6: (lv_stopSignal_32_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1313:6: (lv_stopSignal_32_0= ruleEString )
            	    // InternalDcDsl.g:1314:7: lv_stopSignal_32_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getStopSignalEStringParserRuleCall_3_9_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_stopSignal_32_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"stopSignal",
            	    								lv_stopSignal_32_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // InternalDcDsl.g:1333:4: (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) )
            	    {
            	    // InternalDcDsl.g:1333:4: (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) )
            	    // InternalDcDsl.g:1334:5: otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) )
            	    {
            	    otherlv_33=(Token)match(input,48,FOLLOW_3); 

            	    					newLeafNode(otherlv_33, grammarAccess.getServiceAccess().getStdin_openKeyword_3_10_0());
            	    				
            	    otherlv_34=(Token)match(input,17,FOLLOW_13); 

            	    					newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getColonKeyword_3_10_1());
            	    				
            	    // InternalDcDsl.g:1342:5: ( (lv_stdinOpen_35_0= ruleEBoolean ) )
            	    // InternalDcDsl.g:1343:6: (lv_stdinOpen_35_0= ruleEBoolean )
            	    {
            	    // InternalDcDsl.g:1343:6: (lv_stdinOpen_35_0= ruleEBoolean )
            	    // InternalDcDsl.g:1344:7: lv_stdinOpen_35_0= ruleEBoolean
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getStdinOpenEBooleanParserRuleCall_3_10_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_stdinOpen_35_0=ruleEBoolean();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"stdinOpen",
            	    								lv_stdinOpen_35_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EBoolean");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // InternalDcDsl.g:1363:4: (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1363:4: (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) ) )
            	    // InternalDcDsl.g:1364:5: otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) )
            	    {
            	    otherlv_36=(Token)match(input,49,FOLLOW_3); 

            	    					newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getPortsKeyword_3_11_0());
            	    				
            	    otherlv_37=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getColonKeyword_3_11_1());
            	    				
            	    // InternalDcDsl.g:1372:5: ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK ) | (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==RULE_BEG_BLOCK) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==32) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalDcDsl.g:1373:6: (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1373:6: (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1374:7: this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+ this_END_BLOCK_41= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_38=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_38, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_11_2_0_0());
            	            						
            	            // InternalDcDsl.g:1378:7: (otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) ) )+
            	            int cnt12=0;
            	            loop12:
            	            do {
            	                int alt12=2;
            	                int LA12_0 = input.LA(1);

            	                if ( (LA12_0==31) ) {
            	                    alt12=1;
            	                }


            	                switch (alt12) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1379:8: otherlv_39= '-' ( (lv_ports_40_0= ruleEString ) )
            	            	    {
            	            	    otherlv_39=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_39, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1383:8: ( (lv_ports_40_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1384:9: (lv_ports_40_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1384:9: (lv_ports_40_0= ruleEString )
            	            	    // InternalDcDsl.g:1385:10: lv_ports_40_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getPortsEStringParserRuleCall_3_11_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_ports_40_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"ports",
            	            	    											lv_ports_40_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


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

            	            this_END_BLOCK_41=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_41, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_11_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1409:6: (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' )
            	            {
            	            // InternalDcDsl.g:1409:6: (otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']' )
            	            // InternalDcDsl.g:1410:7: otherlv_42= '[' ( (lv_ports_43_0= ruleEString ) ) (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )* otherlv_46= ']'
            	            {
            	            otherlv_42=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_42, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_11_2_1_0());
            	            						
            	            // InternalDcDsl.g:1414:7: ( (lv_ports_43_0= ruleEString ) )
            	            // InternalDcDsl.g:1415:8: (lv_ports_43_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1415:8: (lv_ports_43_0= ruleEString )
            	            // InternalDcDsl.g:1416:9: lv_ports_43_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getPortsEStringParserRuleCall_3_11_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_ports_43_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"ports",
            	            										lv_ports_43_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1433:7: (otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) ) )*
            	            loop13:
            	            do {
            	                int alt13=2;
            	                int LA13_0 = input.LA(1);

            	                if ( (LA13_0==35) ) {
            	                    alt13=1;
            	                }


            	                switch (alt13) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1434:8: otherlv_44= ',' ( (lv_ports_45_0= ruleEString ) )
            	            	    {
            	            	    otherlv_44=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_44, grammarAccess.getServiceAccess().getCommaKeyword_3_11_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1438:8: ( (lv_ports_45_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1439:9: (lv_ports_45_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1439:9: (lv_ports_45_0= ruleEString )
            	            	    // InternalDcDsl.g:1440:10: lv_ports_45_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getPortsEStringParserRuleCall_3_11_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_ports_45_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"ports",
            	            	    											lv_ports_45_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop13;
            	                }
            	            } while (true);

            	            otherlv_46=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_46, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_11_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalDcDsl.g:1466:4: (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1466:4: (otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) ) )
            	    // InternalDcDsl.g:1467:5: otherlv_47= 'expose' otherlv_48= ':' ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) )
            	    {
            	    otherlv_47=(Token)match(input,50,FOLLOW_3); 

            	    					newLeafNode(otherlv_47, grammarAccess.getServiceAccess().getExposeKeyword_3_12_0());
            	    				
            	    otherlv_48=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_48, grammarAccess.getServiceAccess().getColonKeyword_3_12_1());
            	    				
            	    // InternalDcDsl.g:1475:5: ( (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK ) | (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' ) )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==RULE_BEG_BLOCK) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==32) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalDcDsl.g:1476:6: (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1476:6: (this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1477:7: this_BEG_BLOCK_49= RULE_BEG_BLOCK (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+ this_END_BLOCK_52= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_49=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_49, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_12_2_0_0());
            	            						
            	            // InternalDcDsl.g:1481:7: (otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) ) )+
            	            int cnt15=0;
            	            loop15:
            	            do {
            	                int alt15=2;
            	                int LA15_0 = input.LA(1);

            	                if ( (LA15_0==31) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1482:8: otherlv_50= '-' ( (lv_expose_51_0= RULE_INT ) )
            	            	    {
            	            	    otherlv_50=(Token)match(input,31,FOLLOW_18); 

            	            	    								newLeafNode(otherlv_50, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1486:8: ( (lv_expose_51_0= RULE_INT ) )
            	            	    // InternalDcDsl.g:1487:9: (lv_expose_51_0= RULE_INT )
            	            	    {
            	            	    // InternalDcDsl.g:1487:9: (lv_expose_51_0= RULE_INT )
            	            	    // InternalDcDsl.g:1488:10: lv_expose_51_0= RULE_INT
            	            	    {
            	            	    lv_expose_51_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            	            	    										newLeafNode(lv_expose_51_0, grammarAccess.getServiceAccess().getExposeINTTerminalRuleCall_3_12_2_0_1_1_0());
            	            	    									

            	            	    										if (current==null) {
            	            	    											current = createModelElement(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										addWithLastConsumed(
            	            	    											current,
            	            	    											"expose",
            	            	    											lv_expose_51_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.INT");
            	            	    									

            	            	    }


            	            	    }


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

            	            this_END_BLOCK_52=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_52, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_12_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1511:6: (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' )
            	            {
            	            // InternalDcDsl.g:1511:6: (otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']' )
            	            // InternalDcDsl.g:1512:7: otherlv_53= '[' ( (lv_expose_54_0= RULE_INT ) ) (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )* otherlv_57= ']'
            	            {
            	            otherlv_53=(Token)match(input,32,FOLLOW_18); 

            	            							newLeafNode(otherlv_53, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_12_2_1_0());
            	            						
            	            // InternalDcDsl.g:1516:7: ( (lv_expose_54_0= RULE_INT ) )
            	            // InternalDcDsl.g:1517:8: (lv_expose_54_0= RULE_INT )
            	            {
            	            // InternalDcDsl.g:1517:8: (lv_expose_54_0= RULE_INT )
            	            // InternalDcDsl.g:1518:9: lv_expose_54_0= RULE_INT
            	            {
            	            lv_expose_54_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	            									newLeafNode(lv_expose_54_0, grammarAccess.getServiceAccess().getExposeINTTerminalRuleCall_3_12_2_1_1_0());
            	            								

            	            									if (current==null) {
            	            										current = createModelElement(grammarAccess.getServiceRule());
            	            									}
            	            									addWithLastConsumed(
            	            										current,
            	            										"expose",
            	            										lv_expose_54_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.INT");
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1534:7: (otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) ) )*
            	            loop16:
            	            do {
            	                int alt16=2;
            	                int LA16_0 = input.LA(1);

            	                if ( (LA16_0==35) ) {
            	                    alt16=1;
            	                }


            	                switch (alt16) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1535:8: otherlv_55= ',' ( (lv_expose_56_0= RULE_INT ) )
            	            	    {
            	            	    otherlv_55=(Token)match(input,35,FOLLOW_18); 

            	            	    								newLeafNode(otherlv_55, grammarAccess.getServiceAccess().getCommaKeyword_3_12_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1539:8: ( (lv_expose_56_0= RULE_INT ) )
            	            	    // InternalDcDsl.g:1540:9: (lv_expose_56_0= RULE_INT )
            	            	    {
            	            	    // InternalDcDsl.g:1540:9: (lv_expose_56_0= RULE_INT )
            	            	    // InternalDcDsl.g:1541:10: lv_expose_56_0= RULE_INT
            	            	    {
            	            	    lv_expose_56_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	            	    										newLeafNode(lv_expose_56_0, grammarAccess.getServiceAccess().getExposeINTTerminalRuleCall_3_12_2_1_2_1_0());
            	            	    									

            	            	    										if (current==null) {
            	            	    											current = createModelElement(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										addWithLastConsumed(
            	            	    											current,
            	            	    											"expose",
            	            	    											lv_expose_56_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.INT");
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop16;
            	                }
            	            } while (true);

            	            otherlv_57=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_57, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_12_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalDcDsl.g:1566:4: (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1566:4: (otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) ) )
            	    // InternalDcDsl.g:1567:5: otherlv_58= 'command' otherlv_59= ':' ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) )
            	    {
            	    otherlv_58=(Token)match(input,51,FOLLOW_3); 

            	    					newLeafNode(otherlv_58, grammarAccess.getServiceAccess().getCommandKeyword_3_13_0());
            	    				
            	    otherlv_59=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_59, grammarAccess.getServiceAccess().getColonKeyword_3_13_1());
            	    				
            	    // InternalDcDsl.g:1575:5: ( (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK ) | (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==RULE_BEG_BLOCK) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==32) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalDcDsl.g:1576:6: (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1576:6: (this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1577:7: this_BEG_BLOCK_60= RULE_BEG_BLOCK (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+ this_END_BLOCK_63= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_60=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_60, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_13_2_0_0());
            	            						
            	            // InternalDcDsl.g:1581:7: (otherlv_61= '-' ( (lv_command_62_0= ruleEString ) ) )+
            	            int cnt18=0;
            	            loop18:
            	            do {
            	                int alt18=2;
            	                int LA18_0 = input.LA(1);

            	                if ( (LA18_0==31) ) {
            	                    alt18=1;
            	                }


            	                switch (alt18) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1582:8: otherlv_61= '-' ( (lv_command_62_0= ruleEString ) )
            	            	    {
            	            	    otherlv_61=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_61, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_13_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1586:8: ( (lv_command_62_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1587:9: (lv_command_62_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1587:9: (lv_command_62_0= ruleEString )
            	            	    // InternalDcDsl.g:1588:10: lv_command_62_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_13_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_command_62_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"command",
            	            	    											lv_command_62_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt18 >= 1 ) break loop18;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(18, input);
            	                        throw eee;
            	                }
            	                cnt18++;
            	            } while (true);

            	            this_END_BLOCK_63=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_63, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_13_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1612:6: (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' )
            	            {
            	            // InternalDcDsl.g:1612:6: (otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']' )
            	            // InternalDcDsl.g:1613:7: otherlv_64= '[' ( (lv_command_65_0= ruleEString ) ) (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )* otherlv_68= ']'
            	            {
            	            otherlv_64=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_64, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_13_2_1_0());
            	            						
            	            // InternalDcDsl.g:1617:7: ( (lv_command_65_0= ruleEString ) )
            	            // InternalDcDsl.g:1618:8: (lv_command_65_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1618:8: (lv_command_65_0= ruleEString )
            	            // InternalDcDsl.g:1619:9: lv_command_65_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_13_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_command_65_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"command",
            	            										lv_command_65_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1636:7: (otherlv_66= ',' ( (lv_command_67_0= ruleEString ) ) )*
            	            loop19:
            	            do {
            	                int alt19=2;
            	                int LA19_0 = input.LA(1);

            	                if ( (LA19_0==35) ) {
            	                    alt19=1;
            	                }


            	                switch (alt19) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1637:8: otherlv_66= ',' ( (lv_command_67_0= ruleEString ) )
            	            	    {
            	            	    otherlv_66=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_66, grammarAccess.getServiceAccess().getCommaKeyword_3_13_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1641:8: ( (lv_command_67_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1642:9: (lv_command_67_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1642:9: (lv_command_67_0= ruleEString )
            	            	    // InternalDcDsl.g:1643:10: lv_command_67_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_13_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_command_67_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"command",
            	            	    											lv_command_67_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop19;
            	                }
            	            } while (true);

            	            otherlv_68=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_68, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_13_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalDcDsl.g:1669:4: (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1669:4: (otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) ) )
            	    // InternalDcDsl.g:1670:5: otherlv_69= 'secrets' otherlv_70= ':' ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) )
            	    {
            	    otherlv_69=(Token)match(input,22,FOLLOW_3); 

            	    					newLeafNode(otherlv_69, grammarAccess.getServiceAccess().getSecretsKeyword_3_14_0());
            	    				
            	    otherlv_70=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_70, grammarAccess.getServiceAccess().getColonKeyword_3_14_1());
            	    				
            	    // InternalDcDsl.g:1678:5: ( (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK ) | (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' ) )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==RULE_BEG_BLOCK) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==32) ) {
            	        alt23=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalDcDsl.g:1679:6: (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1679:6: (this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1680:7: this_BEG_BLOCK_71= RULE_BEG_BLOCK (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+ this_END_BLOCK_74= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_71=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_71, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_14_2_0_0());
            	            						
            	            // InternalDcDsl.g:1684:7: (otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) ) )+
            	            int cnt21=0;
            	            loop21:
            	            do {
            	                int alt21=2;
            	                int LA21_0 = input.LA(1);

            	                if ( (LA21_0==31) ) {
            	                    alt21=1;
            	                }


            	                switch (alt21) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1685:8: otherlv_72= '-' ( (lv_secrets_73_0= ruleEString ) )
            	            	    {
            	            	    otherlv_72=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_72, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_14_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1689:8: ( (lv_secrets_73_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1690:9: (lv_secrets_73_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1690:9: (lv_secrets_73_0= ruleEString )
            	            	    // InternalDcDsl.g:1691:10: lv_secrets_73_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSecretsEStringParserRuleCall_3_14_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_secrets_73_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"secrets",
            	            	    											lv_secrets_73_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt21 >= 1 ) break loop21;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(21, input);
            	                        throw eee;
            	                }
            	                cnt21++;
            	            } while (true);

            	            this_END_BLOCK_74=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_74, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_14_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1715:6: (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' )
            	            {
            	            // InternalDcDsl.g:1715:6: (otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']' )
            	            // InternalDcDsl.g:1716:7: otherlv_75= '[' ( (lv_secrets_76_0= ruleEString ) ) (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )* otherlv_79= ']'
            	            {
            	            otherlv_75=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_75, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_14_2_1_0());
            	            						
            	            // InternalDcDsl.g:1720:7: ( (lv_secrets_76_0= ruleEString ) )
            	            // InternalDcDsl.g:1721:8: (lv_secrets_76_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1721:8: (lv_secrets_76_0= ruleEString )
            	            // InternalDcDsl.g:1722:9: lv_secrets_76_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getSecretsEStringParserRuleCall_3_14_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_secrets_76_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"secrets",
            	            										lv_secrets_76_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1739:7: (otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) ) )*
            	            loop22:
            	            do {
            	                int alt22=2;
            	                int LA22_0 = input.LA(1);

            	                if ( (LA22_0==35) ) {
            	                    alt22=1;
            	                }


            	                switch (alt22) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1740:8: otherlv_77= ',' ( (lv_secrets_78_0= ruleEString ) )
            	            	    {
            	            	    otherlv_77=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_77, grammarAccess.getServiceAccess().getCommaKeyword_3_14_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1744:8: ( (lv_secrets_78_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1745:9: (lv_secrets_78_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1745:9: (lv_secrets_78_0= ruleEString )
            	            	    // InternalDcDsl.g:1746:10: lv_secrets_78_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSecretsEStringParserRuleCall_3_14_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_secrets_78_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"secrets",
            	            	    											lv_secrets_78_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop22;
            	                }
            	            } while (true);

            	            otherlv_79=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_79, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_14_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalDcDsl.g:1772:4: (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1772:4: (otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) ) )
            	    // InternalDcDsl.g:1773:5: otherlv_80= 'cap_add' otherlv_81= ':' ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) )
            	    {
            	    otherlv_80=(Token)match(input,52,FOLLOW_3); 

            	    					newLeafNode(otherlv_80, grammarAccess.getServiceAccess().getCap_addKeyword_3_15_0());
            	    				
            	    otherlv_81=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_81, grammarAccess.getServiceAccess().getColonKeyword_3_15_1());
            	    				
            	    // InternalDcDsl.g:1781:5: ( (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK ) | (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_BEG_BLOCK) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==32) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // InternalDcDsl.g:1782:6: (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1782:6: (this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1783:7: this_BEG_BLOCK_82= RULE_BEG_BLOCK (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+ this_END_BLOCK_85= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_82=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_82, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_15_2_0_0());
            	            						
            	            // InternalDcDsl.g:1787:7: (otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) ) )+
            	            int cnt24=0;
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==31) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1788:8: otherlv_83= '-' ( (lv_capAdd_84_0= ruleEString ) )
            	            	    {
            	            	    otherlv_83=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_83, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_15_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1792:8: ( (lv_capAdd_84_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1793:9: (lv_capAdd_84_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1793:9: (lv_capAdd_84_0= ruleEString )
            	            	    // InternalDcDsl.g:1794:10: lv_capAdd_84_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCapAddEStringParserRuleCall_3_15_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_capAdd_84_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"capAdd",
            	            	    											lv_capAdd_84_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


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

            	            this_END_BLOCK_85=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_85, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_15_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1818:6: (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' )
            	            {
            	            // InternalDcDsl.g:1818:6: (otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']' )
            	            // InternalDcDsl.g:1819:7: otherlv_86= '[' ( (lv_capAdd_87_0= ruleEString ) ) (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )* otherlv_90= ']'
            	            {
            	            otherlv_86=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_86, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_15_2_1_0());
            	            						
            	            // InternalDcDsl.g:1823:7: ( (lv_capAdd_87_0= ruleEString ) )
            	            // InternalDcDsl.g:1824:8: (lv_capAdd_87_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1824:8: (lv_capAdd_87_0= ruleEString )
            	            // InternalDcDsl.g:1825:9: lv_capAdd_87_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getCapAddEStringParserRuleCall_3_15_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_capAdd_87_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"capAdd",
            	            										lv_capAdd_87_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1842:7: (otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==35) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1843:8: otherlv_88= ',' ( (lv_capAdd_89_0= ruleEString ) )
            	            	    {
            	            	    otherlv_88=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_88, grammarAccess.getServiceAccess().getCommaKeyword_3_15_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1847:8: ( (lv_capAdd_89_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1848:9: (lv_capAdd_89_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1848:9: (lv_capAdd_89_0= ruleEString )
            	            	    // InternalDcDsl.g:1849:10: lv_capAdd_89_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCapAddEStringParserRuleCall_3_15_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_capAdd_89_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"capAdd",
            	            	    											lv_capAdd_89_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop25;
            	                }
            	            } while (true);

            	            otherlv_90=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_90, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_15_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalDcDsl.g:1875:4: (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1875:4: (otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) )
            	    // InternalDcDsl.g:1876:5: otherlv_91= 'labels' otherlv_92= ':' ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) )
            	    {
            	    otherlv_91=(Token)match(input,53,FOLLOW_3); 

            	    					newLeafNode(otherlv_91, grammarAccess.getServiceAccess().getLabelsKeyword_3_16_0());
            	    				
            	    otherlv_92=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_92, grammarAccess.getServiceAccess().getColonKeyword_3_16_1());
            	    				
            	    // InternalDcDsl.g:1884:5: ( (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' ) )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==RULE_BEG_BLOCK) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==32) ) {
            	        alt29=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalDcDsl.g:1885:6: (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1885:6: (this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1886:7: this_BEG_BLOCK_93= RULE_BEG_BLOCK (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+ this_END_BLOCK_96= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_93=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_93, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_16_2_0_0());
            	            						
            	            // InternalDcDsl.g:1890:7: (otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) ) )+
            	            int cnt27=0;
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==31) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1891:8: otherlv_94= '-' ( (lv_labels_95_0= ruleEString ) )
            	            	    {
            	            	    otherlv_94=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_94, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_16_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1895:8: ( (lv_labels_95_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1896:9: (lv_labels_95_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1896:9: (lv_labels_95_0= ruleEString )
            	            	    // InternalDcDsl.g:1897:10: lv_labels_95_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getLabelsEStringParserRuleCall_3_16_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_labels_95_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"labels",
            	            	    											lv_labels_95_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


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

            	            this_END_BLOCK_96=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_96, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_16_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1921:6: (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' )
            	            {
            	            // InternalDcDsl.g:1921:6: (otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']' )
            	            // InternalDcDsl.g:1922:7: otherlv_97= '[' ( (lv_labels_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )* otherlv_101= ']'
            	            {
            	            otherlv_97=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_97, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_16_2_1_0());
            	            						
            	            // InternalDcDsl.g:1926:7: ( (lv_labels_98_0= ruleEString ) )
            	            // InternalDcDsl.g:1927:8: (lv_labels_98_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1927:8: (lv_labels_98_0= ruleEString )
            	            // InternalDcDsl.g:1928:9: lv_labels_98_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getLabelsEStringParserRuleCall_3_16_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_labels_98_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"labels",
            	            										lv_labels_98_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1945:7: (otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) ) )*
            	            loop28:
            	            do {
            	                int alt28=2;
            	                int LA28_0 = input.LA(1);

            	                if ( (LA28_0==35) ) {
            	                    alt28=1;
            	                }


            	                switch (alt28) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1946:8: otherlv_99= ',' ( (lv_labels_100_0= ruleEString ) )
            	            	    {
            	            	    otherlv_99=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_99, grammarAccess.getServiceAccess().getCommaKeyword_3_16_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1950:8: ( (lv_labels_100_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1951:9: (lv_labels_100_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1951:9: (lv_labels_100_0= ruleEString )
            	            	    // InternalDcDsl.g:1952:10: lv_labels_100_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getLabelsEStringParserRuleCall_3_16_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_labels_100_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"labels",
            	            	    											lv_labels_100_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop28;
            	                }
            	            } while (true);

            	            otherlv_101=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_101, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_16_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalDcDsl.g:1978:4: (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1978:4: (otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) ) )
            	    // InternalDcDsl.g:1979:5: otherlv_102= 'sysctls' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) )
            	    {
            	    otherlv_102=(Token)match(input,54,FOLLOW_3); 

            	    					newLeafNode(otherlv_102, grammarAccess.getServiceAccess().getSysctlsKeyword_3_17_0());
            	    				
            	    otherlv_103=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_103, grammarAccess.getServiceAccess().getColonKeyword_3_17_1());
            	    				
            	    // InternalDcDsl.g:1987:5: ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK ) | (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' ) )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==RULE_BEG_BLOCK) ) {
            	        alt32=1;
            	    }
            	    else if ( (LA32_0==32) ) {
            	        alt32=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 32, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt32) {
            	        case 1 :
            	            // InternalDcDsl.g:1988:6: (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1988:6: (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1989:7: this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+ this_END_BLOCK_107= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_104=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_104, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_17_2_0_0());
            	            						
            	            // InternalDcDsl.g:1993:7: (otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) ) )+
            	            int cnt30=0;
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==31) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1994:8: otherlv_105= '-' ( (lv_sysctls_106_0= ruleEString ) )
            	            	    {
            	            	    otherlv_105=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_105, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_17_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1998:8: ( (lv_sysctls_106_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1999:9: (lv_sysctls_106_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1999:9: (lv_sysctls_106_0= ruleEString )
            	            	    // InternalDcDsl.g:2000:10: lv_sysctls_106_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSysctlsEStringParserRuleCall_3_17_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_sysctls_106_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"sysctls",
            	            	    											lv_sysctls_106_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


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

            	            this_END_BLOCK_107=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_107, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_17_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:2024:6: (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' )
            	            {
            	            // InternalDcDsl.g:2024:6: (otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']' )
            	            // InternalDcDsl.g:2025:7: otherlv_108= '[' ( (lv_sysctls_109_0= ruleEString ) ) (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )* otherlv_112= ']'
            	            {
            	            otherlv_108=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_108, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_17_2_1_0());
            	            						
            	            // InternalDcDsl.g:2029:7: ( (lv_sysctls_109_0= ruleEString ) )
            	            // InternalDcDsl.g:2030:8: (lv_sysctls_109_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:2030:8: (lv_sysctls_109_0= ruleEString )
            	            // InternalDcDsl.g:2031:9: lv_sysctls_109_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getSysctlsEStringParserRuleCall_3_17_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_sysctls_109_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"sysctls",
            	            										lv_sysctls_109_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:2048:7: (otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) ) )*
            	            loop31:
            	            do {
            	                int alt31=2;
            	                int LA31_0 = input.LA(1);

            	                if ( (LA31_0==35) ) {
            	                    alt31=1;
            	                }


            	                switch (alt31) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2049:8: otherlv_110= ',' ( (lv_sysctls_111_0= ruleEString ) )
            	            	    {
            	            	    otherlv_110=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_110, grammarAccess.getServiceAccess().getCommaKeyword_3_17_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:2053:8: ( (lv_sysctls_111_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2054:9: (lv_sysctls_111_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2054:9: (lv_sysctls_111_0= ruleEString )
            	            	    // InternalDcDsl.g:2055:10: lv_sysctls_111_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSysctlsEStringParserRuleCall_3_17_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_sysctls_111_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"sysctls",
            	            	    											lv_sysctls_111_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop31;
            	                }
            	            } while (true);

            	            otherlv_112=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_112, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_17_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalDcDsl.g:2081:4: (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:2081:4: (otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK )
            	    // InternalDcDsl.g:2082:5: otherlv_113= 'environment' otherlv_114= ':' this_BEG_BLOCK_115= RULE_BEG_BLOCK ( (lv_environment_116_0= ruleKeyValuePair ) )+ this_END_BLOCK_117= RULE_END_BLOCK
            	    {
            	    otherlv_113=(Token)match(input,55,FOLLOW_3); 

            	    					newLeafNode(otherlv_113, grammarAccess.getServiceAccess().getEnvironmentKeyword_3_18_0());
            	    				
            	    otherlv_114=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_114, grammarAccess.getServiceAccess().getColonKeyword_3_18_1());
            	    				
            	    this_BEG_BLOCK_115=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	    					newLeafNode(this_BEG_BLOCK_115, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_18_2());
            	    				
            	    // InternalDcDsl.g:2094:5: ( (lv_environment_116_0= ruleKeyValuePair ) )+
            	    int cnt33=0;
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==RULE_YAML_SCALAR||(LA33_0>=RULE_ID && LA33_0<=RULE_INT)||LA33_0==16||(LA33_0>=18 && LA33_0<=22)||(LA33_0>=38 && LA33_0<=77)) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:2095:6: (lv_environment_116_0= ruleKeyValuePair )
            	    	    {
            	    	    // InternalDcDsl.g:2095:6: (lv_environment_116_0= ruleKeyValuePair )
            	    	    // InternalDcDsl.g:2096:7: lv_environment_116_0= ruleKeyValuePair
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentKeyValuePairParserRuleCall_3_18_3_0());
            	    	    						
            	    	    pushFollow(FOLLOW_20);
            	    	    lv_environment_116_0=ruleKeyValuePair();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"environment",
            	    	    								lv_environment_116_0,
            	    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.KeyValuePair");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt33 >= 1 ) break loop33;
            	                EarlyExitException eee =
            	                    new EarlyExitException(33, input);
            	                throw eee;
            	        }
            	        cnt33++;
            	    } while (true);

            	    this_END_BLOCK_117=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	    					newLeafNode(this_END_BLOCK_117, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_18_4());
            	    				

            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalDcDsl.g:2119:4: (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) )
            	    {
            	    // InternalDcDsl.g:2119:4: (otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) ) )
            	    // InternalDcDsl.g:2120:5: otherlv_118= 'depends_on' otherlv_119= ':' ( (lv_dependsOn_120_0= ruleDepends_on ) )
            	    {
            	    otherlv_118=(Token)match(input,56,FOLLOW_3); 

            	    					newLeafNode(otherlv_118, grammarAccess.getServiceAccess().getDepends_onKeyword_3_19_0());
            	    				
            	    otherlv_119=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_119, grammarAccess.getServiceAccess().getColonKeyword_3_19_1());
            	    				
            	    // InternalDcDsl.g:2128:5: ( (lv_dependsOn_120_0= ruleDepends_on ) )
            	    // InternalDcDsl.g:2129:6: (lv_dependsOn_120_0= ruleDepends_on )
            	    {
            	    // InternalDcDsl.g:2129:6: (lv_dependsOn_120_0= ruleDepends_on )
            	    // InternalDcDsl.g:2130:7: lv_dependsOn_120_0= ruleDepends_on
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDependsOnDepends_onParserRuleCall_3_19_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_dependsOn_120_0=ruleDepends_on();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"dependsOn",
            	    								lv_dependsOn_120_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Depends_on");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalDcDsl.g:2149:4: (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) )
            	    {
            	    // InternalDcDsl.g:2149:4: (otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) ) )
            	    // InternalDcDsl.g:2150:5: otherlv_121= 'networks' otherlv_122= ':' ( (lv_networks_123_0= ruleNetworks ) )
            	    {
            	    otherlv_121=(Token)match(input,20,FOLLOW_3); 

            	    					newLeafNode(otherlv_121, grammarAccess.getServiceAccess().getNetworksKeyword_3_20_0());
            	    				
            	    otherlv_122=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_122, grammarAccess.getServiceAccess().getColonKeyword_3_20_1());
            	    				
            	    // InternalDcDsl.g:2158:5: ( (lv_networks_123_0= ruleNetworks ) )
            	    // InternalDcDsl.g:2159:6: (lv_networks_123_0= ruleNetworks )
            	    {
            	    // InternalDcDsl.g:2159:6: (lv_networks_123_0= ruleNetworks )
            	    // InternalDcDsl.g:2160:7: lv_networks_123_0= ruleNetworks
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworksParserRuleCall_3_20_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_networks_123_0=ruleNetworks();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"networks",
            	    								lv_networks_123_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Networks");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalDcDsl.g:2179:4: (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:2179:4: (otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK )
            	    // InternalDcDsl.g:2180:5: otherlv_124= 'volumes' otherlv_125= ':' this_BEG_BLOCK_126= RULE_BEG_BLOCK ( (lv_volumes_127_0= ruleServiceVolume ) )+ this_END_BLOCK_128= RULE_END_BLOCK
            	    {
            	    otherlv_124=(Token)match(input,21,FOLLOW_3); 

            	    					newLeafNode(otherlv_124, grammarAccess.getServiceAccess().getVolumesKeyword_3_21_0());
            	    				
            	    otherlv_125=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_125, grammarAccess.getServiceAccess().getColonKeyword_3_21_1());
            	    				
            	    this_BEG_BLOCK_126=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	    					newLeafNode(this_BEG_BLOCK_126, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_21_2());
            	    				
            	    // InternalDcDsl.g:2192:5: ( (lv_volumes_127_0= ruleServiceVolume ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==31) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:2193:6: (lv_volumes_127_0= ruleServiceVolume )
            	    	    {
            	    	    // InternalDcDsl.g:2193:6: (lv_volumes_127_0= ruleServiceVolume )
            	    	    // InternalDcDsl.g:2194:7: lv_volumes_127_0= ruleServiceVolume
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getServiceAccess().getVolumesServiceVolumeParserRuleCall_3_21_3_0());
            	    	    						
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_volumes_127_0=ruleServiceVolume();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"volumes",
            	    	    								lv_volumes_127_0,
            	    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.ServiceVolume");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


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

            	    this_END_BLOCK_128=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	    					newLeafNode(this_END_BLOCK_128, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_21_4());
            	    				

            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalDcDsl.g:2217:4: (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) )
            	    {
            	    // InternalDcDsl.g:2217:4: (otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) ) )
            	    // InternalDcDsl.g:2218:5: otherlv_129= 'healthcheck' otherlv_130= ':' ( (lv_healthcheck_131_0= ruleHealthcheck ) )
            	    {
            	    otherlv_129=(Token)match(input,57,FOLLOW_3); 

            	    					newLeafNode(otherlv_129, grammarAccess.getServiceAccess().getHealthcheckKeyword_3_22_0());
            	    				
            	    otherlv_130=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_130, grammarAccess.getServiceAccess().getColonKeyword_3_22_1());
            	    				
            	    // InternalDcDsl.g:2226:5: ( (lv_healthcheck_131_0= ruleHealthcheck ) )
            	    // InternalDcDsl.g:2227:6: (lv_healthcheck_131_0= ruleHealthcheck )
            	    {
            	    // InternalDcDsl.g:2227:6: (lv_healthcheck_131_0= ruleHealthcheck )
            	    // InternalDcDsl.g:2228:7: lv_healthcheck_131_0= ruleHealthcheck
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getHealthcheckHealthcheckParserRuleCall_3_22_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_healthcheck_131_0=ruleHealthcheck();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"healthcheck",
            	    								lv_healthcheck_131_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Healthcheck");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalDcDsl.g:2247:4: (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:2247:4: (otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK )
            	    // InternalDcDsl.g:2248:5: otherlv_132= 'deploy' otherlv_133= ':' this_BEG_BLOCK_134= RULE_BEG_BLOCK ( (lv_deploy_135_0= ruleResource ) )+ this_END_BLOCK_136= RULE_END_BLOCK
            	    {
            	    otherlv_132=(Token)match(input,58,FOLLOW_3); 

            	    					newLeafNode(otherlv_132, grammarAccess.getServiceAccess().getDeployKeyword_3_23_0());
            	    				
            	    otherlv_133=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_133, grammarAccess.getServiceAccess().getColonKeyword_3_23_1());
            	    				
            	    this_BEG_BLOCK_134=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	    					newLeafNode(this_BEG_BLOCK_134, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_23_2());
            	    				
            	    // InternalDcDsl.g:2260:5: ( (lv_deploy_135_0= ruleResource ) )+
            	    int cnt35=0;
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( ((LA35_0>=RULE_STRING && LA35_0<=RULE_INT)||(LA35_0>=23 && LA35_0<=30)) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:2261:6: (lv_deploy_135_0= ruleResource )
            	    	    {
            	    	    // InternalDcDsl.g:2261:6: (lv_deploy_135_0= ruleResource )
            	    	    // InternalDcDsl.g:2262:7: lv_deploy_135_0= ruleResource
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getServiceAccess().getDeployResourceParserRuleCall_3_23_3_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_deploy_135_0=ruleResource();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"deploy",
            	    	    								lv_deploy_135_0,
            	    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Resource");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt35 >= 1 ) break loop35;
            	                EarlyExitException eee =
            	                    new EarlyExitException(35, input);
            	                throw eee;
            	        }
            	        cnt35++;
            	    } while (true);

            	    this_END_BLOCK_136=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	    					newLeafNode(this_END_BLOCK_136, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_23_4());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            this_END_BLOCK_137=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_137, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleService"


    // $ANTLR start "entryRuleServiceVolume"
    // InternalDcDsl.g:2293:1: entryRuleServiceVolume returns [EObject current=null] : iv_ruleServiceVolume= ruleServiceVolume EOF ;
    public final EObject entryRuleServiceVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceVolume = null;


        try {
            // InternalDcDsl.g:2293:54: (iv_ruleServiceVolume= ruleServiceVolume EOF )
            // InternalDcDsl.g:2294:2: iv_ruleServiceVolume= ruleServiceVolume EOF
            {
             newCompositeNode(grammarAccess.getServiceVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceVolume=ruleServiceVolume();

            state._fsp--;

             current =iv_ruleServiceVolume; 
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
    // $ANTLR end "entryRuleServiceVolume"


    // $ANTLR start "ruleServiceVolume"
    // InternalDcDsl.g:2300:1: ruleServiceVolume returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
    public final EObject ruleServiceVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEG_BLOCK_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token this_END_BLOCK_17=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;

        AntlrDatatypeRuleToken lv_type_7_0 = null;

        AntlrDatatypeRuleToken lv_source_10_0 = null;

        AntlrDatatypeRuleToken lv_target_13_0 = null;

        AntlrDatatypeRuleToken lv_readOnly_16_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2306:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalDcDsl.g:2307:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalDcDsl.g:2307:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalDcDsl.g:2308:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceVolumeAccess().getHyphenMinusKeyword_0());
            		
            // InternalDcDsl.g:2312:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_BEG_BLOCK) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDcDsl.g:2313:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_22); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getServiceVolumeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalDcDsl.g:2318:3: ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_INT)||(LA39_0>=23 && LA39_0<=30)) ) {
                alt39=1;
            }
            else if ( (LA39_0==EOF||LA39_0==RULE_END_BLOCK||LA39_0==31||LA39_0==61||(LA39_0>=68 && LA39_0<=70)) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalDcDsl.g:2319:4: ( () ( (lv_value_3_0= ruleEString ) ) )
                    {
                    // InternalDcDsl.g:2319:4: ( () ( (lv_value_3_0= ruleEString ) ) )
                    // InternalDcDsl.g:2320:5: () ( (lv_value_3_0= ruleEString ) )
                    {
                    // InternalDcDsl.g:2320:5: ()
                    // InternalDcDsl.g:2321:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getServiceVolumeAccess().getVolumeValueAction_2_0_0(),
                    							current);
                    					

                    }

                    // InternalDcDsl.g:2327:5: ( (lv_value_3_0= ruleEString ) )
                    // InternalDcDsl.g:2328:6: (lv_value_3_0= ruleEString )
                    {
                    // InternalDcDsl.g:2328:6: (lv_value_3_0= ruleEString )
                    // InternalDcDsl.g:2329:7: lv_value_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getServiceVolumeAccess().getValueEStringParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_23);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getServiceVolumeRule());
                    							}
                    							add(
                    								current,
                    								"value",
                    								lv_value_3_0,
                    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:2348:4: ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* )
                    {
                    // InternalDcDsl.g:2348:4: ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* )
                    // InternalDcDsl.g:2349:5: () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )*
                    {
                    // InternalDcDsl.g:2349:5: ()
                    // InternalDcDsl.g:2350:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getServiceVolumeAccess().getVolumeObjectAction_2_1_0(),
                    							current);
                    					

                    }

                    // InternalDcDsl.g:2356:5: ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )*
                    loop38:
                    do {
                        int alt38=5;
                        switch ( input.LA(1) ) {
                        case 68:
                            {
                            alt38=1;
                            }
                            break;
                        case 69:
                            {
                            alt38=2;
                            }
                            break;
                        case 61:
                            {
                            alt38=3;
                            }
                            break;
                        case 70:
                            {
                            alt38=4;
                            }
                            break;

                        }

                        switch (alt38) {
                    	case 1 :
                    	    // InternalDcDsl.g:2357:6: (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:2357:6: (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:2358:7: otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,68,FOLLOW_3); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getServiceVolumeAccess().getTypeKeyword_2_1_1_0_0());
                    	    						
                    	    otherlv_6=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_0_1());
                    	    						
                    	    // InternalDcDsl.g:2366:7: ( (lv_type_7_0= ruleEString ) )
                    	    // InternalDcDsl.g:2367:8: (lv_type_7_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:2367:8: (lv_type_7_0= ruleEString )
                    	    // InternalDcDsl.g:2368:9: lv_type_7_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getTypeEStringParserRuleCall_2_1_1_0_2_0());
                    	    								
                    	    pushFollow(FOLLOW_24);
                    	    lv_type_7_0=ruleEString();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getServiceVolumeRule());
                    	    									}
                    	    									set(
                    	    										current,
                    	    										"type",
                    	    										lv_type_7_0,
                    	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDcDsl.g:2387:6: (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:2387:6: (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:2388:7: otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,69,FOLLOW_3); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getServiceVolumeAccess().getSourceKeyword_2_1_1_1_0());
                    	    						
                    	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_1_1());
                    	    						
                    	    // InternalDcDsl.g:2396:7: ( (lv_source_10_0= ruleEString ) )
                    	    // InternalDcDsl.g:2397:8: (lv_source_10_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:2397:8: (lv_source_10_0= ruleEString )
                    	    // InternalDcDsl.g:2398:9: lv_source_10_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getSourceEStringParserRuleCall_2_1_1_1_2_0());
                    	    								
                    	    pushFollow(FOLLOW_24);
                    	    lv_source_10_0=ruleEString();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getServiceVolumeRule());
                    	    									}
                    	    									set(
                    	    										current,
                    	    										"source",
                    	    										lv_source_10_0,
                    	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalDcDsl.g:2417:6: (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:2417:6: (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:2418:7: otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,61,FOLLOW_3); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getServiceVolumeAccess().getTargetKeyword_2_1_1_2_0());
                    	    						
                    	    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_2_1());
                    	    						
                    	    // InternalDcDsl.g:2426:7: ( (lv_target_13_0= ruleEString ) )
                    	    // InternalDcDsl.g:2427:8: (lv_target_13_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:2427:8: (lv_target_13_0= ruleEString )
                    	    // InternalDcDsl.g:2428:9: lv_target_13_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getTargetEStringParserRuleCall_2_1_1_2_2_0());
                    	    								
                    	    pushFollow(FOLLOW_24);
                    	    lv_target_13_0=ruleEString();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getServiceVolumeRule());
                    	    									}
                    	    									set(
                    	    										current,
                    	    										"target",
                    	    										lv_target_13_0,
                    	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalDcDsl.g:2447:6: (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) )
                    	    {
                    	    // InternalDcDsl.g:2447:6: (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) )
                    	    // InternalDcDsl.g:2448:7: otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_14=(Token)match(input,70,FOLLOW_3); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getServiceVolumeAccess().getRead_onlyKeyword_2_1_1_3_0());
                    	    						
                    	    otherlv_15=(Token)match(input,17,FOLLOW_13); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_3_1());
                    	    						
                    	    // InternalDcDsl.g:2456:7: ( (lv_readOnly_16_0= ruleEBoolean ) )
                    	    // InternalDcDsl.g:2457:8: (lv_readOnly_16_0= ruleEBoolean )
                    	    {
                    	    // InternalDcDsl.g:2457:8: (lv_readOnly_16_0= ruleEBoolean )
                    	    // InternalDcDsl.g:2458:9: lv_readOnly_16_0= ruleEBoolean
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getReadOnlyEBooleanParserRuleCall_2_1_1_3_2_0());
                    	    								
                    	    pushFollow(FOLLOW_24);
                    	    lv_readOnly_16_0=ruleEBoolean();

                    	    state._fsp--;


                    	    									if (current==null) {
                    	    										current = createModelElementForParent(grammarAccess.getServiceVolumeRule());
                    	    									}
                    	    									set(
                    	    										current,
                    	    										"readOnly",
                    	    										lv_readOnly_16_0,
                    	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EBoolean");
                    	    									afterParserOrEnumRuleCall();
                    	    								

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalDcDsl.g:2479:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_END_BLOCK) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==RULE_END_BLOCK) ) {
                    int LA40_3 = input.LA(3);

                    if ( (LA40_3==RULE_END_BLOCK) ) {
                        int LA40_5 = input.LA(4);

                        if ( (LA40_5==EOF) ) {
                            int LA40_6 = input.LA(5);

                            if ( (LA40_6==EOF) ) {
                                alt40=1;
                            }
                        }
                        else if ( ((LA40_5>=RULE_END_BLOCK && LA40_5<=RULE_INT)||(LA40_5>=23 && LA40_5<=30)) ) {
                            alt40=1;
                        }
                    }
                    else if ( ((LA40_3>=20 && LA40_3<=22)||(LA40_3>=38 && LA40_3<=58)) ) {
                        alt40=1;
                    }
                }
                else if ( (LA40_1==EOF||LA40_1==31) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalDcDsl.g:2480:4: this_END_BLOCK_17= RULE_END_BLOCK
                    {
                    this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_17, grammarAccess.getServiceVolumeAccess().getEND_BLOCKTerminalRuleCall_3());
                    			

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
    // $ANTLR end "ruleServiceVolume"


    // $ANTLR start "entryRuleNamedVolume"
    // InternalDcDsl.g:2489:1: entryRuleNamedVolume returns [EObject current=null] : iv_ruleNamedVolume= ruleNamedVolume EOF ;
    public final EObject entryRuleNamedVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedVolume = null;


        try {
            // InternalDcDsl.g:2489:52: (iv_ruleNamedVolume= ruleNamedVolume EOF )
            // InternalDcDsl.g:2490:2: iv_ruleNamedVolume= ruleNamedVolume EOF
            {
             newCompositeNode(grammarAccess.getNamedVolumeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamedVolume=ruleNamedVolume();

            state._fsp--;

             current =iv_ruleNamedVolume; 
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
    // $ANTLR end "entryRuleNamedVolume"


    // $ANTLR start "ruleNamedVolume"
    // InternalDcDsl.g:2496:1: ruleNamedVolume returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ) ;
    public final EObject ruleNamedVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2502:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ) )
            // InternalDcDsl.g:2503:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' )
            {
            // InternalDcDsl.g:2503:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' )
            // InternalDcDsl.g:2504:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':'
            {
            // InternalDcDsl.g:2504:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:2505:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:2505:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:2506:5: lv_id_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNamedVolumeAccess().getIdEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNamedVolumeRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedVolumeAccess().getColonKeyword_1());
            		

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
    // $ANTLR end "ruleNamedVolume"


    // $ANTLR start "entryRuleBuild"
    // InternalDcDsl.g:2531:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // InternalDcDsl.g:2531:46: (iv_ruleBuild= ruleBuild EOF )
            // InternalDcDsl.g:2532:2: iv_ruleBuild= ruleBuild EOF
            {
             newCompositeNode(grammarAccess.getBuildRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuild=ruleBuild();

            state._fsp--;

             current =iv_ruleBuild; 
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
    // $ANTLR end "entryRuleBuild"


    // $ANTLR start "ruleBuild"
    // InternalDcDsl.g:2538:1: ruleBuild returns [EObject current=null] : (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        EObject this_BuildObject_0 = null;

        EObject this_BuildValue_1 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2544:2: ( (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue ) )
            // InternalDcDsl.g:2545:2: (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue )
            {
            // InternalDcDsl.g:2545:2: (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_BEG_BLOCK) ) {
                alt41=1;
            }
            else if ( ((LA41_0>=RULE_STRING && LA41_0<=RULE_INT)||(LA41_0>=23 && LA41_0<=30)) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalDcDsl.g:2546:3: this_BuildObject_0= ruleBuildObject
                    {

                    			newCompositeNode(grammarAccess.getBuildAccess().getBuildObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildObject_0=ruleBuildObject();

                    state._fsp--;


                    			current = this_BuildObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:2555:3: this_BuildValue_1= ruleBuildValue
                    {

                    			newCompositeNode(grammarAccess.getBuildAccess().getBuildValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BuildValue_1=ruleBuildValue();

                    state._fsp--;


                    			current = this_BuildValue_1;
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
    // $ANTLR end "ruleBuild"


    // $ANTLR start "entryRuleBuildValue"
    // InternalDcDsl.g:2567:1: entryRuleBuildValue returns [EObject current=null] : iv_ruleBuildValue= ruleBuildValue EOF ;
    public final EObject entryRuleBuildValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildValue = null;


        try {
            // InternalDcDsl.g:2567:51: (iv_ruleBuildValue= ruleBuildValue EOF )
            // InternalDcDsl.g:2568:2: iv_ruleBuildValue= ruleBuildValue EOF
            {
             newCompositeNode(grammarAccess.getBuildValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildValue=ruleBuildValue();

            state._fsp--;

             current =iv_ruleBuildValue; 
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
    // $ANTLR end "entryRuleBuildValue"


    // $ANTLR start "ruleBuildValue"
    // InternalDcDsl.g:2574:1: ruleBuildValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleBuildValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2580:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDcDsl.g:2581:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDcDsl.g:2581:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDcDsl.g:2582:3: (lv_value_0_0= ruleEString )
            {
            // InternalDcDsl.g:2582:3: (lv_value_0_0= ruleEString )
            // InternalDcDsl.g:2583:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getBuildValueAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getBuildValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleBuildValue"


    // $ANTLR start "entryRuleBuildObject"
    // InternalDcDsl.g:2603:1: entryRuleBuildObject returns [EObject current=null] : iv_ruleBuildObject= ruleBuildObject EOF ;
    public final EObject entryRuleBuildObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildObject = null;


        try {
            // InternalDcDsl.g:2603:52: (iv_ruleBuildObject= ruleBuildObject EOF )
            // InternalDcDsl.g:2604:2: iv_ruleBuildObject= ruleBuildObject EOF
            {
             newCompositeNode(grammarAccess.getBuildObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBuildObject=ruleBuildObject();

            state._fsp--;

             current =iv_ruleBuildObject; 
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
    // $ANTLR end "entryRuleBuildObject"


    // $ANTLR start "ruleBuildObject"
    // InternalDcDsl.g:2610:1: ruleBuildObject returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) ) )* this_END_BLOCK_22= RULE_END_BLOCK ) ;
    public final EObject ruleBuildObject() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_BEG_BLOCK_13=null;
        Token otherlv_14=null;
        Token this_END_BLOCK_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token this_END_BLOCK_22=null;
        AntlrDatatypeRuleToken lv_context_4_0 = null;

        AntlrDatatypeRuleToken lv_dockerfile_7_0 = null;

        AntlrDatatypeRuleToken lv_target_10_0 = null;

        AntlrDatatypeRuleToken lv_args_15_0 = null;

        AntlrDatatypeRuleToken lv_args_18_0 = null;

        AntlrDatatypeRuleToken lv_args_20_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2616:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) ) )* this_END_BLOCK_22= RULE_END_BLOCK ) )
            // InternalDcDsl.g:2617:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) ) )* this_END_BLOCK_22= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:2617:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) ) )* this_END_BLOCK_22= RULE_END_BLOCK )
            // InternalDcDsl.g:2618:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) ) )* this_END_BLOCK_22= RULE_END_BLOCK
            {
            // InternalDcDsl.g:2618:3: ()
            // InternalDcDsl.g:2619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildObjectAccess().getBuildObjectAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getBuildObjectAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalDcDsl.g:2629:3: ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) ) )*
            loop45:
            do {
                int alt45=5;
                switch ( input.LA(1) ) {
                case 59:
                    {
                    alt45=1;
                    }
                    break;
                case 60:
                    {
                    alt45=2;
                    }
                    break;
                case 61:
                    {
                    alt45=3;
                    }
                    break;
                case 62:
                    {
                    alt45=4;
                    }
                    break;

                }

                switch (alt45) {
            	case 1 :
            	    // InternalDcDsl.g:2630:4: (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:2630:4: (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) )
            	    // InternalDcDsl.g:2631:5: otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,59,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBuildObjectAccess().getContextKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getBuildObjectAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalDcDsl.g:2639:5: ( (lv_context_4_0= ruleEString ) )
            	    // InternalDcDsl.g:2640:6: (lv_context_4_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:2640:6: (lv_context_4_0= ruleEString )
            	    // InternalDcDsl.g:2641:7: lv_context_4_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getBuildObjectAccess().getContextEStringParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_context_4_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	    							}
            	    							set(
            	    								current,
            	    								"context",
            	    								lv_context_4_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDcDsl.g:2660:4: (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:2660:4: (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) )
            	    // InternalDcDsl.g:2661:5: otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getBuildObjectAccess().getDockerfileKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_6, grammarAccess.getBuildObjectAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalDcDsl.g:2669:5: ( (lv_dockerfile_7_0= ruleEString ) )
            	    // InternalDcDsl.g:2670:6: (lv_dockerfile_7_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:2670:6: (lv_dockerfile_7_0= ruleEString )
            	    // InternalDcDsl.g:2671:7: lv_dockerfile_7_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getBuildObjectAccess().getDockerfileEStringParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_dockerfile_7_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	    							}
            	    							set(
            	    								current,
            	    								"dockerfile",
            	    								lv_dockerfile_7_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDcDsl.g:2690:4: (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:2690:4: (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) )
            	    // InternalDcDsl.g:2691:5: otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,61,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getBuildObjectAccess().getTargetKeyword_2_2_0());
            	    				
            	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_9, grammarAccess.getBuildObjectAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalDcDsl.g:2699:5: ( (lv_target_10_0= ruleEString ) )
            	    // InternalDcDsl.g:2700:6: (lv_target_10_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:2700:6: (lv_target_10_0= ruleEString )
            	    // InternalDcDsl.g:2701:7: lv_target_10_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getBuildObjectAccess().getTargetEStringParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_target_10_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	    							}
            	    							set(
            	    								current,
            	    								"target",
            	    								lv_target_10_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDcDsl.g:2720:4: (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:2720:4: (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) ) )
            	    // InternalDcDsl.g:2721:5: otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) )
            	    {
            	    otherlv_11=(Token)match(input,62,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getBuildObjectAccess().getArgsKeyword_2_3_0());
            	    				
            	    otherlv_12=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_12, grammarAccess.getBuildObjectAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalDcDsl.g:2729:5: ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK ) | (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' ) )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==RULE_BEG_BLOCK) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==32) ) {
            	        alt44=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalDcDsl.g:2730:6: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:2730:6: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK )
            	            // InternalDcDsl.g:2731:7: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+ this_END_BLOCK_16= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_13, grammarAccess.getBuildObjectAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_0());
            	            						
            	            // InternalDcDsl.g:2735:7: (otherlv_14= '-' ( (lv_args_15_0= ruleEString ) ) )+
            	            int cnt42=0;
            	            loop42:
            	            do {
            	                int alt42=2;
            	                int LA42_0 = input.LA(1);

            	                if ( (LA42_0==31) ) {
            	                    alt42=1;
            	                }


            	                switch (alt42) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2736:8: otherlv_14= '-' ( (lv_args_15_0= ruleEString ) )
            	            	    {
            	            	    otherlv_14=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_14, grammarAccess.getBuildObjectAccess().getHyphenMinusKeyword_2_3_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:2740:8: ( (lv_args_15_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2741:9: (lv_args_15_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2741:9: (lv_args_15_0= ruleEString )
            	            	    // InternalDcDsl.g:2742:10: lv_args_15_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getBuildObjectAccess().getArgsEStringParserRuleCall_2_3_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_args_15_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"args",
            	            	    											lv_args_15_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


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

            	            this_END_BLOCK_16=(Token)match(input,RULE_END_BLOCK,FOLLOW_25); 

            	            							newLeafNode(this_END_BLOCK_16, grammarAccess.getBuildObjectAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:2766:6: (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' )
            	            {
            	            // InternalDcDsl.g:2766:6: (otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']' )
            	            // InternalDcDsl.g:2767:7: otherlv_17= '[' ( (lv_args_18_0= ruleEString ) ) (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )* otherlv_21= ']'
            	            {
            	            otherlv_17=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_17, grammarAccess.getBuildObjectAccess().getLeftSquareBracketKeyword_2_3_2_1_0());
            	            						
            	            // InternalDcDsl.g:2771:7: ( (lv_args_18_0= ruleEString ) )
            	            // InternalDcDsl.g:2772:8: (lv_args_18_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:2772:8: (lv_args_18_0= ruleEString )
            	            // InternalDcDsl.g:2773:9: lv_args_18_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getBuildObjectAccess().getArgsEStringParserRuleCall_2_3_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_args_18_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	            									}
            	            									add(
            	            										current,
            	            										"args",
            	            										lv_args_18_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:2790:7: (otherlv_19= ',' ( (lv_args_20_0= ruleEString ) ) )*
            	            loop43:
            	            do {
            	                int alt43=2;
            	                int LA43_0 = input.LA(1);

            	                if ( (LA43_0==35) ) {
            	                    alt43=1;
            	                }


            	                switch (alt43) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2791:8: otherlv_19= ',' ( (lv_args_20_0= ruleEString ) )
            	            	    {
            	            	    otherlv_19=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_19, grammarAccess.getBuildObjectAccess().getCommaKeyword_2_3_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:2795:8: ( (lv_args_20_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2796:9: (lv_args_20_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2796:9: (lv_args_20_0= ruleEString )
            	            	    // InternalDcDsl.g:2797:10: lv_args_20_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getBuildObjectAccess().getArgsEStringParserRuleCall_2_3_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_args_20_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"args",
            	            	    											lv_args_20_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop43;
            	                }
            	            } while (true);

            	            otherlv_21=(Token)match(input,33,FOLLOW_25); 

            	            							newLeafNode(otherlv_21, grammarAccess.getBuildObjectAccess().getRightSquareBracketKeyword_2_3_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            this_END_BLOCK_22=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_22, grammarAccess.getBuildObjectAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleBuildObject"


    // $ANTLR start "entryRuleNetworks"
    // InternalDcDsl.g:2831:1: entryRuleNetworks returns [EObject current=null] : iv_ruleNetworks= ruleNetworks EOF ;
    public final EObject entryRuleNetworks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworks = null;


        try {
            // InternalDcDsl.g:2831:49: (iv_ruleNetworks= ruleNetworks EOF )
            // InternalDcDsl.g:2832:2: iv_ruleNetworks= ruleNetworks EOF
            {
             newCompositeNode(grammarAccess.getNetworksRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworks=ruleNetworks();

            state._fsp--;

             current =iv_ruleNetworks; 
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
    // $ANTLR end "entryRuleNetworks"


    // $ANTLR start "ruleNetworks"
    // InternalDcDsl.g:2838:1: ruleNetworks returns [EObject current=null] : (this_NetworksObject_0= ruleNetworksObject | this_NetworksValue_1= ruleNetworksValue ) ;
    public final EObject ruleNetworks() throws RecognitionException {
        EObject current = null;

        EObject this_NetworksObject_0 = null;

        EObject this_NetworksValue_1 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2844:2: ( (this_NetworksObject_0= ruleNetworksObject | this_NetworksValue_1= ruleNetworksValue ) )
            // InternalDcDsl.g:2845:2: (this_NetworksObject_0= ruleNetworksObject | this_NetworksValue_1= ruleNetworksValue )
            {
            // InternalDcDsl.g:2845:2: (this_NetworksObject_0= ruleNetworksObject | this_NetworksValue_1= ruleNetworksValue )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BEG_BLOCK) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=RULE_STRING && LA46_0<=RULE_INT)||(LA46_0>=23 && LA46_0<=30)||LA46_0==32) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalDcDsl.g:2846:3: this_NetworksObject_0= ruleNetworksObject
                    {

                    			newCompositeNode(grammarAccess.getNetworksAccess().getNetworksObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworksObject_0=ruleNetworksObject();

                    state._fsp--;


                    			current = this_NetworksObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:2855:3: this_NetworksValue_1= ruleNetworksValue
                    {

                    			newCompositeNode(grammarAccess.getNetworksAccess().getNetworksValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NetworksValue_1=ruleNetworksValue();

                    state._fsp--;


                    			current = this_NetworksValue_1;
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
    // $ANTLR end "ruleNetworks"


    // $ANTLR start "entryRuleNetworksValue"
    // InternalDcDsl.g:2867:1: entryRuleNetworksValue returns [EObject current=null] : iv_ruleNetworksValue= ruleNetworksValue EOF ;
    public final EObject entryRuleNetworksValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworksValue = null;


        try {
            // InternalDcDsl.g:2867:54: (iv_ruleNetworksValue= ruleNetworksValue EOF )
            // InternalDcDsl.g:2868:2: iv_ruleNetworksValue= ruleNetworksValue EOF
            {
             newCompositeNode(grammarAccess.getNetworksValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworksValue=ruleNetworksValue();

            state._fsp--;

             current =iv_ruleNetworksValue; 
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
    // $ANTLR end "entryRuleNetworksValue"


    // $ANTLR start "ruleNetworksValue"
    // InternalDcDsl.g:2874:1: ruleNetworksValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) ) ;
    public final EObject ruleNetworksValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2880:2: ( ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) ) )
            // InternalDcDsl.g:2881:2: ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) )
            {
            // InternalDcDsl.g:2881:2: ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=RULE_STRING && LA48_0<=RULE_INT)||(LA48_0>=23 && LA48_0<=30)) ) {
                alt48=1;
            }
            else if ( (LA48_0==32) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalDcDsl.g:2882:3: ( (lv_value_0_0= ruleEString ) )
                    {
                    // InternalDcDsl.g:2882:3: ( (lv_value_0_0= ruleEString ) )
                    // InternalDcDsl.g:2883:4: (lv_value_0_0= ruleEString )
                    {
                    // InternalDcDsl.g:2883:4: (lv_value_0_0= ruleEString )
                    // InternalDcDsl.g:2884:5: lv_value_0_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getNetworksValueAccess().getValueEStringParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getNetworksValueRule());
                    					}
                    					add(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:2902:3: (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' )
                    {
                    // InternalDcDsl.g:2902:3: (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' )
                    // InternalDcDsl.g:2903:4: otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getNetworksValueAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalDcDsl.g:2907:4: ( (lv_value_2_0= ruleEString ) )
                    // InternalDcDsl.g:2908:5: (lv_value_2_0= ruleEString )
                    {
                    // InternalDcDsl.g:2908:5: (lv_value_2_0= ruleEString )
                    // InternalDcDsl.g:2909:6: lv_value_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNetworksValueAccess().getValueEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworksValueRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDcDsl.g:2926:4: (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==35) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalDcDsl.g:2927:5: otherlv_3= ',' ( (lv_value_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getNetworksValueAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalDcDsl.g:2931:5: ( (lv_value_4_0= ruleEString ) )
                    	    // InternalDcDsl.g:2932:6: (lv_value_4_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:2932:6: (lv_value_4_0= ruleEString )
                    	    // InternalDcDsl.g:2933:7: lv_value_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetworksValueAccess().getValueEStringParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_value_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetworksValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getNetworksValueAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }


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
    // $ANTLR end "ruleNetworksValue"


    // $ANTLR start "entryRuleNetworksObject"
    // InternalDcDsl.g:2960:1: entryRuleNetworksObject returns [EObject current=null] : iv_ruleNetworksObject= ruleNetworksObject EOF ;
    public final EObject entryRuleNetworksObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworksObject = null;


        try {
            // InternalDcDsl.g:2960:55: (iv_ruleNetworksObject= ruleNetworksObject EOF )
            // InternalDcDsl.g:2961:2: iv_ruleNetworksObject= ruleNetworksObject EOF
            {
             newCompositeNode(grammarAccess.getNetworksObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetworksObject=ruleNetworksObject();

            state._fsp--;

             current =iv_ruleNetworksObject; 
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
    // $ANTLR end "entryRuleNetworksObject"


    // $ANTLR start "ruleNetworksObject"
    // InternalDcDsl.g:2967:1: ruleNetworksObject returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_network_2_0= ruleNetwork ) )+ this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleNetworksObject() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_network_2_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2973:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_network_2_0= ruleNetwork ) )+ this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalDcDsl.g:2974:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_network_2_0= ruleNetwork ) )+ this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:2974:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_network_2_0= ruleNetwork ) )+ this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalDcDsl.g:2975:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_network_2_0= ruleNetwork ) )+ this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalDcDsl.g:2975:3: ()
            // InternalDcDsl.g:2976:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworksObjectAccess().getNetworksObjectAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getNetworksObjectAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalDcDsl.g:2986:3: ( (lv_network_2_0= ruleNetwork ) )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=RULE_STRING && LA49_0<=RULE_INT)||(LA49_0>=23 && LA49_0<=30)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalDcDsl.g:2987:4: (lv_network_2_0= ruleNetwork )
            	    {
            	    // InternalDcDsl.g:2987:4: (lv_network_2_0= ruleNetwork )
            	    // InternalDcDsl.g:2988:5: lv_network_2_0= ruleNetwork
            	    {

            	    					newCompositeNode(grammarAccess.getNetworksObjectAccess().getNetworkNetworkParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_network_2_0=ruleNetwork();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNetworksObjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"network",
            	    						lv_network_2_0,
            	    						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Network");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getNetworksObjectAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleNetworksObject"


    // $ANTLR start "entryRuleNetwork"
    // InternalDcDsl.g:3013:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDcDsl.g:3013:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDcDsl.g:3014:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalDcDsl.g:3020:1: ruleNetwork returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK ) )* this_END_BLOCK_14= RULE_END_BLOCK ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_BEG_BLOCK_11=null;
        Token this_END_BLOCK_13=null;
        Token this_END_BLOCK_14=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_driver_5_0 = null;

        AntlrDatatypeRuleToken lv_ipv4Address_8_0 = null;

        EObject lv_ipam_12_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3026:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK ) )* this_END_BLOCK_14= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3027:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK ) )* this_END_BLOCK_14= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3027:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK ) )* this_END_BLOCK_14= RULE_END_BLOCK )
            // InternalDcDsl.g:3028:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK ) )* this_END_BLOCK_14= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3028:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:3029:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:3029:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:3030:5: lv_id_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getIdEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getColonKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_26); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getNetworkAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalDcDsl.g:3055:3: ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK ) )*
            loop51:
            do {
                int alt51=4;
                switch ( input.LA(1) ) {
                case 63:
                    {
                    alt51=1;
                    }
                    break;
                case 64:
                    {
                    alt51=2;
                    }
                    break;
                case 65:
                    {
                    alt51=3;
                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // InternalDcDsl.g:3056:4: (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:3056:4: (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) )
            	    // InternalDcDsl.g:3057:5: otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,63,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getDriverKeyword_3_0_0());
            	    				
            	    otherlv_4=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getColonKeyword_3_0_1());
            	    				
            	    // InternalDcDsl.g:3065:5: ( (lv_driver_5_0= ruleEString ) )
            	    // InternalDcDsl.g:3066:6: (lv_driver_5_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:3066:6: (lv_driver_5_0= ruleEString )
            	    // InternalDcDsl.g:3067:7: lv_driver_5_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_3_0_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_driver_5_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    							}
            	    							set(
            	    								current,
            	    								"driver",
            	    								lv_driver_5_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDcDsl.g:3086:4: (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:3086:4: (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) )
            	    // InternalDcDsl.g:3087:5: otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,64,FOLLOW_3); 

            	    					newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getIpv4_addressKeyword_3_1_0());
            	    				
            	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getColonKeyword_3_1_1());
            	    				
            	    // InternalDcDsl.g:3095:5: ( (lv_ipv4Address_8_0= ruleEString ) )
            	    // InternalDcDsl.g:3096:6: (lv_ipv4Address_8_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:3096:6: (lv_ipv4Address_8_0= ruleEString )
            	    // InternalDcDsl.g:3097:7: lv_ipv4Address_8_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getNetworkAccess().getIpv4AddressEStringParserRuleCall_3_1_2_0());
            	    						
            	    pushFollow(FOLLOW_26);
            	    lv_ipv4Address_8_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    							}
            	    							set(
            	    								current,
            	    								"ipv4Address",
            	    								lv_ipv4Address_8_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDcDsl.g:3116:4: (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:3116:4: (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK )
            	    // InternalDcDsl.g:3117:5: otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ( (lv_ipam_12_0= ruleConfig ) )+ this_END_BLOCK_13= RULE_END_BLOCK
            	    {
            	    otherlv_9=(Token)match(input,65,FOLLOW_3); 

            	    					newLeafNode(otherlv_9, grammarAccess.getNetworkAccess().getIpamKeyword_3_2_0());
            	    				
            	    otherlv_10=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getColonKeyword_3_2_1());
            	    				
            	    this_BEG_BLOCK_11=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	    					newLeafNode(this_BEG_BLOCK_11, grammarAccess.getNetworkAccess().getBEG_BLOCKTerminalRuleCall_3_2_2());
            	    				
            	    // InternalDcDsl.g:3129:5: ( (lv_ipam_12_0= ruleConfig ) )+
            	    int cnt50=0;
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==31) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:3130:6: (lv_ipam_12_0= ruleConfig )
            	    	    {
            	    	    // InternalDcDsl.g:3130:6: (lv_ipam_12_0= ruleConfig )
            	    	    // InternalDcDsl.g:3131:7: lv_ipam_12_0= ruleConfig
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNetworkAccess().getIpamConfigParserRuleCall_3_2_3_0());
            	    	    						
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_ipam_12_0=ruleConfig();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"ipam",
            	    	    								lv_ipam_12_0,
            	    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Config");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt50 >= 1 ) break loop50;
            	                EarlyExitException eee =
            	                    new EarlyExitException(50, input);
            	                throw eee;
            	        }
            	        cnt50++;
            	    } while (true);

            	    this_END_BLOCK_13=(Token)match(input,RULE_END_BLOCK,FOLLOW_26); 

            	    					newLeafNode(this_END_BLOCK_13, grammarAccess.getNetworkAccess().getEND_BLOCKTerminalRuleCall_3_2_4());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            this_END_BLOCK_14=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_14, grammarAccess.getNetworkAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleConfig"
    // InternalDcDsl.g:3162:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalDcDsl.g:3162:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalDcDsl.g:3163:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalDcDsl.g:3169:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= '-' (otherlv_2= 'subnet' otherlv_3= ':' ( (lv_subnet_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_subnet_4_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3175:2: ( ( () otherlv_1= '-' (otherlv_2= 'subnet' otherlv_3= ':' ( (lv_subnet_4_0= ruleEString ) ) ) ) )
            // InternalDcDsl.g:3176:2: ( () otherlv_1= '-' (otherlv_2= 'subnet' otherlv_3= ':' ( (lv_subnet_4_0= ruleEString ) ) ) )
            {
            // InternalDcDsl.g:3176:2: ( () otherlv_1= '-' (otherlv_2= 'subnet' otherlv_3= ':' ( (lv_subnet_4_0= ruleEString ) ) ) )
            // InternalDcDsl.g:3177:3: () otherlv_1= '-' (otherlv_2= 'subnet' otherlv_3= ':' ( (lv_subnet_4_0= ruleEString ) ) )
            {
            // InternalDcDsl.g:3177:3: ()
            // InternalDcDsl.g:3178:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getHyphenMinusKeyword_1());
            		
            // InternalDcDsl.g:3188:3: (otherlv_2= 'subnet' otherlv_3= ':' ( (lv_subnet_4_0= ruleEString ) ) )
            // InternalDcDsl.g:3189:4: otherlv_2= 'subnet' otherlv_3= ':' ( (lv_subnet_4_0= ruleEString ) )
            {
            otherlv_2=(Token)match(input,66,FOLLOW_3); 

            				newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getSubnetKeyword_2_0());
            			
            otherlv_3=(Token)match(input,17,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getColonKeyword_2_1());
            			
            // InternalDcDsl.g:3197:4: ( (lv_subnet_4_0= ruleEString ) )
            // InternalDcDsl.g:3198:5: (lv_subnet_4_0= ruleEString )
            {
            // InternalDcDsl.g:3198:5: (lv_subnet_4_0= ruleEString )
            // InternalDcDsl.g:3199:6: lv_subnet_4_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getConfigAccess().getSubnetEStringParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_2);
            lv_subnet_4_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConfigRule());
            						}
            						set(
            							current,
            							"subnet",
            							lv_subnet_4_0,
            							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


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
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleDepends_on"
    // InternalDcDsl.g:3221:1: entryRuleDepends_on returns [EObject current=null] : iv_ruleDepends_on= ruleDepends_on EOF ;
    public final EObject entryRuleDepends_on() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepends_on = null;


        try {
            // InternalDcDsl.g:3221:51: (iv_ruleDepends_on= ruleDepends_on EOF )
            // InternalDcDsl.g:3222:2: iv_ruleDepends_on= ruleDepends_on EOF
            {
             newCompositeNode(grammarAccess.getDepends_onRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepends_on=ruleDepends_on();

            state._fsp--;

             current =iv_ruleDepends_on; 
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
    // $ANTLR end "entryRuleDepends_on"


    // $ANTLR start "ruleDepends_on"
    // InternalDcDsl.g:3228:1: ruleDepends_on returns [EObject current=null] : (this_Depends_onObject_0= ruleDepends_onObject | this_Depends_onValue_1= ruleDepends_onValue ) ;
    public final EObject ruleDepends_on() throws RecognitionException {
        EObject current = null;

        EObject this_Depends_onObject_0 = null;

        EObject this_Depends_onValue_1 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3234:2: ( (this_Depends_onObject_0= ruleDepends_onObject | this_Depends_onValue_1= ruleDepends_onValue ) )
            // InternalDcDsl.g:3235:2: (this_Depends_onObject_0= ruleDepends_onObject | this_Depends_onValue_1= ruleDepends_onValue )
            {
            // InternalDcDsl.g:3235:2: (this_Depends_onObject_0= ruleDepends_onObject | this_Depends_onValue_1= ruleDepends_onValue )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BEG_BLOCK) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_INT)||(LA52_0>=23 && LA52_0<=30)||LA52_0==32) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalDcDsl.g:3236:3: this_Depends_onObject_0= ruleDepends_onObject
                    {

                    			newCompositeNode(grammarAccess.getDepends_onAccess().getDepends_onObjectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Depends_onObject_0=ruleDepends_onObject();

                    state._fsp--;


                    			current = this_Depends_onObject_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:3245:3: this_Depends_onValue_1= ruleDepends_onValue
                    {

                    			newCompositeNode(grammarAccess.getDepends_onAccess().getDepends_onValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Depends_onValue_1=ruleDepends_onValue();

                    state._fsp--;


                    			current = this_Depends_onValue_1;
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
    // $ANTLR end "ruleDepends_on"


    // $ANTLR start "entryRuleDepends_onValue"
    // InternalDcDsl.g:3257:1: entryRuleDepends_onValue returns [EObject current=null] : iv_ruleDepends_onValue= ruleDepends_onValue EOF ;
    public final EObject entryRuleDepends_onValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepends_onValue = null;


        try {
            // InternalDcDsl.g:3257:56: (iv_ruleDepends_onValue= ruleDepends_onValue EOF )
            // InternalDcDsl.g:3258:2: iv_ruleDepends_onValue= ruleDepends_onValue EOF
            {
             newCompositeNode(grammarAccess.getDepends_onValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepends_onValue=ruleDepends_onValue();

            state._fsp--;

             current =iv_ruleDepends_onValue; 
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
    // $ANTLR end "entryRuleDepends_onValue"


    // $ANTLR start "ruleDepends_onValue"
    // InternalDcDsl.g:3264:1: ruleDepends_onValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) ) ;
    public final EObject ruleDepends_onValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3270:2: ( ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) ) )
            // InternalDcDsl.g:3271:2: ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) )
            {
            // InternalDcDsl.g:3271:2: ( ( (lv_value_0_0= ruleEString ) ) | (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_INT)||(LA54_0>=23 && LA54_0<=30)) ) {
                alt54=1;
            }
            else if ( (LA54_0==32) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalDcDsl.g:3272:3: ( (lv_value_0_0= ruleEString ) )
                    {
                    // InternalDcDsl.g:3272:3: ( (lv_value_0_0= ruleEString ) )
                    // InternalDcDsl.g:3273:4: (lv_value_0_0= ruleEString )
                    {
                    // InternalDcDsl.g:3273:4: (lv_value_0_0= ruleEString )
                    // InternalDcDsl.g:3274:5: lv_value_0_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getDepends_onValueAccess().getValueEStringParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_0_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDepends_onValueRule());
                    					}
                    					add(
                    						current,
                    						"value",
                    						lv_value_0_0,
                    						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:3292:3: (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' )
                    {
                    // InternalDcDsl.g:3292:3: (otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']' )
                    // InternalDcDsl.g:3293:4: otherlv_1= '[' ( (lv_value_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getDepends_onValueAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalDcDsl.g:3297:4: ( (lv_value_2_0= ruleEString ) )
                    // InternalDcDsl.g:3298:5: (lv_value_2_0= ruleEString )
                    {
                    // InternalDcDsl.g:3298:5: (lv_value_2_0= ruleEString )
                    // InternalDcDsl.g:3299:6: lv_value_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDepends_onValueAccess().getValueEStringParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_value_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepends_onValueRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDcDsl.g:3316:4: (otherlv_3= ',' ( (lv_value_4_0= ruleEString ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==35) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalDcDsl.g:3317:5: otherlv_3= ',' ( (lv_value_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getDepends_onValueAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalDcDsl.g:3321:5: ( (lv_value_4_0= ruleEString ) )
                    	    // InternalDcDsl.g:3322:6: (lv_value_4_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:3322:6: (lv_value_4_0= ruleEString )
                    	    // InternalDcDsl.g:3323:7: lv_value_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getDepends_onValueAccess().getValueEStringParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_value_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDepends_onValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_4_0,
                    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getDepends_onValueAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }


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
    // $ANTLR end "ruleDepends_onValue"


    // $ANTLR start "entryRuleDepends_onObject"
    // InternalDcDsl.g:3350:1: entryRuleDepends_onObject returns [EObject current=null] : iv_ruleDepends_onObject= ruleDepends_onObject EOF ;
    public final EObject entryRuleDepends_onObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepends_onObject = null;


        try {
            // InternalDcDsl.g:3350:57: (iv_ruleDepends_onObject= ruleDepends_onObject EOF )
            // InternalDcDsl.g:3351:2: iv_ruleDepends_onObject= ruleDepends_onObject EOF
            {
             newCompositeNode(grammarAccess.getDepends_onObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDepends_onObject=ruleDepends_onObject();

            state._fsp--;

             current =iv_ruleDepends_onObject; 
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
    // $ANTLR end "entryRuleDepends_onObject"


    // $ANTLR start "ruleDepends_onObject"
    // InternalDcDsl.g:3357:1: ruleDepends_onObject returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_db_2_0= ruleDb ) ) this_END_BLOCK_3= RULE_END_BLOCK ) ;
    public final EObject ruleDepends_onObject() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token this_END_BLOCK_3=null;
        EObject lv_db_2_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3363:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_db_2_0= ruleDb ) ) this_END_BLOCK_3= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3364:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_db_2_0= ruleDb ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3364:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_db_2_0= ruleDb ) ) this_END_BLOCK_3= RULE_END_BLOCK )
            // InternalDcDsl.g:3365:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (lv_db_2_0= ruleDb ) ) this_END_BLOCK_3= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3365:3: ()
            // InternalDcDsl.g:3366:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDepends_onObjectAccess().getDepends_onObjectAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getDepends_onObjectAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalDcDsl.g:3376:3: ( (lv_db_2_0= ruleDb ) )
            // InternalDcDsl.g:3377:4: (lv_db_2_0= ruleDb )
            {
            // InternalDcDsl.g:3377:4: (lv_db_2_0= ruleDb )
            // InternalDcDsl.g:3378:5: lv_db_2_0= ruleDb
            {

            					newCompositeNode(grammarAccess.getDepends_onObjectAccess().getDbDbParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_28);
            lv_db_2_0=ruleDb();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDepends_onObjectRule());
            					}
            					set(
            						current,
            						"db",
            						lv_db_2_0,
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Db");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_BLOCK_3=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_3, grammarAccess.getDepends_onObjectAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleDepends_onObject"


    // $ANTLR start "entryRuleDb"
    // InternalDcDsl.g:3403:1: entryRuleDb returns [EObject current=null] : iv_ruleDb= ruleDb EOF ;
    public final EObject entryRuleDb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDb = null;


        try {
            // InternalDcDsl.g:3403:43: (iv_ruleDb= ruleDb EOF )
            // InternalDcDsl.g:3404:2: iv_ruleDb= ruleDb EOF
            {
             newCompositeNode(grammarAccess.getDbRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDb=ruleDb();

            state._fsp--;

             current =iv_ruleDb; 
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
    // $ANTLR end "entryRuleDb"


    // $ANTLR start "ruleDb"
    // InternalDcDsl.g:3410:1: ruleDb returns [EObject current=null] : ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ;
    public final EObject ruleDb() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEG_BLOCK_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_END_BLOCK_7=null;
        AntlrDatatypeRuleToken lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3416:2: ( ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3417:2: ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3417:2: ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK )
            // InternalDcDsl.g:3418:3: () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3418:3: ()
            // InternalDcDsl.g:3419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDbAccess().getDbAction_0(),
            					current);
            			

            }


            			newCompositeNode(grammarAccess.getDbAccess().getKeyNameParserRuleCall_1());
            		
            pushFollow(FOLLOW_3);
            ruleKeyName();

            state._fsp--;


            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getDbAccess().getColonKeyword_2());
            		
            this_BEG_BLOCK_3=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_29); 

            			newLeafNode(this_BEG_BLOCK_3, grammarAccess.getDbAccess().getBEG_BLOCKTerminalRuleCall_3());
            		
            // InternalDcDsl.g:3440:3: (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) )
            // InternalDcDsl.g:3441:4: otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,67,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getDbAccess().getConditionKeyword_4_0());
            			
            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            				newLeafNode(otherlv_5, grammarAccess.getDbAccess().getColonKeyword_4_1());
            			
            // InternalDcDsl.g:3449:4: ( (lv_condition_6_0= ruleEString ) )
            // InternalDcDsl.g:3450:5: (lv_condition_6_0= ruleEString )
            {
            // InternalDcDsl.g:3450:5: (lv_condition_6_0= ruleEString )
            // InternalDcDsl.g:3451:6: lv_condition_6_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDbAccess().getConditionEStringParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_28);
            lv_condition_6_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDbRule());
            						}
            						set(
            							current,
            							"condition",
            							lv_condition_6_0,
            							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_END_BLOCK_7=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_7, grammarAccess.getDbAccess().getEND_BLOCKTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleDb"


    // $ANTLR start "entryRuleHealthcheck"
    // InternalDcDsl.g:3477:1: entryRuleHealthcheck returns [EObject current=null] : iv_ruleHealthcheck= ruleHealthcheck EOF ;
    public final EObject entryRuleHealthcheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthcheck = null;


        try {
            // InternalDcDsl.g:3477:52: (iv_ruleHealthcheck= ruleHealthcheck EOF )
            // InternalDcDsl.g:3478:2: iv_ruleHealthcheck= ruleHealthcheck EOF
            {
             newCompositeNode(grammarAccess.getHealthcheckRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHealthcheck=ruleHealthcheck();

            state._fsp--;

             current =iv_ruleHealthcheck; 
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
    // $ANTLR end "entryRuleHealthcheck"


    // $ANTLR start "ruleHealthcheck"
    // InternalDcDsl.g:3484:1: ruleHealthcheck returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) ) | (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) ) | (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) ) | (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) ) | (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) ) )* this_END_BLOCK_25= RULE_END_BLOCK ) ;
    public final EObject ruleHealthcheck() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEG_BLOCK_4=null;
        Token otherlv_5=null;
        Token this_END_BLOCK_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_retries_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token this_END_BLOCK_25=null;
        AntlrDatatypeRuleToken lv_test_6_0 = null;

        AntlrDatatypeRuleToken lv_test_9_0 = null;

        AntlrDatatypeRuleToken lv_test_11_0 = null;

        AntlrDatatypeRuleToken lv_interval_15_0 = null;

        AntlrDatatypeRuleToken lv_timeout_18_0 = null;

        AntlrDatatypeRuleToken lv_startPeriod_24_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3490:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) ) | (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) ) | (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) ) | (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) ) | (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) ) )* this_END_BLOCK_25= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3491:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) ) | (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) ) | (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) ) | (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) ) | (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) ) )* this_END_BLOCK_25= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3491:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) ) | (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) ) | (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) ) | (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) ) | (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) ) )* this_END_BLOCK_25= RULE_END_BLOCK )
            // InternalDcDsl.g:3492:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) ) | (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) ) | (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) ) | (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) ) | (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) ) )* this_END_BLOCK_25= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3492:3: ()
            // InternalDcDsl.g:3493:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHealthcheckAccess().getHealthcheckAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_30); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getHealthcheckAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalDcDsl.g:3503:3: ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) ) | (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) ) | (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) ) | (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) ) | (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) ) )*
            loop58:
            do {
                int alt58=6;
                switch ( input.LA(1) ) {
                case 71:
                    {
                    alt58=1;
                    }
                    break;
                case 72:
                    {
                    alt58=2;
                    }
                    break;
                case 73:
                    {
                    alt58=3;
                    }
                    break;
                case 74:
                    {
                    alt58=4;
                    }
                    break;
                case 75:
                    {
                    alt58=5;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // InternalDcDsl.g:3504:4: (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:3504:4: (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) ) )
            	    // InternalDcDsl.g:3505:5: otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) )
            	    {
            	    otherlv_2=(Token)match(input,71,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getHealthcheckAccess().getTestKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_3, grammarAccess.getHealthcheckAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalDcDsl.g:3513:5: ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK ) | (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' ) )
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==RULE_BEG_BLOCK) ) {
            	        alt57=1;
            	    }
            	    else if ( (LA57_0==32) ) {
            	        alt57=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 57, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // InternalDcDsl.g:3514:6: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:3514:6: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK )
            	            // InternalDcDsl.g:3515:7: this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+ this_END_BLOCK_7= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_4, grammarAccess.getHealthcheckAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            						
            	            // InternalDcDsl.g:3519:7: (otherlv_5= '-' ( (lv_test_6_0= ruleEString ) ) )+
            	            int cnt55=0;
            	            loop55:
            	            do {
            	                int alt55=2;
            	                int LA55_0 = input.LA(1);

            	                if ( (LA55_0==31) ) {
            	                    alt55=1;
            	                }


            	                switch (alt55) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:3520:8: otherlv_5= '-' ( (lv_test_6_0= ruleEString ) )
            	            	    {
            	            	    otherlv_5=(Token)match(input,31,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_5, grammarAccess.getHealthcheckAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:3524:8: ( (lv_test_6_0= ruleEString ) )
            	            	    // InternalDcDsl.g:3525:9: (lv_test_6_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:3525:9: (lv_test_6_0= ruleEString )
            	            	    // InternalDcDsl.g:3526:10: lv_test_6_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getHealthcheckAccess().getTestEStringParserRuleCall_2_0_2_0_1_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_test_6_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"test",
            	            	    											lv_test_6_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


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

            	            this_END_BLOCK_7=(Token)match(input,RULE_END_BLOCK,FOLLOW_30); 

            	            							newLeafNode(this_END_BLOCK_7, grammarAccess.getHealthcheckAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:3550:6: (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' )
            	            {
            	            // InternalDcDsl.g:3550:6: (otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']' )
            	            // InternalDcDsl.g:3551:7: otherlv_8= '[' ( (lv_test_9_0= ruleEString ) ) (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )* otherlv_12= ']'
            	            {
            	            otherlv_8=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_8, grammarAccess.getHealthcheckAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            						
            	            // InternalDcDsl.g:3555:7: ( (lv_test_9_0= ruleEString ) )
            	            // InternalDcDsl.g:3556:8: (lv_test_9_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:3556:8: (lv_test_9_0= ruleEString )
            	            // InternalDcDsl.g:3557:9: lv_test_9_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getHealthcheckAccess().getTestEStringParserRuleCall_2_0_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_test_9_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	            									}
            	            									add(
            	            										current,
            	            										"test",
            	            										lv_test_9_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:3574:7: (otherlv_10= ',' ( (lv_test_11_0= ruleEString ) ) )*
            	            loop56:
            	            do {
            	                int alt56=2;
            	                int LA56_0 = input.LA(1);

            	                if ( (LA56_0==35) ) {
            	                    alt56=1;
            	                }


            	                switch (alt56) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:3575:8: otherlv_10= ',' ( (lv_test_11_0= ruleEString ) )
            	            	    {
            	            	    otherlv_10=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_10, grammarAccess.getHealthcheckAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:3579:8: ( (lv_test_11_0= ruleEString ) )
            	            	    // InternalDcDsl.g:3580:9: (lv_test_11_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:3580:9: (lv_test_11_0= ruleEString )
            	            	    // InternalDcDsl.g:3581:10: lv_test_11_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getHealthcheckAccess().getTestEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_test_11_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"test",
            	            	    											lv_test_11_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop56;
            	                }
            	            } while (true);

            	            otherlv_12=(Token)match(input,33,FOLLOW_30); 

            	            							newLeafNode(otherlv_12, grammarAccess.getHealthcheckAccess().getRightSquareBracketKeyword_2_0_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDcDsl.g:3607:4: (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:3607:4: (otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) ) )
            	    // InternalDcDsl.g:3608:5: otherlv_13= 'interval' otherlv_14= ':' ( (lv_interval_15_0= ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,72,FOLLOW_3); 

            	    					newLeafNode(otherlv_13, grammarAccess.getHealthcheckAccess().getIntervalKeyword_2_1_0());
            	    				
            	    otherlv_14=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_14, grammarAccess.getHealthcheckAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalDcDsl.g:3616:5: ( (lv_interval_15_0= ruleEString ) )
            	    // InternalDcDsl.g:3617:6: (lv_interval_15_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:3617:6: (lv_interval_15_0= ruleEString )
            	    // InternalDcDsl.g:3618:7: lv_interval_15_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getIntervalEStringParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_interval_15_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"interval",
            	    								lv_interval_15_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDcDsl.g:3637:4: (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:3637:4: (otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) ) )
            	    // InternalDcDsl.g:3638:5: otherlv_16= 'timeout' otherlv_17= ':' ( (lv_timeout_18_0= ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,73,FOLLOW_3); 

            	    					newLeafNode(otherlv_16, grammarAccess.getHealthcheckAccess().getTimeoutKeyword_2_2_0());
            	    				
            	    otherlv_17=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_17, grammarAccess.getHealthcheckAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalDcDsl.g:3646:5: ( (lv_timeout_18_0= ruleEString ) )
            	    // InternalDcDsl.g:3647:6: (lv_timeout_18_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:3647:6: (lv_timeout_18_0= ruleEString )
            	    // InternalDcDsl.g:3648:7: lv_timeout_18_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getTimeoutEStringParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_timeout_18_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"timeout",
            	    								lv_timeout_18_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDcDsl.g:3667:4: (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) )
            	    {
            	    // InternalDcDsl.g:3667:4: (otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) ) )
            	    // InternalDcDsl.g:3668:5: otherlv_19= 'retries' otherlv_20= ':' ( (lv_retries_21_0= RULE_INT ) )
            	    {
            	    otherlv_19=(Token)match(input,74,FOLLOW_3); 

            	    					newLeafNode(otherlv_19, grammarAccess.getHealthcheckAccess().getRetriesKeyword_2_3_0());
            	    				
            	    otherlv_20=(Token)match(input,17,FOLLOW_18); 

            	    					newLeafNode(otherlv_20, grammarAccess.getHealthcheckAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalDcDsl.g:3676:5: ( (lv_retries_21_0= RULE_INT ) )
            	    // InternalDcDsl.g:3677:6: (lv_retries_21_0= RULE_INT )
            	    {
            	    // InternalDcDsl.g:3677:6: (lv_retries_21_0= RULE_INT )
            	    // InternalDcDsl.g:3678:7: lv_retries_21_0= RULE_INT
            	    {
            	    lv_retries_21_0=(Token)match(input,RULE_INT,FOLLOW_30); 

            	    							newLeafNode(lv_retries_21_0, grammarAccess.getHealthcheckAccess().getRetriesINTTerminalRuleCall_2_3_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHealthcheckRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"retries",
            	    								lv_retries_21_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.INT");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDcDsl.g:3696:4: (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:3696:4: (otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) ) )
            	    // InternalDcDsl.g:3697:5: otherlv_22= 'start_period' otherlv_23= ':' ( (lv_startPeriod_24_0= ruleEString ) )
            	    {
            	    otherlv_22=(Token)match(input,75,FOLLOW_3); 

            	    					newLeafNode(otherlv_22, grammarAccess.getHealthcheckAccess().getStart_periodKeyword_2_4_0());
            	    				
            	    otherlv_23=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_23, grammarAccess.getHealthcheckAccess().getColonKeyword_2_4_1());
            	    				
            	    // InternalDcDsl.g:3705:5: ( (lv_startPeriod_24_0= ruleEString ) )
            	    // InternalDcDsl.g:3706:6: (lv_startPeriod_24_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:3706:6: (lv_startPeriod_24_0= ruleEString )
            	    // InternalDcDsl.g:3707:7: lv_startPeriod_24_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getStartPeriodEStringParserRuleCall_2_4_2_0());
            	    						
            	    pushFollow(FOLLOW_30);
            	    lv_startPeriod_24_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"startPeriod",
            	    								lv_startPeriod_24_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            this_END_BLOCK_25=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_25, grammarAccess.getHealthcheckAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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
    // $ANTLR end "ruleHealthcheck"


    // $ANTLR start "entryRuleSecret"
    // InternalDcDsl.g:3734:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalDcDsl.g:3734:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalDcDsl.g:3735:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalDcDsl.g:3741:1: ruleSecret returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) ;
    public final EObject ruleSecret() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_END_BLOCK_6=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_file_5_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3747:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3748:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3748:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            // InternalDcDsl.g:3749:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3749:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:3750:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:3750:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:3751:5: lv_id_0_0= ruleEString
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
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSecretAccess().getColonKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_31); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getSecretAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalDcDsl.g:3776:3: (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==77) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDcDsl.g:3777:4: otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSecretAccess().getFileKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getColonKeyword_3_1());
                    			
                    // InternalDcDsl.g:3785:4: ( (lv_file_5_0= ruleEString ) )
                    // InternalDcDsl.g:3786:5: (lv_file_5_0= ruleEString )
                    {
                    // InternalDcDsl.g:3786:5: (lv_file_5_0= ruleEString )
                    // InternalDcDsl.g:3787:6: lv_file_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSecretAccess().getFileEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_file_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSecretRule());
                    						}
                    						set(
                    							current,
                    							"file",
                    							lv_file_5_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_6, grammarAccess.getSecretAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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


    // $ANTLR start "entryRuleResource"
    // InternalDcDsl.g:3813:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalDcDsl.g:3813:49: (iv_ruleResource= ruleResource EOF )
            // InternalDcDsl.g:3814:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalDcDsl.g:3820:1: ruleResource returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_END_BLOCK_6=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_memory_5_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3826:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3827:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3827:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            // InternalDcDsl.g:3828:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3828:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:3829:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:3829:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:3830:5: lv_id_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getIdEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_id_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_0_0,
            						"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getResourceAccess().getColonKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_32); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getResourceAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalDcDsl.g:3855:3: (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==76) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalDcDsl.g:3856:4: otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getMemoryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getColonKeyword_3_1());
                    			
                    // InternalDcDsl.g:3864:4: ( (lv_memory_5_0= ruleEString ) )
                    // InternalDcDsl.g:3865:5: (lv_memory_5_0= ruleEString )
                    {
                    // InternalDcDsl.g:3865:5: (lv_memory_5_0= ruleEString )
                    // InternalDcDsl.g:3866:6: lv_memory_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getMemoryEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_memory_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						set(
                    							current,
                    							"memory",
                    							lv_memory_5_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_6, grammarAccess.getResourceAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleEBoolean"
    // InternalDcDsl.g:3892:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDcDsl.g:3892:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDcDsl.g:3893:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalDcDsl.g:3899:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDcDsl.g:3905:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDcDsl.g:3906:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDcDsl.g:3906:2: (kw= 'true' | kw= 'false' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==23) ) {
                alt61=1;
            }
            else if ( (LA61_0==24) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalDcDsl.g:3907:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:3913:3: kw= 'false'
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


    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\137\uffff";
    static final String dfa_2s = "\1\1\1\uffff\1\27\1\30\1\33\1\35\1\uffff\1\63\16\uffff\1\77\2\uffff\1\115\1\133\2\uffff\1\136\101\uffff";
    static final String dfa_3s = "\1\5\1\uffff\3\5\1\4\1\uffff\1\5\16\uffff\1\4\2\uffff\2\4\2\uffff\1\0\27\uffff\1\5\12\uffff\2\5\1\uffff\1\5\12\uffff\2\5\1\uffff\1\5\12\uffff\2\5\1\uffff";
    static final String dfa_4s = "\1\115\1\uffff\4\115\1\uffff\1\115\16\uffff\1\115\2\uffff\2\115\2\uffff\1\0\27\uffff\1\115\12\uffff\2\115\1\uffff\1\115\12\uffff\2\115\1\uffff\1\115\12\uffff\2\115\1\uffff";
    static final String dfa_5s = "\1\uffff\1\25\4\uffff\1\6\1\uffff\1\10\1\2\1\5\1\7\1\11\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\3\1\1\2\uffff\1\4\1\12\1\uffff\13\12\13\13\1\3\1\uffff\12\3\2\uffff\1\1\1\uffff\12\1\2\uffff\1\4\1\uffff\12\4\2\uffff\1\12";
    static final String dfa_6s = "\137\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\12\1\uffff\1\3\1\11\1\2\1\4\1\17\3\uffff\1\1\1\5\5\1\2\uffff\1\21\1\20\1\22\1\23\1\24\1\25\1\6\1\13\1\10\1\14\1\7\1\15\1\16\50\1",
            "",
            "\2\27\1\uffff\5\27\3\uffff\1\27\1\26\5\27\2\uffff\65\27",
            "\2\30\1\uffff\5\30\3\uffff\1\30\1\31\5\30\2\uffff\65\30",
            "\2\33\1\uffff\5\33\3\uffff\1\33\1\32\5\33\2\uffff\65\33",
            "\1\1\1\34\1\42\1\1\1\37\1\41\1\36\1\40\1\42\3\uffff\1\34\1\40\5\34\2\1\1\44\1\43\1\45\1\46\1\47\1\50\1\40\1\42\1\40\1\42\1\40\2\42\50\40",
            "",
            "\1\63\1\51\1\1\1\60\1\61\1\62\2\63\3\uffff\7\63\2\1\1\52\1\53\1\54\1\55\1\56\1\57\57\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\27\1\64\1\65\1\74\1\75\1\76\2\77\3\uffff\7\77\1\100\1\101\1\66\1\67\1\70\1\71\1\72\1\73\57\77",
            "",
            "",
            "\2\30\1\102\1\103\1\112\1\113\1\114\2\115\3\uffff\7\115\1\116\1\117\1\104\1\105\1\106\1\107\1\110\1\111\57\115",
            "\2\33\1\120\1\121\1\130\1\131\1\132\2\133\3\uffff\7\133\1\134\1\135\1\122\1\123\1\124\1\125\1\126\1\127\57\133",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\77\5\1\17\uffff\50\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\77\5\1\17\uffff\50\1",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\77\5\1\17\uffff\50\1",
            "",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\115\5\1\17\uffff\50\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\115\5\1\17\uffff\50\1",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\115\5\1\17\uffff\50\1",
            "",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\133\5\1\17\uffff\50\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\133\5\1\17\uffff\50\1",
            "\1\1\2\uffff\1\1\1\uffff\2\1\4\uffff\1\1\1\133\5\1\17\uffff\50\1",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

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
            return "()* loopback of 436:3: (this_YAML_SCALAR_7= RULE_YAML_SCALAR | this_GH_EXPRESSION_8= RULE_GH_EXPRESSION | this_ID_9= RULE_ID | this_INT_10= RULE_INT | this_STRING_11= RULE_STRING | kw= '-' | kw= '[' | kw= ']' | kw= ';' | kw= ':' | kw= ',' | kw= '{' | kw= '}' | this_ANY_OTHER_20= RULE_ANY_OTHER | kw= '|' | kw= '>' | kw= '>-' | kw= '>+' | kw= '|-' | kw= '|+' )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000007F800FC0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000007D0002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000007F800FE0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000017F800FD0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003FFE021F72L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003FFE021F62L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x07FFFFC000700020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000007F800FD0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xFFFFFFC0007D0D00L,0x0000000000003FFFL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xFFFFFFC0007D0D20L,0x0000000000003FFFL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x200000007F800FF2L,0x0000000000000070L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x200000007F800FE2L,0x0000000000000070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x2000000000000022L,0x0000000000000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x7800000000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x8000000000000020L,0x0000000000000003L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000F80L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L,0x0000000000001000L});

}
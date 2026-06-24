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


    // $ANTLR start "entryRuleEnvEntry"
    // InternalDcDsl.g:990:1: entryRuleEnvEntry returns [EObject current=null] : iv_ruleEnvEntry= ruleEnvEntry EOF ;
    public final EObject entryRuleEnvEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvEntry = null;


        try {
            // InternalDcDsl.g:990:49: (iv_ruleEnvEntry= ruleEnvEntry EOF )
            // InternalDcDsl.g:991:2: iv_ruleEnvEntry= ruleEnvEntry EOF
            {
             newCompositeNode(grammarAccess.getEnvEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvEntry=ruleEnvEntry();

            state._fsp--;

             current =iv_ruleEnvEntry; 
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
    // $ANTLR end "entryRuleEnvEntry"


    // $ANTLR start "ruleEnvEntry"
    // InternalDcDsl.g:997:1: ruleEnvEntry returns [EObject current=null] : ( () ( (lv_key_1_0= ruleEString ) ) ) ;
    public final EObject ruleEnvEntry() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_key_1_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:1003:2: ( ( () ( (lv_key_1_0= ruleEString ) ) ) )
            // InternalDcDsl.g:1004:2: ( () ( (lv_key_1_0= ruleEString ) ) )
            {
            // InternalDcDsl.g:1004:2: ( () ( (lv_key_1_0= ruleEString ) ) )
            // InternalDcDsl.g:1005:3: () ( (lv_key_1_0= ruleEString ) )
            {
            // InternalDcDsl.g:1005:3: ()
            // InternalDcDsl.g:1006:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEnvEntryAccess().getKeyValuePairAction_0(),
            					current);
            			

            }

            // InternalDcDsl.g:1012:3: ( (lv_key_1_0= ruleEString ) )
            // InternalDcDsl.g:1013:4: (lv_key_1_0= ruleEString )
            {
            // InternalDcDsl.g:1013:4: (lv_key_1_0= ruleEString )
            // InternalDcDsl.g:1014:5: lv_key_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvEntryAccess().getKeyEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_key_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvEntryRule());
            					}
            					set(
            						current,
            						"key",
            						lv_key_1_0,
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
    // $ANTLR end "ruleEnvEntry"


    // $ANTLR start "entryRuleService"
    // InternalDcDsl.g:1035:1: entryRuleService returns [EObject current=null] : iv_ruleService= ruleService EOF ;
    public final EObject entryRuleService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleService = null;


        try {
            // InternalDcDsl.g:1035:48: (iv_ruleService= ruleService EOF )
            // InternalDcDsl.g:1036:2: iv_ruleService= ruleService EOF
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
    // InternalDcDsl.g:1042:1: ruleService returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) ) | (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) ) | (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) ) | (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) ) | (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) ) | (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) ) | (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK ) | (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) ) | (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) ) | (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK ) | (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) ) | (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK ) )* this_END_BLOCK_160= RULE_END_BLOCK ) ;
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
        Token this_BEG_BLOCK_40=null;
        Token this_END_BLOCK_42=null;
        Token this_END_BLOCK_43=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token this_BEG_BLOCK_51=null;
        Token otherlv_52=null;
        Token this_BEG_BLOCK_53=null;
        Token lv_expose_54_0=null;
        Token this_END_BLOCK_55=null;
        Token this_END_BLOCK_56=null;
        Token otherlv_57=null;
        Token lv_expose_58_0=null;
        Token otherlv_59=null;
        Token lv_expose_60_0=null;
        Token otherlv_61=null;
        Token otherlv_62=null;
        Token otherlv_63=null;
        Token this_BEG_BLOCK_64=null;
        Token otherlv_65=null;
        Token this_BEG_BLOCK_66=null;
        Token this_END_BLOCK_68=null;
        Token this_END_BLOCK_69=null;
        Token otherlv_70=null;
        Token otherlv_72=null;
        Token otherlv_74=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token this_BEG_BLOCK_78=null;
        Token otherlv_79=null;
        Token this_BEG_BLOCK_80=null;
        Token this_END_BLOCK_82=null;
        Token this_END_BLOCK_83=null;
        Token otherlv_84=null;
        Token otherlv_86=null;
        Token otherlv_88=null;
        Token otherlv_89=null;
        Token otherlv_90=null;
        Token this_BEG_BLOCK_91=null;
        Token otherlv_92=null;
        Token this_BEG_BLOCK_93=null;
        Token this_END_BLOCK_95=null;
        Token this_END_BLOCK_96=null;
        Token otherlv_97=null;
        Token otherlv_99=null;
        Token otherlv_101=null;
        Token otherlv_102=null;
        Token otherlv_103=null;
        Token this_BEG_BLOCK_104=null;
        Token otherlv_105=null;
        Token this_BEG_BLOCK_106=null;
        Token this_END_BLOCK_108=null;
        Token this_END_BLOCK_109=null;
        Token otherlv_110=null;
        Token otherlv_112=null;
        Token otherlv_114=null;
        Token otherlv_115=null;
        Token otherlv_116=null;
        Token this_BEG_BLOCK_117=null;
        Token otherlv_118=null;
        Token this_BEG_BLOCK_119=null;
        Token this_END_BLOCK_121=null;
        Token this_END_BLOCK_122=null;
        Token otherlv_123=null;
        Token otherlv_125=null;
        Token otherlv_127=null;
        Token otherlv_128=null;
        Token otherlv_129=null;
        Token this_BEG_BLOCK_130=null;
        Token otherlv_132=null;
        Token this_BEG_BLOCK_133=null;
        Token this_END_BLOCK_135=null;
        Token this_END_BLOCK_136=null;
        Token otherlv_137=null;
        Token otherlv_138=null;
        Token otherlv_140=null;
        Token otherlv_141=null;
        Token otherlv_143=null;
        Token otherlv_144=null;
        Token this_BEG_BLOCK_145=null;
        Token this_END_BLOCK_147=null;
        Token otherlv_148=null;
        Token otherlv_149=null;
        Token otherlv_151=null;
        Token otherlv_152=null;
        Token this_BEG_BLOCK_153=null;
        Token otherlv_155=null;
        Token this_BEG_BLOCK_156=null;
        Token this_END_BLOCK_158=null;
        Token this_END_BLOCK_159=null;
        Token this_END_BLOCK_160=null;
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

        AntlrDatatypeRuleToken lv_ports_41_0 = null;

        AntlrDatatypeRuleToken lv_ports_45_0 = null;

        AntlrDatatypeRuleToken lv_ports_47_0 = null;

        AntlrDatatypeRuleToken lv_command_67_0 = null;

        AntlrDatatypeRuleToken lv_command_71_0 = null;

        AntlrDatatypeRuleToken lv_command_73_0 = null;

        AntlrDatatypeRuleToken lv_command_75_0 = null;

        AntlrDatatypeRuleToken lv_secrets_81_0 = null;

        AntlrDatatypeRuleToken lv_secrets_85_0 = null;

        AntlrDatatypeRuleToken lv_secrets_87_0 = null;

        AntlrDatatypeRuleToken lv_capAdd_94_0 = null;

        AntlrDatatypeRuleToken lv_capAdd_98_0 = null;

        AntlrDatatypeRuleToken lv_capAdd_100_0 = null;

        AntlrDatatypeRuleToken lv_labels_107_0 = null;

        AntlrDatatypeRuleToken lv_labels_111_0 = null;

        AntlrDatatypeRuleToken lv_labels_113_0 = null;

        AntlrDatatypeRuleToken lv_sysctls_120_0 = null;

        AntlrDatatypeRuleToken lv_sysctls_124_0 = null;

        AntlrDatatypeRuleToken lv_sysctls_126_0 = null;

        EObject lv_environment_131_0 = null;

        EObject lv_environment_134_0 = null;

        EObject lv_dependsOn_139_0 = null;

        EObject lv_networks_142_0 = null;

        EObject lv_volumes_146_0 = null;

        EObject lv_healthcheck_150_0 = null;

        EObject lv_deploy_157_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:1048:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) ) | (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) ) | (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) ) | (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) ) | (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) ) | (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) ) | (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK ) | (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) ) | (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) ) | (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK ) | (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) ) | (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK ) )* this_END_BLOCK_160= RULE_END_BLOCK ) )
            // InternalDcDsl.g:1049:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) ) | (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) ) | (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) ) | (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) ) | (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) ) | (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) ) | (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK ) | (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) ) | (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) ) | (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK ) | (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) ) | (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK ) )* this_END_BLOCK_160= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:1049:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) ) | (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) ) | (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) ) | (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) ) | (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) ) | (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) ) | (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK ) | (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) ) | (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) ) | (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK ) | (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) ) | (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK ) )* this_END_BLOCK_160= RULE_END_BLOCK )
            // InternalDcDsl.g:1050:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) ) | (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) ) | (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) ) | (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) ) | (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) ) | (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) ) | (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK ) | (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) ) | (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) ) | (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK ) | (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) ) | (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK ) )* this_END_BLOCK_160= RULE_END_BLOCK
            {
            // InternalDcDsl.g:1050:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:1051:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:1051:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:1052:5: lv_id_0_0= ruleEString
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
            		
            // InternalDcDsl.g:1077:3: ( (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) ) | (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) ) | (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) ) | (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) ) | (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) ) | (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) ) | (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) ) | (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) ) | (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) ) | (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) ) | (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) ) | (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) ) | (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) ) | (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) ) | (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) ) | (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) ) | (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) ) | (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) ) | (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK ) | (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) ) | (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) ) | (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK ) | (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) ) | (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK ) )*
            loop54:
            do {
                int alt54=25;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    alt54=1;
                    }
                    break;
                case 39:
                    {
                    alt54=2;
                    }
                    break;
                case 40:
                    {
                    alt54=3;
                    }
                    break;
                case 41:
                    {
                    alt54=4;
                    }
                    break;
                case 42:
                    {
                    alt54=5;
                    }
                    break;
                case 43:
                    {
                    alt54=6;
                    }
                    break;
                case 44:
                    {
                    alt54=7;
                    }
                    break;
                case 45:
                    {
                    alt54=8;
                    }
                    break;
                case 46:
                    {
                    alt54=9;
                    }
                    break;
                case 47:
                    {
                    alt54=10;
                    }
                    break;
                case 48:
                    {
                    alt54=11;
                    }
                    break;
                case 49:
                    {
                    alt54=12;
                    }
                    break;
                case 50:
                    {
                    alt54=13;
                    }
                    break;
                case 51:
                    {
                    alt54=14;
                    }
                    break;
                case 22:
                    {
                    alt54=15;
                    }
                    break;
                case 52:
                    {
                    alt54=16;
                    }
                    break;
                case 53:
                    {
                    alt54=17;
                    }
                    break;
                case 54:
                    {
                    alt54=18;
                    }
                    break;
                case 55:
                    {
                    alt54=19;
                    }
                    break;
                case 56:
                    {
                    alt54=20;
                    }
                    break;
                case 20:
                    {
                    alt54=21;
                    }
                    break;
                case 21:
                    {
                    alt54=22;
                    }
                    break;
                case 57:
                    {
                    alt54=23;
                    }
                    break;
                case 58:
                    {
                    alt54=24;
                    }
                    break;

                }

                switch (alt54) {
            	case 1 :
            	    // InternalDcDsl.g:1078:4: (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1078:4: (otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1079:5: otherlv_3= 'image' otherlv_4= ':' ( (lv_image_5_0= ruleEString ) )
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_3); 

            	    					newLeafNode(otherlv_3, grammarAccess.getServiceAccess().getImageKeyword_3_0_0());
            	    				
            	    otherlv_4=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getServiceAccess().getColonKeyword_3_0_1());
            	    				
            	    // InternalDcDsl.g:1087:5: ( (lv_image_5_0= ruleEString ) )
            	    // InternalDcDsl.g:1088:6: (lv_image_5_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1088:6: (lv_image_5_0= ruleEString )
            	    // InternalDcDsl.g:1089:7: lv_image_5_0= ruleEString
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
            	    // InternalDcDsl.g:1108:4: (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) )
            	    {
            	    // InternalDcDsl.g:1108:4: (otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) ) )
            	    // InternalDcDsl.g:1109:5: otherlv_6= 'build' otherlv_7= ':' ( (lv_build_8_0= ruleBuild ) )
            	    {
            	    otherlv_6=(Token)match(input,39,FOLLOW_3); 

            	    					newLeafNode(otherlv_6, grammarAccess.getServiceAccess().getBuildKeyword_3_1_0());
            	    				
            	    otherlv_7=(Token)match(input,17,FOLLOW_12); 

            	    					newLeafNode(otherlv_7, grammarAccess.getServiceAccess().getColonKeyword_3_1_1());
            	    				
            	    // InternalDcDsl.g:1117:5: ( (lv_build_8_0= ruleBuild ) )
            	    // InternalDcDsl.g:1118:6: (lv_build_8_0= ruleBuild )
            	    {
            	    // InternalDcDsl.g:1118:6: (lv_build_8_0= ruleBuild )
            	    // InternalDcDsl.g:1119:7: lv_build_8_0= ruleBuild
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
            	    // InternalDcDsl.g:1138:4: (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1138:4: (otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1139:5: otherlv_9= 'container_name' otherlv_10= ':' ( (lv_containerName_11_0= ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_3); 

            	    					newLeafNode(otherlv_9, grammarAccess.getServiceAccess().getContainer_nameKeyword_3_2_0());
            	    				
            	    otherlv_10=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_10, grammarAccess.getServiceAccess().getColonKeyword_3_2_1());
            	    				
            	    // InternalDcDsl.g:1147:5: ( (lv_containerName_11_0= ruleEString ) )
            	    // InternalDcDsl.g:1148:6: (lv_containerName_11_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1148:6: (lv_containerName_11_0= ruleEString )
            	    // InternalDcDsl.g:1149:7: lv_containerName_11_0= ruleEString
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
            	    // InternalDcDsl.g:1168:4: (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1168:4: (otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1169:5: otherlv_12= 'restart' otherlv_13= ':' ( (lv_restart_14_0= ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,41,FOLLOW_3); 

            	    					newLeafNode(otherlv_12, grammarAccess.getServiceAccess().getRestartKeyword_3_3_0());
            	    				
            	    otherlv_13=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_13, grammarAccess.getServiceAccess().getColonKeyword_3_3_1());
            	    				
            	    // InternalDcDsl.g:1177:5: ( (lv_restart_14_0= ruleEString ) )
            	    // InternalDcDsl.g:1178:6: (lv_restart_14_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1178:6: (lv_restart_14_0= ruleEString )
            	    // InternalDcDsl.g:1179:7: lv_restart_14_0= ruleEString
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
            	    // InternalDcDsl.g:1198:4: (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1198:4: (otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1199:5: otherlv_15= 'user' otherlv_16= ':' ( (lv_user_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,42,FOLLOW_3); 

            	    					newLeafNode(otherlv_15, grammarAccess.getServiceAccess().getUserKeyword_3_4_0());
            	    				
            	    otherlv_16=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_16, grammarAccess.getServiceAccess().getColonKeyword_3_4_1());
            	    				
            	    // InternalDcDsl.g:1207:5: ( (lv_user_17_0= ruleEString ) )
            	    // InternalDcDsl.g:1208:6: (lv_user_17_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1208:6: (lv_user_17_0= ruleEString )
            	    // InternalDcDsl.g:1209:7: lv_user_17_0= ruleEString
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
            	    // InternalDcDsl.g:1228:4: (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1228:4: (otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1229:5: otherlv_18= 'hostname' otherlv_19= ':' ( (lv_hostname_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,43,FOLLOW_3); 

            	    					newLeafNode(otherlv_18, grammarAccess.getServiceAccess().getHostnameKeyword_3_5_0());
            	    				
            	    otherlv_19=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_19, grammarAccess.getServiceAccess().getColonKeyword_3_5_1());
            	    				
            	    // InternalDcDsl.g:1237:5: ( (lv_hostname_20_0= ruleEString ) )
            	    // InternalDcDsl.g:1238:6: (lv_hostname_20_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1238:6: (lv_hostname_20_0= ruleEString )
            	    // InternalDcDsl.g:1239:7: lv_hostname_20_0= ruleEString
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
            	    // InternalDcDsl.g:1258:4: (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1258:4: (otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1259:5: otherlv_21= 'network_mode' otherlv_22= ':' ( (lv_networkMode_23_0= ruleEString ) )
            	    {
            	    otherlv_21=(Token)match(input,44,FOLLOW_3); 

            	    					newLeafNode(otherlv_21, grammarAccess.getServiceAccess().getNetwork_modeKeyword_3_6_0());
            	    				
            	    otherlv_22=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_22, grammarAccess.getServiceAccess().getColonKeyword_3_6_1());
            	    				
            	    // InternalDcDsl.g:1267:5: ( (lv_networkMode_23_0= ruleEString ) )
            	    // InternalDcDsl.g:1268:6: (lv_networkMode_23_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1268:6: (lv_networkMode_23_0= ruleEString )
            	    // InternalDcDsl.g:1269:7: lv_networkMode_23_0= ruleEString
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
            	    // InternalDcDsl.g:1288:4: (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1288:4: (otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1289:5: otherlv_24= 'platform' otherlv_25= ':' ( (lv_platform_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,45,FOLLOW_3); 

            	    					newLeafNode(otherlv_24, grammarAccess.getServiceAccess().getPlatformKeyword_3_7_0());
            	    				
            	    otherlv_25=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_25, grammarAccess.getServiceAccess().getColonKeyword_3_7_1());
            	    				
            	    // InternalDcDsl.g:1297:5: ( (lv_platform_26_0= ruleEString ) )
            	    // InternalDcDsl.g:1298:6: (lv_platform_26_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1298:6: (lv_platform_26_0= ruleEString )
            	    // InternalDcDsl.g:1299:7: lv_platform_26_0= ruleEString
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
            	    // InternalDcDsl.g:1318:4: (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1318:4: (otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1319:5: otherlv_27= 'runtime' otherlv_28= ':' ( (lv_runtime_29_0= ruleEString ) )
            	    {
            	    otherlv_27=(Token)match(input,46,FOLLOW_3); 

            	    					newLeafNode(otherlv_27, grammarAccess.getServiceAccess().getRuntimeKeyword_3_8_0());
            	    				
            	    otherlv_28=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_28, grammarAccess.getServiceAccess().getColonKeyword_3_8_1());
            	    				
            	    // InternalDcDsl.g:1327:5: ( (lv_runtime_29_0= ruleEString ) )
            	    // InternalDcDsl.g:1328:6: (lv_runtime_29_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1328:6: (lv_runtime_29_0= ruleEString )
            	    // InternalDcDsl.g:1329:7: lv_runtime_29_0= ruleEString
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
            	    // InternalDcDsl.g:1348:4: (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:1348:4: (otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) ) )
            	    // InternalDcDsl.g:1349:5: otherlv_30= 'stop_signal' otherlv_31= ':' ( (lv_stopSignal_32_0= ruleEString ) )
            	    {
            	    otherlv_30=(Token)match(input,47,FOLLOW_3); 

            	    					newLeafNode(otherlv_30, grammarAccess.getServiceAccess().getStop_signalKeyword_3_9_0());
            	    				
            	    otherlv_31=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_31, grammarAccess.getServiceAccess().getColonKeyword_3_9_1());
            	    				
            	    // InternalDcDsl.g:1357:5: ( (lv_stopSignal_32_0= ruleEString ) )
            	    // InternalDcDsl.g:1358:6: (lv_stopSignal_32_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:1358:6: (lv_stopSignal_32_0= ruleEString )
            	    // InternalDcDsl.g:1359:7: lv_stopSignal_32_0= ruleEString
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
            	    // InternalDcDsl.g:1378:4: (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) )
            	    {
            	    // InternalDcDsl.g:1378:4: (otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) ) )
            	    // InternalDcDsl.g:1379:5: otherlv_33= 'stdin_open' otherlv_34= ':' ( (lv_stdinOpen_35_0= ruleEBoolean ) )
            	    {
            	    otherlv_33=(Token)match(input,48,FOLLOW_3); 

            	    					newLeafNode(otherlv_33, grammarAccess.getServiceAccess().getStdin_openKeyword_3_10_0());
            	    				
            	    otherlv_34=(Token)match(input,17,FOLLOW_13); 

            	    					newLeafNode(otherlv_34, grammarAccess.getServiceAccess().getColonKeyword_3_10_1());
            	    				
            	    // InternalDcDsl.g:1387:5: ( (lv_stdinOpen_35_0= ruleEBoolean ) )
            	    // InternalDcDsl.g:1388:6: (lv_stdinOpen_35_0= ruleEBoolean )
            	    {
            	    // InternalDcDsl.g:1388:6: (lv_stdinOpen_35_0= ruleEBoolean )
            	    // InternalDcDsl.g:1389:7: lv_stdinOpen_35_0= ruleEBoolean
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
            	    // InternalDcDsl.g:1408:4: (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1408:4: (otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) ) )
            	    // InternalDcDsl.g:1409:5: otherlv_36= 'ports' otherlv_37= ':' ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) )
            	    {
            	    otherlv_36=(Token)match(input,49,FOLLOW_3); 

            	    					newLeafNode(otherlv_36, grammarAccess.getServiceAccess().getPortsKeyword_3_11_0());
            	    				
            	    otherlv_37=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_37, grammarAccess.getServiceAccess().getColonKeyword_3_11_1());
            	    				
            	    // InternalDcDsl.g:1417:5: ( (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK ) | (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_BEG_BLOCK) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==32) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalDcDsl.g:1418:6: (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1418:6: (this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1419:7: this_BEG_BLOCK_38= RULE_BEG_BLOCK (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+ this_END_BLOCK_43= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_38=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_38, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_11_2_0_0());
            	            						
            	            // InternalDcDsl.g:1423:7: (otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )? )+
            	            int cnt14=0;
            	            loop14:
            	            do {
            	                int alt14=2;
            	                int LA14_0 = input.LA(1);

            	                if ( (LA14_0==31) ) {
            	                    alt14=1;
            	                }


            	                switch (alt14) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1424:8: otherlv_39= '-' (this_BEG_BLOCK_40= RULE_BEG_BLOCK )? ( (lv_ports_41_0= ruleEString ) ) (this_END_BLOCK_42= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_39=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_39, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_11_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1428:8: (this_BEG_BLOCK_40= RULE_BEG_BLOCK )?
            	            	    int alt12=2;
            	            	    int LA12_0 = input.LA(1);

            	            	    if ( (LA12_0==RULE_BEG_BLOCK) ) {
            	            	        alt12=1;
            	            	    }
            	            	    switch (alt12) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1429:9: this_BEG_BLOCK_40= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_40=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_40, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_11_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:1434:8: ( (lv_ports_41_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1435:9: (lv_ports_41_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1435:9: (lv_ports_41_0= ruleEString )
            	            	    // InternalDcDsl.g:1436:10: lv_ports_41_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getPortsEStringParserRuleCall_3_11_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_ports_41_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"ports",
            	            	    											lv_ports_41_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:1453:8: (this_END_BLOCK_42= RULE_END_BLOCK )?
            	            	    int alt13=2;
            	            	    int LA13_0 = input.LA(1);

            	            	    if ( (LA13_0==RULE_END_BLOCK) ) {
            	            	        int LA13_1 = input.LA(2);

            	            	        if ( (LA13_1==RULE_END_BLOCK) ) {
            	            	            int LA13_3 = input.LA(3);

            	            	            if ( (LA13_3==RULE_END_BLOCK) ) {
            	            	                int LA13_5 = input.LA(4);

            	            	                if ( (LA13_5==EOF) ) {
            	            	                    int LA13_6 = input.LA(5);

            	            	                    if ( (LA13_6==EOF) ) {
            	            	                        alt13=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA13_5>=RULE_END_BLOCK && LA13_5<=RULE_INT)||(LA13_5>=23 && LA13_5<=30)) ) {
            	            	                    alt13=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA13_3>=20 && LA13_3<=22)||(LA13_3>=38 && LA13_3<=58)) ) {
            	            	                alt13=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA13_1==31) ) {
            	            	            alt13=1;
            	            	        }
            	            	    }
            	            	    switch (alt13) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1454:9: this_END_BLOCK_42= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_42=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_42, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_11_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt14 >= 1 ) break loop14;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(14, input);
            	                        throw eee;
            	                }
            	                cnt14++;
            	            } while (true);

            	            this_END_BLOCK_43=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_43, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_11_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1466:6: (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' )
            	            {
            	            // InternalDcDsl.g:1466:6: (otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']' )
            	            // InternalDcDsl.g:1467:7: otherlv_44= '[' ( (lv_ports_45_0= ruleEString ) ) (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )* otherlv_48= ']'
            	            {
            	            otherlv_44=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_44, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_11_2_1_0());
            	            						
            	            // InternalDcDsl.g:1471:7: ( (lv_ports_45_0= ruleEString ) )
            	            // InternalDcDsl.g:1472:8: (lv_ports_45_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1472:8: (lv_ports_45_0= ruleEString )
            	            // InternalDcDsl.g:1473:9: lv_ports_45_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getPortsEStringParserRuleCall_3_11_2_1_1_0());
            	            								
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

            	            // InternalDcDsl.g:1490:7: (otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) ) )*
            	            loop15:
            	            do {
            	                int alt15=2;
            	                int LA15_0 = input.LA(1);

            	                if ( (LA15_0==35) ) {
            	                    alt15=1;
            	                }


            	                switch (alt15) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1491:8: otherlv_46= ',' ( (lv_ports_47_0= ruleEString ) )
            	            	    {
            	            	    otherlv_46=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_46, grammarAccess.getServiceAccess().getCommaKeyword_3_11_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1495:8: ( (lv_ports_47_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1496:9: (lv_ports_47_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1496:9: (lv_ports_47_0= ruleEString )
            	            	    // InternalDcDsl.g:1497:10: lv_ports_47_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getPortsEStringParserRuleCall_3_11_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_ports_47_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"ports",
            	            	    											lv_ports_47_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop15;
            	                }
            	            } while (true);

            	            otherlv_48=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_48, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_11_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // InternalDcDsl.g:1523:4: (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1523:4: (otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) ) )
            	    // InternalDcDsl.g:1524:5: otherlv_49= 'expose' otherlv_50= ':' ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) )
            	    {
            	    otherlv_49=(Token)match(input,50,FOLLOW_3); 

            	    					newLeafNode(otherlv_49, grammarAccess.getServiceAccess().getExposeKeyword_3_12_0());
            	    				
            	    otherlv_50=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_50, grammarAccess.getServiceAccess().getColonKeyword_3_12_1());
            	    				
            	    // InternalDcDsl.g:1532:5: ( (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK ) | (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' ) )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==RULE_BEG_BLOCK) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==32) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalDcDsl.g:1533:6: (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1533:6: (this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1534:7: this_BEG_BLOCK_51= RULE_BEG_BLOCK (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+ this_END_BLOCK_56= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_51=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_51, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_12_2_0_0());
            	            						
            	            // InternalDcDsl.g:1538:7: (otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )? )+
            	            int cnt19=0;
            	            loop19:
            	            do {
            	                int alt19=2;
            	                int LA19_0 = input.LA(1);

            	                if ( (LA19_0==31) ) {
            	                    alt19=1;
            	                }


            	                switch (alt19) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1539:8: otherlv_52= '-' (this_BEG_BLOCK_53= RULE_BEG_BLOCK )? ( (lv_expose_54_0= RULE_INT ) ) (this_END_BLOCK_55= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_52=(Token)match(input,31,FOLLOW_18); 

            	            	    								newLeafNode(otherlv_52, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_12_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1543:8: (this_BEG_BLOCK_53= RULE_BEG_BLOCK )?
            	            	    int alt17=2;
            	            	    int LA17_0 = input.LA(1);

            	            	    if ( (LA17_0==RULE_BEG_BLOCK) ) {
            	            	        alt17=1;
            	            	    }
            	            	    switch (alt17) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1544:9: this_BEG_BLOCK_53= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_53=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_19); 

            	            	            									newLeafNode(this_BEG_BLOCK_53, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_12_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:1549:8: ( (lv_expose_54_0= RULE_INT ) )
            	            	    // InternalDcDsl.g:1550:9: (lv_expose_54_0= RULE_INT )
            	            	    {
            	            	    // InternalDcDsl.g:1550:9: (lv_expose_54_0= RULE_INT )
            	            	    // InternalDcDsl.g:1551:10: lv_expose_54_0= RULE_INT
            	            	    {
            	            	    lv_expose_54_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            	            	    										newLeafNode(lv_expose_54_0, grammarAccess.getServiceAccess().getExposeINTTerminalRuleCall_3_12_2_0_1_2_0());
            	            	    									

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

            	            	    // InternalDcDsl.g:1567:8: (this_END_BLOCK_55= RULE_END_BLOCK )?
            	            	    int alt18=2;
            	            	    int LA18_0 = input.LA(1);

            	            	    if ( (LA18_0==RULE_END_BLOCK) ) {
            	            	        int LA18_1 = input.LA(2);

            	            	        if ( (LA18_1==RULE_END_BLOCK) ) {
            	            	            int LA18_3 = input.LA(3);

            	            	            if ( (LA18_3==RULE_END_BLOCK) ) {
            	            	                int LA18_5 = input.LA(4);

            	            	                if ( (LA18_5==EOF) ) {
            	            	                    int LA18_6 = input.LA(5);

            	            	                    if ( (LA18_6==EOF) ) {
            	            	                        alt18=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA18_5>=RULE_END_BLOCK && LA18_5<=RULE_INT)||(LA18_5>=23 && LA18_5<=30)) ) {
            	            	                    alt18=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA18_3>=20 && LA18_3<=22)||(LA18_3>=38 && LA18_3<=58)) ) {
            	            	                alt18=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA18_1==31) ) {
            	            	            alt18=1;
            	            	        }
            	            	    }
            	            	    switch (alt18) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1568:9: this_END_BLOCK_55= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_55=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_55, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_12_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

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

            	            this_END_BLOCK_56=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_56, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_12_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1580:6: (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' )
            	            {
            	            // InternalDcDsl.g:1580:6: (otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']' )
            	            // InternalDcDsl.g:1581:7: otherlv_57= '[' ( (lv_expose_58_0= RULE_INT ) ) (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )* otherlv_61= ']'
            	            {
            	            otherlv_57=(Token)match(input,32,FOLLOW_19); 

            	            							newLeafNode(otherlv_57, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_12_2_1_0());
            	            						
            	            // InternalDcDsl.g:1585:7: ( (lv_expose_58_0= RULE_INT ) )
            	            // InternalDcDsl.g:1586:8: (lv_expose_58_0= RULE_INT )
            	            {
            	            // InternalDcDsl.g:1586:8: (lv_expose_58_0= RULE_INT )
            	            // InternalDcDsl.g:1587:9: lv_expose_58_0= RULE_INT
            	            {
            	            lv_expose_58_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	            									newLeafNode(lv_expose_58_0, grammarAccess.getServiceAccess().getExposeINTTerminalRuleCall_3_12_2_1_1_0());
            	            								

            	            									if (current==null) {
            	            										current = createModelElement(grammarAccess.getServiceRule());
            	            									}
            	            									addWithLastConsumed(
            	            										current,
            	            										"expose",
            	            										lv_expose_58_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.INT");
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1603:7: (otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) ) )*
            	            loop20:
            	            do {
            	                int alt20=2;
            	                int LA20_0 = input.LA(1);

            	                if ( (LA20_0==35) ) {
            	                    alt20=1;
            	                }


            	                switch (alt20) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1604:8: otherlv_59= ',' ( (lv_expose_60_0= RULE_INT ) )
            	            	    {
            	            	    otherlv_59=(Token)match(input,35,FOLLOW_19); 

            	            	    								newLeafNode(otherlv_59, grammarAccess.getServiceAccess().getCommaKeyword_3_12_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1608:8: ( (lv_expose_60_0= RULE_INT ) )
            	            	    // InternalDcDsl.g:1609:9: (lv_expose_60_0= RULE_INT )
            	            	    {
            	            	    // InternalDcDsl.g:1609:9: (lv_expose_60_0= RULE_INT )
            	            	    // InternalDcDsl.g:1610:10: lv_expose_60_0= RULE_INT
            	            	    {
            	            	    lv_expose_60_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            	            	    										newLeafNode(lv_expose_60_0, grammarAccess.getServiceAccess().getExposeINTTerminalRuleCall_3_12_2_1_2_1_0());
            	            	    									

            	            	    										if (current==null) {
            	            	    											current = createModelElement(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										addWithLastConsumed(
            	            	    											current,
            	            	    											"expose",
            	            	    											lv_expose_60_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.INT");
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop20;
            	                }
            	            } while (true);

            	            otherlv_61=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_61, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_12_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // InternalDcDsl.g:1635:4: (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) )
            	    {
            	    // InternalDcDsl.g:1635:4: (otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) ) )
            	    // InternalDcDsl.g:1636:5: otherlv_62= 'command' otherlv_63= ':' ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) )
            	    {
            	    otherlv_62=(Token)match(input,51,FOLLOW_3); 

            	    					newLeafNode(otherlv_62, grammarAccess.getServiceAccess().getCommandKeyword_3_13_0());
            	    				
            	    otherlv_63=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_63, grammarAccess.getServiceAccess().getColonKeyword_3_13_1());
            	    				
            	    // InternalDcDsl.g:1644:5: ( (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK ) | (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' ) | ( (lv_command_75_0= ruleEString ) ) )
            	    int alt26=3;
            	    switch ( input.LA(1) ) {
            	    case RULE_BEG_BLOCK:
            	        {
            	        alt26=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt26=2;
            	        }
            	        break;
            	    case RULE_STRING:
            	    case RULE_SQ_STRING:
            	    case RULE_YAML_SCALAR:
            	    case RULE_GH_EXPRESSION:
            	    case RULE_ID:
            	    case RULE_INT:
            	    case 23:
            	    case 24:
            	    case 25:
            	    case 26:
            	    case 27:
            	    case 28:
            	    case 29:
            	    case 30:
            	        {
            	        alt26=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt26) {
            	        case 1 :
            	            // InternalDcDsl.g:1645:6: (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1645:6: (this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1646:7: this_BEG_BLOCK_64= RULE_BEG_BLOCK (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+ this_END_BLOCK_69= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_64=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_64, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_13_2_0_0());
            	            						
            	            // InternalDcDsl.g:1650:7: (otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )? )+
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
            	            	    // InternalDcDsl.g:1651:8: otherlv_65= '-' (this_BEG_BLOCK_66= RULE_BEG_BLOCK )? ( (lv_command_67_0= ruleEString ) ) (this_END_BLOCK_68= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_65=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_65, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_13_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1655:8: (this_BEG_BLOCK_66= RULE_BEG_BLOCK )?
            	            	    int alt22=2;
            	            	    int LA22_0 = input.LA(1);

            	            	    if ( (LA22_0==RULE_BEG_BLOCK) ) {
            	            	        alt22=1;
            	            	    }
            	            	    switch (alt22) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1656:9: this_BEG_BLOCK_66= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_66=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_66, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_13_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:1661:8: ( (lv_command_67_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1662:9: (lv_command_67_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1662:9: (lv_command_67_0= ruleEString )
            	            	    // InternalDcDsl.g:1663:10: lv_command_67_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_13_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
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

            	            	    // InternalDcDsl.g:1680:8: (this_END_BLOCK_68= RULE_END_BLOCK )?
            	            	    int alt23=2;
            	            	    int LA23_0 = input.LA(1);

            	            	    if ( (LA23_0==RULE_END_BLOCK) ) {
            	            	        int LA23_1 = input.LA(2);

            	            	        if ( (LA23_1==RULE_END_BLOCK) ) {
            	            	            int LA23_3 = input.LA(3);

            	            	            if ( (LA23_3==RULE_END_BLOCK) ) {
            	            	                int LA23_5 = input.LA(4);

            	            	                if ( (LA23_5==EOF) ) {
            	            	                    int LA23_6 = input.LA(5);

            	            	                    if ( (LA23_6==EOF) ) {
            	            	                        alt23=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA23_5>=RULE_END_BLOCK && LA23_5<=RULE_INT)||(LA23_5>=23 && LA23_5<=30)) ) {
            	            	                    alt23=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA23_3>=20 && LA23_3<=22)||(LA23_3>=38 && LA23_3<=58)) ) {
            	            	                alt23=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA23_1==31) ) {
            	            	            alt23=1;
            	            	        }
            	            	    }
            	            	    switch (alt23) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1681:9: this_END_BLOCK_68= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_68=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_68, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_13_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

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

            	            this_END_BLOCK_69=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_69, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_13_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1693:6: (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' )
            	            {
            	            // InternalDcDsl.g:1693:6: (otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']' )
            	            // InternalDcDsl.g:1694:7: otherlv_70= '[' ( (lv_command_71_0= ruleEString ) ) (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )* otherlv_74= ']'
            	            {
            	            otherlv_70=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_70, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_13_2_1_0());
            	            						
            	            // InternalDcDsl.g:1698:7: ( (lv_command_71_0= ruleEString ) )
            	            // InternalDcDsl.g:1699:8: (lv_command_71_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1699:8: (lv_command_71_0= ruleEString )
            	            // InternalDcDsl.g:1700:9: lv_command_71_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_13_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_command_71_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"command",
            	            										lv_command_71_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1717:7: (otherlv_72= ',' ( (lv_command_73_0= ruleEString ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==35) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1718:8: otherlv_72= ',' ( (lv_command_73_0= ruleEString ) )
            	            	    {
            	            	    otherlv_72=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_72, grammarAccess.getServiceAccess().getCommaKeyword_3_13_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1722:8: ( (lv_command_73_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1723:9: (lv_command_73_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1723:9: (lv_command_73_0= ruleEString )
            	            	    // InternalDcDsl.g:1724:10: lv_command_73_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_13_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_command_73_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"command",
            	            	    											lv_command_73_0,
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

            	            otherlv_74=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_74, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_13_2_1_3());
            	            						

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalDcDsl.g:1748:6: ( (lv_command_75_0= ruleEString ) )
            	            {
            	            // InternalDcDsl.g:1748:6: ( (lv_command_75_0= ruleEString ) )
            	            // InternalDcDsl.g:1749:7: (lv_command_75_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1749:7: (lv_command_75_0= ruleEString )
            	            // InternalDcDsl.g:1750:8: lv_command_75_0= ruleEString
            	            {

            	            								newCompositeNode(grammarAccess.getServiceAccess().getCommandEStringParserRuleCall_3_13_2_2_0());
            	            							
            	            pushFollow(FOLLOW_11);
            	            lv_command_75_0=ruleEString();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getServiceRule());
            	            								}
            	            								add(
            	            									current,
            	            									"command",
            	            									lv_command_75_0,
            	            									"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // InternalDcDsl.g:1770:4: (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1770:4: (otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) ) )
            	    // InternalDcDsl.g:1771:5: otherlv_76= 'secrets' otherlv_77= ':' ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) )
            	    {
            	    otherlv_76=(Token)match(input,22,FOLLOW_3); 

            	    					newLeafNode(otherlv_76, grammarAccess.getServiceAccess().getSecretsKeyword_3_14_0());
            	    				
            	    otherlv_77=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_77, grammarAccess.getServiceAccess().getColonKeyword_3_14_1());
            	    				
            	    // InternalDcDsl.g:1779:5: ( (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK ) | (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' ) )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_BEG_BLOCK) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==32) ) {
            	        alt31=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalDcDsl.g:1780:6: (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1780:6: (this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1781:7: this_BEG_BLOCK_78= RULE_BEG_BLOCK (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+ this_END_BLOCK_83= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_78=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_78, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_14_2_0_0());
            	            						
            	            // InternalDcDsl.g:1785:7: (otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )? )+
            	            int cnt29=0;
            	            loop29:
            	            do {
            	                int alt29=2;
            	                int LA29_0 = input.LA(1);

            	                if ( (LA29_0==31) ) {
            	                    alt29=1;
            	                }


            	                switch (alt29) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1786:8: otherlv_79= '-' (this_BEG_BLOCK_80= RULE_BEG_BLOCK )? ( (lv_secrets_81_0= ruleEString ) ) (this_END_BLOCK_82= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_79=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_79, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_14_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1790:8: (this_BEG_BLOCK_80= RULE_BEG_BLOCK )?
            	            	    int alt27=2;
            	            	    int LA27_0 = input.LA(1);

            	            	    if ( (LA27_0==RULE_BEG_BLOCK) ) {
            	            	        alt27=1;
            	            	    }
            	            	    switch (alt27) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1791:9: this_BEG_BLOCK_80= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_80=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_80, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_14_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:1796:8: ( (lv_secrets_81_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1797:9: (lv_secrets_81_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1797:9: (lv_secrets_81_0= ruleEString )
            	            	    // InternalDcDsl.g:1798:10: lv_secrets_81_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSecretsEStringParserRuleCall_3_14_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_secrets_81_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"secrets",
            	            	    											lv_secrets_81_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:1815:8: (this_END_BLOCK_82= RULE_END_BLOCK )?
            	            	    int alt28=2;
            	            	    int LA28_0 = input.LA(1);

            	            	    if ( (LA28_0==RULE_END_BLOCK) ) {
            	            	        int LA28_1 = input.LA(2);

            	            	        if ( (LA28_1==RULE_END_BLOCK) ) {
            	            	            int LA28_3 = input.LA(3);

            	            	            if ( (LA28_3==RULE_END_BLOCK) ) {
            	            	                int LA28_5 = input.LA(4);

            	            	                if ( (LA28_5==EOF) ) {
            	            	                    int LA28_6 = input.LA(5);

            	            	                    if ( (LA28_6==EOF) ) {
            	            	                        alt28=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA28_5>=RULE_END_BLOCK && LA28_5<=RULE_INT)||(LA28_5>=23 && LA28_5<=30)) ) {
            	            	                    alt28=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA28_3>=20 && LA28_3<=22)||(LA28_3>=38 && LA28_3<=58)) ) {
            	            	                alt28=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA28_1==31) ) {
            	            	            alt28=1;
            	            	        }
            	            	    }
            	            	    switch (alt28) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1816:9: this_END_BLOCK_82= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_82=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_82, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_14_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt29 >= 1 ) break loop29;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(29, input);
            	                        throw eee;
            	                }
            	                cnt29++;
            	            } while (true);

            	            this_END_BLOCK_83=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_83, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_14_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1828:6: (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' )
            	            {
            	            // InternalDcDsl.g:1828:6: (otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']' )
            	            // InternalDcDsl.g:1829:7: otherlv_84= '[' ( (lv_secrets_85_0= ruleEString ) ) (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )* otherlv_88= ']'
            	            {
            	            otherlv_84=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_84, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_14_2_1_0());
            	            						
            	            // InternalDcDsl.g:1833:7: ( (lv_secrets_85_0= ruleEString ) )
            	            // InternalDcDsl.g:1834:8: (lv_secrets_85_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1834:8: (lv_secrets_85_0= ruleEString )
            	            // InternalDcDsl.g:1835:9: lv_secrets_85_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getSecretsEStringParserRuleCall_3_14_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_secrets_85_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"secrets",
            	            										lv_secrets_85_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1852:7: (otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) ) )*
            	            loop30:
            	            do {
            	                int alt30=2;
            	                int LA30_0 = input.LA(1);

            	                if ( (LA30_0==35) ) {
            	                    alt30=1;
            	                }


            	                switch (alt30) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1853:8: otherlv_86= ',' ( (lv_secrets_87_0= ruleEString ) )
            	            	    {
            	            	    otherlv_86=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_86, grammarAccess.getServiceAccess().getCommaKeyword_3_14_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1857:8: ( (lv_secrets_87_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1858:9: (lv_secrets_87_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1858:9: (lv_secrets_87_0= ruleEString )
            	            	    // InternalDcDsl.g:1859:10: lv_secrets_87_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSecretsEStringParserRuleCall_3_14_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_secrets_87_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"secrets",
            	            	    											lv_secrets_87_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop30;
            	                }
            	            } while (true);

            	            otherlv_88=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_88, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_14_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // InternalDcDsl.g:1885:4: (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:1885:4: (otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) ) )
            	    // InternalDcDsl.g:1886:5: otherlv_89= 'cap_add' otherlv_90= ':' ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) )
            	    {
            	    otherlv_89=(Token)match(input,52,FOLLOW_3); 

            	    					newLeafNode(otherlv_89, grammarAccess.getServiceAccess().getCap_addKeyword_3_15_0());
            	    				
            	    otherlv_90=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_90, grammarAccess.getServiceAccess().getColonKeyword_3_15_1());
            	    				
            	    // InternalDcDsl.g:1894:5: ( (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK ) | (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' ) )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==RULE_BEG_BLOCK) ) {
            	        alt36=1;
            	    }
            	    else if ( (LA36_0==32) ) {
            	        alt36=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt36) {
            	        case 1 :
            	            // InternalDcDsl.g:1895:6: (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:1895:6: (this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK )
            	            // InternalDcDsl.g:1896:7: this_BEG_BLOCK_91= RULE_BEG_BLOCK (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+ this_END_BLOCK_96= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_91=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_91, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_15_2_0_0());
            	            						
            	            // InternalDcDsl.g:1900:7: (otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )? )+
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
            	            	    // InternalDcDsl.g:1901:8: otherlv_92= '-' (this_BEG_BLOCK_93= RULE_BEG_BLOCK )? ( (lv_capAdd_94_0= ruleEString ) ) (this_END_BLOCK_95= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_92=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_92, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_15_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:1905:8: (this_BEG_BLOCK_93= RULE_BEG_BLOCK )?
            	            	    int alt32=2;
            	            	    int LA32_0 = input.LA(1);

            	            	    if ( (LA32_0==RULE_BEG_BLOCK) ) {
            	            	        alt32=1;
            	            	    }
            	            	    switch (alt32) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1906:9: this_BEG_BLOCK_93= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_93=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_93, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_15_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:1911:8: ( (lv_capAdd_94_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1912:9: (lv_capAdd_94_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1912:9: (lv_capAdd_94_0= ruleEString )
            	            	    // InternalDcDsl.g:1913:10: lv_capAdd_94_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCapAddEStringParserRuleCall_3_15_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_capAdd_94_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"capAdd",
            	            	    											lv_capAdd_94_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:1930:8: (this_END_BLOCK_95= RULE_END_BLOCK )?
            	            	    int alt33=2;
            	            	    int LA33_0 = input.LA(1);

            	            	    if ( (LA33_0==RULE_END_BLOCK) ) {
            	            	        int LA33_1 = input.LA(2);

            	            	        if ( (LA33_1==RULE_END_BLOCK) ) {
            	            	            int LA33_3 = input.LA(3);

            	            	            if ( (LA33_3==RULE_END_BLOCK) ) {
            	            	                int LA33_5 = input.LA(4);

            	            	                if ( (LA33_5==EOF) ) {
            	            	                    int LA33_6 = input.LA(5);

            	            	                    if ( (LA33_6==EOF) ) {
            	            	                        alt33=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA33_5>=RULE_END_BLOCK && LA33_5<=RULE_INT)||(LA33_5>=23 && LA33_5<=30)) ) {
            	            	                    alt33=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA33_3>=20 && LA33_3<=22)||(LA33_3>=38 && LA33_3<=58)) ) {
            	            	                alt33=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA33_1==31) ) {
            	            	            alt33=1;
            	            	        }
            	            	    }
            	            	    switch (alt33) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:1931:9: this_END_BLOCK_95= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_95=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_95, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_15_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

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

            	            this_END_BLOCK_96=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_96, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_15_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:1943:6: (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' )
            	            {
            	            // InternalDcDsl.g:1943:6: (otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']' )
            	            // InternalDcDsl.g:1944:7: otherlv_97= '[' ( (lv_capAdd_98_0= ruleEString ) ) (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )* otherlv_101= ']'
            	            {
            	            otherlv_97=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_97, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_15_2_1_0());
            	            						
            	            // InternalDcDsl.g:1948:7: ( (lv_capAdd_98_0= ruleEString ) )
            	            // InternalDcDsl.g:1949:8: (lv_capAdd_98_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:1949:8: (lv_capAdd_98_0= ruleEString )
            	            // InternalDcDsl.g:1950:9: lv_capAdd_98_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getCapAddEStringParserRuleCall_3_15_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_capAdd_98_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"capAdd",
            	            										lv_capAdd_98_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:1967:7: (otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) ) )*
            	            loop35:
            	            do {
            	                int alt35=2;
            	                int LA35_0 = input.LA(1);

            	                if ( (LA35_0==35) ) {
            	                    alt35=1;
            	                }


            	                switch (alt35) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:1968:8: otherlv_99= ',' ( (lv_capAdd_100_0= ruleEString ) )
            	            	    {
            	            	    otherlv_99=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_99, grammarAccess.getServiceAccess().getCommaKeyword_3_15_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:1972:8: ( (lv_capAdd_100_0= ruleEString ) )
            	            	    // InternalDcDsl.g:1973:9: (lv_capAdd_100_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:1973:9: (lv_capAdd_100_0= ruleEString )
            	            	    // InternalDcDsl.g:1974:10: lv_capAdd_100_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getCapAddEStringParserRuleCall_3_15_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_capAdd_100_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"capAdd",
            	            	    											lv_capAdd_100_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop35;
            	                }
            	            } while (true);

            	            otherlv_101=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_101, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_15_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // InternalDcDsl.g:2000:4: (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:2000:4: (otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) ) )
            	    // InternalDcDsl.g:2001:5: otherlv_102= 'labels' otherlv_103= ':' ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) )
            	    {
            	    otherlv_102=(Token)match(input,53,FOLLOW_3); 

            	    					newLeafNode(otherlv_102, grammarAccess.getServiceAccess().getLabelsKeyword_3_16_0());
            	    				
            	    otherlv_103=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_103, grammarAccess.getServiceAccess().getColonKeyword_3_16_1());
            	    				
            	    // InternalDcDsl.g:2009:5: ( (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK ) | (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' ) )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==RULE_BEG_BLOCK) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==32) ) {
            	        alt41=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // InternalDcDsl.g:2010:6: (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:2010:6: (this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK )
            	            // InternalDcDsl.g:2011:7: this_BEG_BLOCK_104= RULE_BEG_BLOCK (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+ this_END_BLOCK_109= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_104=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_104, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_16_2_0_0());
            	            						
            	            // InternalDcDsl.g:2015:7: (otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )? )+
            	            int cnt39=0;
            	            loop39:
            	            do {
            	                int alt39=2;
            	                int LA39_0 = input.LA(1);

            	                if ( (LA39_0==31) ) {
            	                    alt39=1;
            	                }


            	                switch (alt39) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2016:8: otherlv_105= '-' (this_BEG_BLOCK_106= RULE_BEG_BLOCK )? ( (lv_labels_107_0= ruleEString ) ) (this_END_BLOCK_108= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_105=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_105, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_16_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:2020:8: (this_BEG_BLOCK_106= RULE_BEG_BLOCK )?
            	            	    int alt37=2;
            	            	    int LA37_0 = input.LA(1);

            	            	    if ( (LA37_0==RULE_BEG_BLOCK) ) {
            	            	        alt37=1;
            	            	    }
            	            	    switch (alt37) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2021:9: this_BEG_BLOCK_106= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_106=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_106, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_16_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:2026:8: ( (lv_labels_107_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2027:9: (lv_labels_107_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2027:9: (lv_labels_107_0= ruleEString )
            	            	    // InternalDcDsl.g:2028:10: lv_labels_107_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getLabelsEStringParserRuleCall_3_16_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_labels_107_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"labels",
            	            	    											lv_labels_107_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:2045:8: (this_END_BLOCK_108= RULE_END_BLOCK )?
            	            	    int alt38=2;
            	            	    int LA38_0 = input.LA(1);

            	            	    if ( (LA38_0==RULE_END_BLOCK) ) {
            	            	        int LA38_1 = input.LA(2);

            	            	        if ( (LA38_1==RULE_END_BLOCK) ) {
            	            	            int LA38_3 = input.LA(3);

            	            	            if ( (LA38_3==RULE_END_BLOCK) ) {
            	            	                int LA38_5 = input.LA(4);

            	            	                if ( (LA38_5==EOF) ) {
            	            	                    int LA38_6 = input.LA(5);

            	            	                    if ( (LA38_6==EOF) ) {
            	            	                        alt38=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA38_5>=RULE_END_BLOCK && LA38_5<=RULE_INT)||(LA38_5>=23 && LA38_5<=30)) ) {
            	            	                    alt38=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA38_3>=20 && LA38_3<=22)||(LA38_3>=38 && LA38_3<=58)) ) {
            	            	                alt38=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA38_1==31) ) {
            	            	            alt38=1;
            	            	        }
            	            	    }
            	            	    switch (alt38) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2046:9: this_END_BLOCK_108= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_108=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_108, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_16_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt39 >= 1 ) break loop39;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(39, input);
            	                        throw eee;
            	                }
            	                cnt39++;
            	            } while (true);

            	            this_END_BLOCK_109=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_109, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_16_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:2058:6: (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' )
            	            {
            	            // InternalDcDsl.g:2058:6: (otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']' )
            	            // InternalDcDsl.g:2059:7: otherlv_110= '[' ( (lv_labels_111_0= ruleEString ) ) (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )* otherlv_114= ']'
            	            {
            	            otherlv_110=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_110, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_16_2_1_0());
            	            						
            	            // InternalDcDsl.g:2063:7: ( (lv_labels_111_0= ruleEString ) )
            	            // InternalDcDsl.g:2064:8: (lv_labels_111_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:2064:8: (lv_labels_111_0= ruleEString )
            	            // InternalDcDsl.g:2065:9: lv_labels_111_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getLabelsEStringParserRuleCall_3_16_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_labels_111_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"labels",
            	            										lv_labels_111_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:2082:7: (otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) ) )*
            	            loop40:
            	            do {
            	                int alt40=2;
            	                int LA40_0 = input.LA(1);

            	                if ( (LA40_0==35) ) {
            	                    alt40=1;
            	                }


            	                switch (alt40) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2083:8: otherlv_112= ',' ( (lv_labels_113_0= ruleEString ) )
            	            	    {
            	            	    otherlv_112=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_112, grammarAccess.getServiceAccess().getCommaKeyword_3_16_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:2087:8: ( (lv_labels_113_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2088:9: (lv_labels_113_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2088:9: (lv_labels_113_0= ruleEString )
            	            	    // InternalDcDsl.g:2089:10: lv_labels_113_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getLabelsEStringParserRuleCall_3_16_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_labels_113_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"labels",
            	            	    											lv_labels_113_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop40;
            	                }
            	            } while (true);

            	            otherlv_114=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_114, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_16_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 18 :
            	    // InternalDcDsl.g:2115:4: (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:2115:4: (otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) ) )
            	    // InternalDcDsl.g:2116:5: otherlv_115= 'sysctls' otherlv_116= ':' ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) )
            	    {
            	    otherlv_115=(Token)match(input,54,FOLLOW_3); 

            	    					newLeafNode(otherlv_115, grammarAccess.getServiceAccess().getSysctlsKeyword_3_17_0());
            	    				
            	    otherlv_116=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_116, grammarAccess.getServiceAccess().getColonKeyword_3_17_1());
            	    				
            	    // InternalDcDsl.g:2124:5: ( (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK ) | (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' ) )
            	    int alt46=2;
            	    int LA46_0 = input.LA(1);

            	    if ( (LA46_0==RULE_BEG_BLOCK) ) {
            	        alt46=1;
            	    }
            	    else if ( (LA46_0==32) ) {
            	        alt46=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 46, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt46) {
            	        case 1 :
            	            // InternalDcDsl.g:2125:6: (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:2125:6: (this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK )
            	            // InternalDcDsl.g:2126:7: this_BEG_BLOCK_117= RULE_BEG_BLOCK (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+ this_END_BLOCK_122= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_117=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_117, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_17_2_0_0());
            	            						
            	            // InternalDcDsl.g:2130:7: (otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )? )+
            	            int cnt44=0;
            	            loop44:
            	            do {
            	                int alt44=2;
            	                int LA44_0 = input.LA(1);

            	                if ( (LA44_0==31) ) {
            	                    alt44=1;
            	                }


            	                switch (alt44) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2131:8: otherlv_118= '-' (this_BEG_BLOCK_119= RULE_BEG_BLOCK )? ( (lv_sysctls_120_0= ruleEString ) ) (this_END_BLOCK_121= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_118=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_118, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_17_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:2135:8: (this_BEG_BLOCK_119= RULE_BEG_BLOCK )?
            	            	    int alt42=2;
            	            	    int LA42_0 = input.LA(1);

            	            	    if ( (LA42_0==RULE_BEG_BLOCK) ) {
            	            	        alt42=1;
            	            	    }
            	            	    switch (alt42) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2136:9: this_BEG_BLOCK_119= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_119=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_119, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_17_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:2141:8: ( (lv_sysctls_120_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2142:9: (lv_sysctls_120_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2142:9: (lv_sysctls_120_0= ruleEString )
            	            	    // InternalDcDsl.g:2143:10: lv_sysctls_120_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSysctlsEStringParserRuleCall_3_17_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_sysctls_120_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"sysctls",
            	            	    											lv_sysctls_120_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:2160:8: (this_END_BLOCK_121= RULE_END_BLOCK )?
            	            	    int alt43=2;
            	            	    int LA43_0 = input.LA(1);

            	            	    if ( (LA43_0==RULE_END_BLOCK) ) {
            	            	        int LA43_1 = input.LA(2);

            	            	        if ( (LA43_1==RULE_END_BLOCK) ) {
            	            	            int LA43_3 = input.LA(3);

            	            	            if ( (LA43_3==RULE_END_BLOCK) ) {
            	            	                int LA43_5 = input.LA(4);

            	            	                if ( (LA43_5==EOF) ) {
            	            	                    int LA43_6 = input.LA(5);

            	            	                    if ( (LA43_6==EOF) ) {
            	            	                        alt43=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA43_5>=RULE_END_BLOCK && LA43_5<=RULE_INT)||(LA43_5>=23 && LA43_5<=30)) ) {
            	            	                    alt43=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA43_3>=20 && LA43_3<=22)||(LA43_3>=38 && LA43_3<=58)) ) {
            	            	                alt43=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA43_1==31) ) {
            	            	            alt43=1;
            	            	        }
            	            	    }
            	            	    switch (alt43) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2161:9: this_END_BLOCK_121= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_121=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_121, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_17_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt44 >= 1 ) break loop44;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(44, input);
            	                        throw eee;
            	                }
            	                cnt44++;
            	            } while (true);

            	            this_END_BLOCK_122=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	            							newLeafNode(this_END_BLOCK_122, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_17_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:2173:6: (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' )
            	            {
            	            // InternalDcDsl.g:2173:6: (otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']' )
            	            // InternalDcDsl.g:2174:7: otherlv_123= '[' ( (lv_sysctls_124_0= ruleEString ) ) (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )* otherlv_127= ']'
            	            {
            	            otherlv_123=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_123, grammarAccess.getServiceAccess().getLeftSquareBracketKeyword_3_17_2_1_0());
            	            						
            	            // InternalDcDsl.g:2178:7: ( (lv_sysctls_124_0= ruleEString ) )
            	            // InternalDcDsl.g:2179:8: (lv_sysctls_124_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:2179:8: (lv_sysctls_124_0= ruleEString )
            	            // InternalDcDsl.g:2180:9: lv_sysctls_124_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getServiceAccess().getSysctlsEStringParserRuleCall_3_17_2_1_1_0());
            	            								
            	            pushFollow(FOLLOW_17);
            	            lv_sysctls_124_0=ruleEString();

            	            state._fsp--;


            	            									if (current==null) {
            	            										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            									}
            	            									add(
            	            										current,
            	            										"sysctls",
            	            										lv_sysctls_124_0,
            	            										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            									afterParserOrEnumRuleCall();
            	            								

            	            }


            	            }

            	            // InternalDcDsl.g:2197:7: (otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) ) )*
            	            loop45:
            	            do {
            	                int alt45=2;
            	                int LA45_0 = input.LA(1);

            	                if ( (LA45_0==35) ) {
            	                    alt45=1;
            	                }


            	                switch (alt45) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2198:8: otherlv_125= ',' ( (lv_sysctls_126_0= ruleEString ) )
            	            	    {
            	            	    otherlv_125=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_125, grammarAccess.getServiceAccess().getCommaKeyword_3_17_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:2202:8: ( (lv_sysctls_126_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2203:9: (lv_sysctls_126_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2203:9: (lv_sysctls_126_0= ruleEString )
            	            	    // InternalDcDsl.g:2204:10: lv_sysctls_126_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getServiceAccess().getSysctlsEStringParserRuleCall_3_17_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_sysctls_126_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"sysctls",
            	            	    											lv_sysctls_126_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop45;
            	                }
            	            } while (true);

            	            otherlv_127=(Token)match(input,33,FOLLOW_11); 

            	            							newLeafNode(otherlv_127, grammarAccess.getServiceAccess().getRightSquareBracketKeyword_3_17_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 19 :
            	    // InternalDcDsl.g:2230:4: (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:2230:4: (otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK )
            	    // InternalDcDsl.g:2231:5: otherlv_128= 'environment' otherlv_129= ':' this_BEG_BLOCK_130= RULE_BEG_BLOCK ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ ) this_END_BLOCK_136= RULE_END_BLOCK
            	    {
            	    otherlv_128=(Token)match(input,55,FOLLOW_3); 

            	    					newLeafNode(otherlv_128, grammarAccess.getServiceAccess().getEnvironmentKeyword_3_18_0());
            	    				
            	    otherlv_129=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_129, grammarAccess.getServiceAccess().getColonKeyword_3_18_1());
            	    				
            	    this_BEG_BLOCK_130=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_20); 

            	    					newLeafNode(this_BEG_BLOCK_130, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_18_2());
            	    				
            	    // InternalDcDsl.g:2243:5: ( ( (lv_environment_131_0= ruleKeyValuePair ) )+ | (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+ )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_YAML_SCALAR||(LA51_0>=RULE_ID && LA51_0<=RULE_INT)||LA51_0==16||(LA51_0>=18 && LA51_0<=22)||(LA51_0>=38 && LA51_0<=77)) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==31) ) {
            	        alt51=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // InternalDcDsl.g:2244:6: ( (lv_environment_131_0= ruleKeyValuePair ) )+
            	            {
            	            // InternalDcDsl.g:2244:6: ( (lv_environment_131_0= ruleKeyValuePair ) )+
            	            int cnt47=0;
            	            loop47:
            	            do {
            	                int alt47=2;
            	                int LA47_0 = input.LA(1);

            	                if ( (LA47_0==RULE_YAML_SCALAR||(LA47_0>=RULE_ID && LA47_0<=RULE_INT)||LA47_0==16||(LA47_0>=18 && LA47_0<=22)||(LA47_0>=38 && LA47_0<=77)) ) {
            	                    alt47=1;
            	                }


            	                switch (alt47) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2245:7: (lv_environment_131_0= ruleKeyValuePair )
            	            	    {
            	            	    // InternalDcDsl.g:2245:7: (lv_environment_131_0= ruleKeyValuePair )
            	            	    // InternalDcDsl.g:2246:8: lv_environment_131_0= ruleKeyValuePair
            	            	    {

            	            	    								newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentKeyValuePairParserRuleCall_3_18_3_0_0());
            	            	    							
            	            	    pushFollow(FOLLOW_21);
            	            	    lv_environment_131_0=ruleKeyValuePair();

            	            	    state._fsp--;


            	            	    								if (current==null) {
            	            	    									current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    								}
            	            	    								add(
            	            	    									current,
            	            	    									"environment",
            	            	    									lv_environment_131_0,
            	            	    									"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.KeyValuePair");
            	            	    								afterParserOrEnumRuleCall();
            	            	    							

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt47 >= 1 ) break loop47;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(47, input);
            	                        throw eee;
            	                }
            	                cnt47++;
            	            } while (true);


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:2264:6: (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+
            	            {
            	            // InternalDcDsl.g:2264:6: (otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )? )+
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
            	            	    // InternalDcDsl.g:2265:7: otherlv_132= '-' (this_BEG_BLOCK_133= RULE_BEG_BLOCK )? ( (lv_environment_134_0= ruleEnvEntry ) ) (this_END_BLOCK_135= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_132=(Token)match(input,31,FOLLOW_12); 

            	            	    							newLeafNode(otherlv_132, grammarAccess.getServiceAccess().getHyphenMinusKeyword_3_18_3_1_0());
            	            	    						
            	            	    // InternalDcDsl.g:2269:7: (this_BEG_BLOCK_133= RULE_BEG_BLOCK )?
            	            	    int alt48=2;
            	            	    int LA48_0 = input.LA(1);

            	            	    if ( (LA48_0==RULE_BEG_BLOCK) ) {
            	            	        alt48=1;
            	            	    }
            	            	    switch (alt48) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2270:8: this_BEG_BLOCK_133= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_133=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_12); 

            	            	            								newLeafNode(this_BEG_BLOCK_133, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_18_3_1_1());
            	            	            							

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:2275:7: ( (lv_environment_134_0= ruleEnvEntry ) )
            	            	    // InternalDcDsl.g:2276:8: (lv_environment_134_0= ruleEnvEntry )
            	            	    {
            	            	    // InternalDcDsl.g:2276:8: (lv_environment_134_0= ruleEnvEntry )
            	            	    // InternalDcDsl.g:2277:9: lv_environment_134_0= ruleEnvEntry
            	            	    {

            	            	    									newCompositeNode(grammarAccess.getServiceAccess().getEnvironmentEnvEntryParserRuleCall_3_18_3_1_2_0());
            	            	    								
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_environment_134_0=ruleEnvEntry();

            	            	    state._fsp--;


            	            	    									if (current==null) {
            	            	    										current = createModelElementForParent(grammarAccess.getServiceRule());
            	            	    									}
            	            	    									add(
            	            	    										current,
            	            	    										"environment",
            	            	    										lv_environment_134_0,
            	            	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EnvEntry");
            	            	    									afterParserOrEnumRuleCall();
            	            	    								

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:2294:7: (this_END_BLOCK_135= RULE_END_BLOCK )?
            	            	    int alt49=2;
            	            	    int LA49_0 = input.LA(1);

            	            	    if ( (LA49_0==RULE_END_BLOCK) ) {
            	            	        int LA49_1 = input.LA(2);

            	            	        if ( (LA49_1==RULE_END_BLOCK) ) {
            	            	            int LA49_3 = input.LA(3);

            	            	            if ( (LA49_3==RULE_END_BLOCK) ) {
            	            	                int LA49_5 = input.LA(4);

            	            	                if ( (LA49_5==EOF) ) {
            	            	                    int LA49_6 = input.LA(5);

            	            	                    if ( (LA49_6==EOF) ) {
            	            	                        alt49=1;
            	            	                    }
            	            	                }
            	            	                else if ( ((LA49_5>=RULE_END_BLOCK && LA49_5<=RULE_INT)||(LA49_5>=23 && LA49_5<=30)) ) {
            	            	                    alt49=1;
            	            	                }
            	            	            }
            	            	            else if ( ((LA49_3>=20 && LA49_3<=22)||(LA49_3>=38 && LA49_3<=58)) ) {
            	            	                alt49=1;
            	            	            }
            	            	        }
            	            	        else if ( (LA49_1==31) ) {
            	            	            alt49=1;
            	            	        }
            	            	    }
            	            	    switch (alt49) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2295:8: this_END_BLOCK_135= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_135=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            								newLeafNode(this_END_BLOCK_135, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_18_3_1_3());
            	            	            							

            	            	            }
            	            	            break;

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


            	            }
            	            break;

            	    }

            	    this_END_BLOCK_136=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	    					newLeafNode(this_END_BLOCK_136, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_18_4());
            	    				

            	    }


            	    }
            	    break;
            	case 20 :
            	    // InternalDcDsl.g:2308:4: (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) )
            	    {
            	    // InternalDcDsl.g:2308:4: (otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) ) )
            	    // InternalDcDsl.g:2309:5: otherlv_137= 'depends_on' otherlv_138= ':' ( (lv_dependsOn_139_0= ruleDepends_on ) )
            	    {
            	    otherlv_137=(Token)match(input,56,FOLLOW_3); 

            	    					newLeafNode(otherlv_137, grammarAccess.getServiceAccess().getDepends_onKeyword_3_19_0());
            	    				
            	    otherlv_138=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_138, grammarAccess.getServiceAccess().getColonKeyword_3_19_1());
            	    				
            	    // InternalDcDsl.g:2317:5: ( (lv_dependsOn_139_0= ruleDepends_on ) )
            	    // InternalDcDsl.g:2318:6: (lv_dependsOn_139_0= ruleDepends_on )
            	    {
            	    // InternalDcDsl.g:2318:6: (lv_dependsOn_139_0= ruleDepends_on )
            	    // InternalDcDsl.g:2319:7: lv_dependsOn_139_0= ruleDepends_on
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getDependsOnDepends_onParserRuleCall_3_19_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_dependsOn_139_0=ruleDepends_on();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"dependsOn",
            	    								lv_dependsOn_139_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Depends_on");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 21 :
            	    // InternalDcDsl.g:2338:4: (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) )
            	    {
            	    // InternalDcDsl.g:2338:4: (otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) ) )
            	    // InternalDcDsl.g:2339:5: otherlv_140= 'networks' otherlv_141= ':' ( (lv_networks_142_0= ruleNetworks ) )
            	    {
            	    otherlv_140=(Token)match(input,20,FOLLOW_3); 

            	    					newLeafNode(otherlv_140, grammarAccess.getServiceAccess().getNetworksKeyword_3_20_0());
            	    				
            	    otherlv_141=(Token)match(input,17,FOLLOW_8); 

            	    					newLeafNode(otherlv_141, grammarAccess.getServiceAccess().getColonKeyword_3_20_1());
            	    				
            	    // InternalDcDsl.g:2347:5: ( (lv_networks_142_0= ruleNetworks ) )
            	    // InternalDcDsl.g:2348:6: (lv_networks_142_0= ruleNetworks )
            	    {
            	    // InternalDcDsl.g:2348:6: (lv_networks_142_0= ruleNetworks )
            	    // InternalDcDsl.g:2349:7: lv_networks_142_0= ruleNetworks
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getNetworksNetworksParserRuleCall_3_20_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_networks_142_0=ruleNetworks();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"networks",
            	    								lv_networks_142_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Networks");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 22 :
            	    // InternalDcDsl.g:2368:4: (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:2368:4: (otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK )
            	    // InternalDcDsl.g:2369:5: otherlv_143= 'volumes' otherlv_144= ':' this_BEG_BLOCK_145= RULE_BEG_BLOCK ( (lv_volumes_146_0= ruleServiceVolume ) )+ this_END_BLOCK_147= RULE_END_BLOCK
            	    {
            	    otherlv_143=(Token)match(input,21,FOLLOW_3); 

            	    					newLeafNode(otherlv_143, grammarAccess.getServiceAccess().getVolumesKeyword_3_21_0());
            	    				
            	    otherlv_144=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_144, grammarAccess.getServiceAccess().getColonKeyword_3_21_1());
            	    				
            	    this_BEG_BLOCK_145=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	    					newLeafNode(this_BEG_BLOCK_145, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_21_2());
            	    				
            	    // InternalDcDsl.g:2381:5: ( (lv_volumes_146_0= ruleServiceVolume ) )+
            	    int cnt52=0;
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==31) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:2382:6: (lv_volumes_146_0= ruleServiceVolume )
            	    	    {
            	    	    // InternalDcDsl.g:2382:6: (lv_volumes_146_0= ruleServiceVolume )
            	    	    // InternalDcDsl.g:2383:7: lv_volumes_146_0= ruleServiceVolume
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getServiceAccess().getVolumesServiceVolumeParserRuleCall_3_21_3_0());
            	    	    						
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_volumes_146_0=ruleServiceVolume();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"volumes",
            	    	    								lv_volumes_146_0,
            	    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.ServiceVolume");
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

            	    this_END_BLOCK_147=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	    					newLeafNode(this_END_BLOCK_147, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_21_4());
            	    				

            	    }


            	    }
            	    break;
            	case 23 :
            	    // InternalDcDsl.g:2406:4: (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) )
            	    {
            	    // InternalDcDsl.g:2406:4: (otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) ) )
            	    // InternalDcDsl.g:2407:5: otherlv_148= 'healthcheck' otherlv_149= ':' ( (lv_healthcheck_150_0= ruleHealthcheck ) )
            	    {
            	    otherlv_148=(Token)match(input,57,FOLLOW_3); 

            	    					newLeafNode(otherlv_148, grammarAccess.getServiceAccess().getHealthcheckKeyword_3_22_0());
            	    				
            	    otherlv_149=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_149, grammarAccess.getServiceAccess().getColonKeyword_3_22_1());
            	    				
            	    // InternalDcDsl.g:2415:5: ( (lv_healthcheck_150_0= ruleHealthcheck ) )
            	    // InternalDcDsl.g:2416:6: (lv_healthcheck_150_0= ruleHealthcheck )
            	    {
            	    // InternalDcDsl.g:2416:6: (lv_healthcheck_150_0= ruleHealthcheck )
            	    // InternalDcDsl.g:2417:7: lv_healthcheck_150_0= ruleHealthcheck
            	    {

            	    							newCompositeNode(grammarAccess.getServiceAccess().getHealthcheckHealthcheckParserRuleCall_3_22_2_0());
            	    						
            	    pushFollow(FOLLOW_11);
            	    lv_healthcheck_150_0=ruleHealthcheck();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    							}
            	    							set(
            	    								current,
            	    								"healthcheck",
            	    								lv_healthcheck_150_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Healthcheck");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 24 :
            	    // InternalDcDsl.g:2436:4: (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK )
            	    {
            	    // InternalDcDsl.g:2436:4: (otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK )
            	    // InternalDcDsl.g:2437:5: otherlv_151= 'deploy' otherlv_152= ':' this_BEG_BLOCK_153= RULE_BEG_BLOCK ruleKeyName otherlv_155= ':' this_BEG_BLOCK_156= RULE_BEG_BLOCK ( (lv_deploy_157_0= ruleResource ) )+ this_END_BLOCK_158= RULE_END_BLOCK this_END_BLOCK_159= RULE_END_BLOCK
            	    {
            	    otherlv_151=(Token)match(input,58,FOLLOW_3); 

            	    					newLeafNode(otherlv_151, grammarAccess.getServiceAccess().getDeployKeyword_3_23_0());
            	    				
            	    otherlv_152=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_152, grammarAccess.getServiceAccess().getColonKeyword_3_23_1());
            	    				
            	    this_BEG_BLOCK_153=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_22); 

            	    					newLeafNode(this_BEG_BLOCK_153, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_23_2());
            	    				

            	    					newCompositeNode(grammarAccess.getServiceAccess().getKeyNameParserRuleCall_3_23_3());
            	    				
            	    pushFollow(FOLLOW_3);
            	    ruleKeyName();

            	    state._fsp--;


            	    					afterParserOrEnumRuleCall();
            	    				
            	    otherlv_155=(Token)match(input,17,FOLLOW_6); 

            	    					newLeafNode(otherlv_155, grammarAccess.getServiceAccess().getColonKeyword_3_23_4());
            	    				
            	    this_BEG_BLOCK_156=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	    					newLeafNode(this_BEG_BLOCK_156, grammarAccess.getServiceAccess().getBEG_BLOCKTerminalRuleCall_3_23_5());
            	    				
            	    // InternalDcDsl.g:2464:5: ( (lv_deploy_157_0= ruleResource ) )+
            	    int cnt53=0;
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_INT)||(LA53_0>=23 && LA53_0<=30)) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalDcDsl.g:2465:6: (lv_deploy_157_0= ruleResource )
            	    	    {
            	    	    // InternalDcDsl.g:2465:6: (lv_deploy_157_0= ruleResource )
            	    	    // InternalDcDsl.g:2466:7: lv_deploy_157_0= ruleResource
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getServiceAccess().getDeployResourceParserRuleCall_3_23_6_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_deploy_157_0=ruleResource();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getServiceRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"deploy",
            	    	    								lv_deploy_157_0,
            	    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Resource");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt53 >= 1 ) break loop53;
            	                EarlyExitException eee =
            	                    new EarlyExitException(53, input);
            	                throw eee;
            	        }
            	        cnt53++;
            	    } while (true);

            	    this_END_BLOCK_158=(Token)match(input,RULE_END_BLOCK,FOLLOW_23); 

            	    					newLeafNode(this_END_BLOCK_158, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_23_7());
            	    				
            	    this_END_BLOCK_159=(Token)match(input,RULE_END_BLOCK,FOLLOW_11); 

            	    					newLeafNode(this_END_BLOCK_159, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_3_23_8());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            this_END_BLOCK_160=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_160, grammarAccess.getServiceAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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
    // InternalDcDsl.g:2501:1: entryRuleServiceVolume returns [EObject current=null] : iv_ruleServiceVolume= ruleServiceVolume EOF ;
    public final EObject entryRuleServiceVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceVolume = null;


        try {
            // InternalDcDsl.g:2501:54: (iv_ruleServiceVolume= ruleServiceVolume EOF )
            // InternalDcDsl.g:2502:2: iv_ruleServiceVolume= ruleServiceVolume EOF
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
    // InternalDcDsl.g:2508:1: ruleServiceVolume returns [EObject current=null] : (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) ;
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
            // InternalDcDsl.g:2514:2: ( (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? ) )
            // InternalDcDsl.g:2515:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            {
            // InternalDcDsl.g:2515:2: (otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )
            // InternalDcDsl.g:2516:3: otherlv_0= '-' (this_BEG_BLOCK_1= RULE_BEG_BLOCK )? ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceVolumeAccess().getHyphenMinusKeyword_0());
            		
            // InternalDcDsl.g:2520:3: (this_BEG_BLOCK_1= RULE_BEG_BLOCK )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_BEG_BLOCK) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDcDsl.g:2521:4: this_BEG_BLOCK_1= RULE_BEG_BLOCK
                    {
                    this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_25); 

                    				newLeafNode(this_BEG_BLOCK_1, grammarAccess.getServiceVolumeAccess().getBEG_BLOCKTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            // InternalDcDsl.g:2526:3: ( ( () ( (lv_value_3_0= ruleEString ) ) ) | ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_INT)||(LA57_0>=23 && LA57_0<=30)) ) {
                alt57=1;
            }
            else if ( (LA57_0==EOF||LA57_0==RULE_END_BLOCK||LA57_0==31||LA57_0==61||(LA57_0>=68 && LA57_0<=70)) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalDcDsl.g:2527:4: ( () ( (lv_value_3_0= ruleEString ) ) )
                    {
                    // InternalDcDsl.g:2527:4: ( () ( (lv_value_3_0= ruleEString ) ) )
                    // InternalDcDsl.g:2528:5: () ( (lv_value_3_0= ruleEString ) )
                    {
                    // InternalDcDsl.g:2528:5: ()
                    // InternalDcDsl.g:2529:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getServiceVolumeAccess().getVolumeValueAction_2_0_0(),
                    							current);
                    					

                    }

                    // InternalDcDsl.g:2535:5: ( (lv_value_3_0= ruleEString ) )
                    // InternalDcDsl.g:2536:6: (lv_value_3_0= ruleEString )
                    {
                    // InternalDcDsl.g:2536:6: (lv_value_3_0= ruleEString )
                    // InternalDcDsl.g:2537:7: lv_value_3_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getServiceVolumeAccess().getValueEStringParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_26);
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
                    // InternalDcDsl.g:2556:4: ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* )
                    {
                    // InternalDcDsl.g:2556:4: ( () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )* )
                    // InternalDcDsl.g:2557:5: () ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )*
                    {
                    // InternalDcDsl.g:2557:5: ()
                    // InternalDcDsl.g:2558:6: 
                    {

                    						current = forceCreateModelElement(
                    							grammarAccess.getServiceVolumeAccess().getVolumeObjectAction_2_1_0(),
                    							current);
                    					

                    }

                    // InternalDcDsl.g:2564:5: ( (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) ) | (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) ) | (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) ) | (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) ) )*
                    loop56:
                    do {
                        int alt56=5;
                        switch ( input.LA(1) ) {
                        case 68:
                            {
                            alt56=1;
                            }
                            break;
                        case 69:
                            {
                            alt56=2;
                            }
                            break;
                        case 61:
                            {
                            alt56=3;
                            }
                            break;
                        case 70:
                            {
                            alt56=4;
                            }
                            break;

                        }

                        switch (alt56) {
                    	case 1 :
                    	    // InternalDcDsl.g:2565:6: (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:2565:6: (otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:2566:7: otherlv_5= 'type' otherlv_6= ':' ( (lv_type_7_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,68,FOLLOW_3); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getServiceVolumeAccess().getTypeKeyword_2_1_1_0_0());
                    	    						
                    	    otherlv_6=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_0_1());
                    	    						
                    	    // InternalDcDsl.g:2574:7: ( (lv_type_7_0= ruleEString ) )
                    	    // InternalDcDsl.g:2575:8: (lv_type_7_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:2575:8: (lv_type_7_0= ruleEString )
                    	    // InternalDcDsl.g:2576:9: lv_type_7_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getTypeEStringParserRuleCall_2_1_1_0_2_0());
                    	    								
                    	    pushFollow(FOLLOW_27);
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
                    	    // InternalDcDsl.g:2595:6: (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:2595:6: (otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:2596:7: otherlv_8= 'source' otherlv_9= ':' ( (lv_source_10_0= ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,69,FOLLOW_3); 

                    	    							newLeafNode(otherlv_8, grammarAccess.getServiceVolumeAccess().getSourceKeyword_2_1_1_1_0());
                    	    						
                    	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_1_1());
                    	    						
                    	    // InternalDcDsl.g:2604:7: ( (lv_source_10_0= ruleEString ) )
                    	    // InternalDcDsl.g:2605:8: (lv_source_10_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:2605:8: (lv_source_10_0= ruleEString )
                    	    // InternalDcDsl.g:2606:9: lv_source_10_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getSourceEStringParserRuleCall_2_1_1_1_2_0());
                    	    								
                    	    pushFollow(FOLLOW_27);
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
                    	    // InternalDcDsl.g:2625:6: (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:2625:6: (otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:2626:7: otherlv_11= 'target' otherlv_12= ':' ( (lv_target_13_0= ruleEString ) )
                    	    {
                    	    otherlv_11=(Token)match(input,61,FOLLOW_3); 

                    	    							newLeafNode(otherlv_11, grammarAccess.getServiceVolumeAccess().getTargetKeyword_2_1_1_2_0());
                    	    						
                    	    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_12, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_2_1());
                    	    						
                    	    // InternalDcDsl.g:2634:7: ( (lv_target_13_0= ruleEString ) )
                    	    // InternalDcDsl.g:2635:8: (lv_target_13_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:2635:8: (lv_target_13_0= ruleEString )
                    	    // InternalDcDsl.g:2636:9: lv_target_13_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getTargetEStringParserRuleCall_2_1_1_2_2_0());
                    	    								
                    	    pushFollow(FOLLOW_27);
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
                    	    // InternalDcDsl.g:2655:6: (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) )
                    	    {
                    	    // InternalDcDsl.g:2655:6: (otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) ) )
                    	    // InternalDcDsl.g:2656:7: otherlv_14= 'read_only' otherlv_15= ':' ( (lv_readOnly_16_0= ruleEBoolean ) )
                    	    {
                    	    otherlv_14=(Token)match(input,70,FOLLOW_3); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getServiceVolumeAccess().getRead_onlyKeyword_2_1_1_3_0());
                    	    						
                    	    otherlv_15=(Token)match(input,17,FOLLOW_13); 

                    	    							newLeafNode(otherlv_15, grammarAccess.getServiceVolumeAccess().getColonKeyword_2_1_1_3_1());
                    	    						
                    	    // InternalDcDsl.g:2664:7: ( (lv_readOnly_16_0= ruleEBoolean ) )
                    	    // InternalDcDsl.g:2665:8: (lv_readOnly_16_0= ruleEBoolean )
                    	    {
                    	    // InternalDcDsl.g:2665:8: (lv_readOnly_16_0= ruleEBoolean )
                    	    // InternalDcDsl.g:2666:9: lv_readOnly_16_0= ruleEBoolean
                    	    {

                    	    									newCompositeNode(grammarAccess.getServiceVolumeAccess().getReadOnlyEBooleanParserRuleCall_2_1_1_3_2_0());
                    	    								
                    	    pushFollow(FOLLOW_27);
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
                    	    break loop56;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalDcDsl.g:2687:3: (this_END_BLOCK_17= RULE_END_BLOCK )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_END_BLOCK) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_END_BLOCK) ) {
                    int LA58_3 = input.LA(3);

                    if ( (LA58_3==RULE_END_BLOCK) ) {
                        int LA58_5 = input.LA(4);

                        if ( (LA58_5==EOF) ) {
                            int LA58_6 = input.LA(5);

                            if ( (LA58_6==EOF) ) {
                                alt58=1;
                            }
                        }
                        else if ( ((LA58_5>=RULE_END_BLOCK && LA58_5<=RULE_INT)||(LA58_5>=23 && LA58_5<=30)) ) {
                            alt58=1;
                        }
                    }
                    else if ( ((LA58_3>=20 && LA58_3<=22)||(LA58_3>=38 && LA58_3<=58)) ) {
                        alt58=1;
                    }
                }
                else if ( (LA58_1==EOF||LA58_1==31) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalDcDsl.g:2688:4: this_END_BLOCK_17= RULE_END_BLOCK
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
    // InternalDcDsl.g:2697:1: entryRuleNamedVolume returns [EObject current=null] : iv_ruleNamedVolume= ruleNamedVolume EOF ;
    public final EObject entryRuleNamedVolume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedVolume = null;


        try {
            // InternalDcDsl.g:2697:52: (iv_ruleNamedVolume= ruleNamedVolume EOF )
            // InternalDcDsl.g:2698:2: iv_ruleNamedVolume= ruleNamedVolume EOF
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
    // InternalDcDsl.g:2704:1: ruleNamedVolume returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( ruleEString )? ) ;
    public final EObject ruleNamedVolume() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2710:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( ruleEString )? ) )
            // InternalDcDsl.g:2711:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( ruleEString )? )
            {
            // InternalDcDsl.g:2711:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( ruleEString )? )
            // InternalDcDsl.g:2712:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( ruleEString )?
            {
            // InternalDcDsl.g:2712:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:2713:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:2713:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:2714:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getNamedVolumeAccess().getColonKeyword_1());
            		
            // InternalDcDsl.g:2735:3: ( ruleEString )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalDcDsl.g:2736:4: ruleEString
                    {

                    				newCompositeNode(grammarAccess.getNamedVolumeAccess().getEStringParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleNamedVolume"


    // $ANTLR start "entryRuleBuild"
    // InternalDcDsl.g:2748:1: entryRuleBuild returns [EObject current=null] : iv_ruleBuild= ruleBuild EOF ;
    public final EObject entryRuleBuild() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuild = null;


        try {
            // InternalDcDsl.g:2748:46: (iv_ruleBuild= ruleBuild EOF )
            // InternalDcDsl.g:2749:2: iv_ruleBuild= ruleBuild EOF
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
    // InternalDcDsl.g:2755:1: ruleBuild returns [EObject current=null] : (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue ) ;
    public final EObject ruleBuild() throws RecognitionException {
        EObject current = null;

        EObject this_BuildObject_0 = null;

        EObject this_BuildValue_1 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2761:2: ( (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue ) )
            // InternalDcDsl.g:2762:2: (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue )
            {
            // InternalDcDsl.g:2762:2: (this_BuildObject_0= ruleBuildObject | this_BuildValue_1= ruleBuildValue )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_BEG_BLOCK) ) {
                alt60=1;
            }
            else if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_INT)||(LA60_0>=23 && LA60_0<=30)) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalDcDsl.g:2763:3: this_BuildObject_0= ruleBuildObject
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
                    // InternalDcDsl.g:2772:3: this_BuildValue_1= ruleBuildValue
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
    // InternalDcDsl.g:2784:1: entryRuleBuildValue returns [EObject current=null] : iv_ruleBuildValue= ruleBuildValue EOF ;
    public final EObject entryRuleBuildValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildValue = null;


        try {
            // InternalDcDsl.g:2784:51: (iv_ruleBuildValue= ruleBuildValue EOF )
            // InternalDcDsl.g:2785:2: iv_ruleBuildValue= ruleBuildValue EOF
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
    // InternalDcDsl.g:2791:1: ruleBuildValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleBuildValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2797:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalDcDsl.g:2798:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalDcDsl.g:2798:2: ( (lv_value_0_0= ruleEString ) )
            // InternalDcDsl.g:2799:3: (lv_value_0_0= ruleEString )
            {
            // InternalDcDsl.g:2799:3: (lv_value_0_0= ruleEString )
            // InternalDcDsl.g:2800:4: lv_value_0_0= ruleEString
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
    // InternalDcDsl.g:2820:1: entryRuleBuildObject returns [EObject current=null] : iv_ruleBuildObject= ruleBuildObject EOF ;
    public final EObject entryRuleBuildObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBuildObject = null;


        try {
            // InternalDcDsl.g:2820:52: (iv_ruleBuildObject= ruleBuildObject EOF )
            // InternalDcDsl.g:2821:2: iv_ruleBuildObject= ruleBuildObject EOF
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
    // InternalDcDsl.g:2827:1: ruleBuildObject returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )* this_END_BLOCK_24= RULE_END_BLOCK ) ;
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
        Token this_BEG_BLOCK_15=null;
        Token this_END_BLOCK_17=null;
        Token this_END_BLOCK_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token this_END_BLOCK_24=null;
        AntlrDatatypeRuleToken lv_context_4_0 = null;

        AntlrDatatypeRuleToken lv_dockerfile_7_0 = null;

        AntlrDatatypeRuleToken lv_target_10_0 = null;

        AntlrDatatypeRuleToken lv_args_16_0 = null;

        AntlrDatatypeRuleToken lv_args_20_0 = null;

        AntlrDatatypeRuleToken lv_args_22_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:2833:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )* this_END_BLOCK_24= RULE_END_BLOCK ) )
            // InternalDcDsl.g:2834:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )* this_END_BLOCK_24= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:2834:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )* this_END_BLOCK_24= RULE_END_BLOCK )
            // InternalDcDsl.g:2835:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )* this_END_BLOCK_24= RULE_END_BLOCK
            {
            // InternalDcDsl.g:2835:3: ()
            // InternalDcDsl.g:2836:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBuildObjectAccess().getBuildObjectAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_29); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getBuildObjectAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalDcDsl.g:2846:3: ( (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) ) | (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) ) | (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) ) | (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) ) )*
            loop66:
            do {
                int alt66=5;
                switch ( input.LA(1) ) {
                case 59:
                    {
                    alt66=1;
                    }
                    break;
                case 60:
                    {
                    alt66=2;
                    }
                    break;
                case 61:
                    {
                    alt66=3;
                    }
                    break;
                case 62:
                    {
                    alt66=4;
                    }
                    break;

                }

                switch (alt66) {
            	case 1 :
            	    // InternalDcDsl.g:2847:4: (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:2847:4: (otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) ) )
            	    // InternalDcDsl.g:2848:5: otherlv_2= 'context' otherlv_3= ':' ( (lv_context_4_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,59,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getBuildObjectAccess().getContextKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getBuildObjectAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalDcDsl.g:2856:5: ( (lv_context_4_0= ruleEString ) )
            	    // InternalDcDsl.g:2857:6: (lv_context_4_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:2857:6: (lv_context_4_0= ruleEString )
            	    // InternalDcDsl.g:2858:7: lv_context_4_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getBuildObjectAccess().getContextEStringParserRuleCall_2_0_2_0());
            	    						
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDcDsl.g:2877:4: (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:2877:4: (otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) ) )
            	    // InternalDcDsl.g:2878:5: otherlv_5= 'dockerfile' otherlv_6= ':' ( (lv_dockerfile_7_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_3); 

            	    					newLeafNode(otherlv_5, grammarAccess.getBuildObjectAccess().getDockerfileKeyword_2_1_0());
            	    				
            	    otherlv_6=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_6, grammarAccess.getBuildObjectAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalDcDsl.g:2886:5: ( (lv_dockerfile_7_0= ruleEString ) )
            	    // InternalDcDsl.g:2887:6: (lv_dockerfile_7_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:2887:6: (lv_dockerfile_7_0= ruleEString )
            	    // InternalDcDsl.g:2888:7: lv_dockerfile_7_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getBuildObjectAccess().getDockerfileEStringParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDcDsl.g:2907:4: (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:2907:4: (otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) ) )
            	    // InternalDcDsl.g:2908:5: otherlv_8= 'target' otherlv_9= ':' ( (lv_target_10_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,61,FOLLOW_3); 

            	    					newLeafNode(otherlv_8, grammarAccess.getBuildObjectAccess().getTargetKeyword_2_2_0());
            	    				
            	    otherlv_9=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_9, grammarAccess.getBuildObjectAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalDcDsl.g:2916:5: ( (lv_target_10_0= ruleEString ) )
            	    // InternalDcDsl.g:2917:6: (lv_target_10_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:2917:6: (lv_target_10_0= ruleEString )
            	    // InternalDcDsl.g:2918:7: lv_target_10_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getBuildObjectAccess().getTargetEStringParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_29);
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
            	    // InternalDcDsl.g:2937:4: (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:2937:4: (otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) ) )
            	    // InternalDcDsl.g:2938:5: otherlv_11= 'args' otherlv_12= ':' ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    {
            	    otherlv_11=(Token)match(input,62,FOLLOW_3); 

            	    					newLeafNode(otherlv_11, grammarAccess.getBuildObjectAccess().getArgsKeyword_2_3_0());
            	    				
            	    otherlv_12=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_12, grammarAccess.getBuildObjectAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalDcDsl.g:2946:5: ( (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK ) | (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' ) )
            	    int alt65=2;
            	    int LA65_0 = input.LA(1);

            	    if ( (LA65_0==RULE_BEG_BLOCK) ) {
            	        alt65=1;
            	    }
            	    else if ( (LA65_0==32) ) {
            	        alt65=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 65, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt65) {
            	        case 1 :
            	            // InternalDcDsl.g:2947:6: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:2947:6: (this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK )
            	            // InternalDcDsl.g:2948:7: this_BEG_BLOCK_13= RULE_BEG_BLOCK (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+ this_END_BLOCK_18= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_13=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_13, grammarAccess.getBuildObjectAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_0());
            	            						
            	            // InternalDcDsl.g:2952:7: (otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )? )+
            	            int cnt63=0;
            	            loop63:
            	            do {
            	                int alt63=2;
            	                int LA63_0 = input.LA(1);

            	                if ( (LA63_0==31) ) {
            	                    alt63=1;
            	                }


            	                switch (alt63) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:2953:8: otherlv_14= '-' (this_BEG_BLOCK_15= RULE_BEG_BLOCK )? ( (lv_args_16_0= ruleEString ) ) (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_14=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_14, grammarAccess.getBuildObjectAccess().getHyphenMinusKeyword_2_3_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:2957:8: (this_BEG_BLOCK_15= RULE_BEG_BLOCK )?
            	            	    int alt61=2;
            	            	    int LA61_0 = input.LA(1);

            	            	    if ( (LA61_0==RULE_BEG_BLOCK) ) {
            	            	        alt61=1;
            	            	    }
            	            	    switch (alt61) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2958:9: this_BEG_BLOCK_15= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_15=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_15, grammarAccess.getBuildObjectAccess().getBEG_BLOCKTerminalRuleCall_2_3_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:2963:8: ( (lv_args_16_0= ruleEString ) )
            	            	    // InternalDcDsl.g:2964:9: (lv_args_16_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:2964:9: (lv_args_16_0= ruleEString )
            	            	    // InternalDcDsl.g:2965:10: lv_args_16_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getBuildObjectAccess().getArgsEStringParserRuleCall_2_3_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_args_16_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"args",
            	            	    											lv_args_16_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:2982:8: (this_END_BLOCK_17= RULE_END_BLOCK )?
            	            	    int alt62=2;
            	            	    alt62 = dfa62.predict(input);
            	            	    switch (alt62) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:2983:9: this_END_BLOCK_17= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_17, grammarAccess.getBuildObjectAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt63 >= 1 ) break loop63;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(63, input);
            	                        throw eee;
            	                }
            	                cnt63++;
            	            } while (true);

            	            this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_29); 

            	            							newLeafNode(this_END_BLOCK_18, grammarAccess.getBuildObjectAccess().getEND_BLOCKTerminalRuleCall_2_3_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:2995:6: (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            {
            	            // InternalDcDsl.g:2995:6: (otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']' )
            	            // InternalDcDsl.g:2996:7: otherlv_19= '[' ( (lv_args_20_0= ruleEString ) ) (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )* otherlv_23= ']'
            	            {
            	            otherlv_19=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_19, grammarAccess.getBuildObjectAccess().getLeftSquareBracketKeyword_2_3_2_1_0());
            	            						
            	            // InternalDcDsl.g:3000:7: ( (lv_args_20_0= ruleEString ) )
            	            // InternalDcDsl.g:3001:8: (lv_args_20_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:3001:8: (lv_args_20_0= ruleEString )
            	            // InternalDcDsl.g:3002:9: lv_args_20_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getBuildObjectAccess().getArgsEStringParserRuleCall_2_3_2_1_1_0());
            	            								
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

            	            // InternalDcDsl.g:3019:7: (otherlv_21= ',' ( (lv_args_22_0= ruleEString ) ) )*
            	            loop64:
            	            do {
            	                int alt64=2;
            	                int LA64_0 = input.LA(1);

            	                if ( (LA64_0==35) ) {
            	                    alt64=1;
            	                }


            	                switch (alt64) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:3020:8: otherlv_21= ',' ( (lv_args_22_0= ruleEString ) )
            	            	    {
            	            	    otherlv_21=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_21, grammarAccess.getBuildObjectAccess().getCommaKeyword_2_3_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:3024:8: ( (lv_args_22_0= ruleEString ) )
            	            	    // InternalDcDsl.g:3025:9: (lv_args_22_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:3025:9: (lv_args_22_0= ruleEString )
            	            	    // InternalDcDsl.g:3026:10: lv_args_22_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getBuildObjectAccess().getArgsEStringParserRuleCall_2_3_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_args_22_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getBuildObjectRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"args",
            	            	    											lv_args_22_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop64;
            	                }
            	            } while (true);

            	            otherlv_23=(Token)match(input,33,FOLLOW_29); 

            	            							newLeafNode(otherlv_23, grammarAccess.getBuildObjectAccess().getRightSquareBracketKeyword_2_3_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            this_END_BLOCK_24=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_24, grammarAccess.getBuildObjectAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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
    // InternalDcDsl.g:3060:1: entryRuleNetworks returns [EObject current=null] : iv_ruleNetworks= ruleNetworks EOF ;
    public final EObject entryRuleNetworks() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetworks = null;


        try {
            // InternalDcDsl.g:3060:49: (iv_ruleNetworks= ruleNetworks EOF )
            // InternalDcDsl.g:3061:2: iv_ruleNetworks= ruleNetworks EOF
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
    // InternalDcDsl.g:3067:1: ruleNetworks returns [EObject current=null] : ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) ) ;
    public final EObject ruleNetworks() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_0=null;
        Token otherlv_2=null;
        Token this_BEG_BLOCK_3=null;
        Token this_END_BLOCK_5=null;
        Token this_END_BLOCK_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_network_7_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;

        AntlrDatatypeRuleToken lv_value_13_0 = null;

        AntlrDatatypeRuleToken lv_value_16_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3073:2: ( ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) ) )
            // InternalDcDsl.g:3074:2: ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) )
            {
            // InternalDcDsl.g:3074:2: ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) )
            int alt73=3;
            switch ( input.LA(1) ) {
            case RULE_BEG_BLOCK:
                {
                alt73=1;
                }
                break;
            case 32:
                {
                alt73=2;
                }
                break;
            case RULE_STRING:
            case RULE_SQ_STRING:
            case RULE_YAML_SCALAR:
            case RULE_GH_EXPRESSION:
            case RULE_ID:
            case RULE_INT:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalDcDsl.g:3075:3: (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) ) this_END_BLOCK_8= RULE_END_BLOCK )
                    {
                    // InternalDcDsl.g:3075:3: (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) ) this_END_BLOCK_8= RULE_END_BLOCK )
                    // InternalDcDsl.g:3076:4: this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) ) this_END_BLOCK_8= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_0=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_30); 

                    				newLeafNode(this_BEG_BLOCK_0, grammarAccess.getNetworksAccess().getBEG_BLOCKTerminalRuleCall_0_0());
                    			
                    // InternalDcDsl.g:3080:4: ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_network_7_0= ruleNetwork ) )+ ) )
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==31) ) {
                        alt71=1;
                    }
                    else if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_INT)||(LA71_0>=23 && LA71_0<=30)) ) {
                        alt71=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 0, input);

                        throw nvae;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalDcDsl.g:3081:5: ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ )
                            {
                            // InternalDcDsl.g:3081:5: ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ )
                            // InternalDcDsl.g:3082:6: () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+
                            {
                            // InternalDcDsl.g:3082:6: ()
                            // InternalDcDsl.g:3083:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getNetworksAccess().getNetworksValueAction_0_1_0_0(),
                            								current);
                            						

                            }

                            // InternalDcDsl.g:3089:6: (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+
                            int cnt69=0;
                            loop69:
                            do {
                                int alt69=2;
                                int LA69_0 = input.LA(1);

                                if ( (LA69_0==31) ) {
                                    alt69=1;
                                }


                                switch (alt69) {
                            	case 1 :
                            	    // InternalDcDsl.g:3090:7: otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
                            	    {
                            	    otherlv_2=(Token)match(input,31,FOLLOW_12); 

                            	    							newLeafNode(otherlv_2, grammarAccess.getNetworksAccess().getHyphenMinusKeyword_0_1_0_1_0());
                            	    						
                            	    // InternalDcDsl.g:3094:7: (this_BEG_BLOCK_3= RULE_BEG_BLOCK )?
                            	    int alt67=2;
                            	    int LA67_0 = input.LA(1);

                            	    if ( (LA67_0==RULE_BEG_BLOCK) ) {
                            	        alt67=1;
                            	    }
                            	    switch (alt67) {
                            	        case 1 :
                            	            // InternalDcDsl.g:3095:8: this_BEG_BLOCK_3= RULE_BEG_BLOCK
                            	            {
                            	            this_BEG_BLOCK_3=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

                            	            								newLeafNode(this_BEG_BLOCK_3, grammarAccess.getNetworksAccess().getBEG_BLOCKTerminalRuleCall_0_1_0_1_1());
                            	            							

                            	            }
                            	            break;

                            	    }

                            	    // InternalDcDsl.g:3100:7: ( (lv_value_4_0= ruleEString ) )
                            	    // InternalDcDsl.g:3101:8: (lv_value_4_0= ruleEString )
                            	    {
                            	    // InternalDcDsl.g:3101:8: (lv_value_4_0= ruleEString )
                            	    // InternalDcDsl.g:3102:9: lv_value_4_0= ruleEString
                            	    {

                            	    									newCompositeNode(grammarAccess.getNetworksAccess().getValueEStringParserRuleCall_0_1_0_1_2_0());
                            	    								
                            	    pushFollow(FOLLOW_16);
                            	    lv_value_4_0=ruleEString();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getNetworksRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"value",
                            	    										lv_value_4_0,
                            	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }

                            	    // InternalDcDsl.g:3119:7: (this_END_BLOCK_5= RULE_END_BLOCK )?
                            	    int alt68=2;
                            	    alt68 = dfa68.predict(input);
                            	    switch (alt68) {
                            	        case 1 :
                            	            // InternalDcDsl.g:3120:8: this_END_BLOCK_5= RULE_END_BLOCK
                            	            {
                            	            this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

                            	            								newLeafNode(this_END_BLOCK_5, grammarAccess.getNetworksAccess().getEND_BLOCKTerminalRuleCall_0_1_0_1_3());
                            	            							

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt69 >= 1 ) break loop69;
                                        EarlyExitException eee =
                                            new EarlyExitException(69, input);
                                        throw eee;
                                }
                                cnt69++;
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalDcDsl.g:3128:5: ( () ( (lv_network_7_0= ruleNetwork ) )+ )
                            {
                            // InternalDcDsl.g:3128:5: ( () ( (lv_network_7_0= ruleNetwork ) )+ )
                            // InternalDcDsl.g:3129:6: () ( (lv_network_7_0= ruleNetwork ) )+
                            {
                            // InternalDcDsl.g:3129:6: ()
                            // InternalDcDsl.g:3130:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getNetworksAccess().getNetworksObjectAction_0_1_1_0(),
                            								current);
                            						

                            }

                            // InternalDcDsl.g:3136:6: ( (lv_network_7_0= ruleNetwork ) )+
                            int cnt70=0;
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_INT)||(LA70_0>=23 && LA70_0<=30)) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // InternalDcDsl.g:3137:7: (lv_network_7_0= ruleNetwork )
                            	    {
                            	    // InternalDcDsl.g:3137:7: (lv_network_7_0= ruleNetwork )
                            	    // InternalDcDsl.g:3138:8: lv_network_7_0= ruleNetwork
                            	    {

                            	    								newCompositeNode(grammarAccess.getNetworksAccess().getNetworkNetworkParserRuleCall_0_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_31);
                            	    lv_network_7_0=ruleNetwork();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getNetworksRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"network",
                            	    									lv_network_7_0,
                            	    									"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Network");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt70 >= 1 ) break loop70;
                                        EarlyExitException eee =
                                            new EarlyExitException(70, input);
                                        throw eee;
                                }
                                cnt70++;
                            } while (true);


                            }


                            }
                            break;

                    }

                    this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_8, grammarAccess.getNetworksAccess().getEND_BLOCKTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:3163:3: ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    {
                    // InternalDcDsl.g:3163:3: ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    // InternalDcDsl.g:3164:4: () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']'
                    {
                    // InternalDcDsl.g:3164:4: ()
                    // InternalDcDsl.g:3165:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNetworksAccess().getNetworksValueAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getNetworksAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalDcDsl.g:3175:4: ( (lv_value_11_0= ruleEString ) )
                    // InternalDcDsl.g:3176:5: (lv_value_11_0= ruleEString )
                    {
                    // InternalDcDsl.g:3176:5: (lv_value_11_0= ruleEString )
                    // InternalDcDsl.g:3177:6: lv_value_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNetworksAccess().getValueEStringParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_value_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworksRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDcDsl.g:3194:4: (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==35) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalDcDsl.g:3195:5: otherlv_12= ',' ( (lv_value_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getNetworksAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalDcDsl.g:3199:5: ( (lv_value_13_0= ruleEString ) )
                    	    // InternalDcDsl.g:3200:6: (lv_value_13_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:3200:6: (lv_value_13_0= ruleEString )
                    	    // InternalDcDsl.g:3201:7: lv_value_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getNetworksAccess().getValueEStringParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_value_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNetworksRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_13_0,
                    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getNetworksAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDcDsl.g:3225:3: ( () ( (lv_value_16_0= ruleEString ) ) )
                    {
                    // InternalDcDsl.g:3225:3: ( () ( (lv_value_16_0= ruleEString ) ) )
                    // InternalDcDsl.g:3226:4: () ( (lv_value_16_0= ruleEString ) )
                    {
                    // InternalDcDsl.g:3226:4: ()
                    // InternalDcDsl.g:3227:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getNetworksAccess().getNetworksValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDcDsl.g:3233:4: ( (lv_value_16_0= ruleEString ) )
                    // InternalDcDsl.g:3234:5: (lv_value_16_0= ruleEString )
                    {
                    // InternalDcDsl.g:3234:5: (lv_value_16_0= ruleEString )
                    // InternalDcDsl.g:3235:6: lv_value_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNetworksAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNetworksRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_16_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleNetworks"


    // $ANTLR start "entryRuleNetwork"
    // InternalDcDsl.g:3257:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalDcDsl.g:3257:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalDcDsl.g:3258:2: iv_ruleNetwork= ruleNetwork EOF
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
    // InternalDcDsl.g:3264:1: ruleNetwork returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK ) | ruleEString )? ) ;
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
        Token otherlv_13=null;
        Token this_BEG_BLOCK_14=null;
        Token this_END_BLOCK_16=null;
        Token this_END_BLOCK_17=null;
        Token this_END_BLOCK_18=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        AntlrDatatypeRuleToken lv_driver_5_0 = null;

        AntlrDatatypeRuleToken lv_ipv4Address_8_0 = null;

        EObject lv_ipam_15_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3270:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK ) | ruleEString )? ) )
            // InternalDcDsl.g:3271:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK ) | ruleEString )? )
            {
            // InternalDcDsl.g:3271:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK ) | ruleEString )? )
            // InternalDcDsl.g:3272:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' ( (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK ) | ruleEString )?
            {
            // InternalDcDsl.g:3272:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:3273:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:3273:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:3274:5: lv_id_0_0= ruleEString
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

            otherlv_1=(Token)match(input,17,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getColonKeyword_1());
            		
            // InternalDcDsl.g:3295:3: ( (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK ) | ruleEString )?
            int alt76=3;
            alt76 = dfa76.predict(input);
            switch (alt76) {
                case 1 :
                    // InternalDcDsl.g:3296:4: (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK )
                    {
                    // InternalDcDsl.g:3296:4: (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK )
                    // InternalDcDsl.g:3297:5: this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_33); 

                    					newLeafNode(this_BEG_BLOCK_2, grammarAccess.getNetworkAccess().getBEG_BLOCKTerminalRuleCall_2_0_0());
                    				
                    // InternalDcDsl.g:3301:5: ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )*
                    loop75:
                    do {
                        int alt75=4;
                        switch ( input.LA(1) ) {
                        case 63:
                            {
                            alt75=1;
                            }
                            break;
                        case 64:
                            {
                            alt75=2;
                            }
                            break;
                        case 65:
                            {
                            alt75=3;
                            }
                            break;

                        }

                        switch (alt75) {
                    	case 1 :
                    	    // InternalDcDsl.g:3302:6: (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:3302:6: (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:3303:7: otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,63,FOLLOW_3); 

                    	    							newLeafNode(otherlv_3, grammarAccess.getNetworkAccess().getDriverKeyword_2_0_1_0_0());
                    	    						
                    	    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_4, grammarAccess.getNetworkAccess().getColonKeyword_2_0_1_0_1());
                    	    						
                    	    // InternalDcDsl.g:3311:7: ( (lv_driver_5_0= ruleEString ) )
                    	    // InternalDcDsl.g:3312:8: (lv_driver_5_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:3312:8: (lv_driver_5_0= ruleEString )
                    	    // InternalDcDsl.g:3313:9: lv_driver_5_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getNetworkAccess().getDriverEStringParserRuleCall_2_0_1_0_2_0());
                    	    								
                    	    pushFollow(FOLLOW_33);
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
                    	    // InternalDcDsl.g:3332:6: (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) )
                    	    {
                    	    // InternalDcDsl.g:3332:6: (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) )
                    	    // InternalDcDsl.g:3333:7: otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,64,FOLLOW_3); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getNetworkAccess().getIpv4_addressKeyword_2_0_1_1_0());
                    	    						
                    	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    	    							newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getColonKeyword_2_0_1_1_1());
                    	    						
                    	    // InternalDcDsl.g:3341:7: ( (lv_ipv4Address_8_0= ruleEString ) )
                    	    // InternalDcDsl.g:3342:8: (lv_ipv4Address_8_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:3342:8: (lv_ipv4Address_8_0= ruleEString )
                    	    // InternalDcDsl.g:3343:9: lv_ipv4Address_8_0= ruleEString
                    	    {

                    	    									newCompositeNode(grammarAccess.getNetworkAccess().getIpv4AddressEStringParserRuleCall_2_0_1_1_2_0());
                    	    								
                    	    pushFollow(FOLLOW_33);
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
                    	    // InternalDcDsl.g:3362:6: (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK )
                    	    {
                    	    // InternalDcDsl.g:3362:6: (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK )
                    	    // InternalDcDsl.g:3363:7: otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK
                    	    {
                    	    otherlv_9=(Token)match(input,65,FOLLOW_3); 

                    	    							newLeafNode(otherlv_9, grammarAccess.getNetworkAccess().getIpamKeyword_2_0_1_2_0());
                    	    						
                    	    otherlv_10=(Token)match(input,17,FOLLOW_6); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getNetworkAccess().getColonKeyword_2_0_1_2_1());
                    	    						
                    	    this_BEG_BLOCK_11=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_22); 

                    	    							newLeafNode(this_BEG_BLOCK_11, grammarAccess.getNetworkAccess().getBEG_BLOCKTerminalRuleCall_2_0_1_2_2());
                    	    						

                    	    							newCompositeNode(grammarAccess.getNetworkAccess().getKeyNameParserRuleCall_2_0_1_2_3());
                    	    						
                    	    pushFollow(FOLLOW_3);
                    	    ruleKeyName();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						
                    	    otherlv_13=(Token)match(input,17,FOLLOW_6); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getNetworkAccess().getColonKeyword_2_0_1_2_4());
                    	    						
                    	    this_BEG_BLOCK_14=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

                    	    							newLeafNode(this_BEG_BLOCK_14, grammarAccess.getNetworkAccess().getBEG_BLOCKTerminalRuleCall_2_0_1_2_5());
                    	    						
                    	    // InternalDcDsl.g:3390:7: ( (lv_ipam_15_0= ruleConfig ) )+
                    	    int cnt74=0;
                    	    loop74:
                    	    do {
                    	        int alt74=2;
                    	        int LA74_0 = input.LA(1);

                    	        if ( (LA74_0==31) ) {
                    	            alt74=1;
                    	        }


                    	        switch (alt74) {
                    	    	case 1 :
                    	    	    // InternalDcDsl.g:3391:8: (lv_ipam_15_0= ruleConfig )
                    	    	    {
                    	    	    // InternalDcDsl.g:3391:8: (lv_ipam_15_0= ruleConfig )
                    	    	    // InternalDcDsl.g:3392:9: lv_ipam_15_0= ruleConfig
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getNetworkAccess().getIpamConfigParserRuleCall_2_0_1_2_6_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_16);
                    	    	    lv_ipam_15_0=ruleConfig();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getNetworkRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"ipam",
                    	    	    										lv_ipam_15_0,
                    	    	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Config");
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

                    	    this_END_BLOCK_16=(Token)match(input,RULE_END_BLOCK,FOLLOW_23); 

                    	    							newLeafNode(this_END_BLOCK_16, grammarAccess.getNetworkAccess().getEND_BLOCKTerminalRuleCall_2_0_1_2_7());
                    	    						
                    	    this_END_BLOCK_17=(Token)match(input,RULE_END_BLOCK,FOLLOW_33); 

                    	    							newLeafNode(this_END_BLOCK_17, grammarAccess.getNetworkAccess().getEND_BLOCKTerminalRuleCall_2_0_1_2_8());
                    	    						

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    this_END_BLOCK_18=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    					newLeafNode(this_END_BLOCK_18, grammarAccess.getNetworkAccess().getEND_BLOCKTerminalRuleCall_2_0_2());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:3425:4: ruleEString
                    {

                    				newCompositeNode(grammarAccess.getNetworkAccess().getEStringParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleConfig"
    // InternalDcDsl.g:3437:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalDcDsl.g:3437:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalDcDsl.g:3438:2: iv_ruleConfig= ruleConfig EOF
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
    // InternalDcDsl.g:3444:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'subnet' otherlv_4= ':' ( (lv_subnet_5_0= ruleEString ) ) ) this_END_BLOCK_6= RULE_END_BLOCK ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEG_BLOCK_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token this_END_BLOCK_6=null;
        AntlrDatatypeRuleToken lv_subnet_5_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3450:2: ( ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'subnet' otherlv_4= ':' ( (lv_subnet_5_0= ruleEString ) ) ) this_END_BLOCK_6= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3451:2: ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'subnet' otherlv_4= ':' ( (lv_subnet_5_0= ruleEString ) ) ) this_END_BLOCK_6= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3451:2: ( () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'subnet' otherlv_4= ':' ( (lv_subnet_5_0= ruleEString ) ) ) this_END_BLOCK_6= RULE_END_BLOCK )
            // InternalDcDsl.g:3452:3: () otherlv_1= '-' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'subnet' otherlv_4= ':' ( (lv_subnet_5_0= ruleEString ) ) ) this_END_BLOCK_6= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3452:3: ()
            // InternalDcDsl.g:3453:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getHyphenMinusKeyword_1());
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_34); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getConfigAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalDcDsl.g:3467:3: (otherlv_3= 'subnet' otherlv_4= ':' ( (lv_subnet_5_0= ruleEString ) ) )
            // InternalDcDsl.g:3468:4: otherlv_3= 'subnet' otherlv_4= ':' ( (lv_subnet_5_0= ruleEString ) )
            {
            otherlv_3=(Token)match(input,66,FOLLOW_3); 

            				newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getSubnetKeyword_3_0());
            			
            otherlv_4=(Token)match(input,17,FOLLOW_4); 

            				newLeafNode(otherlv_4, grammarAccess.getConfigAccess().getColonKeyword_3_1());
            			
            // InternalDcDsl.g:3476:4: ( (lv_subnet_5_0= ruleEString ) )
            // InternalDcDsl.g:3477:5: (lv_subnet_5_0= ruleEString )
            {
            // InternalDcDsl.g:3477:5: (lv_subnet_5_0= ruleEString )
            // InternalDcDsl.g:3478:6: lv_subnet_5_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getConfigAccess().getSubnetEStringParserRuleCall_3_2_0());
            					
            pushFollow(FOLLOW_23);
            lv_subnet_5_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getConfigRule());
            						}
            						set(
            							current,
            							"subnet",
            							lv_subnet_5_0,
            							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }

            this_END_BLOCK_6=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_6, grammarAccess.getConfigAccess().getEND_BLOCKTerminalRuleCall_4());
            		

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
    // InternalDcDsl.g:3504:1: entryRuleDepends_on returns [EObject current=null] : iv_ruleDepends_on= ruleDepends_on EOF ;
    public final EObject entryRuleDepends_on() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDepends_on = null;


        try {
            // InternalDcDsl.g:3504:51: (iv_ruleDepends_on= ruleDepends_on EOF )
            // InternalDcDsl.g:3505:2: iv_ruleDepends_on= ruleDepends_on EOF
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
    // InternalDcDsl.g:3511:1: ruleDepends_on returns [EObject current=null] : ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) ) ;
    public final EObject ruleDepends_on() throws RecognitionException {
        EObject current = null;

        Token this_BEG_BLOCK_0=null;
        Token otherlv_2=null;
        Token this_BEG_BLOCK_3=null;
        Token this_END_BLOCK_5=null;
        Token this_END_BLOCK_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;

        EObject lv_db_7_0 = null;

        AntlrDatatypeRuleToken lv_value_11_0 = null;

        AntlrDatatypeRuleToken lv_value_13_0 = null;

        AntlrDatatypeRuleToken lv_value_16_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3517:2: ( ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) ) )
            // InternalDcDsl.g:3518:2: ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) )
            {
            // InternalDcDsl.g:3518:2: ( (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) ) this_END_BLOCK_8= RULE_END_BLOCK ) | ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' ) | ( () ( (lv_value_16_0= ruleEString ) ) ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case RULE_BEG_BLOCK:
                {
                alt82=1;
                }
                break;
            case 32:
                {
                alt82=2;
                }
                break;
            case RULE_STRING:
            case RULE_SQ_STRING:
            case RULE_YAML_SCALAR:
            case RULE_GH_EXPRESSION:
            case RULE_ID:
            case RULE_INT:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalDcDsl.g:3519:3: (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) ) this_END_BLOCK_8= RULE_END_BLOCK )
                    {
                    // InternalDcDsl.g:3519:3: (this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) ) this_END_BLOCK_8= RULE_END_BLOCK )
                    // InternalDcDsl.g:3520:4: this_BEG_BLOCK_0= RULE_BEG_BLOCK ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) ) this_END_BLOCK_8= RULE_END_BLOCK
                    {
                    this_BEG_BLOCK_0=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_20); 

                    				newLeafNode(this_BEG_BLOCK_0, grammarAccess.getDepends_onAccess().getBEG_BLOCKTerminalRuleCall_0_0());
                    			
                    // InternalDcDsl.g:3524:4: ( ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ ) | ( () ( (lv_db_7_0= ruleDb ) ) ) )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==31) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==RULE_YAML_SCALAR||(LA80_0>=RULE_ID && LA80_0<=RULE_INT)||LA80_0==16||(LA80_0>=18 && LA80_0<=22)||(LA80_0>=38 && LA80_0<=77)) ) {
                        alt80=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalDcDsl.g:3525:5: ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ )
                            {
                            // InternalDcDsl.g:3525:5: ( () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+ )
                            // InternalDcDsl.g:3526:6: () (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+
                            {
                            // InternalDcDsl.g:3526:6: ()
                            // InternalDcDsl.g:3527:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getDepends_onAccess().getDepends_onValueAction_0_1_0_0(),
                            								current);
                            						

                            }

                            // InternalDcDsl.g:3533:6: (otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )? )+
                            int cnt79=0;
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==31) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // InternalDcDsl.g:3534:7: otherlv_2= '-' (this_BEG_BLOCK_3= RULE_BEG_BLOCK )? ( (lv_value_4_0= ruleEString ) ) (this_END_BLOCK_5= RULE_END_BLOCK )?
                            	    {
                            	    otherlv_2=(Token)match(input,31,FOLLOW_12); 

                            	    							newLeafNode(otherlv_2, grammarAccess.getDepends_onAccess().getHyphenMinusKeyword_0_1_0_1_0());
                            	    						
                            	    // InternalDcDsl.g:3538:7: (this_BEG_BLOCK_3= RULE_BEG_BLOCK )?
                            	    int alt77=2;
                            	    int LA77_0 = input.LA(1);

                            	    if ( (LA77_0==RULE_BEG_BLOCK) ) {
                            	        alt77=1;
                            	    }
                            	    switch (alt77) {
                            	        case 1 :
                            	            // InternalDcDsl.g:3539:8: this_BEG_BLOCK_3= RULE_BEG_BLOCK
                            	            {
                            	            this_BEG_BLOCK_3=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

                            	            								newLeafNode(this_BEG_BLOCK_3, grammarAccess.getDepends_onAccess().getBEG_BLOCKTerminalRuleCall_0_1_0_1_1());
                            	            							

                            	            }
                            	            break;

                            	    }

                            	    // InternalDcDsl.g:3544:7: ( (lv_value_4_0= ruleEString ) )
                            	    // InternalDcDsl.g:3545:8: (lv_value_4_0= ruleEString )
                            	    {
                            	    // InternalDcDsl.g:3545:8: (lv_value_4_0= ruleEString )
                            	    // InternalDcDsl.g:3546:9: lv_value_4_0= ruleEString
                            	    {

                            	    									newCompositeNode(grammarAccess.getDepends_onAccess().getValueEStringParserRuleCall_0_1_0_1_2_0());
                            	    								
                            	    pushFollow(FOLLOW_16);
                            	    lv_value_4_0=ruleEString();

                            	    state._fsp--;


                            	    									if (current==null) {
                            	    										current = createModelElementForParent(grammarAccess.getDepends_onRule());
                            	    									}
                            	    									add(
                            	    										current,
                            	    										"value",
                            	    										lv_value_4_0,
                            	    										"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                            	    									afterParserOrEnumRuleCall();
                            	    								

                            	    }


                            	    }

                            	    // InternalDcDsl.g:3563:7: (this_END_BLOCK_5= RULE_END_BLOCK )?
                            	    int alt78=2;
                            	    alt78 = dfa78.predict(input);
                            	    switch (alt78) {
                            	        case 1 :
                            	            // InternalDcDsl.g:3564:8: this_END_BLOCK_5= RULE_END_BLOCK
                            	            {
                            	            this_END_BLOCK_5=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

                            	            								newLeafNode(this_END_BLOCK_5, grammarAccess.getDepends_onAccess().getEND_BLOCKTerminalRuleCall_0_1_0_1_3());
                            	            							

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt79 >= 1 ) break loop79;
                                        EarlyExitException eee =
                                            new EarlyExitException(79, input);
                                        throw eee;
                                }
                                cnt79++;
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalDcDsl.g:3572:5: ( () ( (lv_db_7_0= ruleDb ) ) )
                            {
                            // InternalDcDsl.g:3572:5: ( () ( (lv_db_7_0= ruleDb ) ) )
                            // InternalDcDsl.g:3573:6: () ( (lv_db_7_0= ruleDb ) )
                            {
                            // InternalDcDsl.g:3573:6: ()
                            // InternalDcDsl.g:3574:7: 
                            {

                            							current = forceCreateModelElement(
                            								grammarAccess.getDepends_onAccess().getDepends_onObjectAction_0_1_1_0(),
                            								current);
                            						

                            }

                            // InternalDcDsl.g:3580:6: ( (lv_db_7_0= ruleDb ) )
                            // InternalDcDsl.g:3581:7: (lv_db_7_0= ruleDb )
                            {
                            // InternalDcDsl.g:3581:7: (lv_db_7_0= ruleDb )
                            // InternalDcDsl.g:3582:8: lv_db_7_0= ruleDb
                            {

                            								newCompositeNode(grammarAccess.getDepends_onAccess().getDbDbParserRuleCall_0_1_1_1_0());
                            							
                            pushFollow(FOLLOW_23);
                            lv_db_7_0=ruleDb();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getDepends_onRule());
                            								}
                            								set(
                            									current,
                            									"db",
                            									lv_db_7_0,
                            									"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.Db");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }


                            }
                            break;

                    }

                    this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

                    				newLeafNode(this_END_BLOCK_8, grammarAccess.getDepends_onAccess().getEND_BLOCKTerminalRuleCall_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:3607:3: ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    {
                    // InternalDcDsl.g:3607:3: ( () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']' )
                    // InternalDcDsl.g:3608:4: () otherlv_10= '[' ( (lv_value_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )* otherlv_14= ']'
                    {
                    // InternalDcDsl.g:3608:4: ()
                    // InternalDcDsl.g:3609:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDepends_onAccess().getDepends_onValueAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_10=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getDepends_onAccess().getLeftSquareBracketKeyword_1_1());
                    			
                    // InternalDcDsl.g:3619:4: ( (lv_value_11_0= ruleEString ) )
                    // InternalDcDsl.g:3620:5: (lv_value_11_0= ruleEString )
                    {
                    // InternalDcDsl.g:3620:5: (lv_value_11_0= ruleEString )
                    // InternalDcDsl.g:3621:6: lv_value_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDepends_onAccess().getValueEStringParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_value_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepends_onRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_11_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDcDsl.g:3638:4: (otherlv_12= ',' ( (lv_value_13_0= ruleEString ) ) )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==35) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalDcDsl.g:3639:5: otherlv_12= ',' ( (lv_value_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,35,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getDepends_onAccess().getCommaKeyword_1_3_0());
                    	    				
                    	    // InternalDcDsl.g:3643:5: ( (lv_value_13_0= ruleEString ) )
                    	    // InternalDcDsl.g:3644:6: (lv_value_13_0= ruleEString )
                    	    {
                    	    // InternalDcDsl.g:3644:6: (lv_value_13_0= ruleEString )
                    	    // InternalDcDsl.g:3645:7: lv_value_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getDepends_onAccess().getValueEStringParserRuleCall_1_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_value_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDepends_onRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_13_0,
                    	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,33,FOLLOW_2); 

                    				newLeafNode(otherlv_14, grammarAccess.getDepends_onAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDcDsl.g:3669:3: ( () ( (lv_value_16_0= ruleEString ) ) )
                    {
                    // InternalDcDsl.g:3669:3: ( () ( (lv_value_16_0= ruleEString ) ) )
                    // InternalDcDsl.g:3670:4: () ( (lv_value_16_0= ruleEString ) )
                    {
                    // InternalDcDsl.g:3670:4: ()
                    // InternalDcDsl.g:3671:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getDepends_onAccess().getDepends_onValueAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDcDsl.g:3677:4: ( (lv_value_16_0= ruleEString ) )
                    // InternalDcDsl.g:3678:5: (lv_value_16_0= ruleEString )
                    {
                    // InternalDcDsl.g:3678:5: (lv_value_16_0= ruleEString )
                    // InternalDcDsl.g:3679:6: lv_value_16_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDepends_onAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_16_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDepends_onRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_16_0,
                    							"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleDepends_on"


    // $ANTLR start "entryRuleDb"
    // InternalDcDsl.g:3701:1: entryRuleDb returns [EObject current=null] : iv_ruleDb= ruleDb EOF ;
    public final EObject entryRuleDb() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDb = null;


        try {
            // InternalDcDsl.g:3701:43: (iv_ruleDb= ruleDb EOF )
            // InternalDcDsl.g:3702:2: iv_ruleDb= ruleDb EOF
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
    // InternalDcDsl.g:3708:1: ruleDb returns [EObject current=null] : ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK ) ;
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
            // InternalDcDsl.g:3714:2: ( ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3715:2: ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3715:2: ( () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK )
            // InternalDcDsl.g:3716:3: () ruleKeyName otherlv_2= ':' this_BEG_BLOCK_3= RULE_BEG_BLOCK (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) ) this_END_BLOCK_7= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3716:3: ()
            // InternalDcDsl.g:3717:4: 
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
            		
            this_BEG_BLOCK_3=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_35); 

            			newLeafNode(this_BEG_BLOCK_3, grammarAccess.getDbAccess().getBEG_BLOCKTerminalRuleCall_3());
            		
            // InternalDcDsl.g:3738:3: (otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) ) )
            // InternalDcDsl.g:3739:4: otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleEString ) )
            {
            otherlv_4=(Token)match(input,67,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getDbAccess().getConditionKeyword_4_0());
            			
            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            				newLeafNode(otherlv_5, grammarAccess.getDbAccess().getColonKeyword_4_1());
            			
            // InternalDcDsl.g:3747:4: ( (lv_condition_6_0= ruleEString ) )
            // InternalDcDsl.g:3748:5: (lv_condition_6_0= ruleEString )
            {
            // InternalDcDsl.g:3748:5: (lv_condition_6_0= ruleEString )
            // InternalDcDsl.g:3749:6: lv_condition_6_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getDbAccess().getConditionEStringParserRuleCall_4_2_0());
            					
            pushFollow(FOLLOW_23);
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
    // InternalDcDsl.g:3775:1: entryRuleHealthcheck returns [EObject current=null] : iv_ruleHealthcheck= ruleHealthcheck EOF ;
    public final EObject entryRuleHealthcheck() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHealthcheck = null;


        try {
            // InternalDcDsl.g:3775:52: (iv_ruleHealthcheck= ruleHealthcheck EOF )
            // InternalDcDsl.g:3776:2: iv_ruleHealthcheck= ruleHealthcheck EOF
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
    // InternalDcDsl.g:3782:1: ruleHealthcheck returns [EObject current=null] : ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) | (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) ) | (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) ) | (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) ) | (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) ) )* this_END_BLOCK_27= RULE_END_BLOCK ) ;
    public final EObject ruleHealthcheck() throws RecognitionException {
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token lv_retries_23_0=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token this_END_BLOCK_27=null;
        AntlrDatatypeRuleToken lv_test_7_0 = null;

        AntlrDatatypeRuleToken lv_test_11_0 = null;

        AntlrDatatypeRuleToken lv_test_13_0 = null;

        AntlrDatatypeRuleToken lv_interval_17_0 = null;

        AntlrDatatypeRuleToken lv_timeout_20_0 = null;

        AntlrDatatypeRuleToken lv_startPeriod_26_0 = null;



        	enterRule();

        try {
            // InternalDcDsl.g:3788:2: ( ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) | (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) ) | (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) ) | (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) ) | (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) ) )* this_END_BLOCK_27= RULE_END_BLOCK ) )
            // InternalDcDsl.g:3789:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) | (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) ) | (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) ) | (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) ) | (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) ) )* this_END_BLOCK_27= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:3789:2: ( () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) | (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) ) | (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) ) | (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) ) | (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) ) )* this_END_BLOCK_27= RULE_END_BLOCK )
            // InternalDcDsl.g:3790:3: () this_BEG_BLOCK_1= RULE_BEG_BLOCK ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) | (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) ) | (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) ) | (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) ) | (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) ) )* this_END_BLOCK_27= RULE_END_BLOCK
            {
            // InternalDcDsl.g:3790:3: ()
            // InternalDcDsl.g:3791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHealthcheckAccess().getHealthcheckAction_0(),
            					current);
            			

            }

            this_BEG_BLOCK_1=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_36); 

            			newLeafNode(this_BEG_BLOCK_1, grammarAccess.getHealthcheckAccess().getBEG_BLOCKTerminalRuleCall_1());
            		
            // InternalDcDsl.g:3801:3: ( (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) ) | (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) ) | (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) ) | (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) ) | (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) ) )*
            loop88:
            do {
                int alt88=6;
                switch ( input.LA(1) ) {
                case 71:
                    {
                    alt88=1;
                    }
                    break;
                case 72:
                    {
                    alt88=2;
                    }
                    break;
                case 73:
                    {
                    alt88=3;
                    }
                    break;
                case 74:
                    {
                    alt88=4;
                    }
                    break;
                case 75:
                    {
                    alt88=5;
                    }
                    break;

                }

                switch (alt88) {
            	case 1 :
            	    // InternalDcDsl.g:3802:4: (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) )
            	    {
            	    // InternalDcDsl.g:3802:4: (otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) ) )
            	    // InternalDcDsl.g:3803:5: otherlv_2= 'test' otherlv_3= ':' ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
            	    {
            	    otherlv_2=(Token)match(input,71,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getHealthcheckAccess().getTestKeyword_2_0_0());
            	    				
            	    otherlv_3=(Token)match(input,17,FOLLOW_14); 

            	    					newLeafNode(otherlv_3, grammarAccess.getHealthcheckAccess().getColonKeyword_2_0_1());
            	    				
            	    // InternalDcDsl.g:3811:5: ( (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK ) | (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' ) )
            	    int alt87=2;
            	    int LA87_0 = input.LA(1);

            	    if ( (LA87_0==RULE_BEG_BLOCK) ) {
            	        alt87=1;
            	    }
            	    else if ( (LA87_0==32) ) {
            	        alt87=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 87, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt87) {
            	        case 1 :
            	            // InternalDcDsl.g:3812:6: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK )
            	            {
            	            // InternalDcDsl.g:3812:6: (this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK )
            	            // InternalDcDsl.g:3813:7: this_BEG_BLOCK_4= RULE_BEG_BLOCK (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+ this_END_BLOCK_9= RULE_END_BLOCK
            	            {
            	            this_BEG_BLOCK_4=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_15); 

            	            							newLeafNode(this_BEG_BLOCK_4, grammarAccess.getHealthcheckAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_0());
            	            						
            	            // InternalDcDsl.g:3817:7: (otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )? )+
            	            int cnt85=0;
            	            loop85:
            	            do {
            	                int alt85=2;
            	                int LA85_0 = input.LA(1);

            	                if ( (LA85_0==31) ) {
            	                    alt85=1;
            	                }


            	                switch (alt85) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:3818:8: otherlv_5= '-' (this_BEG_BLOCK_6= RULE_BEG_BLOCK )? ( (lv_test_7_0= ruleEString ) ) (this_END_BLOCK_8= RULE_END_BLOCK )?
            	            	    {
            	            	    otherlv_5=(Token)match(input,31,FOLLOW_12); 

            	            	    								newLeafNode(otherlv_5, grammarAccess.getHealthcheckAccess().getHyphenMinusKeyword_2_0_2_0_1_0());
            	            	    							
            	            	    // InternalDcDsl.g:3822:8: (this_BEG_BLOCK_6= RULE_BEG_BLOCK )?
            	            	    int alt83=2;
            	            	    int LA83_0 = input.LA(1);

            	            	    if ( (LA83_0==RULE_BEG_BLOCK) ) {
            	            	        alt83=1;
            	            	    }
            	            	    switch (alt83) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:3823:9: this_BEG_BLOCK_6= RULE_BEG_BLOCK
            	            	            {
            	            	            this_BEG_BLOCK_6=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_4); 

            	            	            									newLeafNode(this_BEG_BLOCK_6, grammarAccess.getHealthcheckAccess().getBEG_BLOCKTerminalRuleCall_2_0_2_0_1_1());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }

            	            	    // InternalDcDsl.g:3828:8: ( (lv_test_7_0= ruleEString ) )
            	            	    // InternalDcDsl.g:3829:9: (lv_test_7_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:3829:9: (lv_test_7_0= ruleEString )
            	            	    // InternalDcDsl.g:3830:10: lv_test_7_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getHealthcheckAccess().getTestEStringParserRuleCall_2_0_2_0_1_2_0());
            	            	    									
            	            	    pushFollow(FOLLOW_16);
            	            	    lv_test_7_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"test",
            	            	    											lv_test_7_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }

            	            	    // InternalDcDsl.g:3847:8: (this_END_BLOCK_8= RULE_END_BLOCK )?
            	            	    int alt84=2;
            	            	    alt84 = dfa84.predict(input);
            	            	    switch (alt84) {
            	            	        case 1 :
            	            	            // InternalDcDsl.g:3848:9: this_END_BLOCK_8= RULE_END_BLOCK
            	            	            {
            	            	            this_END_BLOCK_8=(Token)match(input,RULE_END_BLOCK,FOLLOW_16); 

            	            	            									newLeafNode(this_END_BLOCK_8, grammarAccess.getHealthcheckAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_1_3());
            	            	            								

            	            	            }
            	            	            break;

            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt85 >= 1 ) break loop85;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(85, input);
            	                        throw eee;
            	                }
            	                cnt85++;
            	            } while (true);

            	            this_END_BLOCK_9=(Token)match(input,RULE_END_BLOCK,FOLLOW_36); 

            	            							newLeafNode(this_END_BLOCK_9, grammarAccess.getHealthcheckAccess().getEND_BLOCKTerminalRuleCall_2_0_2_0_2());
            	            						

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalDcDsl.g:3860:6: (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' )
            	            {
            	            // InternalDcDsl.g:3860:6: (otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']' )
            	            // InternalDcDsl.g:3861:7: otherlv_10= '[' ( (lv_test_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )* otherlv_14= ']'
            	            {
            	            otherlv_10=(Token)match(input,32,FOLLOW_4); 

            	            							newLeafNode(otherlv_10, grammarAccess.getHealthcheckAccess().getLeftSquareBracketKeyword_2_0_2_1_0());
            	            						
            	            // InternalDcDsl.g:3865:7: ( (lv_test_11_0= ruleEString ) )
            	            // InternalDcDsl.g:3866:8: (lv_test_11_0= ruleEString )
            	            {
            	            // InternalDcDsl.g:3866:8: (lv_test_11_0= ruleEString )
            	            // InternalDcDsl.g:3867:9: lv_test_11_0= ruleEString
            	            {

            	            									newCompositeNode(grammarAccess.getHealthcheckAccess().getTestEStringParserRuleCall_2_0_2_1_1_0());
            	            								
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

            	            // InternalDcDsl.g:3884:7: (otherlv_12= ',' ( (lv_test_13_0= ruleEString ) ) )*
            	            loop86:
            	            do {
            	                int alt86=2;
            	                int LA86_0 = input.LA(1);

            	                if ( (LA86_0==35) ) {
            	                    alt86=1;
            	                }


            	                switch (alt86) {
            	            	case 1 :
            	            	    // InternalDcDsl.g:3885:8: otherlv_12= ',' ( (lv_test_13_0= ruleEString ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,35,FOLLOW_4); 

            	            	    								newLeafNode(otherlv_12, grammarAccess.getHealthcheckAccess().getCommaKeyword_2_0_2_1_2_0());
            	            	    							
            	            	    // InternalDcDsl.g:3889:8: ( (lv_test_13_0= ruleEString ) )
            	            	    // InternalDcDsl.g:3890:9: (lv_test_13_0= ruleEString )
            	            	    {
            	            	    // InternalDcDsl.g:3890:9: (lv_test_13_0= ruleEString )
            	            	    // InternalDcDsl.g:3891:10: lv_test_13_0= ruleEString
            	            	    {

            	            	    										newCompositeNode(grammarAccess.getHealthcheckAccess().getTestEStringParserRuleCall_2_0_2_1_2_1_0());
            	            	    									
            	            	    pushFollow(FOLLOW_17);
            	            	    lv_test_13_0=ruleEString();

            	            	    state._fsp--;


            	            	    										if (current==null) {
            	            	    											current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	            	    										}
            	            	    										add(
            	            	    											current,
            	            	    											"test",
            	            	    											lv_test_13_0,
            	            	    											"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	            	    										afterParserOrEnumRuleCall();
            	            	    									

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop86;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,33,FOLLOW_36); 

            	            							newLeafNode(otherlv_14, grammarAccess.getHealthcheckAccess().getRightSquareBracketKeyword_2_0_2_1_3());
            	            						

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDcDsl.g:3917:4: (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:3917:4: (otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) ) )
            	    // InternalDcDsl.g:3918:5: otherlv_15= 'interval' otherlv_16= ':' ( (lv_interval_17_0= ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,72,FOLLOW_3); 

            	    					newLeafNode(otherlv_15, grammarAccess.getHealthcheckAccess().getIntervalKeyword_2_1_0());
            	    				
            	    otherlv_16=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_16, grammarAccess.getHealthcheckAccess().getColonKeyword_2_1_1());
            	    				
            	    // InternalDcDsl.g:3926:5: ( (lv_interval_17_0= ruleEString ) )
            	    // InternalDcDsl.g:3927:6: (lv_interval_17_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:3927:6: (lv_interval_17_0= ruleEString )
            	    // InternalDcDsl.g:3928:7: lv_interval_17_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getIntervalEStringParserRuleCall_2_1_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_interval_17_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"interval",
            	    								lv_interval_17_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalDcDsl.g:3947:4: (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:3947:4: (otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) ) )
            	    // InternalDcDsl.g:3948:5: otherlv_18= 'timeout' otherlv_19= ':' ( (lv_timeout_20_0= ruleEString ) )
            	    {
            	    otherlv_18=(Token)match(input,73,FOLLOW_3); 

            	    					newLeafNode(otherlv_18, grammarAccess.getHealthcheckAccess().getTimeoutKeyword_2_2_0());
            	    				
            	    otherlv_19=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_19, grammarAccess.getHealthcheckAccess().getColonKeyword_2_2_1());
            	    				
            	    // InternalDcDsl.g:3956:5: ( (lv_timeout_20_0= ruleEString ) )
            	    // InternalDcDsl.g:3957:6: (lv_timeout_20_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:3957:6: (lv_timeout_20_0= ruleEString )
            	    // InternalDcDsl.g:3958:7: lv_timeout_20_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getTimeoutEStringParserRuleCall_2_2_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_timeout_20_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"timeout",
            	    								lv_timeout_20_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalDcDsl.g:3977:4: (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) )
            	    {
            	    // InternalDcDsl.g:3977:4: (otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) ) )
            	    // InternalDcDsl.g:3978:5: otherlv_21= 'retries' otherlv_22= ':' ( (lv_retries_23_0= RULE_INT ) )
            	    {
            	    otherlv_21=(Token)match(input,74,FOLLOW_3); 

            	    					newLeafNode(otherlv_21, grammarAccess.getHealthcheckAccess().getRetriesKeyword_2_3_0());
            	    				
            	    otherlv_22=(Token)match(input,17,FOLLOW_19); 

            	    					newLeafNode(otherlv_22, grammarAccess.getHealthcheckAccess().getColonKeyword_2_3_1());
            	    				
            	    // InternalDcDsl.g:3986:5: ( (lv_retries_23_0= RULE_INT ) )
            	    // InternalDcDsl.g:3987:6: (lv_retries_23_0= RULE_INT )
            	    {
            	    // InternalDcDsl.g:3987:6: (lv_retries_23_0= RULE_INT )
            	    // InternalDcDsl.g:3988:7: lv_retries_23_0= RULE_INT
            	    {
            	    lv_retries_23_0=(Token)match(input,RULE_INT,FOLLOW_36); 

            	    							newLeafNode(lv_retries_23_0, grammarAccess.getHealthcheckAccess().getRetriesINTTerminalRuleCall_2_3_2_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getHealthcheckRule());
            	    							}
            	    							setWithLastConsumed(
            	    								current,
            	    								"retries",
            	    								lv_retries_23_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.INT");
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalDcDsl.g:4006:4: (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) )
            	    {
            	    // InternalDcDsl.g:4006:4: (otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) ) )
            	    // InternalDcDsl.g:4007:5: otherlv_24= 'start_period' otherlv_25= ':' ( (lv_startPeriod_26_0= ruleEString ) )
            	    {
            	    otherlv_24=(Token)match(input,75,FOLLOW_3); 

            	    					newLeafNode(otherlv_24, grammarAccess.getHealthcheckAccess().getStart_periodKeyword_2_4_0());
            	    				
            	    otherlv_25=(Token)match(input,17,FOLLOW_4); 

            	    					newLeafNode(otherlv_25, grammarAccess.getHealthcheckAccess().getColonKeyword_2_4_1());
            	    				
            	    // InternalDcDsl.g:4015:5: ( (lv_startPeriod_26_0= ruleEString ) )
            	    // InternalDcDsl.g:4016:6: (lv_startPeriod_26_0= ruleEString )
            	    {
            	    // InternalDcDsl.g:4016:6: (lv_startPeriod_26_0= ruleEString )
            	    // InternalDcDsl.g:4017:7: lv_startPeriod_26_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getHealthcheckAccess().getStartPeriodEStringParserRuleCall_2_4_2_0());
            	    						
            	    pushFollow(FOLLOW_36);
            	    lv_startPeriod_26_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getHealthcheckRule());
            	    							}
            	    							set(
            	    								current,
            	    								"startPeriod",
            	    								lv_startPeriod_26_0,
            	    								"pt.isep.yamldslgen.dockercompose.xtext.DcDsl.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            this_END_BLOCK_27=(Token)match(input,RULE_END_BLOCK,FOLLOW_2); 

            			newLeafNode(this_END_BLOCK_27, grammarAccess.getHealthcheckAccess().getEND_BLOCKTerminalRuleCall_3());
            		

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
    // InternalDcDsl.g:4044:1: entryRuleSecret returns [EObject current=null] : iv_ruleSecret= ruleSecret EOF ;
    public final EObject entryRuleSecret() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSecret = null;


        try {
            // InternalDcDsl.g:4044:47: (iv_ruleSecret= ruleSecret EOF )
            // InternalDcDsl.g:4045:2: iv_ruleSecret= ruleSecret EOF
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
    // InternalDcDsl.g:4051:1: ruleSecret returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) ;
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
            // InternalDcDsl.g:4057:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) )
            // InternalDcDsl.g:4058:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:4058:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            // InternalDcDsl.g:4059:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK
            {
            // InternalDcDsl.g:4059:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:4060:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:4060:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:4061:5: lv_id_0_0= ruleEString
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
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_37); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getSecretAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalDcDsl.g:4086:3: (otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) ) )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==77) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // InternalDcDsl.g:4087:4: otherlv_3= 'file' otherlv_4= ':' ( (lv_file_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,77,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getSecretAccess().getFileKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getSecretAccess().getColonKeyword_3_1());
                    			
                    // InternalDcDsl.g:4095:4: ( (lv_file_5_0= ruleEString ) )
                    // InternalDcDsl.g:4096:5: (lv_file_5_0= ruleEString )
                    {
                    // InternalDcDsl.g:4096:5: (lv_file_5_0= ruleEString )
                    // InternalDcDsl.g:4097:6: lv_file_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSecretAccess().getFileEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_23);
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
    // InternalDcDsl.g:4123:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalDcDsl.g:4123:49: (iv_ruleResource= ruleResource EOF )
            // InternalDcDsl.g:4124:2: iv_ruleResource= ruleResource EOF
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
    // InternalDcDsl.g:4130:1: ruleResource returns [EObject current=null] : ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) ;
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
            // InternalDcDsl.g:4136:2: ( ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK ) )
            // InternalDcDsl.g:4137:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            {
            // InternalDcDsl.g:4137:2: ( ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK )
            // InternalDcDsl.g:4138:3: ( (lv_id_0_0= ruleEString ) ) otherlv_1= ':' this_BEG_BLOCK_2= RULE_BEG_BLOCK (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )? this_END_BLOCK_6= RULE_END_BLOCK
            {
            // InternalDcDsl.g:4138:3: ( (lv_id_0_0= ruleEString ) )
            // InternalDcDsl.g:4139:4: (lv_id_0_0= ruleEString )
            {
            // InternalDcDsl.g:4139:4: (lv_id_0_0= ruleEString )
            // InternalDcDsl.g:4140:5: lv_id_0_0= ruleEString
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
            		
            this_BEG_BLOCK_2=(Token)match(input,RULE_BEG_BLOCK,FOLLOW_38); 

            			newLeafNode(this_BEG_BLOCK_2, grammarAccess.getResourceAccess().getBEG_BLOCKTerminalRuleCall_2());
            		
            // InternalDcDsl.g:4165:3: (otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==76) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalDcDsl.g:4166:4: otherlv_3= 'memory' otherlv_4= ':' ( (lv_memory_5_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getMemoryKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getColonKeyword_3_1());
                    			
                    // InternalDcDsl.g:4174:4: ( (lv_memory_5_0= ruleEString ) )
                    // InternalDcDsl.g:4175:5: (lv_memory_5_0= ruleEString )
                    {
                    // InternalDcDsl.g:4175:5: (lv_memory_5_0= ruleEString )
                    // InternalDcDsl.g:4176:6: lv_memory_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getMemoryEStringParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_23);
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
    // InternalDcDsl.g:4202:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalDcDsl.g:4202:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalDcDsl.g:4203:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalDcDsl.g:4209:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalDcDsl.g:4215:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalDcDsl.g:4216:2: (kw= 'true' | kw= 'false' )
            {
            // InternalDcDsl.g:4216:2: (kw= 'true' | kw= 'false' )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==23) ) {
                alt91=1;
            }
            else if ( (LA91_0==24) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalDcDsl.g:4217:3: kw= 'true'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDcDsl.g:4223:3: kw= 'false'
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
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA62 dfa62 = new DFA62(this);
    protected DFA68 dfa68 = new DFA68(this);
    protected DFA76 dfa76 = new DFA76(this);
    protected DFA78 dfa78 = new DFA78(this);
    protected DFA84 dfa84 = new DFA84(this);
    static final String dfa_1s = "\44\uffff";
    static final String dfa_2s = "\1\1\6\uffff\1\41\34\uffff";
    static final String dfa_3s = "\1\5\6\uffff\1\5\17\uffff\1\21\12\uffff\2\21";
    static final String dfa_4s = "\1\115\6\uffff\1\115\17\uffff\1\43\12\uffff\2\43";
    static final String dfa_5s = "\1\uffff\1\25\1\3\1\1\1\4\1\6\1\12\1\uffff\1\10\1\5\1\20\1\17\1\21\1\22\1\23\1\24\1\2\1\7\1\11\1\14\1\15\1\16\1\13\1\uffff\12\13\2\uffff";
    static final String dfa_6s = "\44\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\11\1\1\1\3\1\20\1\2\1\4\1\25\3\uffff\1\1\1\6\7\1\1\12\1\13\1\14\1\15\1\16\1\17\1\5\1\21\1\10\1\22\1\7\1\23\1\24\50\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\1\26\1\27\1\36\1\37\1\40\2\41\3\uffff\7\41\1\42\1\43\1\30\1\31\1\32\1\33\1\34\1\35\57\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\17\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\41\17\uffff\1\1\1\uffff\1\1",
            "\1\41\17\uffff\1\1\1\uffff\1\1"
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
    static final String dfa_8s = "\47\uffff";
    static final String dfa_9s = "\1\17\2\20\14\45\2\uffff\1\45\5\uffff\4\45\1\uffff\4\45\6\uffff\1\45";
    static final String dfa_10s = "\3\5\6\4\6\5\2\uffff\1\5\5\uffff\4\5\1\uffff\4\5\6\uffff\1\5";
    static final String dfa_11s = "\3\36\6\45\6\36\2\uffff\1\45\5\uffff\4\45\1\uffff\4\45\6\uffff\1\36";
    static final String dfa_12s = "\17\uffff\1\2\1\1\1\uffff\5\1\4\uffff\1\1\4\uffff\6\1\1\uffff";
    static final String dfa_13s = "\47\uffff}>";
    static final String[] dfa_14s = {
            "\1\17\1\1\1\2\1\11\1\12\1\13\1\14\13\uffff\1\15\1\16\1\3\1\4\1\5\1\6\1\7\1\10",
            "\7\20\5\uffff\1\17\5\uffff\10\20",
            "\7\20\5\uffff\1\17\5\uffff\10\20",
            "\1\21\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\21\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\21\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\21\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\21\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\21\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\20\6\45\5\uffff\1\17\5\uffff\10\45",
            "\1\20\6\45\5\uffff\1\17\5\uffff\10\45",
            "\1\20\6\45\5\uffff\1\17\5\uffff\10\45",
            "\1\20\6\45\5\uffff\1\17\5\uffff\10\45",
            "\1\20\6\45\5\uffff\1\17\5\uffff\10\45",
            "\1\20\6\45\5\uffff\1\17\5\uffff\10\45",
            "",
            "",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "",
            "",
            "",
            "",
            "",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "\1\46\1\26\1\45\1\22\1\23\1\24\1\25\1\37\4\uffff\1\33\5\uffff\2\45\1\41\1\40\1\42\1\43\1\44\1\45\1\27\1\30\1\31\1\32\1\34\1\35\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\6\45\4\uffff\1\45\1\17\15\45"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2735:3: ( ruleEString )?";
        }
    }
    static final String dfa_15s = "\13\uffff";
    static final String dfa_16s = "\3\uffff\1\2\1\uffff\1\7\1\10\1\11\1\12\2\uffff";
    static final String dfa_17s = "\2\5\1\uffff\1\5\1\uffff\2\5\2\0\2\uffff";
    static final String dfa_18s = "\1\37\1\76\1\uffff\1\76\1\uffff\1\72\1\36\2\0\2\uffff";
    static final String dfa_19s = "\2\uffff\1\2\1\uffff\1\1\4\uffff\2\1";
    static final String dfa_20s = "\13\uffff}>";
    static final String[] dfa_21s = {
            "\1\1\31\uffff\1\2",
            "\1\3\31\uffff\1\4\33\uffff\4\2",
            "",
            "\1\5\16\uffff\3\2\17\uffff\25\2\4\4",
            "",
            "\1\6\6\2\10\uffff\3\4\10\2\7\uffff\25\4",
            "\7\4\4\uffff\1\2\1\uffff\5\2\10\4",
            "\1\uffff",
            "\1\uffff",
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

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "2982:8: (this_END_BLOCK_17= RULE_END_BLOCK )?";
        }
    }
    static final String dfa_22s = "\12\uffff";
    static final String dfa_23s = "\1\uffff\1\2\1\uffff\1\5\1\uffff\1\7\1\10\1\uffff\1\11\1\uffff";
    static final String dfa_24s = "\2\5\1\uffff\1\5\1\uffff\1\0\1\5\1\uffff\1\0\1\uffff";
    static final String dfa_25s = "\1\37\1\72\1\uffff\1\72\1\uffff\1\0\1\36\1\uffff\1\0\1\uffff";
    static final String dfa_26s = "\2\uffff\1\2\1\uffff\1\1\2\uffff\1\1\1\uffff\1\1";
    static final String dfa_27s = "\12\uffff}>";
    static final String[] dfa_28s = {
            "\1\1\31\uffff\1\2",
            "\1\3\12\uffff\1\2\1\uffff\5\2\10\uffff\1\4\6\uffff\25\2",
            "",
            "\1\6\6\2\4\uffff\1\4\1\uffff\5\4\10\2\7\uffff\25\4",
            "",
            "\1\uffff",
            "\7\4\4\uffff\1\2\1\uffff\5\2\10\4",
            "",
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

    class DFA68 extends DFA {

        public DFA68(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 68;
            this.eot = dfa_22;
            this.eof = dfa_23;
            this.min = dfa_24;
            this.max = dfa_25;
            this.accept = dfa_26;
            this.special = dfa_27;
            this.transition = dfa_28;
        }
        public String getDescription() {
            return "3119:7: (this_END_BLOCK_5= RULE_END_BLOCK )?";
        }
    }
    static final String dfa_29s = "\50\uffff";
    static final String dfa_30s = "\1\20\1\uffff\2\21\14\46\2\uffff\1\46\5\uffff\4\46\1\uffff\4\46\6\uffff\1\46";
    static final String dfa_31s = "\1\4\1\uffff\2\5\6\4\6\5\2\uffff\1\5\5\uffff\4\5\1\uffff\4\5\6\uffff\1\5";
    static final String dfa_32s = "\1\36\1\uffff\2\36\6\45\6\36\2\uffff\1\45\5\uffff\4\45\1\uffff\4\45\6\uffff\1\72";
    static final String dfa_33s = "\1\uffff\1\1\16\uffff\1\3\1\2\1\uffff\5\2\4\uffff\1\2\4\uffff\6\2\1\uffff";
    static final String dfa_34s = "\50\uffff}>";
    static final String[] dfa_35s = {
            "\1\1\1\20\1\2\1\3\1\12\1\13\1\14\1\15\13\uffff\1\16\1\17\1\4\1\5\1\6\1\7\1\10\1\11",
            "",
            "\7\21\5\uffff\1\20\5\uffff\10\21",
            "\7\21\5\uffff\1\20\5\uffff\10\21",
            "\1\22\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\22\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\22\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\22\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\22\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\22\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\21\6\46\5\uffff\1\20\5\uffff\10\46",
            "\1\21\6\46\5\uffff\1\20\5\uffff\10\46",
            "\1\21\6\46\5\uffff\1\20\5\uffff\10\46",
            "\1\21\6\46\5\uffff\1\20\5\uffff\10\46",
            "\1\21\6\46\5\uffff\1\20\5\uffff\10\46",
            "\1\21\6\46\5\uffff\1\20\5\uffff\10\46",
            "",
            "",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "\1\47\1\27\1\46\1\23\1\24\1\25\1\26\1\40\4\uffff\1\34\5\uffff\2\46\1\42\1\41\1\43\1\44\1\45\1\46\1\30\1\31\1\32\1\33\1\35\1\36\1\37",
            "",
            "",
            "",
            "",
            "",
            "",
            "\7\46\4\uffff\1\46\1\20\15\46\7\uffff\25\46"
    };

    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final char[] dfa_31 = DFA.unpackEncodedStringToUnsignedChars(dfa_31s);
    static final char[] dfa_32 = DFA.unpackEncodedStringToUnsignedChars(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[][] dfa_35 = unpackEncodedStringArray(dfa_35s);

    class DFA76 extends DFA {

        public DFA76(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 76;
            this.eot = dfa_29;
            this.eof = dfa_30;
            this.min = dfa_31;
            this.max = dfa_32;
            this.accept = dfa_33;
            this.special = dfa_34;
            this.transition = dfa_35;
        }
        public String getDescription() {
            return "3295:3: ( (this_BEG_BLOCK_2= RULE_BEG_BLOCK ( (otherlv_3= 'driver' otherlv_4= ':' ( (lv_driver_5_0= ruleEString ) ) ) | (otherlv_6= 'ipv4_address' otherlv_7= ':' ( (lv_ipv4Address_8_0= ruleEString ) ) ) | (otherlv_9= 'ipam' otherlv_10= ':' this_BEG_BLOCK_11= RULE_BEG_BLOCK ruleKeyName otherlv_13= ':' this_BEG_BLOCK_14= RULE_BEG_BLOCK ( (lv_ipam_15_0= ruleConfig ) )+ this_END_BLOCK_16= RULE_END_BLOCK this_END_BLOCK_17= RULE_END_BLOCK ) )* this_END_BLOCK_18= RULE_END_BLOCK ) | ruleEString )?";
        }
    }
    static final String dfa_36s = "\1\uffff\1\2\1\uffff\1\6\1\uffff\1\7\1\10\1\11\2\uffff";
    static final String dfa_37s = "\2\5\1\uffff\1\5\1\uffff\1\5\2\0\2\uffff";
    static final String dfa_38s = "\1\37\1\72\1\uffff\1\72\1\uffff\1\36\2\0\2\uffff";
    static final String dfa_39s = "\2\uffff\1\2\1\uffff\1\1\3\uffff\2\1";
    static final String[] dfa_40s = {
            "\1\1\31\uffff\1\2",
            "\1\3\16\uffff\3\2\10\uffff\1\4\6\uffff\25\2",
            "",
            "\1\5\6\2\10\uffff\3\4\10\2\7\uffff\25\4",
            "",
            "\7\4\4\uffff\1\2\1\uffff\5\2\10\4",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final char[] dfa_38 = DFA.unpackEncodedStringToUnsignedChars(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA78 extends DFA {

        public DFA78(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 78;
            this.eot = dfa_22;
            this.eof = dfa_36;
            this.min = dfa_37;
            this.max = dfa_38;
            this.accept = dfa_39;
            this.special = dfa_27;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "3563:7: (this_END_BLOCK_5= RULE_END_BLOCK )?";
        }
    }
    static final String dfa_41s = "\1\37\1\113\1\uffff\1\113\1\uffff\1\72\1\36\2\0\2\uffff";
    static final String[] dfa_42s = {
            "\1\1\31\uffff\1\2",
            "\1\3\31\uffff\1\4\47\uffff\5\2",
            "",
            "\1\5\16\uffff\3\2\17\uffff\25\2\14\uffff\5\4",
            "",
            "\1\6\6\2\10\uffff\3\4\10\2\7\uffff\25\4",
            "\7\4\4\uffff\1\2\1\uffff\5\2\10\4",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[][] dfa_42 = unpackEncodedStringArray(dfa_42s);

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_41;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_42;
        }
        public String getDescription() {
            return "3847:8: (this_END_BLOCK_8= RULE_END_BLOCK )?";
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
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xFFFFFFC0807D0D00L,0x0000000000003FFFL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xFFFFFFC0007D0D20L,0x0000000000003FFFL});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0xFFFFFFC0007D0D00L,0x0000000000003FFFL});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x200000007F800FF2L,0x0000000000000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x200000007F800FE2L,0x0000000000000070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x2000000000000022L,0x0000000000000070L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000007F800FC2L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x7800000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000000FF800FC0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000FF800FE0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000007F800FD2L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x8000000000000020L,0x0000000000000003L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L,0x0000000000000F80L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000020L,0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000020L,0x0000000000001000L});

}
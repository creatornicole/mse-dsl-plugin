package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SUBSTANTIV", "RULE_INF_VERB", "RULE_LOWER_SEQ", "RULE_INF_ZU_VERB", "RULE_LOWER", "RULE_LOWER_NO_Z", "RULE_LOWER_NO_ZU", "RULE_GERMAN_VERBS_ENDING", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'Als'", "'m\\u00F6chte'", "'ich'", "','", "'um'", "'.'"
    };
    public static final int RULE_LOWER_NO_Z=9;
    public static final int RULE_INF_ZU_VERB=7;
    public static final int RULE_LOWER=8;
    public static final int RULE_STRING=14;
    public static final int RULE_SL_COMMENT=16;
    public static final int T__19=19;
    public static final int RULE_GERMAN_VERBS_ENDING=11;
    public static final int EOF=-1;
    public static final int RULE_ID=12;
    public static final int RULE_WS=17;
    public static final int RULE_SUBSTANTIV=4;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_LOWER_NO_ZU=10;
    public static final int RULE_LOWER_SEQ=6;
    public static final int RULE_INT=13;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=15;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_INF_VERB=5;
    public static final int T__20=20;
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
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : ( (lv_stories_0_0= ruleUserStory ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_stories_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_stories_0_0= ruleUserStory ) )* )
            // InternalMyDsl.g:78:2: ( (lv_stories_0_0= ruleUserStory ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_stories_0_0= ruleUserStory ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SUBSTANTIV) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_stories_0_0= ruleUserStory )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_stories_0_0= ruleUserStory )
            	    // InternalMyDsl.g:80:4: lv_stories_0_0= ruleUserStory
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStoriesUserStoryParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_stories_0_0=ruleUserStory();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"stories",
            	    					lv_stories_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.UserStory");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUserStory"
    // InternalMyDsl.g:100:1: entryRuleUserStory returns [EObject current=null] : iv_ruleUserStory= ruleUserStory EOF ;
    public final EObject entryRuleUserStory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserStory = null;


        try {
            // InternalMyDsl.g:100:50: (iv_ruleUserStory= ruleUserStory EOF )
            // InternalMyDsl.g:101:2: iv_ruleUserStory= ruleUserStory EOF
            {
             newCompositeNode(grammarAccess.getUserStoryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserStory=ruleUserStory();

            state._fsp--;

             current =iv_ruleUserStory; 
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
    // $ANTLR end "entryRuleUserStory"


    // $ANTLR start "ruleUserStory"
    // InternalMyDsl.g:107:1: ruleUserStory returns [EObject current=null] : ( ( (lv_titel_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Als' ( (lv_rolle_3_0= ruleRolle ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' ( (lv_ziel_6_0= ruleZiel ) ) otherlv_7= ',' otherlv_8= 'um' ( (lv_nutzen_9_0= ruleNutzen ) ) otherlv_10= '.' ) ;
    public final EObject ruleUserStory() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_titel_0_0 = null;

        EObject lv_rolle_3_0 = null;

        EObject lv_ziel_6_0 = null;

        EObject lv_nutzen_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( (lv_titel_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Als' ( (lv_rolle_3_0= ruleRolle ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' ( (lv_ziel_6_0= ruleZiel ) ) otherlv_7= ',' otherlv_8= 'um' ( (lv_nutzen_9_0= ruleNutzen ) ) otherlv_10= '.' ) )
            // InternalMyDsl.g:114:2: ( ( (lv_titel_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Als' ( (lv_rolle_3_0= ruleRolle ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' ( (lv_ziel_6_0= ruleZiel ) ) otherlv_7= ',' otherlv_8= 'um' ( (lv_nutzen_9_0= ruleNutzen ) ) otherlv_10= '.' )
            {
            // InternalMyDsl.g:114:2: ( ( (lv_titel_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Als' ( (lv_rolle_3_0= ruleRolle ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' ( (lv_ziel_6_0= ruleZiel ) ) otherlv_7= ',' otherlv_8= 'um' ( (lv_nutzen_9_0= ruleNutzen ) ) otherlv_10= '.' )
            // InternalMyDsl.g:115:3: ( (lv_titel_0_0= ruleTitel ) ) otherlv_1= ':' otherlv_2= 'Als' ( (lv_rolle_3_0= ruleRolle ) ) otherlv_4= 'm\\u00F6chte' otherlv_5= 'ich' ( (lv_ziel_6_0= ruleZiel ) ) otherlv_7= ',' otherlv_8= 'um' ( (lv_nutzen_9_0= ruleNutzen ) ) otherlv_10= '.'
            {
            // InternalMyDsl.g:115:3: ( (lv_titel_0_0= ruleTitel ) )
            // InternalMyDsl.g:116:4: (lv_titel_0_0= ruleTitel )
            {
            // InternalMyDsl.g:116:4: (lv_titel_0_0= ruleTitel )
            // InternalMyDsl.g:117:5: lv_titel_0_0= ruleTitel
            {

            					newCompositeNode(grammarAccess.getUserStoryAccess().getTitelTitelParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_titel_0_0=ruleTitel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserStoryRule());
            					}
            					set(
            						current,
            						"titel",
            						lv_titel_0_0,
            						"org.xtext.example.mydsl.MyDsl.Titel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getUserStoryAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getUserStoryAccess().getAlsKeyword_2());
            		
            // InternalMyDsl.g:142:3: ( (lv_rolle_3_0= ruleRolle ) )
            // InternalMyDsl.g:143:4: (lv_rolle_3_0= ruleRolle )
            {
            // InternalMyDsl.g:143:4: (lv_rolle_3_0= ruleRolle )
            // InternalMyDsl.g:144:5: lv_rolle_3_0= ruleRolle
            {

            					newCompositeNode(grammarAccess.getUserStoryAccess().getRolleRolleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_rolle_3_0=ruleRolle();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserStoryRule());
            					}
            					set(
            						current,
            						"rolle",
            						lv_rolle_3_0,
            						"org.xtext.example.mydsl.MyDsl.Rolle");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getUserStoryAccess().getMöchteKeyword_4());
            		
            otherlv_5=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getUserStoryAccess().getIchKeyword_5());
            		
            // InternalMyDsl.g:169:3: ( (lv_ziel_6_0= ruleZiel ) )
            // InternalMyDsl.g:170:4: (lv_ziel_6_0= ruleZiel )
            {
            // InternalMyDsl.g:170:4: (lv_ziel_6_0= ruleZiel )
            // InternalMyDsl.g:171:5: lv_ziel_6_0= ruleZiel
            {

            					newCompositeNode(grammarAccess.getUserStoryAccess().getZielZielParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_ziel_6_0=ruleZiel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserStoryRule());
            					}
            					set(
            						current,
            						"ziel",
            						lv_ziel_6_0,
            						"org.xtext.example.mydsl.MyDsl.Ziel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getUserStoryAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getUserStoryAccess().getUmKeyword_8());
            		
            // InternalMyDsl.g:196:3: ( (lv_nutzen_9_0= ruleNutzen ) )
            // InternalMyDsl.g:197:4: (lv_nutzen_9_0= ruleNutzen )
            {
            // InternalMyDsl.g:197:4: (lv_nutzen_9_0= ruleNutzen )
            // InternalMyDsl.g:198:5: lv_nutzen_9_0= ruleNutzen
            {

            					newCompositeNode(grammarAccess.getUserStoryAccess().getNutzenNutzenParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_12);
            lv_nutzen_9_0=ruleNutzen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUserStoryRule());
            					}
            					set(
            						current,
            						"nutzen",
            						lv_nutzen_9_0,
            						"org.xtext.example.mydsl.MyDsl.Nutzen");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getUserStoryAccess().getFullStopKeyword_10());
            		

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
    // $ANTLR end "ruleUserStory"


    // $ANTLR start "entryRuleTitel"
    // InternalMyDsl.g:223:1: entryRuleTitel returns [EObject current=null] : iv_ruleTitel= ruleTitel EOF ;
    public final EObject entryRuleTitel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTitel = null;


        try {
            // InternalMyDsl.g:223:46: (iv_ruleTitel= ruleTitel EOF )
            // InternalMyDsl.g:224:2: iv_ruleTitel= ruleTitel EOF
            {
             newCompositeNode(grammarAccess.getTitelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTitel=ruleTitel();

            state._fsp--;

             current =iv_ruleTitel; 
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
    // $ANTLR end "entryRuleTitel"


    // $ANTLR start "ruleTitel"
    // InternalMyDsl.g:230:1: ruleTitel returns [EObject current=null] : ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_VERB ) ) ) ;
    public final EObject ruleTitel() throws RecognitionException {
        EObject current = null;

        Token lv_subjekt_0_0=null;
        Token lv_verb_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:236:2: ( ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_VERB ) ) ) )
            // InternalMyDsl.g:237:2: ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_VERB ) ) )
            {
            // InternalMyDsl.g:237:2: ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_VERB ) ) )
            // InternalMyDsl.g:238:3: ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_VERB ) )
            {
            // InternalMyDsl.g:238:3: ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:239:4: (lv_subjekt_0_0= RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:239:4: (lv_subjekt_0_0= RULE_SUBSTANTIV )
            // InternalMyDsl.g:240:5: lv_subjekt_0_0= RULE_SUBSTANTIV
            {
            lv_subjekt_0_0=(Token)match(input,RULE_SUBSTANTIV,FOLLOW_13); 

            					newLeafNode(lv_subjekt_0_0, grammarAccess.getTitelAccess().getSubjektSUBSTANTIVTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subjekt",
            						lv_subjekt_0_0,
            						"org.xtext.example.mydsl.MyDsl.SUBSTANTIV");
            				

            }


            }

            // InternalMyDsl.g:256:3: ( (lv_verb_1_0= RULE_INF_VERB ) )
            // InternalMyDsl.g:257:4: (lv_verb_1_0= RULE_INF_VERB )
            {
            // InternalMyDsl.g:257:4: (lv_verb_1_0= RULE_INF_VERB )
            // InternalMyDsl.g:258:5: lv_verb_1_0= RULE_INF_VERB
            {
            lv_verb_1_0=(Token)match(input,RULE_INF_VERB,FOLLOW_2); 

            					newLeafNode(lv_verb_1_0, grammarAccess.getTitelAccess().getVerbINF_VERBTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTitelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"verb",
            						lv_verb_1_0,
            						"org.xtext.example.mydsl.MyDsl.INF_VERB");
            				

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
    // $ANTLR end "ruleTitel"


    // $ANTLR start "entryRuleRolle"
    // InternalMyDsl.g:278:1: entryRuleRolle returns [EObject current=null] : iv_ruleRolle= ruleRolle EOF ;
    public final EObject entryRuleRolle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRolle = null;


        try {
            // InternalMyDsl.g:278:46: (iv_ruleRolle= ruleRolle EOF )
            // InternalMyDsl.g:279:2: iv_ruleRolle= ruleRolle EOF
            {
             newCompositeNode(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRolle=ruleRolle();

            state._fsp--;

             current =iv_ruleRolle; 
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
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalMyDsl.g:285:1: ruleRolle returns [EObject current=null] : ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ;
    public final EObject ruleRolle() throws RecognitionException {
        EObject current = null;

        Token lv_subjekt_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:291:2: ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) )
            // InternalMyDsl.g:292:2: ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) )
            {
            // InternalMyDsl.g:292:2: ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:293:3: (lv_subjekt_0_0= RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:293:3: (lv_subjekt_0_0= RULE_SUBSTANTIV )
            // InternalMyDsl.g:294:4: lv_subjekt_0_0= RULE_SUBSTANTIV
            {
            lv_subjekt_0_0=(Token)match(input,RULE_SUBSTANTIV,FOLLOW_2); 

            				newLeafNode(lv_subjekt_0_0, grammarAccess.getRolleAccess().getSubjektSUBSTANTIVTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRolleRule());
            				}
            				setWithLastConsumed(
            					current,
            					"subjekt",
            					lv_subjekt_0_0,
            					"org.xtext.example.mydsl.MyDsl.SUBSTANTIV");
            			

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
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel"
    // InternalMyDsl.g:313:1: entryRuleZiel returns [EObject current=null] : iv_ruleZiel= ruleZiel EOF ;
    public final EObject entryRuleZiel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZiel = null;


        try {
            // InternalMyDsl.g:313:45: (iv_ruleZiel= ruleZiel EOF )
            // InternalMyDsl.g:314:2: iv_ruleZiel= ruleZiel EOF
            {
             newCompositeNode(grammarAccess.getZielRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZiel=ruleZiel();

            state._fsp--;

             current =iv_ruleZiel; 
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
    // $ANTLR end "entryRuleZiel"


    // $ANTLR start "ruleZiel"
    // InternalMyDsl.g:320:1: ruleZiel returns [EObject current=null] : ( ( (lv_lchars_0_0= RULE_LOWER_SEQ ) )? ( (lv_subjekt_1_0= RULE_SUBSTANTIV ) ) ( (lv_verb_2_0= RULE_INF_VERB ) ) ) ;
    public final EObject ruleZiel() throws RecognitionException {
        EObject current = null;

        Token lv_lchars_0_0=null;
        Token lv_subjekt_1_0=null;
        Token lv_verb_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:326:2: ( ( ( (lv_lchars_0_0= RULE_LOWER_SEQ ) )? ( (lv_subjekt_1_0= RULE_SUBSTANTIV ) ) ( (lv_verb_2_0= RULE_INF_VERB ) ) ) )
            // InternalMyDsl.g:327:2: ( ( (lv_lchars_0_0= RULE_LOWER_SEQ ) )? ( (lv_subjekt_1_0= RULE_SUBSTANTIV ) ) ( (lv_verb_2_0= RULE_INF_VERB ) ) )
            {
            // InternalMyDsl.g:327:2: ( ( (lv_lchars_0_0= RULE_LOWER_SEQ ) )? ( (lv_subjekt_1_0= RULE_SUBSTANTIV ) ) ( (lv_verb_2_0= RULE_INF_VERB ) ) )
            // InternalMyDsl.g:328:3: ( (lv_lchars_0_0= RULE_LOWER_SEQ ) )? ( (lv_subjekt_1_0= RULE_SUBSTANTIV ) ) ( (lv_verb_2_0= RULE_INF_VERB ) )
            {
            // InternalMyDsl.g:328:3: ( (lv_lchars_0_0= RULE_LOWER_SEQ ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LOWER_SEQ) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:329:4: (lv_lchars_0_0= RULE_LOWER_SEQ )
                    {
                    // InternalMyDsl.g:329:4: (lv_lchars_0_0= RULE_LOWER_SEQ )
                    // InternalMyDsl.g:330:5: lv_lchars_0_0= RULE_LOWER_SEQ
                    {
                    lv_lchars_0_0=(Token)match(input,RULE_LOWER_SEQ,FOLLOW_6); 

                    					newLeafNode(lv_lchars_0_0, grammarAccess.getZielAccess().getLcharsLOWER_SEQTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getZielRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"lchars",
                    						lv_lchars_0_0,
                    						"org.xtext.example.mydsl.MyDsl.LOWER_SEQ");
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:346:3: ( (lv_subjekt_1_0= RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:347:4: (lv_subjekt_1_0= RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:347:4: (lv_subjekt_1_0= RULE_SUBSTANTIV )
            // InternalMyDsl.g:348:5: lv_subjekt_1_0= RULE_SUBSTANTIV
            {
            lv_subjekt_1_0=(Token)match(input,RULE_SUBSTANTIV,FOLLOW_13); 

            					newLeafNode(lv_subjekt_1_0, grammarAccess.getZielAccess().getSubjektSUBSTANTIVTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZielRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subjekt",
            						lv_subjekt_1_0,
            						"org.xtext.example.mydsl.MyDsl.SUBSTANTIV");
            				

            }


            }

            // InternalMyDsl.g:364:3: ( (lv_verb_2_0= RULE_INF_VERB ) )
            // InternalMyDsl.g:365:4: (lv_verb_2_0= RULE_INF_VERB )
            {
            // InternalMyDsl.g:365:4: (lv_verb_2_0= RULE_INF_VERB )
            // InternalMyDsl.g:366:5: lv_verb_2_0= RULE_INF_VERB
            {
            lv_verb_2_0=(Token)match(input,RULE_INF_VERB,FOLLOW_2); 

            					newLeafNode(lv_verb_2_0, grammarAccess.getZielAccess().getVerbINF_VERBTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getZielRule());
            					}
            					setWithLastConsumed(
            						current,
            						"verb",
            						lv_verb_2_0,
            						"org.xtext.example.mydsl.MyDsl.INF_VERB");
            				

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
    // $ANTLR end "ruleZiel"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:386:1: entryRuleNutzen returns [EObject current=null] : iv_ruleNutzen= ruleNutzen EOF ;
    public final EObject entryRuleNutzen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNutzen = null;


        try {
            // InternalMyDsl.g:386:47: (iv_ruleNutzen= ruleNutzen EOF )
            // InternalMyDsl.g:387:2: iv_ruleNutzen= ruleNutzen EOF
            {
             newCompositeNode(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNutzen=ruleNutzen();

            state._fsp--;

             current =iv_ruleNutzen; 
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
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:393:1: ruleNutzen returns [EObject current=null] : ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_ZU_VERB ) ) ) ;
    public final EObject ruleNutzen() throws RecognitionException {
        EObject current = null;

        Token lv_subjekt_0_0=null;
        Token lv_verb_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:399:2: ( ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_ZU_VERB ) ) ) )
            // InternalMyDsl.g:400:2: ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_ZU_VERB ) ) )
            {
            // InternalMyDsl.g:400:2: ( ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_ZU_VERB ) ) )
            // InternalMyDsl.g:401:3: ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) ) ( (lv_verb_1_0= RULE_INF_ZU_VERB ) )
            {
            // InternalMyDsl.g:401:3: ( (lv_subjekt_0_0= RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:402:4: (lv_subjekt_0_0= RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:402:4: (lv_subjekt_0_0= RULE_SUBSTANTIV )
            // InternalMyDsl.g:403:5: lv_subjekt_0_0= RULE_SUBSTANTIV
            {
            lv_subjekt_0_0=(Token)match(input,RULE_SUBSTANTIV,FOLLOW_14); 

            					newLeafNode(lv_subjekt_0_0, grammarAccess.getNutzenAccess().getSubjektSUBSTANTIVTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNutzenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"subjekt",
            						lv_subjekt_0_0,
            						"org.xtext.example.mydsl.MyDsl.SUBSTANTIV");
            				

            }


            }

            // InternalMyDsl.g:419:3: ( (lv_verb_1_0= RULE_INF_ZU_VERB ) )
            // InternalMyDsl.g:420:4: (lv_verb_1_0= RULE_INF_ZU_VERB )
            {
            // InternalMyDsl.g:420:4: (lv_verb_1_0= RULE_INF_ZU_VERB )
            // InternalMyDsl.g:421:5: lv_verb_1_0= RULE_INF_ZU_VERB
            {
            lv_verb_1_0=(Token)match(input,RULE_INF_ZU_VERB,FOLLOW_2); 

            					newLeafNode(lv_verb_1_0, grammarAccess.getNutzenAccess().getVerbINF_ZU_VERBTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNutzenRule());
            					}
            					setWithLastConsumed(
            						current,
            						"verb",
            						lv_verb_1_0,
            						"org.xtext.example.mydsl.MyDsl.INF_ZU_VERB");
            				

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
    // $ANTLR end "ruleNutzen"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});

}
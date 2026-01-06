package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__StoriesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__StoriesAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__StoriesAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__StoriesAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Model__StoriesAssignment )*
            {
             before(grammarAccess.getModelAccess().getStoriesAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Model__StoriesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_SUBSTANTIV) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Model__StoriesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__StoriesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getStoriesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleUserStory"
    // InternalMyDsl.g:78:1: entryRuleUserStory : ruleUserStory EOF ;
    public final void entryRuleUserStory() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleUserStory EOF )
            // InternalMyDsl.g:80:1: ruleUserStory EOF
            {
             before(grammarAccess.getUserStoryRule()); 
            pushFollow(FOLLOW_1);
            ruleUserStory();

            state._fsp--;

             after(grammarAccess.getUserStoryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserStory"


    // $ANTLR start "ruleUserStory"
    // InternalMyDsl.g:87:1: ruleUserStory : ( ( rule__UserStory__Group__0 ) ) ;
    public final void ruleUserStory() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__UserStory__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__UserStory__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__UserStory__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__UserStory__Group__0 )
            {
             before(grammarAccess.getUserStoryAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__UserStory__Group__0 )
            // InternalMyDsl.g:94:4: rule__UserStory__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserStory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUserStoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserStory"


    // $ANTLR start "entryRuleTitel"
    // InternalMyDsl.g:103:1: entryRuleTitel : ruleTitel EOF ;
    public final void entryRuleTitel() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleTitel EOF )
            // InternalMyDsl.g:105:1: ruleTitel EOF
            {
             before(grammarAccess.getTitelRule()); 
            pushFollow(FOLLOW_1);
            ruleTitel();

            state._fsp--;

             after(grammarAccess.getTitelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTitel"


    // $ANTLR start "ruleTitel"
    // InternalMyDsl.g:112:1: ruleTitel : ( ( rule__Titel__Group__0 ) ) ;
    public final void ruleTitel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Titel__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Titel__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Titel__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Titel__Group__0 )
            {
             before(grammarAccess.getTitelAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Titel__Group__0 )
            // InternalMyDsl.g:119:4: rule__Titel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Titel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTitelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTitel"


    // $ANTLR start "entryRuleRolle"
    // InternalMyDsl.g:128:1: entryRuleRolle : ruleRolle EOF ;
    public final void entryRuleRolle() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRolle EOF )
            // InternalMyDsl.g:130:1: ruleRolle EOF
            {
             before(grammarAccess.getRolleRule()); 
            pushFollow(FOLLOW_1);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getRolleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRolle"


    // $ANTLR start "ruleRolle"
    // InternalMyDsl.g:137:1: ruleRolle : ( ( rule__Rolle__SubjektAssignment ) ) ;
    public final void ruleRolle() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Rolle__SubjektAssignment ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Rolle__SubjektAssignment ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Rolle__SubjektAssignment ) )
            // InternalMyDsl.g:143:3: ( rule__Rolle__SubjektAssignment )
            {
             before(grammarAccess.getRolleAccess().getSubjektAssignment()); 
            // InternalMyDsl.g:144:3: ( rule__Rolle__SubjektAssignment )
            // InternalMyDsl.g:144:4: rule__Rolle__SubjektAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Rolle__SubjektAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRolleAccess().getSubjektAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRolle"


    // $ANTLR start "entryRuleZiel"
    // InternalMyDsl.g:153:1: entryRuleZiel : ruleZiel EOF ;
    public final void entryRuleZiel() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleZiel EOF )
            // InternalMyDsl.g:155:1: ruleZiel EOF
            {
             before(grammarAccess.getZielRule()); 
            pushFollow(FOLLOW_1);
            ruleZiel();

            state._fsp--;

             after(grammarAccess.getZielRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZiel"


    // $ANTLR start "ruleZiel"
    // InternalMyDsl.g:162:1: ruleZiel : ( ( rule__Ziel__Group__0 ) ) ;
    public final void ruleZiel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Ziel__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Ziel__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Ziel__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Ziel__Group__0 )
            {
             before(grammarAccess.getZielAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Ziel__Group__0 )
            // InternalMyDsl.g:169:4: rule__Ziel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZiel"


    // $ANTLR start "entryRuleNutzen"
    // InternalMyDsl.g:178:1: entryRuleNutzen : ruleNutzen EOF ;
    public final void entryRuleNutzen() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleNutzen EOF )
            // InternalMyDsl.g:180:1: ruleNutzen EOF
            {
             before(grammarAccess.getNutzenRule()); 
            pushFollow(FOLLOW_1);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getNutzenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNutzen"


    // $ANTLR start "ruleNutzen"
    // InternalMyDsl.g:187:1: ruleNutzen : ( ( rule__Nutzen__Group__0 ) ) ;
    public final void ruleNutzen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Nutzen__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Nutzen__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Nutzen__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Nutzen__Group__0 )
            {
             before(grammarAccess.getNutzenAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Nutzen__Group__0 )
            // InternalMyDsl.g:194:4: rule__Nutzen__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNutzen"


    // $ANTLR start "rule__UserStory__Group__0"
    // InternalMyDsl.g:202:1: rule__UserStory__Group__0 : rule__UserStory__Group__0__Impl rule__UserStory__Group__1 ;
    public final void rule__UserStory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:206:1: ( rule__UserStory__Group__0__Impl rule__UserStory__Group__1 )
            // InternalMyDsl.g:207:2: rule__UserStory__Group__0__Impl rule__UserStory__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UserStory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__0"


    // $ANTLR start "rule__UserStory__Group__0__Impl"
    // InternalMyDsl.g:214:1: rule__UserStory__Group__0__Impl : ( ( rule__UserStory__TitelAssignment_0 ) ) ;
    public final void rule__UserStory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:218:1: ( ( ( rule__UserStory__TitelAssignment_0 ) ) )
            // InternalMyDsl.g:219:1: ( ( rule__UserStory__TitelAssignment_0 ) )
            {
            // InternalMyDsl.g:219:1: ( ( rule__UserStory__TitelAssignment_0 ) )
            // InternalMyDsl.g:220:2: ( rule__UserStory__TitelAssignment_0 )
            {
             before(grammarAccess.getUserStoryAccess().getTitelAssignment_0()); 
            // InternalMyDsl.g:221:2: ( rule__UserStory__TitelAssignment_0 )
            // InternalMyDsl.g:221:3: rule__UserStory__TitelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UserStory__TitelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUserStoryAccess().getTitelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__0__Impl"


    // $ANTLR start "rule__UserStory__Group__1"
    // InternalMyDsl.g:229:1: rule__UserStory__Group__1 : rule__UserStory__Group__1__Impl rule__UserStory__Group__2 ;
    public final void rule__UserStory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:233:1: ( rule__UserStory__Group__1__Impl rule__UserStory__Group__2 )
            // InternalMyDsl.g:234:2: rule__UserStory__Group__1__Impl rule__UserStory__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UserStory__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__1"


    // $ANTLR start "rule__UserStory__Group__1__Impl"
    // InternalMyDsl.g:241:1: rule__UserStory__Group__1__Impl : ( ':' ) ;
    public final void rule__UserStory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:245:1: ( ( ':' ) )
            // InternalMyDsl.g:246:1: ( ':' )
            {
            // InternalMyDsl.g:246:1: ( ':' )
            // InternalMyDsl.g:247:2: ':'
            {
             before(grammarAccess.getUserStoryAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getUserStoryAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__1__Impl"


    // $ANTLR start "rule__UserStory__Group__2"
    // InternalMyDsl.g:256:1: rule__UserStory__Group__2 : rule__UserStory__Group__2__Impl rule__UserStory__Group__3 ;
    public final void rule__UserStory__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:260:1: ( rule__UserStory__Group__2__Impl rule__UserStory__Group__3 )
            // InternalMyDsl.g:261:2: rule__UserStory__Group__2__Impl rule__UserStory__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__UserStory__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__2"


    // $ANTLR start "rule__UserStory__Group__2__Impl"
    // InternalMyDsl.g:268:1: rule__UserStory__Group__2__Impl : ( 'Als' ) ;
    public final void rule__UserStory__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:272:1: ( ( 'Als' ) )
            // InternalMyDsl.g:273:1: ( 'Als' )
            {
            // InternalMyDsl.g:273:1: ( 'Als' )
            // InternalMyDsl.g:274:2: 'Als'
            {
             before(grammarAccess.getUserStoryAccess().getAlsKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUserStoryAccess().getAlsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__2__Impl"


    // $ANTLR start "rule__UserStory__Group__3"
    // InternalMyDsl.g:283:1: rule__UserStory__Group__3 : rule__UserStory__Group__3__Impl rule__UserStory__Group__4 ;
    public final void rule__UserStory__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:287:1: ( rule__UserStory__Group__3__Impl rule__UserStory__Group__4 )
            // InternalMyDsl.g:288:2: rule__UserStory__Group__3__Impl rule__UserStory__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__UserStory__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__3"


    // $ANTLR start "rule__UserStory__Group__3__Impl"
    // InternalMyDsl.g:295:1: rule__UserStory__Group__3__Impl : ( ( rule__UserStory__RolleAssignment_3 ) ) ;
    public final void rule__UserStory__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:299:1: ( ( ( rule__UserStory__RolleAssignment_3 ) ) )
            // InternalMyDsl.g:300:1: ( ( rule__UserStory__RolleAssignment_3 ) )
            {
            // InternalMyDsl.g:300:1: ( ( rule__UserStory__RolleAssignment_3 ) )
            // InternalMyDsl.g:301:2: ( rule__UserStory__RolleAssignment_3 )
            {
             before(grammarAccess.getUserStoryAccess().getRolleAssignment_3()); 
            // InternalMyDsl.g:302:2: ( rule__UserStory__RolleAssignment_3 )
            // InternalMyDsl.g:302:3: rule__UserStory__RolleAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UserStory__RolleAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUserStoryAccess().getRolleAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__3__Impl"


    // $ANTLR start "rule__UserStory__Group__4"
    // InternalMyDsl.g:310:1: rule__UserStory__Group__4 : rule__UserStory__Group__4__Impl rule__UserStory__Group__5 ;
    public final void rule__UserStory__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:314:1: ( rule__UserStory__Group__4__Impl rule__UserStory__Group__5 )
            // InternalMyDsl.g:315:2: rule__UserStory__Group__4__Impl rule__UserStory__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__UserStory__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__4"


    // $ANTLR start "rule__UserStory__Group__4__Impl"
    // InternalMyDsl.g:322:1: rule__UserStory__Group__4__Impl : ( 'm\\u00F6chte' ) ;
    public final void rule__UserStory__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:326:1: ( ( 'm\\u00F6chte' ) )
            // InternalMyDsl.g:327:1: ( 'm\\u00F6chte' )
            {
            // InternalMyDsl.g:327:1: ( 'm\\u00F6chte' )
            // InternalMyDsl.g:328:2: 'm\\u00F6chte'
            {
             before(grammarAccess.getUserStoryAccess().getMöchteKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUserStoryAccess().getMöchteKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__4__Impl"


    // $ANTLR start "rule__UserStory__Group__5"
    // InternalMyDsl.g:337:1: rule__UserStory__Group__5 : rule__UserStory__Group__5__Impl rule__UserStory__Group__6 ;
    public final void rule__UserStory__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:1: ( rule__UserStory__Group__5__Impl rule__UserStory__Group__6 )
            // InternalMyDsl.g:342:2: rule__UserStory__Group__5__Impl rule__UserStory__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__UserStory__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__5"


    // $ANTLR start "rule__UserStory__Group__5__Impl"
    // InternalMyDsl.g:349:1: rule__UserStory__Group__5__Impl : ( 'ich' ) ;
    public final void rule__UserStory__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:353:1: ( ( 'ich' ) )
            // InternalMyDsl.g:354:1: ( 'ich' )
            {
            // InternalMyDsl.g:354:1: ( 'ich' )
            // InternalMyDsl.g:355:2: 'ich'
            {
             before(grammarAccess.getUserStoryAccess().getIchKeyword_5()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUserStoryAccess().getIchKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__5__Impl"


    // $ANTLR start "rule__UserStory__Group__6"
    // InternalMyDsl.g:364:1: rule__UserStory__Group__6 : rule__UserStory__Group__6__Impl rule__UserStory__Group__7 ;
    public final void rule__UserStory__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:368:1: ( rule__UserStory__Group__6__Impl rule__UserStory__Group__7 )
            // InternalMyDsl.g:369:2: rule__UserStory__Group__6__Impl rule__UserStory__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__UserStory__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__6"


    // $ANTLR start "rule__UserStory__Group__6__Impl"
    // InternalMyDsl.g:376:1: rule__UserStory__Group__6__Impl : ( ( rule__UserStory__ZielAssignment_6 ) ) ;
    public final void rule__UserStory__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:380:1: ( ( ( rule__UserStory__ZielAssignment_6 ) ) )
            // InternalMyDsl.g:381:1: ( ( rule__UserStory__ZielAssignment_6 ) )
            {
            // InternalMyDsl.g:381:1: ( ( rule__UserStory__ZielAssignment_6 ) )
            // InternalMyDsl.g:382:2: ( rule__UserStory__ZielAssignment_6 )
            {
             before(grammarAccess.getUserStoryAccess().getZielAssignment_6()); 
            // InternalMyDsl.g:383:2: ( rule__UserStory__ZielAssignment_6 )
            // InternalMyDsl.g:383:3: rule__UserStory__ZielAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__UserStory__ZielAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getUserStoryAccess().getZielAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__6__Impl"


    // $ANTLR start "rule__UserStory__Group__7"
    // InternalMyDsl.g:391:1: rule__UserStory__Group__7 : rule__UserStory__Group__7__Impl rule__UserStory__Group__8 ;
    public final void rule__UserStory__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:395:1: ( rule__UserStory__Group__7__Impl rule__UserStory__Group__8 )
            // InternalMyDsl.g:396:2: rule__UserStory__Group__7__Impl rule__UserStory__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__UserStory__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__7"


    // $ANTLR start "rule__UserStory__Group__7__Impl"
    // InternalMyDsl.g:403:1: rule__UserStory__Group__7__Impl : ( ',' ) ;
    public final void rule__UserStory__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( ',' ) )
            // InternalMyDsl.g:408:1: ( ',' )
            {
            // InternalMyDsl.g:408:1: ( ',' )
            // InternalMyDsl.g:409:2: ','
            {
             before(grammarAccess.getUserStoryAccess().getCommaKeyword_7()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getUserStoryAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__7__Impl"


    // $ANTLR start "rule__UserStory__Group__8"
    // InternalMyDsl.g:418:1: rule__UserStory__Group__8 : rule__UserStory__Group__8__Impl rule__UserStory__Group__9 ;
    public final void rule__UserStory__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:422:1: ( rule__UserStory__Group__8__Impl rule__UserStory__Group__9 )
            // InternalMyDsl.g:423:2: rule__UserStory__Group__8__Impl rule__UserStory__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__UserStory__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__8"


    // $ANTLR start "rule__UserStory__Group__8__Impl"
    // InternalMyDsl.g:430:1: rule__UserStory__Group__8__Impl : ( 'um' ) ;
    public final void rule__UserStory__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( 'um' ) )
            // InternalMyDsl.g:435:1: ( 'um' )
            {
            // InternalMyDsl.g:435:1: ( 'um' )
            // InternalMyDsl.g:436:2: 'um'
            {
             before(grammarAccess.getUserStoryAccess().getUmKeyword_8()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getUserStoryAccess().getUmKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__8__Impl"


    // $ANTLR start "rule__UserStory__Group__9"
    // InternalMyDsl.g:445:1: rule__UserStory__Group__9 : rule__UserStory__Group__9__Impl rule__UserStory__Group__10 ;
    public final void rule__UserStory__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:449:1: ( rule__UserStory__Group__9__Impl rule__UserStory__Group__10 )
            // InternalMyDsl.g:450:2: rule__UserStory__Group__9__Impl rule__UserStory__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__UserStory__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UserStory__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__9"


    // $ANTLR start "rule__UserStory__Group__9__Impl"
    // InternalMyDsl.g:457:1: rule__UserStory__Group__9__Impl : ( ( rule__UserStory__NutzenAssignment_9 ) ) ;
    public final void rule__UserStory__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:461:1: ( ( ( rule__UserStory__NutzenAssignment_9 ) ) )
            // InternalMyDsl.g:462:1: ( ( rule__UserStory__NutzenAssignment_9 ) )
            {
            // InternalMyDsl.g:462:1: ( ( rule__UserStory__NutzenAssignment_9 ) )
            // InternalMyDsl.g:463:2: ( rule__UserStory__NutzenAssignment_9 )
            {
             before(grammarAccess.getUserStoryAccess().getNutzenAssignment_9()); 
            // InternalMyDsl.g:464:2: ( rule__UserStory__NutzenAssignment_9 )
            // InternalMyDsl.g:464:3: rule__UserStory__NutzenAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__UserStory__NutzenAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getUserStoryAccess().getNutzenAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__9__Impl"


    // $ANTLR start "rule__UserStory__Group__10"
    // InternalMyDsl.g:472:1: rule__UserStory__Group__10 : rule__UserStory__Group__10__Impl ;
    public final void rule__UserStory__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:476:1: ( rule__UserStory__Group__10__Impl )
            // InternalMyDsl.g:477:2: rule__UserStory__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserStory__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__10"


    // $ANTLR start "rule__UserStory__Group__10__Impl"
    // InternalMyDsl.g:483:1: rule__UserStory__Group__10__Impl : ( '.' ) ;
    public final void rule__UserStory__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:487:1: ( ( '.' ) )
            // InternalMyDsl.g:488:1: ( '.' )
            {
            // InternalMyDsl.g:488:1: ( '.' )
            // InternalMyDsl.g:489:2: '.'
            {
             before(grammarAccess.getUserStoryAccess().getFullStopKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getUserStoryAccess().getFullStopKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__Group__10__Impl"


    // $ANTLR start "rule__Titel__Group__0"
    // InternalMyDsl.g:499:1: rule__Titel__Group__0 : rule__Titel__Group__0__Impl rule__Titel__Group__1 ;
    public final void rule__Titel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:503:1: ( rule__Titel__Group__0__Impl rule__Titel__Group__1 )
            // InternalMyDsl.g:504:2: rule__Titel__Group__0__Impl rule__Titel__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Titel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Titel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__0"


    // $ANTLR start "rule__Titel__Group__0__Impl"
    // InternalMyDsl.g:511:1: rule__Titel__Group__0__Impl : ( ( rule__Titel__SubjektAssignment_0 ) ) ;
    public final void rule__Titel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( ( rule__Titel__SubjektAssignment_0 ) ) )
            // InternalMyDsl.g:516:1: ( ( rule__Titel__SubjektAssignment_0 ) )
            {
            // InternalMyDsl.g:516:1: ( ( rule__Titel__SubjektAssignment_0 ) )
            // InternalMyDsl.g:517:2: ( rule__Titel__SubjektAssignment_0 )
            {
             before(grammarAccess.getTitelAccess().getSubjektAssignment_0()); 
            // InternalMyDsl.g:518:2: ( rule__Titel__SubjektAssignment_0 )
            // InternalMyDsl.g:518:3: rule__Titel__SubjektAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Titel__SubjektAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTitelAccess().getSubjektAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__0__Impl"


    // $ANTLR start "rule__Titel__Group__1"
    // InternalMyDsl.g:526:1: rule__Titel__Group__1 : rule__Titel__Group__1__Impl ;
    public final void rule__Titel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:530:1: ( rule__Titel__Group__1__Impl )
            // InternalMyDsl.g:531:2: rule__Titel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Titel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__1"


    // $ANTLR start "rule__Titel__Group__1__Impl"
    // InternalMyDsl.g:537:1: rule__Titel__Group__1__Impl : ( ( rule__Titel__VerbAssignment_1 ) ) ;
    public final void rule__Titel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( ( rule__Titel__VerbAssignment_1 ) ) )
            // InternalMyDsl.g:542:1: ( ( rule__Titel__VerbAssignment_1 ) )
            {
            // InternalMyDsl.g:542:1: ( ( rule__Titel__VerbAssignment_1 ) )
            // InternalMyDsl.g:543:2: ( rule__Titel__VerbAssignment_1 )
            {
             before(grammarAccess.getTitelAccess().getVerbAssignment_1()); 
            // InternalMyDsl.g:544:2: ( rule__Titel__VerbAssignment_1 )
            // InternalMyDsl.g:544:3: rule__Titel__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Titel__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTitelAccess().getVerbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__Group__1__Impl"


    // $ANTLR start "rule__Ziel__Group__0"
    // InternalMyDsl.g:553:1: rule__Ziel__Group__0 : rule__Ziel__Group__0__Impl rule__Ziel__Group__1 ;
    public final void rule__Ziel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:557:1: ( rule__Ziel__Group__0__Impl rule__Ziel__Group__1 )
            // InternalMyDsl.g:558:2: rule__Ziel__Group__0__Impl rule__Ziel__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Ziel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ziel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__0"


    // $ANTLR start "rule__Ziel__Group__0__Impl"
    // InternalMyDsl.g:565:1: rule__Ziel__Group__0__Impl : ( ( rule__Ziel__LcharsAssignment_0 )? ) ;
    public final void rule__Ziel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:569:1: ( ( ( rule__Ziel__LcharsAssignment_0 )? ) )
            // InternalMyDsl.g:570:1: ( ( rule__Ziel__LcharsAssignment_0 )? )
            {
            // InternalMyDsl.g:570:1: ( ( rule__Ziel__LcharsAssignment_0 )? )
            // InternalMyDsl.g:571:2: ( rule__Ziel__LcharsAssignment_0 )?
            {
             before(grammarAccess.getZielAccess().getLcharsAssignment_0()); 
            // InternalMyDsl.g:572:2: ( rule__Ziel__LcharsAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_LOWER_SEQ) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:572:3: rule__Ziel__LcharsAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Ziel__LcharsAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getZielAccess().getLcharsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__0__Impl"


    // $ANTLR start "rule__Ziel__Group__1"
    // InternalMyDsl.g:580:1: rule__Ziel__Group__1 : rule__Ziel__Group__1__Impl rule__Ziel__Group__2 ;
    public final void rule__Ziel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( rule__Ziel__Group__1__Impl rule__Ziel__Group__2 )
            // InternalMyDsl.g:585:2: rule__Ziel__Group__1__Impl rule__Ziel__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Ziel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ziel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__1"


    // $ANTLR start "rule__Ziel__Group__1__Impl"
    // InternalMyDsl.g:592:1: rule__Ziel__Group__1__Impl : ( ( rule__Ziel__SubjektAssignment_1 ) ) ;
    public final void rule__Ziel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( ( rule__Ziel__SubjektAssignment_1 ) ) )
            // InternalMyDsl.g:597:1: ( ( rule__Ziel__SubjektAssignment_1 ) )
            {
            // InternalMyDsl.g:597:1: ( ( rule__Ziel__SubjektAssignment_1 ) )
            // InternalMyDsl.g:598:2: ( rule__Ziel__SubjektAssignment_1 )
            {
             before(grammarAccess.getZielAccess().getSubjektAssignment_1()); 
            // InternalMyDsl.g:599:2: ( rule__Ziel__SubjektAssignment_1 )
            // InternalMyDsl.g:599:3: rule__Ziel__SubjektAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__SubjektAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getSubjektAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__1__Impl"


    // $ANTLR start "rule__Ziel__Group__2"
    // InternalMyDsl.g:607:1: rule__Ziel__Group__2 : rule__Ziel__Group__2__Impl ;
    public final void rule__Ziel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:611:1: ( rule__Ziel__Group__2__Impl )
            // InternalMyDsl.g:612:2: rule__Ziel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__2"


    // $ANTLR start "rule__Ziel__Group__2__Impl"
    // InternalMyDsl.g:618:1: rule__Ziel__Group__2__Impl : ( ( rule__Ziel__VerbAssignment_2 ) ) ;
    public final void rule__Ziel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:622:1: ( ( ( rule__Ziel__VerbAssignment_2 ) ) )
            // InternalMyDsl.g:623:1: ( ( rule__Ziel__VerbAssignment_2 ) )
            {
            // InternalMyDsl.g:623:1: ( ( rule__Ziel__VerbAssignment_2 ) )
            // InternalMyDsl.g:624:2: ( rule__Ziel__VerbAssignment_2 )
            {
             before(grammarAccess.getZielAccess().getVerbAssignment_2()); 
            // InternalMyDsl.g:625:2: ( rule__Ziel__VerbAssignment_2 )
            // InternalMyDsl.g:625:3: rule__Ziel__VerbAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ziel__VerbAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getZielAccess().getVerbAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__Group__2__Impl"


    // $ANTLR start "rule__Nutzen__Group__0"
    // InternalMyDsl.g:634:1: rule__Nutzen__Group__0 : rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 ;
    public final void rule__Nutzen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:638:1: ( rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1 )
            // InternalMyDsl.g:639:2: rule__Nutzen__Group__0__Impl rule__Nutzen__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Nutzen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0"


    // $ANTLR start "rule__Nutzen__Group__0__Impl"
    // InternalMyDsl.g:646:1: rule__Nutzen__Group__0__Impl : ( ( rule__Nutzen__SubjektAssignment_0 ) ) ;
    public final void rule__Nutzen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:650:1: ( ( ( rule__Nutzen__SubjektAssignment_0 ) ) )
            // InternalMyDsl.g:651:1: ( ( rule__Nutzen__SubjektAssignment_0 ) )
            {
            // InternalMyDsl.g:651:1: ( ( rule__Nutzen__SubjektAssignment_0 ) )
            // InternalMyDsl.g:652:2: ( rule__Nutzen__SubjektAssignment_0 )
            {
             before(grammarAccess.getNutzenAccess().getSubjektAssignment_0()); 
            // InternalMyDsl.g:653:2: ( rule__Nutzen__SubjektAssignment_0 )
            // InternalMyDsl.g:653:3: rule__Nutzen__SubjektAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__SubjektAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getSubjektAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__0__Impl"


    // $ANTLR start "rule__Nutzen__Group__1"
    // InternalMyDsl.g:661:1: rule__Nutzen__Group__1 : rule__Nutzen__Group__1__Impl ;
    public final void rule__Nutzen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:665:1: ( rule__Nutzen__Group__1__Impl )
            // InternalMyDsl.g:666:2: rule__Nutzen__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1"


    // $ANTLR start "rule__Nutzen__Group__1__Impl"
    // InternalMyDsl.g:672:1: rule__Nutzen__Group__1__Impl : ( ( rule__Nutzen__VerbAssignment_1 ) ) ;
    public final void rule__Nutzen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( ( ( rule__Nutzen__VerbAssignment_1 ) ) )
            // InternalMyDsl.g:677:1: ( ( rule__Nutzen__VerbAssignment_1 ) )
            {
            // InternalMyDsl.g:677:1: ( ( rule__Nutzen__VerbAssignment_1 ) )
            // InternalMyDsl.g:678:2: ( rule__Nutzen__VerbAssignment_1 )
            {
             before(grammarAccess.getNutzenAccess().getVerbAssignment_1()); 
            // InternalMyDsl.g:679:2: ( rule__Nutzen__VerbAssignment_1 )
            // InternalMyDsl.g:679:3: rule__Nutzen__VerbAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Nutzen__VerbAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNutzenAccess().getVerbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__Group__1__Impl"


    // $ANTLR start "rule__Model__StoriesAssignment"
    // InternalMyDsl.g:688:1: rule__Model__StoriesAssignment : ( ruleUserStory ) ;
    public final void rule__Model__StoriesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:692:1: ( ( ruleUserStory ) )
            // InternalMyDsl.g:693:2: ( ruleUserStory )
            {
            // InternalMyDsl.g:693:2: ( ruleUserStory )
            // InternalMyDsl.g:694:3: ruleUserStory
            {
             before(grammarAccess.getModelAccess().getStoriesUserStoryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUserStory();

            state._fsp--;

             after(grammarAccess.getModelAccess().getStoriesUserStoryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__StoriesAssignment"


    // $ANTLR start "rule__UserStory__TitelAssignment_0"
    // InternalMyDsl.g:703:1: rule__UserStory__TitelAssignment_0 : ( ruleTitel ) ;
    public final void rule__UserStory__TitelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( ( ruleTitel ) )
            // InternalMyDsl.g:708:2: ( ruleTitel )
            {
            // InternalMyDsl.g:708:2: ( ruleTitel )
            // InternalMyDsl.g:709:3: ruleTitel
            {
             before(grammarAccess.getUserStoryAccess().getTitelTitelParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTitel();

            state._fsp--;

             after(grammarAccess.getUserStoryAccess().getTitelTitelParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__TitelAssignment_0"


    // $ANTLR start "rule__UserStory__RolleAssignment_3"
    // InternalMyDsl.g:718:1: rule__UserStory__RolleAssignment_3 : ( ruleRolle ) ;
    public final void rule__UserStory__RolleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( ( ruleRolle ) )
            // InternalMyDsl.g:723:2: ( ruleRolle )
            {
            // InternalMyDsl.g:723:2: ( ruleRolle )
            // InternalMyDsl.g:724:3: ruleRolle
            {
             before(grammarAccess.getUserStoryAccess().getRolleRolleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRolle();

            state._fsp--;

             after(grammarAccess.getUserStoryAccess().getRolleRolleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__RolleAssignment_3"


    // $ANTLR start "rule__UserStory__ZielAssignment_6"
    // InternalMyDsl.g:733:1: rule__UserStory__ZielAssignment_6 : ( ruleZiel ) ;
    public final void rule__UserStory__ZielAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:737:1: ( ( ruleZiel ) )
            // InternalMyDsl.g:738:2: ( ruleZiel )
            {
            // InternalMyDsl.g:738:2: ( ruleZiel )
            // InternalMyDsl.g:739:3: ruleZiel
            {
             before(grammarAccess.getUserStoryAccess().getZielZielParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleZiel();

            state._fsp--;

             after(grammarAccess.getUserStoryAccess().getZielZielParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__ZielAssignment_6"


    // $ANTLR start "rule__UserStory__NutzenAssignment_9"
    // InternalMyDsl.g:748:1: rule__UserStory__NutzenAssignment_9 : ( ruleNutzen ) ;
    public final void rule__UserStory__NutzenAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( ( ruleNutzen ) )
            // InternalMyDsl.g:753:2: ( ruleNutzen )
            {
            // InternalMyDsl.g:753:2: ( ruleNutzen )
            // InternalMyDsl.g:754:3: ruleNutzen
            {
             before(grammarAccess.getUserStoryAccess().getNutzenNutzenParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleNutzen();

            state._fsp--;

             after(grammarAccess.getUserStoryAccess().getNutzenNutzenParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserStory__NutzenAssignment_9"


    // $ANTLR start "rule__Titel__SubjektAssignment_0"
    // InternalMyDsl.g:763:1: rule__Titel__SubjektAssignment_0 : ( RULE_SUBSTANTIV ) ;
    public final void rule__Titel__SubjektAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:768:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:768:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:769:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getTitelAccess().getSubjektSUBSTANTIVTerminalRuleCall_0_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getTitelAccess().getSubjektSUBSTANTIVTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__SubjektAssignment_0"


    // $ANTLR start "rule__Titel__VerbAssignment_1"
    // InternalMyDsl.g:778:1: rule__Titel__VerbAssignment_1 : ( RULE_INF_VERB ) ;
    public final void rule__Titel__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( ( RULE_INF_VERB ) )
            // InternalMyDsl.g:783:2: ( RULE_INF_VERB )
            {
            // InternalMyDsl.g:783:2: ( RULE_INF_VERB )
            // InternalMyDsl.g:784:3: RULE_INF_VERB
            {
             before(grammarAccess.getTitelAccess().getVerbINF_VERBTerminalRuleCall_1_0()); 
            match(input,RULE_INF_VERB,FOLLOW_2); 
             after(grammarAccess.getTitelAccess().getVerbINF_VERBTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Titel__VerbAssignment_1"


    // $ANTLR start "rule__Rolle__SubjektAssignment"
    // InternalMyDsl.g:793:1: rule__Rolle__SubjektAssignment : ( RULE_SUBSTANTIV ) ;
    public final void rule__Rolle__SubjektAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:797:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:798:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:798:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:799:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getRolleAccess().getSubjektSUBSTANTIVTerminalRuleCall_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getRolleAccess().getSubjektSUBSTANTIVTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rolle__SubjektAssignment"


    // $ANTLR start "rule__Ziel__LcharsAssignment_0"
    // InternalMyDsl.g:808:1: rule__Ziel__LcharsAssignment_0 : ( RULE_LOWER_SEQ ) ;
    public final void rule__Ziel__LcharsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( RULE_LOWER_SEQ ) )
            // InternalMyDsl.g:813:2: ( RULE_LOWER_SEQ )
            {
            // InternalMyDsl.g:813:2: ( RULE_LOWER_SEQ )
            // InternalMyDsl.g:814:3: RULE_LOWER_SEQ
            {
             before(grammarAccess.getZielAccess().getLcharsLOWER_SEQTerminalRuleCall_0_0()); 
            match(input,RULE_LOWER_SEQ,FOLLOW_2); 
             after(grammarAccess.getZielAccess().getLcharsLOWER_SEQTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__LcharsAssignment_0"


    // $ANTLR start "rule__Ziel__SubjektAssignment_1"
    // InternalMyDsl.g:823:1: rule__Ziel__SubjektAssignment_1 : ( RULE_SUBSTANTIV ) ;
    public final void rule__Ziel__SubjektAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:828:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:828:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:829:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getZielAccess().getSubjektSUBSTANTIVTerminalRuleCall_1_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getZielAccess().getSubjektSUBSTANTIVTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__SubjektAssignment_1"


    // $ANTLR start "rule__Ziel__VerbAssignment_2"
    // InternalMyDsl.g:838:1: rule__Ziel__VerbAssignment_2 : ( RULE_INF_VERB ) ;
    public final void rule__Ziel__VerbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:842:1: ( ( RULE_INF_VERB ) )
            // InternalMyDsl.g:843:2: ( RULE_INF_VERB )
            {
            // InternalMyDsl.g:843:2: ( RULE_INF_VERB )
            // InternalMyDsl.g:844:3: RULE_INF_VERB
            {
             before(grammarAccess.getZielAccess().getVerbINF_VERBTerminalRuleCall_2_0()); 
            match(input,RULE_INF_VERB,FOLLOW_2); 
             after(grammarAccess.getZielAccess().getVerbINF_VERBTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ziel__VerbAssignment_2"


    // $ANTLR start "rule__Nutzen__SubjektAssignment_0"
    // InternalMyDsl.g:853:1: rule__Nutzen__SubjektAssignment_0 : ( RULE_SUBSTANTIV ) ;
    public final void rule__Nutzen__SubjektAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:857:1: ( ( RULE_SUBSTANTIV ) )
            // InternalMyDsl.g:858:2: ( RULE_SUBSTANTIV )
            {
            // InternalMyDsl.g:858:2: ( RULE_SUBSTANTIV )
            // InternalMyDsl.g:859:3: RULE_SUBSTANTIV
            {
             before(grammarAccess.getNutzenAccess().getSubjektSUBSTANTIVTerminalRuleCall_0_0()); 
            match(input,RULE_SUBSTANTIV,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getSubjektSUBSTANTIVTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__SubjektAssignment_0"


    // $ANTLR start "rule__Nutzen__VerbAssignment_1"
    // InternalMyDsl.g:868:1: rule__Nutzen__VerbAssignment_1 : ( RULE_INF_ZU_VERB ) ;
    public final void rule__Nutzen__VerbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( RULE_INF_ZU_VERB ) )
            // InternalMyDsl.g:873:2: ( RULE_INF_ZU_VERB )
            {
            // InternalMyDsl.g:873:2: ( RULE_INF_ZU_VERB )
            // InternalMyDsl.g:874:3: RULE_INF_ZU_VERB
            {
             before(grammarAccess.getNutzenAccess().getVerbINF_ZU_VERBTerminalRuleCall_1_0()); 
            match(input,RULE_INF_ZU_VERB,FOLLOW_2); 
             after(grammarAccess.getNutzenAccess().getVerbINF_ZU_VERBTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nutzen__VerbAssignment_1"

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
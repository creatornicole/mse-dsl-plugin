package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslLexer extends Lexer {
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

    public InternalMyDslLexer() {;} 
    public InternalMyDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:11:7: ( ':' )
            // InternalMyDsl.g:11:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:12:7: ( 'Als' )
            // InternalMyDsl.g:12:9: 'Als'
            {
            match("Als"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:13:7: ( 'm\\u00F6chte' )
            // InternalMyDsl.g:13:9: 'm\\u00F6chte'
            {
            match("m\u00F6chte"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:14:7: ( 'ich' )
            // InternalMyDsl.g:14:9: 'ich'
            {
            match("ich"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:15:7: ( ',' )
            // InternalMyDsl.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:16:7: ( 'um' )
            // InternalMyDsl.g:16:9: 'um'
            {
            match("um"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:17:7: ( '.' )
            // InternalMyDsl.g:17:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_LOWER"
    public final void mRULE_LOWER() throws RecognitionException {
        try {
            // InternalMyDsl.g:440:21: ( ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )
            // InternalMyDsl.g:440:23: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER"

    // $ANTLR start "RULE_LOWER_NO_Z"
    public final void mRULE_LOWER_NO_Z() throws RecognitionException {
        try {
            // InternalMyDsl.g:442:26: ( ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' ) )
            // InternalMyDsl.g:442:28: ( 'a' .. 'y' | '\\u00E4' | '\\u00F6' | '\\u00FC' )
            {
            if ( (input.LA(1)>='a' && input.LA(1)<='y')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER_NO_Z"

    // $ANTLR start "RULE_LOWER_NO_ZU"
    public final void mRULE_LOWER_NO_ZU() throws RecognitionException {
        try {
            // InternalMyDsl.g:444:27: ( ( RULE_LOWER_NO_Z | 'z' ~ ( 'u' ) ) )
            // InternalMyDsl.g:444:29: ( RULE_LOWER_NO_Z | 'z' ~ ( 'u' ) )
            {
            // InternalMyDsl.g:444:29: ( RULE_LOWER_NO_Z | 'z' ~ ( 'u' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='a' && LA1_0<='y')||LA1_0=='\u00E4'||LA1_0=='\u00F6'||LA1_0=='\u00FC') ) {
                alt1=1;
            }
            else if ( (LA1_0=='z') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:444:30: RULE_LOWER_NO_Z
                    {
                    mRULE_LOWER_NO_Z(); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:444:46: 'z' ~ ( 'u' )
                    {
                    match('z'); 
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='t')||(input.LA(1)>='v' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER_NO_ZU"

    // $ANTLR start "RULE_INF_ZU_VERB"
    public final void mRULE_INF_ZU_VERB() throws RecognitionException {
        try {
            int _type = RULE_INF_ZU_VERB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:446:18: ( ( RULE_LOWER_NO_ZU )* 'zuzu' ( RULE_LOWER_NO_ZU )* RULE_GERMAN_VERBS_ENDING )
            // InternalMyDsl.g:446:20: ( RULE_LOWER_NO_ZU )* 'zuzu' ( RULE_LOWER_NO_ZU )* RULE_GERMAN_VERBS_ENDING
            {
            // InternalMyDsl.g:446:20: ( RULE_LOWER_NO_ZU )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='z') ) {
                    int LA2_1 = input.LA(2);

                    if ( ((LA2_1>='\u0000' && LA2_1<='t')||(LA2_1>='v' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='a' && LA2_0<='y')||LA2_0=='\u00E4'||LA2_0=='\u00F6'||LA2_0=='\u00FC') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:446:20: RULE_LOWER_NO_ZU
            	    {
            	    mRULE_LOWER_NO_ZU(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("zuzu"); 

            // InternalMyDsl.g:446:45: ( RULE_LOWER_NO_ZU )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='e') ) {
                    switch ( input.LA(2) ) {
                    case 'n':
                        {
                        int LA3_3 = input.LA(3);

                        if ( ((LA3_3>='a' && LA3_3<='z')||LA3_3=='\u00E4'||LA3_3=='\u00F6'||LA3_3=='\u00FC') ) {
                            alt3=1;
                        }


                        }
                        break;
                    case 'r':
                        {
                        int LA3_4 = input.LA(3);

                        if ( (LA3_4=='n') ) {
                            int LA3_7 = input.LA(4);

                            if ( ((LA3_7>='a' && LA3_7<='z')||LA3_7=='\u00E4'||LA3_7=='\u00F6'||LA3_7=='\u00FC') ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_4>='a' && LA3_4<='m')||(LA3_4>='o' && LA3_4<='z')||LA3_4=='\u00E4'||LA3_4=='\u00F6'||LA3_4=='\u00FC') ) {
                            alt3=1;
                        }


                        }
                        break;
                    case 'l':
                        {
                        int LA3_5 = input.LA(3);

                        if ( (LA3_5=='n') ) {
                            int LA3_8 = input.LA(4);

                            if ( ((LA3_8>='a' && LA3_8<='z')||LA3_8=='\u00E4'||LA3_8=='\u00F6'||LA3_8=='\u00FC') ) {
                                alt3=1;
                            }


                        }
                        else if ( ((LA3_5>='a' && LA3_5<='m')||(LA3_5>='o' && LA3_5<='z')||LA3_5=='\u00E4'||LA3_5=='\u00F6'||LA3_5=='\u00FC') ) {
                            alt3=1;
                        }


                        }
                        break;
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '\u00E4':
                    case '\u00F6':
                    case '\u00FC':
                        {
                        alt3=1;
                        }
                        break;

                    }

                }
                else if ( ((LA3_0>='a' && LA3_0<='d')||(LA3_0>='f' && LA3_0<='z')||LA3_0=='\u00E4'||LA3_0=='\u00F6'||LA3_0=='\u00FC') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:446:45: RULE_LOWER_NO_ZU
            	    {
            	    mRULE_LOWER_NO_ZU(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mRULE_GERMAN_VERBS_ENDING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INF_ZU_VERB"

    // $ANTLR start "RULE_INF_VERB"
    public final void mRULE_INF_VERB() throws RecognitionException {
        try {
            int _type = RULE_INF_VERB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:448:15: ( ( RULE_LOWER )+ RULE_GERMAN_VERBS_ENDING )
            // InternalMyDsl.g:448:17: ( RULE_LOWER )+ RULE_GERMAN_VERBS_ENDING
            {
            // InternalMyDsl.g:448:17: ( RULE_LOWER )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='e') ) {
                    switch ( input.LA(2) ) {
                    case 'n':
                        {
                        int LA4_3 = input.LA(3);

                        if ( ((LA4_3>='a' && LA4_3<='z')||LA4_3=='\u00E4'||LA4_3=='\u00F6'||LA4_3=='\u00FC') ) {
                            alt4=1;
                        }


                        }
                        break;
                    case 'r':
                        {
                        int LA4_4 = input.LA(3);

                        if ( (LA4_4=='n') ) {
                            int LA4_7 = input.LA(4);

                            if ( ((LA4_7>='a' && LA4_7<='z')||LA4_7=='\u00E4'||LA4_7=='\u00F6'||LA4_7=='\u00FC') ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_4>='a' && LA4_4<='m')||(LA4_4>='o' && LA4_4<='z')||LA4_4=='\u00E4'||LA4_4=='\u00F6'||LA4_4=='\u00FC') ) {
                            alt4=1;
                        }


                        }
                        break;
                    case 'l':
                        {
                        int LA4_5 = input.LA(3);

                        if ( (LA4_5=='n') ) {
                            int LA4_8 = input.LA(4);

                            if ( ((LA4_8>='a' && LA4_8<='z')||LA4_8=='\u00E4'||LA4_8=='\u00F6'||LA4_8=='\u00FC') ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_5>='a' && LA4_5<='m')||(LA4_5>='o' && LA4_5<='z')||LA4_5=='\u00E4'||LA4_5=='\u00F6'||LA4_5=='\u00FC') ) {
                            alt4=1;
                        }


                        }
                        break;
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'm':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '\u00E4':
                    case '\u00F6':
                    case '\u00FC':
                        {
                        alt4=1;
                        }
                        break;

                    }

                }
                else if ( ((LA4_0>='a' && LA4_0<='d')||(LA4_0>='f' && LA4_0<='z')||LA4_0=='\u00E4'||LA4_0=='\u00F6'||LA4_0=='\u00FC') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:448:17: RULE_LOWER
            	    {
            	    mRULE_LOWER(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            mRULE_GERMAN_VERBS_ENDING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INF_VERB"

    // $ANTLR start "RULE_SUBSTANTIV"
    public final void mRULE_SUBSTANTIV() throws RecognitionException {
        try {
            int _type = RULE_SUBSTANTIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:450:17: ( ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )* )
            // InternalMyDsl.g:450:19: ( 'A' .. 'Z' | '\\u00C4' | '\\u00D6' | '\\u00DC' ) ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\u00C4'||input.LA(1)=='\u00D6'||input.LA(1)=='\u00DC' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:450:57: ( 'a' .. 'z' | '\\u00E4' | '\\u00F6' | '\\u00FC' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='a' && LA5_0<='z')||LA5_0=='\u00E4'||LA5_0=='\u00F6'||LA5_0=='\u00FC') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00E4'||input.LA(1)=='\u00F6'||input.LA(1)=='\u00FC' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SUBSTANTIV"

    // $ANTLR start "RULE_GERMAN_VERBS_ENDING"
    public final void mRULE_GERMAN_VERBS_ENDING() throws RecognitionException {
        try {
            // InternalMyDsl.g:452:35: ( ( 'en' | 'ern' | 'eln' ) )
            // InternalMyDsl.g:452:37: ( 'en' | 'ern' | 'eln' )
            {
            // InternalMyDsl.g:452:37: ( 'en' | 'ern' | 'eln' )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='e') ) {
                switch ( input.LA(2) ) {
                case 'n':
                    {
                    alt6=1;
                    }
                    break;
                case 'r':
                    {
                    alt6=2;
                    }
                    break;
                case 'l':
                    {
                    alt6=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:452:38: 'en'
                    {
                    match("en"); 


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:452:43: 'ern'
                    {
                    match("ern"); 


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:452:49: 'eln'
                    {
                    match("eln"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_GERMAN_VERBS_ENDING"

    // $ANTLR start "RULE_LOWER_SEQ"
    public final void mRULE_LOWER_SEQ() throws RecognitionException {
        try {
            int _type = RULE_LOWER_SEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:454:16: ( ( RULE_LOWER )+ )
            // InternalMyDsl.g:454:18: ( RULE_LOWER )+
            {
            // InternalMyDsl.g:454:18: ( RULE_LOWER )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='a' && LA7_0<='z')||LA7_0=='\u00E4'||LA7_0=='\u00F6'||LA7_0=='\u00FC') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:454:18: RULE_LOWER
            	    {
            	    mRULE_LOWER(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER_SEQ"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:456:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyDsl.g:456:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyDsl.g:456:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:456:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyDsl.g:456:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:458:10: ( ( '0' .. '9' )+ )
            // InternalMyDsl.g:458:12: ( '0' .. '9' )+
            {
            // InternalMyDsl.g:458:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:458:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:460:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyDsl.g:460:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyDsl.g:460:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:460:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyDsl.g:460:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:460:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:460:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:460:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyDsl.g:460:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:460:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyDsl.g:460:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:462:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyDsl.g:462:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyDsl.g:462:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:462:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:464:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyDsl.g:464:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyDsl.g:464:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:464:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalMyDsl.g:464:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:464:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyDsl.g:464:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:464:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:466:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyDsl.g:466:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyDsl.g:466:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyDsl.g:468:16: ( . )
            // InternalMyDsl.g:468:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyDsl.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_INF_ZU_VERB | RULE_INF_VERB | RULE_SUBSTANTIV | RULE_LOWER_SEQ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=18;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalMyDsl.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // InternalMyDsl.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // InternalMyDsl.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // InternalMyDsl.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // InternalMyDsl.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // InternalMyDsl.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // InternalMyDsl.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // InternalMyDsl.g:1:52: RULE_INF_ZU_VERB
                {
                mRULE_INF_ZU_VERB(); 

                }
                break;
            case 9 :
                // InternalMyDsl.g:1:69: RULE_INF_VERB
                {
                mRULE_INF_VERB(); 

                }
                break;
            case 10 :
                // InternalMyDsl.g:1:83: RULE_SUBSTANTIV
                {
                mRULE_SUBSTANTIV(); 

                }
                break;
            case 11 :
                // InternalMyDsl.g:1:99: RULE_LOWER_SEQ
                {
                mRULE_LOWER_SEQ(); 

                }
                break;
            case 12 :
                // InternalMyDsl.g:1:114: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 13 :
                // InternalMyDsl.g:1:122: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 14 :
                // InternalMyDsl.g:1:131: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 15 :
                // InternalMyDsl.g:1:143: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 16 :
                // InternalMyDsl.g:1:159: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 17 :
                // InternalMyDsl.g:1:175: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 18 :
                // InternalMyDsl.g:1:183: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\2\uffff\1\30\2\33\1\uffff\1\33\1\uffff\2\33\1\30\1\24\1\33\3\uffff\3\24\3\uffff\2\30\2\uffff\1\33\1\uffff\5\33\1\uffff\1\67\1\uffff\3\33\1\31\1\33\1\uffff\2\33\5\uffff\1\103\1\33\1\105\2\33\1\110\1\uffff\4\33\2\31\2\33\1\105\2\33\1\uffff\1\33\1\uffff\2\105\1\uffff\1\33\1\105\3\33\1\31\1\33\2\105\5\33\3\105\2\33\1\31\1\33\1\153\1\51\4\33\1\31\3\33\2\105\1\31\1\uffff\2\51\1\105\2\33\3\31\1\51\3\33\2\105\1\51\2\31\2\51\1\105\2\33\2\51\2\105";
    static final String DFA19_eofS =
        "\u0086\uffff";
    static final String DFA19_minS =
        "\1\0\1\uffff\3\60\1\uffff\1\60\1\uffff\1\60\1\0\1\60\1\101\1\141\3\uffff\2\0\1\52\3\uffff\2\60\2\uffff\1\141\1\uffff\1\0\2\60\1\141\1\60\1\uffff\1\60\1\uffff\3\60\2\141\1\uffff\1\0\1\141\5\uffff\1\60\1\141\4\60\1\uffff\3\60\1\141\1\0\6\141\1\uffff\1\141\1\uffff\2\60\1\uffff\4\60\1\141\1\172\4\141\2\60\1\0\1\141\2\60\3\141\1\165\2\141\5\60\3\141\1\0\3\141\1\uffff\5\60\2\141\1\0\4\141\3\60\7\141\2\60\2\141";
    static final String DFA19_maxS =
        "\1\uffff\1\uffff\1\172\2\u00fc\1\uffff\1\u00fc\1\uffff\1\u00fc\1\uffff\2\172\1\u00fc\3\uffff\2\uffff\1\57\3\uffff\2\172\2\uffff\1\u00fc\1\uffff\1\uffff\4\u00fc\1\uffff\1\u00fc\1\uffff\5\u00fc\1\uffff\1\uffff\1\u00fc\5\uffff\6\u00fc\1\uffff\4\u00fc\1\uffff\6\u00fc\1\uffff\1\u00fc\1\uffff\2\u00fc\1\uffff\5\u00fc\1\172\6\u00fc\1\uffff\6\u00fc\1\165\12\u00fc\1\uffff\3\u00fc\1\uffff\7\u00fc\1\uffff\6\u00fc\1\172\7\u00fc\2\172\2\u00fc";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\3\uffff\1\5\1\uffff\1\7\5\uffff\1\12\1\14\1\15\3\uffff\1\21\1\22\1\1\2\uffff\1\12\1\14\1\uffff\1\13\5\uffff\1\5\1\uffff\1\7\5\uffff\1\10\2\uffff\1\15\1\16\1\17\1\20\1\21\6\uffff\1\6\13\uffff\1\2\1\uffff\1\11\2\uffff\1\4\42\uffff\1\3\32\uffff";
    static final String DFA19_specialS =
        "\1\4\10\uffff\1\5\6\uffff\1\1\1\11\12\uffff\1\0\15\uffff\1\6\21\uffff\1\3\30\uffff\1\7\21\uffff\1\2\13\uffff\1\10\22\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\24\2\23\2\24\1\23\22\24\1\23\1\24\1\20\4\24\1\21\4\24\1\5\1\24\1\7\1\22\12\17\1\1\6\24\1\2\31\12\3\24\1\13\1\16\1\24\10\10\1\4\3\10\1\3\7\10\1\6\4\10\1\11\111\24\1\15\21\24\1\15\5\24\1\15\7\24\1\14\21\24\1\14\5\24\1\14\uff03\24",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\13\27\1\26\16\27",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\32\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\2\36\1\40\1\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\7\36\1\42\14\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\60\51\12\47\7\51\32\47\4\51\1\47\1\51\4\46\1\44\17\46\1\45\5\46\151\51\1\50\21\51\1\50\5\51\1\50\uff03\51",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\27",
            "\32\31\4\uffff\1\31\1\uffff\32\31",
            "\4\37\1\53\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "",
            "",
            "\0\55",
            "\0\55",
            "\1\56\4\uffff\1\57",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\22\27\1\61\7\27",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\27",
            "",
            "",
            "\2\37\1\62\1\37\1\53\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\60\51\12\47\7\51\32\47\4\51\1\47\1\51\4\46\1\44\17\46\1\45\5\46\151\51\1\50\21\51\1\50\5\51\1\50\uff03\51",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\6\36\1\65\1\36\1\63\3\36\1\64\7\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\4\37\1\53\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\2\36\1\66\21\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\6\36\1\65\1\36\1\63\3\36\1\64\7\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\24\72\1\70\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\31\75\1\74\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "\4\37\1\53\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\141\51\4\50\1\77\17\50\1\76\5\50\151\51\1\50\21\51\1\50\5\51\1\50\uff03\51",
            "\4\37\1\53\6\37\1\102\1\37\1\100\3\37\1\101\7\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\27\151\uffff\1\30\21\uffff\1\30\5\uffff\1\30",
            "\4\37\1\53\2\37\1\104\21\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\10\36\1\106\13\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\10\36\1\107\13\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\17\72\1\111\5\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\6\72\1\114\1\72\1\112\3\72\1\113\10\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\25\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\73\1\115\25\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\60\51\12\47\7\51\32\47\4\51\1\47\1\51\24\47\1\116\5\47\uff85\51",
            "\31\75\1\74\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "\4\73\1\115\24\73\1\117\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\37\1\53\6\37\1\102\1\37\1\100\3\37\1\101\7\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\4\37\1\53\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\4\37\1\53\10\37\1\120\13\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\4\37\1\53\10\37\1\121\13\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\4\37\1\53\16\37\1\122\5\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\36\1\35\24\36\1\34\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\25\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\10\72\1\127\14\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\10\72\1\130\14\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\73\1\115\6\73\1\133\1\73\1\131\3\73\1\132\10\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\1\134",
            "\4\73\1\115\17\73\1\135\5\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\37\1\53\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\4\37\1\53\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\4\37\1\136\24\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\6\124\1\141\1\124\1\137\3\124\1\140\7\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\60\51\12\144\7\51\32\144\4\51\1\144\1\51\4\143\1\142\17\143\1\72\5\143\151\51\1\145\21\51\1\145\5\51\1\145\uff03\51",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\25\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\72\1\71\25\72\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\73\1\115\25\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\73\1\115\10\73\1\150\14\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\73\1\115\10\73\1\151\14\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\1\152",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\37\1\53\6\37\1\102\1\37\1\100\3\37\1\101\7\37\1\52\151\uffff\1\37\21\uffff\1\37\5\uffff\1\37",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\10\124\1\154\13\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\10\124\1\155\13\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\6\124\1\160\1\124\1\156\3\124\1\157\7\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\162\1\161\24\162\1\163\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\6\126\1\166\1\126\1\164\3\126\1\165\7\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\141\51\4\145\1\167\17\145\1\73\5\145\151\51\1\145\21\51\1\145\5\51\1\145\uff03\51",
            "\4\73\1\115\25\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\73\1\115\25\73\151\uffff\1\73\21\uffff\1\73\5\uffff\1\73",
            "\4\162\1\161\24\162\1\163\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\10\124\1\170\13\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\10\124\1\171\13\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\162\1\161\6\162\1\174\1\162\1\172\3\162\1\173\7\162\1\163\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "\4\162\1\161\24\162\1\163\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "\60\51\12\144\7\51\32\144\4\51\1\144\1\51\24\144\1\uffff\5\144\uff85\51",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\10\126\1\175\13\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\10\126\1\176\13\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\6\126\1\u0081\1\126\1\177\3\126\1\u0080\7\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\124\1\123\24\124\1\125\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\162\1\161\24\162\1\163",
            "\4\162\1\161\10\162\1\u0082\13\162\1\163\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "\4\162\1\161\10\162\1\u0083\13\162\1\163\151\uffff\1\51\21\uffff\1\51\5\uffff\1\51",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\10\126\1\u0084\13\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\10\126\1\u0085\13\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\162\1\161\24\162\1\163",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\162\1\161\24\162\1\163",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126",
            "\4\126\1\146\24\126\1\147\151\uffff\1\126\21\uffff\1\126\5\uffff\1\126"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_INF_ZU_VERB | RULE_INF_VERB | RULE_SUBSTANTIV | RULE_LOWER_SEQ | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_28 = input.LA(1);

                        s = -1;
                        if ( (LA19_28=='u') ) {s = 37;}

                        else if ( (LA19_28=='e') ) {s = 36;}

                        else if ( ((LA19_28>='a' && LA19_28<='d')||(LA19_28>='f' && LA19_28<='t')||(LA19_28>='v' && LA19_28<='z')) ) {s = 38;}

                        else if ( ((LA19_28>='0' && LA19_28<='9')||(LA19_28>='A' && LA19_28<='Z')||LA19_28=='_') ) {s = 39;}

                        else if ( (LA19_28=='\u00E4'||LA19_28=='\u00F6'||LA19_28=='\u00FC') ) {s = 40;}

                        else if ( ((LA19_28>='\u0000' && LA19_28<='/')||(LA19_28>=':' && LA19_28<='@')||(LA19_28>='[' && LA19_28<='^')||LA19_28=='`'||(LA19_28>='{' && LA19_28<='\u00E3')||(LA19_28>='\u00E5' && LA19_28<='\u00F5')||(LA19_28>='\u00F7' && LA19_28<='\u00FB')||(LA19_28>='\u00FD' && LA19_28<='\uFFFF')) ) {s = 41;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_16 = input.LA(1);

                        s = -1;
                        if ( ((LA19_16>='\u0000' && LA19_16<='\uFFFF')) ) {s = 45;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_103 = input.LA(1);

                        s = -1;
                        if ( (LA19_103=='e') ) {s = 119;}

                        else if ( ((LA19_103>='a' && LA19_103<='d')||(LA19_103>='f' && LA19_103<='t')||(LA19_103>='v' && LA19_103<='z')||LA19_103=='\u00E4'||LA19_103=='\u00F6'||LA19_103=='\u00FC') ) {s = 101;}

                        else if ( ((LA19_103>='\u0000' && LA19_103<='`')||(LA19_103>='{' && LA19_103<='\u00E3')||(LA19_103>='\u00E5' && LA19_103<='\u00F5')||(LA19_103>='\u00F7' && LA19_103<='\u00FB')||(LA19_103>='\u00FD' && LA19_103<='\uFFFF')) ) {s = 41;}

                        else if ( (LA19_103=='u') ) {s = 59;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_60 = input.LA(1);

                        s = -1;
                        if ( (LA19_60=='u') ) {s = 78;}

                        else if ( ((LA19_60>='0' && LA19_60<='9')||(LA19_60>='A' && LA19_60<='Z')||LA19_60=='_'||(LA19_60>='a' && LA19_60<='t')||(LA19_60>='v' && LA19_60<='z')) ) {s = 39;}

                        else if ( ((LA19_60>='\u0000' && LA19_60<='/')||(LA19_60>=':' && LA19_60<='@')||(LA19_60>='[' && LA19_60<='^')||LA19_60=='`'||(LA19_60>='{' && LA19_60<='\uFFFF')) ) {s = 41;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0==':') ) {s = 1;}

                        else if ( (LA19_0=='A') ) {s = 2;}

                        else if ( (LA19_0=='m') ) {s = 3;}

                        else if ( (LA19_0=='i') ) {s = 4;}

                        else if ( (LA19_0==',') ) {s = 5;}

                        else if ( (LA19_0=='u') ) {s = 6;}

                        else if ( (LA19_0=='.') ) {s = 7;}

                        else if ( ((LA19_0>='a' && LA19_0<='h')||(LA19_0>='j' && LA19_0<='l')||(LA19_0>='n' && LA19_0<='t')||(LA19_0>='v' && LA19_0<='y')) ) {s = 8;}

                        else if ( (LA19_0=='z') ) {s = 9;}

                        else if ( ((LA19_0>='B' && LA19_0<='Z')) ) {s = 10;}

                        else if ( (LA19_0=='^') ) {s = 11;}

                        else if ( (LA19_0=='\u00E4'||LA19_0=='\u00F6'||LA19_0=='\u00FC') ) {s = 12;}

                        else if ( (LA19_0=='\u00C4'||LA19_0=='\u00D6'||LA19_0=='\u00DC') ) {s = 13;}

                        else if ( (LA19_0=='_') ) {s = 14;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 15;}

                        else if ( (LA19_0=='\"') ) {s = 16;}

                        else if ( (LA19_0=='\'') ) {s = 17;}

                        else if ( (LA19_0=='/') ) {s = 18;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 19;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='#' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='+')||LA19_0=='-'||(LA19_0>=';' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||(LA19_0>='{' && LA19_0<='\u00C3')||(LA19_0>='\u00C5' && LA19_0<='\u00D5')||(LA19_0>='\u00D7' && LA19_0<='\u00DB')||(LA19_0>='\u00DD' && LA19_0<='\u00E3')||(LA19_0>='\u00E5' && LA19_0<='\u00F5')||(LA19_0>='\u00F7' && LA19_0<='\u00FB')||(LA19_0>='\u00FD' && LA19_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_9 = input.LA(1);

                        s = -1;
                        if ( (LA19_9=='e') ) {s = 36;}

                        else if ( (LA19_9=='u') ) {s = 37;}

                        else if ( ((LA19_9>='a' && LA19_9<='d')||(LA19_9>='f' && LA19_9<='t')||(LA19_9>='v' && LA19_9<='z')) ) {s = 38;}

                        else if ( ((LA19_9>='0' && LA19_9<='9')||(LA19_9>='A' && LA19_9<='Z')||LA19_9=='_') ) {s = 39;}

                        else if ( (LA19_9=='\u00E4'||LA19_9=='\u00F6'||LA19_9=='\u00FC') ) {s = 40;}

                        else if ( ((LA19_9>='\u0000' && LA19_9<='/')||(LA19_9>=':' && LA19_9<='@')||(LA19_9>='[' && LA19_9<='^')||LA19_9=='`'||(LA19_9>='{' && LA19_9<='\u00E3')||(LA19_9>='\u00E5' && LA19_9<='\u00F5')||(LA19_9>='\u00F7' && LA19_9<='\u00FB')||(LA19_9>='\u00FD' && LA19_9<='\uFFFF')) ) {s = 41;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA19_42 = input.LA(1);

                        s = -1;
                        if ( (LA19_42=='u') ) {s = 62;}

                        else if ( (LA19_42=='e') ) {s = 63;}

                        else if ( ((LA19_42>='a' && LA19_42<='d')||(LA19_42>='f' && LA19_42<='t')||(LA19_42>='v' && LA19_42<='z')||LA19_42=='\u00E4'||LA19_42=='\u00F6'||LA19_42=='\u00FC') ) {s = 40;}

                        else if ( ((LA19_42>='\u0000' && LA19_42<='`')||(LA19_42>='{' && LA19_42<='\u00E3')||(LA19_42>='\u00E5' && LA19_42<='\u00F5')||(LA19_42>='\u00F7' && LA19_42<='\u00FB')||(LA19_42>='\u00FD' && LA19_42<='\uFFFF')) ) {s = 41;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA19_85 = input.LA(1);

                        s = -1;
                        if ( (LA19_85=='e') ) {s = 98;}

                        else if ( ((LA19_85>='a' && LA19_85<='d')||(LA19_85>='f' && LA19_85<='t')||(LA19_85>='v' && LA19_85<='z')) ) {s = 99;}

                        else if ( ((LA19_85>='0' && LA19_85<='9')||(LA19_85>='A' && LA19_85<='Z')||LA19_85=='_') ) {s = 100;}

                        else if ( (LA19_85=='u') ) {s = 58;}

                        else if ( (LA19_85=='\u00E4'||LA19_85=='\u00F6'||LA19_85=='\u00FC') ) {s = 101;}

                        else if ( ((LA19_85>='\u0000' && LA19_85<='/')||(LA19_85>=':' && LA19_85<='@')||(LA19_85>='[' && LA19_85<='^')||LA19_85=='`'||(LA19_85>='{' && LA19_85<='\u00E3')||(LA19_85>='\u00E5' && LA19_85<='\u00F5')||(LA19_85>='\u00F7' && LA19_85<='\u00FB')||(LA19_85>='\u00FD' && LA19_85<='\uFFFF')) ) {s = 41;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA19_115 = input.LA(1);

                        s = -1;
                        if ( ((LA19_115>='0' && LA19_115<='9')||(LA19_115>='A' && LA19_115<='Z')||LA19_115=='_'||(LA19_115>='a' && LA19_115<='t')||(LA19_115>='v' && LA19_115<='z')) ) {s = 100;}

                        else if ( ((LA19_115>='\u0000' && LA19_115<='/')||(LA19_115>=':' && LA19_115<='@')||(LA19_115>='[' && LA19_115<='^')||LA19_115=='`'||(LA19_115>='{' && LA19_115<='\uFFFF')) ) {s = 41;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA19_17 = input.LA(1);

                        s = -1;
                        if ( ((LA19_17>='\u0000' && LA19_17<='\uFFFF')) ) {s = 45;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
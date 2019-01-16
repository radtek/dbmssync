// $ANTLR 3.0.1 /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g 2019-01-16 13:06:34
package com.blackntan.dbmssync.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TLexer extends Lexer {
    public static final int T7=7;
    public static final int T8=8;
    public static final int T9=9;
    public static final int INT=5;
    public static final int T10=10;
    public static final int T11=11;
    public static final int ID=4;
    public static final int WS=6;
    public static final int EOF=-1;
    public static final int Tokens=12;
    public TLexer() {;} 
    public TLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g"; }

    // $ANTLR start T7
    public final void mT7() throws RecognitionException {
        try {
            int _type = T7;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:8:4: ( 'int' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:8:6: 'int'
            {
            match("int"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T7

    // $ANTLR start T8
    public final void mT8() throws RecognitionException {
        try {
            int _type = T8;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:9:4: ( '=' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:9:6: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T8

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:10:4: ( ';' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:10:6: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T9

    // $ANTLR start T10
    public final void mT10() throws RecognitionException {
        try {
            int _type = T10;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:11:5: ( 'public' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:11:7: 'public'
            {
            match("public"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T10

    // $ANTLR start T11
    public final void mT11() throws RecognitionException {
        try {
            int _type = T11;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:12:5: ( 'static' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:12:7: 'static'
            {
            match("static"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:21:2: ( ( '0' .. '9' )+ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:21:4: ( '0' .. '9' )+
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:21:4: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:21:4: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end INT

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:25:2: ( ( 'a' .. 'z' )+ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:25:4: ( 'a' .. 'z' )+
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:25:4: ( 'a' .. 'z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:25:4: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

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


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start WS
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:29:2: ( ( ' ' | '\\r' | '\\n' )+ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:29:4: ( ' ' | '\\r' | '\\n' )+
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:29:4: ( ' ' | '\\r' | '\\n' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\n'||LA3_0=='\r'||LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
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

            channel = HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    public void mTokens() throws RecognitionException {
        // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:8: ( T7 | T8 | T9 | T10 | T11 | INT | ID | WS )
        int alt4=8;
        switch ( input.LA(1) ) {
        case 'i':
            {
            int LA4_1 = input.LA(2);

            if ( (LA4_1=='n') ) {
                int LA4_9 = input.LA(3);

                if ( (LA4_9=='t') ) {
                    int LA4_12 = input.LA(4);

                    if ( ((LA4_12>='a' && LA4_12<='z')) ) {
                        alt4=7;
                    }
                    else {
                        alt4=1;}
                }
                else {
                    alt4=7;}
            }
            else {
                alt4=7;}
            }
            break;
        case '=':
            {
            alt4=2;
            }
            break;
        case ';':
            {
            alt4=3;
            }
            break;
        case 'p':
            {
            int LA4_4 = input.LA(2);

            if ( (LA4_4=='u') ) {
                int LA4_10 = input.LA(3);

                if ( (LA4_10=='b') ) {
                    int LA4_13 = input.LA(4);

                    if ( (LA4_13=='l') ) {
                        int LA4_16 = input.LA(5);

                        if ( (LA4_16=='i') ) {
                            int LA4_18 = input.LA(6);

                            if ( (LA4_18=='c') ) {
                                int LA4_20 = input.LA(7);

                                if ( ((LA4_20>='a' && LA4_20<='z')) ) {
                                    alt4=7;
                                }
                                else {
                                    alt4=4;}
                            }
                            else {
                                alt4=7;}
                        }
                        else {
                            alt4=7;}
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
            }
            else {
                alt4=7;}
            }
            break;
        case 's':
            {
            int LA4_5 = input.LA(2);

            if ( (LA4_5=='t') ) {
                int LA4_11 = input.LA(3);

                if ( (LA4_11=='a') ) {
                    int LA4_14 = input.LA(4);

                    if ( (LA4_14=='t') ) {
                        int LA4_17 = input.LA(5);

                        if ( (LA4_17=='i') ) {
                            int LA4_19 = input.LA(6);

                            if ( (LA4_19=='c') ) {
                                int LA4_21 = input.LA(7);

                                if ( ((LA4_21>='a' && LA4_21<='z')) ) {
                                    alt4=7;
                                }
                                else {
                                    alt4=5;}
                            }
                            else {
                                alt4=7;}
                        }
                        else {
                            alt4=7;}
                    }
                    else {
                        alt4=7;}
                }
                else {
                    alt4=7;}
            }
            else {
                alt4=7;}
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=6;
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
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'q':
        case 'r':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt4=7;
            }
            break;
        case '\n':
        case '\r':
        case ' ':
            {
            alt4=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T7 | T8 | T9 | T10 | T11 | INT | ID | WS );", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:10: T7
                {
                mT7(); 

                }
                break;
            case 2 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:13: T8
                {
                mT8(); 

                }
                break;
            case 3 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:16: T9
                {
                mT9(); 

                }
                break;
            case 4 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:19: T10
                {
                mT10(); 

                }
                break;
            case 5 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:23: T11
                {
                mT11(); 

                }
                break;
            case 6 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:27: INT
                {
                mINT(); 

                }
                break;
            case 7 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:31: ID
                {
                mID(); 

                }
                break;
            case 8 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g:1:34: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}
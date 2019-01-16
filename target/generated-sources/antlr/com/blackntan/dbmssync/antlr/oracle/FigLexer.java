// $ANTLR 3.0.1 /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g 2019-01-16 13:06:34

package com.blackntan.dbmssync.antlr;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FigLexer extends Lexer {
    public static final int T9=9;
    public static final int CMT=8;
    public static final int INT=6;
    public static final int T10=10;
    public static final int T12=12;
    public static final int T11=11;
    public static final int T14=14;
    public static final int T13=13;
    public static final int T16=16;
    public static final int STRING=5;
    public static final int T15=15;
    public static final int ID=4;
    public static final int T17=17;
    public static final int WS=7;
    public static final int EOF=-1;
    public static final int Tokens=18;
    public FigLexer() {;} 
    public FigLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g"; }

    // $ANTLR start T9
    public final void mT9() throws RecognitionException {
        try {
            int _type = T9;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:9:4: ( '{' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:9:6: '{'
            {
            match('{'); 

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
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:10:5: ( '}' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:10:7: '}'
            {
            match('}'); 

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
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:11:5: ( '=' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:11:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T11

    // $ANTLR start T12
    public final void mT12() throws RecognitionException {
        try {
            int _type = T12;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:12:5: ( ';' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:12:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T12

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:13:5: ( '$' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:13:7: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:14:5: ( '[' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:14:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:15:5: ( ']' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:15:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:16:5: ( ',' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:16:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:17:5: ( '.' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:17:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start STRING
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:56:8: ( '\"' ( . )* '\"' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:56:10: '\"' ( . )* '\"'
            {
            match('\"'); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:56:14: ( . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\"') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:56:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 
            setText(getText().substring(1, getText().length()-1));

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end STRING

    // $ANTLR start INT
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:57:5: ( ( '0' .. '9' )+ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:57:9: ( '0' .. '9' )+
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:57:9: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:57:9: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
    // $ANTLR end INT

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:58:5: ( ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:58:9: ( '_' | 'a' .. 'z' | 'A' .. 'Z' ) ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:58:33: ( '_' | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            	    break loop3;
                }
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
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:59:5: ( ( ' ' | '\\n' | '\\t' )+ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:59:9: ( ' ' | '\\n' | '\\t' )+
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:59:9: ( ' ' | '\\n' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)==' ' ) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WS

    // $ANTLR start CMT
    public final void mCMT() throws RecognitionException {
        try {
            int _type = CMT;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:60:5: ( '/*' ( . )* '*/' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:60:9: '/*' ( . )* '*/'
            {
            match("/*"); 

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:60:14: ( . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='.')||(LA5_1>='0' && LA5_1<='\uFFFE')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<=')')||(LA5_0>='+' && LA5_0<='\uFFFE')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:60:14: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CMT

    public void mTokens() throws RecognitionException {
        // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:8: ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | STRING | INT | ID | WS | CMT )
        int alt6=14;
        switch ( input.LA(1) ) {
        case '{':
            {
            alt6=1;
            }
            break;
        case '}':
            {
            alt6=2;
            }
            break;
        case '=':
            {
            alt6=3;
            }
            break;
        case ';':
            {
            alt6=4;
            }
            break;
        case '$':
            {
            alt6=5;
            }
            break;
        case '[':
            {
            alt6=6;
            }
            break;
        case ']':
            {
            alt6=7;
            }
            break;
        case ',':
            {
            alt6=8;
            }
            break;
        case '.':
            {
            alt6=9;
            }
            break;
        case '\"':
            {
            alt6=10;
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
            alt6=11;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
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
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=12;
            }
            break;
        case '\t':
        case '\n':
        case ' ':
            {
            alt6=13;
            }
            break;
        case '/':
            {
            alt6=14;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T9 | T10 | T11 | T12 | T13 | T14 | T15 | T16 | T17 | STRING | INT | ID | WS | CMT );", 6, 0, input);

            throw nvae;
        }

        switch (alt6) {
            case 1 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:10: T9
                {
                mT9(); 

                }
                break;
            case 2 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:13: T10
                {
                mT10(); 

                }
                break;
            case 3 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:17: T11
                {
                mT11(); 

                }
                break;
            case 4 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:21: T12
                {
                mT12(); 

                }
                break;
            case 5 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:25: T13
                {
                mT13(); 

                }
                break;
            case 6 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:29: T14
                {
                mT14(); 

                }
                break;
            case 7 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:33: T15
                {
                mT15(); 

                }
                break;
            case 8 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:37: T16
                {
                mT16(); 

                }
                break;
            case 9 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:41: T17
                {
                mT17(); 

                }
                break;
            case 10 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:45: STRING
                {
                mSTRING(); 

                }
                break;
            case 11 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:52: INT
                {
                mINT(); 

                }
                break;
            case 12 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:56: ID
                {
                mID(); 

                }
                break;
            case 13 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:59: WS
                {
                mWS(); 

                }
                break;
            case 14 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:1:62: CMT
                {
                mCMT(); 

                }
                break;

        }

    }


 

}
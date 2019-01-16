// $ANTLR 3.0.1 /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g 2019-01-16 13:06:34

package com.blackntan.dbmssync.antlr;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class FigParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "STRING", "INT", "WS", "CMT", "'{'", "'}'", "'='", "';'", "'$'", "'['", "']'", "','", "'.'"
    };
    public static final int CMT=8;
    public static final int INT=6;
    public static final int STRING=5;
    public static final int ID=4;
    public static final int WS=7;
    public static final int EOF=-1;

        public FigParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g"; }


    Map instances = new HashMap();



    // $ANTLR start file
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:21:1: file returns [List objects] : ( object )+ ;
    public final List file() throws RecognitionException {
        List objects = null;

        Object object1 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:22:5: ( ( object )+ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:22:9: ( object )+
            {
            objects = new ArrayList();
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:23:9: ( object )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:23:10: object
            	    {
            	    pushFollow(FOLLOW_object_in_file55);
            	    object1=object();
            	    _fsp--;

            	    objects.add(object1);

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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return objects;
    }
    // $ANTLR end file


    // $ANTLR start object
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:26:1: object returns [Object o] : qid (v= ID )? '{' ( assign[$o] )* '}' ;
    public final Object object() throws RecognitionException {
        Object o = null;

        Token v=null;
        qid_return qid2 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:27:5: ( qid (v= ID )? '{' ( assign[$o] )* '}' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:27:9: qid (v= ID )? '{' ( assign[$o] )* '}'
            {
            pushFollow(FOLLOW_qid_in_object82);
            qid2=qid();
            _fsp--;

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:27:14: (v= ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:27:14: v= ID
                    {
                    v=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_object86); 

                    }
                    break;

            }


                    o = RunFig.newInstance(input.toString(qid2.start,qid2.stop));
                    if ( v!=null ) {
                        instances.put(v.getText(), o);
                    }
                    
            match(input,9,FOLLOW_9_in_object107); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:34:13: ( assign[$o] )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:34:13: assign[$o]
            	    {
            	    pushFollow(FOLLOW_assign_in_object109);
            	    assign(o);
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,10,FOLLOW_10_in_object113); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return o;
    }
    // $ANTLR end object


    // $ANTLR start assign
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:37:1: assign[Object o] : ID '=' expr ';' ;
    public final void assign(Object o) throws RecognitionException {
        Token ID3=null;
        Object expr4 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:38:5: ( ID '=' expr ';' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:38:9: ID '=' expr ';'
            {
            ID3=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_assign137); 
            match(input,11,FOLLOW_11_in_assign139); 
            pushFollow(FOLLOW_expr_in_assign141);
            expr4=expr();
            _fsp--;

            match(input,12,FOLLOW_12_in_assign143); 
            RunFig.setObjectProperty(o,ID3.getText(),expr4);

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
    // $ANTLR end assign


    // $ANTLR start expr
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:41:1: expr returns [Object value] : ( STRING | INT | '$' ID | '[' ']' | '[' e= expr ( ',' e= expr )* ']' );
    public final Object expr() throws RecognitionException {
        Object value = null;

        Token STRING5=null;
        Token INT6=null;
        Token ID7=null;
        Object e = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:42:5: ( STRING | INT | '$' ID | '[' ']' | '[' e= expr ( ',' e= expr )* ']' )
            int alt5=5;
            switch ( input.LA(1) ) {
            case STRING:
                {
                alt5=1;
                }
                break;
            case INT:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                int LA5_4 = input.LA(2);

                if ( (LA5_4==15) ) {
                    alt5=4;
                }
                else if ( ((LA5_4>=STRING && LA5_4<=INT)||(LA5_4>=13 && LA5_4<=14)) ) {
                    alt5=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("41:1: expr returns [Object value] : ( STRING | INT | '$' ID | '[' ']' | '[' e= expr ( ',' e= expr )* ']' );", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("41:1: expr returns [Object value] : ( STRING | INT | '$' ID | '[' ']' | '[' e= expr ( ',' e= expr )* ']' );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:42:9: STRING
                    {
                    STRING5=(Token)input.LT(1);
                    match(input,STRING,FOLLOW_STRING_in_expr172); 
                    value = STRING5.getText();

                    }
                    break;
                case 2 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:43:9: INT
                    {
                    INT6=(Token)input.LT(1);
                    match(input,INT,FOLLOW_INT_in_expr185); 
                    value = Integer.valueOf(INT6.getText());

                    }
                    break;
                case 3 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:44:9: '$' ID
                    {
                    match(input,13,FOLLOW_13_in_expr198); 
                    ID7=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_expr200); 
                    value = instances.get(ID7.getText());

                    }
                    break;
                case 4 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:45:9: '[' ']'
                    {
                    match(input,14,FOLLOW_14_in_expr213); 
                    match(input,15,FOLLOW_15_in_expr215); 
                    value = new ArrayList();

                    }
                    break;
                case 5 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:46:9: '[' e= expr ( ',' e= expr )* ']'
                    {
                    ArrayList elements = new ArrayList();
                    match(input,14,FOLLOW_14_in_expr237); 
                    pushFollow(FOLLOW_expr_in_expr241);
                    e=expr();
                    _fsp--;

                    elements.add(e);
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:48:13: ( ',' e= expr )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==16) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:48:14: ',' e= expr
                    	    {
                    	    match(input,16,FOLLOW_16_in_expr258); 
                    	    pushFollow(FOLLOW_expr_in_expr262);
                    	    e=expr();
                    	    _fsp--;

                    	    elements.add(e);

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match(input,15,FOLLOW_15_in_expr276); 
                    value = elements;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end expr

    public static class qid_return extends ParserRuleReturnScope {
    };

    // $ANTLR start qid
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:53:1: qid : ID ( '.' ID )* ;
    public final qid_return qid() throws RecognitionException {
        qid_return retval = new qid_return();
        retval.start = input.LT(1);

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:53:5: ( ID ( '.' ID )* )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:53:9: ID ( '.' ID )*
            {
            match(input,ID,FOLLOW_ID_in_qid305); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:53:12: ( '.' ID )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g:53:13: '.' ID
            	    {
            	    match(input,17,FOLLOW_17_in_qid308); 
            	    match(input,ID,FOLLOW_ID_in_qid310); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end qid


 

    public static final BitSet FOLLOW_object_in_file55 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_qid_in_object82 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ID_in_object86 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_object107 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_assign_in_object109 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_10_in_object113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign137 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_assign139 = new BitSet(new long[]{0x0000000000006060L});
    public static final BitSet FOLLOW_expr_in_assign141 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_assign143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_expr172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_expr198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_expr200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_expr213 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_expr215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_expr237 = new BitSet(new long[]{0x0000000000006060L});
    public static final BitSet FOLLOW_expr_in_expr241 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_expr258 = new BitSet(new long[]{0x0000000000006060L});
    public static final BitSet FOLLOW_expr_in_expr262 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_expr276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_qid305 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_qid308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_qid310 = new BitSet(new long[]{0x0000000000020002L});

}
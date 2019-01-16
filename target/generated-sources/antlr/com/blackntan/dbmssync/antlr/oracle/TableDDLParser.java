// $ANTLR 3.0.1 /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g 2019-01-16 13:06:35

package com.blackntan.dbmssync.antlr.oracle;
import com.blackntan.dbmssync.xsd.dbSchemaV1.*;
import java.math.BigInteger;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class TableDDLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CREATETABLE", "ID", "POINT", "LPAREN", "COMMA", "RPAREN", "N", "UPPERLOWERQ", "ASTERISK", "PLUS", "MINUS", "NUMBER", "WHITESPACE", "'CONSTRAINT'", "'DEFAULT'", "'PRIMARY KEY'", "'UNIQUE'", "'USING INDEX'", "'TABLESPACE'", "'PCTFREE'", "'PCTUSED'", "'INITRANS'", "'MAXTRANS'", "'COMPUTE STATISTICS'", "'NOCOMPRESS'", "'LOGGING'", "'STORAGE'", "'INITIAL'", "'NEXT'", "'MINEXTENTS'", "'MAXEXTENTS'", "'PCTINCREASE'", "'FREELISTS'", "'FREELIST'", "'GROUPS'", "'BUFFER_POOL'", "'LOB'", "'STORE AS'", "'ENABLE STORAGE'", "'IN ROW'", "'CHUNK'", "'PCTVERSION'", "'NOCACHE'", "'FOREIGN KEY'", "'REFERENCES'", "'ON DELETE SET NULL'", "'NOT NULL'", "'ENABLE'", "'DISABLE'", "'VALIDATE'", "'NOVALIDATE'", "'VARCHAR'", "'VARCHAR2'", "'NUMBER'", "'FLOAT'", "'DATE'", "'INTEGER'", "'TIMESTAMP'", "'BLOB'", "'CLOB'", "'CHAR'", "'LONG'"
    };
    public static final int COMMA=8;
    public static final int NUMBER=15;
    public static final int LPAREN=7;
    public static final int ASTERISK=12;
    public static final int RPAREN=9;
    public static final int N=10;
    public static final int MINUS=14;
    public static final int CREATETABLE=4;
    public static final int UPPERLOWERQ=11;
    public static final int WHITESPACE=16;
    public static final int ID=5;
    public static final int POINT=6;
    public static final int EOF=-1;
    public static final int PLUS=13;

        public TableDDLParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g"; }



    // $ANTLR start createTable
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:16:1: createTable returns [CtTable tb] : CREATETABLE (schema= ID POINT )? tablename= ID LPAREN columns ( ( COMMA pkA= primarykey ) | ( COMMA 'CONSTRAINT' cnA= ID pkB= primarykey ) )? ( COMMA 'CONSTRAINT' cnB= ID ( foreignkey )? ( uniquekey )? )* RPAREN ( pctfreeinfo )? ( tablespaceinfo )? ( lobinfo )* ;
    public final CtTable createTable() throws RecognitionException {
        CtTable tb = null;

        Token schema=null;
        Token tablename=null;
        Token cnA=null;
        Token cnB=null;
        CtPrimaryKey pkA = null;

        CtPrimaryKey pkB = null;

        ArrayList<CtColumn> columns1 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:17:5: ( CREATETABLE (schema= ID POINT )? tablename= ID LPAREN columns ( ( COMMA pkA= primarykey ) | ( COMMA 'CONSTRAINT' cnA= ID pkB= primarykey ) )? ( COMMA 'CONSTRAINT' cnB= ID ( foreignkey )? ( uniquekey )? )* RPAREN ( pctfreeinfo )? ( tablespaceinfo )? ( lobinfo )* )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:17:9: CREATETABLE (schema= ID POINT )? tablename= ID LPAREN columns ( ( COMMA pkA= primarykey ) | ( COMMA 'CONSTRAINT' cnA= ID pkB= primarykey ) )? ( COMMA 'CONSTRAINT' cnB= ID ( foreignkey )? ( uniquekey )? )* RPAREN ( pctfreeinfo )? ( tablespaceinfo )? ( lobinfo )*
            {
            tb = CtTable.Factory.newInstance();CtColumns ctColumns = tb.addNewColumns();
            match(input,CREATETABLE,FOLLOW_CREATETABLE_in_createTable57); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:18:18: (schema= ID POINT )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==POINT) ) {
                    alt1=1;
                }
            }
            switch (alt1) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:18:19: schema= ID POINT
                    {
                    schema=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_createTable62); 
                    match(input,POINT,FOLLOW_POINT_in_createTable64); 

                    }
                    break;

            }

            tb.setSchemaName(schema.getText());
            tablename=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_createTable78); 
            tb.setObjectName(tablename.getText());
            match(input,LPAREN,FOLLOW_LPAREN_in_createTable88); 
            pushFollow(FOLLOW_columns_in_createTable90);
            columns1=columns();
            _fsp--;

            CtColumn[] cbA = new CtColumn[columns1.size()];ctColumns.setColumnArray(columns1.toArray(cbA));
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:21:6: ( ( COMMA pkA= primarykey ) | ( COMMA 'CONSTRAINT' cnA= ID pkB= primarykey ) )?
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==COMMA) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==17) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==ID) ) {
                        int LA2_5 = input.LA(4);

                        if ( (LA2_5==19) ) {
                            alt2=2;
                        }
                    }
                }
                else if ( (LA2_1==19) ) {
                    alt2=1;
                }
            }
            switch (alt2) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:22:7: ( COMMA pkA= primarykey )
                    {
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:22:7: ( COMMA pkA= primarykey )
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:22:8: COMMA pkA= primarykey
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_createTable109); 
                    pushFollow(FOLLOW_primarykey_in_createTable113);
                    pkA=primarykey();
                    _fsp--;

                    tb.setPrimaryKey(pkA);

                    }


                    }
                    break;
                case 2 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:23:8: ( COMMA 'CONSTRAINT' cnA= ID pkB= primarykey )
                    {
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:23:8: ( COMMA 'CONSTRAINT' cnA= ID pkB= primarykey )
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:23:9: COMMA 'CONSTRAINT' cnA= ID pkB= primarykey
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_createTable127); 
                    match(input,17,FOLLOW_17_in_createTable129); 
                    cnA=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_createTable133); 
                    pushFollow(FOLLOW_primarykey_in_createTable137);
                    pkB=primarykey();
                    _fsp--;


                    }

                    pkB.setObjectName(cnA.getText());tb.setPrimaryKey(pkB);

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:6: ( COMMA 'CONSTRAINT' cnB= ID ( foreignkey )? ( uniquekey )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:7: COMMA 'CONSTRAINT' cnB= ID ( foreignkey )? ( uniquekey )?
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_createTable156); 
            	    match(input,17,FOLLOW_17_in_createTable158); 
            	    cnB=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_createTable162); 
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:33: ( foreignkey )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==47) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:34: foreignkey
            	            {
            	            pushFollow(FOLLOW_foreignkey_in_createTable165);
            	            foreignkey();
            	            _fsp--;


            	            }
            	            break;

            	    }

            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:47: ( uniquekey )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==20) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:48: uniquekey
            	            {
            	            pushFollow(FOLLOW_uniquekey_in_createTable170);
            	            uniquekey();
            	            _fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_createTable182); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:13: ( pctfreeinfo )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:14: pctfreeinfo
                    {
                    pushFollow(FOLLOW_pctfreeinfo_in_createTable185);
                    pctfreeinfo();
                    _fsp--;


                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:28: ( tablespaceinfo )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:29: tablespaceinfo
                    {
                    pushFollow(FOLLOW_tablespaceinfo_in_createTable190);
                    tablespaceinfo();
                    _fsp--;


                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:46: ( lobinfo )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==40) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:47: lobinfo
            	    {
            	    pushFollow(FOLLOW_lobinfo_in_createTable195);
            	    lobinfo();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tb;
    }
    // $ANTLR end createTable


    // $ANTLR start columns
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:29:1: columns returns [ArrayList<CtColumn> cbAl] : ( ( COMMA )? column )* ;
    public final ArrayList<CtColumn> columns() throws RecognitionException {
        ArrayList<CtColumn> cbAl = null;

        CtColumn column2 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:30:5: ( ( ( COMMA )? column )* )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:30:9: ( ( COMMA )? column )*
            {
            cbAl = new ArrayList<CtColumn>();
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:32:6: ( ( COMMA )? column )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==ID) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:32:7: ( COMMA )? column
            	    {
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:32:7: ( COMMA )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==COMMA) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:32:8: COMMA
            	            {
            	            match(input,COMMA,FOLLOW_COMMA_in_columns235); 

            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_column_in_columns239);
            	    column2=column();
            	    _fsp--;

            	    cbAl.add(column2);

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cbAl;
    }
    // $ANTLR end columns


    // $ANTLR start column
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:35:1: column returns [CtColumn cb] : ID datatype ( 'DEFAULT' defaultvalue )? ( notnull )? ;
    public final CtColumn column() throws RecognitionException {
        CtColumn cb = null;

        Token ID3=null;
        CtDataType datatype4 = null;

        defaultvalue_return defaultvalue5 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:36:5: ( ID datatype ( 'DEFAULT' defaultvalue )? ( notnull )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:36:9: ID datatype ( 'DEFAULT' defaultvalue )? ( notnull )?
            {
            cb = CtColumn.Factory.newInstance();
            ID3=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_column278); 
            cb.setObjectName(ID3.getText());
            pushFollow(FOLLOW_datatype_in_column282);
            datatype4=datatype();
            _fsp--;

            cb.setDataType(datatype4);
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:38:6: ( 'DEFAULT' defaultvalue )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:38:7: 'DEFAULT' defaultvalue
                    {
                    match(input,18,FOLLOW_18_in_column293); 
                    pushFollow(FOLLOW_defaultvalue_in_column295);
                    defaultvalue5=defaultvalue();
                    _fsp--;

                    cb.setDefaultValue(input.toString(defaultvalue5.start,defaultvalue5.stop));

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:38:74: ( notnull )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==50) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:38:75: notnull
                    {
                    pushFollow(FOLLOW_notnull_in_column301);
                    notnull();
                    _fsp--;

                    cb.addNewNotNull();

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return cb;
    }
    // $ANTLR end column


    // $ANTLR start primarykey
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:41:1: primarykey returns [CtPrimaryKey pk] : 'PRIMARY KEY' LPAREN ( ( COMMA )? columnname= ID )+ RPAREN ( indexinfo )? ( pctfreeinfo )? ( tablespaceinfo )? ( constraintstate )? ;
    public final CtPrimaryKey primarykey() throws RecognitionException {
        CtPrimaryKey pk = null;

        Token columnname=null;

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:42:2: ( 'PRIMARY KEY' LPAREN ( ( COMMA )? columnname= ID )+ RPAREN ( indexinfo )? ( pctfreeinfo )? ( tablespaceinfo )? ( constraintstate )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:42:4: 'PRIMARY KEY' LPAREN ( ( COMMA )? columnname= ID )+ RPAREN ( indexinfo )? ( pctfreeinfo )? ( tablespaceinfo )? ( constraintstate )?
            {
            pk = CtPrimaryKey.Factory.newInstance();
            match(input,19,FOLLOW_19_in_primarykey328); 
            match(input,LPAREN,FOLLOW_LPAREN_in_primarykey330); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:43:24: ( ( COMMA )? columnname= ID )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID||LA14_0==COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:43:25: ( COMMA )? columnname= ID
            	    {
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:43:25: ( COMMA )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==COMMA) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:43:26: COMMA
            	            {
            	            match(input,COMMA,FOLLOW_COMMA_in_primarykey334); 

            	            }
            	            break;

            	    }

            	    columnname=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_primarykey340); 
            	    pk.addNewColumnName().setStringValue(columnname.getText());

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

            match(input,RPAREN,FOLLOW_RPAREN_in_primarykey349); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:10: ( indexinfo )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:11: indexinfo
                    {
                    pushFollow(FOLLOW_indexinfo_in_primarykey352);
                    indexinfo();
                    _fsp--;


                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:23: ( pctfreeinfo )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:24: pctfreeinfo
                    {
                    pushFollow(FOLLOW_pctfreeinfo_in_primarykey357);
                    pctfreeinfo();
                    _fsp--;


                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:38: ( tablespaceinfo )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:39: tablespaceinfo
                    {
                    pushFollow(FOLLOW_tablespaceinfo_in_primarykey362);
                    tablespaceinfo();
                    _fsp--;


                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:56: ( constraintstate )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=51 && LA18_0<=54)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:57: constraintstate
                    {
                    pushFollow(FOLLOW_constraintstate_in_primarykey367);
                    constraintstate();
                    _fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pk;
    }
    // $ANTLR end primarykey


    // $ANTLR start uniquekey
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:47:1: uniquekey : 'UNIQUE' LPAREN columnname= ID ( COMMA columnname2= ID )* RPAREN ( indexinfo )? ( tablespaceinfo )? ( constraintstate )? ;
    public final void uniquekey() throws RecognitionException {
        Token columnname=null;
        Token columnname2=null;

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:2: ( 'UNIQUE' LPAREN columnname= ID ( COMMA columnname2= ID )* RPAREN ( indexinfo )? ( tablespaceinfo )? ( constraintstate )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:4: 'UNIQUE' LPAREN columnname= ID ( COMMA columnname2= ID )* RPAREN ( indexinfo )? ( tablespaceinfo )? ( constraintstate )?
            {
            match(input,20,FOLLOW_20_in_uniquekey380); 
            match(input,LPAREN,FOLLOW_LPAREN_in_uniquekey382); 
            columnname=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_uniquekey386); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:34: ( COMMA columnname2= ID )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==COMMA) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:35: COMMA columnname2= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_uniquekey389); 
            	    columnname2=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_uniquekey393); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_uniquekey397); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:65: ( indexinfo )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:66: indexinfo
                    {
                    pushFollow(FOLLOW_indexinfo_in_uniquekey400);
                    indexinfo();
                    _fsp--;


                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:78: ( tablespaceinfo )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:79: tablespaceinfo
                    {
                    pushFollow(FOLLOW_tablespaceinfo_in_uniquekey405);
                    tablespaceinfo();
                    _fsp--;


                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:96: ( constraintstate )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=51 && LA22_0<=54)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:97: constraintstate
                    {
                    pushFollow(FOLLOW_constraintstate_in_uniquekey410);
                    constraintstate();
                    _fsp--;


                    }
                    break;

            }


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
    // $ANTLR end uniquekey


    // $ANTLR start indexinfo
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:51:1: indexinfo : ( 'USING INDEX' ) ;
    public final void indexinfo() throws RecognitionException {
        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:52:2: ( ( 'USING INDEX' ) )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:52:4: ( 'USING INDEX' )
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:52:4: ( 'USING INDEX' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:52:5: 'USING INDEX'
            {
            match(input,21,FOLLOW_21_in_indexinfo425); 

            }


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
    // $ANTLR end indexinfo


    // $ANTLR start tablespaceinfo
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:55:1: tablespaceinfo : 'TABLESPACE' tablespacename ;
    public final void tablespaceinfo() throws RecognitionException {
        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:56:2: ( 'TABLESPACE' tablespacename )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:56:4: 'TABLESPACE' tablespacename
            {
            match(input,22,FOLLOW_22_in_tablespaceinfo437); 
            pushFollow(FOLLOW_tablespacename_in_tablespaceinfo439);
            tablespacename();
            _fsp--;


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
    // $ANTLR end tablespaceinfo


    // $ANTLR start tablespacename
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:59:1: tablespacename : ID ;
    public final void tablespacename() throws RecognitionException {
        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:60:2: ( ID )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:60:4: ID
            {
            match(input,ID,FOLLOW_ID_in_tablespacename450); 

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
    // $ANTLR end tablespacename


    // $ANTLR start pctfreeinfo
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:64:1: pctfreeinfo returns [CtIndexInfo ii] : 'PCTFREE' ( N )? ( 'PCTUSED' N )? ( 'INITRANS' N )? ( 'MAXTRANS' N )? ( 'COMPUTE STATISTICS' )? ( 'NOCOMPRESS' )? ( 'LOGGING' )? ( 'STORAGE' LPAREN ( 'INITIAL' N )? ( 'NEXT' N )? ( 'MINEXTENTS' N )? ( 'MAXEXTENTS' N )? ( 'PCTINCREASE' N )? ( 'FREELISTS' N )? ( 'FREELIST' )? ( 'GROUPS' N )? ( 'BUFFER_POOL' )? ( 'DEFAULT' )? RPAREN )? ;
    public final CtIndexInfo pctfreeinfo() throws RecognitionException {
        CtIndexInfo ii = null;

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:65:2: ( 'PCTFREE' ( N )? ( 'PCTUSED' N )? ( 'INITRANS' N )? ( 'MAXTRANS' N )? ( 'COMPUTE STATISTICS' )? ( 'NOCOMPRESS' )? ( 'LOGGING' )? ( 'STORAGE' LPAREN ( 'INITIAL' N )? ( 'NEXT' N )? ( 'MINEXTENTS' N )? ( 'MAXEXTENTS' N )? ( 'PCTINCREASE' N )? ( 'FREELISTS' N )? ( 'FREELIST' )? ( 'GROUPS' N )? ( 'BUFFER_POOL' )? ( 'DEFAULT' )? RPAREN )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:65:4: 'PCTFREE' ( N )? ( 'PCTUSED' N )? ( 'INITRANS' N )? ( 'MAXTRANS' N )? ( 'COMPUTE STATISTICS' )? ( 'NOCOMPRESS' )? ( 'LOGGING' )? ( 'STORAGE' LPAREN ( 'INITIAL' N )? ( 'NEXT' N )? ( 'MINEXTENTS' N )? ( 'MAXEXTENTS' N )? ( 'PCTINCREASE' N )? ( 'FREELISTS' N )? ( 'FREELIST' )? ( 'GROUPS' N )? ( 'BUFFER_POOL' )? ( 'DEFAULT' )? RPAREN )?
            {
            ii = CtIndexInfo.Factory.newInstance();
            match(input,23,FOLLOW_23_in_pctfreeinfo470); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:13: ( N )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==N) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:13: N
                    {
                    match(input,N,FOLLOW_N_in_pctfreeinfo472); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:16: ( 'PCTUSED' N )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==24) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:17: 'PCTUSED' N
                    {
                    match(input,24,FOLLOW_24_in_pctfreeinfo476); 
                    match(input,N,FOLLOW_N_in_pctfreeinfo478); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:31: ( 'INITRANS' N )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:32: 'INITRANS' N
                    {
                    match(input,25,FOLLOW_25_in_pctfreeinfo483); 
                    match(input,N,FOLLOW_N_in_pctfreeinfo485); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:47: ( 'MAXTRANS' N )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:48: 'MAXTRANS' N
                    {
                    match(input,26,FOLLOW_26_in_pctfreeinfo490); 
                    match(input,N,FOLLOW_N_in_pctfreeinfo492); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:63: ( 'COMPUTE STATISTICS' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:64: 'COMPUTE STATISTICS'
                    {
                    match(input,27,FOLLOW_27_in_pctfreeinfo497); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:87: ( 'NOCOMPRESS' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:88: 'NOCOMPRESS'
                    {
                    match(input,28,FOLLOW_28_in_pctfreeinfo502); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:103: ( 'LOGGING' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:66:104: 'LOGGING'
                    {
                    match(input,29,FOLLOW_29_in_pctfreeinfo507); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:3: ( 'STORAGE' LPAREN ( 'INITIAL' N )? ( 'NEXT' N )? ( 'MINEXTENTS' N )? ( 'MAXEXTENTS' N )? ( 'PCTINCREASE' N )? ( 'FREELISTS' N )? ( 'FREELIST' )? ( 'GROUPS' N )? ( 'BUFFER_POOL' )? ( 'DEFAULT' )? RPAREN )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:4: 'STORAGE' LPAREN ( 'INITIAL' N )? ( 'NEXT' N )? ( 'MINEXTENTS' N )? ( 'MAXEXTENTS' N )? ( 'PCTINCREASE' N )? ( 'FREELISTS' N )? ( 'FREELIST' )? ( 'GROUPS' N )? ( 'BUFFER_POOL' )? ( 'DEFAULT' )? RPAREN
                    {
                    match(input,30,FOLLOW_30_in_pctfreeinfo514); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_pctfreeinfo516); 
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:21: ( 'INITIAL' N )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==31) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:22: 'INITIAL' N
                            {
                            match(input,31,FOLLOW_31_in_pctfreeinfo519); 
                            match(input,N,FOLLOW_N_in_pctfreeinfo521); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:36: ( 'NEXT' N )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==32) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:37: 'NEXT' N
                            {
                            match(input,32,FOLLOW_32_in_pctfreeinfo526); 
                            match(input,N,FOLLOW_N_in_pctfreeinfo528); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:48: ( 'MINEXTENTS' N )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:49: 'MINEXTENTS' N
                            {
                            match(input,33,FOLLOW_33_in_pctfreeinfo533); 
                            match(input,N,FOLLOW_N_in_pctfreeinfo535); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:66: ( 'MAXEXTENTS' N )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==34) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:67:67: 'MAXEXTENTS' N
                            {
                            match(input,34,FOLLOW_34_in_pctfreeinfo540); 
                            match(input,N,FOLLOW_N_in_pctfreeinfo542); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:3: ( 'PCTINCREASE' N )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==35) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:4: 'PCTINCREASE' N
                            {
                            match(input,35,FOLLOW_35_in_pctfreeinfo549); 
                            match(input,N,FOLLOW_N_in_pctfreeinfo551); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:22: ( 'FREELISTS' N )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==36) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:23: 'FREELISTS' N
                            {
                            match(input,36,FOLLOW_36_in_pctfreeinfo556); 
                            match(input,N,FOLLOW_N_in_pctfreeinfo558); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:39: ( 'FREELIST' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==37) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:40: 'FREELIST'
                            {
                            match(input,37,FOLLOW_37_in_pctfreeinfo563); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:53: ( 'GROUPS' N )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==38) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:54: 'GROUPS' N
                            {
                            match(input,38,FOLLOW_38_in_pctfreeinfo568); 
                            match(input,N,FOLLOW_N_in_pctfreeinfo570); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:67: ( 'BUFFER_POOL' )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==39) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:68: 'BUFFER_POOL'
                            {
                            match(input,39,FOLLOW_39_in_pctfreeinfo575); 

                            }
                            break;

                    }

                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:84: ( 'DEFAULT' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==18) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:68:85: 'DEFAULT'
                            {
                            match(input,18,FOLLOW_18_in_pctfreeinfo580); 

                            }
                            break;

                    }

                    match(input,RPAREN,FOLLOW_RPAREN_in_pctfreeinfo584); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ii;
    }
    // $ANTLR end pctfreeinfo


    // $ANTLR start lobinfo
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:71:1: lobinfo : 'LOB' LPAREN columnname= ID RPAREN 'STORE AS' LPAREN 'TABLESPACE' tablespacename 'ENABLE STORAGE' 'IN ROW' 'CHUNK' N 'PCTVERSION' N ( 'NOCACHE' )? ( 'LOGGING' )? ( 'STORAGE' LPAREN 'INITIAL' N 'NEXT' N 'MINEXTENTS' N 'MAXEXTENTS' N 'PCTINCREASE' N 'FREELISTS' N 'FREELIST' 'GROUPS' N 'BUFFER_POOL' 'DEFAULT' RPAREN RPAREN )? ;
    public final void lobinfo() throws RecognitionException {
        Token columnname=null;

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:72:2: ( 'LOB' LPAREN columnname= ID RPAREN 'STORE AS' LPAREN 'TABLESPACE' tablespacename 'ENABLE STORAGE' 'IN ROW' 'CHUNK' N 'PCTVERSION' N ( 'NOCACHE' )? ( 'LOGGING' )? ( 'STORAGE' LPAREN 'INITIAL' N 'NEXT' N 'MINEXTENTS' N 'MAXEXTENTS' N 'PCTINCREASE' N 'FREELISTS' N 'FREELIST' 'GROUPS' N 'BUFFER_POOL' 'DEFAULT' RPAREN RPAREN )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:72:5: 'LOB' LPAREN columnname= ID RPAREN 'STORE AS' LPAREN 'TABLESPACE' tablespacename 'ENABLE STORAGE' 'IN ROW' 'CHUNK' N 'PCTVERSION' N ( 'NOCACHE' )? ( 'LOGGING' )? ( 'STORAGE' LPAREN 'INITIAL' N 'NEXT' N 'MINEXTENTS' N 'MAXEXTENTS' N 'PCTINCREASE' N 'FREELISTS' N 'FREELIST' 'GROUPS' N 'BUFFER_POOL' 'DEFAULT' RPAREN RPAREN )?
            {
            match(input,40,FOLLOW_40_in_lobinfo598); 
            match(input,LPAREN,FOLLOW_LPAREN_in_lobinfo600); 
            columnname=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_lobinfo604); 
            match(input,RPAREN,FOLLOW_RPAREN_in_lobinfo606); 
            match(input,41,FOLLOW_41_in_lobinfo608); 
            match(input,LPAREN,FOLLOW_LPAREN_in_lobinfo610); 
            match(input,22,FOLLOW_22_in_lobinfo614); 
            pushFollow(FOLLOW_tablespacename_in_lobinfo616);
            tablespacename();
            _fsp--;

            match(input,42,FOLLOW_42_in_lobinfo618); 
            match(input,43,FOLLOW_43_in_lobinfo620); 
            match(input,44,FOLLOW_44_in_lobinfo622); 
            match(input,N,FOLLOW_N_in_lobinfo624); 
            match(input,45,FOLLOW_45_in_lobinfo626); 
            match(input,N,FOLLOW_N_in_lobinfo628); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:74:3: ( 'NOCACHE' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:74:4: 'NOCACHE'
                    {
                    match(input,46,FOLLOW_46_in_lobinfo633); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:74:16: ( 'LOGGING' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==29) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:74:17: 'LOGGING'
                    {
                    match(input,29,FOLLOW_29_in_lobinfo638); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:75:3: ( 'STORAGE' LPAREN 'INITIAL' N 'NEXT' N 'MINEXTENTS' N 'MAXEXTENTS' N 'PCTINCREASE' N 'FREELISTS' N 'FREELIST' 'GROUPS' N 'BUFFER_POOL' 'DEFAULT' RPAREN RPAREN )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:75:4: 'STORAGE' LPAREN 'INITIAL' N 'NEXT' N 'MINEXTENTS' N 'MAXEXTENTS' N 'PCTINCREASE' N 'FREELISTS' N 'FREELIST' 'GROUPS' N 'BUFFER_POOL' 'DEFAULT' RPAREN RPAREN
                    {
                    match(input,30,FOLLOW_30_in_lobinfo645); 
                    match(input,LPAREN,FOLLOW_LPAREN_in_lobinfo647); 
                    match(input,31,FOLLOW_31_in_lobinfo649); 
                    match(input,N,FOLLOW_N_in_lobinfo651); 
                    match(input,32,FOLLOW_32_in_lobinfo653); 
                    match(input,N,FOLLOW_N_in_lobinfo655); 
                    match(input,33,FOLLOW_33_in_lobinfo657); 
                    match(input,N,FOLLOW_N_in_lobinfo659); 
                    match(input,34,FOLLOW_34_in_lobinfo661); 
                    match(input,N,FOLLOW_N_in_lobinfo663); 
                    match(input,35,FOLLOW_35_in_lobinfo667); 
                    match(input,N,FOLLOW_N_in_lobinfo669); 
                    match(input,36,FOLLOW_36_in_lobinfo671); 
                    match(input,N,FOLLOW_N_in_lobinfo673); 
                    match(input,37,FOLLOW_37_in_lobinfo675); 
                    match(input,38,FOLLOW_38_in_lobinfo677); 
                    match(input,N,FOLLOW_N_in_lobinfo679); 
                    match(input,39,FOLLOW_39_in_lobinfo681); 
                    match(input,18,FOLLOW_18_in_lobinfo683); 
                    match(input,RPAREN,FOLLOW_RPAREN_in_lobinfo684); 
                    match(input,RPAREN,FOLLOW_RPAREN_in_lobinfo686); 

                    }
                    break;

            }


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
    // $ANTLR end lobinfo


    // $ANTLR start foreignkey
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:79:1: foreignkey : 'FOREIGN KEY' LPAREN columnname= ID ( COMMA columnname2= ID )* RPAREN 'REFERENCES' (schema= ID POINT )? tablename= ID LPAREN columnname3= ID ( COMMA columnname4= ID )* RPAREN ( 'ON DELETE SET NULL' )? ( constraintstate )? ;
    public final void foreignkey() throws RecognitionException {
        Token columnname=null;
        Token columnname2=null;
        Token schema=null;
        Token tablename=null;
        Token columnname3=null;
        Token columnname4=null;

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:80:2: ( 'FOREIGN KEY' LPAREN columnname= ID ( COMMA columnname2= ID )* RPAREN 'REFERENCES' (schema= ID POINT )? tablename= ID LPAREN columnname3= ID ( COMMA columnname4= ID )* RPAREN ( 'ON DELETE SET NULL' )? ( constraintstate )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:80:4: 'FOREIGN KEY' LPAREN columnname= ID ( COMMA columnname2= ID )* RPAREN 'REFERENCES' (schema= ID POINT )? tablename= ID LPAREN columnname3= ID ( COMMA columnname4= ID )* RPAREN ( 'ON DELETE SET NULL' )? ( constraintstate )?
            {
            match(input,47,FOLLOW_47_in_foreignkey700); 
            match(input,LPAREN,FOLLOW_LPAREN_in_foreignkey702); 
            columnname=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_foreignkey706); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:80:39: ( COMMA columnname2= ID )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==COMMA) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:80:40: COMMA columnname2= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_foreignkey709); 
            	    columnname2=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_foreignkey713); 

            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_foreignkey717); 
            match(input,48,FOLLOW_48_in_foreignkey719); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:80:83: (schema= ID POINT )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ID) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==POINT) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:80:84: schema= ID POINT
                    {
                    schema=(Token)input.LT(1);
                    match(input,ID,FOLLOW_ID_in_foreignkey724); 
                    match(input,POINT,FOLLOW_POINT_in_foreignkey726); 

                    }
                    break;

            }

            tablename=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_foreignkey735); 
            match(input,LPAREN,FOLLOW_LPAREN_in_foreignkey737); 
            columnname3=(Token)input.LT(1);
            match(input,ID,FOLLOW_ID_in_foreignkey741); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:81:38: ( COMMA columnname4= ID )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==COMMA) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:81:39: COMMA columnname4= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_foreignkey744); 
            	    columnname4=(Token)input.LT(1);
            	    match(input,ID,FOLLOW_ID_in_foreignkey748); 

            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            match(input,RPAREN,FOLLOW_RPAREN_in_foreignkey752); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:82:3: ( 'ON DELETE SET NULL' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:82:4: 'ON DELETE SET NULL'
                    {
                    match(input,49,FOLLOW_49_in_foreignkey757); 

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:82:27: ( constraintstate )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=51 && LA48_0<=54)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:82:28: constraintstate
                    {
                    pushFollow(FOLLOW_constraintstate_in_foreignkey762);
                    constraintstate();
                    _fsp--;


                    }
                    break;

            }


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
    // $ANTLR end foreignkey

    public static class defaultvalue_return extends ParserRuleReturnScope {
    };

    // $ANTLR start defaultvalue
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:85:1: defaultvalue : ( ID | N | UPPERLOWERQ );
    public final defaultvalue_return defaultvalue() throws RecognitionException {
        defaultvalue_return retval = new defaultvalue_return();
        retval.start = input.LT(1);

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:86:2: ( ID | N | UPPERLOWERQ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
            {
            if ( input.LA(1)==ID||(input.LA(1)>=N && input.LA(1)<=UPPERLOWERQ) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_defaultvalue0);    throw mse;
            }


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
    // $ANTLR end defaultvalue


    // $ANTLR start notnull
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:91:1: notnull : 'NOT NULL' ( constraintstate )? ;
    public final void notnull() throws RecognitionException {
        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:92:2: ( 'NOT NULL' ( constraintstate )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:92:4: 'NOT NULL' ( constraintstate )?
            {
            match(input,50,FOLLOW_50_in_notnull796); 
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:92:15: ( constraintstate )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=51 && LA49_0<=54)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:92:16: constraintstate
                    {
                    pushFollow(FOLLOW_constraintstate_in_notnull799);
                    constraintstate();
                    _fsp--;


                    }
                    break;

            }


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
    // $ANTLR end notnull


    // $ANTLR start constraintstate
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:95:1: constraintstate : ( 'ENABLE' | 'DISABLE' | 'VALIDATE' | 'NOVALIDATE' );
    public final void constraintstate() throws RecognitionException {
        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:96:2: ( 'ENABLE' | 'DISABLE' | 'VALIDATE' | 'NOVALIDATE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
            {
            if ( (input.LA(1)>=51 && input.LA(1)<=54) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_constraintstate0);    throw mse;
            }


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
    // $ANTLR end constraintstate


    // $ANTLR start datatype
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:102:1: datatype returns [CtDataType db] : datatypename ( size )? ;
    public final CtDataType datatype() throws RecognitionException {
        CtDataType db = null;

        datatypename_return datatypename6 = null;

        size_return size7 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:103:5: ( datatypename ( size )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:103:9: datatypename ( size )?
            {
            db = CtDataType.Factory.newInstance();
            pushFollow(FOLLOW_datatypename_in_datatype867);
            datatypename6=datatypename();
            _fsp--;

            db.setDataTypeName(input.toString(datatypename6.start,datatypename6.stop));
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:104:65: ( size )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==LPAREN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:104:66: size
                    {
                    pushFollow(FOLLOW_size_in_datatype872);
                    size7=size();
                    _fsp--;

                    db.setLength(size7.length);if (size7.prec != null) db.setPrecision(size7.prec);

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return db;
    }
    // $ANTLR end datatype

    public static class datatypename_return extends ParserRuleReturnScope {
    };

    // $ANTLR start datatypename
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:107:1: datatypename : ( 'VARCHAR' | 'VARCHAR2' | 'NUMBER' | 'FLOAT' | 'DATE' | 'INTEGER' | 'TIMESTAMP' | 'BLOB' | 'CLOB' | 'CHAR' | 'LONG' );
    public final datatypename_return datatypename() throws RecognitionException {
        datatypename_return retval = new datatypename_return();
        retval.start = input.LT(1);

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:108:2: ( 'VARCHAR' | 'VARCHAR2' | 'NUMBER' | 'FLOAT' | 'DATE' | 'INTEGER' | 'TIMESTAMP' | 'BLOB' | 'CLOB' | 'CHAR' | 'LONG' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
            {
            if ( (input.LA(1)>=55 && input.LA(1)<=65) ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_datatypename0);    throw mse;
            }


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
    // $ANTLR end datatypename

    public static class size_return extends ParserRuleReturnScope {
        public String length;
        public String prec;
    };

    // $ANTLR start size
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:121:1: size returns [String length, String prec] : LPAREN sizeprec ( COMMA precision )? RPAREN ;
    public final size_return size() throws RecognitionException {
        size_return retval = new size_return();
        retval.start = input.LT(1);

        sizeprec_return sizeprec8 = null;

        precision_return precision9 = null;


        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:122:6: ( LPAREN sizeprec ( COMMA precision )? RPAREN )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:122:8: LPAREN sizeprec ( COMMA precision )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_size1044); 
            pushFollow(FOLLOW_sizeprec_in_size1046);
            sizeprec8=sizeprec();
            _fsp--;

            retval.length = input.toString(sizeprec8.start,sizeprec8.stop);
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:122:52: ( COMMA precision )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==COMMA) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:122:53: COMMA precision
                    {
                    match(input,COMMA,FOLLOW_COMMA_in_size1051); 
                    pushFollow(FOLLOW_precision_in_size1053);
                    precision9=precision();
                    _fsp--;

                    retval.prec = input.toString(precision9.start,precision9.stop);

                    }
                    break;

            }

            match(input,RPAREN,FOLLOW_RPAREN_in_size1059); 

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
    // $ANTLR end size

    public static class precision_return extends ParserRuleReturnScope {
    };

    // $ANTLR start precision
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:125:1: precision : sizeprec ;
    public final precision_return precision() throws RecognitionException {
        precision_return retval = new precision_return();
        retval.start = input.LT(1);

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:126:2: ( sizeprec )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:126:4: sizeprec
            {
            pushFollow(FOLLOW_sizeprec_in_precision1070);
            sizeprec();
            _fsp--;


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
    // $ANTLR end precision

    public static class sizeprec_return extends ParserRuleReturnScope {
    };

    // $ANTLR start sizeprec
    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:129:1: sizeprec : ( ASTERISK | N );
    public final sizeprec_return sizeprec() throws RecognitionException {
        sizeprec_return retval = new sizeprec_return();
        retval.start = input.LT(1);

        try {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:130:2: ( ASTERISK | N )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
            {
            if ( input.LA(1)==N||input.LA(1)==ASTERISK ) {
                input.consume();
                errorRecovery=false;
            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_sizeprec0);    throw mse;
            }


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
    // $ANTLR end sizeprec


 

    public static final BitSet FOLLOW_CREATETABLE_in_createTable57 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_createTable62 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_POINT_in_createTable64 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_createTable78 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_createTable88 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_columns_in_createTable90 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_createTable109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_primarykey_in_createTable113 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_createTable127 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_createTable129 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_createTable133 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_primarykey_in_createTable137 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_createTable156 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_createTable158 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_createTable162 = new BitSet(new long[]{0x0000800000100300L});
    public static final BitSet FOLLOW_foreignkey_in_createTable165 = new BitSet(new long[]{0x0000000000100300L});
    public static final BitSet FOLLOW_uniquekey_in_createTable170 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RPAREN_in_createTable182 = new BitSet(new long[]{0x0000010000C00002L});
    public static final BitSet FOLLOW_pctfreeinfo_in_createTable185 = new BitSet(new long[]{0x0000010000400002L});
    public static final BitSet FOLLOW_tablespaceinfo_in_createTable190 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_lobinfo_in_createTable195 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_COMMA_in_columns235 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_column_in_columns239 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_ID_in_column278 = new BitSet(new long[]{0xFF80000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_datatype_in_column282 = new BitSet(new long[]{0x0004000000040002L});
    public static final BitSet FOLLOW_18_in_column293 = new BitSet(new long[]{0x0000000000000C20L});
    public static final BitSet FOLLOW_defaultvalue_in_column295 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_notnull_in_column301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_primarykey328 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_primarykey330 = new BitSet(new long[]{0x0000000000000120L});
    public static final BitSet FOLLOW_COMMA_in_primarykey334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_primarykey340 = new BitSet(new long[]{0x0000000000000320L});
    public static final BitSet FOLLOW_RPAREN_in_primarykey349 = new BitSet(new long[]{0x0078000000E00002L});
    public static final BitSet FOLLOW_indexinfo_in_primarykey352 = new BitSet(new long[]{0x0078000000C00002L});
    public static final BitSet FOLLOW_pctfreeinfo_in_primarykey357 = new BitSet(new long[]{0x0078000000400002L});
    public static final BitSet FOLLOW_tablespaceinfo_in_primarykey362 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_constraintstate_in_primarykey367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_uniquekey380 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_uniquekey382 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_uniquekey386 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_uniquekey389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_uniquekey393 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RPAREN_in_uniquekey397 = new BitSet(new long[]{0x0078000000600002L});
    public static final BitSet FOLLOW_indexinfo_in_uniquekey400 = new BitSet(new long[]{0x0078000000400002L});
    public static final BitSet FOLLOW_tablespaceinfo_in_uniquekey405 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_constraintstate_in_uniquekey410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_indexinfo425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_tablespaceinfo437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tablespacename_in_tablespaceinfo439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_tablespacename450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_pctfreeinfo470 = new BitSet(new long[]{0x000000007F000402L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo472 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_24_in_pctfreeinfo476 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo478 = new BitSet(new long[]{0x000000007E000002L});
    public static final BitSet FOLLOW_25_in_pctfreeinfo483 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo485 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_26_in_pctfreeinfo490 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo492 = new BitSet(new long[]{0x0000000078000002L});
    public static final BitSet FOLLOW_27_in_pctfreeinfo497 = new BitSet(new long[]{0x0000000070000002L});
    public static final BitSet FOLLOW_28_in_pctfreeinfo502 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_pctfreeinfo507 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_pctfreeinfo514 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_pctfreeinfo516 = new BitSet(new long[]{0x000000FF80040200L});
    public static final BitSet FOLLOW_31_in_pctfreeinfo519 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo521 = new BitSet(new long[]{0x000000FF00040200L});
    public static final BitSet FOLLOW_32_in_pctfreeinfo526 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo528 = new BitSet(new long[]{0x000000FE00040200L});
    public static final BitSet FOLLOW_33_in_pctfreeinfo533 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo535 = new BitSet(new long[]{0x000000FC00040200L});
    public static final BitSet FOLLOW_34_in_pctfreeinfo540 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo542 = new BitSet(new long[]{0x000000F800040200L});
    public static final BitSet FOLLOW_35_in_pctfreeinfo549 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo551 = new BitSet(new long[]{0x000000F000040200L});
    public static final BitSet FOLLOW_36_in_pctfreeinfo556 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo558 = new BitSet(new long[]{0x000000E000040200L});
    public static final BitSet FOLLOW_37_in_pctfreeinfo563 = new BitSet(new long[]{0x000000C000040200L});
    public static final BitSet FOLLOW_38_in_pctfreeinfo568 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_pctfreeinfo570 = new BitSet(new long[]{0x0000008000040200L});
    public static final BitSet FOLLOW_39_in_pctfreeinfo575 = new BitSet(new long[]{0x0000000000040200L});
    public static final BitSet FOLLOW_18_in_pctfreeinfo580 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_pctfreeinfo584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_lobinfo598 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_lobinfo600 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_lobinfo604 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lobinfo606 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_lobinfo608 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_lobinfo610 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_lobinfo614 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_tablespacename_in_lobinfo616 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_lobinfo618 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_lobinfo620 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_lobinfo622 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo624 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_lobinfo626 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo628 = new BitSet(new long[]{0x0000400060000002L});
    public static final BitSet FOLLOW_46_in_lobinfo633 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_29_in_lobinfo638 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_lobinfo645 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_lobinfo647 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_lobinfo649 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo651 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_lobinfo653 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo655 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_lobinfo657 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo659 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_lobinfo661 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo663 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_lobinfo667 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo669 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_lobinfo671 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo673 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_lobinfo675 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_lobinfo677 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_N_in_lobinfo679 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_lobinfo681 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_lobinfo683 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lobinfo684 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_lobinfo686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_foreignkey700 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_foreignkey702 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_foreignkey706 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_foreignkey709 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_foreignkey713 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RPAREN_in_foreignkey717 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_foreignkey719 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_foreignkey724 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_POINT_in_foreignkey726 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_foreignkey735 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_LPAREN_in_foreignkey737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_foreignkey741 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_foreignkey744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_foreignkey748 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_RPAREN_in_foreignkey752 = new BitSet(new long[]{0x007A000000000002L});
    public static final BitSet FOLLOW_49_in_foreignkey757 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_constraintstate_in_foreignkey762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_defaultvalue0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_notnull796 = new BitSet(new long[]{0x0078000000000002L});
    public static final BitSet FOLLOW_constraintstate_in_notnull799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_constraintstate0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_datatypename_in_datatype867 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_size_in_datatype872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_datatypename0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_size1044 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_sizeprec_in_size1046 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_COMMA_in_size1051 = new BitSet(new long[]{0x0000000000001400L});
    public static final BitSet FOLLOW_precision_in_size1053 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RPAREN_in_size1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sizeprec_in_precision1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_sizeprec0 = new BitSet(new long[]{0x0000000000000002L});

}
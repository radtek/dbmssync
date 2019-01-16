// $ANTLR 3.0.1 /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g 2019-01-16 13:06:35

package com.blackntan.dbmssync.antlr.oracle;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class TableDDLLexer extends Lexer {
    public static final int T61=61;
    public static final int MINUS=14;
    public static final int T60=60;
    public static final int T63=63;
    public static final int T62=62;
    public static final int T21=21;
    public static final int T65=65;
    public static final int T20=20;
    public static final int T64=64;
    public static final int T23=23;
    public static final int T22=22;
    public static final int WHITESPACE=16;
    public static final int T25=25;
    public static final int T24=24;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T29=29;
    public static final int ID=5;
    public static final int T28=28;
    public static final int Tokens=66;
    public static final int NUMBER=15;
    public static final int LPAREN=7;
    public static final int RPAREN=9;
    public static final int T30=30;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T34=34;
    public static final int CREATETABLE=4;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int PLUS=13;
    public static final int N=10;
    public static final int T41=41;
    public static final int T40=40;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T47=47;
    public static final int T46=46;
    public static final int T49=49;
    public static final int T48=48;
    public static final int EOF=-1;
    public static final int COMMA=8;
    public static final int ASTERISK=12;
    public static final int T50=50;
    public static final int T52=52;
    public static final int T51=51;
    public static final int T54=54;
    public static final int T53=53;
    public static final int T56=56;
    public static final int UPPERLOWERQ=11;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T59=59;
    public static final int T18=18;
    public static final int T17=17;
    public static final int POINT=6;
    public static final int T19=19;
    public TableDDLLexer() {;} 
    public TableDDLLexer(CharStream input) {
        super(input);
        ruleMemo = new HashMap[64+1];
     }
    public String getGrammarFileName() { return "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g"; }

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:10:5: ( 'CONSTRAINT' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:10:7: 'CONSTRAINT'
            {
            match("CONSTRAINT"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:11:5: ( 'DEFAULT' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:11:7: 'DEFAULT'
            {
            match("DEFAULT"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:12:5: ( 'PRIMARY KEY' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:12:7: 'PRIMARY KEY'
            {
            match("PRIMARY KEY"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:13:5: ( 'UNIQUE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:13:7: 'UNIQUE'
            {
            match("UNIQUE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:14:5: ( 'USING INDEX' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:14:7: 'USING INDEX'
            {
            match("USING INDEX"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:15:5: ( 'TABLESPACE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:15:7: 'TABLESPACE'
            {
            match("TABLESPACE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:16:5: ( 'PCTFREE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:16:7: 'PCTFREE'
            {
            match("PCTFREE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:17:5: ( 'PCTUSED' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:17:7: 'PCTUSED'
            {
            match("PCTUSED"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:18:5: ( 'INITRANS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:18:7: 'INITRANS'
            {
            match("INITRANS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:19:5: ( 'MAXTRANS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:19:7: 'MAXTRANS'
            {
            match("MAXTRANS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:20:5: ( 'COMPUTE STATISTICS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:20:7: 'COMPUTE STATISTICS'
            {
            match("COMPUTE STATISTICS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:21:5: ( 'NOCOMPRESS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:21:7: 'NOCOMPRESS'
            {
            match("NOCOMPRESS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:22:5: ( 'LOGGING' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:22:7: 'LOGGING'
            {
            match("LOGGING"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:23:5: ( 'STORAGE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:23:7: 'STORAGE'
            {
            match("STORAGE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:24:5: ( 'INITIAL' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:24:7: 'INITIAL'
            {
            match("INITIAL"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:5: ( 'NEXT' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:25:7: 'NEXT'
            {
            match("NEXT"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:5: ( 'MINEXTENTS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:26:7: 'MINEXTENTS'
            {
            match("MINEXTENTS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:27:5: ( 'MAXEXTENTS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:27:7: 'MAXEXTENTS'
            {
            match("MAXEXTENTS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:28:5: ( 'PCTINCREASE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:28:7: 'PCTINCREASE'
            {
            match("PCTINCREASE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:29:5: ( 'FREELISTS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:29:7: 'FREELISTS'
            {
            match("FREELISTS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:30:5: ( 'FREELIST' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:30:7: 'FREELIST'
            {
            match("FREELIST"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:31:5: ( 'GROUPS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:31:7: 'GROUPS'
            {
            match("GROUPS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:32:5: ( 'BUFFER_POOL' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:32:7: 'BUFFER_POOL'
            {
            match("BUFFER_POOL"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:33:5: ( 'LOB' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:33:7: 'LOB'
            {
            match("LOB"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:34:5: ( 'STORE AS' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:34:7: 'STORE AS'
            {
            match("STORE AS"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:35:5: ( 'ENABLE STORAGE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:35:7: 'ENABLE STORAGE'
            {
            match("ENABLE STORAGE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:36:5: ( 'IN ROW' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:36:7: 'IN ROW'
            {
            match("IN ROW"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:37:5: ( 'CHUNK' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:37:7: 'CHUNK'
            {
            match("CHUNK"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:38:5: ( 'PCTVERSION' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:38:7: 'PCTVERSION'
            {
            match("PCTVERSION"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:39:5: ( 'NOCACHE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:39:7: 'NOCACHE'
            {
            match("NOCACHE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:40:5: ( 'FOREIGN KEY' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:40:7: 'FOREIGN KEY'
            {
            match("FOREIGN KEY"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:41:5: ( 'REFERENCES' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:41:7: 'REFERENCES'
            {
            match("REFERENCES"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:42:5: ( 'ON DELETE SET NULL' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:42:7: 'ON DELETE SET NULL'
            {
            match("ON DELETE SET NULL"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:43:5: ( 'NOT NULL' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:43:7: 'NOT NULL'
            {
            match("NOT NULL"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:5: ( 'ENABLE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:44:7: 'ENABLE'
            {
            match("ENABLE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:45:5: ( 'DISABLE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:45:7: 'DISABLE'
            {
            match("DISABLE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:46:5: ( 'VALIDATE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:46:7: 'VALIDATE'
            {
            match("VALIDATE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:47:5: ( 'NOVALIDATE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:47:7: 'NOVALIDATE'
            {
            match("NOVALIDATE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:5: ( 'VARCHAR' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:48:7: 'VARCHAR'
            {
            match("VARCHAR"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:49:5: ( 'VARCHAR2' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:49:7: 'VARCHAR2'
            {
            match("VARCHAR2"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:50:5: ( 'NUMBER' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:50:7: 'NUMBER'
            {
            match("NUMBER"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:51:5: ( 'FLOAT' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:51:7: 'FLOAT'
            {
            match("FLOAT"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:52:5: ( 'DATE' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:52:7: 'DATE'
            {
            match("DATE"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:53:5: ( 'INTEGER' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:53:7: 'INTEGER'
            {
            match("INTEGER"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:54:5: ( 'TIMESTAMP' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:54:7: 'TIMESTAMP'
            {
            match("TIMESTAMP"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:55:5: ( 'BLOB' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:55:7: 'BLOB'
            {
            match("BLOB"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:56:5: ( 'CLOB' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:56:7: 'CLOB'
            {
            match("CLOB"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:57:5: ( 'CHAR' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:57:7: 'CHAR'
            {
            match("CHAR"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:58:5: ( 'LONG' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:58:7: 'LONG'
            {
            match("LONG"); if (failed) return ;


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start CREATETABLE
    public final void mCREATETABLE() throws RecognitionException {
        try {
            int _type = CREATETABLE;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:135:2: ( 'CREATE TABLE' | 'create table' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='C') ) {
                alt1=1;
            }
            else if ( (LA1_0=='c') ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("134:1: CREATETABLE : ( 'CREATE TABLE' | 'create table' );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:135:4: 'CREATE TABLE'
                    {
                    match("CREATE TABLE"); if (failed) return ;


                    }
                    break;
                case 2 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:136:4: 'create table'
                    {
                    match("create table"); if (failed) return ;


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end CREATETABLE

    // $ANTLR start ID
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:144:2: ( 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* | '\"' 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* '\"' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')) ) {
                alt4=1;
            }
            else if ( (LA4_0=='\"') ) {
                alt4=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("143:1: ID : ( 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* | '\"' 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* '\"' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:144:4: 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
                    {
                    matchRange('A','Z'); if (failed) return ;
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:144:15: ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='#' && LA2_0<='$')||(LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_') ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:146:4: '\"' 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* '\"'
                    {
                    match('\"'); if (failed) return ;
                    matchRange('A','Z'); if (failed) return ;
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:146:19: ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='#' && LA3_0<='$')||(LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_') ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
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

                    match('\"'); if (failed) return ;

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ID

    // $ANTLR start N
    public final void mN() throws RecognitionException {
        try {
            int _type = N;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:150:2: ( '0' .. '9' ( '0' .. '9' )* )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:150:4: '0' .. '9' ( '0' .. '9' )*
            {
            matchRange('0','9'); if (failed) return ;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:150:15: ( '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:150:17: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end N

    // $ANTLR start NUMBER
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:154:2: ( ( ( N POINT N )=> N POINT N | POINT N | N ) ( 'E' ( PLUS | MINUS )? N )? )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:155:3: ( ( N POINT N )=> N POINT N | POINT N | N ) ( 'E' ( PLUS | MINUS )? N )?
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:155:3: ( ( N POINT N )=> N POINT N | POINT N | N )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:155:5: ( N POINT N )=> N POINT N
                    {
                    mN(); if (failed) return ;
                    mPOINT(); if (failed) return ;
                    mN(); if (failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:156:5: POINT N
                    {
                    mPOINT(); if (failed) return ;
                    mN(); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:157:5: N
                    {
                    mN(); if (failed) return ;

                    }
                    break;

            }

            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:159:3: ( 'E' ( PLUS | MINUS )? N )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:159:5: 'E' ( PLUS | MINUS )? N
                    {
                    match('E'); if (failed) return ;
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:159:9: ( PLUS | MINUS )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            failed=false;
                            }
                            else {
                                if (backtracking>0) {failed=true; return ;}
                                MismatchedSetException mse =
                                    new MismatchedSetException(null,input);
                                recover(mse);    throw mse;
                            }


                            }
                            break;

                    }

                    mN(); if (failed) return ;

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NUMBER

    // $ANTLR start UPPERLOWERQ
    public final void mUPPERLOWERQ() throws RecognitionException {
        try {
            int _type = UPPERLOWERQ;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:163:2: ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ | '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\"' | '\\'' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\\'' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case '#':
            case '$':
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
                alt12=1;
                }
                break;
            case '\"':
                {
                alt12=2;
                }
                break;
            case '\'':
                {
                alt12=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("162:1: UPPERLOWERQ : ( ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ | '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\"' | '\\'' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\\'' );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:163:4: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+
                    {
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:163:4: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='#' && LA9_0<='$')||(LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:164:4: '\"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\"'
                    {
                    match('\"'); if (failed) return ;
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:164:8: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='#' && LA10_0<='$')||(LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    match('\"'); if (failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:165:4: '\\'' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\\''
                    {
                    match('\''); if (failed) return ;
                    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:165:9: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='#' && LA11_0<='$')||(LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
                    	    {
                    	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();
                    	    failed=false;
                    	    }
                    	    else {
                    	        if (backtracking>0) {failed=true; return ;}
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (backtracking>0) {failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    match('\''); if (failed) return ;

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end UPPERLOWERQ

    // $ANTLR start POINT
    public final void mPOINT() throws RecognitionException {
        try {
            int _type = POINT;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:169:2: ( '.' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:169:4: '.'
            {
            match('.'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end POINT

    // $ANTLR start PLUS
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:172:2: ( '+' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:172:4: '+'
            {
            match('+'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end PLUS

    // $ANTLR start MINUS
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:175:2: ( '-' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:175:4: '-'
            {
            match('-'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end MINUS

    // $ANTLR start COMMA
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:178:2: ( ',' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:178:4: ','
            {
            match(','); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end COMMA

    // $ANTLR start RPAREN
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:181:2: ( ')' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:181:4: ')'
            {
            match(')'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RPAREN

    // $ANTLR start LPAREN
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:184:2: ( '(' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:184:4: '('
            {
            match('('); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LPAREN

    // $ANTLR start ASTERISK
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:187:2: ( '*' )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:187:4: '*'
            {
            match('*'); if (failed) return ;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ASTERISK

    // $ANTLR start WHITESPACE
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:189:12: ( ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+ )
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:189:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            {
            // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:189:14: ( '\\t' | ' ' | '\\r' | '\\n' | '\\u000C' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||(LA13_0>='\f' && LA13_0<='\r')||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    failed=false;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return ;}
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (backtracking>0) {failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( backtracking==0 ) {
               channel = HIDDEN; 
            }

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WHITESPACE

    public void mTokens() throws RecognitionException {
        // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:8: ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | CREATETABLE | ID | N | NUMBER | UPPERLOWERQ | POINT | PLUS | MINUS | COMMA | RPAREN | LPAREN | ASTERISK | WHITESPACE )
        int alt14=62;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:10: T17
                {
                mT17(); if (failed) return ;

                }
                break;
            case 2 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:14: T18
                {
                mT18(); if (failed) return ;

                }
                break;
            case 3 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:18: T19
                {
                mT19(); if (failed) return ;

                }
                break;
            case 4 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:22: T20
                {
                mT20(); if (failed) return ;

                }
                break;
            case 5 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:26: T21
                {
                mT21(); if (failed) return ;

                }
                break;
            case 6 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:30: T22
                {
                mT22(); if (failed) return ;

                }
                break;
            case 7 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:34: T23
                {
                mT23(); if (failed) return ;

                }
                break;
            case 8 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:38: T24
                {
                mT24(); if (failed) return ;

                }
                break;
            case 9 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:42: T25
                {
                mT25(); if (failed) return ;

                }
                break;
            case 10 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:46: T26
                {
                mT26(); if (failed) return ;

                }
                break;
            case 11 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:50: T27
                {
                mT27(); if (failed) return ;

                }
                break;
            case 12 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:54: T28
                {
                mT28(); if (failed) return ;

                }
                break;
            case 13 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:58: T29
                {
                mT29(); if (failed) return ;

                }
                break;
            case 14 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:62: T30
                {
                mT30(); if (failed) return ;

                }
                break;
            case 15 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:66: T31
                {
                mT31(); if (failed) return ;

                }
                break;
            case 16 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:70: T32
                {
                mT32(); if (failed) return ;

                }
                break;
            case 17 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:74: T33
                {
                mT33(); if (failed) return ;

                }
                break;
            case 18 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:78: T34
                {
                mT34(); if (failed) return ;

                }
                break;
            case 19 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:82: T35
                {
                mT35(); if (failed) return ;

                }
                break;
            case 20 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:86: T36
                {
                mT36(); if (failed) return ;

                }
                break;
            case 21 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:90: T37
                {
                mT37(); if (failed) return ;

                }
                break;
            case 22 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:94: T38
                {
                mT38(); if (failed) return ;

                }
                break;
            case 23 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:98: T39
                {
                mT39(); if (failed) return ;

                }
                break;
            case 24 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:102: T40
                {
                mT40(); if (failed) return ;

                }
                break;
            case 25 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:106: T41
                {
                mT41(); if (failed) return ;

                }
                break;
            case 26 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:110: T42
                {
                mT42(); if (failed) return ;

                }
                break;
            case 27 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:114: T43
                {
                mT43(); if (failed) return ;

                }
                break;
            case 28 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:118: T44
                {
                mT44(); if (failed) return ;

                }
                break;
            case 29 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:122: T45
                {
                mT45(); if (failed) return ;

                }
                break;
            case 30 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:126: T46
                {
                mT46(); if (failed) return ;

                }
                break;
            case 31 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:130: T47
                {
                mT47(); if (failed) return ;

                }
                break;
            case 32 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:134: T48
                {
                mT48(); if (failed) return ;

                }
                break;
            case 33 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:138: T49
                {
                mT49(); if (failed) return ;

                }
                break;
            case 34 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:142: T50
                {
                mT50(); if (failed) return ;

                }
                break;
            case 35 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:146: T51
                {
                mT51(); if (failed) return ;

                }
                break;
            case 36 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:150: T52
                {
                mT52(); if (failed) return ;

                }
                break;
            case 37 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:154: T53
                {
                mT53(); if (failed) return ;

                }
                break;
            case 38 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:158: T54
                {
                mT54(); if (failed) return ;

                }
                break;
            case 39 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:162: T55
                {
                mT55(); if (failed) return ;

                }
                break;
            case 40 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:166: T56
                {
                mT56(); if (failed) return ;

                }
                break;
            case 41 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:170: T57
                {
                mT57(); if (failed) return ;

                }
                break;
            case 42 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:174: T58
                {
                mT58(); if (failed) return ;

                }
                break;
            case 43 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:178: T59
                {
                mT59(); if (failed) return ;

                }
                break;
            case 44 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:182: T60
                {
                mT60(); if (failed) return ;

                }
                break;
            case 45 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:186: T61
                {
                mT61(); if (failed) return ;

                }
                break;
            case 46 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:190: T62
                {
                mT62(); if (failed) return ;

                }
                break;
            case 47 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:194: T63
                {
                mT63(); if (failed) return ;

                }
                break;
            case 48 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:198: T64
                {
                mT64(); if (failed) return ;

                }
                break;
            case 49 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:202: T65
                {
                mT65(); if (failed) return ;

                }
                break;
            case 50 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:206: CREATETABLE
                {
                mCREATETABLE(); if (failed) return ;

                }
                break;
            case 51 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:218: ID
                {
                mID(); if (failed) return ;

                }
                break;
            case 52 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:221: N
                {
                mN(); if (failed) return ;

                }
                break;
            case 53 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:223: NUMBER
                {
                mNUMBER(); if (failed) return ;

                }
                break;
            case 54 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:230: UPPERLOWERQ
                {
                mUPPERLOWERQ(); if (failed) return ;

                }
                break;
            case 55 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:242: POINT
                {
                mPOINT(); if (failed) return ;

                }
                break;
            case 56 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:248: PLUS
                {
                mPLUS(); if (failed) return ;

                }
                break;
            case 57 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:253: MINUS
                {
                mMINUS(); if (failed) return ;

                }
                break;
            case 58 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:259: COMMA
                {
                mCOMMA(); if (failed) return ;

                }
                break;
            case 59 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:265: RPAREN
                {
                mRPAREN(); if (failed) return ;

                }
                break;
            case 60 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:272: LPAREN
                {
                mLPAREN(); if (failed) return ;

                }
                break;
            case 61 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:279: ASTERISK
                {
                mASTERISK(); if (failed) return ;

                }
                break;
            case 62 :
                // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:1:288: WHITESPACE
                {
                mWHITESPACE(); if (failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:155:5: ( N POINT N )
        // /Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g:155:7: N POINT N
        {
        mN(); if (failed) return ;
        mPOINT(); if (failed) return ;
        mN(); if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA6_eotS =
        "\1\uffff\1\4\1\uffff\1\4\2\uffff";
    static final String DFA6_eofS =
        "\6\uffff";
    static final String DFA6_minS =
        "\2\56\1\uffff\1\56\2\uffff";
    static final String DFA6_maxS =
        "\2\71\1\uffff\1\71\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\uffff\1\3\1\1";
    static final String DFA6_specialS =
        "\1\uffff\1\1\1\uffff\1\0\2\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\3",
            "",
            "\1\5\1\uffff\12\3",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "155:3: ( ( N POINT N )=> N POINT N | POINT N | N )";
        }
        public int specialStateTransition(int s, IntStream input) throws NoViableAltException {
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_3 = input.LA(1);

                         
                        int index6_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_3=='.') && (synpred1())) {s = 5;}

                        else if ( ((LA6_3>='0' && LA6_3<='9')) ) {s = 3;}

                        else s = 4;

                         
                        input.seek(index6_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA6_1>='0' && LA6_1<='9')) ) {s = 3;}

                        else if ( (LA6_1=='.') && (synpred1())) {s = 5;}

                        else s = 4;

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (backtracking>0) {failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\21\44\1\27\1\44\1\uffff\1\103\1\106\10\uffff\5\44\1\uffff"+
        "\33\44\1\27\1\uffff\1\103\1\uffff\1\27\2\uffff\21\44\1\uffff\7\44"+
        "\1\u0090\13\44\1\uffff\2\44\1\27\2\uffff\1\105\3\44\1\u00a3\1\44"+
        "\1\u00a5\2\44\1\u00a8\20\44\1\uffff\1\44\1\u00bb\1\44\1\uffff\1"+
        "\44\1\u00be\6\44\1\u00c6\4\44\1\27\1\105\3\44\1\uffff\1\u00cf\1"+
        "\uffff\2\44\1\uffff\22\44\1\uffff\2\44\1\uffff\4\44\1\u00ea\2\44"+
        "\1\uffff\4\44\1\27\3\44\1\uffff\7\44\1\u00fc\1\uffff\13\44\1\u0108"+
        "\1\44\1\uffff\3\44\1\uffff\1\u010d\1\44\1\u0110\3\44\1\27\1\uffff"+
        "\2\44\1\u0116\1\u0117\1\u0118\1\u0119\3\44\1\uffff\2\44\1\u011f"+
        "\1\u0120\5\44\1\u0126\1\44\1\uffff\1\u0128\1\u0129\2\44\1\uffff"+
        "\1\44\2\uffff\1\44\1\u012f\2\44\5\uffff\2\44\1\uffff\2\44\2\uffff"+
        "\1\u0136\2\44\1\u0139\1\44\1\uffff\1\44\2\uffff\1\u013d\1\uffff"+
        "\2\44\1\u0140\1\uffff\1\u0141\4\44\1\u0146\1\uffff\2\44\1\uffff"+
        "\2\44\1\u014b\1\uffff\2\44\2\uffff\1\u014e\1\44\1\u0150\1\u0151"+
        "\1\uffff\1\u0152\1\u0153\1\u0154\1\u0155\1\uffff\1\44\1\u0157\1"+
        "\uffff\1\u0158\6\uffff\1\u0159\3\uffff";
    static final String DFA14_eofS =
        "\u015a\uffff";
    static final String DFA14_minS =
        "\1\11\21\43\1\162\3\43\1\60\10\uffff\5\43\1\uffff\11\43\1\40\17"+
        "\43\1\40\1\43\1\145\1\42\1\43\1\uffff\1\53\2\uffff\21\43\1\uffff"+
        "\3\43\1\40\17\43\1\uffff\2\43\1\141\1\uffff\1\42\32\43\1\uffff\3"+
        "\43\1\uffff\15\43\1\164\4\43\1\uffff\1\43\1\uffff\2\43\1\uffff\6"+
        "\43\1\40\13\43\1\uffff\2\43\1\uffff\1\40\6\43\1\uffff\4\43\1\145"+
        "\1\40\2\43\1\uffff\10\43\1\uffff\15\43\1\uffff\3\43\1\uffff\2\43"+
        "\1\40\3\43\1\40\1\uffff\1\43\1\40\6\43\1\40\1\uffff\13\43\1\uffff"+
        "\3\43\1\40\1\uffff\1\43\2\uffff\4\43\5\uffff\2\43\1\uffff\2\43\2"+
        "\uffff\5\43\1\uffff\1\43\2\uffff\1\43\1\uffff\3\43\1\uffff\6\43"+
        "\1\uffff\2\43\1\uffff\3\43\1\uffff\2\43\2\uffff\4\43\1\uffff\4\43"+
        "\1\uffff\2\43\1\uffff\1\43\6\uffff\1\43\3\uffff";
    static final String DFA14_maxS =
        "\22\172\1\162\3\172\1\71\10\uffff\5\172\1\uffff\33\172\1\145\2\172"+
        "\1\uffff\1\71\2\uffff\21\172\1\uffff\23\172\1\uffff\2\172\1\141"+
        "\1\uffff\33\172\1\uffff\3\172\1\uffff\15\172\1\164\4\172\1\uffff"+
        "\1\172\1\uffff\2\172\1\uffff\22\172\1\uffff\2\172\1\uffff\7\172"+
        "\1\uffff\4\172\1\145\3\172\1\uffff\10\172\1\uffff\15\172\1\uffff"+
        "\3\172\1\uffff\6\172\1\40\1\uffff\11\172\1\uffff\13\172\1\uffff"+
        "\4\172\1\uffff\1\172\2\uffff\4\172\5\uffff\2\172\1\uffff\2\172\2"+
        "\uffff\5\172\1\uffff\1\172\2\uffff\1\172\1\uffff\3\172\1\uffff\6"+
        "\172\1\uffff\2\172\1\uffff\3\172\1\uffff\2\172\2\uffff\4\172\1\uffff"+
        "\4\172\1\uffff\2\172\1\uffff\1\172\6\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\27\uffff\1\66\1\70\1\71\1\72\1\73\1\74\1\75\1\76\5\uffff\1\63\36"+
        "\uffff\1\64\1\uffff\1\65\1\67\21\uffff\1\33\23\uffff\1\41\3\uffff"+
        "\1\63\33\uffff\1\42\3\uffff\1\30\22\uffff\1\60\1\uffff\1\57\2\uffff"+
        "\1\53\22\uffff\1\20\2\uffff\1\61\7\uffff\1\56\10\uffff\1\34\10\uffff"+
        "\1\5\15\uffff\1\31\3\uffff\1\52\7\uffff\1\62\11\uffff\1\4\13\uffff"+
        "\1\51\4\uffff\1\26\1\uffff\1\32\1\43\4\uffff\1\13\1\44\1\2\1\10"+
        "\1\7\2\uffff\1\3\2\uffff\1\54\1\17\5\uffff\1\36\1\uffff\1\15\1\16"+
        "\1\uffff\1\37\3\uffff\1\47\6\uffff\1\11\2\uffff\1\12\3\uffff\1\25"+
        "\2\uffff\1\50\1\45\4\uffff\1\55\4\uffff\1\24\2\uffff\1\1\1\uffff"+
        "\1\35\1\6\1\21\1\22\1\14\1\46\1\uffff\1\40\1\23\1\27";
    static final String DFA14_specialS =
        "\u015a\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\36\1\uffff\2\36\22\uffff\1\36\1\uffff\1\24\2\27\2\uffff\1"+
            "\27\1\34\1\33\1\35\1\30\1\32\1\31\1\26\1\uffff\12\25\7\uffff"+
            "\1\23\1\15\1\1\1\2\1\16\1\13\1\14\1\23\1\6\2\23\1\11\1\7\1\10"+
            "\1\20\1\3\1\23\1\17\1\12\1\5\1\4\1\21\4\23\4\uffff\1\27\1\uffff"+
            "\2\27\1\22\27\27",
            "\2\43\13\uffff\12\43\7\uffff\7\43\1\41\3\43\1\42\2\43\1\40\2"+
            "\43\1\37\10\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\47\3\43\1\46\3\43\1\45\21\43"+
            "\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\2\43\1\50\16\43\1\51\10\43\4\uffff"+
            "\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\52\4\43\1\53\7\43\4\uffff"+
            "\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\54\7\43\1\55\21\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\56\14\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\60\7\43\1\57\21\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\62\11\43\1\61\5\43\1\63"+
            "\5\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\64\13\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\65\6\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\70\2\43\1\67\2\43\1\66"+
            "\10\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\71\10\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\73\10\43\1\72\5\43\4\uffff"+
            "\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\74\14\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\75\25\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\76\14\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\77\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\1\100",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\27\13\uffff\12\27\7\uffff\32\101\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\2\27\11\uffff\1\105\1\uffff\12\102\7\uffff\4\27\1\104\25\27"+
            "\4\uffff\1\27\1\uffff\32\27",
            "\12\105",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\107\25\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\14\43\1\111\1\110\14\43\4\uffff"+
            "\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\112\23\43\1\113\5\43\4\uffff"+
            "\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\114\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\115\7\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\5\43\1\116\24\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\117\6\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\120\6\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\121\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\122\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\123\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\43\1\124\30\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\14\43\1\125\15\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\130\2\uffff\2\43\13\uffff\12\43\7\uffff\10\43\1\127\12\43"+
            "\1\126\6\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\131\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\27\43\1\132\2\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\2\43\1\133\20\43\1\134\1\43\1\135"+
            "\4\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\27\43\1\136\2\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\14\43\1\137\15\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\43\1\140\4\43\1\141\6\43\1\142"+
            "\14\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\143\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\144\25\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\145\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\146\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\147\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\5\43\1\150\24\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\151\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\152\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\5\43\1\153\24\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\1\154\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\156\5\43\1\155\10\43\4"+
            "\uffff\1\43\1\uffff\32\27",
            "\1\157",
            "\1\160\2\161\13\uffff\12\161\7\uffff\32\161\4\uffff\1\161\1"+
            "\uffff\32\27",
            "\2\27\11\uffff\1\105\1\uffff\12\102\7\uffff\4\27\1\104\25\27"+
            "\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\105\1\uffff\1\105\2\uffff\12\162",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\1\163\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\164\7\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\17\43\1\165\12\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\166\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\167\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\43\1\170\30\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\171\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\172\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\173\25\43\4\uffff\1\43\1"+
            "\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\5\43\1\175\2\43\1\176\13\43\1\174"+
            "\1\177\4\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\14\43\1\u0080\15\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\20\43\1\u0081\11\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0082\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u0083\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0084\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0085\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u0086\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0087\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0088\16\43\1\u0089\6\43"+
            "\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u008b\15\43\1\u008a\13\43\4\uffff"+
            "\1\43\1\uffff\32\27",
            "\1\u008c\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u008d\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u008e\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\43\1\u008f\30\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\6\43\1\u0091\23\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\6\43\1\u0092\23\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u0093\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0094\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0095\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u0096\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\24\43\1\u0097\5\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\5\43\1\u0098\24\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\43\1\u0099\30\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\43\1\u009a\30\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u009b\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\2\43\1\u009c\27\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u009d\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\u009e",
            "",
            "\1\160\2\161\13\uffff\12\161\7\uffff\32\161\4\uffff\1\161\1"+
            "\uffff\32\27",
            "\2\27\13\uffff\12\u009f\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00a0\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00a1\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\24\43\1\u00a2\5\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\12\43\1\u00a4\17\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\43\1\u00a6\30\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\24\43\1\u00a7\5\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u00a9\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00aa\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u00ab\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00ac\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00ad\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\24\43\1\u00ae\5\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\6\43\1\u00af\23\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00b0\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u00b1\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\6\43\1\u00b2\23\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u00b3\10\43\1\u00b4\10"+
            "\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\27\43\1\u00b5\2\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\27\43\1\u00b6\2\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00b7\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\14\43\1\u00b8\15\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\2\43\1\u00b9\27\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u00ba\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00bc\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u00bd\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00c0\3\43\1\u00bf\25\43\4\uffff"+
            "\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u00c1\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u00c2\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00c3\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\17\43\1\u00c4\12\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00c5\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u00c7\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00c8\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\7\43\1\u00c9\22\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\3\43\1\u00ca\26\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\u00cb",
            "\2\27\13\uffff\12\u009f\7\uffff\32\27\4\uffff\1\27\1\uffff\32"+
            "\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00cc\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00cd\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00ce\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u00d0\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u00d1\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00d2\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00d3\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\2\43\1\u00d4\27\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00d5\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00d6\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00d7\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\u00d8\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u00d9\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00da\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00db\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00dc\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00dd\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00de\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00df\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00e0\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\17\43\1\u00e1\12\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\7\43\1\u00e2\22\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u00e3\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00e4\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u00e5\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\1\u00e6\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\6\43\1\u00e7\23\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u00e8\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\6\43\1\u00e9\23\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u00eb\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00ec\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00ed\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00ee\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00ef\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00f0\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\1\u00f1",
            "\1\u00f2\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00f3\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00f4\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00f5\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u00f6\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\3\43\1\u00f7\26\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u00f8\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00f9\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u00fa\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\30\43\1\u00fb\1\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\17\43\1\u00fd\12\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u00fe\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u00ff\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u0100\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0101\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0102\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0103\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0104\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u0105\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0106\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\3\43\1\u0107\26\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\6\43\1\u0109\23\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u010a\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u010b\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u010c\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\u010e\1\uffff\32"+
            "\27",
            "\1\u010f\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0111\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\21\43\1\u0112\10\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u0113\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\u00f2",
            "",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u0114\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\u0115\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u011a\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\10\43\1\u011b\21\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\u011c\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\1\u011d\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\14\43\1\u011e\15\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u0121\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0122\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0123\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u0124\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0125\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\1\u0127\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u012a\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\1\u012b\2\uffff\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1"+
            "\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\17\43\1\u012c\12\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\2\43\1\u012d\27\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\2\43\1\u012e\7\43\7\uffff\32\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0130\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0131\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\1\u0132\31\43\4\uffff\1\43\1\uffff"+
            "\32\27",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\u0133\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\2\43\1\u0134\27\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\17\43\1\u0135\12\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u0137\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u0138\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u013a\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u013b\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u013c\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\u013e\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u013f\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\23\43\1\u0142\6\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u0143\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\15\43\1\u0144\14\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u0145\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u0147\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u0148\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u0149\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u014a\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\16\43\1\u014c\13\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\22\43\1\u014d\7\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\4\43\1\u014f\25\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\13\43\1\u0156\16\43\4\uffff\1\43"+
            "\1\uffff\32\27",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\43\13\uffff\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\27",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | CREATETABLE | ID | N | NUMBER | UPPERLOWERQ | POINT | PLUS | MINUS | COMMA | RPAREN | LPAREN | ASTERISK | WHITESPACE );";
        }
    }
 

}
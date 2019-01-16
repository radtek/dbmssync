lexer grammar TableDDL;
options {
  language=Java;

}
@header {
package com.blackntan.dbmssync.antlr.oracle;
}

T17 : 'CONSTRAINT' ;
T18 : 'DEFAULT' ;
T19 : 'PRIMARY KEY' ;
T20 : 'UNIQUE' ;
T21 : 'USING INDEX' ;
T22 : 'TABLESPACE' ;
T23 : 'PCTFREE' ;
T24 : 'PCTUSED' ;
T25 : 'INITRANS' ;
T26 : 'MAXTRANS' ;
T27 : 'COMPUTE STATISTICS' ;
T28 : 'NOCOMPRESS' ;
T29 : 'LOGGING' ;
T30 : 'STORAGE' ;
T31 : 'INITIAL' ;
T32 : 'NEXT' ;
T33 : 'MINEXTENTS' ;
T34 : 'MAXEXTENTS' ;
T35 : 'PCTINCREASE' ;
T36 : 'FREELISTS' ;
T37 : 'FREELIST' ;
T38 : 'GROUPS' ;
T39 : 'BUFFER_POOL' ;
T40 : 'LOB' ;
T41 : 'STORE AS' ;
T42 : 'ENABLE STORAGE' ;
T43 : 'IN ROW' ;
T44 : 'CHUNK' ;
T45 : 'PCTVERSION' ;
T46 : 'NOCACHE' ;
T47 : 'FOREIGN KEY' ;
T48 : 'REFERENCES' ;
T49 : 'ON DELETE SET NULL' ;
T50 : 'NOT NULL' ;
T51 : 'ENABLE' ;
T52 : 'DISABLE' ;
T53 : 'VALIDATE' ;
T54 : 'NOVALIDATE' ;
T55 : 'VARCHAR' ;
T56 : 'VARCHAR2' ;
T57 : 'NUMBER' ;
T58 : 'FLOAT' ;
T59 : 'DATE' ;
T60 : 'INTEGER' ;
T61 : 'TIMESTAMP' ;
T62 : 'BLOB' ;
T63 : 'CLOB' ;
T64 : 'CHAR' ;
T65 : 'LONG' ;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 134
CREATETABLE
	:	'CREATE TABLE'
	|	'create table'
	;

//DOUBLEQUOTED_STRING
//	:	'"' ( ~('"') )* '"'
//	;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 143
ID /*options { testLiterals=true; }*/
	:	'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
//    |	DOUBLEQUOTED_STRING
	|	'"' 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* '"'
	;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 149
N
	:	'0' .. '9' ( '0' .. '9' )*
	;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 153
NUMBER
	:	//( PLUS | MINUS )?
		(	( N POINT N ) => N POINT N
		|	POINT N
		|	N
		)
		( 'E' ( PLUS | MINUS )? N )?
	;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 162
UPPERLOWERQ
	:	( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+
	|	'"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '"'
	|	'\'' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\''
	;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 168
POINT
	:	'.'
	;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 171
PLUS
	:	'+'
	;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 174
MINUS
	:	'-'
	;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 177
COMMA
	:	','
	;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 180
RPAREN
	:	')'
	;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 183
LPAREN
	:	'('
	;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 186
ASTERISK
	:	'*'
	;		
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/oracle/TableDDL.g" 189
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;


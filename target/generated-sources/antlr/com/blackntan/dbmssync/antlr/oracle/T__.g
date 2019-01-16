lexer grammar T;
options {
  language=Java;

}
@header {package com.blackntan.dbmssync.antlr;}

T7 : 'int' ;
T8 : '=' ;
T9 : ';' ;
T10 : 'public' ;
T11 : 'static' ;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g" 20
INT 
	: '0'..'9'+ 
	;
	
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g" 24
ID
	: 'a'..'z'+ 
	;
	
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/T.g" 28
WS
	: (' '|'\r'|'\n')+ {$channel = HIDDEN;} 
	;

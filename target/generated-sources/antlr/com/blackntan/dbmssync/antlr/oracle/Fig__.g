lexer grammar Fig;
@header {
package com.blackntan.dbmssync.antlr;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
}

T9 : '{' ;
T10 : '}' ;
T11 : '=' ;
T12 : ';' ;
T13 : '$' ;
T14 : '[' ;
T15 : ']' ;
T16 : ',' ;
T17 : '.' ;

// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g" 56
STRING : '"' .* '"' {setText(getText().substring(1, getText().length()-1));} ;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g" 57
INT :   '0'..'9'+ ;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g" 58
ID  :   ('_'|'a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')* ;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g" 59
WS  :   (' '|'\n'|'\t')+ {$channel=HIDDEN;} ;
// $ANTLR src "/Users/jcolson/src/personal/dbmssync/src/main/antlr/com/blackntan/dbmssync/antlr/Fig.g" 60
CMT :   '/*' .* '*/'     {$channel=HIDDEN;} ;

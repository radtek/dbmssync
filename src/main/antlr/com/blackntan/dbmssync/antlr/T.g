grammar T;
options { 
  language=Java; 
}

@parser::header {package com.blackntan.dbmssync.antlr;}

@lexer::header{package com.blackntan.dbmssync.antlr;}

def
	: modifier+ 'int' ID '=' INT ';'
	| modifier+ 'int' ID ';'
	;
    
modifier  
	: 'public' 
	| 'static' 
	;

INT 
	: '0'..'9'+ 
	;
	
ID
	: 'a'..'z'+ 
	;
	
WS
	: (' '|'\r'|'\n')+ {$channel = HIDDEN;} 
	;

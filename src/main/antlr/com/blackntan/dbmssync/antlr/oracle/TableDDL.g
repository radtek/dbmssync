grammar TableDDL;
options { 
  language=Java; 
}

@parser::header {
package com.blackntan.dbmssync.antlr.oracle;
import com.blackntan.dbmssync.xsd.dbSchemaV1.*;
import java.math.BigInteger;
}

@lexer::header{
package com.blackntan.dbmssync.antlr.oracle;
}

createTable returns [CtTable tb]
    :   {$tb = CtTable.Factory.newInstance();CtColumns ctColumns = $tb.addNewColumns();}
    	CREATETABLE (schema=ID POINT)? {$tb.setSchemaName($schema.text);} 
    	tablename=ID {$tb.setObjectName($tablename.text);} 
    	LPAREN columns {CtColumn[] cbA = new CtColumn[$columns.cbAl.size()];ctColumns.setColumnArray($columns.cbAl.toArray(cbA));} 
    	(
    		(COMMA pkA=primarykey {$tb.setPrimaryKey($pkA.pk);}) 
	    	|(COMMA 'CONSTRAINT' cnA=ID pkB=primarykey) {$pkB.pk.setObjectName($cnA.text);$tb.setPrimaryKey($pkB.pk);}
    	)?
    	(COMMA 'CONSTRAINT' cnB=ID (foreignkey)? (uniquekey)?)* 
    	RPAREN (pctfreeinfo)? (tablespaceinfo)? (lobinfo)*
    ;

columns returns [ArrayList<CtColumn> cbAl]
    :   {$cbAl = new ArrayList<CtColumn>();}
    	//column {cbAl.add($column.cb);} 
    	((COMMA)? column {$cbAl.add($column.cb);})*
    ; 
    
column returns [CtColumn cb]
    :   {$cb = CtColumn.Factory.newInstance();}
    	ID {$cb.setObjectName($ID.text);} datatype {$cb.setDataType($datatype.db);} 
    	('DEFAULT' defaultvalue{$cb.setDefaultValue($defaultvalue.text);})? (notnull {$cb.addNewNotNull();})?
    ; 

primarykey returns [CtPrimaryKey pk]
	:	{$pk = CtPrimaryKey.Factory.newInstance();}
		'PRIMARY KEY' LPAREN ((COMMA)? columnname=ID {$pk.addNewColumnName().setStringValue($columnname.text);})+ 
		RPAREN (indexinfo)? (pctfreeinfo)? (tablespaceinfo)? (constraintstate)?
	;

uniquekey
	:	'UNIQUE' LPAREN columnname=ID (COMMA columnname2=ID)* RPAREN (indexinfo)? (tablespaceinfo)? (constraintstate)?
	;
	
indexinfo
	:	('USING INDEX')
	;

tablespaceinfo
	:	'TABLESPACE' tablespacename
	;

tablespacename
	:	ID
	;

//todo left off here
pctfreeinfo returns [CtIndexInfo ii]
	:	{$ii = CtIndexInfo.Factory.newInstance();}
		'PCTFREE' N? ('PCTUSED' N)? ('INITRANS' N)? ('MAXTRANS' N)? ('COMPUTE STATISTICS')? ('NOCOMPRESS')? ('LOGGING')?
		('STORAGE' LPAREN ('INITIAL' N)? ('NEXT' N)? ('MINEXTENTS' N)? ('MAXEXTENTS' N)?
		('PCTINCREASE' N)? ('FREELISTS' N)? ('FREELIST')? ('GROUPS' N)? ('BUFFER_POOL')? ('DEFAULT')? RPAREN)?
	;

lobinfo
	: 	'LOB' LPAREN columnname=ID RPAREN 'STORE AS' LPAREN
		'TABLESPACE' tablespacename 'ENABLE STORAGE' 'IN ROW' 'CHUNK' N 'PCTVERSION' N
		('NOCACHE')? ('LOGGING')?
		('STORAGE' LPAREN 'INITIAL' N 'NEXT' N 'MINEXTENTS' N 'MAXEXTENTS' N
		'PCTINCREASE' N 'FREELISTS' N 'FREELIST' 'GROUPS' N 'BUFFER_POOL' 'DEFAULT'RPAREN RPAREN)?
	;
	
foreignkey
	:	'FOREIGN KEY' LPAREN columnname=ID (COMMA columnname2=ID)* RPAREN 'REFERENCES' (schema=ID POINT)? 
		tablename=ID LPAREN columnname3=ID (COMMA columnname4=ID)* RPAREN
		('ON DELETE SET NULL')? (constraintstate)?
	;

defaultvalue
	:	ID
	|	N
	|	UPPERLOWERQ
	;

notnull
	:	'NOT NULL' (constraintstate)?
	;

constraintstate
	:	'ENABLE'
	|       'DISABLE'
	|	'VALIDATE'
	|	'NOVALIDATE'
	;
    
datatype returns [CtDataType db]
    :   {$db = CtDataType.Factory.newInstance();}
        datatypename {$db.setDataTypeName($datatypename.text);} (size{$db.setLength($size.length);if ($size.prec != null) $db.setPrecision($size.prec);})?
    ; 
    
datatypename
	:	'VARCHAR'
        |	'VARCHAR2'
        |	'NUMBER'
        |	'FLOAT'
        |	'DATE'
        |	'INTEGER'
        |	'TIMESTAMP'
        |	'BLOB'
        |	'CLOB'
        |	'CHAR'
        |	'LONG'
        ;
    
size returns [String length, String prec]
    	:	LPAREN sizeprec {$length = $sizeprec.text;} (COMMA precision {$prec = $precision.text;})? RPAREN
	;

precision
	:	sizeprec
	;	

sizeprec
	: 	ASTERISK
	|	N
	;

CREATETABLE
	:	'CREATE TABLE'
	|	'create table'
	;

//DOUBLEQUOTED_STRING
//	:	'"' ( ~('"') )* '"'
//	;

ID /*options { testLiterals=true; }*/
	:	'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )*
//    |	DOUBLEQUOTED_STRING
	|	'"' 'A' .. 'Z' ( 'A' .. 'Z' | '0' .. '9' | '_' | '$' | '#' )* '"'
	;

N
	:	'0' .. '9' ( '0' .. '9' )*
	;

NUMBER
	:	//( PLUS | MINUS )?
		(	( N POINT N ) => N POINT N
		|	POINT N
		|	N
		)
		( 'E' ( PLUS | MINUS )? N )?
	;

UPPERLOWERQ
	:	( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+
	|	'"' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '"'
	|	'\'' ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' | '_' | '$' | '#' )+ '\''
	;

POINT
	:	'.'
	;
PLUS
	:	'+'
	;
MINUS
	:	'-'
	;
COMMA
	:	','
	;
RPAREN
	:	')'
	;
LPAREN
	:	'('
	;
ASTERISK
	:	'*'
	;		
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ 	{ $channel = HIDDEN; } ;


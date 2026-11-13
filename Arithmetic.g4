grammar Arithmetic;

start:
	Newline* expression EOF;

expression:
	Variable space* '=' space* type indents expression
	| Variable space* Operation? '=' space* num math? indents expression 
	| ;

space:
	' '
	| '\t' ;

math:
	space* (Operation) space* num math
	| space* (Operation) space* num ;

Operation:
	('+' | '-' | '*' | '/' | '%') ;

type:
	Int
	| Str
	| Float
	| Boolean
	| list
	| Variable ; 

num:
	'-'?Int
	| '-'?Float 
	| Variable ;

Int:
	'0'
	| [1-9] ('_'? [0-9])* ;

Str:
	'"'([a-zA-Z0-9 ,?!;()'] | '\\\'' | '\\"')*'"' 
	|'\''([a-zA-Z0-9 ,?!;()"] | '\\\'' | '\\"')*'\'' ;

Float:
	(Int | '0'*) '.' [0-9] ('_'? [0-9])* ;

Boolean:
	'True'
	| 'False' ;

Variable:
	[a-zA-Z_][a-zA-Z0-9_]*;

list:
	'[' space* ']'
	| '[' typelist ']';

typelist:
	space* type space*','space* typelist space*
	| space* type space* ','? space*;

indents:
	Newline+ ;

Newline:
	'\n' ; 

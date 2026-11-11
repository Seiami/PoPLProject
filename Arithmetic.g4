grammar Arithmetic;

start:
	'\n'* Expression EOF;

Expression:
	Variable ' '* Operation '=' ' '* Num Math Indents Expression 
	| ;

Math:
	' '* (Operation | '%') ' '* Math
	| ;

Operation:
	('+' | '-' | '*' | '/' | '') ;

Variable:
	[a-zA-Z][a-zA-Z0-9]*;

Num:
	0
	| [1-9] ('_'* [0-9] '_'*)*
	| Variable;

Indents:
	'\n' Indents
	| '\n';
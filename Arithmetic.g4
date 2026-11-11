grammar Arithmetic;

start:
	'\n'* Expression EOF;

Expression:
	Assignment ' '* '=' ' '* Num Indents Expression 
	| ;

Assignment:
	[a-zA-Z][a-zA-Z0-9]*;

Num:
	0
	| [1-9] ('_'* [0-9] '_'*)*;

Indents:
	'\n' Indents
	| '\n';
grammar Arithmetic;

start:
	next* unindented_statement EOF;

next: 
    space* '\n';

space : 
    ' ' | '\t';

unindented_statement: 
    if_statement (next+ unindented_statement)?
    | var_assignment (next+ unindented_statemen)?
    | var_operation (next+ unindented_statement)?
    | ;
    
var_assignment:
    variable space* '=' space* (type | equation) next+
    ;
    
var_operation:
    variable space* operator '=' space* (number|variable|equation) next+
    ;

if_statement:
    'if' equality space* ':' '\n' indented_statement next
    (elif_statement next+)*
    (else_statement next+)?
    ;

elif_statement:
    'elif' equality space* ':' '\n' indented_statement next;

else_statement:
    'else' equality space* ':' '\n' indented_statement next;

indented_statement:
    '\t'var_assignment (next+ indented_statement)?
    | '\t' var_operation (next+ indented_statement)?
    ;

type: 
    variable
    | boolean
    | number
    | string
    | list
    ;

equality: '('? 'not'? type (comp_operator type)? ')'? (('and' | 'or') equality)?;
    
equation: number (math_operator number)*;
    
number: int | float;

math_operator: ('+' | '-' | '*' | '/' | '%');

comp_operator: ('==' | '!=' | '<=' | '>=' | '<' | '>');

int: '-'? [1-9][_0-9]* | '0';

float: int? '.' [0-9]*;

variable: [_a-zA-Z][_a-zA-Z0-9]*;

boolean: 'True' | 'False';

string: '"' ~["]* '"';

list: '[' space* ']'
    | '[' space* type space* (',' space* type space*)* ']'
    ;

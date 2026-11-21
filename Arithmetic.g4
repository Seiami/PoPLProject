grammar Arithmetic;

start:
	next* unindented_statement EOF;

next: 
    space* '\n';

space : 
    ' ' | '\t';

unindented_statement: 
    if_statement (next+ unindented_statement)?
    | var_assignment (next+ unindented_statement)?
    | var_operation (next+ unindented_statement)?
    | ;
    
var_assignment:
    VARIABLE space* '=' space* (type | equation) next+
    ;
    
var_operation:
    VARIABLE space* math_operator '=' space* (number|VARIABLE|equation) next+
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
    VARIABLE
    | BOOLEAN
    | number
    | STRING
    | list
    ;

equality: '('? 'not'? type (comp_operator type)? ')'? (('and' | 'or') equality)?;
    
equation: number (math_operator number)*;
    
number: INT | FLOAT;

math_operator: ('+' | '-' | '*' | '/' | '%');

comp_operator: ('==' | '!=' | '<=' | '>=' | '<' | '>');

INT: '-'?('0' | [1-9] [0-9_]*);

FLOAT: INT? '.' [0-9]*;

VARIABLE: [_a-zA-Z][_a-zA-Z0-9]*;

BOOLEAN: 'True' | 'False';

STRING: '"' ~["]* '"';

list: '[' space* ']'
    | '[' space* type space* (',' space* type space*)* ']'
    ;

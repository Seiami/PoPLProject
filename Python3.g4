grammar Python3;

start:
	next* unindented_statement EOF;

next: 
    space* '\r'? '\n';

space : 
    ' ' | '\t';

unindented_statement:
    (if_statement | var_assignment | var_operation)
    (next+ unindented_statement)?
    ;
    
var_assignment:
    VARIABLE space* '=' space* (equation | type)
    ;
    
var_operation:
    VARIABLE space* math_operator '=' space* (number|VARIABLE|equation)
    ;

if_statement:
    'if' space* equality space* ':' '\r'? '\n' indented_statement
    (next+ elif_statement)*
    (next+ else_statement)?
    ;

elif_statement:
    'elif' space* equality space* ':' '\r'?'\n' indented_statement;

else_statement:
    'else' space* ':' '\r'?'\n' indented_statement;

indented_statement:
    '\t' var_assignment (next+ indented_statement)?
    | '\t' var_operation (next+ indented_statement)?
    ;

type: 
    VARIABLE
    | BOOLEAN
    | number
    | STRING
    | list
    | CHAR
    ;

equality: '('? 'not'? space* type space* (comp_operator space* type)? ')'? space* (('and' | 'or') space* equality)?;
    
equation: number (space* math_operator space* number)*;
    
number: ('+' | '-')? (INT | FLOAT)
| VARIABLE;

math_operator: ('+' | '-' | '*' | '/' | '%');

comp_operator: ('==' | '!=' | '<=' | '>=' | '<' | '>');

INT: ('0' | [1-9] [0-9_]*);

FLOAT: INT? '.' [0-9]*;

VARIABLE: [_a-zA-Z][_a-zA-Z0-9]*;

BOOLEAN: 'True' | 'False';

STRING: '"' ~["]* '"';

CHAR: '\'' ~[']* '\'';

list: '[' space* ']'
    | '[' space* type space* (',' space* type space*)* ']'
    ;

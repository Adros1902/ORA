grammar ORA;

query : expression EOF ;

// Expressions
expression
    : pickExpression #pick
    | addExpression #add
    | updateExpression #update
    | removeExpression #remove
    ;

// pick
pickExpression : ID '.' 'pick' '(' pickParams ')' ';';

pickParams
    : '{' pickParam (',' pickParam)* '}'
    ;

pickParam
    : 'fields' ':' array #fields
    | 'if' ':' condition #if
    | 'sort' ':' sortParam #sort
    | 'maxRecords' ':' INT #maxRecords
    ;

// add
addExpression : ID '.' 'add' '(' assignmentList ')' ';' #addExpr;

// update
updateExpression : ID '.' 'update' '(' '{' 'set' ':' setList (',' 'if' ':' condition)? '}' ')' ';'
                 | ID '.' 'update' '(' '{' ('if' ':' condition (',')) ('set' ':' setList) '}' ')' ';'
                 ;

// remove
removeExpression : ID '.' 'remove' '(' '{' 'if' ':' condition '}' ')' ';' #removeExpr ;

// General rules
condition
    : expressionAtom ((AND | OR) expressionAtom)*
    ;

expressionAtom
    : ID (EQ | NEQ | LT | GT | LE | GE) value #expressionsAtom
    | NOT expressionAtom #notExpressionAtom
    | '(' condition ')' #paranthesizedCondition
    ;

sortParam : ID '.' ('upward' | 'downward') '()';

assignmentList : '{' assignment (',' assignment)* '}';

setList: '[' assignment (',' assignment)* ']' ;

assignment : ID '=' value;

array : '[' ID (',' ID)* ']';

value
    : STRING #string
    | INT #int
    | FLOAT #float
    ;

// Lexer rules
EQ  : '==';
NEQ : '!=';
LT  : '<';
GT  : '>';
LE  : '<=';
GE  : '>=';
AND: [aA][nN][dD];
OR: [oO][rR];
NOT : 'not';

ID     : [a-zA-Z_][a-zA-Z_0-9]* ;
STRING : '"' (~["\r\n])* '"';
INT    : [0-9]+;
FLOAT  : [0-9]+ '.' [0-9]+ ;
WS     : [ \t\r\n]+ -> skip;



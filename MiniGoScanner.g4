lexer grammar MiniGoScanner;

// Tokens


INTLITERAL      : [0-9]+;
FLOATLITERAL    : [0-9]+'.'[0-9]+;
RUNELITERAL     : '\'' . '\'';
RAWSTRINGLITERAL : '`' ( '\\' . | ~('\\'|'`') )* '`';
INTERPRETEDSTRINGLITERAL : '"' ( '\\' . | ~('\\'|'"') )* '"';
PACKAGE         : 'package';
VAR             : 'var';
TYPE            : 'type';
FUNC            : 'func';
STRUCT          : 'struct';
LEN             : 'len';
CAP             : 'cap';
PRINT           : 'print';
PRINTLN         : 'println';
RETURN          : 'return';
BREAK           : 'break';
CONTINUE        : 'continue';
APPEND          : 'append';
IF              : 'if';
ELSE            : 'else';
FOR             : 'for';
SWITCH          : 'switch';
CASE            : 'case';
DEFAULT         : 'default';
IDENTIFIER      : [a-zA-Z_][a-zA-Z0-9_]*;
PLUS            : '+';
MINUS           : '-';
MULTIPLY        : '*';
DIVIDE          : '/';
MODULO          : '%';
LESS            : '<';
LESSEQUAL       : '<=';
GREATER         : '>';
GREATEREQUAL    : '>=';
EQUAL           : '==';
NOTEQUAL        : '!=';
AND             : '&&';
OR              : '||';
NOT             : '!';
BITWISEAND      : '&';
BITWISEOR       : '|';
BITWISEXOR      : '^';
BITWISECLEAR    : '&^';
SHIFTLEFT       : '<<';
SHIFTRIGHT      : '>>';
INCREMENT       : '++';
DECREMENT       : '--';
ASSIGN          : '=';
PLUSEQUAL       : '+=';
MINUSEQUAL      : '-=';
MULTIPLYEQUAL   : '*=';
DIVIDEEQUAL     : '/=';
MODULOEQUAL     : '%=';
BITWISEANDEQUAL : '&=';
BITWISEOREQUAL  : '|=';
BITWISEXOREQUAL : '^=';
SHIFTLEFTEQUAL  : '<<=';
SHIFTRIGHTEQUAL : '>>=';
BITWISECLEAREQUAL : '&^=';
COLON           : ':';
SEMICOLON       : ';';
COMMA           : ',';
DOT             : '.';
LPAREN          : '(';
RPAREN          : ')';
LBRACKET        : '[';
RBRACKET        : ']';
LBRACE          : '{';
RBRACE          : '}';
SPACES: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
grammar GUI;

guiFile: component* EOF;

component
    : IDENTIFIER '(' argumentList ')' '{' (component | argumentList)* '}'  // Layouts com parâmetros e corpo
    | IDENTIFIER '{' (component | argumentList)* '}'                       // Layouts como Column sem parênteses
    | IDENTIFIER '(' argumentList ')'                                      // Componentes como Button, Text
    ;

argumentList
    : argument (',' argument)*  // Uma lista de argumentos
    ;

argument
    : IDENTIFIER '=' value               // Um argumento com um identificador simples
    | IDENTIFIER_COLON '=' value;        // Um argumento com um identificador que pode ter dois pontos

value
   : STRING
   | NUMBER
   | IDENTIFIER_DOT;  // Valor pode ser uma string, número, booleano ou um identificador com ponto

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;  // Um identificador para componentes e nomes de parâmetros
IDENTIFIER_COLON: [a-zA-Z_][a-zA-Z_0-9:]*;  // Um identificador que pode ter dois pontos
STRING: '"' (~["\\] | '\\' .)* '"';  // Um valor de string
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER_DOT: [a-zA-Z_][a-zA-Z_0-9]*('.'[a-zA-Z_][a-zA-Z_0-9]*)*;
WS: [ \t\r\n]+ -> skip;  // Espaços em branco são ignorados
grammar GUI;

guiFile: layout* EOF;  // O arquivo GUI pode ter múltiplos layouts e termina com EOF

layout
    : IDENTIFIER '{' (layout | component)* '}'  // Layouts como Column
    ;

component
    : IDENTIFIER '(' argumentList ')' ( '{' (layout | component)* '}' )?  // Componentes como Button, Text que podem se transformar em layouts
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
   | BOOLEAN
   | IDENTIFIER_DOT;  // Valor pode ser uma string, número, booleano ou um identificador com ponto

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;  // Um identificador para componentes e nomes de parâmetros
IDENTIFIER_COLON: [a-zA-Z_][a-zA-Z_0-9:]*;  // Um identificador que pode ter dois pontos
IDENTIFIER_DOT: [a-zA-Z_][a-zA-Z_0-9]*('.'[a-zA-Z_][a-zA-Z_0-9]*)*;  // Identificadores que suportam pontos, como Padding.five

NUMBER: [0-9]+ ('.' [0-9]+)?;  // Suporte para inteiros e floats
BOOLEAN: 'true' | 'false';  // Suporte para valores booleanos
STRING: '"' (~["\\] | '\\' .)* '"';  // Um valor de string
WS: [ \t\r\n]+ -> skip;  // Espaços em branco são ignorados
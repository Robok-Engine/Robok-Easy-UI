//compile code by ghost ide


//format code by gbost ide

grammar GUI;

guiFile
   : component* EOF
   ;

component
   : IDENTIFIER '{' (component | argumentList)* '}' // Layouts como Column
   | IDENTIFIER '(' argumentList ')' // Componentes como Button, Text
   
   ;

argumentList
   : argument (',' argument)* // Uma lista de argumentos
   
   ;

argument
   : IDENTIFIER '=' value // Um argumento com um identificador simples
   | IDENTIFIER_COLON '=' value
   ; // Um argumento com um identificador que pode ter dois pontos
   
value
   : STRING
   | NUMBER
   | IDENTIFIER_DOT
   ; // Valor pode ser uma string, número, booleano ou um identificador com ponto
   
fragment IDENTIFIERS
   : [a-zA-Z_] [a-zA-Z_0-9]*
   ;

IDENTIFIER
   : IDENTIFIERS
   ; // Um identificador para componentes e nomes de parâmetros
   
IDENTIFIER_COLON
   : ':' IDENTIFIERS
   ; // Um identificador que pode ter dois pontos
   
STRING
   : '"' (~ ["\\] | '\\' .)* '"'
   ; // Um valor de string
   
NUMBER
   : [0-9]+ ('.' [0-9]+)?
   ;

IDENTIFIER_DOT
   : '.' IDENTIFIER
   ;

WS
   : [ \t\r\n]+ -> skip
   ; // Espaços em branco são ignorados
   
COMMENT
   : '//' .*? -> channel (HIDDEN)
   ;

COMMENTLONG
   : '/*' .*? '*/' -> channel (HIDDEN)
   ;
   //using span to read colorHex
   
HEXCOLORREAD
   : '#' [a-fA-F0-9]*
   ;


grammar GUI;

guiFile: component* EOF;

component
    : IDENTIFIER '{' (component | argumentList)* '}'  // Layouts like Column, Row...
    | IDENTIFIER '(' argumentList ')'                 // Components like Button, Text
    ;

argumentList
    : argument (',' argument)*  // A list of arguments
    ;

argument
    : IDENTIFIER '=' value_atribute  // Uses an identifier and a value
    ;

value_atribute
    : STRING               // A string value
    | VALUE                // An identifier value (without colons)
    ;

VALUE
    : [a-zA-Z_][a-zA-Z_0-9]*;  // Identifiers without colons

IDENTIFIER
    : [a-zA-Z_][a-zA-Z_0-9:]*;  // Identifiers with letters, numbers, underscores, and colons

STRING: '"' (~["\\] | '\\' .)* '"';  // A string value
WS: [ \t\r\n]+ -> skip;  // Whitespace is skipped
grammar GUI;

guiFile: (component | attributeScope | attributeDefault)* EOF;

component
    : IDENTIFIER '(' argumentList ')' '{' (component | argumentList)* '}'  // Layouts with parameters and body
    | IDENTIFIER '{' (component | argumentList)* '}'                       // Layouts like Column without parentheses
    | IDENTIFIER '(' argumentList ')'                                      // Components like Button, Text
    ;

attributeScope
    : IDENTIFIER '(' STRING ')' '{' (component | argumentList)* '}'  // Scoped attribute
    | IDENTIFIER '(' STRING ')'                                      // Global attribute without scoped block
    ;
    
attributeDefault
    : DEFAULT '(' argumentList ')' '{' (component | argumentList)* '}'  // Scoped attribute using `argument`
    | DEFAULT '(' argumentList ')'                                      // Global attribute without scoped block
    ;
        
argumentList
    : argument (',' argument)*  // Argument list
    ;

argument
    : IDENTIFIER '=' value               // Argument with simple identifier
    | IDENTIFIER_COLON '=' value      // Argument with identifier that can include colons
    ;

value
   : STRING
   | NUMBER
   | IDENTIFIER_DOT;                    // Value can be a string, number, boolean, or identifier with dot notation

DEFAULT: 'default';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;       // Identifier for components and parameter names
IDENTIFIER_COLON: [a-zA-Z_][a-zA-Z_0-9:]*;  // Identifier that can include colons
STRING: '"' (~["\\] | '\\' .)* '"';        // String value
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER_DOT: [a-zA-Z_][a-zA-Z_0-9]*('.'[a-zA-Z_][a-zA-Z_0-9]*)*;

// Ignore whitespace and comments
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
HASH_COMMENT: '#' ~[\r\n]* -> skip;
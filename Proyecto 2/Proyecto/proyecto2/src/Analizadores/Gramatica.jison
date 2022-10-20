7**Definición lexica*/
%lex

%options case-sensitfa-inverse

%%

\s+                                     // espacios en blanco
"//"                                    // comentario simple
[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]	    //comentario multilinea


// Palabras reservadas
'int' return 'int';
'double' return 'double';
'boolean' return 'char';
'char' return 'char';
'string' return 'string';




/lex

%%
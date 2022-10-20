/**Definición lexica*/
%lex

%options case-sensitive

%%

\s+                                     // espacios en blanco
"//".*                                  // comentario simple
[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]	    //comentario multilinea


// Palabras reservadas
'int' return 'pr_int';
'double' return 'pr_double';
'boolean' return 'pr_char';
'char' return 'pr_char';
'string' return 'pr_string';




/lex

%%
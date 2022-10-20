/**Definición lexica*/
%lex

%options case-sensitive

%%

\s+                                     // espacios en blanco
"//".*                                  // comentario simple
[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]	    //comentario multilinea

//'' return ''; <--------------
// Palabras reservadas
'int' return 'pr_int';
'double' return 'pr_double';
'boolean' return 'pr_char';
'char' return 'pr_char';
'string' return 'pr_string';
'new' return 'pr_new';
'if' return 'pr_if';
'elif' return 'pr_elif';
'else' return 'pr_else';
'switch' return 'pr_switch';
'case' return 'pr_case';
'default' return 'pr_default';
'while' return 'pr_while';
'for' return 'pr_for';
'do' return 'pr_do';
'until' return 'pr_until';
'break' return 'pr_break';
'continue' return 'pr_continue';
'return' return 'pr_return';
'void' return 'pr_void';
'print' return 'pr_print';
'println' return 'pr_println';


// Signos
'=' return 'sb_igual';
'+' return 'sb_suma';
'-' return 'sb_resta';
'*' return 'sb_multiplicacion';
'/' return 'sb_division';
'^' return 'sb_potencia';
'%' return 'sb_modulo';
'>' return 'sb_mayor';
'<' return 'sb_menor';
'>=' return 'sb_mayorI';
'<=' return 'sb_menorI';
'==' return 'sb_igualQ';
'!=' return 'sb_diferente';
'?' return 'sb_ternario';
'||' return 'sb_or';
'&&' return 'sb_and';
'!' return 'sb_not';
'(' return 'sb_parentesisL';
')' return 'sb_parentesisR';
':' return 'sb_dosPuntos';
'{' return 'sb_llaveL';
'}' return 'sb_llaveR';
'++' return 'sb_incremento';
'--' return 'sb_decremento';
'[' return 'sb_corcheteL';
']' regurn 'sb_corcheteR';


// Patrones (Expresiones regulares [ER])
\"[^\"]*\"			{ yytext = yytext.substr(0,yyleng-0); return 'cadena'; }
\'[^\']*\'			{ yytext = yytext.substr(0,yyleng-0); return 'caracter'; }
[0-9]+("."[0-9]+)?\b  	return 'numero';
([a-zA-Z])[a-zA-Z0-9_]* return 'identificador';


// Fin del archivo
<<EOF>>     return 'EOF';


// Errores lexicos
.   {
  const er = new error_1.Error({ tipo: 'lexico', linea: `${yylineno + 1}`, descripcion: `El valor "${yytext}" no es valido, columna: ${yylloc.first_column + 1}` });
  errores_1.Errores.getInstance().push(er);
  }

/lex


// Importaciones 
%{

%}


// Precedence
%left 'sb_ternario'
%left 'sb_or'
%left 'sb_and'
%left 'sb_not'
%left 'sb_igualQ' 'sb_diferente'
%left 'sb_mayor' 'sb_menor' 'sb_mayorI' 'sb_menorI'
%left 'sb_mas' 'sb_menos'
%left 'sb_multiplicacion' 'sb_division' 'sb_modulo'
%left 'umenos'
%right 'sb_potencia'
%left 'sb_incremento' 'sb_decremento'



%%
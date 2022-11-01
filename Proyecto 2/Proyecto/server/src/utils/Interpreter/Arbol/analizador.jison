// Importaciones 
%{
  const controller = require('../../../controller/parser/parser');
  const errores = require('./Errors/error');
  const Tipo = require('./Symbol/Type');
  const nativo = require('./Expresions/Native')
  const impresion = require('./Instructions/Imprimir');
  const declaracion = require('./Instructions/Declaracion')

%}



/**Definición lexica*/
%lex

%options case-insensitive

%%

\s+                                     // espacios en blanco
"//".*                                  // comentario simple
[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]	    //comentario multilinea

//'' return ''; <--------------
// Palabras reservadas
'int' return 'pr_int';
'double' return 'pr_double';
'boolean' return 'pr_boolean';
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
';' return 'sb_pyc';
'{' return 'sb_llaveL';
'}' return 'sb_llaveR';
'++' return 'sb_incremento';
'--' return 'sb_decremento';
'[' return 'sb_corcheteL';
']' return 'sb_corcheteR';


// Patrones (Expresiones regulares [ER])
[ \r\t]+ { } //Espacios, tabulaciones, carritos..
\n {}        // Saltos de linea
[0-9]+          return 'entero';
^\d*\.\d+$      return 'double';
"False"|"True"  return 'boolean';
\'[^\']*\'			{ yytext = yytext.substr(0,yyleng-0); return 'caracter'; }
\"[^\"]*\"			{ yytext = yytext.substr(0,yyleng-0); return 'cadena'; }
([a-zA-Z])[a-zA-Z0-9_]*     return 'identificador';


// Fin del archivo
<<EOF>>     return 'EOF';

// Errores lexicos
.     {
  controller.listaErrores.push(new errores.default('ERROR LEXICO',`El valor "${yytext}" no es valido`, yylineno + 1, yylloc.first_column + 1));
}


/lex


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

%start INIT

%%

INIT : INSTRUCCIONES EOF   {return $1;}
;

INSTRUCCIONES : 
  INSTRUCCIONES INTRUCCION  {$1.push($2); $$=$1}
  | INSTRUCCION             {$$=[$1];}
;

INSTRUCCION :
  DECLARACION       {$$=$1;}
  | IMPRIMIR        {$$=$1;}
  | error    {controller.listaErrores.push(new errores.default(`ERROR SINTACTICO`,`No se esperaba token ${$2}`,@1.first_line,@1.first_column));}
;

EXPRESION :
  entero            {$$= new nativo.default(new Tipo.default(Tipo.DataType.ENTERO),$1, @1.first_line, @1.first_column);}
  | cadena          {$$= new nativo.default(new Tipo.default(Tipo.DataType.CADENA),$1, @1.first_line, @1.first_column);}
;


DECLARACION :
  pr_int identificador sb_igual EXPRESION sb_pyc   {$$= new declaracion.default($2, new Tipo.default(Tipo.DataType.ENTERO), $4, @1.first_line, @1.first_column);}
;

//Print(variable1__);
IMPRIMIR :
  pr_print sb_parentesisL EXPRESION sb_parentesisR sb_pyc   {$$=new impresion.default($3, @1.first_line, @1.first_column)}
;


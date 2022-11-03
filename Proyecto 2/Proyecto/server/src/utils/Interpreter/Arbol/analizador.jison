%{
    //codigo js
    const controller = require('../../../controller/parser/parser');
    const errores = require('./Errors/Error');
    const nativo = require('./Expresions/Native');
    const aritmetico = require('./Expresions/Aritmetica');
    const relacional = require('./Expresions/Relacional');
    const logica = require('./Expresions/Logica');
    const Tipo = require('./Symbol/Type');
    const impresion = require('./Instructions/Imprimir');    
    const declaracion = require('./Instructions/Declaracion')
    const asignacion = require('./Instructions/Asignacion')
    const ifIns = require('./Instructions/IfIns')
    const mientras = require('./Instructions/Mientras')
%}
%lex 


%options case-insensitive 
//inicio analisis lexico
%% 

"//".*                                  // { yytext=yytext.substr(1,yyleng-2); return 'comentarioL';}
[/][*][^*]*[*]+([^/*][^*]*[*]+)*[/]	    // { yytext=yytext.substr(1,yyleng-2); return 'comentarioM';}



"int"           return 'pr_int';
"string"        return 'pr_string';
"double"        return 'pr_double';
"boolean"       return  'pr_boolean';
"char"          return  'pr_char';
"if"            return 'pr_if';
"elif"          return 'pr_elif';
"else"          return 'pr_else';
"while"         return 'pr_while';
"print"         return 'pr_print';

// OPERADORES ARITMETICOS
"+"             return 'mas';
"-"             return 'menos';
"*"             return 'multiplicacion';
"/"             return 'division';
"%"             return 'modulo';
"^"             return 'potencia';

// OPERADORES RELACIONALES
">="             return 'mayor_igual';
">"             return 'mayor_que';
"<="             return 'menor_igual';
"<"             return 'menor_que';
"!="             return 'diferente';


// OPERADORES LOGICOS
"||"            return 'or';
"&&"            return 'and';
"!"             return 'not';

"=="            return 'igual_igual';
"="             return 'igual';
";"             return 'pyc';
","             return 'coma';
"("             return 'parentesisL';
")"             return 'parentesisR';
"["             return 'corcheteL';
"]"             return 'corcheteR';
"{"             return 'LlaveL';
"}"             return 'LlaveR';


[ \r\t]+ { }
\n {}
[0-9]+("."[0-9]+)\b         return 'decimal';
[0-9]+                      return 'entero';
"False"|"True"              return 'logico';
\"[^\"]*\"                  { yytext=yytext.substr(1,yyleng-2); return 'cadena'; }
[A-Za-z]+["_"0-9A-Za-z]*    return 'identificador';

<<EOF>>                     return 'EOF';
.   {
    controller.listaErrores.push(new errores.default('ERROR LEXICO',`El valor "${yytext}" no es valido`, yylineno + 1, yylloc.first_column + 1));
}

/lex
%left 'or'
%left 'and'
%right 'not'
%left 'mayor_que' 'menor_que' 'mayor_igual' 'menor_igual' 'diferente'
%left 'mas' 'menos'
%left 'multiplicacion' 'division'
%left 'potencia'
%right 'modulo'

%start INIT
//Inicio
//Definicion de gramatica
%%

INIT: INSTRUCCIONES EOF     {return $1;}
;

INSTRUCCIONES : 
    INSTRUCCIONES INSTRUCCION   {$1.push($2); $$=$1;}
    | INSTRUCCION               {$$=[$1];}
;

INSTRUCCION :
    IMPRIMIR                {$$=$1;}
    | DECLARACION           {$$=$1;}
    | ASIGNACION            {$$=$1;}
    | IF                    {$$=$1;}
    | WHILE                 {$$=$1;}
    | error  pyc         {controller.listaErrores.push(new errores.default(`ERROR SINTACTICO`,"Se esperaba token",@1.first_line,@1.first_column));}
;

DECLARACION:
    TIPO LISTA_VARIABLE igual EXPRESION pyc {$$=new declaracion.default($2, new Tipo.default(Tipo.DataType.ENTERO), $4, @1.first_line, @1.first_column);}
;

ASIGNACION:
    LISTA_VARIABLE igual EXPRESION pyc {$$ = new asignacion.default($1, $3, @1.first_line,@1.first_column );}
;


// Sentencia if, elif, else
IF:
    pr_if parentesisL EXPRESION parentesisR LlaveL INSTRUCCIONES LlaveR
                {$$=new ifIns.default($3,$6, undefined,undefined,@1.first_line,@1.first_column);}
    | ELIF      {$$=$1;}
;

ELIF:
    pr_elif parentesisL EXPRESION parentesisR LlaveL INSTRUCCIONES LlaveR
                {$$=new ifIns.default($3,$6, undefined,undefined,@1.first_line,@1.first_column);}
    | ELSE      {$$=$1;}
;

ELSE:
    pr_else LlaveL INSTRUCCIONES LlaveR
                {$$=new ifIns.default('',$3, undefined,undefined,@1.first_line,@1.first_column);}
;

WHILE:
    pr_while parentesisL EXPRESION parentesisR LlaveL INSTRUCCIONES LlaveR
            {$$= new mientras.default($3,$6,@1.first_line,@1.first_column);}
;




TIPO :
  pr_int
  | pr_string
  | pr_double
  | pr_boolean
  | pr_char
;

IMPRIMIR : 
    pr_print parentesisL EXPRESION parentesisR pyc {$$=new impresion.default($3,@1.first_line,@1.first_column);}
;

LISTA_VARIABLE : 
    LISTA_VARIABLE coma identificador   //{$1.push($3); $$=$1;}
    | identificador                     //{$$=[$1];}
;

EXPRESION : 
    EXPRESION mas EXPRESION                     {$$ = new aritmetico.default(aritmetico.tipoOp.SUMA, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION menos EXPRESION                 {$$ = new aritmetico.default(aritmetico.tipoOp.RESTA, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION multiplicacion EXPRESION        {$$ = new aritmetico.default(aritmetico.tipoOp.MULTIPLICACION, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION division EXPRESION              {$$ = new aritmetico.default(aritmetico.tipoOp.DIVISION, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION modulo EXPRESION                {$$ = new aritmetico.default(aritmetico.tipoOp.MODULO, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION potencia EXPRESION              {$$ = new aritmetico.default(aritmetico.tipoOp.POTENCIA, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION_RELACIONAL                      {$$=$1;}
    | EXPRESION_LOGICA                          {$$=$1;}
    | DATO                                      {$$=$1;}
;

DATO:
    identificador {$$ = new nativo.default(new Tipo.default(Tipo.DataType.IDENTIFICADOR), $1, @1.first_line, @1.first_column);}
    | entero {$$= new nativo.default(new Tipo.default(Tipo.DataType.ENTERO),$1, @1.first_line, @1.first_column);}
    | logico {$$= new nativo.default(new Tipo.default(Tipo.DataType.LOGICO),$1, @1.first_line, @1.first_column);}
    | decimal {$$= new nativo.default(new Tipo.default(Tipo.DataType.DECIMAL),$1, @1.first_line, @1.first_column);}
    | cadena {$$= new nativo.default(new Tipo.default(Tipo.DataType.CADENA),$1, @1.first_line, @1.first_column);}
;

EXPRESION_RELACIONAL :
    EXPRESION mayor_igual EXPRESION {$$ = new relacional.default(relacional.tipoOp.MAYOR_IGUAL, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION mayor_que EXPRESION {$$ = new relacional.default(relacional.tipoOp.MAYOR, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION menor_igual EXPRESION {$$ = new relacional.default(relacional.tipoOp.MENOR_IGUAL, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION menor_que EXPRESION {$$ = new relacional.default(relacional.tipoOp.MENOR, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION diferente EXPRESION {$$ = new relacional.default(relacional.tipoOp.DIFERENTE, $1, $3, @1.first_line, @1.first_column);}
;

EXPRESION_LOGICA :
    EXPRESION and EXPRESION {$$ = new logica.default(logica.tipoOp.AND, $1, $3, @1.first_line, @1.first_column);}
    | EXPRESION or EXPRESION {$$ = new logica.default(logica.tipoOp.OR, $1, $3, @1.first_line, @1.first_column);}
    | not EXPRESION {$$ = new logica.default(logica.tipoOp.NOT, null, $2, @1.first_line, @1.first_column);}
;
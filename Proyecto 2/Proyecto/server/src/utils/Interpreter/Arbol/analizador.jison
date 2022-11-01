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
%}
%lex 


%options case-insensitive 
//inicio analisis lexico
%%
"int"           return 'pr_int';
"string"        return 'pr_string'
"double"        return 'pr_double'
"boolean"       return  'pr_boolean'
"char"          return  'pr_char'
"print"         return 'pr_print';

">"             return 'mayor_que';
"<"             return 'menor_que';

","             return 'coma';
"||"            return 'or';
"="             return 'igual';
"+"             return 'mas';
";"             return 'pyc';
"("             return 'parentesisL';
")"             return 'parentesisR';


[ \r\t]+ { }
\n {}
\"[^\"]*\"                  { yytext=yytext.substr(1,yyleng-2); return 'cadena'; }
[0-9]+                      return 'entero';
[A-Za-z]+["_"0-9A-Za-z]*    return 'identificador';

<<EOF>>                     return 'EOF';
.   {
    controller.listaErrores.push(new errores.default('ERROR LEXICO',`El valor "${yytext}" no es valido`, yylineno + 1, yylloc.first_column + 1));
}

/lex

%left 'mas'
%left 'mayor_que'

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
    | error  pyc         {controller.listaErrores.push(new errores.default(`ERROR SINTACTICO`,"Se esperaba token",@1.first_line,@1.first_column));}
;

DECLARACION:
    TIPO LISTA_VARIABLE igual EXPRESION pyc {$$=new declaracion.default($2, new Tipo.default(Tipo.DataType.ENTERO), $4, @1.first_line, @1.first_column);}
;

ASIGNACION:
    LISTA_VARIABLE igual EXPRESION pyc {$$ = new asignacion.default($1, $3, @1.first_line,@1.first_column );}
;

TIPO :
  pr_int
  | pr_string
  | pr_double
  | pr_boolean
  | pr_char
;

IMPRIMIBLE:
    EXPRESION {$$=$1;}  
    | EXPRESION_RELACIONAL {$$=$1;}  
    | EXPRESION_LOGICA {$$=$1;}  
;

IMPRIMIR : 
    pr_print parentesisL IMPRIMIBLE parentesisR pyc {$$=new impresion.default($3,@1.first_line,@1.first_column);}
;

LISTA_VARIABLE : 
    LISTA_VARIABLE coma identificador   
    | identificador                     
;

EXPRESION : 
    EXPRESION mas EXPRESION {$$ = new aritmetico.default(aritmetico.tipoOp.SUMA, $1, $3, @1.first_line, @1.first_column);}
    | identificador {$$ = new nativo.default(new Tipo.default(Tipo.DataType.IDENTIFICADOR), $1, @1.first_line, @1.first_column);}
    | entero {$$= new nativo.default(new Tipo.default(Tipo.DataType.ENTERO),$1, @1.first_line, @1.first_column);}
    | cadena {$$= new nativo.default(new Tipo.default(Tipo.DataType.CADENA),$1, @1.first_line, @1.first_column);}
;

EXPRESION_RELACIONAL :
    EXPRESION mayor_que EXPRESION {$$ = new relacional.default(relacional.tipoOp.MAYOR, $1, $3, @1.first_line, @1.first_column);}
;

EXPRESION_LOGICA :
    EXPRESION_RELACIONAL or EXPRESION_RELACIONAL {$$ = new logica.default(logica.tipoOp.OR, $1, $3, @1.first_line, @1.first_column);}
;
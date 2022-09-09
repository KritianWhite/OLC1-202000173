package Analizadores;
import java_cup.runtime.*;

%%
%init{
    yyline = 1;
    yycolumn = 1;
%init}

%public
%class Analizador_Lexico
%cup
%char
%full
%ignorecase
%line
%unicode

ESPACIOS = [ \t\r\n\f]+
COMENTARIO_L = [\/\/][^\n]*[\n]
COMENTARIO_M = [\/][\*][^)]*[\*][\/]
CARACTER = [a-zA-Z]+
BOOLEAN = ("verdadero" | "falso")
IDENTIFICADOR = [_][a-zA-Z0-9]+[_]
CARACTER_E = [\"][\\][\"\'n][\"];
CADENA = [\"][^\"]*[\"]
DIGITOS = [0-9]+("." [0-9]+)?
%%

"inicio" {return new Symbol(sym.PR_INICIO, yycolumn, yyline, yytext())}
"fin" {return new Symbol(sym.PR_FIN, yycolumn, yyline, yytext())}
"ingresar" {return new Symbol(sym.PR_INGRESAR, yycolumn, yyline, yytext());}
"como" {return new Symbol(sym.PR_COMO, yycolumn, yyline, yytext());}
"con_valor" {return new Symbol(sym.PR_CON_VALOR, yycolumn, yyline, yytext());}
"->" {return new Symbol(sym.PR_ASIGNACION, yycolumn, yyline, yytext());}
"si" {return new Symbol(sym.PR_SI, yycolumn, yyline, yytext());}
"entonces" {return new Symbol(sym.PR_ENTONCES, yycolumn, yyline, yytext());}
"de_lo_contrario" {return new Symbol(sym.PR_DE_LO_CONTRARIO, yycolumn, yyline, yytext());}
"o_si" {return new Symbol(sym.PR_O_SI, yycolumn, yyline, yytext());}
"fin_si" {return new Symbol(sym.PR_FIN_SI, yycolumn, yyline, yytext());}
"segun" {return new Symbol(sym.PR_SEGUN, yycolumn, yyline, yytext());}
"hacer" {return new Symbol(sym.PR_HACER, yycolumn, yyline, yytext());}
"fin_segun" {return new Symbol(sym.PR_FIN_SEGUN, yycolumn, yyline, yytext());}
"para" {return new Symbol(sym.PR_PARA, yycolumn, yyline, yytext());}
"hasta" {return new Symbol(sym.PR_HASTA, yycolumn, yyline, yytext());}
"con_incremental" {return new Symbol(sym.PR_CON_INCREMENTAL, yycolumn, yyline, yytext());}
"fin_para" {return new Symbol(sym.PR_FIN_PARA, yycolumn, yyline, yytext());}
"mientras" {return new Symbol(sym.PR_MIENTRAS, yycolumn, yyline, yytext());}
"fin_mientras" {return new Symbol(sym.PR_FIN_MIENTRAS, yycolumn, yyline, yytext());}
"repetir" {return new Symbol(sym.PR_REPETIR, yycolumn, yyline, yytext());}
"hasta_que" {return new Symbol(sym.PR_HASTA_QUE, yycolumn, yyline, yytext());}
"retornar" {return new Symbol(sym.PR_RETORNAR, yycolumn, yyline, yytext());}
"ejecutar" {return new Symbol(sym.PR_EJECUTAR, yycolumn, yyline, yytext());}
"imprimir" {return new Symbol(sym.PR_IMPRIMIR, yycolumn, yyline, yytext());}
"imprimir_nl" {return new Symbol(sym.PR_IMPRIMIR_NL, yycolumn, yyline, yytext());}
"metodo" {return new Symbol(sym.PR_METODO, yycolumn, yyline, yytext());}
"con_parametros" {return new Symbol(sym.PR_CON_PARAMETROS, yycolumn, yyline, yytext());}
"fin_metodo" {return new Symbol(sym.PR_FIN_METODO, yycolumn, yyline, yytext());}
"funcion" {return new Symbol(sym.PR_FUNCION, yycolumn, yyline, yytext());}
"fin_funcion" {return new Symbol(sym.PR_FIN_FUNCION, yycolumn, yyline, yytext());}
"numero" {return new Symbol(sym.PR_NUMERO, yycolumn, yyline, yytext());}
"cadena" {return new Symbol(sym.PR_CADENA, yycolumn, yyline, yytext());}
"boolean" {return new Symbol(sym.PR_BOOLEAN, yycolumn, yyline, yytext());}
"caracter" {return new Symbol(sym.PR_CARACTER, yycolumn, yyline, yytext());}

"and" {return new Symbol(sym.OP_AND, yycolumn, yyline, yytext());}
"or" {return new Symbol(sym.OP_OR, yycolumn, yyline, yytext());}

"+" {return new Symbol(sym.OP_SUMA, yycolumn, yyline, yytext());}
"-" {return new Symbol(sym.OP_RESTA, yycolumn, yyline, yytext());}
"*" {return new Symbol(sym.OP_MULTIPLICACION, yycolumn, yyline, yytext());}
"/" {return new Symbol(sym.OP_DIVISION, yycolumn, yyline, yytext());}
"potencia" {return new Symbol(sym.OP_POTENCIA, yycolumn, yyline, yytext());}
"mod" {return new Symbol(sym.OP_MODULO, yycolumn, yyline, yytext());}
"<" {return new Symbol(sym.OP_MAYOR_QUE, yycolumn, yyline, yytext());}
">" {return new Symbol(sym.OP_MENOR_QUE, yycolumn, yyline, yytext());}
"es_igual" {return new Symbol(sym.OP_IGUAL, yycolumn, yyline, yytext());}
"es_diferente" {return new Symbol(sym.OP_ES_DIFERENTE, yycolumn, yyline, yytext());}
"mayor_igual" {return new Symbol(sym.OP_MAYOR_IGUAL, yycolumn, yyline, yytext());}
"menor_igual" {return new Symbol(sym.OP_MENOR_IGUAL, yycolumn, yyline, yytext());}

"(" {return new Symbol(sym.SB_PARENTESIS_LEFT, yycolumn, yyline, yytext());}
")" {return new Symbol(sym.SB_PARENTESIS_RIGHT, yycolumn, yyline, yytext());}
";" {return new Symbol(sym.SB_PUNTO_Y_COMA, yycolumn, yyline, yytext());}
"," {return new Symbol(sym.SB_COMA, yycolumn, yyline, yytext());}
"¿" {return new Symbol(sym.SB_INTERROGACION_LEFT, yycolumn, yyline, yytext());}
"?" {return new Symbol(sym.SB_INTERROGACION_RIGHT, yycolumn, yyline, yytext());}

{ESPACIOS} {}
{COMENTARIO_L} {return new Symbol(sym.COMENTARIO1, yycolumn, yyline, yytext());}
{COMENTARIO_M} {return new Symbol(sym.COMENTARIO2, yycolumn, yyline, yytext());}
{CARACTER} {return new Symbol(sym.CARACTER, yycolumn, yyline, yytext());}
{BOOLEAN} {return new Symbol(sym.BOOLEAN, yycolumn, yyline, yytext());}
{IDENTIFICADOR} {return new Symbol(sym.IDENTIFICADOR, yycolumn, yyline, yytext());}
{CARACTER_E} {return new Symbol(sym.CARACTER_E, yycolumn, yyline, yytext());}
{CADENA} {return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}
{DIGITOS} {return new Symbol(sym.DIGITOS, yycolumn, yyline, yytext());}
 . {
    System.out.println("Error, "+yytext());
}

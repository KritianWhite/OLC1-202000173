package Analizadores;
import java_cup.runtime.*;

%%
//directrices
%public
%class Analizador_Lexico
%cup
%char
%column
%full
%ignorecase
%line
%unicode

%init{
    yyline = 1;
    yycolumn = 1;
%init}

// Expresiones regulares
ESPACIOS = [ \t\r\n\f]+
COMENTARIO_L = [\/\/][^\n]*[\n]
COMENTARIO_M = [<][!][^!]*[!][>]
CARACTER = [a-zA-z\d]
CARACTER_E = [\"][\\][\"\'n][\"];
CADENA = [\"][^\"]*[\"]
DIGITOS = [\d][ ]?[\~][ ]?[\d]
CONJUNTO_S = [\!\"\#\$\%\&\'\(\)\*\+\-\/\:\;\,\<\>\=\?\@\\\[\]\^\_\`\{\|\}][ ]?[\~][ ]?[\!\"\#\$\%\&\'\(\)\*\+\-\/\:\;\,\<\>\=\?\@\\\[\]\^\_\`\{\|\}]
FLECHAS = [\-][ ]?[\>]
MAYUSCULAS = [A-Z][ ]?[\~][ ]?[A-Z]
MINUSCULAS = [a-z][ ]?[\~][ ]?[a-z]
%%

// Simbolos 
"(" {return new Symbol(sym.PARENTESISLEFT, yycolumn, yyline, yytext());}
")" {return new Symbol(sym.PARENTESISRIGHT, yycolumn, yyline, yytext());}
"{" {return new Symbol(sym.LLAVELEFT, yycolumn, yyline, yytext());}
"}" {return new Symbol(sym.LLAVERIGHT, yycolumn, yyline, yytext());}
"[" {return new Symbol(sym.CORCHETELEFT, yycolumn, yyline, yytext());}
"]" {return new Symbol(sym.COCHETERIGHT, yycolumn, yyline, yytext());}
":" {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
";" {return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());}
"," {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
"+" {return new Symbol(sym.MAS, yycolumn, yyline, yytext());}
"-" {return new Symbol(sym.MENOS, yycolumn, yyline, yytext());}
"*" {return new Symbol(sym.POR, yycolumn, yyline, yytext());}
"/" {return new Symbol(sym.DIVISION, yycolumn, yyline, yytext());}




// Palabras reservadas (Declaraciones)
"numero" {return new Symbol(sym.PR_NUMERO,yycolumn, yyline, yytext());}
"cadena" {return new Symbol(sym.PR_CADENA,yycolumn, yyline, yytext());}
"boolean" {return new Symbol(sym.PR_BOOLEAN,yycolumn, yyline, yytext());}
"caracter" {return new Symbol(sym.PR_CARACTER,yycolumn, yyline, yytext());}
"potencia" {return new Symbol(sym.PR_POTENCIA, yycolumn, yyline, yytext());}
"modulo" {return new Symbol(sym.PR_MOD, yycolumn, yyline, yytext());}

// Palabras reservadas (las demas)










// Identificando espacios
{ESPACIOS} {/*ignore*/}

// Identificando comentarios
{COMENTARIO_L} {return new Symbol(sym.COMENTARIO_L, yycolumn, yyline, yytext());}
{COMENTARIO_M} {return new Symbol(sym.COMENTARIO_M, yycolumn, yyline, yytext());}

// Identificando caracteres y caracteres especiales
{CARACTER} {return new Symbol(sym.CARACTER, yycolumn, yyline, yytext());}
{CARACTER_E} {return new Symbol(sym.CARACTER_E, yycolumn, yyline, yytext());}

// Identificando cadena y digitos
{CADENA} {return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}
{DIGITOS} {return new Symbol(sym.DIGITOS, yycolumn, yyline, yytext());}

// Identificando conjunto de simbolos y flechas
{CONJUNTO_S} {return new Symbol(sym.CONJUNTO_S, yycolumn, yyline, yytext());}
{FLECHAS} {return new Symbol(sym.FLECHAS, yycolumn, yyline, yytext());}

// Identificando mayusculas y minusculas
{MAYUSCULAS} {return new Symbol(sym.MAYUSCULAS, yycolumn, yyline, yytext());}
{MINUSCULAS} {return new Symbol(sym.MINUSCULAS, yycolumn, yyline, yytext());}

 . {
    System.out.println("Este es un error léxico: " + yytext() + ". Linea "+yyline+", columna "+yycolumn+".");
    // Agregar errores a objeto para imprimir errores....
}


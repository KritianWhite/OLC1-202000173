
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Analizador_Sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Analizador_Sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Analizador_Sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Analizador_Sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\034\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\003\010" +
    "\000\002\003\003\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\003\000\002\005\003\000\002" +
    "\005\003\000\002\011\005\000\002\011\005\000\002\011" +
    "\003\000\002\012\005\000\002\012\005\000\002\012\003" +
    "\000\002\013\005\000\002\013\003\000\002\006\003\000" +
    "\002\006\003\000\002\007\005\000\002\007\003\000\002" +
    "\010\003\000\002\014\003\000\002\014\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\012\004\016\065\007\100\022\103\010\001" +
    "\002\000\004\002\uffe6\001\002\000\004\002\ufffd\001\002" +
    "\000\004\002\uffe8\001\002\000\006\065\007\103\010\001" +
    "\002\000\016\002\uffed\051\uffed\052\uffed\053\uffed\054\uffed" +
    "\066\uffed\001\002\000\016\002\ufff2\051\ufff2\052\ufff2\053" +
    "\035\054\034\066\ufff2\001\002\000\004\002\uffec\001\002" +
    "\000\010\002\ufffe\051\032\052\031\001\002\000\004\002" +
    "\uffff\001\002\000\016\002\uffef\051\uffef\052\uffef\053\uffef" +
    "\054\uffef\066\uffef\001\002\000\010\006\027\065\007\103" +
    "\010\001\002\000\004\002\025\001\002\000\004\002\uffe7" +
    "\001\002\000\004\002\uffeb\001\002\000\006\002\uffe9\070" +
    "\023\001\002\000\004\100\022\001\002\000\004\002\uffea" +
    "\001\002\000\004\002\001\001\002\000\004\002\000\001" +
    "\002\000\004\100\041\001\002\000\010\002\ufffb\051\032" +
    "\052\031\001\002\000\006\065\007\103\010\001\002\000" +
    "\006\065\007\103\010\001\002\000\016\002\ufff4\051\ufff4" +
    "\052\ufff4\053\035\054\034\066\ufff4\001\002\000\006\065" +
    "\007\103\010\001\002\000\006\065\007\103\010\001\002" +
    "\000\016\002\ufff1\051\ufff1\052\ufff1\053\ufff1\054\ufff1\066" +
    "\ufff1\001\002\000\016\002\ufff0\051\ufff0\052\ufff0\053\ufff0" +
    "\054\ufff0\066\ufff0\001\002\000\016\002\ufff3\051\ufff3\052" +
    "\ufff3\053\035\054\034\066\ufff3\001\002\000\004\007\042" +
    "\001\002\000\012\043\046\044\047\045\045\046\044\001" +
    "\002\000\004\010\050\001\002\000\004\010\ufff7\001\002" +
    "\000\004\010\ufff8\001\002\000\004\010\ufffa\001\002\000" +
    "\004\010\ufff9\001\002\000\006\102\053\103\051\001\002" +
    "\000\004\002\ufff6\001\002\000\004\002\ufffc\001\002\000" +
    "\004\002\ufff5\001\002\000\010\051\032\052\031\066\055" +
    "\001\002\000\016\002\uffee\051\uffee\052\uffee\053\uffee\054" +
    "\uffee\066\uffee\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\053\000\030\002\016\006\013\007\011\010\020\011" +
    "\012\012\010\013\014\014\004\015\017\016\003\017\005" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\010\011\053\012\010\013\014\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\003\025" +
    "\011\027\012\010\013\014\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\007\023\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\012\037\013\014\001\001\000\006\012\032\013\014\001" +
    "\001\000\002\001\001\000\004\013\036\001\001\000\004" +
    "\013\035\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\004\042\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\005\051\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Analizador_Sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Analizador_Sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Analizador_Sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
        System.out.println("Error Sintáctico en la Línea " + (s.left) +
        " Columna "+s.right+ ". No se esperaba este componente: " +s.value+"."); 
    } 

    /**
     * Método al que se llama automáticamente ante algún error sintáctico 
     * en el que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        System.out.println("Error síntactico irrecuperable en la Línea " + 
        (s.left)+ " Columna "+s.right+". Componente " + s.value + 
        " no reconocido."); 
    }  


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Analizador_Sintactico$actions {
  private final Analizador_Sintactico parser;

  /** Constructor */
  CUP$Analizador_Sintactico$actions(Analizador_Sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Analizador_Sintactico$do_action_part00000000(
    int                        CUP$Analizador_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analizador_Sintactico$parser,
    java.util.Stack            CUP$Analizador_Sintactico$stack,
    int                        CUP$Analizador_Sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Analizador_Sintactico$result;

      /* select the action based on the action number */
      switch (CUP$Analizador_Sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= codigo EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)).value;
		RESULT = start_val;
              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Analizador_Sintactico$parser.done_parsing();
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // codigo ::= PR_INICIO declaracion 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("codigo",0, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // codigo ::= lista 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("codigo",0, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // codigo ::= expresion 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("codigo",0, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // codigo ::= bloque 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("codigo",0, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // declaracion ::= PR_INGRESAR IDENTIFICADOR PR_COMO tipodato PR_CON_VALOR valor 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("declaracion",1, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-5)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // declaracion ::= expresion 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("declaracion",1, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // tipodato ::= PR_NUMERO 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("tipodato",2, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // tipodato ::= PR_CADENA 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("tipodato",2, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // tipodato ::= PR_BOOLEAN 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("tipodato",2, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // tipodato ::= PR_CARACTER 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("tipodato",2, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // valor ::= DIGITOS 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("valor",3, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // valor ::= CADENA 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("valor",3, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= expresion OP_SUMA termino 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",7, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= expresion OP_RESTA termino 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",7, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= termino 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("expresion",7, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // termino ::= termino OP_MULTIPLICACION factor 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("termino",8, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // termino ::= termino OP_DIVISION factor 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("termino",8, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // termino ::= factor 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("termino",8, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // factor ::= SB_PARENTESIS_LEFT expresion SB_PARENTESIS_RIGHT 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // factor ::= DIGITOS 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("factor",9, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // lista ::= lista_variables 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("lista",4, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // lista ::= lista_sentencias 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("lista",4, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // lista_variables ::= IDENTIFICADOR SB_COMA lista_variables 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("lista_variables",5, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.elementAt(CUP$Analizador_Sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // lista_variables ::= IDENTIFICADOR 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("lista_variables",5, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // lista_sentencias ::= sentencia 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("lista_sentencias",6, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // bloque ::= metodo 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("bloque",10, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // bloque ::= funcion 
            {
              Object RESULT =null;

              CUP$Analizador_Sintactico$result = parser.getSymbolFactory().newSymbol("bloque",10, ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$Analizador_Sintactico$stack.peek()), RESULT);
            }
          return CUP$Analizador_Sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Analizador_Sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Analizador_Sintactico$do_action(
    int                        CUP$Analizador_Sintactico$act_num,
    java_cup.runtime.lr_parser CUP$Analizador_Sintactico$parser,
    java.util.Stack            CUP$Analizador_Sintactico$stack,
    int                        CUP$Analizador_Sintactico$top)
    throws java.lang.Exception
    {
              return CUP$Analizador_Sintactico$do_action_part00000000(
                               CUP$Analizador_Sintactico$act_num,
                               CUP$Analizador_Sintactico$parser,
                               CUP$Analizador_Sintactico$stack,
                               CUP$Analizador_Sintactico$top);
    }
}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Translate;

/**
 *
 * @author kriti
 */
public class Translate {

    public static String pythonD = "";
    public static String go = "";
    public static String impPython = "import math\n"
            + "def main():\n";
    public static String impGo = "package main\n"
            + "import \"fmt\"\n "
            + "import \"math\"\n "
            + "func main(){\n";

    public void DeclaracionPY(String variable, String expresion) {
        pythonD += variable + expresion;
        
        
        /*boolean numeric = expresion.matches("[+-]?\\d*(\\.\\d+)?");
        String numer = String.valueOf(numeric);
        boolean numer2 = numer.contains(".");
        boolean variab = expresion.matches("[_][a-zA-Z0-9]+[_]");
        boolean expr1 = expresion.contains("+");
        boolean expr2 = expresion.contains("-");
        boolean expr3 = expresion.contains("*");
        boolean expr4 = expresion.contains("/");
        boolean expr5 = expresion.contains("mod");
        boolean expr6 = expresion.contains("potencia");
        
        if (numeric == true) {
            //System.out.println("Soy un digito: " + expresion);
            pythonD +="\t" + variable + " = " + expresion;
            //System.out.println(python);
        } else if (numeric == false) {
            if ((expr1 | expr2 | expr3 | expr4 | expr5 | expr6) == true) {
                //System.out.println("Soy una expresion aritmetica: " + expresion);
                pythonD +="\t" + variable + " = " + expresion;
            } else if (variab == true) {
                //System.out.println("Soy una variable: " + expresion);
                pythonD +="\t" + variable + " = " + expresion;
            } else {
                System.out.println("Soy una cadena: " + expresion);
                pythonD +="\t" + variable + " = " + "\""+expresion+"\"";
            }
        }
        //impPython += pythonD;
        //System.out.println(impPython);*/

    }
    
    public void printCode(){
        impPython += pythonD;
        System.out.println(impPython);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author kriti
 */
public class Generador2 {
    public static void main(String[] args) {
        try{
            String ruta = "src/Analizadores/";
            String opcFlex[] = {ruta+"lexer.jflex","-d",ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCup[] = {"-destdir", ruta, "-parser", "parser", ruta + "parser.cup"};
            java_cup.Main.main(opcCup);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

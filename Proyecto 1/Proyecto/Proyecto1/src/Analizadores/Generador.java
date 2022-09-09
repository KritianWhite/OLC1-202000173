/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Analizadores;

/**
 *
 * @author kriti
 */
public class Generador {
    public static void main(String[] args){
        try{
            String ruta = "src/Analizadores/";
            String opcFlex[] = {ruta+"A_Lexico.jflex","-d",ruta};
            jflex.Main.generate(opcFlex);
            
            String opcCup[] = {"-destdir", ruta, "-parser", "Analizador_Sintactico", ruta + "A_Sintactico.cup"};
            java_cup.Main.main(opcCup);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

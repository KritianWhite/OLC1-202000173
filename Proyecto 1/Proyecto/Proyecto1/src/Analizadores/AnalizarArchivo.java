/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;
import Error_.*;
import java.io.BufferedReader;
import java.io.StringReader;
import java_cup.runtime.Scanner;


/**
 *
 * @author kriti
 */
public class AnalizarArchivo {
    
    public static AnalizarArchivo analizador;
    public static LinkedListError errores;

    public void analizar(String text){
        try {
            System.out.println("Empezando analisis..");
            errores = new LinkedListError();
            Analizador_Lexico scanner = new Analizador_Lexico(new BufferedReader(new StringReader(text)));
            Analizador_Sintactico parser = new Analizador_Sintactico(scanner);
            parser.parse();
            System.out.println("Analisis finalizado..!");
        } catch (Exception e) {
        }
    }
    
    public static AnalizarArchivo getInstance(){
        if (analizador == null){
            errores = new LinkedListError();
            analizador = new AnalizarArchivo();
        }
        return analizador;
    }

    public static LinkedListError getErrores() {
        return errores;
    }

    public static void setErrores(LinkedListError list) {
        AnalizarArchivo.errores = list;
    }
    
    public static void LimpiarInstancias(){
        if (analizador == null){
            errores.clear();
        }else{
            System.out.println("No existe un analizador");
        }
    }
    
    
}

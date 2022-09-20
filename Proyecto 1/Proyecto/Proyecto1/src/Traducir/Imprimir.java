/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Traducir;

/**
 *
 * @author kriti
 */
public class Imprimir implements Instrucciones {
    private final String contenido;
    private final int tipo;

    public Imprimir(String contenido, int tipo) {
        this.contenido = contenido;
        this.tipo = tipo;
        System.out.println(contenido);
    }
    
    public Imprimir(){
        String contenido = "";
        int tipo = 0;
        this.contenido = contenido;
        this.tipo = tipo;
    }
    
    @Override
    public String traducir(){
        String impresion = "";
        if (tipo == 0){
            impresion += ("fmt.Print( "+contenido.toString()+")");
            System.out.println("fmt.Print( "+contenido.toString()+")");
            
        }else {
            System.out.println("fmt.Print( "+contenido.toString()+")");
            impresion += ("fmt.Print( "+contenido.toString()+")");
        }
        return impresion;
    }
    
}

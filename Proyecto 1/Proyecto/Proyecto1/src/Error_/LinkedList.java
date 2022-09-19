/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Error_;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kriti
 */
public class LinkedList {
    
    Errores primero;
    Errores ultimo;
    private int tam;

    public LinkedList() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }
    
    public boolean estaVacia(){
        return this.primero == null;
    }
    
    public int tamanio(){
        return this.tam;
    }
    
    public void insertar(String message, String tipo, int fila, int columna){
        Errores nuevo = new Errores();
        Errores aux = new Errores();
        nuevo.setMessage(message);
        nuevo.setType(tipo);
        nuevo.setFila(fila);
        nuevo.setColumna(columna);
        
        if (this.estaVacia()){
            this.primero = this.ultimo = nuevo;
        } else {
            aux = nuevo;
            aux.siguiente = this.primero;
            this.primero = aux;
        }
        this.tam += 1;
    }
    
    public void mostarLinkedList(){
        if (this.estaVacia()){
            System.out.println("Lista vacia.");
            return;
        }
        Errores aux = new Errores();
        aux = this.primero;
        while (aux != null){
            System.out.println("Errores{" + "message=" + aux.getMessage() + ", type=" + aux.getType() + ", fila= " + String.valueOf(aux.getFila()) + ", columna=" + String.valueOf(aux.getColumna()) + '}');
            aux = aux.siguiente;
        }
    }
    
    
    
}

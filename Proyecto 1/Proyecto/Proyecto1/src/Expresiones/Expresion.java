/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;

/**
 *
 * @author kriti
 */
public class Expresion {
    String operador;
    Object primero;
    Object siguiente;

    public Expresion(String operador, Object primero, Object siguiente) {
        this.operador = operador;
        this.primero = primero;
        this.siguiente = siguiente;
    }

    public Expresion(String operador, Object primero) {
        this.operador = operador;
        this.primero = primero;
        this.siguiente = null;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public Object getPrimero() {
        return primero;
    }

    public void setPrimero(Object primero) {
        this.primero = primero;
    }

    public Object getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Object siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
    
}

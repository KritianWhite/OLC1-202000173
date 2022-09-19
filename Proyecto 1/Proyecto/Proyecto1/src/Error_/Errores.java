/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Error_;

/**
 *
 * @author kriti
 */
public class Errores {

    private String message;
    private String type;
    private int fila;
    private int columna;
    Errores siguiente;
    
    public Errores(){
        this.message = "";
        this.type = "";
        this.fila = 0;
        this.columna = 0;
        this.siguiente = null;
    }

    public Errores(String message, String type, int fila, int columna) {
        this.message = message;
        this.type = type;
        this.fila = fila;
        this.columna = columna;
        this.siguiente = null;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Errores{" + "message=" + message + ", type=" + type + ", fila=" + fila + ", columna=" + columna + '}';
    }
}

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
public class ExpresionRegular {
    String id;
    Object expresion;

    public ExpresionRegular(String id, Object expresion) {
        this.id = id;
        this.expresion = expresion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getExpresion() {
        return expresion;
    }

    public void setExpresion(Object expresion) {
        this.expresion = expresion;
    }
    
}

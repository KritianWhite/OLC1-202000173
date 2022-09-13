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
public class LexemaEntrada {
    String Lexema;
    String exp;

    public LexemaEntrada(String Lexema, String exp) {
        this.Lexema = Lexema;
        this.exp = exp;
    }

    public String getLexema() {
        return Lexema;
    }

    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
    
    
}

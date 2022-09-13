/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expresiones;
import java.util.ArrayList;
/**
 *
 * @author kriti
 */
public class Conjunto {
    String exp;
    String id;
    ArrayList caracteres;

    public Conjunto(String exp, String id) {
        this.exp = exp;
        this.id = id;
        caracteres = new ArrayList();
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(ArrayList caracteres) {
        this.caracteres = caracteres;
    }
    
    public void addCaracter(char c){
        caracteres.add(c);
    }
    
}

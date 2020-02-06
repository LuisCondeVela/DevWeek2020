/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2;

/**
 *
 * @author Luis
 */
public class EJ1_Elemento {
    
    int coeficiente;
    char literal;
    
    public EJ1_Elemento(int coeficiente,char literal){
        this.coeficiente=coeficiente;
        this.literal=literal;
    }
    
    public int getCoefi(){
        return coeficiente;
    }
    
    public char getLiter(){
        return literal;
    }
    
    public EJ1_Elemento SumarPorCoef(EJ1_Elemento comp){
        if(this.literal==comp.getLiter())
            return new EJ1_Elemento(coeficiente+comp.getCoefi(), literal);        
        return null;
    }
        
    public boolean MismoCoef(EJ1_Elemento comp){
        return this.literal==comp.getCoefi();
    }
    
    public String toString(){
        return ""+coeficiente+""+literal;
    }
}

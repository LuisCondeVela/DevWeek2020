/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia3;

/**
 *
 * @author student
 */
public enum Direccion {
    Arriba(0),
    Izquierda(1),
    Derecha(2),
    Abajo(3);
    
    public final int valor;
    
    Direccion(int v){
        valor=v;
    }
    
    public int DirN(){
        return valor;
    }
    
    public String Literal(){
        String res = "";
        switch(valor){
            case 0:
                res="Arriba";
                break;
            case 1:
                res="Izquierda";
                break;
            case 2:
                res="Derecha";
                break;
            case 3:
                res="Abajo";
                break;
        }
        return res;
    }
}

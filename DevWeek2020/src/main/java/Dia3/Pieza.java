/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia3;

import java.util.Objects;

/**
 *
 * @author Luis
 */
public class Pieza {
    
    int x,y,valor;
    
    public Pieza(int x, int y, int valor){
        this.x=x;
        this.y=y;
        this.valor=valor;
    }
    
    public String toString(){
        return "Pos:"+x+","+y+" Valor:"+valor;
    }
    
    public String toStringPos(){
        return x+","+y;
    }
    
    @Override
    public boolean equals(Object o){
        if(o==this)
            return true;
        if (!(o instanceof Pieza)) {
            return false;
        }
        Pieza p = (Pieza) o;
        return (p.GetValor()==this.GetValor() && p.GetX()==this.GetX() && p.GetY()==this.GetY());                          
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(x, y, valor);
    }
    
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }
    public int GetValor(){
        return valor;
    }
    
}

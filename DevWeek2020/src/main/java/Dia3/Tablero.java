/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia3;

//import java.util.ArrayList;
//import java.util.HashMap;

/**
 *
 * @author Luis
 */
public class Tablero {
    
    //HashMap<Pieza,Integer> table = new HashMap<Pieza,Integer>();
    Pieza[][] tablero;
    int tamano;
    Pieza PosActual;
    
    public Tablero(int n){
        if(EsCuadradoPerfecto(n)){
            tamano =(int) Math.sqrt(n);
            ArmarTablero();
            PosActual=new Pieza(tamano-1,tamano-1,0);
            Poner(PosActual);
        }        
    }
    
    public String toString(){
        String espacio=" ";
        String res = "";
        for(int x=0;x<tamano;x++){
            for(int y=0;y<tamano;y++){
                Pieza temp=tablero[x][y];
                if(temp.GetValor()<10){
                    res+=espacio;
                }
                res+=""+temp.GetValor();
                res+=espacio;
            }  
            res+="\n";
        }
        return res;
    }
    
    public String PosiblesMovimientos(){
        String res = "";
        Pieza[] movimientos = ObtenerVecinos(PosActual);
        for(Pieza p:movimientos){
            if(p!=null)
                res+=p.GetX()+","+p.GetY()+"\n";
        }
        return res;
    }
    
    public void Mover(String Direccion){
        Pieza[] movimientos = ObtenerVecinos(PosActual);
        switch(Direccion){
            case "Arriba":
                if(movimientos[0]!=null){
                    Intercambiar(movimientos[0], PosActual);
                }
                break;
            case "Izquierda":
                if(movimientos[1]!=null){
                    Intercambiar(movimientos[1], PosActual);
                }                
                break;
            case "Derecha":
                if(movimientos[2]!=null){
                    Intercambiar(movimientos[2], PosActual);
                }                
                break;
            case "Abajo":
                if(movimientos[3]!=null){
                    Intercambiar(movimientos[3], PosActual);
                }                
                break;
        }        
    }
    
    //METODOS PRIVADOS
    
    private void ArmarTablero(){
        tablero = new Pieza[tamano][tamano];
        int index=1;
        for(int x=0;x<tamano;x++){
            for(int y=0;y<tamano;y++){
                tablero[x][y]=new Pieza(x, y, index);
                index++;
            }
        }        
    }
          
    private void Poner(Pieza p){
        tablero[p.GetX()][p.GetY()]=p;
    }
    
    private void Intercambiar(Pieza destino, Pieza origen){
        origen.setValor(destino.GetValor());
        destino.setValor(0);
        Poner(destino);
        Poner(origen);
        PosActual=destino;
    } 
    
    private Pieza[] ObtenerVecinos(Pieza actual){
        Pieza[] movimientos = new Pieza[4];        
        if(EsPosicionValida(actual.GetX()-1, actual.GetY()))
            movimientos[0]=tablero[actual.GetX()-1][actual.GetY()];         //ARRIBA   
        if(EsPosicionValida(actual.GetX(), actual.GetY()-1))
            movimientos[1]=tablero[actual.GetX()][actual.GetY()-1];        //IZQUIERA
        if(EsPosicionValida(actual.GetX(), actual.GetY()+1))
            movimientos[2]=tablero[actual.GetX()][actual.GetY()+1];        //DERECHA
        if(EsPosicionValida(actual.GetX()+1, actual.GetY()))
            movimientos[3]=tablero[actual.GetX()+1][actual.GetY()];        //ABAJO
        return movimientos;
    }
    
    private boolean EsPosicionValida(int x, int y){
        if(x<0 || x>=tamano)
            return false;
        if(y<0 || y>=tamano)
            return false;
        return true;
    }
    
    private boolean EsCuadradoPerfecto(int n){
        double sq = Math.sqrt(n); 
	return ((sq - Math.floor(sq)) == 0); 
    }       
    
}

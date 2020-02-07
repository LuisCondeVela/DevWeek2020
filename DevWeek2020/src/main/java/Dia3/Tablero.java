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
    
    private Pieza Obtener(Pieza p){
        return p;
    }
    
    private Pieza[] ObtenerVecinos(Pieza actual){
        //ArrayList<Pieza> movimientos = new ArrayList<Pieza>();
        Pieza[] movimientos = new Pieza[4];        
        if(EsPosicionValida(actual.GetX()-1, actual.GetY()))
            movimientos[0]=tablero[actual.GetX()-1][actual.GetY()];        
        if(EsPosicionValida(actual.GetX(), actual.GetY()-1))
            movimientos[1]=tablero[actual.GetX()][actual.GetY()-1];        
        if(EsPosicionValida(actual.GetX(), actual.GetY()+1))
            movimientos[2]=tablero[actual.GetX()][actual.GetY()+1];        
        if(EsPosicionValida(actual.GetX()+1, actual.GetY()))
            movimientos[3]=tablero[actual.GetX()+1][actual.GetY()];        
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

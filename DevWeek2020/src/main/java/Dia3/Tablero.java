/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia3;

//import java.util.ArrayList;

import java.util.ArrayList;

//import java.util.HashMap;

/**
 *
 * @author Luis
 */
public class Tablero {
    
    //HashMap<Pieza,Integer> table = new HashMap<Pieza,Integer>();
    Pieza[][] tablero;      //matriz del tablero
    static int tamano;      // tamanoxtamano del tablero
    Pieza ficha;            //elemento 0 del tablero
    ArrayList<String> historial = new ArrayList<String>();    
    
    public Tablero(int n){
        if(EsCuadradoPerfecto(n)){
            tamano =(int) Math.sqrt(n);
            ArmarTablero();
        }        
    }
    //Devuelve un string ordenado en forma de matriz de toda los elementos del tablero
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
    //Deuelve una lista de las coordenadas de los posibles movimientos de la ficha 0
    public String PosiblesMovimientos(){
        String res = "";
        Pieza[] movimientos = ObtenerVecinos(ficha);
        for(Pieza p:movimientos){
            if(p!=null)
                res+=p.toStringPos()+"\n";
        }
        return res;
    }
    //Devuelve una lista de los movimientos literales, arriba, abajo, etc, de los
    //posibles movimientos de la ficha 0
    public String[] PosiblesMovimientosLiterales(){
        String[] res;
        int index=0;
        Pieza[] movimientos = ObtenerVecinos(ficha);
        for(Pieza p:movimientos){
            if(p!=null)
                index++;
        }
        res = new String[index];
        index=0;
        for(int i=0;i<4;i++){
            if(movimientos[i]!=null){
                res[index]=ObtenerDireccionLiteral(i);
                index++;
            }            
        }
        return res;
    }
    //Mueve la ficha 0 segun una direccion literal
    public void Mover(String Direccion){
        Pieza[] movimientosLegales = ObtenerVecinos(ficha);
        switch(Direccion){
            case "Arriba":
                if(movimientosLegales[0]!=null){
                    Intercambiar(movimientosLegales[0], ficha);
                    historial.add(Direccion);
                }
                break;
            case "Izquierda":
                if(movimientosLegales[1]!=null){
                    Intercambiar(movimientosLegales[1], ficha);
                    historial.add(Direccion);
                }                
                break;
            case "Derecha":
                if(movimientosLegales[2]!=null){
                    Intercambiar(movimientosLegales[2], ficha);
                    historial.add(Direccion);
                }                
                break;
            case "Abajo":
                if(movimientosLegales[3]!=null){
                    Intercambiar(movimientosLegales[3], ficha);
                    historial.add(Direccion);
                }                
                break;
        }        
    }
    //Devuelve una lista de movimientos aleatorios legales, segun una cantidad de movimientos
    //y una posicion inicial para la ficha 0
    public String[] MovidasAleatorias(int cantMov, Pieza posIni){
        String[] movidas = new String[cantMov];
        Poner(posIni);                              //ficha=posIni
        Pieza[] vecinos = ObtenerVecinos(ficha);
        int dirAleatoria;
        for(int i=0;i<cantMov;i++){
            Pieza temp;            
            do{
               dirAleatoria = NumAleatorio(0, 3);
               temp=vecinos[dirAleatoria];               
            }while(temp==null);            
            String direccion=ObtenerDireccionLiteral(dirAleatoria);
            movidas[i]=direccion;
            vecinos = ObtenerVecinos(temp);  
        }
        return movidas;
    }
    //Pone un elemento donde se le indique en la matriz,
    //si la entrada es la ficha 0, la asigna al marcador ficha
    public void Poner(Pieza p){
        tablero[p.GetX()][p.GetY()]=p;
        if(p.GetValor()==0)
            ficha=p;
    }
            
    ////////////////////////////METODOS PRIVADOS///////////////////////////
    
    //Arma la matriz segun el tamano    
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
    
    //intercambia la posicion de dos fichas, si una de las fichas es la ficha 0
    //se asegura de actualizar el marcador ficha
    private void Intercambiar(Pieza destino, Pieza origen){
        origen.setValor(destino.GetValor());
        destino.setValor(0);
        Poner(destino);
        Poner(origen);
        if(destino.GetValor()==0)
            ficha=destino;
    } 
    
    //Devuelve los vecinos de una ficha actual en las cuatro direcciones posibles
    //en caso de no contar con un vecino en cierta direccion, esta direccion sera null    
    private Pieza[] ObtenerVecinos(Pieza actual){
        Pieza[] movimientos = new Pieza[4];        
        if(EsPosicionValida(actual.GetX()-1, actual.GetY()))
            movimientos[0]=tablero[actual.GetX()-1][actual.GetY()];   //ARRIBA   
        if(EsPosicionValida(actual.GetX(), actual.GetY()-1))
            movimientos[1]=tablero[actual.GetX()][actual.GetY()-1];   //IZQUIERA
        if(EsPosicionValida(actual.GetX(), actual.GetY()+1))
            movimientos[2]=tablero[actual.GetX()][actual.GetY()+1];   //DERECHA
        if(EsPosicionValida(actual.GetX()+1, actual.GetY()))
            movimientos[3]=tablero[actual.GetX()+1][actual.GetY()];   //ABAJO
        return movimientos;
    }
    
    //Permite averiguar si una direccion x y y, es legal segun el tamano legal,
    //permite asegurar que la ficha no se saldra de los limites
    private boolean EsPosicionValida(int x, int y){
        if(x<0 || x>=tamano)
            return false;
        if(y<0 || y>=tamano)
            return false;
        return true;
    }
    
    //Si el numero de entrada es cuadrado perfecto
    private boolean EsCuadradoPerfecto(int n){
        double sq = Math.sqrt(n); 
	return ((sq - Math.floor(sq)) == 0); 
    }       
    
    //Devuelve un numero aleatorio en un rango
    private int NumAleatorio(int min, int max){
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }     
    
    //Segun una direccion literal segun un valor entero   
    private String ObtenerDireccionLiteral(int n){
        String res = "";
        switch(n){
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

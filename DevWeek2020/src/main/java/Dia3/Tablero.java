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
    Pieza[][] tablero;
    int tamano;
    Pieza posFicha;
    ArrayList<String> historico = new ArrayList<String>();
    
    public Tablero(int n){
        if(EsCuadradoPerfecto(n)){
            tamano =(int) Math.sqrt(n);
            ArmarTablero();
            //PosActual=new Pieza(tamano-1,tamano-1,0);
            //Poner(posFicha);
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
        Pieza[] movimientos = ObtenerVecinos(posFicha);
        for(Pieza p:movimientos){
            if(p!=null)
                res+=p.GetX()+","+p.GetY()+"\n";
        }
        return res;
    }
    
    public void Mover(String Direccion){
        Pieza[] movimientos = ObtenerVecinos(posFicha);
        switch(Direccion){
            case "Arriba":
                if(movimientos[0]!=null){
                    Intercambiar(movimientos[0], posFicha);
                    historico.add(Direccion);
                }
                break;
            case "Izquierda":
                if(movimientos[1]!=null){
                    Intercambiar(movimientos[1], posFicha);
                    historico.add(Direccion);
                }                
                break;
            case "Derecha":
                if(movimientos[2]!=null){
                    Intercambiar(movimientos[2], posFicha);
                    historico.add(Direccion);
                }                
                break;
            case "Abajo":
                if(movimientos[3]!=null){
                    Intercambiar(movimientos[3], posFicha);
                    historico.add(Direccion);
                }                
                break;
        }        
    }
    
    public String[] MovidasAleatorias(int cantMov, Pieza posIni){
        String[] movidas = new String[cantMov];
        Poner(posIni);
        Pieza[] vecinos = ObtenerVecinos(posFicha);
        
        for(int i=0;i<cantMov;i++){
            Pieza temp;
            int valorDir;
            String direccion = "";
            do{
               valorDir = NumAleatorio(0, 3);
               temp=vecinos[valorDir];
               System.out.println("valor dir"+valorDir+":"+temp.toStringPos());
            }while(temp==null);
            switch(valorDir){
                case 0:
                    direccion="Arriba";
                    break;
                case 1:
                    direccion="Izquierda";
                    break;
                case 2:
                    direccion="Derecha";
                    break;
                case 3:
                    direccion="Abajo";
                    break;
            }
            movidas[i]=direccion;
            vecinos = ObtenerVecinos(posFicha);
        }
        return movidas;
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
        if(p.GetValor()==0)
            posFicha=p;
    }
    
    private void Intercambiar(Pieza destino, Pieza origen){
        origen.setValor(destino.GetValor());
        destino.setValor(0);
        Poner(destino);
        Poner(origen);
        if(destino.GetValor()==0)
            posFicha=destino;
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
    
    private int NumAleatorio(int min, int max){
        int range = (max - min) + 1;     
        return (int)(Math.random() * range) + min;
    }     
}

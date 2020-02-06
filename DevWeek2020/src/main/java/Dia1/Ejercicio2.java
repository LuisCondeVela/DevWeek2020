/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia1;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Luis
 */
public class Ejercicio2 {
    
    public Ejercicio2(){        
    }
    
    //Invierte un numero entero positivo
    public int NumeroInvertido(int n){
        int resultado = 0;
        Ejercicio1 ej1Arr = new Ejercicio1();
        ArrayList<Integer> arregloDigi = new ArrayList<Integer>();
        arregloDigi=ej1Arr.numToArray(n);
        Collections.reverse(arregloDigi);
        return ArregloANumero(arregloDigi);        
    }
    
    //Convierte un arreglo a un numero entero manteniedo posiciones
    public int ArregloANumero(ArrayList<Integer> arreglo){
        int resultado = 0;
        for(int i=0;i<arreglo.size();i++){
            resultado+=(Math.pow(10, i)*arreglo.get(i));
        }       
        return resultado;
    }
    
}

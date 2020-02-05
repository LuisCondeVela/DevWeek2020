/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jala2020;

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
        arregloDigi=ej1Arr.toArrayList(n);
        Collections.reverse(arregloDigi);
        for(int i=0;i<arregloDigi.size();i++){
            resultado+=(Math.pow(10, i)*arregloDigi.get(i));
        }
        return resultado;        
    }
    
}

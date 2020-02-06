/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Luis
 */
public class Ejercicio4 {
    
    public Ejercicio4(){        
    }
    
    public int BusquedaBinaria(ArrayList<Integer> arreglo, int valor){
        int result = 0;
        int index = 0;
        Collections.sort(arreglo);
        do{
            if(arreglo.get(index)==valor)
                result++;
            index++;
        }while(arreglo.get(index)<=valor);
        return result;        
    }
}

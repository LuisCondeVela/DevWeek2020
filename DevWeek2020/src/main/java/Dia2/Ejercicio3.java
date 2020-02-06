/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Ejercicio3 {
    
    public Ejercicio3(){
        
    }
    
    public int BusquedaLineal(ArrayList<Integer> arreglo, int valor){
        int result = 0;
        for(int i=0;i<arreglo.size();i++){
            if(valor==arreglo.get(i)){
                result++;
            }
        }
        return result;
    }
    
}

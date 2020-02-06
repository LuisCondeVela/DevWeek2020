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
public class Ejercicio2 {
    
    public Ejercicio2(){
    }
    
    //Realiza la buscqueda de sec, en un arreglo busqueda, guardando los indices
    public int[] Busqueda(int[] busqueda,int[] sec){
        ArrayList<Integer> result = new ArrayList<Integer>();
        boolean condicion = false;
        for(int i=0;i<busqueda.length;i++){
            if(busqueda[i]==sec[0]){
                for(int j=0;j<sec.length;j++){
                    if(sec[j]==busqueda[i+j]){
                        condicion=true;
                    }else{
                        condicion=false;
                    }
                } 
                if(condicion){
                    result.add(i);
                }
            }            
        }
        return GetArreglo(result);
    }
    
    //Convierte un ArrayList a un arreglo simple, ?
    private int[] GetArreglo(ArrayList<Integer> arreglo){
        int[] result = new int[arreglo.size()];
        for(int i=0;i<arreglo.size();i++){
            result[i]=arreglo.get(i);
        }
        return result;
    }    
}
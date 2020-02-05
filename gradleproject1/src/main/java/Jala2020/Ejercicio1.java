/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jala2020;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Ejercicio1 {
    
    public Ejercicio1(){
    }
    
    //Convierte un numero entero en un arreglo mateniedo posiciones
    public ArrayList<Integer> numToArray(int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(n>10){
            result.add(n%10);
            result.addAll(numToArray(n/10));
        }            
        else
            result.add(n);        
        return result;
    }
    
    //Descompone un arreglo de numeros enteros segun sus posiciones
    public void DescomposcicionNumero(int n){
        if(n>0){
            ArrayList<Integer> arreglo = numToArray(n);
            for(int i=0;i<arreglo.size();i++){
                System.out.println(Math.pow(10,i)+" : "+arreglo.get(i));
            }
        }
    }
    
    
}

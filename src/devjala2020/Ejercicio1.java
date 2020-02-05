/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devjala2020;

import java.util.ArrayList;

/**
 *
 * @author Luis
 */
public class Ejercicio1 {
    
    public ArrayList<Integer> toArrayList(int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(n>10){
            result.add(n%10);
            result.addAll(toArrayList(n/10));
        }            
        else
            result.add(n);        
        return result;
    }
    
    public void DescomposcicionNumero(int n){
        if(n>0){
            ArrayList<Integer> arreglo = toArrayList(n);
            for(int i=0;i<arreglo.size();i++){
                System.out.println(Math.pow(10,i)+" : "+arreglo.get(i));
            }
        }
        
    }
    
    
    
}

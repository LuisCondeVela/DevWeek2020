/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jala2020;

/**
 *
 * @author Luis
 */
public class Ejercicio3 {
    
    public Ejercicio3(){
        
    }
    
    //Devuelve el valor binario de un numero de forma matematica
    public int ConvertirABase(int num, int baseDestino){
        if(num>=baseDestino){
            int temp = num % baseDestino;
            return (ConvertirABase(num/baseDestino, baseDestino)*10)+temp;
        }else{
            return num;
        }      
    }
    
    //Devuelve el valor de un numero entero positivo en texto binario con funciones de java
    public String ConvertirBinario(int n){
        return Integer.toBinaryString(n);
    }
    
}

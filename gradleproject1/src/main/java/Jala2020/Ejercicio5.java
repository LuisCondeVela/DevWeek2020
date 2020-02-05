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
public class Ejercicio5 {
    
    public Ejercicio5(){
        
    }
    
    //Convierte un arreglo de integers a characteres y los encadena
    public String ConvASCII(int[] msj){
        String result = "";
        for(int i:msj){
            result+=(char)i;
        }
        return result;
    }
    
}

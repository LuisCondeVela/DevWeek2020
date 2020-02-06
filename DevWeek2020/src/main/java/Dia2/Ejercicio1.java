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
public class Ejercicio1 {
    
    public Ejercicio1(){
        
    }
    
    public EJ1_Ecuacion Suma(ArrayList<Character> e1, ArrayList<Character> e2){
        EJ1_Ecuacion ec1 = new EJ1_Ecuacion(e1);
        EJ1_Ecuacion ec2 = new EJ1_Ecuacion(e2);
        return ec1.Sumar(ec2);
    }
    
}

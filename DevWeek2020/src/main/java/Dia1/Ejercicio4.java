/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia1;

/**
 *
 * @author Luis
 */
public class Ejercicio4 {
    
    public Ejercicio4(){        
    }
      
    //Convierte un numero en BaseActual a base Decimal
    public int ConvertirADecimal(int num, int BaseAct){
        int i=0;
        return ConvertirADecimal(num, BaseAct,0);         
    }
    
    //Este metodo permite convertir un numero a cualquier base a base decimal recursamente con un indice que viaja segun la profundiad del numero.
    private int ConvertirADecimal(int num, int BaseAct, int i){
        Double digi= Math.pow(BaseAct, i);
        i++;
        if(num>BaseAct){
            int temp = num % 10;
            return temp*digi.intValue()+ConvertirADecimal(num/10, BaseAct, i);
        }else{            
            return num * digi.intValue();
        }      
    }
    
    //Convertir de base usando heramientas de java
    public int ConvertirBase10(int num, int base){
        return Integer.parseInt(Integer.toString(num),base);
    }
    
}

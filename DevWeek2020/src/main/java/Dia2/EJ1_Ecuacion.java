/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luis
 */
public class EJ1_Ecuacion {
    
    ArrayList<Character> ecuacion = new ArrayList<Character>();
    ArrayList<EJ1_Elemento> variables = new ArrayList<EJ1_Elemento>();
    int total;
    
    //Constructor que recibe un arreglo de caracteres
    public EJ1_Ecuacion(ArrayList<Character> data){
        ecuacion=data;
        SetValores();           
    }
    
    //Constructor que recibe un los elementos de la ecuacion
    public EJ1_Ecuacion(ArrayList<EJ1_Elemento> elementos, int total){
        variables=elementos;
        this.total=total;
    }
    
    //Metodo para crear los elementos a partir de caracteres
    private void SetValores(){
        String numTemp = "";
        for(int i=0;i<ecuacion.size();i++){
            char tempChar = ecuacion.get(i);
            if(Character.isDigit(tempChar)){
                numTemp+=""+tempChar;
            }else{
                if(Character.isLetter(tempChar)){
                    variables.add(new EJ1_Elemento(Integer.parseInt(numTemp),tempChar));
                    numTemp="";
                }else{
                    if(tempChar=='='){
                        List<Character> temp = ecuacion.subList(i+1, ecuacion.size());
                        total=getValor(temp);
                        break;
                    }
                }
                
            }
        }
    }
    
    //suma una ecuacion a la ecuacion actual
    public EJ1_Ecuacion Sumar(EJ1_Ecuacion ec){
        ArrayList<EJ1_Elemento> elementos = new ArrayList<EJ1_Elemento>();
        int total = 0;
        for(EJ1_Elemento elAct:variables){
            for(EJ1_Elemento elFor:ec.getVariables()){
                EJ1_Elemento temp=elAct.SumarPorCoef(elFor);
                if(temp!=null)
                    elementos.add(temp);
            }  
        }
        total=this.total+ec.getTotal();
        return new EJ1_Ecuacion(elementos, total);
    }
    
    public ArrayList<EJ1_Elemento> getVariables(){
        return variables;
    }
    
    public int getTotal(){
        return total;
    }
        
    //Convierte a String la ecuacion
    public String toString(){
        String res = "";
        int index=0;
        do{
            res+=variables.get(index).toString();
            if(index!=variables.size()-1)
                res+="+";
            index++;
        }while(index<variables.size());
        return res+"="+total;
    }
    
    //Obtiene el valor total
    private int getValor(List<Character> car){
        String res = "";
        for(char c:car){
            if(Character.isDigit(c)){
                res+=""+c;
            }
        }
        return Integer.parseInt(res);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class Ejercicio4Test {
    
    public Ejercicio4Test() {
    }

    /**
     * Test of BusquedaBinaria method, of class Ejercicio4.
     */
    @Test
    public void testBusquedaBinaria() {
        Ejercicio4 ej4 = new Ejercicio4();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int dato = 3;
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println("Resultado de busqueda binaria:"+ej4.BusquedaBinaria(arr, dato));
        assertNotNull(ej4.BusquedaBinaria(arr, dato));
    }  
    
}

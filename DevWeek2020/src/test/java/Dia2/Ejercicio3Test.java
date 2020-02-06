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
public class Ejercicio3Test {
    
    public Ejercicio3Test() {
    }

    @Test
    public void testPrubeaBusLine(){
        Ejercicio3 ej3 = new Ejercicio3();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int dato = 3;
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println("Resultado de busqueda lineal:"+ej3.BusquedaLineal(arr, dato));
        assertNotNull(ej3.BusquedaLineal(arr, dato));
    }
    
}

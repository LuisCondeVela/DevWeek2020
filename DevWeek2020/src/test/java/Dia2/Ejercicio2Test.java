/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class Ejercicio2Test {
    
    public Ejercicio2Test() {
    }

    /**
     * Test of Busqueda method, of class Ejercicio2.
     */
    @Test
    public void testBusqueda() {
        Ejercicio2 ej2 = new Ejercicio2();
        int[] busqueda = {7,4,9,2,15,3,4,8,1,8,5,2,15,11,13,17,14};
        int[] sec = {2,15};
        int[] res = ej2.Busqueda(busqueda, sec);
        for(int i:res){
            System.out.println(i);
        }
        assertEquals(res.length, 2);
    }
    
}

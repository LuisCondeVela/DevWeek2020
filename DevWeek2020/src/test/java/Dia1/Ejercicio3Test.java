/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class Ejercicio3Test {
    
    public Ejercicio3Test() {
    }

    /**
     * Test of ConvertirABase method, of class Ejercicio3.
     */
    @Test
    public void testConvertirABase() {
        Ejercicio3 tres = new Ejercicio3();
        System.out.println("Ejercicio3: "+tres.ConvertirABase(53, 2));
        assertEquals(tres.ConvertirABase(53, 2), 110101);        
    }

    /**
     * Test of ConvertirBinario method, of class Ejercicio3.
     */
    @Test
    public void testConvertirBinario() {
        Ejercicio3 tres = new Ejercicio3();
        System.out.println("Ejercicio3: "+tres.ConvertirBinario(53));
        assertEquals(tres.ConvertirBinario(53), "110101");
    }
    
}

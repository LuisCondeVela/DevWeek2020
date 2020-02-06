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
public class Ejercicio4Test {
    
    public Ejercicio4Test() {
    }

    /**
     * Test of ConvertirADecimal method, of class Ejercicio4.
     */
    @Test
    public void testConvertirADecimal() {
        Ejercicio4 cuatro = new Ejercicio4();
        System.out.println("Ejercicio4:"+cuatro.ConvertirADecimal(110101, 2));
        assertEquals(cuatro.ConvertirADecimal(110101, 2), 53);
    }

    /**
     * Test of ConvertirBase10 method, of class Ejercicio4.
     */
    @Test
    public void testConvertirBase10() {
        Ejercicio4 cuatro = new Ejercicio4();
        System.out.println("Ejercicio4:"+cuatro.ConvertirBase10(110101, 2));
        assertEquals(cuatro.ConvertirBase10(110101, 2), 53);
    }
    
}

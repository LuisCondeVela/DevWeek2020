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
public class Ejercicio2Test {
    
    public Ejercicio2Test() {
    }

    /**
     * Test of NumeroInvertido method, of class Ejercicio2.
     */
    @Test
    public void testNumeroInvertido() {
    }

    /**
     * Test of ArregloANumero method, of class Ejercicio2.
     */
    @Test
    public void testArregloANumero() {
        Ejercicio2 dos = new Ejercicio2();
        System.out.println("123 invertido es :"+dos.NumeroInvertido(123));
        assertEquals(321, dos.NumeroInvertido(123));        
    }    
    
}

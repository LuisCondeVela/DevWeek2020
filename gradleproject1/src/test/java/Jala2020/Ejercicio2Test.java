/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jala2020;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis
 */
public class Ejercicio2Test {
    
    public Ejercicio2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of NumeroInvertido method, of class Ejercicio2.
     */
    @Test
    public void testNumeroInvertido() {
        System.out.println("NumeroInvertido");
        int n = 0;
        Ejercicio2 instance = new Ejercicio2();
        int expResult = 0;
        int result = instance.NumeroInvertido(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArregloANumero method, of class Ejercicio2.
     */
    @Test
    public void testArregloANumero() {
        System.out.println("ArregloANumero");
        ArrayList<Integer> arreglo = null;
        Ejercicio2 instance = new Ejercicio2();
        int expResult = 0;
        int result = instance.ArregloANumero(arreglo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

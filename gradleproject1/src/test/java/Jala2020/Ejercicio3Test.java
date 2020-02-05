/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jala2020;

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
public class Ejercicio3Test {
    
    public Ejercicio3Test() {
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
     * Test of ConvertirABase method, of class Ejercicio3.
     */
    @Test
    public void testConvertirABase() {
        System.out.println("ConvertirABase");
        int num = 0;
        int baseDestino = 0;
        Ejercicio3 instance = new Ejercicio3();
        int expResult = 0;
        int result = instance.ConvertirABase(num, baseDestino);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConvertirBinario method, of class Ejercicio3.
     */
    @Test
    public void testConvertirBinario() {
        System.out.println("ConvertirBinario");
        int n = 0;
        Ejercicio3 instance = new Ejercicio3();
        String expResult = "";
        String result = instance.ConvertirBinario(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testEjercicio3(){
        Ejercicio3 tres = new Ejercicio3();
        System.out.println("Ejercicio3:"+tres.ConvertirBinario(53));
        System.out.println("Ejercicio3:"+tres.ConvertirABase(53, 2));
    }
    
}

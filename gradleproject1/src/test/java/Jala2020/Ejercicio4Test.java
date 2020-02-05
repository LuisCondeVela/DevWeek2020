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
public class Ejercicio4Test {
    
    public Ejercicio4Test() {
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
     * Test of ConvertirADecimal method, of class Ejercicio4.
     */
    @Test
    public void testConvertirADecimal() {
        System.out.println("ConvertirADecimal");
        int num = 0;
        int BaseAct = 0;
        Ejercicio4 instance = new Ejercicio4();
        int expResult = 0;
        int result = instance.ConvertirADecimal(num, BaseAct);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ConvertirBase10 method, of class Ejercicio4.
     */
    @Test
    public void testConvertirBase10() {
        System.out.println("ConvertirBase10");
        int num = 0;
        int base = 0;
        Ejercicio4 instance = new Ejercicio4();
        int expResult = 0;
        int result = instance.ConvertirBase10(num, base);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testEjercicio4(){
        Ejercicio4 cuatro = new Ejercicio4();
        System.out.println("Ejercicio4:"+cuatro.ConvertirADecimal(110101, 2));
    }
}

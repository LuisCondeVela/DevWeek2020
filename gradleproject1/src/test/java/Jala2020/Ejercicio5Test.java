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
public class Ejercicio5Test {
    
    public Ejercicio5Test() {
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
     * Test of ConvASCII method, of class Ejercicio5.
     */
    @Test
    public void testConvASCII() {
        System.out.println("ConvASCII");
        int[] msj = null;
        Ejercicio5 instance = new Ejercicio5();
        String expResult = "";
        String result = instance.ConvASCII(msj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testEjercicio5(){
        Ejercicio5 cinco = new Ejercicio5();
        int[] mensaje = {34,66,105,101,110,118,101,110,105,100,111,115,32,97,32,108,97,32,70,117,110,100,97,99,105,111,110,32,74,97,108,97,32,58,45,41,33,34};
        System.out.println("Ejercicio4:"+cinco.ConvASCII(mensaje));
    }
}

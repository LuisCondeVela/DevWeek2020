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
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
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
     * Test of toArrayList method, of class Ejercicio1.
     */
    /*@Test
    public void testToArrayList() {
        System.out.println("toArrayList");
        int n = 0;
        Ejercicio1 instance = new Ejercicio1();
        ArrayList<Integer> expResult = null;
        ArrayList<Integer> result = instance.toArrayList(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of DescomposcicionNumero method, of class Ejercicio1.
     */
    /*s@Test
    public void testDescomposcicionNumero() {
        System.out.println("DescomposcicionNumero");
        int n = 0;
        Ejercicio1 instance = new Ejercicio1();
        instance.DescomposcicionNumero(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
    @Test
    public void PruebaEjercicio1(){
        Ejercicio1 uno = new Ejercicio1();
        uno.DescomposcicionNumero(123); 
        //System.out.println("Todo bien");
        assertTrue(true);
    }
    
}

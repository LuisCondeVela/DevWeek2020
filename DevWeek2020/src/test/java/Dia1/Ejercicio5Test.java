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
public class Ejercicio5Test {
    
    public Ejercicio5Test() {
    }

    /**
     * Test of ConvASCII method, of class Ejercicio5.
     */
    @Test
    public void testConvASCII() {
        Ejercicio5 cinco = new Ejercicio5();
        int[] mensaje = {34,66,105,101,110,118,101,110,105,100,111,115,32,97,32,108,97,32,70,117,110,100,97,99,105,111,110,32,74,97,108,97,32,58,45,41,33,34};
        System.out.println("Ejercicio4:"+cinco.ConvASCII(mensaje));
    }
    
}

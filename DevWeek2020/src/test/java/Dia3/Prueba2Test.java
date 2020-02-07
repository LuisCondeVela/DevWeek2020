/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class Prueba2Test {
    
    public Prueba2Test() {
    }

    
    /**
     * Test of PosiblesMovimientos method, of class Tablero.
     */
    @Test
    public void testPosiblesMovimientos() {
        Tablero est = new Tablero(16);
        System.out.println(est.toString());
        System.out.println(est.PosiblesMovimientos());
    }
    
}

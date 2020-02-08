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
        Tablero tablero = new Tablero(16);
        tablero.Poner(new Pieza(0,1,0));
        System.out.println(tablero.toString());
        System.out.println("Posibles movimientos:");
        System.out.println(tablero.PosiblesMovimientos());
    }
    
}

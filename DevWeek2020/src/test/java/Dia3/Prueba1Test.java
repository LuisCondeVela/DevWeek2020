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
public class Prueba1Test {
    
    public Prueba1Test() {
    }

    @Test
    public void testToString() {
        Tablero tablero = new Tablero(16);
        tablero.Poner(new Pieza(3,3,0));
        System.out.println(tablero.toString());
    }
    
}

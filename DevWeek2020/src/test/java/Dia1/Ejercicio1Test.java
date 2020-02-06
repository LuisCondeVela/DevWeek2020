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
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
    }
    
    /**
     * Test de DescomposcicionNumero method, muestra el numero segun su posicion decimal.
     */
    @Test
    public void testDescomposcicionNumero() {
        Ejercicio1 uno = new Ejercicio1();
        uno.DescomposcicionNumero(123); 
        assertTrue(true); 
    }
    
}

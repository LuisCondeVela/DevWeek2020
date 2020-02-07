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
public class Prueba3Test {
    
    public Prueba3Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testMovimientos() {
        Tablero est = new Tablero(16);
        System.out.println(est.toString());
        //System.out.println(est.PosiblesMovimientos());   
        est.Mover("Arriba");
        System.out.println(est.toString());
        System.out.println(est.PosActual.toString());
        System.out.println(est.PosiblesMovimientos()); 
    }
}

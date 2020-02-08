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
 * @author student
 */
public class Prueba4Test {
    
    public Prueba4Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMovimientosAleatorios() {
        Tablero est = new Tablero(16);
        //System.out.println(est.toString());
        String[] temp = est.MovidasAleatorias(5, new Pieza(1,1,0));
        System.out.println(est.toString());
        System.out.println("Movidas aleatorias");
        for(String s:temp)
            System.out.println(" "+s);
        
    }
}

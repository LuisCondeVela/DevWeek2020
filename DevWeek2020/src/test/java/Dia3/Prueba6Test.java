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
public class Prueba6Test {
    
    public Prueba6Test() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMovimientosAleatoriosAplicados() {
        int numeroDeMovidas = 5;
        Pieza piezaInicial = new Pieza(1,1,0);
        
        Tablero tablero = new Tablero(16);
        
        String[] temp = tablero.MovidasAleatorias(numeroDeMovidas,piezaInicial);
        
        System.out.println(tablero.toString());
        System.out.println("Movidas aleatorias");
        for(String s1:temp)
            System.out.println(" "+s1);
        System.out.println("Movidas aplicadas");
        for(String s2:temp)
            tablero.Mover(s2);           
        System.out.println(tablero.toString());
        System.out.println("Historial de movidas");
        for(String s3:tablero.historial)
            System.out.println(" "+s3);
    }
}

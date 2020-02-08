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
        Tablero tablero = new Tablero(16);
        tablero.Poner(new Pieza(0,1,0));
        System.out.println(tablero.toString()); 
        System.out.println("De los posibles movimientos:");
        String[] movimientos = tablero.PosiblesMovimientosLiterales();
        for(String s:movimientos){
            System.out.println(" "+s);
        }
        int x =(int) (Math.random()*(((movimientos.length-1)-0)+1))+0;
        System.out.println("Se eligio: "+movimientos[x]);
        tablero.Mover(movimientos[x]);
        System.out.println("Quedando el tablero de la siguiente manera:");
        System.out.println(tablero.toString());
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia2;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
    }

    @Test
    public void testSomeMethod() {
        ArrayList<Character> ec1 = new ArrayList<Character>();
        ec1.add('2');
        ec1.add('x');
        ec1.add(' ');
        ec1.add('+');
        ec1.add(' ');
        ec1.add('9');
        ec1.add('y');
        ec1.add(' ');
        ec1.add('=');
        ec1.add(' ');
        ec1.add('2');
        ArrayList<Character> ec2 = new ArrayList<Character>();
        ec2.add('1');
        ec2.add('6');
        ec2.add('x');
        ec2.add(' ');
        ec2.add('+');
        ec2.add(' ');
        ec2.add('5');
        ec2.add('y');
        ec2.add(' ');
        ec2.add('=');
        ec2.add(' ');
        ec2.add('3');
        ec2.add('6');
        
        Ejercicio1 ej1 = new Ejercicio1();
        System.out.println("TOTAL: "+ej1.Suma(ec1, ec2).toString());
    }
    
}

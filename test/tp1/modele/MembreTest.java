/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1.modele;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nobby
 */
public class MembreTest {
    
    public MembreTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("------------------------");
        System.out.println("Avant Tests:BeforeClass");
        System.out.println("------------------------");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("------------------------");
        System.out.println("Après Tests:AfterClass");
        System.out.println("------------------------");
    }
    
    @Test
    public void premierTest() {
        System.out.println("Premier Test");
    }

    @Test
    public void deuxiemeTest() {
        System.out.println("Deuxième Test");
    }

    @Test
    public void troisiemeTest() {
        System.out.println("Troisième Test");
    }
    
}

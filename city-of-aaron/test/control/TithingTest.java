/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ethanrusson
 */
public class TithingTest {
    
    public TithingTest() {
    }

    /**
     * Test of calcTithingPaid method, of class Tithing.
     */
    @Test
    public void testCalcTithingPaid() {
        System.out.println("calcTithingPaid");
        int tithingPercentage = 0;
        int wheatHarvested = 0;
        int totalWheat = 0;
        double expResult = -1;
        double result = Tithing.calcTithingPaid(tithingPercentage, wheatHarvested, totalWheat);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCase1() {
        double result = Tithing.calcTithingPaid(10,500,1000);
        assertEquals(950, result, 0.001);
    }
    @Test
    public void testCase2() {
        double result = Tithing.calcTithingPaid(7,500,1000);
        assertEquals(950, result, 0.001);
    }
    @Test
    public void testCase3() {
        double result = Tithing.calcTithingPaid(13,500,1000);
        assertEquals(-1, result, 0.001);
    }
    @Test
    public void testCase4() {
        double result = Tithing.calcTithingPaid(10,0,1000);
        assertEquals(-1, result, 0.001);
    }
    @Test
    public void testCase5() {
        double result = Tithing.calcTithingPaid(8,500,1000);
        assertEquals(960, result, 0.001);
    }
    @Test
    public void testCase6() {
        double result = Tithing.calcTithingPaid(12,500,1000);
        assertEquals(940, result, 0.001);
    }
    
}

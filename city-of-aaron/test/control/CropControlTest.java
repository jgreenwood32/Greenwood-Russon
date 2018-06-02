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
 * @author Justin
 */
public class CropControlTest {
    

    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int landPrice = 0;
        int totalWheat = 0;
        int acres = 0;
        double expResult = -1;
        double result = CropControl.buyLand(acres, landPrice, totalWheat);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testCase1() {
        double result = CropControl.buyLand(100,17,4000);
        assertEquals(2300, result, 0.001);
    }
    
    @Test
    public void testCase2() {
        double result = CropControl.buyLand(100,25,200);
        assertEquals(-1, result, 0.001);
    }
    
    @Test
    public void testCase3() {
        double result = CropControl.buyLand(-1,20,4000);
        assertEquals(-1, result, 0.001);
    }
    
    @Test
    public void testCase4() {
        double result = CropControl.buyLand(10,17,1000);
        assertEquals(830, result, 0.001);
    }
    
    @Test
    public void testCase5() {
        double result = CropControl.buyLand(10,27,1000);
        assertEquals(730, result, 0.001);
    }
    
    /**
     * Test method for calPeopleFed
     */
    
    @Test
    public void testCalPeopleFed() {
        System.out.println("calPeopleFed");
        int foodToPeople = 0;
        int storage = 0;
        double expResult= 0;
        double result = CropControl.calPeopleFed(foodToPeople, storage);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testcase6(){
     double result=CropControl.calPeopleFed(1,100);
     assertEquals(99, result, 0.0);
    }
    
    @Test
    public void testcase7(){
     double result=CropControl.calPeopleFed(-1,100);
     assertEquals(-1, result, 0.0);
    }
    
    @Test
    public void testcase8(){
     double result=CropControl.calPeopleFed(101,100);
     assertEquals(-1, result, 0.0);
    }
    
    @Test
    public void testcase9(){
     double result=CropControl.calPeopleFed(0,100);
     assertEquals(100, result, 0.01);
    }
    
    @Test
    public void testcase10(){
     double result=CropControl.calPeopleFed(99,100);
     assertEquals(1, result, 0.0);
    }
}


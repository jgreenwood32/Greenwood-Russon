/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Ethan
 */
public class Tithing {
    
    public static double calcTithingPaid(int tithingPercentage, int wheatHarvested, int totalWheat){
       
        if (tithingPercentage < 8 || tithingPercentage > 12){
            return -1;
        }
        if (wheatHarvested <= 0){
            return -1;
        }
        double tithing = tithingPercentage / 100;
        
        double newTotalWheat = totalWheat - (wheatHarvested * tithing);
        
        return newTotalWheat;
    }
}

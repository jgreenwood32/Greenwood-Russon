/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Justin
 */
public class CropControl {
    
    public static double buyLand(int acres, int landPrice, int totalWheat){
       
        if (acres <= 0){
            return -1;
        }
        if (landPrice < 17 || landPrice>27){
            return -1;
        }
        
        double cost = acres*landPrice;
        if (cost > totalWheat){
            return -1;
        }
        double purchase = totalWheat - cost;
        
        return purchase;
    }
    
            
}

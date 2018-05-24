/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
        
/**
 *
 * @author Justin
 */
public class Provisions implements Serializable{
    
    private String name;
    private boolean perishable;
    
    public Provisions(){
        //empty constructor for javabeans
    }
    
    public String getName() {
        return name;
        
    
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isPerishable() {
        return perishable;
    }
    
    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }
    
    @Override
        public String toString() {
            return "Provisions{"
                    + ", name=" + name
                    + ", perishable=" + perishable
                    + "}";
        }
}

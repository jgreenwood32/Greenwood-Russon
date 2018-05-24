/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author ethanrusson
 */
public class Storehouse {
    private String Author[];
    private String[] animals;
    private String[] tools;
    private String[] provisions;
    
    public Storehouse() {
        //empty constructor for javabeans
    }

    public String[] getAuthor() {
        return Author;
    }

    public void setAuthor(String[] Author) {
        this.Author = Author;
    }

    public String[] getAnimals() {
        return animals;
    }

    public void setAnimals(String[] animals) {
        this.animals = animals;
    }

    public String[] getTools() {
        return tools;
    }

    public void setTools(String[] tools) {
        this.tools = tools;
    }

    public String[] getProvisions() {
        return provisions;
    }

    public void setProvisions(String[] provisions) {
        this.provisions = provisions;
    }
    
    @Override 
    public String toString() {
        return "Storehouse class coming soon";
    }
}

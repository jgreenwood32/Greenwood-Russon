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
public class Storehouse implements Serializable{
    private Author[] author = new Author[3];
    private InventoryItem[] animals = new InventoryItem[5];
    private InventoryItem[] tools = new InventoryItem[5];
    private InventoryItem[] provisions = new InventoryItem[5];
    
    public Storehouse() {
        //empty constructor for javabeans
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public InventoryItem[] getAnimals() {
        return animals;
    }

    public void setAnimals(InventoryItem[] animals) {
        this.animals = animals;
    }

    public InventoryItem[] getTools() {
        return tools;
    }

    public void setTools(InventoryItem[] tools) {
        this.tools = tools;
    }

    public InventoryItem[] getProvisions() {
        return provisions;
    }

    public void setProvisions(InventoryItem[] provisions) {
        this.provisions = provisions;
    }
    
    @Override 
    public String toString() {
        return "Storehouse ({"
                + ", author=" + author
                + ", animals=" + animals
                + ", tools=" + tools
                + ", provisions=" + provisions
                + " }";
    }
}

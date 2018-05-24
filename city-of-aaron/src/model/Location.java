/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;
/**
 *
 * @author ethanrusson
 */
public class Location {
    private String name;
    private String description;
    private String mapSymbol;
    private String[] gameTips;
    
    public Location() {
        //empty constructor for javabeans
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
    public String[] getGameTips() {
        return gameTips;
    }

    public void setGameTips(String[] tips) {
        this.gameTips = tips;
    }
    
    @Override
    public String toString() {
        return "Location{"
                + ",name=" + name
                + ",description=" + description
                + ",mapSymbol=" + mapSymbol
                + ",gameTips=" + Arrays.toString(gameTips)
                + "}";
    }
}
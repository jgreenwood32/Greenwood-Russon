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
public class Map {
    
    private String[][] Location;
    private Point currentLocation;
    
    public Map() {
        //empty constructor for javabeans
    }
    
    public String[][] getLocations() {
        return Location;
    }
    
    public Point getCurrentLocation() {
        return currentLocation;
    }
    
    public void setCurrentLocation(Point point) {
        this.currentLocation = point;
    }
    
    @Override
    public String toString() {
        return "Map ({"
                + ", currentLocation=" + currentLocation
                + "}";
    }
}

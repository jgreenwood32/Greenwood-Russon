/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ethanrusson
 */
public class Point {
    private int row;
    private int column;
    
    public Point() {
        //empty constructor for javabeans
    }
    
    public int getRow() {
        return row;
    }
    
    public void setRow(int row) {
        this.row = row;
    }
    
    public int getColumn() {
        return column;
    }
    
    public void setColumn(int column) {
        this.column = column;
    }
    
    @Override
    public String toString() {
        return "Point class coming soon";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

import java.util.Date;

/**
 *
 * @author Kornél
 */
public class GeometricShape {
    private String color="white";
    private boolean filled=false;
    private Date dateCreated = new Date();

    public GeometricShape() {
    }

    public GeometricShape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
//        return "GeometricShape{" + "color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + '}';
        return "created on " + dateCreated + '\n' + "color: " + color + " and filled: " + filled;
    }
    
}

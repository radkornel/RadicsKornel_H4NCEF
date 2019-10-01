/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pont;

/**
 *
 * @author Kornél
 */
public class Pont {
    private double x;
    private double y;

    public Pont() {
        
    }

    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    public static void main(String[] args) {
        Pont p1= new Pont(3, 3);
        Pont p2= new Pont(4, 2);
        Pont p3= new Pont(5, -2);
        Pont p4= new Pont(1, -6);
        
        p1.setY(p1.getY()+5);
        p2.setY(p2.getY()+5);
        p3.setX(p3.getX()-3.4);
        p4.setX(p4.getX()-3.4);
        
        System.out.println("x:" + p1.getX() + " y:" + p1.getY());
        System.out.println("x:" + p2.getX() + " y:" + p2.getY());
        System.out.println("x:" + p3.getX() + " y:" + p3.getY());
        System.out.println("x:" + p4.getX() + " y:" + p4.getY());
        
    }
    
    
}

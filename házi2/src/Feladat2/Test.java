/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

/**
 *
 * @author Kornél
 */
public class Test {
    public static void main(String[] args) {
        Triangle t1=new Triangle(1, 1.5, 1);
        t1.setColor("yellow");
        t1.setFilled(true);
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        System.out.println("Color: " + t1.getColor());
        System.out.println("Filled: " + t1.isFilled());
    }
}

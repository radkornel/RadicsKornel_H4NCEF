/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author Kornél
 */
public class Rectangle {
    public double width=1;
    public double height=1;

    public Rectangle() {
    }
    
    public Rectangle(double w, double h) {
        this.height=h;
        this.width=w;
    }
    
    public double getArea(){
        return this.height*this.width;
    }
    
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + ", Area:" + getArea() + ", Perimeter:" + getPerimeter() +'}';
    }
    
    public static void main(String[] args) {
        Rectangle r1= new Rectangle(4, 40);
        Rectangle r2= new Rectangle(3.5, 35.9);
        
        System.out.println(r1);
        System.out.println(r2);
    }
}

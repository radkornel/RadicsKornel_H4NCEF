/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegularPolygon;

/**
 *
 * @author Kornél
 */
public class RegularPolygon {
    private int n;
    private double  side;
    private double x;
    private double y;
    
    public RegularPolygon(){
        this.n=3;
        this.side=1;
        this.x=0;
        this.y=0;
    }
    public RegularPolygon(int n, double side){
        this.n=n;
        this.side=side;
        this.x=0;
        this.y=0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double getPerimeter()
    {
        return this.n*this.side;
    }
    
    public double getArea()
    {
        return (((this.side/(2*Math.tan(Math.PI/this.n)))*this.side)/2)*this.n;
    }
    
    public String toString(){
        return "Polygon{" + "Perimeter:" + this.getPerimeter() + ", Area: " + this.getArea() + "}";
    }
    
    public static void main(String[] args) {
        RegularPolygon p1=new RegularPolygon();
        RegularPolygon p2=new RegularPolygon(6, 4);
        RegularPolygon p3=new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}

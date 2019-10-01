/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuadraticEquation;

/**
 *
 * @author Kornél
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    
    public double getDiscriminant(){
        return this.b*this.b-4*(this.a*this.c);
    }
    
    public double getRoot1(){
        if(this.getDiscriminant()<0){
            return 0;
        } else {
            return (-this.b+Math.sqrt(this.getDiscriminant()))/(2*this.a);
        }
    }
    
    public double getRoot2(){
        if(this.getDiscriminant()<0){
            return 0;
        } else {
            return (-this.b-Math.sqrt(this.getDiscriminant()))/(2*this.a);
        }
    }

    @Override
    public String toString() {
        if(this.getDiscriminant()>0){
            return "Root1:" + this.getRoot1() + ", Root2:" + this.getRoot2();
        } else if(this.getDiscriminant()==0){
            return "Root:" + this.getRoot1();
        } else {
            return "The equation has no roots.";
        }
    }
    
    public static void main(String[] args) {
        QuadraticEquation q1= new QuadraticEquation(5, 0 ,-80);
        QuadraticEquation q2= new QuadraticEquation(1, -14 ,49);
        QuadraticEquation q3= new QuadraticEquation(1, 1, 1);
        
        System.out.println(q1);
        System.out.println(q2);
        System.out.println(q3);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinearEquation;

/**
 *
 * @author Kornél
 */
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }
    
    public boolean isSolvable(){
        if((a*d-b*c)>0){
            return true;
        } else {
            return false;
        }
    }
    
    public double getX(){
        return (e*d-b*f)/(a*d-b*c);
    }
    
    public double getY(){
        return (a*f-e*c)/(a*d-b*c);
    }

    @Override
    public String toString() {
        if((a*d-b*c)==0){
            return  "The equation has no solution.";
        } else {
            return "X=" + this.getX() + ", Y=" + this.getY();
        }
    }
    
    
    
    public static void main(String[] args) {
        LinearEquation l1= new LinearEquation(4, 3, 2, -1, 14, 12);
        LinearEquation l2= new LinearEquation(-4, -1, 1, 5, 40, 9);
        LinearEquation l3= new LinearEquation(2, -6, 5, 3, 6, 42);
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}

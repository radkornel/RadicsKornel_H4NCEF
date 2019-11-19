/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat11;

/**
 *
 * @author Kornél
 */
public class Hallgató extends Személy {
    private double átlag;

    public Hallgató(String név, int életkor, boolean férfi, double átlag) {
        super(név, életkor, férfi);
        this.átlag = átlag;
    }

    public double getÁtlag() {
        return átlag;
    }

    public String getNév() {
        return név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public void setÁtlag(double átlag) {
        this.átlag = átlag;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getNév()).append("\n").append(this.getÉletkor()).append("\n").append(this.isFérfi()).append("\n").append(this.getÁtlag());
        
        return sb.toString();
    }
    
    public boolean jokepessegu(double szám){
        if(this.átlag>=szám){
            return true;
        } else {
            return false;
        }
    }
}

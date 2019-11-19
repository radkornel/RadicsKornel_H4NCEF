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
public class Személy implements Comparable<Személy>{
    protected String név;
    protected int életkor;
    private boolean férfi;

    public Személy(String név, int életkor, boolean férfi) {
        this.név = név;
        this.életkor = életkor;
        this.férfi = férfi;
    }

    public String getNév() {
        return név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public boolean isFérfi() {
        return férfi;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }

    public void setFérfi(boolean férfi) {
        this.férfi = férfi;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.név).append(" ").append(this.életkor).append(" ").append(this.férfi);
        
        return sb.toString();
    }

    @Override
    public int compareTo(Személy sz) {
        return Integer.compare(this.életkor, sz.getÉletkor());
    }
    
}

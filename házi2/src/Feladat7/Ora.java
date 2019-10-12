/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat7;

/**
 *
 * @author Kornél
 */
public class Ora {
    public int kód;
    String név;
    public int kezdet;

    public Ora(int kód, String név, int kezdet) {
        this.kód = kód;
        this.név = név;
        this.kezdet = kezdet;
        if(this.kezdet>19 || this.kezdet==1){
            this.kezdet=19;
        } else if(this.kezdet>1 && this.kezdet<8){
            this.kezdet=8;
        }
    }

    public int getKód() {
        return kód;
    }

    public String getNév() {
        return név;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKód(int kód) {
        this.kód = kód;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKezdet(int kezdet) {
        this.kezdet = kezdet;
    }

    @Override
    public String toString() {
        return "Ora{" + "k\u00f3d=" + kód + ", n\u00e9v=" + név + ", kezdet=" + kezdet + '}';
    }

}

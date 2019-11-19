/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat9;

/**
 *
 * @author Kornél
 */
public class Hátizsák implements Comparable<Hátizsák>{
    private String márka;
    private double űrtartalom;
    private int zsebekSzáma;
    private boolean vízhatlan;

    public Hátizsák(String márka, double űrtartalom, int zsebekSzáma, boolean vízhatlan) {
        this.márka = márka;
        this.űrtartalom = űrtartalom;
        this.zsebekSzáma = zsebekSzáma;
        this.vízhatlan = vízhatlan;
    }

    public String getMárka() {
        return márka;
    }

    public double getŰrtartalom() {
        return űrtartalom;
    }

    public int getZsebekSzáma() {
        return zsebekSzáma;
    }

    public boolean isVízhatlan() {
        return vízhatlan;
    }

    @Override
    public String toString() {
        return "H\u00e1tizs\u00e1k{" + "m\u00e1rka=" + márka + ", \u0171rtartalom=" + űrtartalom + ", zsebekSz\u00e1ma=" + zsebekSzáma + ", v\u00edzhatlan=" + vízhatlan + '}';
    }

    @Override
    public int compareTo(Hátizsák t) {
        if(this.márka.equals(t.márka)){
            return Integer.compare(this.zsebekSzáma, t.zsebekSzáma);
        } else {
            return this.márka.compareTo(t.márka);
        }
    }
}

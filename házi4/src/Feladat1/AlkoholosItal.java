/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Kornél
 */
public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String i, double a) {
        this.iz = i;
        this.alkoholTartalom = a;
    }

    @Override
    public String milyenIzu() {
        return iz;
    }

    @Override
    public double mennyiAlkoholtTartalmaz() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return "AlkoholosItal{" + "iz=" + iz + ", alkoholTartalom=" + alkoholTartalom + '}';
    }
    
}

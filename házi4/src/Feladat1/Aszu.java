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
public class Aszu extends Bor{
    private int puttonySzam;

    public Aszu(int puttonySzam, String szoloFajta, String termoTerulet, String iz, double alkoholTartalom) {
        super(szoloFajta, termoTerulet, iz, alkoholTartalom);
        this.puttonySzam = puttonySzam;
    }
    
    public int hanyPuttonyos(){
        return puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu:" + super.milyenSzolobolKeszult()+ ", " + super.holTermett() + ", " + super.milyenIzu() + ", " + super.mennyiAlkoholtTartalmaz()
                + ", puttonySzam=" + puttonySzam;
    }
    
    
}

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

public class Orarend{
    String nap;
    Ora[] objektumok;
    public int óraszám;

    public Orarend(String nap) {
        this.nap = nap;
        this.óraszám=0;
        this.objektumok=new Ora[12];
    }

    public String getNap() {
        return nap;
    }

    public Ora[] getObjektumok() {
        return objektumok;
    }

    public int getÓraszám() {
        return óraszám;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setObjektumok(Ora[] objektumok) {
        this.objektumok = objektumok;
    }

    public void setÓraszám(int óraszám) {
        this.óraszám = óraszám;
    }

    @Override
    public String toString() {
        return "Orarend{" + "nap=" + nap + ", objektumok=" + objektumok + ", \u00f3rasz\u00e1m=" + óraszám + '}';
    }
    
     
}

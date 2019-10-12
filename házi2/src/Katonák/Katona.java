/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katonák;

/**
 *
 * @author Kornél
 */
public class Katona {
    private int Támadóerő;
    private int Védőerő;

    public Katona() {
        this.Támadóerő=5;
        this.Védőerő=5;
    }

    public Katona(int Támadóerő, int Védőerő) {
        this.Támadóerő = Támadóerő;
        this.Védőerő = Védőerő;
    }

    public int getTámadóerő() {
        return Támadóerő;
    }

    public int getVédőerő() {
        return Védőerő;
    }

    public void setTámadóerő(int Támadóerő) {
        this.Támadóerő = Támadóerő;
    }

    public void setVédőerő(int Védőerő) {
        this.Védőerő = Védőerő;
    }

    @Override
    public String toString() {
        return "TE:" + Támadóerő + ", VE:" + Védőerő;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Katona)){
            return false;
        }
        
        Katona k=(Katona)obj;
        return this.Támadóerő == k.getTámadóerő() && this.Védőerő == k.getVédőerő();
    }
    
    
}

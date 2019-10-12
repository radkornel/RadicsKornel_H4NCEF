/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Izzasztó_feladat;

/**
 *
 * @author Kornél
 */
public class Izzaszto_Feladat {
    String város;
    public int hő;

    public Izzaszto_Feladat(String város, int hő) {
        this.város = város;
        this.hő = hő;
    }

    public String getVáros() {
        return város;
    }

    public int getHő() {
        return hő;
    }

    public void setVáros(String város) {
        this.város = város;
    }

    public void setHő(int hő) {
        this.hő = hő;
    }

    @Override
    public String toString() {
        return város + " (" + hő + ")";
    }
    
    
}

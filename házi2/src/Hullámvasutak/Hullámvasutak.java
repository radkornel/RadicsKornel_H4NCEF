/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullámvasutak;

/**
 *
 * @author Kornél
 */
public class Hullámvasutak {
    String hv_név;
    String világ_név;
    public int magasság;
    public int vár_idő;

    public Hullámvasutak(String hv_név, String világ_név, int magasság, int vár_idő) {
        this.hv_név = hv_név;
        this.világ_név = világ_név;
        this.magasság = magasság;
        this.vár_idő = vár_idő;
    }

    public String getHv_név() {
        return hv_név;
    }

    public String getVilág_név() {
        return világ_név;
    }

    public int getMagasság() {
        return magasság;
    }

    public int getVár_idő() {
        return vár_idő;
    }

    public void setHv_név(String hv_név) {
        this.hv_név = hv_név;
    }

    public void setVilág_név(String világ_név) {
        this.világ_név = világ_név;
    }

    public void setMagasság(int magasság) {
        this.magasság = magasság;
    }

    public void setVár_idő(int vár_idő) {
        this.vár_idő = vár_idő;
    }

    

    @Override
    public String toString() {
        return this.getHv_név() + " (" + this.getVilág_név() + "): " + this.getVár_idő();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katonák;

import Katonák.Katona;

/**
 *
 * @author Kornél
 */
public class Nyilas extends Katona{
    private int lőtáv;

    public int getLőtáv() {
        return lőtáv;
    }

    public void setLőtáv(int lőtáv) {
        this.lőtáv = lőtáv;
    }

    public Nyilas(int lőtáv, int Támadóerő, int Védőerő) {
        super(Támadóerő, Védőerő);
        this.lőtáv = lőtáv;
        this.setTámadóerő(getTámadóerő()+lőtáv);
    }
    
    @Override
    public String toString() {
        return "Nyilas: TE:" + Nyilas.this.getTámadóerő() + ", VE:" + Nyilas.this.getVédőerő();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null || !(obj instanceof Nyilas)){
            return false;
        }
        
        Nyilas ny=(Nyilas)obj;
        return super.equals(ny) && this.lőtáv == ny.getLőtáv();
    }
    
    
}

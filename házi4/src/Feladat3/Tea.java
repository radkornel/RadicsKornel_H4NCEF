/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

/**
 *
 * @author Kornél
 */
public class Tea implements Rendezheto<Tea>{
    public String nev;
    public int ar;

    public Tea(String s, int j) {
        this.nev = s;
        this.ar = j;
    }

    @Override
    public boolean egyenlo(Tea o) {
        return this.ar==o.ar;
    }

    @Override
    public boolean nagyobbMint(Tea o) {
        return this.ar>o.ar;
    }

    @Override
    public boolean kisebbMint(Tea o) {
        return this.ar<o.ar;
    }
    
}

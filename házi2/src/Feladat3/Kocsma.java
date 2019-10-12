/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

import java.util.Arrays;

/**
 *
 * @author hallgato
 */
public class Kocsma extends VendéglátóIpariEgység{
    private String [] sörlap;

    public Kocsma(String[] sörlap, String név, int férőhelyekSzáma, boolean dohányzó) {
        super(név, férőhelyekSzáma, dohányzó);
        this.sörlap = sörlap;
    }

    public String[] getSörlap() {
        return sörlap;
    }

    @Override
    public String toString() {
        return super.toString() + Arrays.toString(sörlap);
    }
    
    
}

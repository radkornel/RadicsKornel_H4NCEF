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
public class Étterem extends VendéglátóIpariEgység{
    private String[] étlap;

    public Étterem(String[] étlap, String név, int férőhelyekSzáma, boolean dohányzó) {
        super(név, férőhelyekSzáma, dohányzó = false);
        this.étlap = étlap;
    }

    public String[] getÉtlap() {
        return étlap;
    }
    
    @Override
    public String toString() {
        return "\u00c9tterem{" + "\u00e9tlap=" + étlap + '}';
    }
    
    
}

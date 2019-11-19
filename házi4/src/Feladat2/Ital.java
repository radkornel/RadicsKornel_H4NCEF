/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

import java.util.Objects;

/**
 *
 * @author Kornél
 */
public class Ital implements Comparable<Ital>{
    
    protected String név;
    protected String kiszerelés;
    protected int ár;

    public Ital(String név, String kiszerelés, int ár) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.ár = ár;
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public int getÁr() {
        return ár;
    }

    @Override
    public String toString() {
        return név + ", " + kiszerelés + ", " + ár + "Ft";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.név);
        hash = 97 * hash + Objects.hashCode(this.kiszerelés);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Ital)){
            return false;
        }
        Ital i = (Ital) obj;
        return this.név.equals(i.getNév()) && this.kiszerelés.equals(i.getKiszerelés());
    }

    @Override
    public int compareTo(Ital o) {
        if(this.ár==o.getÁr()){
            return 0;
        } else if(this.ár>0){
            return 1;
        } else {
            return -1;
        }
    }
    
    
    
}

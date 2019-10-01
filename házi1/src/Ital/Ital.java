/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ital;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Kornél
 */
public class Ital {
        protected String név;
        protected String kiszerelés;
        private static int ár=10;
        protected Date gyártásiDátum;
        
    public Ital(String név, String kiszerelés) {
        this.név = név;
        this.kiszerelés = kiszerelés;
        this.gyártásiDátum=new Date();
    }

    public String getNév() {
        return név;
    }

    public String getKiszerelés() {
        return kiszerelés;
    }

    public static int getÁr() {
        return ár;
    }

    public Date getGyártásiDátum() {
        return gyártásiDátum;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKiszerelés(String kiszerelés) {
        this.kiszerelés = kiszerelés;
    }

    public static void setÁr(int ár) {
        Ital.ár = ár;
    }

    public void setGyártásiDátum(Date gyártásiDátum) {
        this.gyártásiDátum = gyártásiDátum;
    }
    
    public double getÁrEuróban(){
        return (double)this.ár/335;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ital other = (Ital) obj;
        if (!Objects.equals(this.név, other.név)) {
            return false;
        }
        if (!Objects.equals(this.kiszerelés, other.kiszerelés)) {
            return false;
        }
        if (!Objects.equals(this.ár, other.ár)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return név + ", " +  kiszerelés + ", " + ár + "Ft";
    }  
    
}

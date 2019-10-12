/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Budapest_kupa1;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Budapestkupa {
    String év;
    String hónap;
    String nap;
    String túra_neve;
    public int táv;

    public Budapestkupa(String év, String hónap, String nap, String túra_neve, int táv) {
        this.év = év;
        this.hónap = hónap;
        this.nap = nap;
        this.túra_neve = túra_neve;
        this.táv = táv;
    }

    public String getÉv() {
        return év;
    }

    public String getHónap() {
        return hónap;
    }

    public String getNap() {
        return nap;
    }

    public String getTúra_neve() {
        return túra_neve;
    }

    public int getTáv() {
        return táv;
    }

    public void setÉv(String év) {
        this.év = év;
    }

    public void setHónap(String hónap) {
        this.hónap = hónap;
    }

    public void setNap(String nap) {
        this.nap = nap;
    }

    public void setTúra_neve(String túra_neve) {
        this.túra_neve = túra_neve;
    }

    public void setTáv(int táv) {
        this.táv = táv;
    }
    
    @Override
    public String toString() {
        return év + ";" + hónap + ";" + nap + ";" + túra_neve;
    } 
}

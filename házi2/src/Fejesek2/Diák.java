/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fejesek2;

/**
 *
 * @author hallgato
 */
public class Diák {
    
    String nev;
    String előző;
    String sapka;

    public Diák(String nev, String előző, String sapka) {
        this.nev = nev;
        this.előző = előző;
        this.sapka = sapka;
    }

    public String getNev() {
        return nev;
    }

    public String getElőző() {
        return előző;
    }

    public String getSapka() {
        return sapka;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setElőző(String előző) {
        this.előző = előző;
    }

    public void setSapka(String sapka) {
        this.sapka = sapka;
    }

    @Override
    public String toString() {
        return "Di\u00e1k{" + "nev=" + nev + ", el\u0151z\u0151=" + előző + ", sapka=" + sapka + '}';
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kornél
 */
public class Lakóház implements Comparable<Lakóház>{
    double emeletMagasság;
    private String cím;
    private int emeletekSzáma;
    private double alapterület;

    public Lakóház(String cím, int emeletekSzáma, double alapterület) {
        this.emeletMagasság = 3.2;
        this.cím = cím;
        this.emeletekSzáma = emeletekSzáma;
        this.alapterület = alapterület;
    }

    public String getCím() {
        return cím;
    }

    public int getEmeletekSzáma() {
        return emeletekSzáma;
    }

    public double getAlapterület() {
        return alapterület;
    }
    
    public double légköbméter(){
        return this.alapterület*this.emeletMagasság*this.emeletekSzáma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cím:").append(this.cím).append(", emeletek száma:").append(this.emeletekSzáma).append(", terület:").
                append(this.alapterület).append(", légköbméter:").append(this.légköbméter());
        
        return sb.toString();
    }

    @Override
    public int compareTo(Lakóház o) {
        return Double.compare(this.légköbméter(), o.légköbméter());
    }
    
    public static void main(String[] args) {
        List<Lakóház> l= new ArrayList();
        l.add(new Lakóház("A1", 3, 40.4));
        l.add(new Lakóház("B2", 5, 38.3));
        l.add(new Lakóház("C3", 2, 32.6));
        l.add(new Lakóház("D4", 4, 47.7));
        l.add(new Lakóház("E5", 6, 46.8));
        l.add(new Lakóház("F6", 9, 45.2));
        l.add(new Lakóház("G7", 4, 33.1));
        l.add(new Lakóház("A2", 5, 34.3));
        l.add(new Lakóház("B3", 3, 41.4));
        l.add(new Lakóház("C4", 7, 50.5));
        
        List<Lakóház> ujlak = tágasLakóházak(l, 40.5);
        
        Collections.sort(ujlak);
        
        for(Lakóház i:ujlak){
            System.out.println(i);
        }
    }
    
    public static List<Lakóház> tágasLakóházak(List<Lakóház> lista, double térfogat){
        List<Lakóház> lak = new ArrayList();
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).getAlapterület()>térfogat){
                lak.add(lista.get(i));
            }
        }
        
        return lak;
    }        
}

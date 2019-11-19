/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Kornél
 */
public class Autó implements Comparable<Autó>{
    private String rendszám;
    private int teljesítmény;
    private boolean automata;
    private static int példányszám;
    List<Autóextrák> extra = new ArrayList();

    public Autó(String rendszám, int teljesítmény, boolean automata) {
        this.rendszám = rendszám;
        this.teljesítmény = teljesítmény;
        this.automata = automata;
    }

    public String getRendszám() {
        return rendszám;
    }

    public int getTeljesítmény() {
        return teljesítmény;
    }

    public boolean isAutomata() {
        return automata;
    }

    @Override
    public String toString() {
        return "Aut\u00f3{" + "rendsz\u00e1m=" + rendszám + ", teljes\u00edtm\u00e9ny=" + teljesítmény + ", automata=" + automata + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.rendszám);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Autó)) {
            return false;
        }
        
        Autó a = (Autó) obj;
        return this.rendszám.equals(a.rendszám);
    }

    @Override
    public int compareTo(Autó a) {
        return (-1)*Integer.compare(this.teljesítmény, a.teljesítmény);
    }
    
    public boolean okrendszám(String rendszám){
        char[] c = rendszám.toCharArray();
        if(rendszám.length()!=6){
            return false;
        } else {
            if(Character.isAlphabetic(c[0]) && Character.isAlphabetic(c[1]) && Character.isAlphabetic(c[2]) &&
               Character.isDigit(c[3]) && Character.isDigit(c[4]) && Character.isDigit(c[5])){
                return true;
            } else {
                return false;
            }
        }
    }
    
    public void addExtra(Autóextrák a){
        extra.add(a);
    }
    
    public void remExtra(Autóextrák a){
        extra.remove(a);
    }
    
    public Autó(){
        this.példányszám++;
    }
    
    public static int példányokSzáma(){
        return példányszám;
    }
}

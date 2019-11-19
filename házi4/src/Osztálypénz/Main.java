/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Osztálypénz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Main implements Comparable<Main>{
    private String név;
    private int pénz;

    public Main(String név, int pénz) {
        this.név = név;
        this.pénz = pénz;
    }

    public String getNév() {
        return név;
    }

    public int getPénz() {
        return pénz;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setPénz(int pénz) {
        this.pénz = pénz;
    }

    @Override
    public int compareTo(Main m) {
        if(this.pénz==m.pénz){
            return this.név.compareTo(m.getNév());
        } else {
            return (-1)*Integer.compare(this.pénz, m.getPénz());
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.név);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Main)) {
            return false;
        }
        
        Main m = (Main) obj;
        return this.név.equals(m.getNév());
    }

    @Override
    public String toString() {
        return this.név + ";" + this.pénz;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Main> m = new ArrayList();
        
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(";");
            Main tmp = new Main(s[0], Integer.parseInt(s[1]));
            
            if(m.contains(tmp)){
                int i=m.indexOf(tmp);
                
                m.get(i).setPénz(m.get(i).getPénz()+Integer.parseInt(s[1]));
            } else {
                m.add(tmp);
            }
        }
        Collections.sort(m);
        
        for(Main i:m){
            System.out.println(i);
        }
    }
}

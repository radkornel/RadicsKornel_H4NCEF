/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Zárthelyi_eredmények;

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
    private int pont;

    public Main(String név, int pont) {
        this.név = név;
        this.pont = pont;
    }
    
    public String getNév() {
        return név;
    }

    public int getPont() {
        return pont;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.név);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null || !(obj instanceof Main)) {
            return false;
        }
        
        Main e = (Main) obj;
        return this.név.equals(e.getNév());
    }

    @Override
    public int compareTo(Main e) {
        if(this.pont==e.getPont()){
            return this.név.compareTo(e.getNév());
        } else {
            return (-1)*Integer.compare(this.pont, e.getPont());
        }
    }

    @Override
    public String toString() {
        return this.név + ": " + this.pont + " pont";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Main> e = new ArrayList();
        
        while(sc.hasNextLine()){
            String[] sor = sc.nextLine().split(";");
            Main tmp = new Main(sor[0], Integer.parseInt(sor[1]));
            
            if(e.contains(tmp)){
                int idx=e.indexOf(tmp);
                e.get(idx).setPont(e.get(idx).getPont()+Integer.parseInt(sor[1]));
            } else {
                e.add(tmp);
            }
        }
        Collections.sort(e);
        
        for(Main i:e){
            System.out.println(i);
        }
    }
}

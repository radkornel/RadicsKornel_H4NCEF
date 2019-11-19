/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Karácsonyi_hozzávalók;

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
    private int mennyiség;

    public Main(String név, int mennyiség) {
        this.név = név;
        this.mennyiség = mennyiség;
    }

    public String getNév() {
        return név;
    }

    public int getMennyiség() {
        return mennyiség;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setMennyiség(int mennyiség) {
        this.mennyiség = mennyiség;
    }

    @Override
    public int compareTo(Main h) {
        if(this.mennyiség==h.mennyiség){
            return this.név.compareTo(h.getNév());
        } else {
            return (-1)*Integer.compare(this.mennyiség, h.mennyiség);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.név);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Main)) {
            return false;
        }
        
        Main h = (Main) obj;
        return this.név.equals(h.getNév());
    }

    @Override
    public String toString() {
        return this.név + ";" + this.mennyiség;
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Main> h = new ArrayList();
        
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(";");
            Main tmp = new Main(s[0], Integer.parseInt(s[1]));
            if(h.contains(tmp)){
                int i=h.indexOf(tmp);
                
                h.get(i).setMennyiség(h.get(i).getMennyiség()+Integer.parseInt(s[1]));
            } else {
                h.add(tmp);
            }
        }
        Collections.sort(h);
        
        for(Main i:h){
            System.out.println(i);
        }
    }
}

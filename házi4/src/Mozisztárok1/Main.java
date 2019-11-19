/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Mozisztárok1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */

class szereplok implements Comparable<szereplok>{
    public String név;
    List<film> film = new ArrayList();

    public szereplok(String név) {
        this.név = név;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(név).append("\n");
        for(int i=0; i<film.size(); i++){
            sb.append(film.get(i)).append("\n");
        }
        
        return sb.toString();
    }

    @Override
    public int compareTo(szereplok sz) {
        if(this.film.size()==sz.film.size()){
            return this.név.compareTo(sz.név);
        } else {
            return (-1)*Integer.compare(this.film.size(),sz.film.size());
        }
    }
    
    
}

class film implements Comparable<film>{
    public int év;
    public String cím;

    public film(int év, String cím) {
        this.év = év;
        this.cím = cím;
    }

    @Override
    public String toString() {
        return év + ": " + cím;
    }

    @Override
    public int compareTo(film f) {
        if(this.év==f.év){
            return this.cím.compareTo(f.cím);
        } else {
            return Integer.compare(this.év, f.év);
        }
    }

    
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<szereplok> lista = new ArrayList();
        
        String sor;
        String[] token;
        
        while(sc.hasNext()){
            sor=sc.nextLine();
            
            token=sor.split("[();:]");
            
            token[0]=token[0].trim();
            String[] nevek = token[3].split(",");
            for(int i=0; i<nevek.length; i++){
                int van=0;
                for(int j=0; j<lista.size(); j++){
                    if(lista.get(j).név.compareTo(nevek[i])==0){
                        lista.get(j).film.add(new film(Integer.parseInt(token[1]), token[0]));
                        van=1;
                        break;
                    }
                }
                if(van==0){
                    lista.add(new szereplok(nevek[i]));
                    lista.get(lista.size()-1).film.add(new film(Integer.parseInt(token[1]), token[0]));
                }
            }
        }
        for(int i=0; i<lista.size(); i++){
            Collections.sort(lista.get(i).film);
        }
        
        Collections.sort(lista);
        
        for(szereplok i:lista){
            System.out.print(i);
        }
    }
}

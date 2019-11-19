//package Mozisztárok2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */

class film implements Comparable<film>{
    public String cím;
    List<szereplok> szereplok = new ArrayList();

    public film(String cím) {
        this.cím = cím;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cím).append("\n");
        for(int i=0; i<szereplok.size(); i++){
            sb.append(szereplok.get(i)).append("\n");
        }
        
        return sb.toString();
    }

    @Override
    public int compareTo(film f) {
        if(this.szereplok.size()==f.szereplok.size()){
            return this.cím.compareTo(f.cím);
        } else {
            return (-1)*Integer.compare(this.szereplok.size(), f.szereplok.size());
        }
    }
    
    
}

class szereplok implements Comparable<szereplok>{
    public int év;
    public String név;

    public szereplok(int év, String név) {
        this.év = év;
        this.név = név;
    }

    @Override
    public int compareTo(szereplok sz) {
        if(this.év==sz.év){
            return this.név.compareTo(sz.név);
        } else {
            return Integer.compare(this.év, sz.év);
        }
    }

    @Override
    public String toString() {
        return év + ": " + név;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<film> lista = new ArrayList();
        String[] token;
        String sor;
        
        while(sc.hasNext()){
            sor=sc.nextLine();
            token=sor.split("[;():]");
            
            token[0]=token[0].trim();
            for(int i=3; i<token.length; i++){
                int van=0;
                for(int j=0; j<lista.size(); j++){
                    if(lista.get(j).cím.compareTo(token[i])==0){
                        lista.get(j).szereplok.add(new szereplok(Integer.parseInt(token[1]), token[0]));
                        van=1;
                        break;
                    }
                }
                if(van==0){
                    lista.add(new film(token[i]));
                    lista.get(lista.size()-1).szereplok.add(new szereplok(Integer.parseInt(token[1]), token[0]));
                    
                }
            }
        }
        
        for(int i=0; i<lista.size(); i++){
            Collections.sort(lista.get(i).szereplok);
        }
        
        Collections.sort(lista);
        
        for(film i : lista){
            System.out.print(i);
        }
    }
}

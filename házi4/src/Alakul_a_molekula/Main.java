/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Alakul_a_molekula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author Kornél
 */

class elemek implements Comparable<elemek>{
    public String név;
    public List<egydarab> lista = new ArrayList();

    public elemek(String név) {
        this.név = név;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(név).append(":").append("\n");
        for(int i=0; i<lista.size(); i++){
            sb.append(lista.get(i)).append("\n");
        }
        
        return sb.toString();
    }

    @Override
    public int compareTo(elemek e) {
        return this.név.compareTo(e.név);
    }
    
    
}

class egydarab implements Comparable<egydarab>{
    public int mennyiség;
    public String név;

    public egydarab(int mennyiség, String név) {
        this.mennyiség = mennyiség;
        this.név = név;
    }

    @Override
    public String toString() {
        return mennyiség + " " + név;
    }

    @Override
    public int compareTo(egydarab e) {
        if(this.mennyiség==e.mennyiség){
            return this.név.compareTo(e.név);
        } else {
            return (-1)*Integer.compare(this.mennyiség, e.mennyiség);
        }
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<elemek> főlista = new ArrayList();
        Map<String, String> map = new TreeMap<String, String>();

        String sor;
        String[] token;
        
        while(sc.hasNext()){
            sor=sc.nextLine();
            if(sor.equals("-")){
                break;
            }
            token=sor.split(":");
            if(map.containsKey(token[0])){
                
            } else {
                map.put(token[0], token[1]);
            }
        }
        
        while(sc.hasNext()){
            List <egydarab> melléklista = new ArrayList();
            
            sor=sc.nextLine();
            
            token=sor.split("[:,]");
            
            String név = token[0];
            for(int i=1; i<token.length; i++){
                int van=0;
                for(int j=0; j<melléklista.size(); j++){
                    if(melléklista.get(j).név.equals(map.get(token[i]))){
                        melléklista.get(j).mennyiség++;
                        van=1;
                        break;
                    }
                }
                if(van==0){
                    melléklista.add(new egydarab(1, map.get(token[i])));
                }
            }
            Collections.sort(melléklista);
            főlista.add(new elemek(név));
            
            for(int i=0; i<melléklista.size(); i++){
                főlista.get(főlista.size()-1).lista.add(melléklista.get(i));
            }
            
        }
        Collections.sort(főlista);
        for(elemek i:főlista){
            System.out.print(i);
        }
    }
}

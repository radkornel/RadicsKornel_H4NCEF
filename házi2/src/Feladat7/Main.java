/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat7;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Main{
    
    public static boolean oratHozzaad(Ora[] óra, int jelen){
        boolean nincs=true;
        if(jelen>=12){
            return false;
        } else {
            for(int i=0; i<jelen; i++){
                if(óra[i].getKezdet()==óra[jelen].getKezdet()){
                    nincs=false;
                    break;
                }
            }
        }
        return nincs;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nap=sc.nextLine();
        int db = Integer.parseInt(sc.nextLine());
        Ora[] hármas = new Ora[db];
        Orarend r = new Orarend(nap);
        int jelen=0, újdb=0;
        for(int i=0; i<db; i++){
            int kód=sc.nextInt();
            String név=sc.next();
            int kezdet=sc.nextInt();
            hármas[i]=new Ora(kód, név, kezdet);
            System.out.println(oratHozzaad(hármas, jelen));
            if(oratHozzaad(hármas, jelen)){
                r.getObjektumok()[újdb]=hármas[i];
                újdb++;
            }
            jelen++;
        }
        for(int i=0; i<újdb; i++){
            System.out.println(r.getObjektumok()[i]);
        }
    }
}

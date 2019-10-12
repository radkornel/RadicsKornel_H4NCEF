/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Izzasztó_feladat;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Test {
    
    public static void rendez(Izzaszto_Feladat[] s){
        for(int i=0; i<s.length; i++){
            for(int j=i+1; j<s.length; j++){
                if(s[i].getHő() == s[j].getHő()){
                    if(s[i].getVáros().compareTo(s[j].getVáros())>0){
                        Izzaszto_Feladat tmp = s[i];
                        s[i]=s[j];
                        s[j]=tmp;
                    }
                } else if(s[i].getHő() < s[j].getHő()){
                    Izzaszto_Feladat tmp = s[i];
                    s[i]=s[j];
                    s[j]=tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sor = sc.nextLine();
        String[] tmp = sor.split(" ");
        int n=Integer.parseInt(tmp[0]);
        String keresett = tmp[1];
        Izzaszto_Feladat[] s = new Izzaszto_Feladat[n]; 
        
        
        for(int i=0; i<n; i++){
            sor = sc.nextLine();
            tmp = sor.split(":");
            s[i] = new Izzaszto_Feladat(tmp[0], Integer.parseInt(tmp[1]));
        }
        
        int talalt=0, célhő=0;
        for(int i=0; i<n; i++){
            if(s[i].getVáros().equals(keresett)){
                talalt=1;
                célhő=s[i].getHő();
            }
        }
        
        if(talalt==0){
            System.out.println("Missing data");
        } else {
            rendez(s);
            for(int i=0; i<n; i++){
                if(s[i].getHő()>célhő){
                    System.out.println(s[i]);
                }
            }
        }
    }
            
}

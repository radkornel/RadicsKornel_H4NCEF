/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Angolmagyar;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Test {
    
    public static void rendez(Angolmagyar[] sz){
        for(int i=0; i<sz.length; i++){
            for(int j=i+1; j<sz.length; j++){
                if(sz[i].getAngol().equals(sz[j].getAngol())){
                    if(sz[i].getMagyar().compareTo(sz[j].getMagyar())>0){
                        Angolmagyar tmp=sz[i];
                        sz[i]=sz[j];
                        sz[j]=tmp;
                    }
                } else if(sz[i].getAngol().compareTo(sz[j].getAngol())>0){
                    Angolmagyar tmp=sz[i];
                    sz[i]=sz[j];
                    sz[j]=tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Angolmagyar[] sz = new Angolmagyar[n];

        for(int i=0; i<n; i++){
            String sor=sc.nextLine();
            String[] tmp = sor.split(":");
            sz[i]=new Angolmagyar(tmp[0], tmp[1]);
        }
        rendez(sz);
        for(int i=0; i<n; i++){
            System.out.println(sz[i]);
        }
    }
}

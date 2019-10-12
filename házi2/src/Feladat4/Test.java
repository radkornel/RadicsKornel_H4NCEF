/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat4;

import java.util.Arrays;

/**
 *
 * @author Kornél
 */
public class Test {
    
    public static Autó[] keresMaxMotorTeljesítmény(Autó[] auto){
        int max=0;
        int k=0;
        for(int i=0; i<auto.length; i++){
            if(max<auto[i].getMotorTeljesítmény()){
                max=auto[i].getMotorTeljesítmény();
            }
        }
        for(int i=0; i<auto.length; i++){
            if(max==auto[i].getMotorTeljesítmény()){
                k++;
            }
        }
        Autó[] kocsi = new Autó[k];
        k=0;
        for(int i=0; i<auto.length; i++){
            if(auto[i].getMotorTeljesítmény()==max){
                kocsi[k]=auto[i];
                k++;
            }
        }
        return kocsi;
    }
    
    public static void rendezMaxSzállíthatóTeherCsökkenőleg(Teherautó[] teher){
        for(int i=0; i<teher.length; i++){
            for(int j=i+1; j<teher.length; j++){
                if(teher[i].getMaxSzállíthatóTeher()<teher[j].getMaxSzállíthatóTeher()){
                    Teherautó tmp=teher[i];
                    teher[i]=teher[j];
                    teher[j]=tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Autó[] a = new Autó[10];
        a[0] = new Autó("ABC123", 10);
        a[1] = new Autó("BBC123", 11);
        a[2] = new Autó("CBC123", 5);
        a[3] = new Autó("DBC123", 7);
        a[4] = new Autó("FBC123", 13);
        a[5] = new Teherautó(4, "ZAC123", 10);
        a[6] = new Teherautó(6, "ZBC123", 14);
        a[7] = new Teherautó(5, "ZCC123", 12);
        a[8] = new Teherautó(8, "ZDC123", 11);
        a[9] = new Teherautó(7, "ZEC123", 13);
        
        Teherautó[] ta = new Teherautó[10];
        ta[0] = new Teherautó(9, "ZAF123", 10);
        ta[1] = new Teherautó(7, "ZAE123", 11);
        ta[2] = new Teherautó(8, "ZAD123", 9);
        ta[3] = new Teherautó(3, "ZAB123", 7);
        ta[4] = new Teherautó(6, "ZAA123", 8);
        ta[5] = new Teherautó(4, "ZAC123", 10);
        ta[6] = new Teherautó(6, "ZBC123", 14);
        ta[7] = new Teherautó(5, "ZCC123", 12);
        ta[8] = new Teherautó(8, "ZDC123", 11);
        ta[9] = new Teherautó(7, "ZEC123", 13);
        
        rendezMaxSzállíthatóTeherCsökkenőleg(ta);
        System.out.println("Max szállítható teher csökkenőben:");
        for(int i=0; i<ta.length; i++){
            System.out.println(ta[i]);
        }
        
        Autó k[] = keresMaxMotorTeljesítmény(a);
        
        System.out.println("Max motorteljesítmény:");
        System.out.println(Arrays.toString(k));
    }
    
}

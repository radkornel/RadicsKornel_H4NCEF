/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hullámvasutak;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Test {
    
    private static void rendez(Hullámvasutak[] hv){
        for(int i=0; i<hv.length; i++){
            for(int j=i+1; j<hv.length; j++){
                if(hv[i].getVár_idő()==hv[j].getVár_idő()){
                    if(hv[i].getMagasság()==hv[j].getMagasság()){
                        if(hv[i].getHv_név().compareTo(hv[j].getHv_név())>0){
                            Hullámvasutak tmp = hv[i];
                            hv[i]=hv[j];
                            hv[j]=tmp;
                        }
                    } else if(hv[i].getMagasság()<hv[j].getMagasság()){
                        Hullámvasutak tmp = hv[i];
                        hv[i]=hv[j];
                        hv[j]=tmp;
                    }
                } else if(hv[i].getVár_idő()>hv[j].getVár_idő()){
                    Hullámvasutak tmp = hv[i];
                    hv[i]=hv[j];
                    hv[j]=tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String sor;
        Hullámvasutak[] hv = new Hullámvasutak[n];
        
        for(int i=0; i<n; i++){
            sor=sc.nextLine();
            String[] tmp = sor.split(";");
            hv[i]=new Hullámvasutak(tmp[0], tmp[1], Integer.parseInt(tmp[2]), Integer.parseInt(tmp[3]));
        }
        
        rendez(hv);
        for(int i=0; i<n; i++){
            System.out.println(hv[i]);
        }
    }
}

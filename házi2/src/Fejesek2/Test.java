/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fejesek2;

import java.util.Scanner;

/**
 *
 * @author hallgato
 */
public class Test {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String[] tmp=sc.nextLine().split(";");
        
        Diák[] d=new Diák[Integer.parseInt(tmp[0])];
        
        d[0]=new Diák(tmp[1], "", "piros");
        String kit=tmp[2];
        
        for(int i=1; i<d.length; i++){
            tmp=sc.nextLine().split(";");
            d[i]=new Diák(tmp[0], tmp[1], "");
        }
        
        for(int i=1; i<d.length; i++){
            int k=i;
            while(k<d.length){
                if(d[k].getElőző().equals(d[i-1].getNev())){
                    if(d[i-1].getSapka().equals("piros")){
                        d[k].setSapka("kék");
                    } else {
                        d[k].setSapka("piros");
                    }
                    
                    Diák tmp2=d[i];
                    d[i]=d[k];
                    d[k]=tmp2;
                    break;
                }
                k++;
            }
        }
        int piros=0;
        int kék=0;
        
        for(int i=0; i<d.length; i++){
            if(d[i].getNev().equals(kit)){
                System.out.println(piros + " " + kék);
            }
            if(i%2==0){
               piros++; 
            } else {
                kék++;
            }
            
        }
    }
}

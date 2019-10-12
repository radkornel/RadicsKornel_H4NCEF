/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fejesek2;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Fejesek2 {
    public static void main(String[] args) {
        int n, hely = 0, piros=0, kek=0, talalt;
        Scanner sc = new Scanner(System.in);
        
        String sor=sc.nextLine();
        String[] s=sor.split(";");
        
        n=Integer.parseInt(s[0]);
        String[] nevek = new String[n];
        nevek[0]=s[1];
        String x=s[2];
        for(int i=0; i<n-1; i++){
            talalt=0;
            sor=sc.nextLine();
            s=sor.split(";");
            for(int j=0; j<nevek.length; j++){
                if(nevek[j].equals(s[1])){
                    talalt=j;
                    for(int k=nevek.length-1; k>j; k--){
                        nevek[k+1]=nevek[k];
                    }
                }
            }
            if(talalt!=0){
                nevek[talalt]=s[0];
            } else {
                nevek[i+1]=s[0];
            }
        }
        
        for(int i=0; i<nevek.length; i++){
            if(nevek[i].equals(x)){
                hely=i;
            }
        }
        for(int i=0; i<hely; i++){
            if(i==0){
                piros++;
            } else if(i==1){
                kek++;
            } else if(i%2==0){
                piros++;
            } else if(i%2!=0){
                kek++;
            }
        }
        System.out.println(piros + "" + kek);
    }
}

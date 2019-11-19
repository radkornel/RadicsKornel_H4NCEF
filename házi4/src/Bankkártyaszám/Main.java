/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Bankkártyaszám;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            char[] sor = sc.nextLine().toCharArray();
            char[] eredmeny = new char[16];
            
            for(int i=0; i<sor.length; i++){
                int szamjegy=Character.getNumericValue(sor[i]);
                if(i==0 || i%2==0){
                    szamjegy*=2;
                }
                if(szamjegy>9){
                    int szam=szamjegy%10+szamjegy/10;
                    eredmeny[i]=(char)(szam+'0');
                } else {
                    eredmeny[i]=(char)(szamjegy+'0');
                }
            }
            int összeg=0;
            
            for(int i=0; i<eredmeny.length; i++){
                összeg+=Character.getNumericValue(eredmeny[i]);
            }
            if(összeg%10==0){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

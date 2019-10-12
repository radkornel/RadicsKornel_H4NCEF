/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat8;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class KoPapirOllo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String sajat="", gep="";
        
        while(true){
            if(sajat.equals("vege")){
                break;
            }
            while(!((sajat.equals("ko")) || (sajat.equals("papir")) || (sajat.equals("ollo")))){
                sajat=sc.nextLine();
            }
            switch(rand.nextInt(3)){
                case 0:
                    gep="ko";
                    break;
                case 1:
                    gep="papir";
                    break;
                case 2:
                    gep="ollo";
                    break;
            }
            
            System.out.println("Jatékos vs Gép:" + sajat + " vs " + gep);
            if((sajat.equals("ko") && gep.equals("ollo")) || (sajat.equals("papir") && gep.equals("ko")) || (sajat.equals("ollo") && gep.equals("papir"))){
                System.out.println("A játékos nyert!");
            } else if(sajat.equals(gep)){
                System.out.println("Döntetlen!");
            } else {
                System.out.println("A gép nyert!");
            }
            sajat=sc.nextLine();
        }
    }
}

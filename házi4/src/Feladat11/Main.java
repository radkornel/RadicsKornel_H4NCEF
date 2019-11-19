/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat11;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Main {
    
    private static double átlagéletkor(Személy[] sz){
        int összeg=0, db=0;
        for(int i=0; i<sz.length; i++){
            if(sz[i] instanceof Hallgató){
                Hallgató h = (Hallgató) sz[i];
                if(h.jokepessegu(4.0)){
                    összeg+=h.getÉletkor();
                    db++;
                }
            }
        }
        return (double)összeg/(double)db;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Személy sz = new Személy("Mona Liza", 20, false);
        
        System.out.println(sz);
        
        Személy[] sztomb = new Személy[4];
        for(int i=0; i<2; i++){
            String[] sor = sc.nextLine().split(" ");
            sztomb[i]=new Hallgató(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), Double.parseDouble(sor[3]));
        }
        for(int i=0; i<2; i++){
            String[] sor = sc.nextLine().split(" ");
            sztomb[i+2] = new Oktató(sor[0], Integer.parseInt(sor[1]), Boolean.parseBoolean(sor[2]), sor[3]);
        }
        
        for(int i=0; i<4; i++){
            System.out.println(sztomb[i]);
        }
        
        Személy[] ktomb = new Személy[5];
        ktomb[0] = new Hallgató("A", 20, true, 4.2);
        ktomb[1] = new Hallgató("B", 19, true, 3.2);
        ktomb[2] = new Hallgató("C", 24, true, 4.1);
        ktomb[3] = new Hallgató("D", 26, true, 4.8);
        ktomb[4] = new Hallgató("E", 21, true, 5.0);
        
        System.out.println(átlagéletkor(ktomb));
    }
}

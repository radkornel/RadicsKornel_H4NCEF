/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh_Feladat6;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hallgato[] h = new Hallgato[n];
        for(int i=0; i<n; i++){
            h[i] = new Hallgato(sc.nextInt(), sc.nextBoolean());
        }
        for(int i=0; i<n; i++){
            boolean megfelelt=true;
            for(int j=0; j<2; j++){
                if(h[i].dolgozatotIr().megfelelt()==false){
                    megfelelt=false;
                }
            }
            if(megfelelt){ 
//kb. mindig "nem felelt meg"-et fog adni, mert 35 ponttol felel meg, és ahhoz 2db random 7est kell generalnia, illetve 5-ot kell adnunk, hogy 35 legyen(ez a legjobb eshetoseg)
                System.out.println("megfelelt");
            } else {
                System.out.println("nem felelt meg");
            }
        }
    }
}

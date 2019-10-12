/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Katonák;

/**
 *
 * @author Kornél
 */
public class Teszt {
    public static Katona megkuzd(Katona k1, Katona k2){
        if((k1.getTámadóerő()-k2.getVédőerő()) > (k2.getTámadóerő()-k1.getVédőerő())){
            return k1;
        } else if((k1.getTámadóerő()-k2.getVédőerő()) == (k2.getTámadóerő()-k1.getVédőerő())){
            return k1;
        } else {
            return k2;
        }
    }
    
    public static void main(String[] args) {
        Nyilas k1 = new Nyilas(5, 13, 4);
        Nyilas k2 = new Nyilas(5, 14, 3);
        Landzsas k3 = new Landzsas(12, 10);
        
        if(megkuzd(k1, k2).equals(k1)){
            System.out.println("A győztes:\n" + megkuzd(k1,k3));
        } else {
            System.out.println("A győztes:\n" + megkuzd(k2, k3));
        }
    }
}

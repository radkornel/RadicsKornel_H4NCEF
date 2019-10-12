/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat3;

import java.util.Arrays;

/**
 *
 * @author hallgato
 */
public class Main {
    
    private static Kocsma[] adottItaltKínálóKocsmák(String ital, VendéglátóIpariEgység[] t){
        int k=0;
        for(int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma){
                Kocsma p=(Kocsma)t[i];
                
                for(int j=0; j<p.getSörlap().length; j++){
                    if(p.getSörlap()[j].equals(ital)){
                        k++;
                        break;
                    }
                }
            }
        }
        Kocsma[] kocsma= new Kocsma[k];
        k=0;
        for(int i=0; i<t.length; i++){
            if(t[i] instanceof Kocsma){
                Kocsma p=(Kocsma)t[i];
                
                for(int j=0; j<p.getSörlap().length; j++){
                    if(p.getSörlap()[j].equals(ital)){
                        kocsma[k]=p;
                        k++;
                    }
                }
            }
        }
        
        return kocsma;
    }
    
    public static void main(String[] args) {
        VendéglátóIpariEgység [] v=new VendéglátóIpariEgység[]{
            new Kocsma(new String[]{"Dhreher", "Soproni", "Borsodi"}, "Sarki1", 45, true),
            new Kocsma(new String[]{"Heineken", "Dreher", "Soproni"}, "Sarki3", 53, true),
            new Kocsma(new String[]{"Corona", "Heineken", "Dreher"}, "Sarki43", 34, true),
            new Kocsma(new String[]{"Kozel", "Corona", "Heineken"}, "Sarki21", 77, true),
            new Kocsma(new String[]{"Borsodi", "Kozel", "Corona"}, "Sarki30", 56, true),
            new Étterem(new String[]{"Húsleves", "Milánói", "Palacsinta"}, "Falatozó1", 82 ,false),
            new Étterem(new String[]{"Bableves", "Zúzapörkölt", "Kalács"}, "Falatozó4", 91 ,false),
            new Étterem(new String[]{"Borsóleves", "Tészta", "Tiramisu"}, "Falatozó21", 68 ,false),
            new Étterem(new String[]{"Tojásleves", "Sertésszelet", "Kókuszkocka"}, "Falatozó32", 73 ,false),
            new Étterem(new String[]{"Zöldségleves", "Brassói", "Citrompite"}, "Falatozó41", 79 ,false),
            new Étterem(new String[]{"Krumplileves", "Csirkemell", "Krémes"}, "Falatozó33", 110 ,false)
        };
        
        Kocsma[] k=adottItaltKínálóKocsmák("Heineken", v);
        
        System.out.println(Arrays.toString(k));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat2;

/**
 *
 * @author Kornél
 */
public class Dolgozat {
    private static SzeszesItal[] haromlegnagyobbItal(Ital[] it){
        int count=0;
        for(int i=0; i<it.length; i++){
            if(it[i] instanceof SzeszesItal){
                count++;
            }
        }
        if(count<3){
            return null;
        }
        SzeszesItal[] ujtomb = new SzeszesItal[count];
        count=0;
        for(int i=0; i<it.length; i++){
            if(it[i] instanceof SzeszesItal){
                ujtomb[count]=(SzeszesItal) it[i];
                count++;
            }
        }
        for(int i=0; i<count; i++){
            for(int j=i+1; j<count; j++){
                if(ujtomb[i].getAlkoholTartalom()<ujtomb[j].getAlkoholTartalom()){
                    SzeszesItal tmp = ujtomb[i];
                    ujtomb[i]=ujtomb[j];
                    ujtomb[j]=tmp;
                }
            }
        }
        
        return ujtomb;
    }
    
    public static void rendez(Ital[] italok){
        for(int i=0; i<italok.length; i++){
            for(int j=i+1; j<italok.length; j++){
                if(italok[i].getÁr()>italok[j].getÁr()){
                    Ital tmp=italok[i];
                    italok[i]=italok[j];
                    italok[j]=tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Ital[] italok = new Ital[10];
        italok[0]=new Ital("Pepsi", "0.75 l", 300);
        italok[1]=new Ital("Coca-Cola", "0.5 l", 250);
        italok[2]=new Ital("Fanta", "0.5 l", 240);
        italok[3]=new Ital("Limonádé", "0.5 l", 210);
        italok[4]=new Ital("Kinley", "0.75 l", 290);
        italok[5]=new SzeszesItal(3.8, "Heineken", "1 l", 450);
        italok[6]=new SzeszesItal(4.5, "Somersby", "0.3 l", 300);
        italok[7]=new SzeszesItal(4, "Kopparberg", "0.5 l", 800);
        italok[8]=new SzeszesItal(3.5, "Soproni", "0.5 l", 400);
        italok[9]=new SzeszesItal(11, "Rosé", "0.75 l", 1800);
        
        System.out.println("Három legnagyobb szeszesital:");
        SzeszesItal[] szitalok = haromlegnagyobbItal(italok);
        for(int i=0; i<3; i++){
            System.out.println(szitalok[i]);
        }
        System.out.println();;
        System.out.println("Rendezett ital tömb:");
        rendez(italok); //ár szerint növekvő
        for(int i=0; i<italok.length; i++){
            System.out.println(italok[i]);
        }
    }
}

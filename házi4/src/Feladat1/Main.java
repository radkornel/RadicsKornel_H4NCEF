/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Kornél
 */
public class Main {
    
    private static Aszu[] otputtyonos(Bor[] b){
        int count=0;
        for(int i=0; i<b.length; i++){
            if(b[i] instanceof Aszu){
             Aszu a = (Aszu) b[i];   
                if(a.hanyPuttonyos()==5){
                    count++;
                }
            }
        }
        Aszu[] at=new Aszu[count];
        count=0;
        for(int i=0; i<b.length; i++){
            if(b[i] instanceof Aszu){
             Aszu a = (Aszu) b[i];   
                if(a.hanyPuttonyos()==5){
                    at[count]=a;
                    count++;
                }
            }
        }
        return at;
    }
    
    public static void main(String[] args) {
        Bor[] b = new Bor[5];
        b[0]= new Bor("Laska", "Eger", "Száraz", 7.9);
        b[1]= new Aszu(5, "Hamvas", "Tokaj", "Édes", 7.2);
        b[2]= new Bor("Pintes", "Pécs", "Félédes", 7.3);
        b[3]= new Aszu(5, "Korona", "Mátra", "Édes", 8);
        b[4]= new Bor("Kármin", "Bükk", "Száraz", 7.5);
        
        Aszu[] aszusok = otputtyonos(b);
        
        for(int i=0; i<aszusok.length; i++){
            System.out.println(aszusok[i]);
        }
    }
            
}

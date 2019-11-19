/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zh_Feladat6;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author Kornél
 */
public class Hallgato {
    int mennyitKeszult;
    boolean sokatTanult;

    public Hallgato(int mennyitKeszult, boolean sokatTanult) {
        this.mennyitKeszult = mennyitKeszult;
        this.sokatTanult = sokatTanult;
    }
    
    Dolgozat dolgozatotIr(){
        int pont;
        Random rand=new Random();
        double r = rand.nextDouble();
        if(this.sokatTanult){
            int i=(int)(Math.random()*4+4);
            System.out.print(i + " ");
            pont=i*this.mennyitKeszult;
        } else if(r<0.02){ 
            pont=-1;
        }else {
            int i=(int)(Math.random()*6);
            System.out.print(i + " ");
            pont=i*this.mennyitKeszult;
        }
        
        Dolgozat d=new Dolgozat(pont);
        System.out.println(d);
        return d;
    }
}

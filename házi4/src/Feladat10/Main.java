/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Main {
    
    private static List<Teherautó> tonna20(Autó[] a){
        List<Teherautó> tl = new ArrayList();
        for(int i=0; i<a.length; i++){
            if(a[i] instanceof Teherautó){
                Teherautó teher = (Teherautó) a[i];
                if(teher.getTeherbírás()>20000){
                    tl.add(teher);
                }
            }
        }
        return tl;
    }
    
    private static void kiirHarom(List<Autó> a){
        Collections.sort(a);
        if(a.size()>=3){
            for(int i=0; i<3; i++){
                System.out.println(a.get(i));
            }
        } else {
            for(Autó i:a){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autó auto = new Autó(sc.next(), 100, true);
        
        System.out.println(auto);
        
        Autó[] a = new Autó[2];
        for(int i=0; i<2; i++){
            a[i] = new Autó(sc.next(), sc.nextInt(), sc.nextBoolean());
        }
        Teherautó [] ta = new Teherautó[2];
        for(int i=0; i<2; i++){
            ta[i] = new Teherautó(sc.next(), sc.nextInt(), sc.nextBoolean(), sc.nextInt());
        }
        for(int i=0; i<2; i++){
            System.out.println(a[i] + "\n" + ta[i]);
        }
        
        System.out.println();
        
        Autó[] autok = new Autó[5];
        autok[0] = new Autó("ABF123", 55, true);
        autok[1] = new Teherautó("BDS321", 80, false, 20000);
        autok[2] = new Autó("ATF123", 110, true);
        autok[3] = new Teherautó("BBS551", 130, true, 25000);
        autok[4] = new Teherautó("CDT331", 100, true, 21000);
        
        List<Teherautó> teherlista = tonna20(autok);
        
        for(Teherautó i:teherlista){
            System.out.println(i);
        }
        
        System.out.println();
        
        List<Autó> autólista = new ArrayList();
        autólista.add(new Autó("ABD321", 60, true));
        autólista.add(new Autó("BTR756", 80, false));
        autólista.add(new Autó("ZER353", 100, true));
        autólista.add(new Autó("HFD243", 110, false));
        autólista.add(new Autó("HGR889", 90, true));
        kiirHarom(autólista);
    }
}

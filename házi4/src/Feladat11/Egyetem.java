/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Egyetem{
    List<Hallgató> hallgato = new ArrayList();
    List <Oktató> oktato = new ArrayList();
    
    public void h_add(Hallgató h){
        hallgato.add(h);
    }

    public void o_add(Oktató o){
        oktato.add(o);
    }
    
    public void h_rem(Hallgató h){
        hallgato.remove(h);
    }
    
    public void o_rem(Oktató o){
        oktato.remove(o);
    }
    
    public void legfiatalabbHallgatók(){
        for(int i=0; i<hallgato.size(); i++){
            for(int j=i; j<hallgato.size(); j++){
                if(hallgato.get(i).getÉletkor()>hallgato.get(j).getÉletkor()){
                    Collections.swap(hallgato, i, j);
                }
            }
        }
        if(hallgato.size()<3){
            for(Hallgató i:hallgato){
                System.out.println(i);
            }
        } else {
            for(int i=0; i<3; i++){
                System.out.println(hallgato.get(i));
            }
        }
    }
    
    public String névFelkiáltó(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<oktato.size(); i++){
            if(oktato.get(i).getTanszék().equals("IT")){
                sb.append(oktato.get(i).getNév()).append("!");
            }
        }
        return sb.toString();
    }
}

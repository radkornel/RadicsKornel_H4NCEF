/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Jégkorongmérkőzések;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */

class csapat implements Comparable<csapat>{
    public String név;
    public int pont;
    public int gól;

    public csapat(String név, int pont, int gól) {
        this.név = név;
        this.pont = pont;
        this.gól = gól;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(név).append(": ").append(pont).append(" points (").append(gól).append(" scored goals)");
        
        return sb.toString();
    }

    @Override
    public int compareTo(csapat cs) {
        if(this.pont==cs.pont){
            if(this.gól==cs.pont){
                return this.név.compareTo(cs.név);
            } else {
                return (-1)*Integer.compare(this.gól, cs.gól);
            }
        } else {
            return (-1)*Integer.compare(this.pont, cs.pont);
        }
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<csapat> lista = new ArrayList();
        
        String sor;
        String[] token;
        while(sc.hasNext()){
            int nulladikgol=0, elsogol=0;
            boolean hosszabbítás=false;
            sor=sc.nextLine();
            
            token=sor.split(":");
            String[] csapatok = token[0].split("-");
            String nulladiknév=csapatok[0];
            String elsonév = csapatok[1];
            String[] pontok = token[1].split("[,-]");
            if(pontok.length>6){
                hosszabbítás=true;
            }
            for(int i=0; i<pontok.length; i++){
                if(i==0 || i%2==0){
                    nulladikgol+=Integer.parseInt(pontok[i]);
                } else {
                    elsogol+=Integer.parseInt(pontok[i]);
                }
            }
            int van=0;
            for(int i=0; i<lista.size(); i++){
                if(lista.get(i).név.compareTo(nulladiknév)==0){
                    if(nulladikgol>elsogol && hosszabbítás==false){
                        lista.get(i).pont+=3;
                        lista.get(i).gól+=nulladikgol;
                    } else if(nulladikgol>elsogol && hosszabbítás){
                        lista.get(i).pont+=2;
                        lista.get(i).gól+=nulladikgol;
                    } else if(nulladikgol<elsogol && hosszabbítás){
                        lista.get(i).pont+=1;
                        lista.get(i).gól+=nulladikgol;
                    } else if(nulladikgol<elsogol && hosszabbítás==false){
                        lista.get(i).gól+=nulladikgol;
                    }
                    van=1;
                    break;
                }
            }
            if (van==0){
                if(nulladikgol>elsogol && hosszabbítás==false){
                    lista.add(new csapat(nulladiknév, 3, nulladikgol));
                } else if(nulladikgol>elsogol && hosszabbítás){
                    lista.add(new csapat(nulladiknév, 2, nulladikgol));
                } else if(nulladikgol<elsogol && hosszabbítás){
                    lista.add(new csapat(nulladiknév, 1, nulladikgol));
                } else if(nulladikgol<elsogol && hosszabbítás==false){
                    lista.add(new csapat(nulladiknév, 0, nulladikgol));
                }
            }
            van=0;
            for(int i=0; i<lista.size(); i++){
                if(lista.get(i).név.compareTo(elsonév)==0){
                    if(nulladikgol<elsogol && hosszabbítás==false){
                        lista.get(i).pont+=3;
                        lista.get(i).gól+=elsogol;
                    } else if(nulladikgol<elsogol && hosszabbítás){
                        lista.get(i).pont+=2;
                        lista.get(i).gól+=elsogol;
                    } else if(nulladikgol>elsogol && hosszabbítás){
                        lista.get(i).pont+=1;
                        lista.get(i).gól+=elsogol;
                    } else if(nulladikgol>elsogol && hosszabbítás==false){
                        lista.get(i).gól+=elsogol;
                    }
                    van=1;
                    break;
                }
            }
            if(van==0) {
                if(nulladikgol<elsogol && hosszabbítás==false){
                    lista.add(new csapat(elsonév, 3, elsogol));
                } else if(nulladikgol<elsogol && hosszabbítás){
                    lista.add(new csapat(elsonév, 2, elsogol));
                } else if(nulladikgol>elsogol && hosszabbítás){
                    lista.add(new csapat(elsonév, 1, elsogol));
                } else if(nulladikgol>elsogol && hosszabbítás==false){
                    lista.add(new csapat(elsonév, 0, elsogol));
                }
            }
        }
        Collections.sort(lista);
        for(csapat i:lista){
            System.out.println(i);
        }
    }
}


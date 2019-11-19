/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Vízgyűjtők;

/**
 *
 * @author Kornél
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Main
{
    private String nev;
    private List<Main> befolyo;
    
    public Main(String nev)
    {
        this.nev = nev;
        this.befolyo = new ArrayList<>();
    }
    public void gyujti(Main v) { 
        befolyo.add(v); 
    }
    
    public String getNev() { 
        return nev; 
    }
    
    public List<Main> getBefolyo() { 
        return befolyo; 
    }
    
    @Override
    public boolean equals(Object obj)
    {
        return obj instanceof Main && nev.equals(((Main)obj).nev);
    }
    
    private int befolyokSzama()
    {
        int összesen=0;
        for(int i=0; i<befolyo.size(); i++){
            összesen+=befolyo.get(i).befolyokSzama();
        }
        összesen += befolyo.size();
        
        return összesen;
    }
    
    @Override
    public String toString()
    {
        return nev + ": " + befolyokSzama();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Main> v = new ArrayList();
        while(sc.hasNext()){
            String sor =sc.nextLine();
            
            
            String[] token=sor.split(";");
            if(token.length==1){
                Main név = new Main(token[0]);
                v.add(név);
            } else {
                Main név = new Main(token[1]);
                Main tmp = new Main(token[0]);
                if(v.contains(név)){
                    int idx=v.indexOf(név);
                    
                    v.get(idx).gyujti(tmp);
                } else {
                    v.add(név);
                    v.get(v.size()-1).gyujti(tmp);
                }
            }
        }
        
        for(int i=0; i<args.length; i++){
            for(Main j : v){
                if(j.getNev().equals(args[i])){
                    System.out.println(j);
                }
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Másfél_millió_lépés;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Test {
    
    public static void rendez(Masfel[] m){
        for(int i=0; i<m.length; i++){
            for(int j=i+1; j<m.length; j++){
                if(m[i].getKék() == m[j].getKék()){
                    if(m[i].getTöbbi() == m[j].getTöbbi()){
                        if(m[i].getNév().compareTo(m[j].getNév())>0){
                            Masfel tmp = m[i];
                            m[i]=m[j];
                            m[j]=tmp;
                        }
                    } else if(m[i].getTöbbi() < m[j].getTöbbi()){
                        Masfel tmp = m[i];
                        m[i]=m[j];
                        m[j]=tmp;
                    }
                } else if(m[i].getKék() < m[j].getKék()){
                    Masfel tmp = m[i];
                    m[i]=m[j];
                    m[j]=tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Masfel[] m = new Masfel[n];
        
        for(int i=0; i<n; i++){
            String sor = sc.nextLine();
            String[] tmp = sor.split(";");
            int kék=0, többi=0;
            
            for(int j=0; j<tmp[1].length(); j++){
                if(tmp[1].charAt(j)=='K'){
                    kék++;
                } else if(tmp[1].charAt(j)=='.'){
                    continue;
                } else {
                    többi++;
                }
            }
            m[i] = new Masfel(tmp[0], kék, többi);
        }
        
        rendez(m);
        
        for(int i=0; i<n; i++){
            System.out.println(m[i]);
        }
    }
}

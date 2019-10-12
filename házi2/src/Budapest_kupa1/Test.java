/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Budapest_kupa1;

import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Test {
    
    private static void rendez(Budapestkupa[] t){
        for(int i=0; i<t.length; i++){
            for(int j=i+1; j<t.length; j++){
                if(Integer.parseInt(t[i].getÉv()) == Integer.parseInt(t[j].getÉv())){
                    if(Integer.parseInt(t[i].getHónap()) == Integer.parseInt(t[j].getHónap())){
                        if(Integer.parseInt(t[i].getNap()) == Integer.parseInt(t[j].getNap())){
                            if(t[i].getTúra_neve().compareTo(t[j].getTúra_neve())>0){
                                Budapestkupa tmp=t[i];
                                t[i]=t[j];
                                t[j]=tmp;

                            }
                        } else if(Integer.parseInt(t[i].getNap()) > Integer.parseInt(t[j].getNap())){
                            Budapestkupa tmp=t[i];
                            t[i]=t[j];
                            t[j]=tmp;
                        }
                    } else if(Integer.parseInt(t[i].getHónap()) > Integer.parseInt(t[j].getHónap())){
                        Budapestkupa tmp=t[i];
                        t[i]=t[j];
                        t[j]=tmp;
                    }
                } else if(Integer.parseInt(t[i].getÉv()) > Integer.parseInt(t[j].getÉv())){
                        Budapestkupa tmp=t[i];
                        t[i]=t[j];
                        t[j]=tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Budapestkupa[] bk = new Budapestkupa[n];
        
        for(int i=0; i<n; i++){
            int résztávok=0;
            String sor= sc.nextLine();
            String[] tmp=sor.split(";");
            for(int j=4; j<tmp.length; j++){
                résztávok+=Integer.parseInt(tmp[j]);
            }
            bk[i]=new Budapestkupa(tmp[0], tmp[1], tmp[2], tmp[3], résztávok);
        }
        int max=0;
        for(int i=0; i<bk.length; i++){
            if(bk[i].getTáv()>max){
                max=bk[i].getTáv();
            }
        }
        rendez(bk);
        for(int i=0; i<bk.length; i++){
            if(bk[i].getTáv()==max){
                System.out.println(bk[i]);
            }
        }
    }
}

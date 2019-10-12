/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat6;

/**
 *
 * @author Kornél
 */
public class Azonosértékűszámok {
    public static boolean isConsecutiveFour(int[] values){
        int van=0;
        for(int i=0; i<values.length; i++){
            int db=1;
            for(int j=i+1; j<values.length; j++){
                if(values[i]==values[j]){
                    db++;
                } else {
                    db=1;
                }
                if(db==4){
                    van=1;
                    break;
                }
            }
        }
        if(van==1){
            return true;
        } else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        int[] n=new int[5];
        n[0]=3;
        n[1]=3;
        n[2]=3;
        n[3]=3;
        n[4]=1;
        
        if(n.length<4){
            System.out.println("Missing data");
        } else {
            System.out.println(isConsecutiveFour(n));
        }
    }
}

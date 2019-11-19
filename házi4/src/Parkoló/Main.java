/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Parkoló;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Kornél
 */
public class Main implements Comparable<Main>{
    private String cím;
    private double terület;
    private int kapacitás;
    private String[] rendszám;
    private int szabadhely;

    public Main(String cím, double terület, int kapacitás, String[] rendszám) {
        this.cím = cím;
        this.terület = terület;
        this.kapacitás = kapacitás;
        this.rendszám = rendszám;
        this.szabadhely = kapacitás-rendszám.length;
    }

    public String getCím() {
        return cím;
    }

    public double getTerület() {
        return terület;
    }

    public int getKapacitás() {
        return kapacitás;
    }

    public String[] getRendszám() {
        return rendszám;
    }

    public void setCím(String cím) {
        this.cím = cím;
    }

    public void setTerület(double terület) {
        this.terület = terület;
    }

    public void setKapacitás(int kapacitás) {
        this.kapacitás = kapacitás;
    }

    public void setRendszám(String[] rendszám) {
        this.rendszám = rendszám;
    }

    public int getSzabadhely() {
        return szabadhely;
    }

    public void setSzabadhely(int szabadhely) {
        this.szabadhely = szabadhely;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.cím);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Main)) {
            return false;
        }
        
        Main p = (Main) obj;
        return this.cím.equals(p.getCím());
    }

    @Override
    public int compareTo(Main p) {
        if(this.szabadhely==p.getSzabadhely()){
            return this.cím.compareTo(p.getCím());
        } else {
            return (-1)*Integer.compare(this.szabadhely, p.getSzabadhely());
        }
    }

    @Override
    public String toString() {
        return this.cím + ": " + this.szabadhely + " szabad hely";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Main> p = new ArrayList();
        
        while(sc.hasNextLine()){
            String[] sor = sc.nextLine().split(";");
            String[] rendszámok=new String[sor.length-3];
            int count=0;
            for(int i=3; i<sor.length; i++){
                rendszámok[count]=sor[i];
                count++;
            }
            Main tmp = new Main(sor[0], Double.parseDouble(sor[1]), Integer.parseInt(sor[2]), rendszámok);
            
            if(tmp.getSzabadhely()>=3){
                p.add(tmp);
            }
        }
        Collections.sort(p);
        
        for(Main i:p){
            System.out.println(i);
        }
    }
}

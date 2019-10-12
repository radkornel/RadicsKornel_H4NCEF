/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Másfél_millió_lépés;

/**
 *
 * @author Kornél
 */
public class Masfel {
    String név;
    public int kék;
    public int többi;

    public Masfel(String név, int kék, int többi) {
        this.név = név;
        this.kék = kék;
        this.többi = többi;
    }

    public String getNév() {
        return név;
    }

    public int getKék() {
        return kék;
    }

    public int getTöbbi() {
        return többi;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setKék(int kék) {
        this.kék = kék;
    }

    public void setTöbbi(int többi) {
        this.többi = többi;
    }

    @Override
    public String toString() {
        return név;
    }
    
}

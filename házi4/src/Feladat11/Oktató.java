/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat11;

/**
 *
 * @author Kornél
 */
public class Oktató extends Személy{
    private String tanszék;

    public Oktató(String név, int életkor, boolean férfi, String tanszék) {
        super(név, életkor, férfi);
        this.tanszék = tanszék;
    }

    public String getTanszék() {
        return tanszék;
    }

    public String getNév() {
        return név;
    }

    public int getÉletkor() {
        return életkor;
    }

    public void setTanszék(String tanszék) {
        this.tanszék = tanszék;
    }

    public void setNév(String név) {
        this.név = név;
    }

    public void setÉletkor(int életkor) {
        this.életkor = életkor;
    }
    
    
}

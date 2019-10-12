/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat4;

/**
 *
 * @author Kornél
 */
public class Teherautó extends Autó{
    private int maxSzállíthatóTeher;

    public Teherautó(int maxSzállíthatóTeher, String rendszám, int motorTeljesítmény) {
        super(rendszám, motorTeljesítmény);
        this.maxSzállíthatóTeher = maxSzállíthatóTeher;
    }

    public int getMaxSzállíthatóTeher() {
        return maxSzállíthatóTeher;
    }

    @Override
    public String toString() {
        return super.toString() + "Teheraut\u00f3{" + "maxSz\u00e1ll\u00edthat\u00f3Teher=" + maxSzállíthatóTeher + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Teherautó other = (Teherautó) obj;
        if (this.maxSzállíthatóTeher != other.maxSzállíthatóTeher) {
            return false;
        }
        return true;
    }
    
    
}

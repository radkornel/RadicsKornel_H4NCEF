/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat1;

/**
 *
 * @author Kornél
 */
public abstract class Gyumolcsle extends Ital{

    public Gyumolcsle(Gyumolcs gy) {
    }
    
    public abstract String mibolFacsartak();
    public abstract String mibolKeszult();
    public abstract String milyenizu();

    @Override
    public String toString() {
        return "Gyumolcsle{" + '}';
    }
    
    
}

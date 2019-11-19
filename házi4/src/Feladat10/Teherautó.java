/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat10;

/**
 *
 * @author Kornél
 */
public class Teherautó extends Autó{
    private int teherbírás;

    public Teherautó(String rendszám, int teljesítmény, boolean automata, int teherbírás) {
        super(rendszám, teljesítmény, automata);
        this.teherbírás = teherbírás;
    }

    public int getTeherbírás() {
        return teherbírás;
    }
    
    @Override
    public String toString() {
        return "Teheraut\u00f3{" + "rendsz\u00e1m=" + this.getRendszám() + ", teljes\u00edtm\u00e9ny=" + this.getTeljesítmény() + ", automata=" + this.isAutomata() + ", teherb\u00edr\u00e1s=" + teherbírás + '}';
    }
    
    
}

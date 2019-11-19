/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Feladat9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kornél
 */
public class Test {
    
    public static List<Hátizsák> kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(List<Hátizsák> lista){
        Collections.sort(lista);
        
        return lista;
    }
    
    public static void main(String[] args) {
        List<Hátizsák> h = new ArrayList();
        h.add(new Hátizsák("Fila", 4.2, 6, true));
        h.add(new Hátizsák("Gucci", 5.4, 8, false));
        h.add(new Hátizsák("Under", 3.8, 7, true));
        h.add(new Hátizsák("Nike", 6.1, 9, false));
        h.add(new Hátizsák("Adidas", 3.8, 6, true));
        h.add(new Hátizsák("Puma", 5.4, 4, false));
        h.add(new Hátizsák("Lee Cooper", 7.2, 3, true));
        h.add(new Hátizsák("Nike", 8.2, 5, false));
        h.add(new Hátizsák("Adidas", 3.9, 5, true));
        h.add(new Hátizsák("Fila", 7.6, 7, false));
        
        kiírMárkaSzerintLexikografikusanAzonBelülZsebekSzámaSzerintCsökkenőSorrendben(h);
        
        for(Hátizsák i:h){
            System.out.println(i);
        }
    }
}

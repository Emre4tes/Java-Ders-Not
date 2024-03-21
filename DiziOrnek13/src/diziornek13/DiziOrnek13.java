/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class DiziOrnek13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dizi [] = {"Edirne","İstanbul","Çanakkale","Tekirdağ","Kırklareli"};
        Integer dizi1[] = {22,34,17,59,39};
        
        List sehir_liste  = new ArrayList();
        List plaka_liste = new ArrayList();
        
        sehir_liste = Arrays.asList(dizi);
        plaka_liste = Arrays.asList(dizi1);
        
        System.out.println(sehir_liste.get(1));
        System.out.println(sehir_liste);
        System.out.println(plaka_liste.get(0));
        System.out.println(plaka_liste);
    }
    
    
}

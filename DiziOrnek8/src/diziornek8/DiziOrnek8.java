/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek8;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class DiziOrnek8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] dizi = {1,6,3,9,0,22,11,7};
        // Arrays.sort(dizi); // parametresiz sıralama
        Arrays.sort(dizi, 1, 6); // parametreli arama: belirtieln
        // arada ara sıralar geri kalan sırasız olur
       
        for (int i = 0; i < dizi.length; i++) 
            System.out.println(dizi[i]);
    }
    
}

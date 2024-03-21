/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek14;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class DiziOrnek14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] dizi = {'K','Y','C','U','B','Y','O'};
        char [] yeni_dizi = {};
        
        System.out.println("Kopyalanacak Dizi :");
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
            
        }
        
        yeni_dizi = Arrays.copyOf(dizi, 4);
        
        System.out.println("\n Yeni oluşan Dizi :");
        for (int j = 0; j < yeni_dizi.length; j++) {
            System.out.println(yeni_dizi[j]);
            
        }
    }
    
}

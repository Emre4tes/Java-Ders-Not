/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek9;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class DiziOrnek9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dizi[] = {3,4,12,9,2,5};
        Arrays.sort(dizi);
        int deger = Arrays.binarySearch(dizi, 12);
        if (deger < 0)
            System.out.println("Aranılan Deger Bulunamadı");
        else
            System.out.println("Bulundu ve index degeri : "  + deger);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek15;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class DiziOrnek15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer dizi[] = {0,0,0,0,0};
        Integer dizi1[] ={1,1,1,1,1};
        
        Arrays.fill(dizi, 1);
        Arrays.fill(dizi1, 2, 4, 0);
        
        System.out.println("Elaman doldurduğumuz ilk dizi  :");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]);
            
        }
        
        System.out.println("\nElaman Doldurduğumuz ikinci dizi :" );
        for (int j = 0; j < dizi1.length; j++) {
            System.out.print(dizi1[j]);
            
        }
               
        
        
    }
    
}

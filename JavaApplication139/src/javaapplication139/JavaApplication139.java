/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication139;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class JavaApplication139 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x =0;
        int enBuyuk =0;
        int sayi = 0;
        
        Scanner tara = new Scanner(System.in);
        
        for (x = 0; x < 5; x++) {
            
            System.out.print(x + ". sayı = ");
            sayi = tara.nextInt();
            
            if(sayi > enBuyuk)
            {
                enBuyuk = sayi;
            }
            
        }
        System.out.println("En Buyuk :  " + enBuyuk);
    }
    
}

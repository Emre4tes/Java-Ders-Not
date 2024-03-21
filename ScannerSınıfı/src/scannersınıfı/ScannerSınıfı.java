/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannersınıfı;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ScannerSınıfı {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("3 Sayi Giriniz : ");
        Scanner verial = new Scanner(System.in); //n nesne oluştu
        int veri1 = verial.nextInt();
        int veri2 = verial.nextInt();
        int veri3 = verial.nextInt();
        
        System.out.println("Girdğiniz Sayılar : ");
        System.out.println(veri1);
        System.out.println(veri2);
        System.out.println(veri3);
        
      
                
    }
    
}

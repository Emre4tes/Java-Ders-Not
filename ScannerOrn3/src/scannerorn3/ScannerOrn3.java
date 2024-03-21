/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerorn3;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ScannerOrn3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int toplam = 0;
        Scanner verial = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz : ");
        int sayi1 = verial.nextInt();
        System.out.println("Lütfen ikincisayıyı giriniz : ");
        int sayi2 = verial.nextInt();
        
        for (int i = sayi1; i < sayi2; i++) {
            toplam += i;
            
        }
        System.out.println("iki deger arasındaki sayıların toplamı  " + toplam);
        
    }
    
}

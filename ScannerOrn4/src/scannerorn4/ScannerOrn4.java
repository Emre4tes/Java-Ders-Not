/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerorn4;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ScannerOrn4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int toplam = 0;
        Scanner s1 = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Deger Giriniz : ");
            int sayi = s1.nextInt();
            
            if(sayi >= 0)
                toplam += sayi;
            else
                break;
        }
        System.out.println("Sayıların Toplamı : "  + toplam);
    }
    
}

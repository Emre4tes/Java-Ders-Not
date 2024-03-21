/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayitahminoyunu;

import java.util.*;

/**
 *
 * @author admin
 */
public class SayiTahminOyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int deger = 1;
        Random r = new Random();
        int sayi = r.nextInt(20);
        Scanner s = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Lütfen Tahmin Giriniz (0-20): ");
            int tahmin = s.nextInt();
            
            if(tahmin==sayi)
            {
                System.out.println(deger + ". tahminde bildiniz ");
                break;
            }
            else 
                deger += 1;
        }
    }
    
}

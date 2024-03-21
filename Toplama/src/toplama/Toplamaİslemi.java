/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toplama;

/**
 *
 * @author admin
 */
public class Toplamaİslemi {
    
    public static void main(String args[])
    {
        if(args.length < 2)
        {
            System.out.println("Lütfen iki adet sayı giriniz ");
            System.exit(-1);
        }
        
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        
        double sonuc = Toplama.topla(a, b);
        System.out.println("Sonuc : " + sonuc);
    }
    
}

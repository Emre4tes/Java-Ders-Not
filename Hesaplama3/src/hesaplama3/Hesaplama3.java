/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplama3;

/**
 *
 * @author admin
 */
public class Hesaplama3 {
    private  static int x = 5;
    
    public static class toplama
    {
        static int toplam;
        int sonuc;
        
            public static int toplamaYap(int a, int b)
            {
                toplam = a + b + x;
                return toplam;
            }
            public int topla(int a, int b)
            {
                toplam = a + b + x;
                return toplam;
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sonuc = Hesaplama3.toplama.toplamaYap(15, 8);
       
        System.out.println("Sonuc 15+8 : "  + sonuc);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplama;

/**
 *
 * @author admin
 */
public class Hesaplama {
    
   class Toplama 
    {
        public int toplamaYap(int a, int b)
        {
            return a + b;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hesaplama.Toplama ht = new Hesaplama().new Toplama();
        int sonuc = ht.toplamaYap(3, 5);
        System.out.println("Toplam sonuc : " + sonuc);
    }
    
}

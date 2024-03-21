/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesapalmakullan;

/**
 *
 * @author admin
 */
class Hesaplama {
    
   class Toplama 
    {
        public int toplamaYap(int a, int b)
        {
            return a + b;
        }
    }
   private class Cikartma
   {
       public int cikart(int a , int b)
       {
           return a-b;
       }
   }
 }
public class HesapalmaKullan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Hesaplama.Toplama ht = new Hesaplama().new Toplama();
       // Hesaplama.Cikartma hc =
    }
    
}

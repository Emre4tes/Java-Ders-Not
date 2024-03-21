/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplama5;

/**
 *
 * @author admin
 */
interface toplayici
{
    public int hesaplamaYap();
}
public class Hesaplama5 {
    
    public static int topla(int a, final int b)
    {
        int a_yedek = a;
        class toplama5 implements toplayici
        {
            private int deger1;
            private int deger2;
            protected int deger3 = a_yedek;
            
            public toplama5(int deger1, int deger2)
            {
                
                this.deger1 = deger1;
                this.deger2 = deger2;
            }
            public int hesaplamaYap()
            {
                int degera = a;
                int degerb = b;
                return deger1 + deger2;
            }
        }
        
        toplama5 t5 = new toplama5(a,b);
        return t5.hesaplamaYap();
    }
    public void ekranayaz()
    {
       // toplama5 t5 = new toplama5(2,5);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hesaplama5 h5 = new Hesaplama5();
        int sonuc = h5.topla(5, 8);
        System.out.println("Sonuc : "  + sonuc);
    }
    
}

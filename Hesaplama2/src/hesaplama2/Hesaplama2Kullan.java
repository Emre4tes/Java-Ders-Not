/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplama2;

/**
 *
 * @author admin
 */
 class Hesaplama2
{
    int sabit =2;
    private int ozel_sabit =1;
    
    public static class Toplama2
    {
        static int toplam;
        int sonuc;
        
        public int topla(int a, int b)
        {
            sonuc = toplam = a + b;
            return sonuc;
        }
        
        public void dekontOlustur()
        {
            Hesaplama2 h2 = new Hesaplama2();
            int a = h2.ozel_sabit;
            h2.ekranaBas();
            System.out.println("Dekont olusturuluyor : " + h2.sabit + "-" + a);
        }
    }
    public class Cikarma2
    {
        int sonuc;
       
        public int cikartmaYap(int a, int b)
        {
            sonuc = (a-b)-ozel_sabit;
            return sonuc;
        }
    }
    
    private void ekranaBas()
    {
        System.out.println("Hesaplama2.ekranaBas()");
    }
    
    public static void main(String[] args)
    {
        Toplama2 ht = new Toplama2();
        ht.dekontOlustur();
        int sonuc = ht.topla(5, 8);
        System.out.println("Sonuc : " +sonuc);
    }
}
public class Hesaplama2Kullan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hesaplama2.Toplama2 ht2 = new Hesaplama2.Toplama2();
        int sonuc2 = ht2.topla(5, 7);
    }
    
}

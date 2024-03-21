/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplama7;

/**
 *
 * @author admin
 */
abstract class BuyukToplayici
{
    private int deger;
    public BuyukToplayici(int x)
    {
        deger = x;
    }
    
    public int degerdondur()
    {
        return deger;
    }
    public abstract int hesapla();
}
public class Hesaplama7 {
    public BuyukToplayici degerGoster(int gonderilen)
    {
        return new BuyukToplayici(gonderilen)
        {
            public int hesapla()
            {
                return super.degerdondur() + 5;
            }
        };
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hesaplama7 h7 = new Hesaplama7();
        BuyukToplayici bt = h7.degerGoster(5);
        int sonuc = bt.hesapla();
        System.out.println("Sonuc = " + sonuc);
    }
    
}

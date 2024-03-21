/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kitapevi;

/**
 *
 * @author admin
 */
class Kitap
{
    public int SayfaSayisiOgren()
    {
        System.out.println("Kitap - Sayfa Sayisi ");
        return 450;
    }
    
    public double FiyatOgren()
    {
        System.out.println("Kitap - Fiyat Ogren ");
        return 250000;
    }
    public String Yazarİsmi()
    {
        System.out.println("Kitap - Yazar İsmi ");
        return "xyz";
    }
}

public class KitapEvi extends Kitap {
    
    public int SayfaSayisiOgren()
    {
        System.out.println("Roman - Sayfa Sayisi ");
        return 555;
    }
    
    public double FiyatOgren()
    {
        System.out.println("Roman - Fiyat Ogren ");
        return 550000;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KitapEvi roman = new KitapEvi();
        int Sayfa_sayisi = roman.SayfaSayisiOgren();
        double fiyat = roman.FiyatOgren();
        String yazarbilgisi = roman.Yazarİsmi();
    }
    
}

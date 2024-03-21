/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostornek;

/**
 *
 * @author admin
 */
public class TostOrnek {
    int sayi;
    String malzeme;
    
    public TostOrnek()
    {
       // System.out.println("Deneme");
        this(5);
        //this(5,"Sucuklu");
        System.out.println("Parametresiz Yapılandirici");
    }
    public TostOrnek(int sayi)
    {
        this(sayi,"Karisik");
        this.sayi = sayi;
        System.out.println("Tost(sayi)");
    }
    public TostOrnek(int sayi, String malzeme)
    {
        this.sayi = sayi;
        this.malzeme = malzeme;
        System.out.println("Tost(sayi, malzeme");
    }
    public void siparisGoster()
    {
        //this(5); // sadece constructer larda olur
        System.out.println("Tost sayisi = " + sayi + " malzeme : " + malzeme);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TostOrnek tost = new TostOrnek();
        tost.siparisGoster();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarihhesaplamaorn;

/**
 *
 * @author admin
 */
public class TarihHesaplamaOrn {
    int gun, ay, yil;
    
    public void gunEkle(int gun)
    {
        this.gun += gun;
    }
    public void EkranaBas()
    {
        System.out.println("Gun = " + gun);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TarihHesaplamaOrn th = new TarihHesaplamaOrn();
        th.gunEkle(2);
        th.gunEkle(3);
        th.EkranaBas();
    }
    
}

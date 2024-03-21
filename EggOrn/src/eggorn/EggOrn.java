/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eggorn;

/**
 *
 * @author admin
 */
public class EggOrn {
    
    int toplam_yumurta_sayisi = 0;
    
    EggOrn sepeteKoy()
    {
        toplam_yumurta_sayisi ++;
        return this;
    }
    void goster ()
    {
        System.out.println("Toplam Yumurta Sayisi : "  + toplam_yumurta_sayisi);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EggOrn yumurta = new EggOrn();
        yumurta.sepeteKoy().sepeteKoy().sepeteKoy().goster();
    }
    
}

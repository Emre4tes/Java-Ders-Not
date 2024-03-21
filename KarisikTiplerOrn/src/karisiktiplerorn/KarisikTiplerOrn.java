/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karisiktiplerorn;

/**
 *
 * @author admin
 */
public class KarisikTiplerOrn {
    
    boolean mantiksal_deger = mantiksalDegerAta(); // true degeri aldı
    
    static int int_deger = intDegerAta(); // 30 degerini aldı
    String s;
    double d = 4.26;
    
    public boolean mantiksalDegerAta()
    {
        return true;
    }
    public static int intDegerAta()
    {
        return 5*6;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new KarisikTiplerOrn();
    }
    
}

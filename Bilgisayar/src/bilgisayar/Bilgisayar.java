/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilgisayar;

/**
 *
 * @author admin
 */
class HesapMakinesi
{
    
    void hesapla(double a, double b)
    {
        System.out.println("Hesapmakinesi - Hesapla");
    }
}
public class Bilgisayar  extends HesapMakinesi{
    protected void hesapla(double a, double b)
    {
        System.out.println("Bilgisayar- Hesapla");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

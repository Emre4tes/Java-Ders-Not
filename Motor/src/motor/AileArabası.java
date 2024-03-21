/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motor;

/**
 *
 * @author admin
 */
public class AileArabası {
    private Motor m = new Motor();
    
    public void hareketEt()
    {
        m.calis();
        System.out.println("Aile Arabası Calisti");
    }
    
    public void dur()
    {
        m.dur();
        System.out.println("Aile Arabası durdu");
    }
    
    public static void main(String args[])
    {
        AileArabası a_araba = new AileArabası();
        a_araba.hareketEt();
        a_araba.dur();
    }
    
}

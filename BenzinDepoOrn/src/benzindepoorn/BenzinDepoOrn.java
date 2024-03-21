/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benzindepoorn;

/**
 *
 * @author admin
 */
class Ucak
{
    String ucak_ismi;
    boolean benzin_deposu_dolu = false;
    boolean benzin_deposu_kapagı_acikmi = false;
    
    Ucak(boolean depouyu_doldur, String ucak_ismi)
    {
        benzin_deposu_kapagı_acikmi = true;
        benzin_deposu_dolu = true;
        this.ucak_ismi = ucak_ismi;
    }
    public void finalize()
    {
        if(benzin_deposu_kapagı_acikmi)
        {
            benzin_deposu_kapagı_acikmi = false;
            System.out.println(ucak_ismi + " - kapakları kapatilid");
        }
    }
}
public class BenzinDepoOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ucak ucak1 = new Ucak(true,"F-14");
        new Ucak(true,"F-16");
        
        System.gc();
        System.out.println("Ucaklara benzin doldu, kapakları kapatildi");
    }
    
}

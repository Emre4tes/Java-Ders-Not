/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varsayilanyapilandiriciorn;

/**
 *
 * @author admin
 */
class Araba
{
    int kapi_sayisi;
    int vites_sayisi;
    
    public Araba(int adet)
    {
        kapi_sayisi = adet;
    }
    public Araba(int adet,int sayi)
    {
        kapi_sayisi = adet;
        vites_sayisi = sayi;
    }
    public Araba()
    {
        
    }
}

public class VarsayilanYapilandiriciOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Araba ar = new Araba();
        Araba ar1 = new Araba(4);
        Araba ar2 = new Araba(4,7);
    }
    
}

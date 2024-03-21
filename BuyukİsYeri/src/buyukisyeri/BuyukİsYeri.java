/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyukisyeri;

/**
 *
 * @author admin
 */
interface calisan
{
    public void calis();
    public void mesaiBilgisi();
    public void kisiBilgisi();
}
class Mudur implements calisan
{
    public void calis()
    {
        System.out.println("mudur");
    }
}
class GenelMudur extends Mudur
{
    public void calis()
    {
        System.out.println("genelmudur");
    }
}
public class BuyukİsYeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

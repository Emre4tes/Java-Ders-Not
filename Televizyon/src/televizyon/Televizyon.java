/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package televizyon;

/**
 *
 * @author admin
 */
class XModel
{
    public void sesAc()
    {
        System.out.println("X Model Ses acti");
    }
    public void sesKapat()
    {
        System.out.println("X Model Ses kapattı");
    }
    public void kanalDegistir()
    {
        System.out.println("X Model kanal değ*iştirdi");
    }
   }
class YModel extends XModel
{
    public void sesKapat()
    {
        System.out.println("Y Model Ses kapatti");
    }
    public void sesAc()
    {
        System.out.println("Y Model Ses acti");
    }
    public void kanalDegistir()
    {
        System.out.println("Y Model kanal değiştirdi");
    }
    public void teletext()
    {
        System.out.println("Y Model Teletext");
    }
}
public class Televizyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        XModel x_kumanda = new YModel();
        x_kumanda.kanalDegistir();
        x_kumanda.sesAc();
        x_kumanda.sesKapat();
       // x_kumanda.teletext();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaplanorn;

/**
 *
 * @author admin
 */
class Kedi
{
    public void yakalaAv()
    {
        System.out.println("Kedi sınıfı av Yakaladı");
    }
}
public class KaplanOrn extends Kedi{
    public static void goster(Kedi k)
    {
        k.yakalaAv();  // gec baglanma
    }
    
    public void yakalaAv()
    {
        System.out.println("Kaplan sınıfı av yakaladı");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kedi k = new Kedi();
        KaplanOrn kp = new KaplanOrn();
        goster(k);
        goster(kp); 
    }
    
}

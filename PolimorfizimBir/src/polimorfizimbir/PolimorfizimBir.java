/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfizimbir;

/**
 *
 * @author admin
 */
class Asker
{
    public void selamVer()
    {
        System.out.println("Asker Selam Verdi...");
    }
}
class Er extends Asker
{
    public void selamVer()
    {
        System.out.println("Er Selam Verdi...");
    }
}
class Yuzbasi extends Asker
{
    public void selamVer()
    {
        System.out.println("YuzBası selam Verdi...");
    }
}
public class PolimorfizimBir {
    
    public static void hazirOl(Asker a)
    {
        a.selamVer();  // Dikkat
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asker a = new Asker();
        Er e = new Er();
        Yuzbasi y = new Yuzbasi();
        
        hazirOl(a); // upcasting yok
        hazirOl(e); // upcasting var
        hazirOl(y); // upcastin 
    }
    
}

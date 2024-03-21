/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absısyeri;

/**
 *
 * @author admin
 */
abstract class Calisan
{
    public String pozisyon ="Calisan";
    public abstract void calis();
    public void zamİste()
    {
        System.out.println("Calisan Zam istedi");
    }
}
class Mudur extends Calisan
{
    public Mudur()
    {
        pozisyon="Mudur";
    }
   public void zamİste()
   {
       System.out.println("Mudur Zam istedi");
   }
   public void calis()
   {
       
   }
    
}

class Programci extends Calisan
{
    public Programci()
    {
        pozisyon = "Programci";
    }
    public void calis()
    {
        System.out.println("Programci Yazılım Yapıyor");
    }
}

class Pazarlamaci extends Calisan
{
    public Pazarlamaci()
    {
        pozisyon = "Pazarlamaci";
    }
    public void calis()
    {
        System.out.println("Pazarlamaci calisiyor");
    }
}
public class AbsIsyeri {

    /**
     * @param args the command line arguments
     */
     public static void mesaiBasla(Calisan[]c)
    {
        for (int i = 0; i < c.length; i++) {
            c[i].calis();
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Calisan [] c = new Calisan[4];
        //c[0] = new Calisan();  soyut sınıflar new anahtar sözcüğü ile oluşmaz
        c[1] = new Mudur();
        c[2] =new Programci();
        c[3] = new Pazarlamaci();
        mesaiBasla(c);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hayvankartal;

/**
 *
 * @author admin
 */
class Hayvan
{
    public void avlan()
    {
        System.out.println("Hyvan Avlanıyor...");
    }
    abstract class Kus
    {
        public abstract void uc();
        public abstract void kon();
    }
}
 public class Kartal extends Hayvan.Kus {
    
public void uc()
{
    System.out.println("kartal ucuyor");
}
public void kon()
{
    System.out.println("kartal konuyor");
}
public Kartal(Hayvan hv)
{
    hv.super();
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hayvan h = new Hayvan();
        Kartal k = new Kartal(h);
        k.uc();
        k.kon();
    }
    
}


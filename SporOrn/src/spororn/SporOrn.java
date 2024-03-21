/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spororn;

/**
 *
 * @author admin
 */
abstract class Sporcu
{
    public abstract void calis();
}
class Basketbolcu extends Sporcu
{
    public void calis()
    {
        System.out.println("Basketbol oynuyor");
    }
}
class Futbolcu extends Sporcu
{
    public void calis()
    {
        System.out.println("Futbol oynuyor");
    }
}
public class SporOrn extends Basketbolcu, Futbolcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sporcu s = new SporOrn();
        s.calis();
        
    }
    
}

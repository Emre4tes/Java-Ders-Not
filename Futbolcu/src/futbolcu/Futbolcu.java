/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolcu;

/**
 *
 * @author admin
 */
class KontrolMerkezi 
{
    public static void checkup(Sporcu s)
    {
        s.calis();
    }
}
class Sporcu 
{
    public void calis()
    {
        System.out.println("Sporcu.calis");
    }
    
}
public class Futbolcu extends Sporcu {
    public void calis()
    {
        System.out.println("Futbolcu.calis");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sporcu s = new Sporcu();
        Futbolcu f = new Futbolcu();
        KontrolMerkezi.checkup(s);
        KontrolMerkezi.checkup(f); // Dikkat
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mudur;

/**
 *
 * @author admin
 */
class Calisan
{
   
    public void isYap(double e)
    {
        System.out.println("Calisan.isYap()");
    }
}
public class Mudur extends Calisan {
    public void isYap(int a) // overload (Adas Yordam)
    {
        System.out.println("Mudur.isYap()");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mudur m = new Mudur();
        m.isYap(3.3);
        m.isYap(5);
    }
    
}

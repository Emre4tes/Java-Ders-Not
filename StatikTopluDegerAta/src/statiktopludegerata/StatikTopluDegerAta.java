/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statiktopludegerata;

/**
 *
 * @author admin
 */
class Kopek
{
    public Kopek()
    {
        System.out.println("Ben bir köpegim");
    }
}
public class StatikTopluDegerAta {
    static int x;
    static double y;
    static Kopek kp;
    
    static 
    {
        x = 5;
        y = 6.78;
        kp = new Kopek();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new StatikTopluDegerAta();
    }
    
}

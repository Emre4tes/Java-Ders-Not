/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasorniki;

/**
 *
 * @author admin
 */
public class PasOrniki {
    
    static void f_fonk(double a)
    {
        System.out.println(a + " gonderildi");
        a = 10;
        System.out.println("Gonderilen parametrenini değeri 10'a esitlendi");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a = 5;
        f_fonk(a);
        System.out.println("a --> " + a);
    }
    
}

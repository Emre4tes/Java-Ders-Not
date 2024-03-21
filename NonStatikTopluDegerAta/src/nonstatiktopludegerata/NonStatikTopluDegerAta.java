/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonstatiktopludegerata;

/**
 *
 * @author admin
 */
class Kedi
{
    public Kedi()
    {
        System.out.println("Ben bir kediyim");
    }
}
public class NonStatikTopluDegerAta {

    int x;
    double y;
    Kedi kd;
    
    {
        x = 5;
        y =6.78;
        kd = new Kedi();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new NonStatikTopluDegerAta();
    }
    
}

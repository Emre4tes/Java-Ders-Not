/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalornek;

/**
 *
 * @author admin
 */
class Kutu
{
    int i = 0;
}
public class FinalOrnek {
    final int X_SABİT_DEGER  = 34;
    final static int Y_SABİT_DEGER = 35;
    
    final int A_SABİT_DEGER = (int)(Math.random()*50);
    
    final Kutu k = new Kutu();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FinalOrnek fo = new FinalOrnek();
        
       // fo.X_SABİT_DEGER = 15;
       // fo.Y_SABİT_DEGER = 16;
       //fo.A_SABİT_DEGER = 17;
        
        fo.k.i = 35;
       // fo.k = new Kutu();
        
        System.out.println("X sabit deger : "  + fo.X_SABİT_DEGER);
        System.out.println("Y sabit deger : "  + fo.Y_SABİT_DEGER);
        System.out.println("A sabit deger : " + fo.A_SABİT_DEGER);
        System.out.println("Kutu.i = " + fo.k.i);
    }
    
}

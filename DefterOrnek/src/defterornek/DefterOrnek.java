/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defterornek;

/**
 *
 * @author admin
 */
class Kagit
{
    public Kagit(int i)
    {
        System.out.println("Kagit (" +i+ ")");
    }
}
public class DefterOrnek {
    Kagit k1 = new Kagit(1);
    public DefterOrnek()
    {
        System.out.println("Defter Yapilandiricisi");
        k2 = new Kagit(33);
    }
    Kagit k2 = new Kagit(2);
    
    public void islemTamam()
    {
        System.out.println("Islem Tamam");
    }
    Kagit k3 = new Kagit(3);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DefterOrnek defter = new DefterOrnek();
        defter.islemTamam();
    }
    
}

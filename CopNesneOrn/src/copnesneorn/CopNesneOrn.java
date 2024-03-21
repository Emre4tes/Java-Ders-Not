/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copnesneorn;

/**
 *
 * @author admin
 */
class Elma
{
    int i = 0;
    
    Elma(int y)
    {
        this.i = y;
        System.out.println("Elma Nesnesi oluşturuluyor = " +i);
    }
    
    public void finalize()
    {
        System.out.println("Elma Nesnesi Yok Ediliyor = " +i);
    }
            
}
public class CopNesneOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Elma e = new Elma(1);
        new Elma(2);
        System.gc();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temizle;

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
        System.out.println("Elma Nesnesi Yok Ediliyor");
    }
            
}
public class Temizle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int y = 0; y <5; y++) {
            Elma e = new Elma(y);
            
        } 
        System.gc();
        for (int y = 5; y < 11; y++) {
            Elma e = new Elma(y);
            
        }
    }
    
}

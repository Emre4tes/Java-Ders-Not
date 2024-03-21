/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hesaplama6;

/**
 *
 * @author admin
 */
interface toplayici
{
    public int hesapla();
}
public class Hesaplama6 {
    
    public toplayici topla(final int a, final int b)
    {
        return new toplayici()
        {
            public int hesapla()
            {
                return a + b;
            }
        };
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hesaplama6 h6 = new Hesaplama6();
        toplayici t = h6.topla(5, 8);
        int sonuc = t.hesapla();
        System.out.println("Sonuc = " + sonuc);
    }
    
}

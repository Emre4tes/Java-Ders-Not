/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abc;

/**
 *
 * @author admin
 */
public class ABC {
    public ABC()
    {
        System.out.println("ABC nesnesi oluşuyor");
    }
    
    public class DEF
    {
        public DEF()
        {
            System.out.println("DEF nesnesi oluşuyor");
        }
        
        public class GHI
        {
            public GHI()
            {
                System.out.println("GHI nesnesi oluşuyor");
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        ABC.DEF.GHI ic_ice = new ABC().new DEF().new GHI();
    }
    
}

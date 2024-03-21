/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyuka;

/**
 *
 * @author admin
 */
public class BuyukA 
{
    public class B 
    {
        public B()
        {
            System.out.println("Ben B sinifi");
        }
    }
    public BuyukA()
    {
        System.out.println("Ben BuyukA sinifi");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BuyukA.B ba = new BuyukA().new B();
        
    }
    
}

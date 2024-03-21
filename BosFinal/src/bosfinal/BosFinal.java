/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bosfinal;

/**
 *
 * @author admin
 */
class Kalem
{
    
}
public class BosFinal {
    final int a =0;
    final int b; // bos final
    final Kalem k; 
    
    BosFinal()
    {
        k = new Kalem();
        b = 1;
    }
    BosFinal(int x)
    {
        b=x;
        k = new Kalem();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BosFinal bf = new BosFinal();
    }
    
}

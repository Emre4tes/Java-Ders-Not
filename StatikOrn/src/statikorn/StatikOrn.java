/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statikorn;

/**
 *
 * @author admin
 */
public class StatikOrn {
    public static int x ;
    public int y;
    
    public static void ekranaBas(StatikOrn s)
    {
        System.out.println("StatikDegisken.x = " + s.x +
                " StatikDegisken.y = " + s.y);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StatikOrn s1 = new StatikOrn();
        StatikOrn s2 = new StatikOrn();
        
        x = 10;
        s1.x = 10; // x = 10 ile aynı
        s2.x = 10; // x = 10 ile aynı
        
        s1.y =2;
        s2.y =8;
        
        ekranaBas(s1);
        ekranaBas(s2);
                
    }
    
}

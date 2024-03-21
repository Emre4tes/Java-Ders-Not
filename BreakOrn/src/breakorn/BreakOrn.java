/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakorn;

/**
 *
 * @author admin
 */
public class BreakOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 100; i++) {
            if( i ==9)
            {
                break;
            }
            System.out.println("i =" +i);
            
        }
        System.out.println("Döngüden cık");
    }
    
}

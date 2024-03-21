/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breaketiketliorn;

/**
 *
 * @author admin
 */
public class BreakEtiketliOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        dallan:
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 100; i++) {
                if(i == 9)
                {
                    break dallan;
                }
                System.out.println("i = " +i);
            }
            System.out.println("Donguden cıktı");
            System.out.println("j = " +j);
            
        }
    }
    
}

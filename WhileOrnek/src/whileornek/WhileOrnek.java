/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileornek;

/**
 *
 * @author admin
 */
public class WhileOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        
        do
        {
            System.out.println("i : " + i);
            i ++;
        }
        while(i < 0);
        
        System.out.println("Sayma islemi Tamamlandı");
    }
    
}

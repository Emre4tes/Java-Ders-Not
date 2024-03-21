/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek6;

/**
 *
 * @author admin
 */
public class DiziOrnek6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int dizi1 [] = new int[4];
        for (int i = 0; i < dizi1.length; i++) 
            dizi1[i] = i+i;
            
        int dizi2 [] = new int[dizi1.length];
        for (int i = 0; i < dizi1.length; i++)             
         dizi2[i] = dizi1[i];
        
        for (int i = 0; i < dizi2.length; i++) 
            System.out.println(dizi2[i]);
    }
    
}

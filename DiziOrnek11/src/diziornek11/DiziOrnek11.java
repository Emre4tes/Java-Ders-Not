/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek11;

/**
 *
 * @author admin
 */
public class DiziOrnek11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dizi[][] = new int[3][3];
        for (int i = 0; i < 3; i++) 
            for (int j = 0; j < 3; j++) {
                
                dizi[i][j] = i+j;
                System.out.println("Dizi["+i+ "][" +j+"] = " + dizi[i][j]);
                
            }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(dizi[i][j] + "\t");
                
            }
            System.out.println("");
            
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek7;

/**
 *
 * @author admin
 */
public class DiziOrnek7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] dizi1 = {1,2,3,4,5};
        int dizi2[] = new int[5];
        
        System.arraycopy(dizi1,1, dizi2,0,3);
        for (int i = 0; i < dizi2.length; i++) {
            System.out.println("Yeni Dizinin " +i+ ". elemanı : " + dizi2[i]);
            
        }
    }
    
}

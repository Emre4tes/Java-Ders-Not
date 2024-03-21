/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek12;

/**
 *
 * @author admin
 */
public class DiziOrnek12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String dizi [][];
        dizi = new String[2][2];
        dizi[0][0] = "Egemen";
        dizi[0][1] = "Tekkanat";
        dizi[1][0] = "BTBS";
        dizi[1][1] = "KYCUBYO";
        
        System.out.println("Dizinin Elemanları : ");
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(dizi[i][j] + "\t");
                
            }
            System.out.println("");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diziornek5;

/**
 *
 * @author admin
 */
public class DiziOrnek5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object dizi [] = new Object[3];
        dizi[0]="Egemen";
        dizi[1]=2;
        dizi[2]= 3.44;
        
        System.out.println("Dizinin Uzunluığu : " + dizi.length);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(dizi[i]);
            
        }
    }
    
}

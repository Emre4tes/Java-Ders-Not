/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forornek;

/**
 *
 * @author admin
 */
public class ForOrnek {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0 , j=0; i < 10 & j >5; i++,j++) {
            i*=j;
            System.out.println("i : " + i + ", j :" +j);
            
        }
    }
    
}

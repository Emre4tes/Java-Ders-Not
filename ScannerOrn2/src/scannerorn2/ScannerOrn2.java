/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scannerorn2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ScannerOrn2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s1 = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu Giriniz : ");
        int not = s1.nextInt();
        
        if(not > 60)
            System.out.println("Geçtiniz");
        else   
            System.out.println("Kaldınız");
    }
    
}

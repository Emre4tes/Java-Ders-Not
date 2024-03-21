/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsetest;

/**
 *
 * @author admin
 */
public class İfElseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int puan = 77;
        char sonuc;
        
        if(puan >=90)
        {
            sonuc = 'A';
        }
        else if (puan >= 80)
        {
            sonuc='B';
        }
        else if (puan >=70)
        {
            sonuc = 'C';   
        }
        else if (puan >=50)
        {
            sonuc = 'D';   
        }
        else
        {
            sonuc = 'F';
        }
        System.out.println("Sonuc : " + sonuc);
    }
    
}

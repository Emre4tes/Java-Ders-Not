/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sayitahminetkilesimli;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class SayiTahminEtkilesimli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        Random r = new Random();
        int sayi = r.nextInt(15);
        
        while(true)
        {
            String tahmin = JOptionPane.showInputDialog("Tahmin Giriniz :");
            int t = Integer.parseInt(tahmin);
            
            if(t==sayi)
            {
                String mesaj = "Tahmin Dogru " + i + ". tahminde bildiniz";
                JOptionPane.showMessageDialog(null, mesaj);
                break;
            }
            else 
                i++;
        }
    }
    
}

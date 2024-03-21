/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vizefinalorn;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class VizeFinalOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vize = JOptionPane.showInputDialog("Vize Notunu Giriniz :");
        int v_notu = Integer.parseInt(vize);
        
        while(v_notu <0 || v_notu > 100)
        {
            vize = JOptionPane.showInputDialog("Vize Notunu Tekrar Giriniz (0-100 arasında)");
            v_notu = Integer.parseInt(vize);
        }
        
        String finalnotu = JOptionPane.showInputDialog("Lütfen Final Notunu Giriniz :");
        int f_notu = Integer.parseInt(finalnotu);
        
        while(f_notu <0 || f_notu >100)
        {
            finalnotu = JOptionPane.showInputDialog("Final Notunu Tekrar Giriniz (0-100 arasında)");
            f_notu = Integer.parseInt(vize);
        }
        
        int not  =(int)(v_notu*0.3 + f_notu * 0.7);
        String sonuc = "Bu dersteki ortalamanız : " +not;
        
        JOptionPane.showMessageDialog(null, sonuc,"Not Aciklama",JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}

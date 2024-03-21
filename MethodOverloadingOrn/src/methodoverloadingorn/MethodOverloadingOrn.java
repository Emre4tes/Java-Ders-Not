/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloadingorn;

/**
 *
 * @author admin
 */
class muzik_dosyasi
{
    String m_tur = "Muzik Dosyası";
}
class resim_dosyasi 
{
    String r_tur ="Resim Dosyasi";
}
class text_dosyasi
{
    String t_tur = "Text Dosyasi";
}
public class MethodOverloadingOrn {
     public void dosyaAc(muzik_dosyasi md)
        {
            System.out.println("Tur =" + md.m_tur);
        }
        public void dosyaAc(resim_dosyasi rd)
        {
            System.out.println("Tur =" + rd.r_tur);
        }
        public void dosyaAc(text_dosyasi td)
        {
            System.out.println("Tur : " + td.t_tur);
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MethodOverloadingOrn deneme = new MethodOverloadingOrn();
        muzik_dosyasi md = new muzik_dosyasi();
        resim_dosyasi rd = new resim_dosyasi();
        text_dosyasi td = new text_dosyasi();
        
        deneme.dosyaAc(md);
        deneme.dosyaAc(rd);
        deneme.dosyaAc(td);
       
    }
    
}

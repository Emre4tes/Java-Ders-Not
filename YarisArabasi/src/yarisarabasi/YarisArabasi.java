/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yarisarabasi;

/**
 *
 * @author admin
 */
class motor
{
    public void calis()
    {
        System.out.println("motor calisiyor");
    }
    public void dur()
    {
        System.out.println("motor durdu");
    }
}
public class YarisArabasi {
    
    public void hizYap()
    {
        System.out.println("Yaris Arabasi Hiz Yapıyor");
    }
    
    public class superMotor extends motor
    {
       public void calis()
       {
           System.out.println("Super motor calisti");
       }
       public void dur()
       {
           System.out.println("SuperMotor durdu");
       }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

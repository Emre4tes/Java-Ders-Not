/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ev;

/**
 *
 * @author admin
 */
final class TV
{
    public void kanalBul(){  }
}
/*class SmartTV extends TV
{
    
}*/
public class Ev {
    int oda_sayisi = 5;
    TV tv = new TV();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ev e = new Ev();
        e.tv.kanalBul();
    }
    
}

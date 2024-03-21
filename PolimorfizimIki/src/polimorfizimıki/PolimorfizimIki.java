/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfizimıki;

/**
 *
 * @author admin
 */
class Hayvan
{
    public void avYakala()
    {
        System.out.println("Hayvan avYakala metodu.");
    }
}
class Timsah extends Hayvan
{
    @Override
    public void avYakala()
    {
        System.out.println("Timsah avYakala metodu");
    }
}
class Aslan extends Hayvan
{
     public void avYakala()
    {
        System.out.println("Aslan avYakala metodu");
    }
}
public class PolimorfizimIki {

    public static Hayvan rastgeleSec()
    {
        int sec  = ((int)(Math.random()*3));
        Hayvan h = null;
        
        if(sec == 0) h = new Hayvan();
        if(sec == 1) h = new Timsah();
        if(sec == 2) h = new Aslan();
        
        return h;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hayvan [] h = new Hayvan[3];
        
        for (int i = 0; i < 3; i++) {
            h[i] = rastgeleSec();       // upcasting
            
        }
        
        for (int j = 0; j < 3; j++) {
            h[j].avYakala();
            
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ısyerinonpol;

/**
 *
 * @author admin
 */
class Calisan
{
    public String pozisyon ="Calisan";
    public void calis()
    {
        
    }
}
class Mudur 
{
    public String pozisyon ="Mudur";
    public Mudur()
    {
        pozisyon = "Mudur";
    }
   public void calis(){
       System.out.println("Mudur Calisiyor");
   }
}

class Programci
{
    public String pozisyon ="Programci";
    public Programci()
    {
        pozisyon = "Programci";
    }
   public void calis(){
       System.out.println("Programci Calisiyor");
   }
}
class Pazarlamaci
{
    public String pozisyon ="Programci";
    public Pazarlamaci()
    {
        pozisyon = "Pazarlamaci";
    }
   public void calis(){
       System.out.println("Pazarlamaci Calisiyor");
   }
}

public class IsYeriNonPol {
    
    public static void mesaiBasla(Object[] o)
    {
        for (int i = 0; i < o.length; i++) {
            if(o[i] instanceof Calisan)
            {
                Calisan c = (Calisan) o[i]; //Asagi cevrim
                c.calis();
            }
            else if (o[i] instanceof Mudur)
            {
                Mudur m = (Mudur) o[i];
                m.calis();
            }
            else if (o[i] instanceof Programci)
            {
                Programci p = (Programci) o[i];
                p.calis();
            }
            else if (o[i] instanceof Pazarlamaci)
            {
                Pazarlamaci pz = (Pazarlamaci) o[i];
                pz.calis();
            }
            
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object [] o = new Object[4];
        o[0] = new Calisan();
        o[1] = new Mudur();
        o[2] = new Programci();
        o[3] = new Pazarlamaci();
        mesaiBasla(o);
    }
    
}

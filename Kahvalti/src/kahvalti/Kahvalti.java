             /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kahvalti;

/**
 *
 * @author admin
 */
class Peynir 
{
    public Peynir(int i, String tur)
    {
        System.out.println("Peynir (" +i+ "+) -->" + tur);
            }
}
class Tabak
{
    public Tabak(int i, String tur)
    {
        System.out.println("Tabak (" + i+ ") -->" + tur);
    }
    static Peynir p1 = new Peynir(1,"Statik Alan");
    Peynir p2 = new Peynir(2,"Statik olmayan Alan");
}
class Catal
{
    public Catal(int i, String tur)
    {
        System.out.println("Catal (" +i+") -->" +tur);
    }
}

public class Kahvalti {
  static Catal c1 = new Catal(1,"Statik Alan");
  
  public Kahvalti()
  {
      System.out.println("Kahvalti Yapilandiricisi");
  }
  
  Tabak t1 = new Tabak(1,"Statik Olmayan Alan"); 
  
  public void islemTamam()
  {
      System.out.println("islem Tamam");
  }
  static Catal c2 = new Catal(2,"Statik Alan");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here,
        Kahvalti k = new Kahvalti();
        k.islemTamam();
    }
    static Tabak t4 = new Tabak(4,"Statik Alan");
    static Tabak t5 = new Tabak(5,"Statik Alan");
    
}

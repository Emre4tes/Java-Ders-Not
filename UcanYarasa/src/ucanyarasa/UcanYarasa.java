/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucanyarasa;

/**
 *
 * @author admin
 */
class Hayvan
{
    public Hayvan()
    {
        System.out.println("Hayvan Yapilandiricisi");
    }
}
class Yarasa extends Hayvan
{
    public Yarasa()
    {
        System.out.println("Yarasa Yapilandiricisi");
    }
}
public class UcanYarasa extends Yarasa {
    public UcanYarasa()
    {
        System.out.println("Ucan Yarasa Yapilandiricisi");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UcanYarasa uy = new UcanYarasa();
    }
    
}

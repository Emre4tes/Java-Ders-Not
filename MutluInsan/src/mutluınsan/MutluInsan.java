/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutluınsan;

/**
 *
 * @author admin
 */
public class MutluInsan {
    private String ruh_hali ="Mutluyum";
    
    public void ruh_halini_yansit()
    {
        System.out.println("Ben " + ruh_hali);
    }
    public void tokatAt()
    {
        if(ruh_hali.equals("Mutluyum"))
        {
            ruh_hali = "Sinirlendim";
        }
    }
    public void kucakla()
    {
        if(ruh_hali.equals("Sinirlendim"))
        {
            ruh_hali ="Mutluyum";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MutluInsan insan1 = new MutluInsan();
        MutluInsan insan2 = new MutluInsan();
         
         insan1.ruh_halini_yansit();
         insan2.ruh_halini_yansit();
         
         insan1.tokatAt();
         insan2.kucakla();
         
         insan1.ruh_halini_yansit();
         insan2.ruh_halini_yansit();
         
        
    }
    
}

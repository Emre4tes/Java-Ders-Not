/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voltran;

/**
 *
 * @author admin
 */
class Govde 
{
    void benzinTankınıDoldur()
    {  
    }
}
class SagBacak
{
    void kirmiziLazeriAtesle()
    {   }
}
class SolBacak
{
    void maviLazeriAtesle(){}
}
class SolKol
{
    void gucKaynagınıKontrolEt(){}
    
}
class SagKol
{
    void KalkaniCalistir(){}
}
class Kafa
{
    void tümBirimlereuyariGonder(){}
    void düsmanTanımlamaSistemiDevreyeSok(){}
}
public class Voltran {
        Govde gv = new Govde();
        SolBacak sb = new SolBacak();
        SagBacak sgb = new SagBacak();
        SolKol slk = new SolKol();
        SagKol sgk = new SagKol();
        Kafa kf = new Kafa();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Voltran vr = new Voltran();
        vr.kf.düsmanTanımlamaSistemiDevreyeSok();
        vr.sb.maviLazeriAtesle();
        vr.slk.gucKaynagınıKontrolEt();
        vr.sgk.KalkaniCalistir();
        
        
        
    }
    
}

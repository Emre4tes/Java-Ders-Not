/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cizimprogrami;

/**
 *
 * @author admin
 */
abstract class cizim 
{
    public abstract void noktaCiz(int x, int y);
    
    public void cizgiCiz(int x1,int y1, int x2, int y2)
    {
       // noktaCiz(x,y);
    }
}
class CepTelCizim extends cizim
{

    @Override
    public void noktaCiz(int x, int y) {
        System.out.println("cep tel nokta çiz.");
    }
   
}
class MonitorCizim extends cizim
{

    @Override
    public void noktaCiz(int x, int y) {
        System.out.println("Monitor nokta çiz.");
    }
    
}
public class CizimProgrami {

    public void baslat(int x1, int y1, int x2, int y2)
    {
        cizim c1 = new CepTelCizim();
        cizim c2 = new MonitorCizim();
        c1.cizgiCiz(x1, y1, x2, y2);
        c2.cizgiCiz(x1, y1, x2, y2);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

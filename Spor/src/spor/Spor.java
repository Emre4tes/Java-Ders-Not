/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spor;

/**
 *
 * @author admin
 */
abstract class Sporcu 
{
    public abstract void calis();
    
    public Sporcu()
    {
        System.out.println("Calis cagrilmadan önce");
        calis();
        System.out.println("Calis cagrildiktan sonra");
        
    }
            
}

class Futbolcu extends Sporcu
{
    int antreman_sayisi = 4;
    @Override
    public void calis() 
    {
        System.out.println("Futbolcu Calisti : " + antreman_sayisi);
    }
    public Futbolcu()
    {
        System.out.println("Futbolcu Constructer ");
        calis();
    }
    
}
public class Spor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Futbolcu f = new Futbolcu();
        //Sporcu s = new Sporcu();
        
    }
    
}

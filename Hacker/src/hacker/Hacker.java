/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacker;

/**
 *
 * @author admin
 */
class İnsan
{
    public İnsan(int par)
    {
        System.out.println("İnsan Yapilandiricisi : " + par);
    }
}
class Zekiİnsan extends İnsan
{
    public Zekiİnsan(int par)
    {
        super(par);   //Dikkat
        System.out.println("Zeki İnsan Yapilandiricisi : " + par);
    }
}
public class Hacker extends Zekiİnsan {
    
    public Hacker(int par)
    {
        
        super(par);
        System.out.println("Hacker Yapilandiricisi " + par);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hacker hck = new Hacker(5);
    }
    
}

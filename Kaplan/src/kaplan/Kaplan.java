/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaplan;

/**
 *
 * @author admin
 */
class Kedi
{
    protected int ayak_sayisi = 4;
    public void yakalaAv()
    {
        System.out.println("Kedi av yakaladı");
    }
    public static void main(String args[])
    {
        Kedi kd = new Kedi();
        kd.yakalaAv();
    }
}

class a extends Kedi {

    public void yakalaAv() {
        super.yakalaAv();
    }
}
public class Kaplan extends Kedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karisik;

/**
 *
 * @author admin
 */
interface Hayvan
{
    public void avlan();
    public void takipet();
}

class Aslan implements Hayvan
{
    public void takipet()
    {
        System.out.println("Aslan Takip Ediyor");
    }
    public void avlan()
    {
        System.out.println("Aslan Avlanıyor...");
    }
}
public class Karisik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

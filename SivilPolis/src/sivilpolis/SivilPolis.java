/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sivilpolis;

/**
 *
 * @author admin
 */
class Polis
{
    private final void sucluYakala() //Erişilemez Metod
    {
        System.out.println("Polis Suclu Yakaladı");
    }
}
public class SivilPolis extends Polis{
    public void sucluYakala()
    {
        System.out.println("Sivil Polis Suclu Yakaladı");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

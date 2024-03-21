/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yapilandiricibasitornekbir;

/**
 *
 * @author admin
 */
class KahveFincani
{
    public KahveFincani(int adet)
    {
        System.out.println(adet + "kahveFincaci...");
    }
}
public class YapilandiriciBasitOrnekBir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 5; i++) {
            new KahveFincani(i);
            
        }
    }
    
}

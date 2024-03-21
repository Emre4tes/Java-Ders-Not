/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaguar;

/**
 *
 * @author admin
 */
interface Kosabilme
{
    public void kos();
}
interface dahahizlikosabilme extends Kosabilme
{
    public void dahahizlikos();
}
interface avlanabilme extends dahahizlikosabilme
{
    public void avlan();
}
class RoadRunner implements dahahizlikosabilme
{
    public void dahahizlikos()
    {
        System.out.println("RoadRunner hızlı kosuyor");
    }
    public void kos()
    {
        System.out.println("RoadRunner Kosuyor");
    }
}


public class Jaguar implements avlanabilme{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void avlan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public  void dahahizlikos()
    {
        
    }
    public void kos()
    {
        
    }
    
}

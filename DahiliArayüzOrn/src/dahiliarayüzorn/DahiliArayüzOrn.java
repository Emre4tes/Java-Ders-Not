/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dahiliarayüzorn;

/**
 *
 * @author admin
 */
interface ArayuzA 
{
    public interface DahiliArayüz1 
    {
        public void isyap();
    }
    interface dahiliArayüz2
    {
        public void isyap2();
    }
}
class Erisim implements ArayuzA.DahiliArayüz1, ArayuzA.dahiliArayüz2
{

    @Override
    public void isyap() {
        System.out.println("Dahili Arayüz 1 isyap metodu"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isyap2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
public class DahiliArayüzOrn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

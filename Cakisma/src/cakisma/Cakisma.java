/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakisma;

/**
 *
 * @author admin
 */
interface A1
{
    public void hesapla();
}
interface A2
{
    public void hesapla(int a);
}
interface A3
{
    public int hesapla();
}
class S1 implements A1,A2
{

    @Override
    public void hesapla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hesapla(int a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
class S2 implements A1,A3
{

    @Override
    public void hesapla() {
        System.out.println("S2.hesapla");
    }
    public int hesapla()
    {
        System.out.println("ssss");
        return 123;
    }
    
}
public class Cakisma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

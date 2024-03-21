/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nesnelerdeatama;

/**
 *
 * @author admin
 */
class Sayi
{
    int i;
}
public class NesnelerdeAtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sayi s1 = new Sayi();
        Sayi s2 = new Sayi();
        
        s1.i = 9;
        s2.i = 46;
        
        System.out.println("1 : s1.i : " + s1.i + " , s2.i : " + s2.i);
        s1 = s2;
        System.out.println("2 : s1.i : " + s1.i + " , s2.i : " + s2.i);
        s1.i = 2;
        System.out.println("3 : s1.i : " + s1.i + " , s2.i : " + s2.i);
    }
    
}

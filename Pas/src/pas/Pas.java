/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pas;

/**
 *
 * @author admin
 */
class Harf
{
    char c;
}
public class Pas {
    static void f(Harf h)
    {
        h.c = 'e';
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Harf x = new Harf();
        x.c = 'a';
        System.out.println("1 : x.c : " + x.c);
        f(x);
        
        System.out.println("2 : x.c : " + x.c);
    }
    
}

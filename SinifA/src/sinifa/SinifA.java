/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinifa;

/**
 *
 * @author admin
 */
public class SinifA {
    
    public interface A1
    {
        public void ekranaBas();
    }
    
    public class DahiliSinif implements A1
    {
        public void ekranaBas()
        {
            System.out.println("DahiliSinif.ekranaBas");
        }
    }
      public class DahiliSinif1 implements A1
    {
        public void ekranaBas()
        {
            System.out.println("DahiliSinif1.ekranaBas");
        }
    }
        public class DahiliSinif2 implements A1
    {
        public void ekranaBas()
        {
            System.out.println("DahiliSinif2.ekranaBas");
        }
    }
          public class DahiliSinif3 implements A1
    {
        public void ekranaBas()
        {
            System.out.println("DahiliSinif3.ekranaBas");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinifA.DahiliSinif sa = new SinifA().new DahiliSinif();
        SinifA.DahiliSinif1 sa1 = new SinifA().new DahiliSinif1();
        SinifA.DahiliSinif2 sa2 = new SinifA().new DahiliSinif2();
        SinifA.DahiliSinif3 sa3 = new SinifA().new DahiliSinif3();
        
        sa.ekranaBas();
        sa1.ekranaBas();
        sa2.ekranaBas();
        sa3.ekranaBas();
        
        SinifB sb = new SinifB();
        sb.ekranaBas();
        
    }
    
}

class SinifB implements SinifA.A1
{
    public void ekranaBas()
    {
        System.out.println("SinifB.ekranaBas");
    }
}

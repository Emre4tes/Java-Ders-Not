/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kestirme;

/**
 *
 * @author admin
 */
public class Kestirme {
    public static boolean HesaplaBir(int a)
    {
        System.out.println("hesaplabir metoduna girildi");
        return a > 1;
    }
     public static boolean HesaplaIki(int a)
    {
        System.out.println("hesaplaIki metoduna girildi");
        return a > 2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("---Baslangic---");
        HesaplaBir(0); /*false deger*/
        HesaplaIki(3); /*true deger*/
        
        System.out.println("HesaplaBir(0) && HesaplaIki(3)");
        if( HesaplaBir(0) && HesaplaIki(3))
        {
            System.out.println("1 -true");
        }else
        {
            System.out.println("1-false");
        }
        
          System.out.println("HesaplaBir(0) || HesaplaIki(3)");
        if( HesaplaBir(0) || HesaplaIki(3))
        {
            System.out.println("2 -true");
        }else
        {
            System.out.println("2-false");
        }
          System.out.println("HesaplaBir(0) & HesaplaIki(3)");
        if( HesaplaBir(0) & HesaplaIki(3))
        {
            System.out.println("3-true");
        }else
        {
            System.out.println("3-false");
        }
        System.out.println("HesaplaBir(0) | HesaplaIki(3)");
        if( HesaplaBir(0) | HesaplaIki(3))
        {
            System.out.println("4 -true");
        }else
        {
            System.out.println("4-false");
        }
         System.out.println("HesaplaBir(0) ^ HesaplaIki(3)");
        if( HesaplaBir(0) ^ HesaplaIki(3))
        {
            System.out.println("5-true");
        }else
        {
            System.out.println("5-false");
        }
    }
    }
    
    


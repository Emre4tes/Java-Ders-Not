/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceptelefonu;

/**
 *
 * @author admin
 */
class Telefon
{
    protected void aramaYap()
    {
        System.out.println("Telefon Arama Yapıyor");
    }
}
public class CepTelefonu extends Telefon {
    private void aramaYap()
    {
        System.out.println("CepTelefonu Arama Yapıyor");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

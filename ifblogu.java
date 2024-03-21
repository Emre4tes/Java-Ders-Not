import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ifblogu {
    public static void main(String[]args){
        /*
        Karşılaştırma oparetörleri
        a==b---> eşit mi(eşitse true değilse false)
        a!=b---> eşit değil mi(eşit değilse true eşitse false)
        a>b---> b den büyük mü(büyükse true değilse false)
        a<b---> a dan küçük mü(küçükse true değilse false)
        a>=b--->a b ye büyük eşit mi(öyleyse true değilse false)
        a<=b--->a b den küçük eşit mi(öyleyse true değilse false)

          if (kosul){
            if bloglu
            Burada koşul sağlayınca isimler yapılıyor...
        }
        */

        //System.out.println("Sonuç "+(4<=4));

        Scanner scan =new Scanner(System.in);

        System.out.println("Notunuzu Girin:");

        int note =scan.nextInt();
        if(note>70) {
            System.out.println("Notunuz ortalama üstünde");
        }
        else {
            System.out.println("Notunuz ortalama altında");
        }

    }
}

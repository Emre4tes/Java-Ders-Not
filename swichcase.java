import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class swichcase {


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int bakiye=1000;
        int islem;

        System.out.println("1: Bakiye Görüntüle");
        System.out.println("2: Para Yatırma");
        System.out.println("3: Para Çekme");
        System.out.println("4: Sistemden Çıkış");

        islem =scan.nextInt();

        switch(islem){

            case 1:
                System.out.println("Bakiye"+bakiye+"tl dir");
                break;
            case 2:
                System.out.println("Ne kadar yatırıcaksınız:");
                int miktar =scan.nextInt();

                bakiye +=bakiye;
                System.out.println("Bakiyeniz"+bakiye+"tl dir");
                break;
            case 3:
                System.out.println("Ne kadar cekeceksiniz:");
                miktar =scan.nextInt();

                bakiye -=bakiye;
                System.out.println("Bakiyeniz"+bakiye+"tl dir");
                break;
            case 4:
                System.out.println("Sistemden Çıkılıyor...");
                break;
            default:
                System.out.println("Geçersiz İşlem");
                break;
        }

    }
}

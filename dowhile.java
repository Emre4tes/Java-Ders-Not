import java.util.Scanner;

public class dowhile {
    public static void main(String []args){
     Scanner scan =new Scanner(System.in);

     int sayi =scan.nextInt();
     int toplam =0;


     do{
         //1234
         toplam += sayi%10;
         sayi =sayi /10;

         System.out.println("Toplam "+ toplam+ " sayi = "+ sayi);


     }
     while( sayi >0);
        System.out.println("Toplam = "+ toplam);

    }
}

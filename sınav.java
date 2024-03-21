import java.util.Scanner;

public class sınav {
    public static void main(String[]arg){

        Scanner scan =new Scanner(System.in);
        System.out.println("Bir Yazı Giriniz:");
        System.out.println("Bir sayı Giriniz:");

        String b= scan.nextLine();
        int a = scan.nextInt();
        System.out.println("a değişkenin değeri" + a );
        System.out.println("b değişken değeri " + b);

    }


}

//Java Değişken Tipleri
/*
 * byte --> sayı , 1 byte
 * short --> sayı , 2 byte
 * int --> sayı , 4 byte
 * long --> sayı , 8 byte
 * float --> ondalık sayı , 4 byte
 * double ---> ondalık sayı ,8 byte
 * char ---> karakter , 2 byte
 * boolean --> true ya da false , 1 byte
 *
 */

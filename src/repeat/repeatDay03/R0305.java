package repeat.repeatDay03;

import java.util.Scanner;

public class R0305 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip bu sayilarin carpimini yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 1.sayiyi giriniz");
        double sayi1 = scan.nextDouble();

        System.out.println("lütfen 2.sayiyi giriniz");
        double sayi2 = scan.nextDouble();

        System.out.println("Girdiginiz 2 sayinin carpimi:" + sayi1 * sayi2);

    }
}

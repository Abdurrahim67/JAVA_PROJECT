package repeat.repeatDay08;

import java.util.Scanner;

public class H0802 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("sayi1+sayi2: " + (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("sayi1*sayi2: " + (sayi1 * sayi2));
        } else if (sayi1 == 0 || sayi2 == 0) {
            System.out.println("sifir carpmaya göre yuten elemandir");
        } else {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }


    }
}

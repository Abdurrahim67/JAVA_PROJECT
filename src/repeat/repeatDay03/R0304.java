package repeat.repeatDay03;

import java.util.Scanner;

public class R0304 {

    public static void main(String[] args) {
        // kullanicidan ismini isteyin
        // girilen ismi
        // isminiz: Ismail seklinde yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");

        String kullaniciIsmi = scan.next();

        System.out.println("Isminiz: " + kullaniciIsmi);


    }
}

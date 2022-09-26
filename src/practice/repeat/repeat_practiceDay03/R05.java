package practice.repeat.repeat_practiceDay03;

import java.util.Scanner;

public class R05 {
    public static void main(String[] args) {


        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen isminizi ve soyisminizi giriniz");
        String isim = scan.nextLine();
        String soyIsim = scan.nextLine();

        if (isim.length() > soyIsim.length()) {
            System.out.println("isminiz soyisminizden daha uzundur");

        } else if (soyIsim.length() > isim.length()) {
            System.out.println("soyisminiz isminizden daha uzundur");

        } else {
            System.out.println("isminiz ile soyisminiz birbirine esittir");
        }


    }
}


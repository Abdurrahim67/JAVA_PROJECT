package practice.practice_Day03;

import java.util.Scanner;

public class Q05_StringMnaipulation {

    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz: \nisim");
        String isim=scan.next();
        System.out.println("soyisim");
        String soyisim=scan.next();


        if(isim.length()>soyisim.length()){
            System.out.println("isminiz soyisiminizden uzundur");

        } else if (isim.length()==soyisim.length()) {
            System.out.println("isminiz soyisminiz ile esit uzunlukta");

        }else System.out.println("soyisminiz isminizden uzun");


    }
}

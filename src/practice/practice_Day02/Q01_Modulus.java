package practice.practice_Day02;

import java.util.Scanner;

public class Q01_Modulus {

    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi giriniz ");//12345
        int num = scan.nextInt();

        int ilkIki = num / 1000;//12
        int sonIki = num % 100; //45

        int ilkIkiTop = (ilkIki / 10) + (ilkIki % 10);
        int sonIkiTop = (sonIki / 10) + (sonIki % 10);

        System.out.println("sayilarin toplami= " + (ilkIkiTop + sonIkiTop));


    }
}

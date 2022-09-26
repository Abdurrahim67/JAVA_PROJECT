package practice.practice_Day06;

import java.util.Scanner;

public class Q02_WhileLoop {
    public static void main(String[] args) {
         /*
         Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil(tek ise)
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = sayi; i > 0; i--) {

            if (i % 2 == 1) {
                System.out.print(i + " ");

            }


        }


    }
}

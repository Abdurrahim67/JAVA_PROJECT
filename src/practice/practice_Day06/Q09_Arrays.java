package practice.practice_Day06;

import java.util.Arrays;
import java.util.Scanner;

public class Q09_Arrays {

    public static void main(String[] args) {

         /*
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */

        Scanner scan = new Scanner(System.in);
        int[] sayilar = new int[8];
        int sayac = 0;

        for (int i = 0; i < sayilar.length; i++) {

            System.out.println(i + ". indexindeki sayiyi giriniz");
            sayilar[i] = scan.nextInt();

            if (sayilar[i] % 3 == 0) {
                sayac++;

            }


        }
        System.out.println(Arrays.toString(sayilar));
        System.out.println("3 e bölünebilen sayilarin adedi: " + sayac);


    }
}

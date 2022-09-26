package practice.practice_Day06;

import java.util.Scanner;

public class Q01_FoorLoop {

    public static void main(String[] args) {
        // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int toplam=0;

        while (sayi>0) {

            toplam+=sayi%10;
            sayi=sayi/10;


        }
        System.out.println(toplam);



    }
}

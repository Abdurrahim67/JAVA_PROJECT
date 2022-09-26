package practice.practice_Day01;

import java.util.Scanner;

public class Q10_IfStatement01 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen Y/N ikilisidnen birini giriniz");
        char karakter = scan.next().charAt(0);

        if (karakter == 'Y' || karakter == 'y') {

            System.out.println("YES");
        } else if (karakter == 'N' || karakter == 'n') {

            System.out.println("NO");

        } else {
            System.out.println("yanlis giriniz yaptiniz, tekrar deneyiniz");


        }
    }
}
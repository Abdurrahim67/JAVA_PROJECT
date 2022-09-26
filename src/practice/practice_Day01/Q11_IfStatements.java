package practice.practice_Day01;

import java.util.Scanner;

public class Q11_IfStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen puaninizi giriniz");
        double puan = scan.nextDouble();

        if (puan < 0 || puan > 100) {
            System.out.println("LÜtfen gecerli bir puan giriniz");

        } else if (puan >= 90) {
            System.out.println("A");

        } else if (puan >= 80) {
            System.out.println("B");
        } else if (puan >= 70) {
            System.out.println("C");

        } else if (puan >= 60) {
            System.out.println("D");


        } else {
            System.out.println("F");
        }


    }


}

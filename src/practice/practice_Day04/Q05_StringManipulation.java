package practice.practice_Day04;

import java.util.Scanner;

public class Q05_StringManipulation {

    public static void main(String[] args) {

        // Kullanicidan ismini ve soyismini girmesni isteyin, sonrasinda konsola tam ismini büyük harfler ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz:");
        String firstName = scan.nextLine(), lastName = scan.nextLine();

        String fullName = firstName.concat(" " + lastName).toUpperCase();

        System.out.println("fullName= " + fullName);




    }
}

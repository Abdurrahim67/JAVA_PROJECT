package day07_ifStatements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
         /*
        Kullanicidan bir karakter girmesini isteyin
        ve girilen karakterin harf olup olmadigini yazdirin
           */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char harf = scan.next().charAt(0);

        if ((harf >= 'a' && harf <= 'z') || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girdiginiz karakter bir harf");
        } else {
            System.out.println("Girdiginiz karakter bir harf degildir");
        }


    }
}

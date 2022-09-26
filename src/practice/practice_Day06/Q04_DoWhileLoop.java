package practice.practice_Day06;

import java.util.Scanner;

public class Q04_DoWhileLoop {

    public static void main(String[] args) {

         /*
    Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
    ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    */
        Scanner scan = new Scanner(System.in);
        String karakter = "";
        do {
            System.out.println("Bir karakter giriniz");
            karakter = scan.next();
            System.out.println("Program calisiyor");


        } while (!karakter.equalsIgnoreCase("x"));
        System.out.println("Program bitti");


    }
}

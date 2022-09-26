package repeat.repeatDay07;

import java.util.Scanner;

public class Q0702 {
    public static void main(String[] args) {

        /*Soru 2) Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup
        olmadigini yazdirin*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");

        char karakter = scan.next().charAt(0);

        if ((karakter >= 'a' && karakter <= 'z') || (karakter >= 'A' && karakter <= 'Z')) {
            System.out.println("Girdiginiz karakter bir harftir");

        } else {
            System.out.println("girdiginiz karakter harf degildir");
        }


    }
}

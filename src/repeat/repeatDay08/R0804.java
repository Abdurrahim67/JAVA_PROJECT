package repeat.repeatDay08;

import java.util.Scanner;

public class R0804 {
    public static void main(String[] args) {

  /*
        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e     bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi < 1000 || sayi > 9999) {
            System.out.println("Lütfen  4 basamakli bir sayi giriniz");
        } else if (sayi % 5 == 0) {
            if (sayi % 10 == 0) {
                System.out.println("5'e bölünen cift sayi");
            } else {
                System.out.println("5'e bölünen tek sayi");
            }

        } else {
            System.out.println("Tekrar deneyin");
        }


    }
}

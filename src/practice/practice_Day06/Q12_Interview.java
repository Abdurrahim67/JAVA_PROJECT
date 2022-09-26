package practice.practice_Day06;

import java.util.Scanner;

public class Q12_Interview {
    public static void main(String[] args) {

        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen bir kelime giriniz");
        String kelime = scan.next();
        System.out.println("LÜtfen bir sayi giriniz");
        int sayi = scan.nextInt();

        tekrarYazdirma(kelime, sayi);
        System.out.println( tekrarYazdirma(kelime, sayi));

    }
    public static String tekrarYazdirma(String kelime, int sayi) {
        kelime = kelime.substring(0, 1) + kelime.substring(kelime.length() - 1);
        String sonuc="";

        for (int i = 0; i < sayi; i++) {

            sonuc+=kelime;
        }

        return sonuc;
    }
}
package repeat.repeatDay16;

import java.util.Scanner;

public class R160501 {

    public static void main(String[] args) {

        //  Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //  sonucu yazdiran bir method yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen iki pozitíf tamsayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        sayilariToplaYazdir(sayi1, sayi2);

    }

    public static void sayilariToplaYazdir(int sayi1, int sayi2) {
        int toplam = 0;

        if (sayi1 <= sayi2) {

            for (int i = sayi1; i <= sayi2; i++) {

                toplam += i;


            }
        } else {
            for (int i = sayi2; i <= sayi1; i++) {

                toplam += i;

            }
        }

        System.out.println("Iki sayinin arasindaki sayilarin toplami :" + toplam);
    }
}

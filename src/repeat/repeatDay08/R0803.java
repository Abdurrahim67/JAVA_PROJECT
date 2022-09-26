package repeat.repeatDay08;

import java.util.Scanner;

public class R0803 {

    public static void main(String[] args) {

        /*  emeklilik kontrolu yapan bir program yaziniz
        cinsiyet olarak E (ERKEK) veya K (KADIN) degiskenlerini kabul etsin
        farkli bir harf veya sembol girilirse hata mesajı versin

        emeklilik icin kadinlarda yas siniri 60
        erkeklerde 65 olsun
        negatif yas veya 80'den buyuk yas girilirse hata mesaji versin

         */


        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen cinsiyetinizi yaziniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Lütfen gecerli bir yas giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Lütfen gecerli bir yas giriniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else {
            System.out.println("LÜtfen gecerli bir tercih giriniz");
        }


    }
}

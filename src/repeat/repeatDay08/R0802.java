package repeat.repeatDay08;

import java.util.Scanner;

public class R0802 {
    public static void main(String[] args) {

        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // 50 ye esit veya buyuk -60 dan kucukse “C”,
        // 60'a esit veya buyuk-80 'den kucuk “B”,
        // 80'e esit  veya  uzerinde ise “A”
        // gecersiz not girildiginde uyari verelim


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not giriniz");
        double not = scan.nextDouble();

        if (not < 0 || not > 100) {
            System.out.println("LÜtfen gecerli bir not giriniz");
        } else if (not < 50) {
            System.out.println("Notunuz: D");
        } else if (not < 60) {
            System.out.println("Notunuz: C");
        } else if (not < 80) {
            System.out.println("Notunuz: B");
        } else {
            System.out.println("Notunuz A");
        }


    }
}

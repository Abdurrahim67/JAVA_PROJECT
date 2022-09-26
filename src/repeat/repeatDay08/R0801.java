package repeat.repeatDay08;

import java.util.Scanner;

public class R0801 {
    public static void main(String[] args) {

        // Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        // Girilen isim gecerli bir gun ise gun isminin 1.,2. ve 3.harflerini
        // ilk harf buyuk diger ikisi kucuk olarak yazdirin,
        // gun ismi gecerli degilse “Gecerli gun ismi giriniz” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gün = scan.next().toLowerCase();

        if (gün.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gün.equals("sali")) {
            System.out.println("Sal");
        } else if (gün.equals("Carsamba")) {
            System.out.println("Car");
        } else if (gün.equals("Persembe")) {
            System.out.println("Per");
        } else if (gün.equals("cuma")) {
            System.out.println("Cum");
        } else if (gün.equals("cumartesi")) {
            System.out.println("Cum");
        } else if (gün.equals("pazar")) {
            System.out.println("Paz");
        } else {
            System.out.println("Lütfen gecerli bir gün giriniz");
        }


    }
}

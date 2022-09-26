package practice.practice_Day06;

import java.util.Scanner;

public class Q11_Arrays {

    public static void main(String[] args) {

        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        String pin = "omer.1234";
        Scanner scan = new Scanner(System.in);

        int sayac = 3;

        while (true) {

            System.out.println("LÜtfen pininizi giriniz");
            String girilenPin = scan.nextLine();

            if (girilenPin.equals(pin)) {
                System.out.println("Giris basarili");
                break;


            } else {

                System.out.println("Yanlis pin girdiniz ");
                sayac--;
                System.out.println("kalan giris hakkiniz: " + sayac);

            }
            if (sayac == 0) {
                System.out.println(" 3 kere yanlis girisi yaptiniz ..Pininiz bloke oldu");
                break;

            }

        }


    }

}

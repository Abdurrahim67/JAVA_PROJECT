package repeat.repeatDay16;

import java.util.Scanner;

public class R1605 {

    public static void main(String[] args) {

        //  Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        //  sonucu yazdiran bir method yaziniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        girilenNumlariTopla(num1, num2);


    }

    public static void girilenNumlariTopla(int num1, int num2) {

        int toplam = 0;

        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {

                toplam += i;

            } System.out.println("toplam :" + toplam);


        } else if (num1>num2) {
            for (int i = num2; i <= num1; i++) {

                toplam += i;

            }
            System.out.println("Toplam :" + toplam);

        } else {
            System.out.println("Lütfen gecerli 2 sayi giriniz ");

        }

    }
}
package day07_ifStatements;

import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {

        /* Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin

           örnek:
                  gun=Pazar output = “Hafta sonu”
                  gun=Sali output = “Hafta ici”

                   *** String icin equals method’unu kullanin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir gün ismi giriniz");
        String gün = scan.next().toLowerCase();

        if (gün.equals("pazartesi") || gün.equals("sali") || gün.equals("carsamba") || gün.equals("persembe") ||
                gün.equals("cuma")) {
            System.out.println("Girdiginiz gün haftaici");
        }
        if (gün.equals("cumartesi") || gün.equals("pazar")) {
            System.out.println("Girdiginiz gün haftasonu");
        }
        if (!(gün.equals("pazartesi") || gün.equals("sali") || gün.equals("carsamba") || gün.equals("persembe") ||
                gün.equals("cuma") || gün.equals("cumartesi") || gün.equals("pazar"))) {

            System.out.println("LÜtfen gecerli bir gün ismi giriniz");
        }


    }
}

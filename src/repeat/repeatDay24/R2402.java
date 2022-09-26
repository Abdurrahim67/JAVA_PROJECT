package repeat.repeatDay24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class R2402 {

    public static void main(String[] args) {
         /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */


        Random rnd = new Random();
        int sayi = 0;
        List<Integer> sayilar = new ArrayList<>();

        while (sayilar.size() < 200) {
            sayi = rnd.nextInt(1000);
            if (!sayilar.contains(sayi)) {
                sayilar.add(sayi);

            }

        }
        System.out.println(sayilar);

        Scanner scan = new Scanner(System.in);
        int sayac = 1;
        while (true) {
            System.out.println("lÜtfen bir sayi giriniz");
            int num = scan.nextInt();

            if (sayilar.contains(num)) {
                System.out.println("Tebrikler " + sayac + " adet tahminde listeden bir sayi buldunuz");
                break;

            } else {
                System.out.println(sayac + " adet sayi soylediniz ama hic biri listede yok");

            }
            sayac++;
        }


    }
}

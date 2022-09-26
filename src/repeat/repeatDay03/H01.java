package repeat.repeatDay03;

import java.util.Scanner;

public class H01 {

    public static void main(String[] args) {

        //Kullanicidan iki tamsayi alip bu sayilarin toplam, fark, carpimlarini yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen 2 tamsayi giriniz");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        int toplam=sayi1+sayi2;
        int fark=sayi1-sayi2;
        int carpim=sayi1*sayi2;


        System.out.println("Girdiginiz sayilarin toplami= "+toplam);
        System.out.println("Girdiginiz sayilarin farki= "+fark);
        System.out.println("Girdiginiz sayilarin carpimi= "+carpim);














    }
}

package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {
        /* kullanicidan ismini yoyismini ve yasini alip
        girilen bilgiler= seyfi capar 34 seklinde yazdirin

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        /*
         String verileri scanner ile alirken
         next( ) : ilk bosluga kadar olan kismi(1 kelime) slir
         nextLine() :satirin sonuna kadar ne yazarsak alir
         NOT : eger ardarda birden fazla String deger alacaksak nextLine() kullanmaliyiz
                 */
        String isim= scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");

        String soyisim=scan.nextLine();
        System.out.println("LÜtfen yasinizi giriniz");
        double yas=scan.nextDouble();
        System.out.println("girilen bilgiler: "+isim+" "+soyisim+" "+yas);

    }
}

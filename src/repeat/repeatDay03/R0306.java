package repeat.repeatDay03;

import java.util.Scanner;

public class R0306 {

    public static void main(String[] args) {
        /* kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler= seyfi capar 34 seklinde yazdirin

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz ");
        String isim=scan.nextLine();

        System.out.println("Lütfen soyisminizi giriniz");
        String soyIsim=scan.nextLine();

        System.out.println("lütfen yasinizi giriniz");
        double yas= scan.nextDouble();

        System.out.println("Girilen bilgiler: "+isim+" "+soyIsim+" "+yas );
        }


    }


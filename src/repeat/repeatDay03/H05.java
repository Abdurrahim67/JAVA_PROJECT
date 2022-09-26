package repeat.repeatDay03;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {

        /*Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin

        isminiz: Mehmet
        Soyisminiz:Bulut
        Kursumuza katiliminiz alinmistir tesekkur ederiz

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen isminizi ve soyisminizi giriniz");

        String isim=scan.nextLine();
        String soyisim=scan.nextLine();

        System.out.println("isminiz: "+isim +"\nSoyisminiz: "+soyisim+"\nKursumuza katiliminiz alinmistir tesekkür ederiz");
    }
}

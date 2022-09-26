package repeat.repeatDay14;

import java.util.Scanner;

public class R1405 {

    public static void main(String[] args) {

         /*
        Kullanicidan ismini,soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin
        isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
        KK numarasini ise 4 rakamlik 4 blok olacak sekilde duzelten 2 method yazin,ve programda kullanabilmek
        icin duzenlenmis hallerini geri dondurun

          */

        String isim = kullaniciAdi();
        String kartNumarasi = kartNo();

        System.out.println("isim " + isim);
        System.out.println("kartNo " + kartNumarasi);

    }

    public static String kullaniciAdi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz");
        String isim = scan.nextLine();
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();

        System.out.println("LÜtfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();

        return (isim + " " + soyisim);


    }

    public static String kartNo() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kredi karti numaranizi giriniz");
        String kartNumarasi = scan.nextLine();
        kartNumarasi = kartNumarasi.substring(0, 4) + " " + kartNumarasi.substring(4, 8) + " " +
                kartNumarasi.substring(8, 12) + " " + kartNumarasi.substring(12, 16);


        return (kartNumarasi);


    }


}

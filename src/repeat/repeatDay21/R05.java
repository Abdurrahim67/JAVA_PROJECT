package repeat.repeatDay21;

import java.util.Arrays;
import java.util.Scanner;

public class R05 {

    public static void main(String[] args) {
        // Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] isimlerListesi = {"mualla", "selim", "emine", "abdurrahim"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Eklemek istediginiz ismi giriniz");
        String eklenecekIsim = scan.nextLine();


        String[] sonListe = isimEkle(isimlerListesi, eklenecekIsim);
        System.out.println(Arrays.toString(sonListe));


    }

   public static String[] isimEkle(String[] isimlerListesi, String eklenecekIsim) {

        String[] yeniListe = new String[isimlerListesi.length + 1];


        for (int i = 0; i < isimlerListesi.length; i++) {

            yeniListe[i] = isimlerListesi[i];


        }
        yeniListe[yeniListe.length - 1] = eklenecekIsim;

        return yeniListe;
    }


}


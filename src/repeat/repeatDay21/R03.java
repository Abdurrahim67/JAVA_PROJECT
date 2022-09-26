package repeat.repeatDay21;

import java.util.Scanner;

public class R03 {

    public static void main(String[] args) {

        // Soru 3- Kulanicidan aldiginiz bir ismin,verilen array’de olup olmadigini kontrol edip,
        // bize true veya false sonucu donen bir method olusturun.


        String[] isimler = {"mualla", "selim", "emine", "abdurrahim"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Bulmak istediginiz ismi giriniz");
        String girilenIsim = scan.nextLine();

        boolean sonuc = girilenIsmiBulma(isimler, girilenIsim);

        if (sonuc) {
            System.out.println("Girilen isim Array de vardir");

        } else {
            System.out.println("Girilen isim Array de yoktur");
        }
    }

  public static boolean girilenIsmiBulma(String[] isimler, String girilenIsim) {

        boolean arananKelimeSonuc = false;

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].equalsIgnoreCase(girilenIsim)) {

                arananKelimeSonuc = true;
            }
        }
        return arananKelimeSonuc;
    }
}


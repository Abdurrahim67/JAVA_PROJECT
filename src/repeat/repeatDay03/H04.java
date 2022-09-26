package repeat.repeatDay03;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {

        /* kullanicidan dikdörtgenler prizmasinin uzun, kisa kenarlarini ve yuksekligini isteyip
        prizmanin hacmini hesaplayip yazdirin

          */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin uzun, kisa ve yukseklik uzunluklarini giriniz");

        double uzun=scan.nextDouble();
        double kisa=scan.nextDouble();
        double yükseklik=scan.nextDouble();

        double hacim=uzun*kisa*yükseklik;

        System.out.println("Girdiginiz dikdörtgenin hacmi= "+hacim);



    }

}

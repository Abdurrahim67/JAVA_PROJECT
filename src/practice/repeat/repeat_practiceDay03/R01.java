package practice.repeat.repeat_practiceDay03;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 4 tane kelime girin");
        String kelime1=scan.next(),kelime2=scan.next(),kelime3=scan.next(),kelime4=scan.next();

        System.out.println(kelime1+" "+kelime2+" "+kelime3+" "+kelime4+".");


    }

}

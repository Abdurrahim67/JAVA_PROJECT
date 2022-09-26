package practice.repeat.repeat_practiceDay02;

import java.util.Scanner;

public class R_Recap08 {

    public static void main(String[] args) {

        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String kelime = scan.next();

        if (kelime.length() >= 3) {

            kelime = kelime.substring(kelime.length() - 2);

            System.out.println(kelime + kelime + kelime);
        } else {
            System.out.println(kelime);

        }


    }

}
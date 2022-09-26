package practice.repeat.repeat_practiceDay02;

import java.util.Scanner;

public class R_Recap06 {
    public static void main(String[] args) {


        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki kelime giriniz ");
        String kelime1=scan.next(),kelime2= scan.next();

        System.out.println(kelime1.concat(" "+kelime2));

        System.out.println(kelime1.substring(1).concat(" "+kelime2.substring(1)));

    }
}


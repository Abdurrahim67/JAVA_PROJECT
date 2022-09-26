package repeat.repeatDay03;

import java.util.Scanner;

public class R0308 {

    public static void main(String[] args) {

        // kullanicidan ismini alip; ilk harfini buyuk harf olarak yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        char ad=scan.next().toUpperCase().charAt(0);

        System.out.println("Adinizin ilk harfi= "+ad);


    }
}

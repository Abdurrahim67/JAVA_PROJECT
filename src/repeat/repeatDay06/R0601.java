package repeat.repeatDay06;

import java.util.Scanner;

public class R0601 {

    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen adinizi giriniz");

        String ad=scan.nextLine().toUpperCase();

        System.out.println("adiniz: "+ad);

        System.out.println("Lütfen soyadinizi giriniz");
        String soyad= scan.nextLine().toLowerCase();
        System.out.println("soyadiniz: "+soyad);

    }
}

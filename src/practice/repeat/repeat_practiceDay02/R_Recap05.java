package practice.repeat.repeat_practiceDay02;

import java.util.Scanner;

public class R_Recap05 {

    public static void main(String[] args) {

// Kullanicidan ismini ve soyismini girmesni isteyin, sonrasinda konsola tam ismini büyük harfler ile yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz");
        String isim=scan.nextLine(),soyisim=scan.nextLine();

        String tamIsim=isim.concat(" "+soyisim).toUpperCase();
        System.out.println(tamIsim);

       // System.out.println(isim.toUpperCase()+" "+soyisim.toUpperCase());






    }
}

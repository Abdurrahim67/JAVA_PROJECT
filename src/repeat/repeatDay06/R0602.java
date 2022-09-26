package repeat.repeatDay06;

import java.util.Scanner;

public class R0602 {

    public static void main(String[] args) {

        String str="Java ile hayat ne güzel";

        System.out.println(str.toUpperCase()); //JAVA ILE HAYAT NE GÜZEL

        boolean guzelMi=true;

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrNo="123456";

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5 basamakli bir sayi girniz");

        String sifre= scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);

        System.out.println("girilen sifre 3 fazlasi: "+(sifre+3));
        System.out.println("Integer sifre: "+(sifreSayi+3));







    }
}

package repeat.repeatDay03;

import java.util.Scanner;

public class R0307 {

    public static void main(String[] args) {
        // bir onceki soruyu tek seferde kullanicidan tum bilgileri aliniz

        Scanner scan=new Scanner(System.in);

        System.out.println("lÜtfen adinizi, soyadinizi, yasinizi \naralarda  enter tusuna basarak giriniz");

        String ad=scan.nextLine();
        String soyAd= scan.nextLine();
        int yas=scan.nextInt();

        System.out.println("Adiniz soyadiniz ve yasiniz= "+ad+","+soyAd+","+yas);



    }
}

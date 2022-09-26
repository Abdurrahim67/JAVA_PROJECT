package repeat.repeatDay03;

import java.util.Scanner;

public class H06 {

    public static void main(String[] args) {

        /* Kullanicidan isim soyisim aldirin aralainda bir bosluk kalacak sekilde yazdirin

        isim-soyisim:Mehmet Bulutluoz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi yaziniz");

        String isim=scan.nextLine();
        String soyisim=scan.nextLine();

        System.out.println("isim-soyisim:"+isim+" "+soyisim);

    }
}

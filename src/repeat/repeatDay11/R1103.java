package repeat.repeatDay11;

import java.util.Scanner;

public class R1103 {

    public static void main(String[] args) {

         /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email adresinizi giriniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail.com")) {
            System.out.println("Lütfen gmail adresi giriniz");

        } else if (email.lastIndexOf("@gmail.com") == (email.length() - 10)) {
            System.out.println("Email adresiniz kaydedildi");

        } else {
            System.out.println("Lütfen gecerli bir mail adresi giriniz ");
        }

    }
}

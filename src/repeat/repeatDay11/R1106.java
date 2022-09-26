package repeat.repeatDay11;

public class R1106 {

    public static void main(String[] args) {

      /*
            Soru 1) Kullanicidan email adresini girmesini isteyin,
            mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
            @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
            @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */

        String email = "fatih@gmail.com";

        if (!email.contains("@gmail.com")) {
            System.out.println("LÜtfen gmail adresi giriniz");

        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        } else {
            System.out.println("LÜtfen gecerli bir email adresi giriniz");
        }


    }
}

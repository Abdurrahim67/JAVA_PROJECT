package repeat.repeatDay11;

public class R1104 {

    public static void main(String[] args) {

        /*
            Soru 2) Kullanicidan bir cumle isteyin.
            Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
            “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
            iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */

        String cümle = "Java buyuk, dunya kucuk";
        cümle = cümle.toLowerCase();

        if (cümle.contains("kucuk") && cümle.contains("buyuk")) {
            System.out.println("Karar ver buyuk mu yazdirayim kucuk mu?");
        } else if (cümle.contains("kucuk")) {
            System.out.println(cümle.toLowerCase());
        } else if (cümle.contains("buyuk")) {
            System.out.println(cümle.toUpperCase());

        } else {
            System.out.println("cümle kucuk yada buyuk harf icermiyor");

        }


    }
}
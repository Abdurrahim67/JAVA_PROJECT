package repeat.repeatDay21;

public class R02 {
    public static void main(String[] args) {

        // Soru 2- Verilen String bir array’de
        // en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] isimler = {"mualla", "selim", "emine", "abdurrahim"};

        enUzunVeEnKisaKleimeBulma(isimler);
    }

    private static void enUzunVeEnKisaKleimeBulma(String[] isimler) {

        String enUzunIsim = isimler[0];
        String enKisaIsim = isimler[0];

        for (int i = 1; i < isimler.length; i++) {

            if (isimler[i].length() > enUzunIsim.length()) {

                enUzunIsim = isimler[i];

            }
            if (isimler[i].length() < enKisaIsim.length()) {

                enKisaIsim = isimler[i];
            }

        }
        System.out.println("En uzun isim: " + enUzunIsim);
        System.out.println("En kisa isim: " + enKisaIsim);

    }


}

package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {

    public static void main(String[] args) {


        enUzunKlelimeyiYazdir(5,"Ali", "Ayse", "Ismail", "Ahmet", "Babayigit");


        /*
        Varargs teorik olarak sonsuz sayida element olabilir
        bir method'da parametre olarak varargs varsa varargs'in sinirlarini
        bilebilmesi icin parametrelerin sonuncusu olmalidir.
        Oncesinde farkli parametreler olabilir ama varargs'dan sonra parametre olamaz.
         */

    }

    public static void enUzunKlelimeyiYazdir(int kelimeSayisi,String... kelime) {
        String enUzunKelime = kelime[0];

        for (String each : kelime
        ) {
            if (each.length() > enUzunKelime.length()) {

                enUzunKelime = each;
            }

        }
        System.out.println("Girilen kelimelrin en uzunu: " + enUzunKelime);
    }
}

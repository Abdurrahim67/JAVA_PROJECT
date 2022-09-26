package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {

    public static void main(String[] args) {


        enUzunKlelimeyiYazdir(6.5,8,"Ali", "Ayse", "Ismail", "Ahmet", "Babayigit","selim","kemal");

    }

    public static void enUzunKlelimeyiYazdir(double dob,int num,String... kelime) {

        /* Bir methoda'da varargs disinda parametre varsa varargs parametre olarak en sona yazilmalidir.
        (aksi durumda varargs nerede duracagini bilemez)
         */


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

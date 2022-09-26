package practice.repeat.repeat_practiceDay10.ogrenci;

import java.util.Scanner;

public class OgrenciRunner {

    public static void main(String[] args) {


        String isim="Ahmet";
        String soyisim="Harman";
        int sinif=7;
        String sube="C";
        int okulNo=3647;

       Ogrenci ogrenciBilgileri=new Ogrenci(isim,soyisim,sinif,sube,okulNo);
        System.out.println("ilk hali: "+ogrenciBilgileri);

        isimDegistir(ogrenciBilgileri);
        System.out.println();
        System.out.println("son hali: "+ogrenciBilgileri);
        System.out.println();
        ogrenciBilgileri.soyisim=soyisimDegistir(ogrenciBilgileri.soyisim);
        System.out.println(ogrenciBilgileri);
    }



    public static void isimDegistir(Ogrenci ogrenciBilgileri) {

        ogrenciBilgileri.isim="Kemal";
        ogrenciBilgileri.soyisim="Eren";
        ogrenciBilgileri.sinif=5;
        ogrenciBilgileri.sube="A";
        ogrenciBilgileri.okulNo=87465;



    }private static String soyisimDegistir(String soyisim) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Yeni soyadinizi giriniz");
        soyisim=scan.nextLine();

        return soyisim;
    }



}

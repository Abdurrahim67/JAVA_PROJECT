package practice.repeat.repeat_okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class islemler1 {


    static List<Ogretmen1> ogretmenList=new ArrayList<Ogretmen1>();
    static List<Kisi1>ogrenciList=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {

        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim=scan.next().toUpperCase();

        switch (secim){

            case"1":
                kisiTuru="OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru="Ogretmen";
                islemMenusu();
                break;
            case "Q":
                break;
            default:
                System.out.println("hatali giris");
                girisPaneli();
        }


    }

    private static void islemMenusu() {

        System.out.println("sectigin kisi turu " + kisiTuru + " Lütfen asagidaki islemleri seciniz");


        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");

        System.out.println("islem tercihinizi giriniz");

        int secilenIslem=scan.nextInt();

        switch ( secilenIslem){

            case 1:
                ekle();
                islemMenusu();
                break;

            case 2:
               // arama();
                islemMenusu();
                break;
            case 3:
               // listeleme();
                islemMenusu();
            case 4:
                // silme();
                islemMenusu();
            case 5:
                girisPaneli();
                break;
            case 0:
                // cikis();
                break;
            default:
                System.out.println("güzel bir sey gir");
                islemMenusu();
                break;

        }


    }

    private static void ekle() {
        System.out.println("**** " + kisiTuru + " ekleme sayfasina hosgeldin");

        System.out.println("isim ve soyisim gir");
        String adSoyad = scan.nextLine();
        scan.nextLine();

        System.out.println("kimlik gir");
        String kimlikNo = scan.nextLine();


        System.out.println("yas gir");
        int yas = scan.nextInt();


        if(kisiTuru.equals("OGRENCI")){
            System.out.println("OgrenciNo gir");
            String ogrenciNo=scan.next();

            System.out.println("Sinif gir");
            String sinif=scan.next();

            Ogrenci1 ogrenci=new Ogrenci1(adSoyad,kimlikNo,yas,ogrenciNo,sinif);
            ogrenciList.add(ogrenci);
            System.out.println(ogrenciList);

        } else {
            System.out.println("bölüm gir");
            String bolum=scan.nextLine();

            System.out.println("sicil no gir");
            String sicilNo=scan.nextLine();

            Ogretmen1 ogretmen=new Ogretmen1(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogretmenList.add(ogretmen);
            System.out.println(ogretmenList);





        }



    }


}




















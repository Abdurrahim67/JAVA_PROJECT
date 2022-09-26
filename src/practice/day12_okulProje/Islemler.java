package practice.day12_okulProje;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {


    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {

        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");

        String secim = scan.next().toUpperCase();

        switch (secim) {

            case "1":

                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":

                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                break;
            default:
                System.out.println("hatali giris:(");
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
        int secilenIslem = scan.nextInt();

        switch (secilenIslem) {

            case 1:
                ekle();
                islemMenusu();
                break;

            case 2:
                 arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
               islemMenusu();
                break;
            case 5:
                girisPaneli();

                break;
            case 0:
                 cikis();
                break;
            default:
                System.out.println("guzel birsex gir");
                islemMenusu();
                break;


        }


    }

    private static void cikis() {
        System.out.println("Yine bekleriz okulumuza hoscakalin");




    }

    private static void silme() {
        System.out.println("**** "+ kisiTuru+" silme sayfasina hosgeldin");
        boolean flag=true;//bayrak havada aksiyon basla

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("silmek istedigin kimlik no gir");

            String silinecekKimlikNo= scan.next().replaceAll(" ","");

            for (Kisi each:ogrncList ) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)){
                    System.out.println("silinen ogrenci "+each.getAdSoyad());
                    ogrncList.remove(each);//o ogrenciyi siler
                    flag=false;
                    break;
                }
            }if (flag){//eger girilen tc list te yok ise bu if calisir
                System.out.println("bu tc ile ogrenci yok silinemedi");
            }



        }else{//ogretmen isslemleri icin kontrol
            System.out.println("silinecek ogretmenin kimlik no gir");
            String silinecekKimlikNo=scan.next().replaceAll(" ","");

            for (Kisi each:ogrtmnList) {
                if (each.getKimlikNo().equalsIgnoreCase(silinecekKimlikNo)){
                    System.out.println("silinen ogretmen "+each.getAdSoyad());
                    ogrtmnList.remove(each);
                    flag =false;
                    break;

                }
            }if (flag){//kullanicin girdigi tc kimlik no hic bir ogretmene eslesmedi demek
                System.out.println("bu tc ile ogretmen bulunamadi ve silinemedi");
            }

        }





    }

    private static void listeleme() {
        System.out.println("**** "+ kisiTuru+" listeleme sayfasina hosgeldin");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")){
            System.out.println("ogrncList = " + ogrncList);
        }else{
            for (Kisi each:ogrtmnList) {
                System.out.println("each.toString() = " + each.toString());
            }
        }



    }

    private static void arama() {
        System.out.println("**** "+ kisiTuru+" arama sayfasina hosgeldin");
        boolean flag =true;//bayrak yukarda true olan her saart devam eder aksiyon baslasin

        if (kisiTuru.equalsIgnoreCase("OGRENCI")){//bu satiirda ogrenci ariyorsa calisir
            //dummy
            System.out.println("kimlik no giriniz");
            String arananKimlikNo= scan.next().replaceAll(" ","");//kullanici bosluk girerse diye bosluk hiclik yapilfi
            for (Kisi w:ogrncList ) {
                if (w.getKimlikNo().equals(arananKimlikNo)){//kullanicinin girdigi tc ile ogrenci listinde ki tc lerden eslesen var mi
                    System.out.println("aradiginiz ogrenci " +w.getAdSoyad());
                    flag=false;
                }
            }if (flag){//flag true ise hala bu if body si calisir. yani aranan tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogrenci yok ");
            }//94 den 107 ye kadar ogrenci islemleri


        }else{// ogretmen icin caliscak

            System.out.println("kimlik no giriniz");
            String arananKimlikNo= scan.next().replaceAll(" ","");//kullanici bosluk girerse diye bosluk hiclik yapilfi
            //dummy
            for (Kisi w:ogrtmnList ) {
                if (w.getKimlikNo().equals(arananKimlikNo)){//kullanicinin girdigi tc ile ogrenci listinde ki tc lerden eslesen var mi
                    System.out.println("aradiginiz ogretmen " +w.getAdSoyad());
                    flag=false;
                }
            }if (flag){//flag true ise hala bu if body si calisir. yani aranan tc ile ogrenci yok demektir
                System.out.println("aranan tc ile ogretmen yok ");
            }//else body si komple ogretmen icin tasarlandi
        }


        }

    private static void ekle() {
        System.out.println("**** " + kisiTuru + " ekleme sayfasina hosgeldin");

        System.out.println("isim ve soyisim gir");
        scan.nextLine();
        String adSoyad = scan.nextLine();


        System.out.println("kimlik gir");
        String kimlikNo = scan.nextLine();


        System.out.println("yas gir");
        int yas = scan.nextInt();



        if(kisiTuru.equals("OGRENCI")){

            System.out.println("OgrenciNo gir");
            String ogrenciNo=scan.next().replaceAll(" ","");

            System.out.println("Sinif gir");
            String sinif=scan.next().replaceAll(" ","");

            Ogrenci ogrenci=new Ogrenci(adSoyad,  kimlikNo, yas, ogrenciNo, sinif);
            ogrncList.add(ogrenci);
            System.out.println(ogrncList);



        } else {

            System.out.println("bölüm gir");
            scan.nextLine();
            String bolum=scan.nextLine();



            System.out.println("sicil no gir");
            String sicilNo=scan.nextLine();


            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogrtmnList.add(ogretmen);
            System.out.println(ogrtmnList);



        }
    }
}

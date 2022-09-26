package proje.proje;

import java.util.Scanner;

public class Restaurant_Projesi {

    public static void main(String[] args) {

        // kullanıcıdan hangi yemekleri yemek istediğini sorup
        // o yemeğin menüde olup olmadığını kontrol edin varsa
        // siparişiniz hazırlanıyo, yoksa bu yemek menüde yoktur yazdırın


        Scanner scan=new Scanner(System.in);
        String hosgeldinizMesaji="---HOŞGELDİNİZ---";
        System.out.println(hosgeldinizMesaji);
        String menu="CORBALAR : Mercimek Çorbası, Yoğurt Çorbası, Arabaşı Çorbası " +
                "ARA SICAKLAR : Yaprak Sarma, Su Böreği, Patlıcanlı Yoğurt " +
                "SALATALAR : Mevsim Salata, Çoban Salata, Sezar Salata, Rus Salatası " +
                "ANA YEMEKLER : Lahmacun, Adana Kebap, Urfa Ciğer, Pilav Üstü Et, Pizza, Küşleme, Kavurma " +
                "TATLILAR : Künefe, Islak Kek, Baklava, Havuçlu Kek, Fırın Sütlaç " +
                "ICECEKLER : Acılı Şalgam, Acısız Şalgam, Açık Ayran, Kapalı Ayran, Su, Meyve Suyu ";

        String CORBALAR = "Mercimek Çorbası" + "Yoğurt Çorbası" + "Arabaşı Çorbası";
        String ARA_SICAKLAR = "Yaprak Sarma" + "Su Böreği" + "Patlıcanlı Yoğurt";
        String SALATALAR = "Mevsim Salata" + "Çoban Salata" + "Sezar Salata" + "Rus Salatası";
        String ANA_YEMEKLER = "Lahmacun" + "Adana Kebap" + "Urfa Ciğer" + "Pilav Üstü Et" + "Pizza" + "Küşleme" + "Kavurma";
        String TATLILAR = "Künefe" + "Islak Kek" + "Baklava" + "Havuçlu Kek" + "Fırın Sütlaç";
        String ICECEKLER = "Acılı Şalgam" + "Acısız Şalgam" + "Açık Ayran" + "Kapalı Ayran" + "Su" + "Meyve Suyu";

        System.out.println(menu);
        System.out.println();
        System.out.println("Lütfen menüdeki isimleri giriniz (Mercimek Çorbası, Yaprak Sarma)");
        System.out.println();
        System.out.println("Hangi çorbayı istersiniz : ");
        String corba= scan.nextLine();
        System.out.println("Hangi ara sıcağı istersiniz : ");
        String araSicak= scan.nextLine();
        System.out.println("Hangi salatayı istersiniz : ");
        String salata= scan.nextLine();
        System.out.println("Hangi ana yemeği istersiniz : ");
        String anaYemek= scan.nextLine();
        System.out.println("Hangi tatlıyı istersiniz : ");
        String tatli= scan.nextLine();
        System.out.println("Hangi içeceği istersiniz : ");
        String icecek= scan.nextLine();

        if (CORBALAR.contains(corba)){
            System.out.println("Çorba siparişi hazırlanıyor");

        }else{
            System.out.println("Bu çorba yoktur, lütfen başka çorba seçiniz");
        }
        if (ARA_SICAKLAR.contains(araSicak)){
            System.out.println("Ara sıcak siparişi hazırlanıyor");

        }else{
            System.out.println("Bu ara sıcak yoktur, lütfen başka ara sıcak seçiniz");
        }
        if (SALATALAR.contains(salata)){
            System.out.println("Salata siparişi hazırlanıyor");

        }else{
            System.out.println("Bu salata yoktur, lütfen başka salata seçiniz");
        }
        if (ANA_YEMEKLER.contains(anaYemek)){
            System.out.println("Ana yemek siparişi hazırlanıyor");

        }else{
            System.out.println("Bu ana yemek yoktur, lütfen başka ana yemek seçiniz");
        }
        if (TATLILAR.contains(tatli)){
            System.out.println("Tatlı siparişi hazırlanıyor");

        }else{
            System.out.println("Bu tatlı yoktur, lütfen başka tatlı seçiniz");
        }
        if (ICECEKLER.contains(icecek)){
            System.out.println("Içecek siparişi hazırlanıyor");

        }else{
            System.out.println("Bu içecek yoktur, lütfen başka içecek seçiniz");
        }
    }
}

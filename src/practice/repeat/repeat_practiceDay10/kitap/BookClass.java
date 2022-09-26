package practice.repeat.repeat_practiceDay10.kitap;

public class BookClass {

    String adi, yazari;
    int yayinYili;

        // class da body icinde sag click->
        // Generate-> kullanacagin parametreleri sec-> ok (Parametreli Constructor olusturulur)
        //2  ve 3 pm li const olusturun
        //main method bu class da olsun
        //main method icinde obj leri create edin iki const tu da kullanin
        //yazdir isimli method create edin
        //ve bu methodlar olusturdugunuz obj leri yazdirin

    public BookClass() {//parametresiz constructor

    }

    public BookClass(String adi, String yazari, int yayinYili) {//3 parametreli
        this.adi = adi;
        this.yazari = yazari;
        this.yayinYili = yayinYili;
    }

    public BookClass(String adi, String yazari) {//2 parametreli
        this.adi = adi;
        this.yazari = yazari;
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", yayinYili=" + yayinYili +
                '}';
    }

    public static void main(String[] args) {

        BookClass kitapBilgileri = new BookClass("hayvan çiftliği", "george orwell");
        BookClass kitapBilgileri2 = new BookClass("var mısın", "doğan cüceloğlu", 2021);
        yazdır(kitapBilgileri, kitapBilgileri2);


    }

    public static void yazdır(BookClass kitapBilgileri, BookClass kitapBilgileri2) {
        System.out.println("Kitap 1 "+kitapBilgileri2);
        System.out.println("Kitap 2 "+kitapBilgileri);
    }
}



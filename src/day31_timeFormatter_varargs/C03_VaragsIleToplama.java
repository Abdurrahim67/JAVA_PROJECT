package day31_timeFormatter_varargs;

public class C03_VaragsIleToplama {

    public static void main(String[] args) {
        // verilen kac  int olursa olsun
        // hepsini toplayip sonucu yazdiran bir method olusturun
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;
        int sayi6 = 60;


        toplaYazdir(sayi1, sayi2, sayi3, sayi4, sayi5, sayi6);
        toplaYazdir(sayi1, sayi2, sayi3, sayi4, sayi5);
        toplaYazdir(sayi1, sayi2, sayi3, sayi4);
        toplaYazdir(sayi1, sayi2, sayi3);
        toplaYazdir(sayi1, sayi2);
    }

    public static void toplaYazdir(int... sayi) {
        /*
        --> int... sayi  bu gosterim integer variable'lardan olusan bir varargs demektir
        varargs array alt yapisini kullanir.
        --> Varrgs tek method'a istegimiz kadar parametre yollayarak sonuc almamizi saglar.
        Yani parametre sayimiz degisken ancak method'un yapacagi is sabitse Varrags kullanarak tek method'la kodumuzu yazabilirz.

       --> Varargs ozellik olarak list gibi calisir(uzunlugu esnektir) fakat varargs'in arka planinda Java Array ile calisir.

       --> Varargs'i declare etmek icin data type'dan sonra ... kullaniriz.( int..sayi vb.)




         */
        int toplam = 0;
        int sayiAdedi = sayi.length;
        for (int each : sayi
        ) {
            toplam += each;
        }
        System.out.println("Girilen " + sayiAdedi + " adet sayinin toplami : " + toplam);
    }

}




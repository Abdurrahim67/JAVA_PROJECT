package repeat.repeatDay15;

public class R1501 {

    public static void main(String[] args) {


        // verilen iki sayiyi carpip
        // sonucu bize döndüren bir method olusturun

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1, sayi2);
        System.out.println(sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {

        int sonuc = sayi1 * sayi2;

        return sonuc;

    }


}
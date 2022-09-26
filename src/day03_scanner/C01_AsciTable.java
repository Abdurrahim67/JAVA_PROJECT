package day03_scanner;

public class C01_AsciTable {
    public static void main(String[] args) {

        // Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin

        int sayi = 10;
        char harf = 'a';
        String str = "banan";

        System.out.println(sayi + harf);  //10a degil 107 oldu
        System.out.println(sayi * harf);
        System.out.println(str + harf);  // banana
        System.out.println(harf + 2);
        System.out.println(str + sayi + harf);// banan10a

        // char yeniHarf=harf+2;
        /*
        1- char data türü isleme girdigi degiskenin türüne göre farkli davranabilir
        eger matematiksel isleme girdigi variable sayisal bir degerse sayi gibi gibi davranir
        sayi+harf sai variable´i int oldugundan harf variable'i asci tablosundan 97 degerini kullanir.

        char yeniHarf=harf+2; java once sagdaki islemi yapar, sagda int+char görunce ascii degerini alir ve sonucu 99
                               sonra atama islemi yapmaya calisir
                                char yeniHarf=99;
                                bu atama java acisindan kabul edilebilir degildir

         2- str+harf); // banana String variable cok güclüdür, hangi data türü ile isleme
          girerse girsin diger data türüne kendine benzetir



         */

        // peki.. konsolda verilen variable lari kullanarak 10a görmek istersek nasil yazdirmaliyiz?

        System.out.println(""+sayi+harf); //10a
        char deger = '1';
        System.out.println(deger + harf);// '1'+'a'  --> 49+97=146
    }
}

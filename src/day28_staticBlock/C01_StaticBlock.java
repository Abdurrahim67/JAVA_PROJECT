package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        Static block class uyelerinin tamamindan once calisir
        (main method'dan bile once)
        static block class olusturuldugunda calisir
        genellikle de class'la ilgili on ayarlamalar
        veya static variable'lara deger atamak icin kullanilir.
        static block'larin class icerisinde nerede oldugu onemli degildir
        once static block'lar calisir
        birden fazla static block varsa, yukaridan asagi dogru calisir
         */

        sayi=10;
        System.out.println("static blok calisti "+sayi);
    }
    public static void main(String[] args) {
        sayi=35;
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }
    static{
        sayi=25;
        System.out.println("main method altindaki static block calisti "+sayi);
    }

}

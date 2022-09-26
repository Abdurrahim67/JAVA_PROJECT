package repeat.repeatDay04;

public class H0401 {

    public static void main(String[] args) {
        /*) byte veri tipinde bir degisken olusturun, short,int, float ve double data tiplerinde
birer degisken olusturup adim adim widening yapin ve yazdirin

        Erstellen Sie eine Variable vom Datentyp Byte, Short, Int, Float und Double
        Schritt für Schritt eine variable Verbreiterung erstellen und drucken
         */

        byte sayi1 = 95;
        short sayi2 = sayi1;
        int sayi3 = sayi2;
        long sayi4 = sayi3;
        float sayi5 = sayi4;
        double sayi6 = sayi5;

        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println(sayi4);
        System.out.println(sayi5);
        System.out.println(sayi6);


    }

}

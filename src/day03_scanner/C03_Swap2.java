package day03_scanner;

public class C03_Swap2 {

    public static void main(String[] args) {

        // bir önceki swap sorusunu bos kova kullanmadan yapin

        int sayi1 = 10;
        int sayi2 = 20;


        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;

        System.out.println("swap tan sonra sayi1:" + sayi1);
        System.out.println("swap tan sonra sayi2:" + sayi2);

    }
}

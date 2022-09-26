package repeat.repeatDay03;

public class InterviewQuestion1 {

    public static void main(String[] args) {

        // 1 - Verilen sayi1 ve sayi2 variable larin degerlerini degistiren (SWAP) bir program yaziniz

        /* orn sayi1=10 ve sayi2=20;
        kod calistiktan sonra sayi1=20 ve sayi2=10
         */

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;

        sayi3 = sayi2;
        sayi2 = sayi1;
        sayi1 = sayi3;

        System.out.println("swap tan sonra sayi1:" + sayi1);
        System.out.println("swap tan sonra sayi2:" + sayi2);


    }
}

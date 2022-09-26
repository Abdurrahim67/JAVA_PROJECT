package repeat.repeatDay15;

public class R1508 {

    public static void main(String[] args) {

        // 300 den 1´e kadar 8 ile bölünebilenen sayilarin toplamini yazdiran bir method olusturun


        int input = 0;
        toplamYaz(input);

    }

    public static void toplamYaz(int input) {

        int toplam = 0;

        for (int i = 300; i >= 1; i--) {

            if (i % 8 == 0) {

                toplam += i;

            }


        }
        System.out.println(toplam);

    }
}

package repeat.repeatDay21;

public class R01 {
    public static void main(String[] args) {

        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.


        int [] sayilar= {4,3,2,5,1,7,8,6,9};

        enBüyükSayiBulma(sayilar);


    }

    private static void enBüyükSayiBulma(int[] sayilar) {
        int enBüyük = sayilar[0];

        for (int i = 1; i <sayilar.length ; i++) {

            if(i>enBüyük){
                enBüyük=sayilar[i];

            }

        }
        System.out.println("En büyük sayi: "+enBüyük);

    }
}

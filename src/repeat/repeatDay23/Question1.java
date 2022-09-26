package repeat.repeatDay23;

public class Question1 {

    public static void main(String[] args) {

        // verilen bir array deki tekrara eden elemanlari yazdirin

        int[] sayilar = {1, 2, 2, 3, 4, 4, 5, 5, 6};


        int sayac = 0;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = i + 1; j < sayilar.length; j++) {

                if (sayilar[i] == sayilar[j]) {

                    System.out.print(sayilar[i] + " ");
                    sayac++;

                }


            }

        }
        System.out.println();
        System.out.println("sayac:"+sayac);
    }
}
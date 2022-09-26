package repeat.repeatDay16;

public class R1601 {

    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        // tam bolenlerini yazdiralim

        int input = 50;

        for (int i = 1; i < 50; i++) {

            if (input % i == 0) {

                System.out.print(i + " ");


            }

        }

        int input2 = 100;

        for (int i = 1; i <= 100; i++) {

            if (input % i == 0) {

                System.out.print(i + " ");
            }

        }

        int input3 = 250;

        for (int i = 1; i <= 250; i++) {

            if (input3 % i == 0) {

                System.out.print(i + " ");
            }

        }


    }
}

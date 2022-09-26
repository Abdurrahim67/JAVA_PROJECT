package repeat.repeatDay17;

public class R1704 {

    public static void main(String[] args) {

        /*
        verilen input'a gore *'lardan olusan bir ucgen olusturun
        ornek input =4 ise
                 *
                 * *
                 * * *
                 * * * *
        */


        int input = 4;

        for (int i = 1; i <= input; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println("");

        }


    }

}

package repeat.repeatDay17;

public class R1702 {

    public static void main(String[] args) {

        // verilen sayiya gore carpim tablosu olusturun
    /*
    input 3
    1 2 3
    2 4 6
    3 6 9
     */

        int input = 5;

        for (int i = 1; i <= input; i++) {

            for (int j = i; j <= input; j++) {
                System.out.print( i * j+" ");

            }

            System.out.println("");
        }


    }
}

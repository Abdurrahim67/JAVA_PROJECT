package repeat.repeatDay15;

public class R1503 {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir metod olusturun

        String input = "Java yanlis yapmaz";

        tersten(input);


    }

    public static void tersten(String input) {
        String tersInput = input.substring(input.length() - 1);

        for (int i = input.length() - 2; i >= 0; i--) {

            tersInput += input.substring(i, i + 1);

        }
        System.out.println(tersInput);


    }


}

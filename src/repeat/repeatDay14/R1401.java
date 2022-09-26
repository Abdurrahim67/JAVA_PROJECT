package repeat.repeatDay14;

public class R1401 {

    public static void main(String[] args) {

        terstenYazdir("Okan");




    }

    public static void terstenYazdir(String input) {

        String tersInput = input.substring(3) +
                           input.substring(2, 3) +
                           input.substring(1, 2) +
                           input.substring(0, 1);

        System.out.println("Verilen kelimenin tersten yazilisi: "+tersInput);


    }

}

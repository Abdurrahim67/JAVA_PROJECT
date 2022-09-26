package repeat.repeatDay15;

public class R1506 {

    public static void main(String[] args) {

        String input="Cok calismak lazim cok";

        TersTenYazdir(input);


    }

    public static void TersTenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);

        for (int i = input.length()-2; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);


    }
}

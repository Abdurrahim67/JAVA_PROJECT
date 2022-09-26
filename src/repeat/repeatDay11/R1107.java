package repeat.repeatDay11;

public class R1107 {

    public static void main(String[] args) {


        String input = "Java gun gectikce guzellesiyor";

        System.out.println(input.startsWith("J")); //true
        System.out.println(input.toUpperCase().startsWith("JAVA"));//true
        System.out.println(input.startsWith(""));//true
        System.out.println(input.startsWith("gun", 5));//true

    }

}

package repeat.repeatDay11;

public class R1105 {
    public static void main(String[] args) {

        String cümle = "Ah be Java";

        System.out.println(cümle.endsWith("ava")); // true
        System.out.println(cümle.endsWith("Java"));//true
        System.out.println(cümle.toLowerCase().endsWith("java"));//true
        System.out.println(cümle.toUpperCase().endsWith("BE JAVA"));//true
        System.out.println(cümle.endsWith("a"));//true


    }
}

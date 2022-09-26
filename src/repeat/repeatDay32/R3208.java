package repeat.repeatDay32;

public class R3208 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="Java";

        System.out.println(sb1.equals(sb2));

        System.out.println(sb1.equals(sb1));

        System.out.println(sb1.equals(str));

        System.out.println(sb1.compareTo(sb2));


    }
}

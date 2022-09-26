package repeat.repeatDay32;

public class R3205 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Pay attention please");

        System.out.println(sb.indexOf("Pay")); //0

        System.out.println(sb);//Pay attention please

        System.out.println(sb.indexOf("e"));
        System.out.println(sb.indexOf("e",10));

        System.out.println(sb.lastIndexOf("e"));

        System.out.println(sb.lastIndexOf("e",10));

    }
}

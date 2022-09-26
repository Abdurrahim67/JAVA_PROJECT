package repeat.repeatDay32;

public class R3206 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Calm down");

        sb.replace(5,10,"Up");

        System.out.println(sb);

        sb.replace(4,5,"---");

        System.out.println(sb);

        sb.replace(4,7," ");
        System.out.println(sb);

        sb.replace(5,7,"down");
        System.out.println(sb);

    }
}

package repeat.repeatDay32;

public class R3207 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman güzel");

        sb.delete(8, 9);
        System.out.println(sb);

        sb.deleteCharAt(8);
        System.out.println(sb);

        int son = sb.length();
        for (int i = 0; i < son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);

        }

    }
}

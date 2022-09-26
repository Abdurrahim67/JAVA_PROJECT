package repeat.repeatDay32;

public class R3202 {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?");
        System.out.println(sb);


        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb);

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);

    }
}

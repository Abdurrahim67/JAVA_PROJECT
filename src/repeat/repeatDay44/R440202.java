package repeat.repeatDay44;

import java.util.LinkedList;
import java.util.Queue;

public class R440202 {

    public static void main(String[] args) {

        Queue<String>ll3=new LinkedList<>();
        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("selin");
        ll3.add("kemal");

        System.out.println(ll3);
        ll3.remove();
        System.out.println(ll3);
        ll3.remove();
        System.out.println(ll3);

        System.out.println(ll3.remove("kerem"));
        System.out.println(ll3.remove("Zeynep"));
        System.out.println(ll3);

        System.out.println(ll3.remove("selin"));
        System.out.println(ll3);

        Queue<String>ll4=new LinkedList<>();
        //System.out.println(ll4.element());

        System.out.println(ll4.peek());
        ll4.add("yusuf");
        ll4.add("lale");

        System.out.println(ll4);
        System.out.println(ll4.element());
        System.out.println(ll4);

        System.out.println(ll4.peek());
        System.out.println(ll4);

        ll4.offer("hakan");
        ll4.offer("cemil");

        System.out.println(ll4);
        System.out.println(ll4.poll());
        System.out.println(ll4);
       // System.out.println(ll4.poll());


    }
}

package repeat.repeatDay44;

import java.util.LinkedList;
import java.util.Queue;

public class R4404 {

    public static void main(String[] args) {

        Queue<String> ll3=new LinkedList();

        ll3.add("Adem");
        ll3.add("Zeynep");
        ll3.add("Hpolat");
        ll3.add("Kadir");

        System.out.println(ll3);

        System.out.println(ll3.remove());

        System.out.println(ll3.remove());

        System.out.println(ll3.remove("Hpolat"));

        System.out.println(ll3.remove());

      //  System.out.println(ll3.element()); // olmayan eleman olursa Exception firlatir

        System.out.println(ll3.peek()); //  olmayan eleman olursa null döner

        ll3.offer("Ahmet");
        ll3.offer("sefa");

        System.out.println(ll3);

        System.out.println(ll3.poll());

        System.out.println(ll3);

        System.out.println(ll3.remove());




    }
}

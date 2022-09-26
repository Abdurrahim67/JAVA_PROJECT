package repeat.repeatDay44;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class R440201 {
    public static void main(String[] args) {

        LinkedList<String>ll1=new LinkedList<>();
        List<String> ll2=new LinkedList<>();
        Queue<String>ll3=new LinkedList<>();
        Deque<String>ll4=new LinkedList<>();

        ll2.add("ahmet");
        ll2.add("mehmet");
        ll2.add("hasan");
        ll2.add("Hüseyin");

        System.out.println(ll2);
        System.out.println(ll2.remove(3));
        System.out.println(ll2);

        System.out.println(ll2.remove("Kemal"));
        System.out.println(ll2.isEmpty());
        ll2.set(1,"serap");
        System.out.println(ll2);

        ll1.add("berk");
        System.out.println(ll1);
        ll1.add("ismail");
        System.out.println(ll1);

        ll2.retainAll(ll1);
        System.out.println(ll2);
        System.out.println(ll2.hashCode());
        ll2.add("fatih");
        System.out.println(ll2.hashCode());
    }
}

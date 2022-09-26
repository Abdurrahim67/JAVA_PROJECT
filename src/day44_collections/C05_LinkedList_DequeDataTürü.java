package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_LinkedList_DequeDataTürü {  // hem bastan hem sondan ekleme/cikarma >> iki basli

    public static void main(String[] args) {
        Deque<String> ll4=new LinkedList();
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Selim");
        ll4.add("Tevfik");
        ll4.add("Selim");
        ll4.removeLastOccurrence("Selim");
        ll4.removeLastOccurrence("Hasan");
        System.out.println(ll4); // [Cavidan, Mesut, Selim, Tevfik]
        System.out.println(ll4.pop());

        ll4.remove();
        ll4.removeFirst();
        ll4.removeLast();

        // Deque iki tarfli queue demektir, dolayisiyla her methodun first ve last i var.
    }


}

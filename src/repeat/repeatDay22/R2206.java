package repeat.repeatDay22;

import java.util.ArrayList;
import java.util.List;

public class R2206 {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(0);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar);
        sayilar.add(6);
        System.out.println(sayilar);
        sayilar.add(3,7);
        System.out.println(sayilar);



    }
}

package repeat.repeatDay24;

import java.util.ArrayList;
import java.util.List;

public class R2406 {

    public static void main(String[] args) {

        int[] sayilar = {3, 6, 9, 7, 12, 13, 17, 20};
        List<Integer> sayilarList = new ArrayList<>();

        for (int each : sayilar
        ) {
            if(each%2==0) {

                sayilarList.add(each);
            }

        }
        System.out.println(sayilarList);


    }
}

package team;

import java.util.ArrayList;
import java.util.List;

public class AsalSayi_bulma {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int input = 5;
        int k = 2;

        for (int i = input + 1; i < Integer.MAX_VALUE; i++) {

            while (k <= input / 2) {

                if (input % k != 0) {
                    list.add(i);


                }
                k++;
                if (list.size() == 10) {
                    break;
                }


            }
            if (list.size() == 10) {
                break;


            }
        }
        System.out.println(list);
    }
}
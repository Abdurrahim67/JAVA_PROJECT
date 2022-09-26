package repeat.repeatDay45;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {

        int arr[] = {2, 5, 8, 6, 1, 2, 4, 1, 2, 3, 9, 8, 7};

        Set<Integer> setList= new java.util.HashSet<>();

        for (int each: arr
             ) {
            setList.add(each);
        }
        System.out.println(setList);



        setList.add(12);
        System.out.println(setList);

        System.out.println(setList.contains(12));
         System.out.println(setList);

        System.out.println(setList.remove(10));

        System.out.println(setList.size());

        setList.clear();
        System.out.println(setList);

        System.out.println(setList.isEmpty());



    }
}

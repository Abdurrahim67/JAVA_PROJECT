package repeat.repeatDay45;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_HashSet {

    public static void main(String[] args) {

          /*
        Bir TreeSet ve HashSet'e random 100 sayi ekleyin
        islem surelerini kiyaslayin
         */

        Set<Integer> tree1= new TreeSet<>();

        Random rnd= new Random();
        int num=0;
        int account=0;

        long startTimeTree=System.currentTimeMillis();
        System.out.println("startTimeTree: "+startTimeTree);

        while (account <=100) {
            num=rnd.nextInt(250);

            tree1.add(num);
            System.out.print(num+" ");
            account++;


        }
        System.out.println();
        long endTimeTree=System.currentTimeMillis();
        System.out.println("endTimeTree: "+endTimeTree);


        Set<Integer> hash1=new HashSet<>();
        long startTimeHash=System.currentTimeMillis();

        System.out.println("startTimeHash: "+startTimeHash);

        int num1=0;
        int account1=0;

        while(account1<=100) {

            num1=rnd.nextInt(250);
            hash1.add(num1);
            System.out.print(num1+" ");
            account1++;

        }

        System.out.println();
        long endTimeHash=System.currentTimeMillis();

        System.out.println("endTimeHash: "+endTimeHash);


    }


}

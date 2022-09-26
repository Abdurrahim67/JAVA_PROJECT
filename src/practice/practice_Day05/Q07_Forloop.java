package practice.practice_Day05;

import java.util.Scanner;

public class Q07_Forloop {
    public static void main(String[] args) {
         /*
        Get the number of rows and columns from user.
        Create a rectangle.
        rows = 3 and column = 5 ==> * * * * *10

                                    * * * * *
                                    * * * * *
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen satir ve sütun giriniz");
        int satir=scan.nextInt(),sütun= scan.nextInt();

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sütun ; j++) {

                System.out.print("*"+" ");
            }

            System.out.println("*"+" ");
        }





    }
}

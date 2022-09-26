package practice.repeat.repeat_practiceDay03;

import java.util.Scanner;

public class R02 {

    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir String giriniz");
        String str = scan.nextLine().toLowerCase();

        xyzVarMi(str);

        System.out.println(xyzVarMi(str));

    }

    public static boolean xyzVarMi(String str) {

        if (str.contains("xyz")) {
            return true;


        } else
            return false;

    }
}

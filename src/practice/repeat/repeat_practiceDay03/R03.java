package practice.repeat.repeat_practiceDay03;

import java.util.Scanner;

public class R03 {

    public static void main(String[] args) {

        /*
        name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen iki tane isim giriniz");
        String isim1 = scan.next().toLowerCase(), isim2 = scan.next().toLowerCase();

        if (isim1.length() % 2 == 0) {
            //System.out.println(isim1.substring(0, isim1.length() / 2) + isim2 +isim1.substring(isim1.length()/2));
            System.out.println(isim1.substring(0,isim1.length()/2).concat(isim2). concat(isim1.substring(isim1.length()/2)) );
       } else if (isim1.length() % 2 != 0) {

            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik ");
        }


    }
}

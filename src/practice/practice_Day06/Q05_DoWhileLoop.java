package practice.practice_Day06;

import java.util.Scanner;

public class Q05_DoWhileLoop {

    /*
       Ask user to enter a word. If the word has odd number of characters
        and has 3 or more characters,
        print the character in the middle of the word.
        the word has even number of character print "You entered wrong word."


            INPUT      :   celik
            OUTPUT     :   l
            INPUT      :   elif
            OUTPUT     :   You entered wrong word.*/
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String kelime = "";

        do {
            System.out.println("Lütfen bir kelime giriniz ");
            kelime = scan.next();

            if (kelime.length() >= 3 && kelime.length() % 2 == 1) {
                System.out.println("Girdiginiz kelimenin ortasindaki harf: " + kelime.charAt(kelime.length() / 2));

            } else if (kelime.length() < 3 || kelime.length() % 2 == 0) {

                System.out.println("You entered wrong word");

            }


        } while (!(kelime.length() >= 3 && kelime.length() % 2 == 1));


    }


}

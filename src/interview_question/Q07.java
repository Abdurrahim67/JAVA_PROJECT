package interview_question;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        //Kullanicidan bir String isteyin ve Stringi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen bir String giriniz");
        String str= scan.next();
        System.out.println("Girdiginiz kelime: "+str);

        String tersStr="";

        for (int i = str.length()-1; i >=0 ; i--) {

            tersStr+=str.charAt(i);

        }
        System.out.println("Girdiginiz kelimenin tersten yazilisi: "+tersStr);

        }


    }


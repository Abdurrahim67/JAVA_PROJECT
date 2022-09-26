package repeat.repeatDay05;

public class R0501 {

    public static void main(String[] args) {

        int sayi1=10;
        int sayi2=sayi1+1;  //sayi2--> 11

        sayi2+=5; // sayi2-->16

        int sayi3=sayi2++;

        System.out.println("sayi3: "+sayi3); // sayi3-->16
        System.out.println("sayi2: "+sayi2); // sayi2-->17

        int sayi4=++sayi1;

        System.out.println("sayi4: "+sayi4); // sayi4-->11
        System.out.println("sayi1: "+sayi1); //sayi1-->11

    }



}

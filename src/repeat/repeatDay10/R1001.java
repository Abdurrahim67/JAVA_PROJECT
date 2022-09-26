package repeat.repeatDay10;

public class R1001 {

    public static void main(String[] args) {

        String str="Java ogrenmek ne güzel";
        System.out.println(str.charAt(0));//J
        System.out.println(str.toUpperCase().charAt(7));// R
        System.out.println(str.toUpperCase().charAt(9));// N
        System.out.println(str.toUpperCase().charAt(10));//M
        System.out.println(str.toUpperCase().charAt(4));// hiclik
        System.out.println(str.charAt(24)); // StringIndexOutOfBoundsException


    }
}

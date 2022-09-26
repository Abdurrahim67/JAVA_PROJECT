package practice;

public class recursive_method {
    public static void main(String[] args) {

        long number;
        System.out.println(faktoriyel(5));

        long number1;
        System.out.println(faktoriyel1(5));
    }

    private static long faktoriyel1(long number1) { // for ile

    long fakResult=1;
        for (int i = 1; i <=number1 ; i++) {
            fakResult*=i;

        }
return fakResult;

    }


    private static long faktoriyel(long number) { // recursive ile

        if (number <= 0) return 1;
        return number * faktoriyel(number - 1);


    }
}
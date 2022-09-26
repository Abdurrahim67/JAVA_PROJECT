package team;

public class AsalSayibulma {

    public static void main(String[] args) {

        System.out.println("FOR LOOP");

        int num = 27;
        boolean flag = false;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                flag = true;
                break;
            }

        }
        if (!flag)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is nota prime number");


        System.out.println("WHILE LOOP");

        int num2 = 27;
        int i = 2;
        boolean flag2 = false;

        while (i <= num2 / 2) {
            // condition for nonprime number
            if(num%i==0) {

                flag=true;
                break;
            }
            ++i;


        }
        if(!flag)
            System.out.println(num2+" is a prime number.");
        else
            System.out.println(num2+" is not a prime number.");



    }
}

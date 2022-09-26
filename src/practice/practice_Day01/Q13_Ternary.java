package practice.practice_Day01;

public class Q13_Ternary {

    public static void main(String[] args) {

        int fiyat = 20;

        if (fiyat < 10) {
            System.out.println("ucuz");
        } else if (fiyat < 20) {
            System.out.println("normal");

        } else {
            System.out.println("pahali");


        }

        String result=(fiyat<10) ? "ucuz":fiyat<20 ? "normal":"pahali";
        System.out.println("result= "+result);

    }
}
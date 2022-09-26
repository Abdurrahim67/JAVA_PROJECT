package repeat.repeatDay17;

public class R1706 {

    public static void main(String[] args) {

         /*
        verilen string'i asagidaki gibi yazdiran bir program yazalim
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
         */

        String input="Deniz";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(input.substring(j-1,j));

            }
            System.out.println("");
        }




    }
}

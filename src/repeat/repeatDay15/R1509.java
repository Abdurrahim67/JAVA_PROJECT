package repeat.repeatDay15;

public class R1509 {
    public static void main(String[] args) {

        // 0 dan büyük 20 den kücük sayilarin faktoryelini hesaplayan bir method olustrun
        // sayi 0 ise  o faktoryel 1 e esittir yazdirin


        int input=5;

        faktoryelHesap(input);



    }

   public static void faktoryelHesap(int input) {


        int faktoryel=1;
        if(input<0 || input>20){

            System.out.println("Girilen sayinin faktoryeli hesaplanamaz");

        } else if (input==0) {
            System.out.println(" sifir sayisinin faktoryeli 1 dir");

        }else {

            for (int i = 1; i <=input ; i++) {

                faktoryel*=i;


            }
            System.out.println(faktoryel);
        }

   }


}

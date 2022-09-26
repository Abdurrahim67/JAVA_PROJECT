package repeat.repeatDay14;

public class R1402 {

    public static void main(String[] args) {


        int input=423;

        rakamlariTopla(input);

    }
    public static void rakamlariTopla(int input) {

        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;


        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;


        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("Girdiginiz "+temp+"sayisinin rakamlar toplami :"+rakamlarToplami);





    }




}

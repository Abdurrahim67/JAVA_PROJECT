package repeat.repeatDay09;

public class H0901 {
    public static void main(String[] args) {

    /*  3)  Kullanicidan bir sayi girmesini isteyin
     Girilen sayi
        10 ise "Iki basamakli en kucuk say
        100 ise "uc basamakli en kucuk sayi"
        1000 ise "dort basamakli en kucuk sayi"
        diger durumlarda "Girdigin sayiyi degistir" yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = scan.nextInt();
*/
        int input=100;

        switch (input) {
            case 10:
                System.out.println("iki basamakli en kücük sayi");
                break;
            case 100:
                System.out.println("üc basamakli en kücük sayi");
                break;

            case 1000:
                System.out.println("dort basamakli en kücük sayi");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir");
        }


    }
}

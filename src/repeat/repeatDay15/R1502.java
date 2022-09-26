package repeat.repeatDay15;

public class R1502 {
    public static void main(String[] args) {

        // 1 den 5 e kadar olan sayilari toplayalim

        int toplam = 0;

        for (int i = 0; i <= 5; i++) {
            toplam += i;

        }
        System.out.println(toplam);

        // 1 den 10 a kadar olan sayilari toplayalim

        int toplam2 = 0;

        for (int i = 0; i <= 10; i++) {

            toplam2 += i;

        }
        System.out.println(toplam2);


        // 10 dan basla 15 e kadar git(sinirlar dahil)

        int toplam3 = 0;
        for (int i = 10; i <= 15; i++) {

            toplam3 += i;


            // 100 den basla 0 a kadar 8 ile bölünebilen tamsayilari topla
        }
        System.out.println(toplam3);

        int toplam4 = 0;
        for (int i = 100; i >= 0; i--) {

            if (i % 8 == 0) {

                toplam4 += i;

            }

        }
        System.out.println(toplam4);

        // 20 ile 60 arasindaki cift sayilari toplayalim

        int toplam5=0;

        for (int i = 20; i <=60 ; i++) {

            if(i%2==0) {
                toplam5+=i;
            }


        }System.out.println(toplam5);

        // 40 ile 80 arasindaki tek sayilari toplayalim

        int toplam6=0;

        for (int i = 40; i <=80 ; i++) {

            if(i%2==1) {

                toplam6+=i;
            }

        }
        System.out.println(toplam6);

        // 1300 ile 1900 arasindaki 7 ile bölünebulen sayilari toplayalim

        int toplam7=0;

        for (int i = 1300; i <=1900 ; i++) {
            if(i%7==0){

                toplam7+=i;
            }

        } System.out.println(toplam7);

    }
}
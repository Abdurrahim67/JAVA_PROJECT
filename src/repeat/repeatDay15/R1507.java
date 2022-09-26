package repeat.repeatDay15;

public class R1507 {
    public static void main(String[] args) {

        // 200 den 1´kadar(sinirilar dahil) 8 ile bölünebilen sayilari yazdirin


        for (int i = 200; i >=1 ; i--) {

            if(i%8==0){

                System.out.print(i+" ");
            }

        }

    }
}

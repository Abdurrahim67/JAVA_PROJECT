package repeat.repeatDay10;

import java.util.Scanner;

public class H1002 {
    public static void main(String[] args) {
        //kullanicidan bir cümle ve bir kelime isteyin, kelimenin cumlede var olup olmadigini yazdirin
        
        //-Girilen kelime cümlede kullanilmamis
        //-Girilen kelime cümlede 1 kere kullanilmis
        // -Girilen kelime cümlede 1' den fazla kullanilmis
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir cümle yaziniz ");
        String cümle=scan.nextLine().toLowerCase();
        System.out.println("LÜtfen bir kelime giriniz");
        String kelime=scan.nextLine().toLowerCase();


        
       /* if(cümle.indexOf(kelime)==-1){
            System.out.println("Girilen kelime cümlede kullanilmamis");
        } else if ( cümle.indexOf(kelime)==  ) {

        }
*/

    }
}

package repeat.repeatDay32;

public class R3203 {

    public static void main(String[] args) {
        
        String input="Hey gidi for loop günleri";
        String tersInput=tersineCevir1(input);
        System.out.println(tersInput);

        
    }

   public static String tersineCevir1(String input) {

       StringBuilder sb= new StringBuilder(input);
       return sb.reverse().toString();


    }
}

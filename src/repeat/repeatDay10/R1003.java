package repeat.repeatDay10;

public class R1003 {

    public static void main(String[] args) {

        String str1 = "Mehmet Ali";
        String str2 = "Mehmet ALI";
        String str3 = "Mehmet Ali" + "";
        String str4 = "Mehmet Ali";
        String str5 = new String("Ali Can");

        System.out.println(str1 == str2); // false

        System.out.println(str1 == str3); // true
        System.out.println(str1.equals(str3)); //true

        System.out.println(str1 == str5); //false
        System.out.println(str1.equals(str5)); //false


    }
}

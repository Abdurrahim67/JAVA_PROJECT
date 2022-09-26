package repeat.repeatDay10;

public class R1004 {
    public static void main(String[] args) {

        String str1="Mehmet Ali";
        String str2="Mehmet ali";
        String str3="MEHMET ALI";
        String str4="Mehmet Ali_";

        System.out.println(str1.equals(str2)); //false
        System.out.println(str1.equalsIgnoreCase(str2)); //true

        System.out.println(str2.equals(str3)); // false
        System.out.println(str2.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equals(str4)); // false
        System.out.println(str1.equalsIgnoreCase(str4));//false




    }



}

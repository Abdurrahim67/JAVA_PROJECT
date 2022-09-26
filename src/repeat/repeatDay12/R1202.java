package repeat.repeatDay12;

public class R1202 {

    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        /*

             \\s : bosluk
             \\S: bosluk disindaki tum karakterler
             \\w:harfler ve rakamlar
             \\W: harfler ve rakamlar disindaki her sey
             \\d: rakamlar
             \\D:rakamlar disindaki

*/
        str=str.replace(" ","qaywsx");
        System.out.println(str);

        str = str.replaceAll("\\W", "");
        System.out.println(str);

        str=str.replaceAll("\\d","");
        System.out.println(str);

        str=str.replace("qaywsx"," ");
        System.out.println(str);


    }

}

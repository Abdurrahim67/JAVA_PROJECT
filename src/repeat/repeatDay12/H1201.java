package repeat.repeatDay12;

public class H1201 {
    public static void main(String[] args) {
        // " Java ogrenmek123 Cok guzel@ "--> Java ogrenmek cok guzel

        String str = " Java ogrenmek123 Cok guzel@ ";

        str = str.replaceAll(" ", "qaywsx");
        System.out.println(str);

        str = str.replaceAll("\\W", "");
        System.out.println(str);

        str = str.replaceAll("\\d", "");
        System.out.println(str);

        str = str.replaceAll("qaywsx", " ");
        System.out.println(str);

        str = str.trim();
        System.out.println(str);

    }
}

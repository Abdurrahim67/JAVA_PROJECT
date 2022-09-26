package repeat.repeatDay22;

import java.util.ArrayList;
import java.util.List;

public class R2207 {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("ahmet");
        isimler.add("mehmet");
        isimler.add("cemil");
        isimler.add("kerem");
        isimler.add("nazmi");
        isimler.add("kemal");

        System.out.println(isimler);

        List<String> yeniIsimler = new ArrayList<>();

        yeniIsimler.add("ali");
        yeniIsimler.add("veli");
        yeniIsimler.add("lale");
        yeniIsimler.add("mahmut");
        yeniIsimler.add("leman");

        System.out.println(yeniIsimler);

        isimler.addAll(yeniIsimler);

        System.out.println(isimler);

        isimler.addAll(1,yeniIsimler);
        System.out.println(isimler);

        System.out.println(isimler.get(2));
        System.out.println(isimler.size());



    }
}

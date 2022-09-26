package repeat.repeatDay12;

public class R1201 {

    public static void main(String[] args) {

        String str="Bu gun ha va cok guz el";
        System.out.println(str.replace(" ",""));

        System.out.println(str.replace("ha va","java").replace(" ",""));

        System.out.println(str.replace("guz el","harika").replace(" ",""));

        str=str.replace("Bu gun","bugun")
                .replace("ha va","hava")
                .replace("guz el","guzel");

        System.out.println(str);

    }
}

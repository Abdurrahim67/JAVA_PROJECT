package team;

import java.util.ArrayList;
import java.util.List;

public class Array3 {


    public static void main(String[] args) {


    /* Problem tanımı:
      Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
      String parametreli return type li reverseWord isminde bir method yazınız
       Test DAta :
      İnput : Java cok güzel
      Output : güzel cok Java
       */
        String str = "Java cok güzel";
        System.out.println(terstenStr(str));
    }

    public static List<String> terstenStr(String str) {
        String[] yeniArr = str.split(" ");
        List<String> yeniList = new ArrayList<>();
        for (int i = yeniArr.length - 1; i >= 0; i--) {
            yeniList.add(yeniArr[i]);
        }
        return yeniList;
    }
}

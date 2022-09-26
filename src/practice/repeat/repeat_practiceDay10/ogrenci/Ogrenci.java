package practice.repeat.repeat_practiceDay10.ogrenci;

public class Ogrenci {


    String isim;
    String soyisim;
    int sinif;
    String sube;
    int okulNo;

    public Ogrenci(String isim, String soyisim, int sinif, String sube, int okulNo) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.sinif = sinif;
        this.sube = sube;
        this.okulNo = okulNo;


    }

    @Override
    public String toString() {
        return  "\n--Ogrenci--" +
                "\nisim=" + isim +
                "\nsoyisim=" + soyisim +
                "\nsinif=" + sinif +
                "\nsube=" + sube +
                "\nokulNo=" + okulNo ;
    }
}




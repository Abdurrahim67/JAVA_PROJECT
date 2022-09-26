package practice.repeat.repeat_practiceDay10.okul_proje2;

public class OgretmenBilgileri1 {

        String isim;
        String soyisim;
        int yas;
        String brans;
        String tel;

    public OgretmenBilgileri1(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "OgretmenBilgileri1{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nyas=" + yas +
                ", \nbrans='" + brans + '\'' +
                ", \ntel='" + tel + '\'' +
                '}';
    }
}

package practice.repeat.repeat_okul_proje;

import practice.day12_okulProje.Kisi;

public class Ogretmen1 extends Kisi {

    private String bolum;
    private String sicilNo;

    public Ogretmen1() {

    }

    public Ogretmen1(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;


    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return
                "Ogretmen1{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo +
                '}'+super.toString();
    }
}

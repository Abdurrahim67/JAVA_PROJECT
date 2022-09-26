package repeat.repeatDay26;

public class Ogretmen {

    String isim = "Isim belirtilmedi";
    String soyisim = "Soyisim belirtilmedi";
    String dogumTraihi = "Brans belirtilmedi";
    String yanBrans = "Yan brans belirtilmedi";

    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumTraihi, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTraihi = dogumTraihi;
        this.yanBrans = yanBrans;
    }

    public Ogretmen(String isim, String soyisim, String dogumTraihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTraihi = dogumTraihi;
    }

    @Override
    public String toString() {
        return
                "\nisim: " + isim +
                "\nsoyisim: " + soyisim +
                "\ndogumTraihi: " + dogumTraihi +
                "\nyanBrans: " + yanBrans;

    }
}

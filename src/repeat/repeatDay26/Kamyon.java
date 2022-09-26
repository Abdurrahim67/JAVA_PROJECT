package repeat.repeatDay26;

public class Kamyon {


    public String marka ="Marka belirtilmedi";
    public String model ="Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Kamyon(String markaK, String modelK, int yilK, int fiyatK) {

        marka=markaK;
        model=modelK;
        yil=yilK;
        fiyat=fiyatK;


    }

    public Kamyon(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Kamyon() {

    }

    @Override
    public String toString() {
        return
                "\nmarka=" + marka +
                "\nmodel=" + model +
                "\nyil=" + yil +
                "\nfiyat=" + fiyat ;

    }
}

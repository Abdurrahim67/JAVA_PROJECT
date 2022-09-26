package practice.repeat.repeat_practiceDay09.restaurant;

public class R01_Mutfak {


    String yemekler="adana,urfa,kusbasi,kusleme";
    String araSicak="yaylaCorba,mercimek,duguncorba,corba";
    String tatlilar="baklava,sütlac,kazandibi,künefe";
    String icecekeler="ayran,salgam,kola,";

    public R01_Mutfak(String adana, String mercimek, String künefe, String salgam) {

        this.yemekler=adana;
        this.araSicak=mercimek;
        this.tatlilar=künefe;
        this.icecekeler=salgam;

    }

    public R01_Mutfak() {

    }

    @Override
    public String toString() {
        return "R01_Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ",\n araSicak='" + araSicak + '\'' +
                ",\n tatlilar='" + tatlilar + '\'' +
                ",\n icecekeler='" + icecekeler + '\'' +
                '}';
    }
}

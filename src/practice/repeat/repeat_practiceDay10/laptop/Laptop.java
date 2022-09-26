package practice.repeat.repeat_practiceDay10.laptop;

public class Laptop {

    String Laptop = "GIRILMEDI";
    String BetriebsSystem = "GIRILMEDI";
    String Speicher = "GIRILMEDI";
    String Prozessor = "GIRILMEDI";
    String SpeicherKapazität = "GIRILMEDI";
    String Bildschirm = "GIRILMEDI";


    public Laptop(String laptopAdi, String betriebsSystem, String speicher, String speicherKapazität) {
        this.Laptop = laptopAdi;
        BetriebsSystem = betriebsSystem;
        Speicher = speicher;
        SpeicherKapazität = speicherKapazität;
    }

    public Laptop(String laptopAdi, String betriebsSystem, String speicher, String prozessor, String speicherKapazität, String bildschirm) {
        this.Laptop = laptopAdi;
        BetriebsSystem = betriebsSystem;
        Speicher = speicher;
        Prozessor = prozessor;
        SpeicherKapazität = speicherKapazität;
        Bildschirm = bildschirm;
    }

    public Laptop() {
    }

    @Override
    public String toString() {
        return
                        "\nLaptop=" + Laptop +
                        "\nBetriebsSystem=" + BetriebsSystem +
                        "\nSpeicher=" + Speicher +
                        "\nProzessor=" + Prozessor +
                        "\nSpeicherKapazität=" + SpeicherKapazität +
                        "\nBildschirm=" + Bildschirm;
    }
}



package command;

public class Stereo {
    int volume;
    String cd;
    String dvd;
    String ratio;
    String place;

    public Stereo(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(place + " stereo on!");
    }
    public void off() {
        System.out.println(place + " stereo off!");
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

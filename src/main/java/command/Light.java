package command;

// Light这里扮演的是接收者的角色
public class Light {
    private String place;

    public Light(String place) {
        this.place = place;
    }

    public void on() {
        System.out.println(place + " light on!");
    }

    public void off() {
        System.out.println(place + " light off!");
    }
}

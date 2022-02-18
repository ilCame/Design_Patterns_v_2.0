package command.objects;

public class Light {
    public Boolean lightOnOff = false;

    public void on() {
        lightOnOff = true;
    }

    public void off() {
        lightOnOff = false;
    }
}

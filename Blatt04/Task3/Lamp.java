package Blatt04.Task3;

public class Lamp implements Switchable , Dimmable {
    boolean on;
    int brightness;

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public void setBrightness(int level) {
        if (on && level>= 0 && level <= MAX_BRIGHTNESS) {
            this.brightness = level;
            return;
        }
        else return;
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    public void dimToHalf() {
        brightness = MAX_BRIGHTNESS / 2;
    }
}
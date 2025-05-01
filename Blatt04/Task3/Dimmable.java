package Blatt04.Task3;

public interface Dimmable {
    final int MAX_BRIGHTNESS = 100;
    void setBrightness(int level);
    int getBrightness();
    void dimToHalf();
}

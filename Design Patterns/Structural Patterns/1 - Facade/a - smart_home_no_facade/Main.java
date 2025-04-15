// Klijent mora sve da pozove ručno:
public class Main {
    public static void main(String[] args) {
        Lights lights = new Lights();
        TV tv = new TV();
        SoundSystem sound = new SoundSystem();
        AirConditioner ac = new AirConditioner();

        lights.dim();
        tv.on();
        sound.setVolume(15);
        ac.setTemperature(22);
    }
}

// Facade klasa
public class HomeTheaterFacade {
    private Lights lights;
    private TV tv;
    private SoundSystem sound;
    private AirConditioner ac;

    public HomeTheaterFacade() {
        lights = new Lights();
        tv = new TV();
        sound = new SoundSystem();
        ac = new AirConditioner();
    }

    public void startMovieNight() {
        lights.dim();
        tv.on();
        sound.setVolume(15);
        ac.setTemperature(22);
        System.out.println("Movie night started!");
    }

    public void endMovieNight() {
        System.out.println("Shutting everything down...");
    }
}
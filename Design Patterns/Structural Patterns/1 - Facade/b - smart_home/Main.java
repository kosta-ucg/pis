

// Klijent koristi samo Facade
public class Main {
    public static void main(String[] args) {
        HomeTheaterFacade home = new HomeTheaterFacade();
        home.startMovieNight();
    }
}

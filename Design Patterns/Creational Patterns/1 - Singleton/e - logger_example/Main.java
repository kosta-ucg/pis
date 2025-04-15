public class Main {
    public static void main(String[] args) {
        // Dobijamo istu instancu Logger-a u cijelom sistemu
        Logger logger = Logger.getInstance();
        
        logger.log("Aplikacija je pokrenuta.");
        logger.log("Korisnik se prijavio.");
        logger.log("Desila se greška: Nevalidan unos.");

        // Zatvaranje Logger-a na kraju
        logger.close();
    }
}

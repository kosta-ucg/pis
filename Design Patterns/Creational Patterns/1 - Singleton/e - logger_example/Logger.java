import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

class Logger {
    private static final Logger instance = new Logger(); // Privatna statička instanca
    private PrintWriter writer;     // Objekat za pisanje u fajl

    // Privatni konstruktor - sprječava direktno kreiranje objekata
    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("log.txt", true)); // Append mode
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metoda za dobijanje instance Singleton-a (thread-safe)
    public static Logger getInstance() {
        return instance;
    }

    // Metoda za zapisivanje poruke u log
    public void log(String message) {
        String timestamp = LocalDateTime.now().toString();
        writer.println(timestamp + " - " + message);
        writer.flush(); // Obezbjeđuje da se podaci odmah upišu u fajl
    }

    // Zatvaranje fajla pri gašenju aplikacije
    public void close() {
        writer.close();
    }
}

// Klasa Singleton
class Singleton {
    private static Singleton instance; // Privatna statička instanca

    // Privatni konstruktor sprječava direktno instanciranje
    private Singleton() {
        System.out.println("Singleton instanca kreirana!");
    }

    // Metoda za dobijanje instance (Lazy Initialization)
    public static Singleton getInstance() {
        if (instance == null) { // Ako instanca ne postoji, kreiraj je
            instance = new Singleton();
        }
        return instance;
    }

    // Metoda za demonstraciju
    public void showMessage() {
        System.out.println("Pozdrav iz Singleton-a!");
    }
}

/**
 * Problem sa ovim pristupom je što nije thread-safe. 
 * Ako više niti istovremeno pozove getInstance(), može doći do stvaranja više instanci Singleton-a.
 */

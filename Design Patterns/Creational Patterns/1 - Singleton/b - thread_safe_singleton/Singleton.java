class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instanca kreirana!");
    }

    // Thread-safe pristup instanci
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

/**
 * Sada je Singleton thread-safe, ali može biti spor zbog synchronized metode.
 */

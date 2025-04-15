class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Singleton instanca kreirana!");
    }

    public static Singleton getInstance() {
        /* Brže od synchronized metode jer se zaključavanje vrši samo prilikom prve kreacije instance. */
        if (instance == null) {  // Prva provjera (bez zaključavanja)
            synchronized (Singleton.class) {
                if (instance == null) {  // Druga provjera (sa zaključavanjem)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

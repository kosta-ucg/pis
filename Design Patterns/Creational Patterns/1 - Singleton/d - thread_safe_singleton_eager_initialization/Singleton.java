class Singleton {
    private static final Singleton instance = new Singleton();
    // najsigurniji pristup - nema problema sa nitima
    private Singleton() {
        System.out.println("Singleton instanca kreirana!");
    }

    public static Singleton getInstance() {
        return instance;
    }
}

class Document implements Prototype {
    private String title;
    private String type;
    private int size;
    private String author;

    // Konstruktor
    public Document(String title, String type, int size, String author) {
        this.title = title;
        this.type = type;
        this.size = size;
        this.author = author;
    }

    // Implementacija kloniranja
    /**
     * Metoda clone() vraća novu instancu Document sa istim podacima.
     * Ne koristimo new Document(...) u klijent kodu, već samo clone()!
     */
    @Override
    public Document clone() {
        return new Document(this.title, this.type, this.size, this.author);
    }

    // Prikaz dokumenta
    public void showDocument() {
        System.out.println("Dokument: " + title + " (" + type + "), " + size + "KB, Autor: " + author);
    }
}

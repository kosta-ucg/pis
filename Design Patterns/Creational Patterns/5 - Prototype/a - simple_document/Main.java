public class Main {
    public static void main(String[] args) {
        // Kreiranje originalnog dokumenta
        Document originalDoc = new Document("Ugovor", "PDF", 120, "Marko");

        // Kloniranje dokumenta
        Document clonedDoc = originalDoc.clone();

        // Prikaz originala i kopije
        originalDoc.showDocument();
        clonedDoc.showDocument();
    }
}

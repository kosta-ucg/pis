public class DocumentDemo {
    public static void main(String[] args) {
        Document document = new Document();

        // Početno stanje je Draft
        System.out.println("Document is in Draft state.");
        document.edit(); // Možemo uređivati
        document.submitForReview(); // Šaljemo na pregled

        // Prelazak u Review stanje
        System.out.println("\nDocument is in Review state.");
        document.edit(); // Vraćamo se na Draft ako želimo da uređujemo
        document.publish(); // Objavljujemo dokument

        // Prelazak u Published stanje
        System.out.println("\nDocument is in Published state.");
        document.edit(); // Ne možemo uređivati, dokument je objavljen
    }
}

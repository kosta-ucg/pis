import java.util.ArrayList;
import java.util.List;

class Document implements Prototype {
    private String title;
    private List<String> images;

    public Document(String title, List<String> images) {
        this.title = title;
        this.images = images;
    }

    /**
     * Kada kloniramo objekat, moramo voditi računa da li sadrži referencirane objekte (npr. liste, nizove, podobjekte).
     * Promjene u kopiji utiču na original
     */
    @Override
    public Document clone() {
        //return new Document(this.title, this.images); // Shallow copy - lista se ne kopira dubinski.
        List<String> copiedImages = new ArrayList<>(this.images); // Deep Copy liste
        return new Document(this.title, copiedImages); // Sada su original i kopija potpuno nezavisni.
    }

    public void addImage(String image) {
        images.add(image);
    }

    public void showDocument() {
        System.out.println("Dokument: " + title + ", Slike: " + images);
    }
}

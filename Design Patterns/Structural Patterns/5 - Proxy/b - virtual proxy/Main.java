public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("slika1.jpg");
        Image image2 = new ProxyImage("slika2.jpg");

        System.out.println("Galerija prikazuje placeholder...");
        // Slike još nisu učitane

        System.out.println("Klik na sliku 1:");
        image1.display(); // sada se učitava i prikazuje

        System.out.println("Ponovni klik na sliku 1:");
        image1.display(); // već je učitana, samo se prikazuje

        System.out.println("Klik na sliku 2:");
        image2.display(); // tek sad se učitava slika 2
    }
}

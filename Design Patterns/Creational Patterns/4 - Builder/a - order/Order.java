import java.util.ArrayList;
import java.util.List;

class Order {
    private String mainDish;  // Obavezno
    private String drink;      // Opciono
    private String dessert;    // Opciono
    private List<String> sides; // Lista priloga
    private String specialRequest; // Napomena za kuvara

    // Privatni konstruktor - samo Builder može da ga pozove
    private Order(OrderBuilder builder) {
        this.mainDish = builder.mainDish;
        this.drink = builder.drink;
        this.dessert = builder.dessert;
        this.sides = builder.sides;
        this.specialRequest = builder.specialRequest;
    }

    // Metoda za prikaz narudžbine
    public void showOrder() {
        System.out.println("Narudžbina:");
        System.out.println("Glavno jelo: " + mainDish);
        if (drink != null) System.out.println("Pice: " + drink);
        if (dessert != null) System.out.println("Desert: " + dessert);
        if (!sides.isEmpty()) System.out.println("Prilozi: " + String.join(", ", sides));
        if (specialRequest != null) System.out.println("Napomena: " + specialRequest);
    }

    /**
     * Builder klasa (unutrašnja klasa)
     * OrderBuilder je direktno povezan sa Order klasom i nema smisla koristiti ga izvan nje 
     * Unutrašnja klasa ima pristup svim privatnim poljima spoljašnje klase (Order), što omogućava jednostavno postavljanje vrednosti bez dodatnih setter metoda.
     * Kada je OrderBuilder unutrašnja klasa, možemo koristiti fluent style kod. */
    public static class OrderBuilder {
        private String mainDish;
        private String drink;
        private String dessert;
        private List<String> sides = new ArrayList<>();
        private String specialRequest;

        // Obavezni parametar
        public OrderBuilder(String mainDish) {
            this.mainDish = mainDish;
        }

        // Opciono - dodajemo piće
        public OrderBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        // Opciono - dodajemo desert
        public OrderBuilder setDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        // Opciono - dodajemo prilog (može se pozvati više puta)
        public OrderBuilder addSide(String side) {
            this.sides.add(side);
            return this;
        }

        // Opciono - dodajemo posebnu napomenu
        public OrderBuilder setSpecialRequest(String request) {
            this.specialRequest = request;
            return this;
        }

        // Kreiramo finalni objekat Order
        public Order build() {
            return new Order(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Kreiranje kompleksne narudžbine (fluent style kod .set().set().set()...)
        Order myOrder = new Order.OrderBuilder("Burger")
                .setDrink("Cola")
                .setDessert("Cheesecake")
                .addSide("Pomfrit")
                .addSide("Kisjeli krastavci")
                .setSpecialRequest("Bez luka, molim.")
                .build(); // Kreiramo finalnu narudžbinu

        myOrder.showOrder(); // Ispisujemo narudžbinu
    }
}

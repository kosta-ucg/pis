// Sada klijent kod ne zavisi od konkretnih klasa!
public class Main2 {
    public static void main(String[] args) {
        // Klijent traži vozilo po stringu, ne koristi `new`
        VehicleFactory factory = VehicleFactoryProvider.getFactory("car");
        Vehicle car = factory.createVehicle();
        car.drive();

        factory = VehicleFactoryProvider.getFactory("motorcycle");
        Vehicle motorcycle = factory.createVehicle();
        motorcycle.drive();

        factory = VehicleFactoryProvider.getFactory("truck");
        Vehicle truck = factory.createVehicle();
        truck.drive();
    }
}

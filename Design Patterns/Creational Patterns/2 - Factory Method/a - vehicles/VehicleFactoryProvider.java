import java.util.HashMap;
import java.util.Map;

// Centralna fabrika koja bira odgovarajuću fabriku
class VehicleFactoryProvider {
    private static final Map<String, VehicleFactory> factories = new HashMap<>();

    // Registrujemo fabrike
    static {
        factories.put("car", new CarFactory());
        factories.put("motorcycle", new MotorcycleFactory());
        factories.put("truck", new TruckFactory());
    }

    // Klijent samo traži vozilo po imenu – ne zna konkretne klase!
    public static VehicleFactory getFactory(String type) {
        return factories.get(type.toLowerCase());
    }
}
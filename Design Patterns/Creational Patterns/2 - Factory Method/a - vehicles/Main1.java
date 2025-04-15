public class Main1 {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        VehicleFactory motorcycleFactory = new MotorcycleFactory();

        Vehicle car = carFactory.createVehicle();
        Vehicle motorcycle = motorcycleFactory.createVehicle();

        car.drive();        
        motorcycle.drive();
    }
}


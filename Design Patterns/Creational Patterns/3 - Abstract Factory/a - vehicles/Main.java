public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Seat carSeat = carFactory.createSeat();
        Engine carEngine = carFactory.createEngine();

        VehicleFactory motoFactory = new MotorcycleFactory();
        Seat motoSeat = motoFactory.createSeat();
        Engine motoEngine = motoFactory.createEngine();

        carSeat.sit();      
        carEngine.start();  

        motoSeat.sit();      
        motoEngine.start(); 
    }
}

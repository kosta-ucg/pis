class CarFactory implements VehicleFactory {
    @Override
    public Seat createSeat() {
        return new CarSeat();
    }

    @Override
    public Engine createEngine() {
        return new CarEngine();
    }
}
class MotorcycleFactory implements VehicleFactory {
    @Override
    public Seat createSeat() {
        return new MotorcycleSeat();
    }

    @Override
    public Engine createEngine() {
        return new MotorcycleEngine();
    }
}

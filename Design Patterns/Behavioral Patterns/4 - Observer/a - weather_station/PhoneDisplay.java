//ConcreteObserver
class PhoneDisplay implements Observer {

    @Override
    public void update(float temperature) {       
        System.out.println("Phone display: temperature is now " + temperature + "°C");
    }
}
//ConcreteObserverr
class WebAppDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("Web app shows updated temperature: " + temperature + "°C");
    }
}

import java.util.*;
// ConcreteSubject
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}

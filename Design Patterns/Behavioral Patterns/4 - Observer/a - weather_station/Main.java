public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer web = new WebAppDisplay();

        station.registerObserver(phone);
        station.registerObserver(web);

        station.setTemperature(22.5f);
        station.setTemperature(25.0f);
    }
}

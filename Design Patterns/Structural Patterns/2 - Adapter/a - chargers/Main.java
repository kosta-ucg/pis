public class Main {
    public static void main(String[] args) {
        EUPlug euPlug = new EUPlug();
        USPlug adapter = new EUToUSAdapter(euPlug);

        Device device = new Device();
        device.plugIn(adapter);
    }
}

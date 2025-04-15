// Klijent (kreira komande i povezuje ih sa Invoker-om)
public class CommandPatternExample {
    public static void main(String[] args) {
        Television tv = new Television();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);

        RemoteControl remote = new RemoteControl();
        
        // Korišćenje komandi
        remote.setCommand(turnOn);
        remote.pressButton(); // Ispisuje: "TV is now ON."

        remote.setCommand(turnOff);
        remote.pressButton(); // Ispisuje: "TV is now OFF."
    }
}

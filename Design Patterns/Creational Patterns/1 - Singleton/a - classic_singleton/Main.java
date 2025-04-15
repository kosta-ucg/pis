public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();

        System.out.println("s1 i s2 su iste instance? " + (s1 == s2));
    }
}
public class Main1 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new Motorcycle();
        Vehicle vehicle3 = new Car();
        
        /***
         * Ako bi se Car i Motorcycle klase promijenile tako da vise ne koriste default konstruktor
         * nego joj se dodaju neka polja npr. isElectric, comsumption itd, mora se u svakom klijentu promijeniti logika za pravljenje objekata.
         * Ako ima 10 mjesta gdje se new Car() koristi – sve se mora mijenjati ručno. 
         * To je naporno, sklono greškama, i krši SRP i OCP.
         */
    }
}


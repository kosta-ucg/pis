public class ATMDemo {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard();
        
        atm.enterPin(1234);

        atm.withdrawCash(1000);

        atm.withdrawCash(500); // Novac je već podignut
    }
}

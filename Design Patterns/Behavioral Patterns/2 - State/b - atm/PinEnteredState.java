class PinEnteredState implements ATMState {
    private ATM atm;

    public PinEnteredState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card is already inserted.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Pin already entered.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Withdrawing " + amount + " units of cash.");
        atm.setState(atm.getCashWithdrawnState()); // Prelazimo na stanje gdje je novac podignut
    }
}

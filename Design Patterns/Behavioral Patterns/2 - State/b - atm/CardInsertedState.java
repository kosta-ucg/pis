class CardInsertedState implements ATMState {
    private ATM atm;

    public CardInsertedState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card is already inserted.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Pin entered: " + pin);
        atm.setState(atm.getPinEnteredState()); // Prelazimo na stanje gdje je PIN unesen
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Enter pin first.");
    }
}

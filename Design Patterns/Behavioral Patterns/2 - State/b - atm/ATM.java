class ATM {
    private ATMState cardInsertedState;
    private ATMState pinEnteredState;
    private ATMState cashWithdrawnState;

    private ATMState currentState;

    public ATM() {
        cardInsertedState = new CardInsertedState(this);
        pinEnteredState = new PinEnteredState(this);
        cashWithdrawnState = new CashWithdrawnState(this);

        currentState = cardInsertedState; // Početno stanje je kada kartica nije ubačena
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withdrawCash(amount);
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public ATMState getCardInsertedState() {
        return cardInsertedState;
    }

    public ATMState getPinEnteredState() {
        return pinEnteredState;
    }

    public ATMState getCashWithdrawnState() {
        return cashWithdrawnState;
    }
}

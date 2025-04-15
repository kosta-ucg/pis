interface ATMState {
    void insertCard();
    void enterPin(int pin);
    void withdrawCash(int amount);
}

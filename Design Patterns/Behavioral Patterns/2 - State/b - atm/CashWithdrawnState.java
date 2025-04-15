class CashWithdrawnState implements ATMState {
    private ATM atm;

    public CashWithdrawnState(ATM atm) {
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Please take your cash first.");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("Pin already entered.");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Cash already withdrawn.");
    }
}

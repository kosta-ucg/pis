// konkretna strategija
class PayWithCreditCard implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

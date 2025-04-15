// konkretna strategija
class PayWithPaypal implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
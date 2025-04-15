// kontekst
class ShoppingCart {
    private PaymentStrategy paymentStrategy;
    
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy selected!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}

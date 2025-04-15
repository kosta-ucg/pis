public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new PayWithPaypal());
        cart.checkout(50);

        cart.setPaymentStrategy(new PayWithCreditCard());
        cart.checkout(80);
    }
}

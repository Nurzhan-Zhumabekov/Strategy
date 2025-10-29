public class Main {
    public static void main(String[] args) {
        Order order = new Order(500);
        order.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "123", "12/25"));
        order.checkout();
        order.setPaymentStrategy(new CashPayment());
        order.checkout();
        order.setPaymentStrategy(new EwalletPayment("user-wallet-77"));
        order.checkout();
    }
}
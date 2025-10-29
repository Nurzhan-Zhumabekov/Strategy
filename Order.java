public class Order {
    private final double amount;
    private PaymentStrategy paymentStrategy;
    public Order(double amount) {
        this.amount = amount;
    }
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    public boolean checkout() {
        if (paymentStrategy == null) {
            System.out.println("Ошибка: способ оплаты не выбран!");
            return false;
        }
        paymentStrategy.pay(amount);
        return true;
    }
}
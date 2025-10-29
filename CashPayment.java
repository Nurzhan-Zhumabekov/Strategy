public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.printf("Оплачено %.2f наличными при получении%n", amount);
    }
}
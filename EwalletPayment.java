public class EwalletPayment implements PaymentStrategy {
    private final String walletId;

    public EwalletPayment(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Оплачено %.2f через электронный кошелёк %s%n", amount, walletId);
    }
}
public class CreditCardPayment implements PaymentStrategy {
    private final String cardNumber;
    private final String cvv;
    private final String expiryDate;

    public CreditCardPayment(String cardNumber, String cvv, String expiryDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    @Override
    public void pay(double amount) {

        System.out.printf("Оплачено %.2f с карты %s%n", amount, maskCardNumber(cardNumber));
    }

    private String maskCardNumber(String number) {
        return "****-****-****-" + number.substring(number.length() - 4);
    }
}
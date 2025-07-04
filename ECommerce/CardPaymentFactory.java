package ECommerce;

public class CardPaymentFactory extends PaymentFactory {
    @Override
    public Payment creaPagamento() {
        return new CardPayment();
    }
}

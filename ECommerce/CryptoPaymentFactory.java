package ECommerce;

public class CryptoPaymentFactory extends PaymentFactory {
    @Override
    public Payment creaPagamento() {
        return new CryptoPayment();
    }
}

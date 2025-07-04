package ECommerce;

public class PaypalPaymentFactory extends PaymentFactory{
    @Override
    public Payment creaPagamento() {
        return new PaypalPayment();
    }
}

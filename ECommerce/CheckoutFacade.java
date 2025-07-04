package ECommerce;

public class CheckoutFacade {
    public void checkout(double amount, PaymentFactory factory){
        Payment payment = factory.creaPagamento();
        payment.pay(amount);
    }
}

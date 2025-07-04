package ECommerce;

public class PaypalPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento tramite PayPal: " + amount + " Euro");
    }
}

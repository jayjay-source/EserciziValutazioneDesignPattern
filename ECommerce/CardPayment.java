package ECommerce;

public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento con carta di credito: " + amount + " Euro");
    }
}

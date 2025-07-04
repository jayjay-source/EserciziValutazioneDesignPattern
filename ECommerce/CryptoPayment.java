package ECommerce;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Pagamento in Criptovaluta: " + amount + " Euro");
    }
}

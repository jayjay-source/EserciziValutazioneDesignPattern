package ECommerce;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckoutFacade checkout = new CheckoutFacade();

        System.out.println("Benvenuto nel checkout dell'e-commerce!");
        System.out.print("Inserisci l'importo da pagare: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consuma il newline rimasto

        System.out.println("Scegli il metodo di pagamento:");
        System.out.println("1 - Carta");
        System.out.println("2 - PayPal");
        System.out.println("3 - Crypto");
        System.out.print("Scelta: ");
        String choice = scanner.nextLine();

        PaymentFactory factory;

        switch (choice) {
            case "1":
                factory = new CardPaymentFactory();
                break;
            case "2":
                factory = new PaypalPaymentFactory();
                break;
            case "3":
                factory = new CryptoPaymentFactory();
                break;
            default:
                System.out.println("Metodo di pagamento non valido.");
                scanner.close();
                return;
        }

        checkout.checkout(amount, factory);
        scanner.close();
    }
}

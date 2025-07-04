package SistemaLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginFacade loginFacade = new LoginFacade();

        System.out.println("=== Sistema di Login ===");
        System.out.print("Tipo di login (password/token/social): ");
        String tipo = scanner.nextLine();

        System.out.print("Nome utente: ");
        String user = scanner.nextLine();

        System.out.print("Credenziale (" + tipo + "): ");
        String credential = scanner.nextLine();

        boolean success = loginFacade.eseguiLogin(tipo, user, credential);

        if (success) {
            System.out.println("Login riuscito!");
        } else {
            System.out.println("Login fallito!");
        }

        scanner.close();
    }
}

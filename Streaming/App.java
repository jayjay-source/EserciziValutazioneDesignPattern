package Streaming;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Abbonamento abbonamento = new PianoBase();

        System.out.println("Composizione del tuo abbonamento streaming:");
        System.out.println("Piano base incluso: " + abbonamento.getCosto() + "€");

        System.out.print("Vuoi la qualità 4K? (Y/n): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y") || input.isBlank()) {
            abbonamento = new Qualità4K(abbonamento);
        }

        System.out.print("Vuoi rimuovere la pubblicità? (Y/n): ");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y") || input.isBlank()) {
            abbonamento = new SenzaPubblicità(abbonamento);
        }

        System.out.print("Vuoi i contenuti esclusivi? (Y/n): ");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y") || input.isBlank()) {
            abbonamento = new ContenutiEsclusivi(abbonamento);
        }

        //salvo nel Singleton
        PianoUtente.getInstance().setAbbonamento(abbonamento);

        System.out.println("Streaming.Abbonamento finale:");
        System.out.println("Descrizione: " + abbonamento.getDescrizione());
        System.out.printf("Costo totale: €%.2f\n", abbonamento.getCosto());

        scanner.close();
    }
}

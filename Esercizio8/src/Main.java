import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Ricetta> recipes = Arrays.asList(
                new Ricetta("Insalata di Quinoa", "vegana"),
                new Ricetta("Zuppa di Lenticchie", "vegana"),
                new Ricetta("Tofu alla Griglia", "vegana"),
                new Ricetta("Curry di Ceci", "vegana"),
                new Ricetta("Pasta al Pomodoro", "normale"),
                new Ricetta("Pizza Margherita", "normale"),
                new Ricetta("Lasagna Classica", "normale"),
                new Ricetta("Risotto ai Funghi", "normale"),
                new Ricetta("Pollo alla Griglia", "keto"),
                new Ricetta("Uova Strapazzate con Avocado", "keto"),
                new Ricetta("Salmone al Forno", "keto"),
                new Ricetta("Zucchine Ripiene", "keto")
        );

        String userDieta = "vegana";

        DietaStrategy strategy = DietaFactory.createStrategy(userDieta);
        RicetteConsigliate advisor = new RicetteConsigliate(strategy);

        List<Ricetta> suggerite = advisor.suggest(recipes);
        System.out.println("Ricette consigliate per la dieta " + userDieta + ":");
        suggerite.forEach(System.out::println);

        userDieta = "keto";

        strategy = DietaFactory.createStrategy(userDieta);
        advisor = new RicetteConsigliate(strategy);

        suggerite = advisor.suggest(recipes);
        System.out.println("Ricette consigliate per la dieta " + userDieta + ":");
        suggerite.forEach(System.out::println);

        userDieta = "normale";

        strategy = DietaFactory.createStrategy(userDieta);
        advisor = new RicetteConsigliate(strategy);

        suggerite = advisor.suggest(recipes);
        System.out.println("Ricette consigliate per la dieta " + userDieta + ":");
        suggerite.forEach(System.out::println);

        userDieta = "fruttariana";

        strategy = DietaFactory.createStrategy(userDieta);
        advisor = new RicetteConsigliate(strategy);

        suggerite = advisor.suggest(recipes);
        System.out.println("Ricette consigliate per la dieta " + userDieta + ":");
        suggerite.forEach(System.out::println);

    }
}

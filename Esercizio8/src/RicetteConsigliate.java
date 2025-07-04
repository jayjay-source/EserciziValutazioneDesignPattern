import java.util.List;

public class RicetteConsigliate {
    private DietaStrategy strategy;

    public RicetteConsigliate(DietaStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Ricetta> suggest(List<Ricetta> allRicette) {
        return strategy.FiltraRicette(allRicette);
    }
}

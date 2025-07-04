import java.util.List;
import java.util.stream.Collectors;

public class DietaVegana implements DietaStrategy {

    @Override
    public List<Ricetta> FiltraRicette(List<Ricetta> recipes) {
        return recipes.stream()
                .filter(r -> "vegana".equalsIgnoreCase(r.getDieta()))
                .collect(Collectors.toList());
    }
}

import java.util.List;
import java.util.stream.Collectors;

public class DietaKeto implements DietaStrategy {

    @Override
    public List<Ricetta> FiltraRicette(List<Ricetta> recipes) {
        return recipes.stream()
                .filter(r -> "keto".equalsIgnoreCase(r.getDieta()))
                .collect(Collectors.toList());
    }
}

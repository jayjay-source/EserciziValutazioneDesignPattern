import java.util.List;
//import java.util.stream.Collectors;

public class DietaNormale implements DietaStrategy {

    @Override
    public List<Ricetta> FiltraRicette(List<Ricetta> recipes) {
        return recipes.stream().toList();
                /*.filter(r -> "normale".equalsIgnoreCase(r.getDieta())).collect(Collectors.toList());*/
    }
}


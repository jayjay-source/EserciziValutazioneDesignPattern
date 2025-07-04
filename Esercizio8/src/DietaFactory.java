public class DietaFactory {
    public static DietaStrategy createStrategy(String dietaType) {
        switch (dietaType.toLowerCase()) {
            case "vegana":
                return new DietaVegana();
            case "keto":
                return new DietaKeto();
            case "normale":
                return new DietaNormale();
            default:
                throw new IllegalArgumentException("Tipo di dieta non supportato: " + dietaType);
        }
    }
}

public class Ricetta {
    private String name;
    private String dieta;

    public Ricetta(String name, String dieta) {
        this.name = name;
        this.dieta = dieta;
    }

    public String getName() {
        return name;
    }

    public String getDieta() {
        return dieta;
    }

    @Override
    public String toString() {
        return name + " (" + dieta + ")";
    }
}

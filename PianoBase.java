public class PianoBase implements Abbonamento{
    @Override
    public String getDescrizione() {
        return "Piano Base";
    }

    @Override
    public double getCosto() {
        return 12.90;
    }
}

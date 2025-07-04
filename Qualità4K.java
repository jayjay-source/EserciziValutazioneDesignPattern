public class Qualità4K extends DecoratoreAbbonamento{
    public Qualità4K(Abbonamento abbonamento) {
        super(abbonamento);
    }

    @Override
    public String getDescrizione() {
        return abbonamento.getDescrizione() + " qualità 4K";
    }

    @Override
    public double getCosto() {
        return abbonamento.getCosto() + 3.00;
    }
}

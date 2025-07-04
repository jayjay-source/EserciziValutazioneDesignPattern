public class ContenutiEsclusivi extends DecoratoreAbbonamento{
    public ContenutiEsclusivi(Abbonamento abbonamento) {
        super(abbonamento);
    }

    @Override
    public String getDescrizione() {
        return abbonamento.getDescrizione() + " contenuti esclusivi";
    }

    @Override
    public double getCosto() {
        return abbonamento.getCosto() + 4.00;
    }
}

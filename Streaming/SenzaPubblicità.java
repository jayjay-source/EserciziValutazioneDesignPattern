package Streaming;

public class SenzaPubblicità extends DecoratoreAbbonamento {
    public SenzaPubblicità(Abbonamento abbonamento) {
        super(abbonamento);
    }

    @Override
    public String getDescrizione() {
        return abbonamento.getDescrizione() + " senza pubblicità";
    }

    @Override
    public double getCosto() {
        return abbonamento.getCosto() + 2.00;
    }
}

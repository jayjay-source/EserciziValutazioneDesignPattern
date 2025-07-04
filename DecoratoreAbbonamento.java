public abstract class DecoratoreAbbonamento implements Abbonamento{
    protected Abbonamento abbonamento;

    public DecoratoreAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }
}

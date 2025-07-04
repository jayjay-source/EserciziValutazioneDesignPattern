public class AdattatoreLuci implements Observer{

    private Luci luci;

    public AdattatoreLuci(Luci luci) {
        this.luci = luci;
    }

    @Override
    public void update(String message) {
        luci.aggiornamento(message);
    }
}

package Streaming;

public class PianoUtente {
    //Qui implemento Singleton perchè mi serve una sola istanza per tutto
    private static PianoUtente instance;
    private Abbonamento abbonamento;

    private PianoUtente() {
        abbonamento = new PianoBase();
    }

    public static PianoUtente getInstance(){
        if(instance == null){
            instance = new PianoUtente();
        }
        return instance;
    }

    public Abbonamento getAbbonamento() {
        return abbonamento;
    }

    public void setAbbonamento(Abbonamento abbonamento) {
        this.abbonamento = abbonamento;
    }
}

// Subject
import java.util.ArrayList;
import java.util.List;

class Evento {
    private String nome;
    private StatoEvento stato;
    private List<Partecipante> partecipanti;

    public Evento(String nome) {
        this.nome = nome;
        this.partecipanti = new ArrayList<>();
        this.stato = new StatoInProgramma(this);  // stato iniziale
    }

    public void aggiungiPartecipante(Partecipante p) {
        partecipanti.add(p);
    }

    public void rimuoviPartecipante(Partecipante p) {
        partecipanti.remove(p);
    }

    public void notificaPartecipanti(String messaggio) {
        for (Partecipante p : partecipanti) {
            p.notifica(messaggio);
        }
    }

    public void setStato(StatoEvento nuovoStato) {
        this.stato = nuovoStato;
        notificaPartecipanti("Lo stato dell'evento \"" + nome + "\" è ora: " + stato.getNomeStato());
    }

    public void avvia() {
        stato.avvia();
    }

    public void termina() {
        stato.termina();
    }

    public String getNome() {
        return nome;
    }

    public StatoEvento getStato() {
        return stato;
    }
}

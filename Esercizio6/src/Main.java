public class Main {
    public static void main(String[] args) {
        Evento concerto = new Evento("Concerto Rock");

        Partecipante u1 = new Utente("Luca");
        Partecipante u2 = new Utente("Franco");
        Partecipante u3 = new Utente("Francesca");

        concerto.aggiungiPartecipante(u1);
        concerto.aggiungiPartecipante(u2);
        concerto.aggiungiPartecipante(u3);

        concerto.termina();
        concerto.avvia();
        concerto.avvia();

        concerto.rimuoviPartecipante(u2);

        concerto.termina();
        concerto.avvia();
        concerto.termina();
    }
}
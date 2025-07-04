class StatoTerminato implements StatoEvento {
    private Evento evento;

    public StatoTerminato(Evento evento) {
        this.evento = evento;
    }

    public void avvia() {
        System.out.println("Evento terminato. Non può essere riavviato.");
    }

    public void termina() {
        System.out.println("Evento già terminato.");
    }

    public String getNomeStato() {
        return "Terminato";
    }
}

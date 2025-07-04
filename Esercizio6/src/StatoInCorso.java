class StatoInCorso implements StatoEvento {
    private Evento evento;

    public StatoInCorso(Evento evento) {
        this.evento = evento;
    }

    public void avvia() {
        System.out.println("Evento già in corso.");
    }

    public void termina() {
        evento.setStato(new StatoTerminato(evento));
    }

    public String getNomeStato() {
        return "In Corso";
    }
}

class StatoInProgramma implements StatoEvento {
    private Evento evento;

    public StatoInProgramma(Evento evento) {
        this.evento = evento;
    }

    public void avvia() {
        evento.setStato(new StatoInCorso(evento));
    }

    public void termina() {
        System.out.println("Evento non può essere terminato prima di essere avviato.");
    }

    public String getNomeStato() {
        return "In Programma";
    }
}

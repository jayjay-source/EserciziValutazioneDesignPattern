class Utente implements Partecipante {
    private String nome;

    public Utente(String nome) {
        this.nome = nome;
    }

    public void notifica(String messaggio) {
        System.out.println(nome + " ha ricevuto la notifica: " + messaggio);
    }
}

package com.example;

public class UtenteContext {

    //creo un nome per l'utente
    private String nome;

    public String getNomeUtente(){
        return nome;
    }

    public void setNomeUtente(String nome){
        this.nome = nome;
    }
    
    //intanza privata UtenteContext
    private static UtenteContext instance;

    //costruttore privato
    private UtenteContext()
    {

    }

    //se non esiste creo l'instanza
    public static UtenteContext getInstance()
    {
        if(instance == null)
        {
            instance = new UtenteContext();
        }
        return instance;
    }

    private Stato statoAttuale;

    //imposto lo stato attuale con lo stato che riceve
    public void setStato(Stato stato){
        this.statoAttuale = stato;
    }

    //cambia lo stato e se non impostato restituisce l'else
    public void cambiaStato(){
        if( statoAttuale != null){
            System.out.println(getNomeUtente() + " sta cambiando stato....");
            statoAttuale.changeState(this);
        } else {
            System.out.println("stato non impostato");
        }
    }

    //ritorna lo stato attuale (se impostato)
    public String statoAttuale(){
        if (statoAttuale != null){
            return statoAttuale.getClass().getSimpleName();
        }else{
            return "stato non impostato";
        }
    }
}
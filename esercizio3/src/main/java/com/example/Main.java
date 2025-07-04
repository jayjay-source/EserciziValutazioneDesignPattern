package com.example;

public class Main {
    public static void main(String[] args) {
        
        //prendo l'instanza dell'Utente
        UtenteContext utenteContext = UtenteContext.getInstance();

        //imposto nome dell'utente
        utenteContext.setNomeUtente("Luca");

        //imposto lo stato iniziale a RIPOSO
        utenteContext.setStato(new StatoRiposo());


        System.out.println("Utente " + utenteContext.getNomeUtente() + ": ");
        System.out.println("---------------------------------------------");
        utenteContext.cambiaStato();
        System.out.println("---------------------------------------------");
        utenteContext.cambiaStato();
        System.out.println("---------------------------------------------");
        utenteContext.cambiaStato();
        

    }
}
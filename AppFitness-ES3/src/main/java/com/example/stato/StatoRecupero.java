package com.example;

public class StatoRecupero implements Stato{

    @Override
    public void changeState(UtenteContext utenteContext) {
        System.out.println("Stato cambiato : Fase di recupero");

        //passa allo stato successivo 
        utenteContext.setStato(new StatoRiposo());
    }
    
}

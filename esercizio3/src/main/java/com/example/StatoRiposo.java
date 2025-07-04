package com.example;

public class StatoRiposo implements Stato{

    @Override
    public void changeState(UtenteContext utenteContext) {
        System.out.println("Stato cambiato : Fase di riposo");
        
        //passa allo stato successivo 
        utenteContext.setStato(new StatoAllenamento());
    }

}

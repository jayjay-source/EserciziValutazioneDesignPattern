package com.example;

public class StatoAllenamento implements Stato{

    @Override
    public void changeState(UtenteContext utenteContext) {
        System.out.println("Stato cambiato : Fase di allenmaneto");

        //passa allo stato successivo 
        utenteContext.setStato(new StatoRecupero());
    }

    

}

package com.example.decorator;

import com.example.testo.Testo;

public class DecoratorGrassetto extends DecoratorAstratto{

    //codici che permetto l'inizio e la fine di un testo grassetto da terminale

    private static final String inizioBold = "\u001b[1m";
    
    private static final String fineBold = "\u001b[22m";

    public DecoratorGrassetto(Testo testo) {
        super(testo);
        
    }

    //stampa del testo in stile grassetto
    @Override
    public String getContenutoModificato() {
        return inizioBold + testo.getContenutoModificato() + fineBold;
    }




}

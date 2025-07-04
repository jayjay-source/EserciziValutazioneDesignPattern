package com.example.decorator;

import com.example.testo.Testo;

public class DecoratorSottolineato extends DecoratorAstratto {


    //codici che permetto l'inizio e la fine di un testo sottolineato da terminale
    private static final String inizioUnderline = "\u001b[4m";
    private static final String fineUnderline = "\u001b[24m";

    public DecoratorSottolineato(Testo testo) {
        super(testo);
    }


    //stampa del testo in stile sottolineato
    @Override
    public String getContenutoModificato() {
        return inizioUnderline + testo.getContenutoModificato() + fineUnderline;
    }
}
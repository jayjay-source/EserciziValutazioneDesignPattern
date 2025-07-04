package com.example.decorator;

import com.example.testo.Testo;

public class DecoratorCorsivo extends DecoratorAstratto{

    //codici che permetto l'inizio e la fine di un testo corsivo da terminale
    private static final String inizioItalic = "\u001b[3m";

    private static final String fineItalic = "\u001b[23m";

    public DecoratorCorsivo(Testo testo) {
        super(testo);
        
    }


    //stampa del testo in stile corsivo
    @Override
    public String getContenutoModificato() {
        return inizioItalic + testo.getContenutoModificato() + fineItalic;
    }




}

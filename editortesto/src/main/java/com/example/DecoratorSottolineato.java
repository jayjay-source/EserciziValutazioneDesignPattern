package com.example;

public class DecoratorSottolineato extends DecoratorAstratto {

    private static final String inizioUnderline = "\u001b[4m";
    private static final String fineUnderline = "\u001b[24m";

    public DecoratorSottolineato(Testo testo) {
        super(testo);
    }

    @Override
    public String getContenutoModificato() {
        return inizioUnderline + testo.getContenutoModificato() + fineUnderline;
    }
}
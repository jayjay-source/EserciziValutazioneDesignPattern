package com.example;

public class DecoratorCorsivo extends DecoratorAstratto{

    
    private static final String inizioItalic = "\u001b[3m";

    private static final String fineItalic = "\u001b[23m";

    public DecoratorCorsivo(Testo testo) {
        super(testo);
        
    }

    @Override
    public String getContenutoModificato() {
        return inizioItalic + testo.getContenutoModificato() + fineItalic;
    }




}

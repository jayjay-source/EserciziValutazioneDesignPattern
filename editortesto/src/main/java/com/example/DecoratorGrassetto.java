package com.example;

public class DecoratorGrassetto extends DecoratorAstratto{

    
    private static final String inizioBold = "\u001b[1m";
    
    private static final String fineBold = "\u001b[22m";

    public DecoratorGrassetto(Testo testo) {
        super(testo);
        
    }

    @Override
    public String getContenutoModificato() {
        return inizioBold + testo.getContenutoModificato() + fineBold;
    }




}

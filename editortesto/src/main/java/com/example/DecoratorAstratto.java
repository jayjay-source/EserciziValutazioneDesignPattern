package com.example;

public abstract class DecoratorAstratto implements Testo{

    Testo testo;

    public DecoratorAstratto(Testo testo){
        this.testo = testo;
    }


    
    @Override
    public String getContenuto(){
        return testo.getContenuto();
    }

    public abstract String getContenutoModificato();
}

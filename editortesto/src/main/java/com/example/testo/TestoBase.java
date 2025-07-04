package com.example.testo;

public class TestoBase implements Testo{
    private String contenutoTesto;

    public TestoBase(String contenutoTesto){
        this.contenutoTesto = contenutoTesto;
    }

    @Override
    public String getContenuto() {
        return contenutoTesto;
    }

    @Override
    public String getContenutoModificato() {
        return contenutoTesto;
    }
}

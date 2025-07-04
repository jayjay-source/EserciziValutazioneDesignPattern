package com.example.salvataggi;

import com.example.strategy.SalvataggioStrategy;

public class SalvataggioCriptato implements SalvataggioStrategy{

    @Override
    public void salva(String contenuto) {
        System.out.println(contenuto + " Salvato criptato");
    }
}

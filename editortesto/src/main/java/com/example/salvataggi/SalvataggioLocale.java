package com.example.salvataggi;

import com.example.strategy.SalvataggioStrategy;

public class SalvataggioLocale implements SalvataggioStrategy{

    @Override
    public void salva(String contenuto) {
        System.out.println(contenuto + " Salvato in locale");
    }
}

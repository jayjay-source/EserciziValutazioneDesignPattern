package com.example.salvataggi;

import com.example.strategy.SalvataggioStrategy;

public class SalvataggioCloud implements SalvataggioStrategy{

    @Override
    public void salva(String contenuto) {
        System.out.println(contenuto + " Salvato sul cloud");
    }
}

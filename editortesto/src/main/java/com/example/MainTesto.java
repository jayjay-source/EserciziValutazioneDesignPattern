// Main.java
package com.example;

import com.example.decorator.DecoratorCorsivo;
import com.example.decorator.DecoratorGrassetto;
import com.example.decorator.DecoratorSottolineato;
import com.example.salvataggi.SalvataggioCloud;
import com.example.salvataggi.SalvataggioCriptato;
import com.example.salvataggi.SalvataggioLocale;
import com.example.strategy.ContextStrategy;
import com.example.testo.Testo;
import com.example.testo.TestoBase;

public class MainTesto {
    public static void main(String[] args) {

        ContextStrategy contextStrategy = new ContextStrategy();
        
        Testo testoOriginale = new TestoBase("Ciao Luca");

        // testo senza stili
        System.out.println("Originale: " + testoOriginale.getContenuto());

        System.out.println("-----------------------------------------------");

        // grassetto
        Testo testoGrassetto = new DecoratorGrassetto(testoOriginale);
        System.out.println("Grassetto: " + testoGrassetto.getContenutoModificato());

        // corsivo
        Testo testoCorsivo = new DecoratorCorsivo(testoOriginale);
        System.out.println("Corsivo: " + testoCorsivo.getContenutoModificato());

        // sottolineato
        Testo testoSottolineato = new DecoratorSottolineato(testoOriginale);
        System.out.println("Sottolineato: " + testoSottolineato.getContenutoModificato());


        System.out.println("------------------------------------------------------");

        // Salvataggio locale
        contextStrategy.setStrategy(new SalvataggioLocale());
        contextStrategy.salvaTesto(testoGrassetto.getContenutoModificato());

        // Salvataggio cloud
        contextStrategy.setStrategy(new SalvataggioCloud());
        contextStrategy.salvaTesto(testoCorsivo.getContenutoModificato());

        // Salvataggio criptato
        contextStrategy.setStrategy(new SalvataggioCriptato());
        contextStrategy.salvaTesto(testoSottolineato.getContenutoModificato());
    }
}
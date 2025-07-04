// Main.java
package com.example;

public class Main {
    public static void main(String[] args) {


        
        Testo testoOriginale = new TestoBase("Ciao Luca");

        // testo senza stili
        System.out.println("Originale: " + testoOriginale.getContenuto());

        // grassetto
        Testo testoGrassetto = new DecoratorGrassetto(testoOriginale);
        System.out.println("Grassetto: " + testoGrassetto.getContenutoModificato());

        // corsivo
        Testo testoCorsivo = new DecoratorCorsivo(testoOriginale);
        System.out.println("Corsivo: " + testoCorsivo.getContenutoModificato());

        // sottolineato
        Testo testoSottolineato = new DecoratorSottolineato(testoOriginale);
        System.out.println("Sottolineato: " + testoSottolineato.getContenutoModificato());
    }
}
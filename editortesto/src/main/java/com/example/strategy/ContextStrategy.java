package com.example.strategy;

public class ContextStrategy {

    private SalvataggioStrategy salvataggioStrategy;

    //setter per quale strategia usare al momento
    public void setStrategy(SalvataggioStrategy strategy) {
        this.salvataggioStrategy = strategy;
    }

    //metodo che salva con la strategia scelta, un contenuto richimaando il metodo salva se imposttao

    public void salvaTesto(String contenuto) {
        if (salvataggioStrategy != null) {
            salvataggioStrategy.salva(contenuto);
        } else {
            System.out.println("Nessuna tipo di salvataggio selezionato");
        }
    }

}

package com.pjatk.byt.hauzdrowie.chain;

import com.pjatk.byt.hauzdrowie.model.Szczepionka;
import com.pjatk.byt.hauzdrowie.model.Zwierze;

import java.util.ArrayList;
import java.util.List;

public class SzczepionkaChain {
    private List<Szczepionka> szczepionki = new ArrayList<>();

    public void dodajSzczepionle(Szczepionka szczepionka) {
        this.szczepionki.add(szczepionka);
    }

    public void usunSzczepionke(Szczepionka szczepionka) {
        this.szczepionki.remove(szczepionka);
    }

    public List<Szczepionka> dobierzSzczepionki(Zwierze zwierze) {
        ArrayList potrzebneSzczepionki = new ArrayList<Szczepionka>();
        this.szczepionki.forEach(szczepionka -> {
            if (this.czySzczepionkaPotrzebna(zwierze)) {
                potrzebneSzczepionki.add(szczepionka);
            }
        });
        return potrzebneSzczepionki;
    }

    private boolean czySzczepionkaPotrzebna(Zwierze zwierze) {
        // algorytm jeszcze nie określony
        return true;
    }
}

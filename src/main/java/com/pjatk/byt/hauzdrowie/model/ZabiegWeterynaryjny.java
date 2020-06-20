package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ZabiegWeterynaryjny {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private TypZabiegu typ;

    @Column
    private Double cena;

    @ManyToMany(targetEntity = Wizyta.class, mappedBy = "zabiegi")
    private List<Wizyta> wykonanyPrzyWizytach;

    public enum TypZabiegu {
        ZalozenieGipsu,
        ZdjecieSzwow
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TypZabiegu getTyp() {
        return typ;
    }

    public void setTyp(TypZabiegu typ) {
        this.typ = typ;
    }

    public Double getCena() {
        return cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }
}

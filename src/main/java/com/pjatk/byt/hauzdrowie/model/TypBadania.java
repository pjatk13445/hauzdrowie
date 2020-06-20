package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypBadania {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nazwa;

    @ElementCollection
    private List<String> wynik;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<String> getWynik() {
        return wynik;
    }

    public void setWynik(List<String> wynik) {
        this.wynik = wynik;
    }
}

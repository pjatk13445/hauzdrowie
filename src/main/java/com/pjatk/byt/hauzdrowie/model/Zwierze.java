package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance
public abstract class Zwierze {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany(targetEntity = WlascicielZwierzecia.class)
    private List<WlascicielZwierzecia> wlascicielZwierzeciaList;

    @Column
    private String imie;

    @Column
    private int rokUrodzenia;

    @Column
    private int miesiacUrodzenia;

    public abstract String wymaganaSpecjalnoscLekarza();

    public static Zwierze stworzZwierze(String typ) throws Exception {
        switch (typ) {
            case "kot":
                return new Kot();
            case "pies":
                return new Pies();
        }
        throw new Exception("Błędny typ zwierzęcia");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<WlascicielZwierzecia> getWlascicielZwierzeciaList() {
        return wlascicielZwierzeciaList;
    }

    public void setWlascicielZwierzeciaList(List<WlascicielZwierzecia> wlascicielZwierzeciaList) {
        this.wlascicielZwierzeciaList = wlascicielZwierzeciaList;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public int getMiesiacUrodzenia() {
        return miesiacUrodzenia;
    }

    public void setMiesiacUrodzenia(int miesiacUrodzenia) {
        this.miesiacUrodzenia = miesiacUrodzenia;
    }

}

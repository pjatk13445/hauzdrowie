package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;

@Entity
@Inheritance
public abstract class Osoba {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String imie;

    @Column
    private String nazwisko;

    @Column
    private String numerTelefonu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(String numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }
}

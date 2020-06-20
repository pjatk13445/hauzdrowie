package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class GabinetWeterynaryjny {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nazwa;

    @Column
    private String adres;

    @ManyToMany(targetEntity = Weterynarz.class)
    private List<Weterynarz> weterynarzList;

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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Weterynarz> getWeterynarzList() {
        return weterynarzList;
    }

    public void setWeterynarzList(List<Weterynarz> weterynarzList) {
        this.weterynarzList = weterynarzList;
    }
}

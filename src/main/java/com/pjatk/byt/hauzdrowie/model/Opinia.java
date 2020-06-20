package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;

@Entity
public class Opinia {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String tresc;

    @Column
    private int ocena;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}

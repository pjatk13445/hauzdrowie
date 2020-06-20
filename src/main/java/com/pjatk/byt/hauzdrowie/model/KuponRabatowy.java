package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class KuponRabatowy {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String kod;

    @Column
    private int procentZnizki;

    @OneToOne(targetEntity = Wizyta.class, mappedBy = "kuponRabatowy")
    private Wizyta wykorzystanyWWizycie;

    public static KuponRabatowy wygenerujRabat(int procentZnizki) {
        KuponRabatowy rabat = new KuponRabatowy();
        rabat.setProcentZnizki(procentZnizki);
        rabat.setKod(UUID.randomUUID().toString());
        return rabat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProcentZnizki() {
        return procentZnizki;
    }

    public void setProcentZnizki(int procentZnizki) {
        this.procentZnizki = procentZnizki;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}

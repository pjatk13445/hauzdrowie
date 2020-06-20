package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Szczepienie {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private Szczepionka szczepionka;

    @Column
    private Date terminWykonania;

    @ManyToOne(targetEntity = Zwierze.class)
    private Zwierze zwierze;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Szczepionka getSzczepionka() {
        return szczepionka;
    }

    public void setSzczepionka(Szczepionka szczepionka) {
        this.szczepionka = szczepionka;
    }

    public Date getTerminWykonania() {
        return terminWykonania;
    }

    public void setTerminWykonania(Date terminWykonania) {
        this.terminWykonania = terminWykonania;
    }

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }
}

package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;

@Entity
@Inheritance
public abstract class Szczepionka {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String nazwa;

    public abstract boolean czyDotyczy(Zwierze zwierze) throws Exception;
}

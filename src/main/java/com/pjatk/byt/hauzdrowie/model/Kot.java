package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.Entity;

@Entity
public class Kot extends Zwierze {
    @Override
    public String wymaganaSpecjalnoscLekarza() {
        return "Kotolog :)";
    }
}

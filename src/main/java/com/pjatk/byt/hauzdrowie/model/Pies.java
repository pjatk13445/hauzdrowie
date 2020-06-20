package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.Entity;

@Entity
public class Pies extends Zwierze {
    @Override
    public String wymaganaSpecjalnoscLekarza() {
        return "Piesolog :DDD";
    }
}

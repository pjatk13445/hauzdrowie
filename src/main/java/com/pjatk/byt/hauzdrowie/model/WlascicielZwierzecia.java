package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class WlascicielZwierzecia extends Osoba {
    @Column
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

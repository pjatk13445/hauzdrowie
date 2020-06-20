package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Weterynarz extends Osoba {

    @ManyToMany(targetEntity = GabinetWeterynaryjny.class, mappedBy = "weterynarzList")
    private List<GabinetWeterynaryjny> gabinetWeterynaryjnyList;

    @ElementCollection
    private List<String> specjalizacje = new ArrayList<String>();

    public List<String> getSpecjalizacje() {
        return specjalizacje;
    }

    public void setSpecjalizacje(List<String> specjalizacje) {
        this.specjalizacje = specjalizacje;
    }
}

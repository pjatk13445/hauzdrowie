package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SzczepionkaJednorazowa extends Szczepionka {
    @ElementCollection
    private List<String> choroby = new ArrayList<>();

    @Override
    public boolean czyDotyczy(Zwierze zwierze) throws Exception {
        switch (zwierze.getClass().getCanonicalName()) {
            case "Kot":
                return true;
            case "Pies":
                return true;
        }
        throw new Exception("Nieznany typ zwierzecia");
    }
}

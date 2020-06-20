package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.Column;

public class SzczepionkaSezonowa extends Szczepionka {
    @Column
    private int coIleNalezyWykonac = 365;

    @Override
    public boolean czyDotyczy(Zwierze zwierze) throws Exception {
        return false;
    }
}

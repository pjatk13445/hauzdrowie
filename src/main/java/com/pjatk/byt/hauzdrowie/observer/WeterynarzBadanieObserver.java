package com.pjatk.byt.hauzdrowie.observer;

import com.pjatk.byt.hauzdrowie.model.Badanie;
import com.pjatk.byt.hauzdrowie.model.Weterynarz;

public class WeterynarzBadanieObserver implements BadanieObserver {
    public WeterynarzBadanieObserver(Weterynarz weterynarz) {
        this.weterynarz = weterynarz;
    }

    private Weterynarz weterynarz;

    @Override
    public void notify(Badanie badanie) {
        this.wyslijSms(weterynarz.getNumerTelefonu(), badanie);
    }

    private void wyslijSms(String numerTelefonu, Badanie badanie) {
        // wyslanie smsa...
    }
}

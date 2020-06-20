package com.pjatk.byt.hauzdrowie.observer;

import com.pjatk.byt.hauzdrowie.model.Badanie;
import com.pjatk.byt.hauzdrowie.model.WlascicielZwierzecia;

public class WlascicielZwierzeciaBadanieObserver implements BadanieObserver {

    private WlascicielZwierzecia wlascicielZwierzecia;

    public WlascicielZwierzeciaBadanieObserver(WlascicielZwierzecia wlascicielZwierzecia) {
        this.wlascicielZwierzecia = wlascicielZwierzecia;
    }

    @Override
    public void notify(Badanie badanie) {
        this.sendEmail(this.wlascicielZwierzecia.getEmail(), badanie);
    }

    private void sendEmail(String email, Badanie badanie) {
        // wysylka badania...
    }
}

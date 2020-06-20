package com.pjatk.byt.hauzdrowie.builder;

import com.pjatk.byt.hauzdrowie.model.*;

import java.util.Date;

public class RejestracjaBuilderImpl implements RejestracjaBuilder {
    @Override
    public WlascicielZwierzecia budujWlasicicelaZwierzecia(String imie, String nazwisko, String email) {
        WlascicielZwierzecia wlascicielZwierzecia = new WlascicielZwierzecia();
        wlascicielZwierzecia.setEmail(email);
        wlascicielZwierzecia.setImie(imie);
        wlascicielZwierzecia.setNazwisko(nazwisko);
        return wlascicielZwierzecia;
    }

    @Override
    public Zwierze budujZwierze(String imie, int rokUrodzenia, String gatunek) {
        Zwierze zwierze = null;
        try {
            zwierze = Zwierze.stworzZwierze(gatunek);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        zwierze.setImie(imie);
        zwierze.setRokUrodzenia(rokUrodzenia);
        return zwierze;
    }

    @Override
    public Wizyta budujWizyte(Date data, Weterynarz weterynarz) {
        Wizyta wizyta = new Wizyta();
        wizyta.setWeterynarz(weterynarz);
        wizyta.setDataIGodzinaWizyty(data);
        return wizyta;
    }

    @Override
    public Szczepienie budujSzczepienie(Szczepionka szczepionka, Date dataWykonania) {
        Szczepienie szczepienie = new Szczepienie();
        szczepienie.setSzczepionka(szczepionka);
        szczepienie.setTerminWykonania(dataWykonania);
        return szczepienie;
    }
}

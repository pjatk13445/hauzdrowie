package com.pjatk.byt.hauzdrowie.builder;

import com.pjatk.byt.hauzdrowie.model.*;

import java.util.Date;

public interface RejestracjaBuilder {
    WlascicielZwierzecia budujWlasicicelaZwierzecia(String imie, String nazwisko, String email);

    Zwierze budujZwierze(String imie, int rokUrodzenia, String gatunek);

    Wizyta budujWizyte(Date data, Weterynarz weterynarz);

    Szczepienie budujSzczepienie(Szczepionka szczepionka, Date dataWykonania);
}

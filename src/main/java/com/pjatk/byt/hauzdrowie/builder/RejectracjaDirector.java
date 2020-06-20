package com.pjatk.byt.hauzdrowie.builder;

import com.pjatk.byt.hauzdrowie.model.*;

import java.util.*;

public class RejectracjaDirector {

    private RejestracjaBuilder rejestracjaBuilder;

    public void rejestruj(
            String typRejestracji,
            String imieZwierzecia,
            int rokUrodzeniaZwierzecia,
            String gatunekZwierzecia,
            String imieWlasciciela,
            String nazwiskoWlasciciela,
            String emailWasciciela,
            Date dataWizyty,
            Weterynarz weterynarz,
            Szczepionka szczepionka,
            Date dataWykonania

    ) {
        Zwierze zwierze = this.rejestracjaBuilder.budujZwierze(imieZwierzecia, rokUrodzeniaZwierzecia, gatunekZwierzecia);
        WlascicielZwierzecia wlascicielZwierzecia = this.rejestracjaBuilder.budujWlasicicelaZwierzecia(imieWlasciciela, nazwiskoWlasciciela, emailWasciciela);
        zwierze.setWlascicielZwierzeciaList(Collections.singletonList(wlascicielZwierzecia));
        if (typRejestracji.equals("naWizyte")) {
            Wizyta wizyta = this.rejestracjaBuilder.budujWizyte(dataWizyty, weterynarz);
            wizyta.setZwierze(zwierze);
        } else if (typRejestracji.equals("naSzczepienie")) {
            Szczepienie szczepienie = this.rejestracjaBuilder.budujSzczepienie(szczepionka, dataWykonania);
            szczepienie.setZwierze(zwierze);
        }
    }
}

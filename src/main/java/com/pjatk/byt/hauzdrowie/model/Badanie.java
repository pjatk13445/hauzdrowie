package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.Date;

public class Badanie {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private Date terminWykonania;

    @Column
    private String adresPlikuPdf;

    @Column
    private Date terminWyniku;

    @Column
    private Double wartosc;

    @ManyToOne(targetEntity = TypBadania.class)
    private TypBadania typBadania;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTerminWykonania() {
        return terminWykonania;
    }

    public void setTerminWykonania(Date terminWykonania) {
        this.terminWykonania = terminWykonania;
    }

    public String getAdresPlikuPdf() {
        return adresPlikuPdf;
    }

    public void setAdresPlikuPdf(String adresPlikuPdf) {
        this.adresPlikuPdf = adresPlikuPdf;
    }

    public Date getTerminWyniku() {
        return terminWyniku;
    }

    public void setTerminWyniku(Date terminWyniku) {
        this.terminWyniku = terminWyniku;
    }

    public Double getWartosc() {
        return wartosc;
    }

    public void setWartosc(Double wartosc) {
        this.wartosc = wartosc;
    }
}

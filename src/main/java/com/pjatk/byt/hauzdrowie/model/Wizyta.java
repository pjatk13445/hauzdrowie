package com.pjatk.byt.hauzdrowie.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Wizyta {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private Date dataIGodzinaWizyty;

    // W minutach
    @Column
    private int przewidywanaDlugoscWizyty;

    @Column
    private boolean czyZaakceptowana;

    @Column
    private boolean czySieOdbyla;

    @Column
    private boolean czyOplacona;

    @OneToOne(targetEntity = Opinia.class)
    private Opinia opinia;

    @OneToOne(targetEntity = KuponRabatowy.class)
    private KuponRabatowy kuponRabatowy;

    @ManyToMany(targetEntity = ZabiegWeterynaryjny.class)
    private List<ZabiegWeterynaryjny> zabiegi;

    @ManyToOne(targetEntity = Weterynarz.class)
    private Weterynarz weterynarz;

    @ManyToOne(targetEntity = Zwierze.class)
    private Zwierze zwierze;

    public void wybierzNowyTerminWizyty(Date dataIGodzinaWizyty) {
        this.dataIGodzinaWizyty = dataIGodzinaWizyty;
    }

    public void odwolajWizyte() {
        this.czySieOdbyla = false;
    }

    public void wystawOpinie(Opinia opinia) {
        this.opinia = opinia;
    }

    public void oplac() {
        this.czyOplacona = true;
    }

    public void zaakceptuj() {
        this.czyZaakceptowana = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataIGodzinaWizyty() {
        return dataIGodzinaWizyty;
    }

    public void setDataIGodzinaWizyty(Date dataIGodzinaWizyty) {
        this.dataIGodzinaWizyty = dataIGodzinaWizyty;
    }

    public int getPrzewidywanaDlugoscWizyty() {
        return przewidywanaDlugoscWizyty;
    }

    public void setPrzewidywanaDlugoscWizyty(int przewidywanaDlugoscWizyty) {
        this.przewidywanaDlugoscWizyty = przewidywanaDlugoscWizyty;
    }

    public boolean isCzyZaakceptowana() {
        return czyZaakceptowana;
    }

    public void setCzyZaakceptowana(boolean czyZaakceptowana) {
        this.czyZaakceptowana = czyZaakceptowana;
    }

    public boolean isCzySieOdbyla() {
        return czySieOdbyla;
    }

    public void setCzySieOdbyla(boolean czySieOdbyla) {
        this.czySieOdbyla = czySieOdbyla;
    }

    public boolean isCzyOplacona() {
        return czyOplacona;
    }

    public void setCzyOplacona(boolean czyOplacona) {
        this.czyOplacona = czyOplacona;
    }

    public Opinia getOpinia() {
        return opinia;
    }

    public void setOpinia(Opinia opinia) {
        this.opinia = opinia;
    }

    public KuponRabatowy getKuponRabatowy() {
        return kuponRabatowy;
    }

    public void setKuponRabatowy(KuponRabatowy kuponRabatowy) {
        this.kuponRabatowy = kuponRabatowy;
    }

    public List<ZabiegWeterynaryjny> getZabiegi() {
        return zabiegi;
    }

    public void setZabiegi(List<ZabiegWeterynaryjny> zabiegi) {
        this.zabiegi = zabiegi;
    }

    public Weterynarz getWeterynarz() {
        return weterynarz;
    }

    public void setWeterynarz(Weterynarz weterynarz) {
        this.weterynarz = weterynarz;
    }

    public Zwierze getZwierze() {
        return zwierze;
    }

    public void setZwierze(Zwierze zwierze) {
        this.zwierze = zwierze;
    }
}

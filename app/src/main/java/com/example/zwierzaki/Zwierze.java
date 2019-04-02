package com.example.zwierzaki;

import java.util.Date;

public class Zwierze {

    Date DatUr;
    Date DatSm= null;
    String Plec;
    String NrMetryki;
    String NrMetrykiMatki;
    String NrMetrykiOjca;
    String ImieZwierzecia;
    String UID;

    public Zwierze() {
    }

    public Zwierze(Date datUr, String plec, String nrMetryki, String nrMetrykiMatki, String nrMetrykiOjca, String imieZwierzecia, String uID) {
        DatUr = datUr;
        Plec = plec;
        NrMetryki = nrMetryki;
        NrMetrykiMatki = nrMetrykiMatki;
        NrMetrykiOjca = nrMetrykiOjca;
        ImieZwierzecia = imieZwierzecia;
        UID = uID;
    }

    public Date getDatUr() {
        return DatUr;
    }

    public void setDatUr(Date datUr) {
        DatUr = datUr;
    }

    public String getPlec() {
        return Plec;
    }

    public void setPlec(String plec) {
        Plec = plec;
    }

    public String getNrMetryki() {
        return NrMetryki;
    }

    public void setNrMetryki(String nrMetryki) {
        NrMetryki = nrMetryki;
    }

    public String getNrMetrykiMatki() {
        return NrMetrykiMatki;
    }

    public void setNrMetrykiMatki(String nrMetrykiMatki) {
        NrMetrykiMatki = nrMetrykiMatki;
    }

    public String getNrMetrykiOjca() {
        return NrMetrykiOjca;
    }

    public void setNrMetrykiOjca(String nrMetrykiOjca) {
        NrMetrykiOjca = nrMetrykiOjca;
    }

    public String getImieZwierzecia() {
        return ImieZwierzecia;
    }

    public void setImieZwierzecia(String imieZwierzecia) {
        ImieZwierzecia = imieZwierzecia;
    }

    public Date getDatSm() {
        return DatSm;
    }

    public void setDatSm(Date datSm) {
        DatSm = datSm;
    }
}

package com.example.zwierzaki;

import java.util.Date;

public class Zaplodnienia {

    int id_zaplodnienia;
    Date data_zaplodnienia;
    String NrMetrykiSamca;
    String NrMetrykiSamicy;

    public Zaplodnienia(int id_zaplodnienia, Date data_zaplodnienia, String nrMetrykiSamca, String nrMetrykiSamicy) {
        this.id_zaplodnienia = id_zaplodnienia;
        this.data_zaplodnienia = data_zaplodnienia;
        NrMetrykiSamca = nrMetrykiSamca;
        NrMetrykiSamicy = nrMetrykiSamicy;
    }

    public int getId_zaplodnienia() {
        return id_zaplodnienia;
    }

    public void setId_zaplodnienia(int id_zaplodnienia) {
        this.id_zaplodnienia = id_zaplodnienia;
    }

    public Date getData_zaplodnienia() {
        return data_zaplodnienia;
    }

    public void setData_zaplodnienia(Date data_zaplodnienia) {
        this.data_zaplodnienia = data_zaplodnienia;
    }

    public String getNrMetrykiSamca() {
        return NrMetrykiSamca;
    }

    public void setNrMetrykiSamca(String nrMetrykiSamca) {
        NrMetrykiSamca = nrMetrykiSamca;
    }

    public String getNrMetrykiSamicy() {
        return NrMetrykiSamicy;
    }

    public void setNrMetrykiSamicy(String nrMetrykiSamicy) {
        NrMetrykiSamicy = nrMetrykiSamicy;
    }
}

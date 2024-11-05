package org.example.metier;

import java.util.Date;

public class Compte {
    int code;
    String propertie;
    float solde;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPropertie() {
        return propertie;
    }

    public void setPropertie(String propertie) {
        this.propertie = propertie;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    Date date;

    public Compte(int code, String propertie) {
        this.code = code;
        this.propertie = propertie;
        this.solde = 0;

    }
}


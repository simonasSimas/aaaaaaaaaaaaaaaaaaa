package com.company.exceptions;

public class VaziuoklesIsskleidimoKlaida extends Exception{
    private String priezastis;

    public VaziuoklesIsskleidimoKlaida(String priezastis) {
        super(priezastis);
    }

    public String getPriezastis() {
        return priezastis;
    }

    public void setPriezastis(String priezastis) {
        this.priezastis = priezastis;
    }
}
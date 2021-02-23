package com.company;

import java.util.Random;

public class Lektuvas {

    public void isskelistiVaziuokle() throws VaziuoklesIsskleidimoKlaida {
        try {
            vaziuokle();
            System.out.println("OK: vaziuokle sekmingai isskleista");
        } catch (LaikinaKlaida e) {
            System.out.println("ERROR: vaziuokles isskleisti nepavyko " + "Priezastis: " + e.getPriezastis() + " Svarbumas: laikina");
        } catch (SvarbiKlaida e) {
            System.out.println("ERROR: vaziuokles isskleisti nepavyko " + "Priezastis: " + e.getPriezastis() + " Svarbumas: svarbi");
        } catch (VaziuoklesIsskleidimoKlaida e) {
            System.out.println(("ERROR: vaziuokles isskleisti nepavyko " + "Priezastis: " + e.getPriezastis() + " Svarbumas: nezinoma"));
        }
    }

    public void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
        Random rand = new Random();
        int x = rand.nextInt(4);
        switch (x) {
            case 0:
                throw new LaikinaKlaida("Baigesi degalai");
            case 1:
                throw new LaikinaKlaida("Nenusileido ratas");
            case 2:
                throw new SvarbiKlaida("Mire pilotai");
        }
    }
}


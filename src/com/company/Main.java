package com.company;

public class Main {

    public static void main(String[] args) {
        Adresas adresas = new Adresas(new Miestas("Alytus"));
        System.out.println(gautiMiestoPavadinima(adresas));
    }
    static String gautiMiestoPavadinima(Adresas adresas){
        String miestoPavadinimas = "";
        try {
            miestoPavadinimas = adresas.getMiestas().getPavadinimas();
        }catch (Exception e){
            System.out.println("Null objektas");
        }
        return miestoPavadinimas;
    }
}

package com.company.polimorfizmas.papildoma;

import java.util.ArrayList;

public class Personel {
    ArrayList<PersonImpl> personel = new ArrayList<>();


    public void addPersonel(PersonImpl personImpl) {
        personel.add(personImpl);
    }

    public ArrayList<PersonImpl> getPersonel() {
        return personel;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "personel=" + personel.toString() +
                '}';
    }

    public PersonImpl getPerson(String name) {
        for (PersonImpl p : personel
        ) {
            if (name.equals(p.getName())) {
                return p;
            }
        }
        return null;
    }
}

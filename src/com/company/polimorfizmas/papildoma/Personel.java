package com.company.polimorfizmas.papildoma;

import java.util.ArrayList;
import java.util.List;

public class Personel extends Person{
    ArrayList<Person> personel = new ArrayList<>();

    public void  addPersonel(Person person){
        personel.add(person);
    }

    @Override
    public int howManyLikesDoesThisBranchOfQualificationHave(Person person, List<Person> list) {
        String qualification = person.getQualification();
        int sum = 0;
        for (Person p : list) {
            if (p.getQualification().equals(qualification)){
                sum +=p.getLikeCount();
            }
        }
        return sum;
    }

    @Override
    public int howManyLikesDoesThisEmployeeHave(Person person) {
        return person.getLikeCount();
    }

    @Override
    public int howManyLikesInTotal(List<Person> list) {
        int sum =0;
        for (Person p : list){
            sum +=p.getLikeCount();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "personel=" + personel.toString() +
                '}';
    }
}

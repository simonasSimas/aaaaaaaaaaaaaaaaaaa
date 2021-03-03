package com.company.polimorfizmas.papildoma;

import java.util.List;

public class Person implements Qualification,Likes{
    private String name;
    private String qualification;
    private int likeCount=0;


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String s) {
        this.name=s;
    }

    @Override
    public void setQualification(boolean b) {
        if(b){
            this.qualification="Developer";
        } else {
            this.qualification="Manager";
        }
    }

    @Override
    public String getQualification() {
        return qualification;
    }

    @Override
    public void likes(Person receiver) {
        receiver.setLikeCount();
    }

    @Override
    public int howManyLikesDoesThisEmployeeHave(Person personel) {
        return personel.getLikeCount();
    }

    @Override
    public int howManyLikesDoesThisBranchOfQualificationHave(Person person, List<Person> list) {
        String qualification = person.getQualification();
        int sum = 0;
        for (Person personList : list){
            if (qualification.equals(personList.getQualification())){
                sum +=personList.getLikeCount();
            }
        }
        return sum;
    }

    @Override
    public int howManyLikesInTotal(List<Person> list) {
        int sum = 0;
        for (Person personList : list){
            sum += personList.getLikeCount();
        }
        return sum;
    }

    @Override
    public void setLikeCount() {
        this.likeCount++;
    }

    @Override
    public int getLikeCount() {
        return likeCount;
    }
}

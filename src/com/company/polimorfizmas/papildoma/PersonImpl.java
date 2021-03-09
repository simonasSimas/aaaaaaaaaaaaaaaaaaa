package com.company.polimorfizmas.papildoma;

import java.util.List;

public class PersonImpl implements Qualification,Likes{
    private String name;
    private String qualification;
    private int likeCount=0;

    public PersonImpl(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }

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
    public void likes(PersonImpl receiver) {
        receiver.setLikeCount();
    }



    @Override
    public int howManyLikesDoesThisBranchOfQualificationHave(PersonImpl personImpl, List<PersonImpl> list) {
        String qualification = personImpl.getQualification();
        int sum = 0;
        for (PersonImpl personImplList : list){
            if (qualification.equals(personImplList.getQualification())){
                sum += personImplList.getLikeCount();
            }
        }
        return sum;
    }

    public static int howManyLikesInTotal(List<PersonImpl> list) {
        int sum = 0;
        for (PersonImpl personImplList : list){
            sum += personImplList.getLikeCount();
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

    @Override
    public String toString() {
        return "PersonImpl{" +
                "name='" + name + '\'' +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}

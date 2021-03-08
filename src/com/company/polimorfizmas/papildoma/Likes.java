package com.company.polimorfizmas.papildoma;

import java.util.List;

public interface Likes {
    void likes(Person receiver);
    int howManyLikesDoesThisEmployeeHave(Person person);
    int howManyLikesDoesThisBranchOfQualificationHave(Person person, List<Person> list);
    int howManyLikesInTotal(List<Person> list);
    void setLikeCount();
    int getLikeCount();

}
